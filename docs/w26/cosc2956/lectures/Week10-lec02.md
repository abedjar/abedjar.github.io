---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Lecture 4: Fetching Data from External APIs

---


## Phase 1 — How APIs Work

??? note "🗣️ Talking Points"
    - Ask: *"When you open Instagram, where do the posts come from?"* — a server. Your browser sends a request, the server sends back data (JSON), and the app renders it.
    - Key distinction: the API doesn't send HTML. It sends raw data — JSON. The client (browser, app, terminal) decides how to display it.
    - Start with `curl` — it strips away every abstraction. You type a URL, you get JSON. That's the whole thing.
    - Progress from curl → browser → JS console → Vue. The request is identical each time. Only the tool changes.

### The request-response cycle

```
Any client (curl / browser / Vue / Python)
     │
     │  GET https://api.example.com/data
     ▼
HTTP Request ──────────────────────► API Server
                                          │
                                          │  looks up data, builds response
                                          ▼
HTTP Response ◄─────────────────── JSON data
     │
     │  client parses and uses the JSON
     ▼
  displayed / logged / rendered
```

### What is JSON?

The format APIs use to send data back. It maps directly to JavaScript objects and arrays:

```json
{
  "name": "Australia",
  "population": 26000000,
  "capital": ["Canberra"],
  "languages": { "eng": "English" }
}
```

---

### Way 1 — `curl` (terminal)

??? note "🗣️ Talking Points"
    - `curl` is installed on every Mac and Linux machine. On Windows it's in Git Bash or PowerShell.
    - This is the most direct way to talk to an API — no browser, no code, just a command.
    - Run these live in the terminal. Students should run them too.
    - `| python3 -m json.tool` is a quick pretty-printer built into Python — no install needed.

`curl` sends HTTP requests from the terminal. It's the fastest way to test an API before writing any code.

```bash
# Basic GET request — returns raw JSON
curl https://restcountries.com/v3.1/name/australia

# Pretty-print the JSON (macOS / Linux)
curl https://restcountries.com/v3.1/name/australia | python3 -m json.tool

# See the response headers too
curl -i https://restcountries.com/v3.1/name/australia

# Pass query parameters
curl "https://api.open-meteo.com/v1/forecast?latitude=-33.87&longitude=151.21&current=temperature_2m"

# POST request with a JSON body (for APIs that accept data)
curl -X POST https://jsonplaceholder.typicode.com/posts \
  -H "Content-Type: application/json" \
  -d '{"title": "Hello", "body": "World", "userId": 1}'
```

!!! example "🎯 Demo — run these live"
    Run the first two commands. Show the raw output, then the pretty-printed version. Point out the JSON structure — the nested objects, the arrays. Students should be able to find `name.common` and `capital[0]` by eye before we write any code.

---

### Way 2 — Browser address bar

The simplest way to see a GET response — just paste the URL.

!!! example "🎯 Demo — open these in the browser"
    ```
    https://restcountries.com/v3.1/name/australia?fields=name,capital,population
    https://pokeapi.co/api/v2/pokemon/pikachu
    https://api.open-meteo.com/v1/forecast?latitude=-33.87&longitude=151.21&current=temperature_2m
    ```
    Install the **JSON Formatter** browser extension if you haven't — it makes the raw JSON readable with collapsible nodes. Show the nested structure by expanding and collapsing objects.

---

### Way 3 — Browser DevTools Console

??? note "🗣️ Talking Points"
    - This is the bridge between the terminal and Vue. Students can test a fetch call before putting it in a component.
    - Open any tab (even this one), open the console, and run the snippet live.
    - The `.then()` syntax is the Promise-based equivalent of `async/await` — just easier to paste into a console.

Open DevTools → Console tab on any page and run:

```js
// Paste this directly into the browser console
fetch('https://pokeapi.co/api/v2/pokemon/pikachu')
  .then(res => res.json())
  .then(data => console.log(data))
```

You'll see the full Pokémon object logged. Expand it to explore the structure before writing any Vue code.

---

### Way 4 — Plain JavaScript (no Vue, no framework)

??? note "🗣️ Talking Points"
    - Before jumping into Vue, show a completely plain HTML file that fetches an API and renders the result. No build tools, no components, no reactivity.
    - The point: `fetch` is a browser API. Vue doesn't own it. You could do this in any framework — or no framework at all.
    - Create this as `test.html` and open it directly in the browser. Students can see it working before any Vue scaffolding exists.

A single HTML file — no Vue, no build tools, no npm:

```html title="test.html"
<!DOCTYPE html>
<html>
<head>
  <title>API Test</title>
</head>
<body>
  <h1>Current Weather in Sydney</h1>
  <div id="output">Loading...</div>

  <script>
    const url = 'https://api.open-meteo.com/v1/forecast' +
      '?latitude=-33.87&longitude=151.21&current=temperature_2m,wind_speed_10m'

    async function loadWeather() {
      const res  = await fetch(url)
      const data = await res.json()

      document.getElementById('output').innerHTML = `
        <p>🌡 Temperature: ${data.current.temperature_2m}°C</p>
        <p>💨 Wind: ${data.current.wind_speed_10m} km/h</p>
      `
    }

    loadWeather()
  </script>
</body>
</html>
```

Open this file directly in Chrome — no server needed. It works.

!!! note "This is the baseline"
    This is exactly what Vue does — but manually. Every time you change the data you'd have to rewrite the `innerHTML`. Vue's reactivity system automates that step. The fetch itself is identical.

---

### Way 5 — Vue (what we'll use for the rest of this lecture)

Now the same fetch, inside a Vue component with reactive state:

```vue title="App.vue — simplest possible Vue fetch"
<template>
  <div>
    <p v-if="loading">Loading...</p>
    <p v-else-if="error">⚠ {{ error }}</p>
    <div v-else>
      <p>🌡 {{ data.current.temperature_2m }}°C</p>
      <p>💨 {{ data.current.wind_speed_10m }} km/h</p>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'

const data    = ref(null)  // (1)
const loading = ref(true)
const error   = ref(null)

onMounted(async () => {    // (2)
  try {
    const url = 'https://api.open-meteo.com/v1/forecast' +
      '?latitude=-33.87&longitude=151.21&current=temperature_2m,wind_speed_10m'

    const res = await fetch(url)
    if (!res.ok) throw new Error(`HTTP ${res.status}`) // (3)
    data.value = await res.json()                      // (4)
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false                              // (5)
  }
})
</script>
```

1. Three refs — one for each state the fetch can be in: loading, errored, or done.
2. `onMounted` — fetch starts when the component is in the DOM. The callback is `async` so we can use `await` inside it.
3. `fetch` only throws on network failure. A `404` or `500` response still "succeeds" — check `res.ok` manually.
4. `res.json()` parses the response body. This is a second async step — the data arrives after the headers.
5. `finally` always runs — loading turns off whether the fetch succeeded or failed.

### The three states every fetch has

| State | `loading` | `error` | `data` |
|---|---|---|---|
| Request in flight | `true` | `null` | `null` |
| Success | `false` | `null` | `{ ... }` |
| Failure | `false` | `"message"` | `null` |

Always handle all three in the template. Users should never stare at a blank page.

---

➡️ *Enough theory — let's fetch something real.*

---

## Phase 2 — Weather: Open-Meteo

??? note "🗣️ Talking Points"
    - Open-Meteo is perfect for a first demo: no API key, the URL is readable, the response is flat JSON.
    - Read the URL out loud and ask students to guess what each parameter does. `latitude`, `longitude`, `current=temperature_2m` — it's self-documenting.
    - After the fetch works, open the browser DevTools → Network tab. Click the request. Show students the raw JSON response. Point out that `data.value` in Vue is exactly that object.
    - The loading/error template pattern is what they'll use in every project that touches an API. Make sure students understand *why* each `v-if` branch is there.

**API:** `https://api.open-meteo.com/v1/forecast`
**Docs:** [open-meteo.com](https://open-meteo.com)
No API key. No account. Free forever.

### What the response looks like

```json
{
  "latitude": -33.87,
  "longitude": 151.21,
  "current": {
    "temperature_2m": 22.4,
    "wind_speed_10m": 14.2,
    "weather_code": 3
  }
}
```

### Demo — `WeatherCard.vue`

Create `src/components/WeatherCard.vue`:

```vue title="WeatherCard.vue"
<template>
  <div class="weather-card">

    <p v-if="loading" class="state">Loading weather...</p>       <!-- (1) -->
    <p v-else-if="error" class="state error">⚠ {{ error }}</p>   <!-- (2) -->

    <div v-else>                                                  <!-- (3) -->
      <h2 class="city">{{ city }}</h2>
      <p class="temp">{{ weather.current.temperature_2m }}°C</p>
      <p class="detail">💨 Wind: {{ weather.current.wind_speed_10m }} km/h</p>
      <p class="detail">📍 {{ weather.latitude }}°, {{ weather.longitude }}°</p>
    </div>

  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'

const props = defineProps({
  city:      { type: String, required: true },
  latitude:  { type: Number, required: true },
  longitude: { type: Number, required: true },
})

const weather = ref(null)
const loading = ref(true)
const error   = ref(null)

onMounted(async () => {
  try {
    const url = `https://api.open-meteo.com/v1/forecast` +
      `?latitude=${props.latitude}` +
      `&longitude=${props.longitude}` +
      `&current=temperature_2m,wind_speed_10m`       // (4)

    const res = await fetch(url)
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    weather.value = await res.json()
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false
  }
})
</script>

<style scoped>
.weather-card {
  background: white;
  border-radius: 12px;
  padding: 1.5rem;
  box-shadow: 0 2px 8px rgba(0,0,0,0.08);
  min-width: 200px;
  font-family: system-ui, sans-serif;
}
.city  { font-size: 1.2rem; font-weight: 700; color: #111827; margin: 0 0 0.5rem; }
.temp  { font-size: 2.5rem; font-weight: 700; color: #6366f1; margin: 0 0 0.5rem; }
.detail { font-size: 0.85rem; color: #6b7280; margin: 0.2rem 0; }
.state  { color: #9ca3af; font-size: 0.9rem; }
.error  { color: #dc2626; }
</style>
```

1. `v-if="loading"` — show a placeholder while the request is in flight. The user always sees *something*.
2. `v-else-if="error"` — if the fetch failed, show the error message. Never silently swallow errors.
3. `v-else` — only runs when `loading` is false and `error` is null, meaning data arrived successfully.
4. The `current=` parameter tells the API which fields to include. Comma-separated, no spaces.

### Use it in `App.vue`

```vue title="App.vue"
<script setup>
import WeatherCard from './components/WeatherCard.vue'
</script>

<template>
  <div class="page">
    <h1>🌤 Weather</h1>
    <div class="grid">
      <WeatherCard city="Sydney"    :latitude="-33.87" :longitude="151.21" />
      <WeatherCard city="Melbourne" :latitude="-37.81" :longitude="144.96" />
      <WeatherCard city="Tokyo"     :latitude="35.68"  :longitude="139.69" />
    </div>
  </div>
</template>

<style>
body { background: #f3f4f6; margin: 0; }
.page { max-width: 800px; margin: 2rem auto; padding: 0 1rem; font-family: system-ui, sans-serif; }
h1 { color: #111827; margin-bottom: 1.5rem; }
.grid { display: flex; gap: 1rem; flex-wrap: wrap; }
</style>
```

!!! example "🎯 Try it live"
    - The three cards fetch independently and in parallel — each one shows "Loading..." then fills in when its request completes
    - Open DevTools → Network tab → watch three separate requests fire
    - Temporarily change a latitude to an invalid value (`latitude=999`) — the error state renders
    - Add a fourth city of your choice — one new line, no other changes needed

---

➡️ *One city. Now let's fetch a whole list.*

---

## Phase 3 — Countries: REST Countries

??? note "🗣️ Talking Points"
    - This demo introduces two new challenges: the response is an **array** (not a single object), and the data is deeply nested.
    - Before writing any Vue, open `https://restcountries.com/v3.1/region/oceania` in the browser and look at the raw JSON. Ask students: *"How would you get the population? The flag emoji? The capital city?"* Let them call it out.
    - The search filter is revision from Lec 1 (`computed` + `v-model`) — but now the data source is an API instead of a hardcoded array. Stress that the Vue code is identical. Only the data source changed.
    - `?fields=` is worth explaining — you're asking the API to send only the fields you need. Smaller payload, faster response.

**API:** `https://restcountries.com/v3.1`
**Docs:** [restcountries.com](https://restcountries.com)
No API key. Returns country data as a JSON array.

### What one country looks like

```json
{
  "name": { "common": "Australia" },
  "flags": { "emoji": "🇦🇺" },
  "population": 25978935,
  "capital": ["Canberra"],
  "region": "Oceania"
}
```

Note: `capital` is an **array** — some countries have multiple capitals. Always access it as `country.capital[0]`.

### Demo — `CountryList.vue`

Create `src/components/CountryList.vue`:

```vue title="CountryList.vue"
<template>
  <div>
    <input
      v-model="search"
      placeholder="Search countries..."
      class="search"
    />

    <p class="count">{{ filtered.length }} countries</p>

    <p v-if="loading" class="state">Loading...</p>
    <p v-else-if="error" class="state error">⚠ {{ error }}</p>

    <div v-else class="grid">
      <div v-for="country in filtered" :key="country.cca3" class="card"> <!-- (1) -->
        <span class="flag">{{ country.flags.emoji }}</span>
        <div>
          <p class="cname">{{ country.name.common }}</p>               <!-- (2) -->
          <p class="detail">🏙 {{ country.capital?.[0] ?? 'N/A' }}</p> <!-- (3) -->
          <p class="detail">👥 {{ formatPop(country.population) }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, computed, onMounted } from 'vue'

const props = defineProps({
  region: { type: String, default: 'oceania' }
})

const countries = ref([])
const loading   = ref(true)
const error     = ref(null)
const search    = ref('')

onMounted(async () => {
  try {
    const res = await fetch(
      `https://restcountries.com/v3.1/region/${props.region}` +
      `?fields=name,flags,population,capital,cca3` // (4)
    )
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    countries.value = await res.json()
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false
  }
})

const filtered = computed(() => {                              // (5)
  const q = search.value.toLowerCase()
  if (!q) return countries.value
  return countries.value.filter(c =>
    c.name.common.toLowerCase().includes(q)
  )
})

function formatPop(n) {                                        // (6)
  if (n >= 1_000_000) return (n / 1_000_000).toFixed(1) + 'M'
  if (n >= 1_000)     return (n / 1_000).toFixed(0) + 'K'
  return n.toString()
}
</script>

<style scoped>
.search {
  width: 100%; padding: 0.6rem 0.9rem; font-size: 0.95rem;
  border: 1px solid #d1d5db; border-radius: 8px; outline: none;
  box-sizing: border-box; margin-bottom: 0.75rem;
}
.search:focus { border-color: #6366f1; }
.count  { font-size: 0.82rem; color: #9ca3af; margin: 0 0 1rem; }
.state  { color: #9ca3af; }
.error  { color: #dc2626; }
.grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
  gap: 0.75rem;
}
.card {
  background: white; border-radius: 10px; padding: 1rem;
  box-shadow: 0 1px 4px rgba(0,0,0,0.07); display: flex; gap: 0.75rem; align-items: center;
}
.flag   { font-size: 2rem; line-height: 1; }
.cname  { font-weight: 600; color: #111827; margin: 0 0 0.2rem; font-size: 0.9rem; }
.detail { font-size: 0.78rem; color: #6b7280; margin: 0.1rem 0; }
</style>
```

1. `cca3` is the 3-letter country code — a stable unique key (`"AUS"`, `"NZL"`). Better than using the name or array index.
2. `country.name.common` — the name is nested inside a `name` object. You have to dig in.
3. `country.capital?.[0]` — optional chaining (`?.`) safely handles countries with no capital array. `?? 'N/A'` provides a fallback.
4. `?fields=` tells the API to only send the five fields we need. Without it, each country object has ~40 fields — most of which we don't use.
5. The `filtered` computed is identical in structure to Lec 1's search filter. The Vue code doesn't care that `countries` came from an API — it's just a reactive array.
6. A plain helper function to format large population numbers readably. Not reactive, just a utility.

### Use it in `App.vue`

```vue title="App.vue"
<script setup>
import CountryList from './components/CountryList.vue'
</script>

<template>
  <div class="page">
    <h1>🌍 Countries by Region</h1>
    <CountryList region="oceania" />
  </div>
</template>

<style>
body { background: #f3f4f6; margin: 0; }
.page { max-width: 900px; margin: 2rem auto; padding: 0 1.5rem; font-family: system-ui, sans-serif; }
h1 { color: #111827; margin-bottom: 1.5rem; }
</style>
```

!!! example "🎯 Try it live"
    - Change `region="oceania"` to `region="europe"` — 50 countries load
    - Type "aus" in the search box — filters to Australia (and Austria if on Europe)
    - Open Network tab — notice the API URL includes `?fields=` — inspect the response to confirm only 5 fields come back, not 40
    - Change to an invalid region (`region="xyz"`) — the error state renders

---

➡️ *A flat list is straightforward. Now let's handle a two-step fetch — list first, then detail.*

---

## Phase 4 — Pokémon: PokeAPI

??? note "🗣️ Talking Points"
    - This is the most advanced demo — two fetches, dependent on each other. The pattern is extremely common in real apps: fetch a list of items, then fetch the full details for whichever item the user clicks.
    - Walk through the two API responses side by side before writing any code. The list endpoint returns names and URLs. The detail endpoint (a different URL per Pokémon) returns the full data.
    - `watch` is the key new concept here. When `selectedUrl` changes (user clicks a card), the watcher fires and fetches the detail. This is the reactive trigger.
    - After it works, ask: *"Could we have done this with `onMounted`?"* — No, because `onMounted` only runs once. The watcher runs every time `selectedUrl` changes.

**API:** `https://pokeapi.co/api/v2`
**Docs:** [pokeapi.co](https://pokeapi.co)
No API key. Generous rate limits. The most comprehensive free API around.

### The two-step pattern

```
Step 1 — fetch the list
GET /pokemon?limit=20
→ [ { name: "bulbasaur", url: "https://pokeapi.co/api/v2/pokemon/1/" }, ... ]

User clicks "bulbasaur"
                │
                ▼
Step 2 — fetch the detail using the URL from step 1
GET https://pokeapi.co/api/v2/pokemon/1/
→ { name: "bulbasaur", height: 7, weight: 69, sprites: { ... }, types: [ ... ] }
```

### What the responses look like

```json
// List response — /pokemon?limit=20
{
  "results": [
    { "name": "bulbasaur", "url": "https://pokeapi.co/api/v2/pokemon/1/" },
    { "name": "ivysaur",   "url": "https://pokeapi.co/api/v2/pokemon/2/" }
  ]
}
```

```json
// Detail response — /pokemon/1/
{
  "name": "bulbasaur",
  "height": 7,
  "weight": 69,
  "sprites": { "front_default": "https://...bulbasaur.png" },
  "types": [ { "type": { "name": "grass" } }, { "type": { "name": "poison" } } ]
}
```

### Demo — `PokedexApp.vue`

Create `src/components/PokedexApp.vue`:

```vue title="PokedexApp.vue"
<template>
  <div class="pokedex">

    <!-- Left panel — list -->
    <div class="list-panel">
      <h2 class="panel-title">Pokédex</h2>

      <p v-if="listLoading" class="state">Loading...</p>
      <p v-else-if="listError" class="state error">⚠ {{ listError }}</p>

      <ul v-else class="poke-list">
        <li
          v-for="p in pokemonList"
          :key="p.name"
          @click="selectPokemon(p.url)"
          :class="['poke-item', selectedUrl === p.url ? 'poke-item--active' : '']" <!-- (1) -->
        >
          {{ p.name }}
        </li>
      </ul>
    </div>

    <!-- Right panel — detail -->
    <div class="detail-panel">
      <div v-if="!selectedUrl" class="state">← Select a Pokémon</div>

      <div v-else-if="detailLoading" class="state">Loading...</div>
      <p v-else-if="detailError" class="state error">⚠ {{ detailError }}</p>

      <div v-else-if="pokemon" class="poke-detail">
        <img :src="pokemon.sprites.front_default" :alt="pokemon.name" class="sprite" />
        <h2 class="poke-name">{{ pokemon.name }}</h2>

        <div class="types">
          <span
            v-for="t in pokemon.types"                     <!-- (2) -->
            :key="t.type.name"
            class="type-badge"
          >
            {{ t.type.name }}
          </span>
        </div>

        <div class="stats">
          <span>📏 {{ pokemon.height / 10 }}m</span>
          <span>⚖ {{ pokemon.weight / 10 }}kg</span>
        </div>
      </div>
    </div>

  </div>
</template>

<script setup>
import { ref, watch, onMounted } from 'vue'

// ── List state ───────────────────────────────────────────
const pokemonList = ref([])
const listLoading = ref(true)
const listError   = ref(null)

// ── Detail state ─────────────────────────────────────────
const pokemon       = ref(null)
const selectedUrl   = ref(null)
const detailLoading = ref(false)
const detailError   = ref(null)

// ── Step 1: fetch the list on mount ──────────────────────
onMounted(async () => {
  try {
    const res = await fetch('https://pokeapi.co/api/v2/pokemon?limit=20')
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    const data = await res.json()
    pokemonList.value = data.results                       // (3)
  } catch (e) {
    listError.value = e.message
  } finally {
    listLoading.value = false
  }
})

// ── Step 2: fetch detail whenever selectedUrl changes ────
watch(selectedUrl, async (url) => {                        // (4)
  if (!url) return
  pokemon.value       = null
  detailLoading.value = true
  detailError.value   = null

  try {
    const res = await fetch(url)                           // (5)
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    pokemon.value = await res.json()
  } catch (e) {
    detailError.value = e.message
  } finally {
    detailLoading.value = false
  }
})

function selectPokemon(url) {
  selectedUrl.value = url
}
</script>

<style scoped>
.pokedex {
  display: grid; grid-template-columns: 220px 1fr; gap: 1rem;
  background: white; border-radius: 12px; overflow: hidden;
  box-shadow: 0 2px 8px rgba(0,0,0,0.08); font-family: system-ui, sans-serif;
}
.panel-title { font-size: 1rem; font-weight: 700; color: #111827; padding: 1rem 1rem 0.5rem; margin: 0; }
.list-panel  { border-right: 1px solid #f3f4f6; }
.poke-list   { list-style: none; padding: 0; margin: 0; }
.poke-item {
  padding: 0.55rem 1rem; font-size: 0.88rem; color: #374151;
  cursor: pointer; text-transform: capitalize;
  transition: background 0.1s;
}
.poke-item:hover       { background: #f9fafb; }
.poke-item--active     { background: #ede9fe; color: #6366f1; font-weight: 600; }
.detail-panel          { padding: 2rem; display: flex; align-items: center; justify-content: center; }
.poke-detail           { text-align: center; }
.sprite                { width: 140px; height: 140px; image-rendering: pixelated; }
.poke-name             { font-size: 1.4rem; font-weight: 700; color: #111827; text-transform: capitalize; margin: 0 0 0.75rem; }
.types                 { display: flex; gap: 0.5rem; justify-content: center; margin-bottom: 1rem; }
.type-badge {
  padding: 0.2rem 0.75rem; border-radius: 999px; font-size: 0.78rem;
  font-weight: 600; text-transform: capitalize;
  background: #ede9fe; color: #6366f1;
}
.stats  { display: flex; gap: 1.5rem; justify-content: center; color: #6b7280; font-size: 0.85rem; }
.state  { color: #9ca3af; font-size: 0.9rem; }
.error  { color: #dc2626; }
</style>
```

1. The active class is applied with `:class` array syntax — add `poke-item--active` only when this item's URL matches `selectedUrl`. Highlights the selected Pokémon in the list.
2. `pokemon.types` is an array of objects. Each object has a nested `type.name`. Always check the raw API response first — nested structures like this are very common.
3. The list response wraps the array in a `results` key — `data.results`, not `data` directly. A common mistake is trying to iterate `data` and getting nothing.
4. `watch(selectedUrl, async (url) => {...})` — this is the key pattern. Every time `selectedUrl` changes, the watcher fires the detail fetch automatically. No click handler needs to call it directly.
5. The detail URL comes straight from the list item — `p.url`. PokeAPI embeds the full detail URL in the list response, so we don't have to construct it.

### Use it in `App.vue`

```vue title="App.vue"
<script setup>
import PokedexApp from './components/PokedexApp.vue'
</script>

<template>
  <div class="page">
    <h1>⚡ Pokédex</h1>
    <PokedexApp />
  </div>
</template>

<style>
body { background: #f3f4f6; margin: 0; }
.page { max-width: 800px; margin: 2rem auto; padding: 0 1.5rem; font-family: system-ui, sans-serif; }
h1 { color: #111827; margin-bottom: 1.5rem; }
</style>
```

!!! example "🎯 Try it live"
    - The list loads on mount — 20 Pokémon names appear
    - Click one — a second request fires immediately, the sprite and stats appear
    - Click a different one — the detail clears and reloads
    - Open Network tab — you can watch the second request fire on every click, using the URL from the list item
    - Change `?limit=20` to `?limit=151` to get all original Pokémon

---

➡️ *The fetch pattern is clear. Now let's extract it so we don't repeat it in every component.*

---

## Phase 5 — Reusable `useFetch` Composable

??? note "🗣️ Talking Points"
    - Ask students to look back at the three demos. Every one has `loading`, `error`, `data`, `try/catch/finally`. That's identical boilerplate.
    - A composable is just a function that encapsulates reactive logic and returns refs. It's not magic — it's the same code, moved into a function.
    - After showing `useFetch`, rewrite `WeatherCard` to use it. Students should see that the component gets significantly shorter, and the behaviour is identical.
    - This is the first time they're writing something genuinely reusable — not a component (UI), but a piece of logic.

### The problem: duplicated boilerplate

Every component we've written has this:

```js
const data    = ref(null)
const loading = ref(true)
const error   = ref(null)

onMounted(async () => {
  try {
    const res = await fetch(url)
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    data.value = await res.json()
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false
  }
})
```

Copied three times. If you want to change the error handling, you change it in three places.

### The solution: a composable

Create `src/composables/useFetch.js`:

```js title="src/composables/useFetch.js"
import { ref } from 'vue'

export function useFetch(url) {           // (1)
  const data    = ref(null)
  const loading = ref(true)
  const error   = ref(null)

  fetch(url)                             // (2)
    .then(res => {
      if (!res.ok) throw new Error(`HTTP ${res.status}`)
      return res.json()
    })
    .then(json => { data.value = json })
    .catch(e  => { error.value = e.message })
    .finally(() => { loading.value = false })

  return { data, loading, error }        // (3)
}
```

1. `useFetch` is a plain function — no `<script setup>`, no component. The `use` prefix is the Vue convention for composables.
2. The fetch starts immediately when `useFetch(url)` is called. No `onMounted` needed here — the composable is called from inside `<script setup>`, which runs at component setup time.
3. Returns the three refs so the component can use them directly.

### Rewrite `WeatherCard` using `useFetch`

```vue title="WeatherCard.vue — simplified"
<template>
  <div class="weather-card">
    <p v-if="loading" class="state">Loading...</p>
    <p v-else-if="error" class="state error">⚠ {{ error }}</p>
    <div v-else>
      <h2 class="city">{{ city }}</h2>
      <p class="temp">{{ data.current.temperature_2m }}°C</p>
      <p class="detail">💨 {{ data.current.wind_speed_10m }} km/h</p>
    </div>
  </div>
</template>

<script setup>
import { useFetch } from '../composables/useFetch.js'  // (1)

const props = defineProps({
  city:      { type: String, required: true },
  latitude:  { type: Number, required: true },
  longitude: { type: Number, required: true },
})

const url = `https://api.open-meteo.com/v1/forecast` +
  `?latitude=${props.latitude}&longitude=${props.longitude}` +
  `&current=temperature_2m,wind_speed_10m`

const { data, loading, error } = useFetch(url)         // (2)
</script>
```

1. Import from the composables folder using a relative path.
2. One line replaces the entire `ref` + `onMounted` + `try/catch/finally` block. `data`, `loading`, and `error` are reactive refs exactly as before — the template doesn't change at all.

### Recover the original `App.vue`
Use the same code for `App.vue` as before, and make sure to use `WeatherCard` component.

!!! note "The composable folder structure"
    ```
    src/
    ├── components/
    │   ├── WeatherCard.vue
    │   ├── CountryList.vue
    │   └── PokedexApp.vue
    ├── composables/
    │   └── useFetch.js      ← shared logic lives here
    └── App.vue
    ```
    Composables go in `src/composables/` by convention. The `use` prefix is a community standard — it signals that this function contains reactive Vue logic.

---

➡️ *Before we finish — the mistakes that will trip you up.*

---

## Phase 6 — Pitfalls & Wrap-up

??? note "🗣️ Talking Points"
    - The `res.ok` one is the most surprising — students assume a failed request throws an error. Demo it: fetch a URL with a bad endpoint and log `res.status` before the throw.
    - The template rendering before data arrives is the most common cause of "cannot read property of null" errors. The `v-if="data"` guard fixes it every time.
    - Keep this fast — 5 minutes max.

### ❌ Not checking `res.ok`

```js
// fetch only rejects on network failure (no internet, DNS error)
// A 404 or 500 still "succeeds" from fetch's perspective
const res = await fetch('https://api.example.com/missing')
console.log(res.ok)     // false
console.log(res.status) // 404
// res.json() would still run — you'd get an HTML error page parsed as broken JSON

// ✅ Always check
if (!res.ok) throw new Error(`HTTP ${res.status}`)
```

### ❌ Accessing data before it arrives

```vue
<!-- ❌ data is null on first render — this throws "Cannot read properties of null" -->
<p>{{ data.current.temperature_2m }}</p>

<!-- ✅ Guard with v-if — only renders when data exists -->
<div v-if="data">
  <p>{{ data.current.temperature_2m }}</p>
</div>
```

### ❌ Forgetting that route params are strings — same issue with API IDs

```js
// API returns: { "id": 1 }     ← number
// URL param:   route.params.id  ← string "1"

fetch(`/api/pokemon/${route.params.id}`)       // "1" works in a URL — fine here
pokemon.value.id === route.params.id           // ❌  1 === "1" is false

// ✅ Convert when comparing
Number(route.params.id) === pokemon.value.id   // ✅
```

### ❌ Iterating the wrong level of the response

```js
// Response: { "results": [ {...}, {...} ] }
data.value = await res.json()          // data.value is the whole object
v-for="item in data"                   // ❌ iterating the object, not the array

// ✅
data.value = await res.json()
v-for="item in data.results"           // ✅ — or store data.results directly:
countries.value = (await res.json()).results
```

### ❌ Fetching in `<script setup>` top level without `onMounted`

```js
// ❌ This runs at import time — before the component is in the DOM
// Works for simple cases but can cause SSR issues and is harder to test
const res = await fetch(url)  // top-level await in setup

// ✅ Put fetches inside onMounted — explicit, predictable
onMounted(async () => {
  const res = await fetch(url)
})
```

---

## Summary

**Three API patterns covered today:**

| Pattern | Demo | Key technique |
|---|---|---|
| Single object | Weather | `onMounted` + loading/error states |
| List from API | Countries | `v-for` over API array + `computed` filter |
| List + Detail | Pokémon | Two fetches + `watch` to trigger the second |

**The fetch template — use this every time:**

```js
const data    = ref(null)
const loading = ref(true)
const error   = ref(null)

onMounted(async () => {
  try {
    const res = await fetch(url)
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    data.value = await res.json()
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false
  }
})
```

**And in the template — always handle all three states:**

```vue
<p v-if="loading">Loading...</p>
<p v-else-if="error">{{ error }}</p>
<div v-else> <!-- real content --> </div>
```

### Public APIs worth exploring

| API | URL | Good for |
|---|---|---|
| Open-Meteo | `api.open-meteo.com` | Weather, location data |
| REST Countries | `restcountries.com/v3.1` | Geography, flags, populations |
| PokeAPI | `pokeapi.co/api/v2` | Lists + detail pattern, pagination |
| Open Library | `openlibrary.org/api` | Book search |
| NASA APOD | `api.nasa.gov` | Astronomy image of the day |
| CoinGecko | `api.coingecko.com/api/v3` | Crypto prices (no key, rate limited) |



