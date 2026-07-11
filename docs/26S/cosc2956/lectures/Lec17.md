---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Routing & Views — Vue Router

---

!!! info "The project"

    A brand new app for this lecture: **Vinyl Vault** — a personal record collection tracker. We're adding multiple pages — a Home page, an Albums list page, and an Album Detail page. The URL changes as you navigate. No full page reloads.

---

## 1 — What is Routing?



### Traditional navigation vs client-side routing

| | Multi-Page App (Traditional) | Single-Page App (Vue Router) |
|---|---|---|
| On link click | Full HTTP request to server | URL updates, component swaps |
| Page reload | ✅ Yes — everything resets | ❌ No — state is preserved |
| Server serves | A new HTML document each time | One `index.html`, always |
| Speed | Network-dependent | Instant after initial load |

### How Vue Router works

```
User clicks <RouterLink to="/albums">

Vue Router intercepts the click
      │
      ├── Updates the browser URL bar  →  /albums
      ├── Does NOT request a new page from the server
      └── Looks up the route table:
            /          →  HomeView.vue
            /albums    →  AlbumsView.vue   ← matches
            /albums/:id → AlbumDetailView.vue

Vue swaps the component rendered inside <RouterView />
Page updates instantly — no reload
```

### Key terms

| Term | Meaning |
|---|---|
| **Route** | A mapping between a URL path and a component |
| **`<RouterView>`** | A placeholder in your layout — Vue renders the matched component here |
| **`<RouterLink>`** | Like `<a>` but intercepts the click — no page reload |
| **Route param** | A variable segment in the URL, e.g. `:id` in `/albums/:id` |
| **Navigation guard** | A function that runs before a route change — can allow, redirect, or block |

---

➡️ *Concepts clear. Let's install Vue Router and get the simplest possible two-page app working — no components yet, just two views and a link between them.*

---

## 2 — Install & Configure Vue Router (the simplest version)



### Install Vue Router

In the `vinyl-vault` project directory:

```bash
npm install vue-router
```

### Create the router file

Create a new file `src/router/index.js`. To start, we'll only register **two** routes — `Home` and `Albums` — and both views will just be placeholders. The goal here is to see routing work end-to-end before we build anything real.

```js title="src/router/index.js"
import { createRouter, createWebHistory } from 'vue-router' // (1)
import HomeView from '../views/HomeView.vue'
import AlbumsView from '../views/AlbumsView.vue'

const routes = [ // (2)
  {
    path: '/',           // (3)
    component: HomeView,
  },
  {
    path: '/albums',
    component: AlbumsView,
  },
]

const router = createRouter({
  history: createWebHistory(), // (4)
  routes,
})

export default router
```

1. `createRouter` builds the router instance. `createWebHistory` gives clean URLs like `/albums` instead of `/#/albums`.
2. The `routes` array is the entire routing table. Every page in your app is one entry here.
3. `path: '/'` is the root — what loads when someone visits your site's home page.
4. `createWebHistory()` uses the browser's History API. Vite's dev server handles this automatically. On a production server you'd need to configure it to always serve `index.html`.

### Register the router in `main.js`

```js title="src/main.js"
import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from './router' // (1)

createApp(App)
  .use(router) // (2)
  .mount('#app')
```

1. Import the router we just created.
2. `.use(router)` installs it — this makes `<RouterView>`, `<RouterLink>`, and the `useRouter` / `useRoute` composables available everywhere in the app.

### Update `App.vue` — add `<RouterView>`

`App.vue` is now just a shell. It holds the navbar and the `<RouterView>` placeholder — nothing else lives here.

```vue title="src/App.vue"
<template>
  <div class="min-h-screen bg-gray-100">

    <!-- Navbar -->
    <nav class="bg-white shadow-sm px-8 py-4 flex gap-6 items-center"> 
      <span class="text-lg font-bold text-indigo-600">💿 Vinyl Vault</span>
      <RouterLink to="/"       class="text-sm text-gray-600 hover:text-indigo-600">Home</RouterLink>
      <RouterLink to="/albums" class="text-sm text-gray-600 hover:text-indigo-600">Albums</RouterLink>
    </nav>

    <!-- Active page renders here -->
    <RouterView /> 

  </div>
</template>

<script setup>
// App.vue has no logic — each view manages its own data
</script>
```

1. `<RouterLink to="/">` renders as a regular `<a>` tag in the HTML, but Vue Router intercepts the click so no page reload happens.
2. `<RouterView />` is the slot where the matched component renders. When the URL is `/`, `HomeView` renders here. When it's `/albums`, `AlbumsView` renders here.

### Two placeholder views — just enough to prove routing works

```vue title="src/views/HomeView.vue"
<template>
  <div class="max-w-2xl mx-auto px-8 py-16 text-center">
    <h1 class="text-4xl font-bold text-gray-800">💿 Vinyl Vault</h1>
    <p class="text-gray-500 mt-4">This is the Home page.</p>
  </div>
</template>
```

```vue title="src/views/AlbumsView.vue"
<template>
  <div class="max-w-4xl mx-auto px-8 py-8">
    <h1 class="text-2xl font-bold text-gray-800">Albums</h1>
    <p class="text-gray-500 mt-2">This is the Albums page. Nothing real here yet.</p>
  </div>
</template>
```

!!! example "🎯 Try it live"
    - Click **Home** in the navbar — `HomeView` renders, URL is `/`
    - Click **Albums** — `AlbumsView` renders, URL is `/albums`
    - Open DevTools → Network tab → click between pages. **No new requests.** The browser is not going to the server. Vue Router is just swapping components.

That's the entire mental model of routing: **URL in, component out.** Everything else we do today is just filling these views in with real content.

### Create the `views/` and `components/` folders

```
src/
├── components/        ← create this folder (empty for now)
├── views/
│   ├── HomeView.vue
│   └── AlbumsView.vue
├── router/
│   └── index.js
├── App.vue
└── main.js
```

!!! note "Components vs Views — the convention"
    - `src/components/` — reusable pieces used in multiple places (e.g. a card, a badge)
    - `src/views/` — page-level components that map directly to a route (`AlbumsView`, `HomeView`)

    Technically there's no difference — both are Vue components. The folder separation is just a widely-used convention that makes the project easier to navigate.

---

➡️ *Routing itself is done — two pages, one link, zero surprises. Now let's build the pieces the real Albums page will need: small, standalone components, built and tested on their own before any routing gets involved.*

---

## 3 — Building Simple Components (no routing yet)



Before we touch `AlbumsView` again, let's build two small, reusable components in isolation. Neither of them knows anything about routes, URLs, or navigation — they just take props and emit events, like any other Vue component.

### `GenreBadge.vue` — a tiny presentational component

```vue title="src/components/GenreBadge.vue"
<template>
  <span :class="colorClasses" class="text-xs font-medium px-2 py-0.5 rounded-full"> 
    {{ genre }}
  </span>
</template>

<script setup>
import { computed } from 'vue'

const props = defineProps({ // (2)
  genre: { type: String, required: true },
})

const colorMap = { // (3)
  Rock:    'bg-red-100 text-red-700',
  Jazz:    'bg-amber-100 text-amber-700',
  Pop:     'bg-pink-100 text-pink-700',
  Electronic: 'bg-blue-100 text-blue-700',
  Folk:    'bg-green-100 text-green-700',
}

const colorClasses = computed(() => colorMap[props.genre] ?? 'bg-gray-100 text-gray-700') // (4)
</script>
```

1. Purely presentational — this component has no state and no logic beyond picking a color.
2. `defineProps` declares the single input this component needs: `genre`.
3. A lookup table mapping genre names to Tailwind color classes.
4. `computed` falls back to gray for any genre not in the map, so an unrecognised genre never breaks the UI.

### `AlbumCard.vue` — a component that emits an event

```vue title="src/components/AlbumCard.vue"
<template>
  <div class="bg-white rounded-xl p-5 shadow-sm">
    <div class="flex justify-between items-start mb-3">
      <GenreBadge :genre="genre" /> 
      <span v-if="owned" class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Owned</span>
      <span v-else       class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Wishlist</span>
    </div>

    <h2 class="text-lg font-semibold text-gray-800">{{ title }}</h2>
    <p class="text-sm text-gray-500 mt-1">{{ year }} · {{ artist }}</p>

    <div class="flex justify-between items-center mt-4">
      <span class="text-yellow-500 font-semibold">★ {{ rating }}</span>
      <button @click="emit('toggle')" class="text-sm text-indigo-600 hover:underline"> 
        {{ owned ? 'Move to wishlist' : 'Mark as owned' }}
      </button>
    </div>
  </div>
</template>

<script setup>
import GenreBadge from './GenreBadge.vue'

defineProps({ // (3)
  id:     { type: Number, required: true },
  title:  { type: String, required: true },
  artist: { type: String, required: true },
  year:   { type: Number, required: true },
  genre:  { type: String, required: true },
  rating: { type: Number, required: true },
  owned:  { type: Boolean, default: false },
})

const emit = defineEmits(['toggle']) // (4)
</script>
```

1. `AlbumCard` reuses `GenreBadge` — components composing other components, same as always. Still nothing route-related.
2. Clicking the button doesn't change any data itself — it just emits a `toggle` event and lets the parent decide what to do.
3. `id` is declared as a prop even though the card doesn't display it directly — the parent view will need it in a moment to build a link.
4. `defineEmits` declares the one event this component can send upward: `toggle`.

!!! example "🎯 Try it live"
    Drop `<AlbumCard :id="1" title="Kind of Blue" artist="Miles Davis" :year="1959" genre="Jazz" :rating="9.4" :owned="true" />` into any view temporarily and confirm it renders correctly — badge, title, artist, rating, and the toggle button all show up. This works with zero routing involved; it's just a component receiving props.

---

➡️ *Two solid components, tested on their own. Now let's go back to `AlbumsView` and have it mix and match them — that's where routing and components meet.*

---

## 4 — Assembling the Albums View



This is the step where routing and components come together: `AlbumsView` — the component our `/albums` route already points to — will hold the real album data, render one `AlbumCard` per album, and let the user add new albums.

```vue title="src/views/AlbumsView.vue"
<template>
  <div class="max-w-4xl mx-auto px-8 py-8">
    <div class="flex justify-between items-center mb-6">
      <h1 class="text-2xl font-bold text-gray-800">Albums</h1>
      <button @click="showForm = !showForm"
              class="px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
        {{ showForm ? '✕ Cancel' : '+ Add Album' }}
      </button>
    </div>

    <!-- Add album form -->
    <div v-if="showForm" class="bg-white rounded-xl p-5 shadow-sm mb-6">
      <h2 class="font-semibold text-gray-700 mb-4">Add an Album</h2>
      <div class="grid grid-cols-1 sm:grid-cols-2 gap-3">
        <input v-model="newAlbum.title"        placeholder="Title"  class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model="newAlbum.artist"       placeholder="Artist" class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model.number="newAlbum.year"  placeholder="Year"   type="number" class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model="newAlbum.genre"        placeholder="Genre"  class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model.number="newAlbum.rating" placeholder="Rating" type="number" step="0.1" class="border rounded-lg px-3 py-2 text-sm" />
      </div>
      <button @click="addAlbum" class="mt-4 px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
        Add to Collection
      </button>
    </div>

    <!-- Album grid -->
    <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">
      <AlbumCard
        v-for="album in albums"
        :key="album.id"
        :id="album.id"
        :title="album.title"
        :artist="album.artist"
        :year="album.year"
        :genre="album.genre"
        :rating="album.rating"
        :owned="album.owned"
        @toggle="toggleOwned(album.id)"
      />
    </div>
  </div>
</template>

<script setup>
import { ref, reactive } from 'vue'
import AlbumCard from '../components/AlbumCard.vue' // (1)

const albums = ref([ // (2)
  { id: 1, title: 'Kind of Blue',        artist: 'Miles Davis',   year: 1959, genre: 'Jazz',       rating: 9.4, owned: true  },
  { id: 2, title: 'Rumours',             artist: 'Fleetwood Mac', year: 1977, genre: 'Rock',       rating: 9.1, owned: false },
  { id: 3, title: 'Discovery',           artist: 'Daft Punk',     year: 2001, genre: 'Electronic', rating: 8.9, owned: false },
  { id: 4, title: 'Blue',                artist: 'Joni Mitchell', year: 1971, genre: 'Folk',       rating: 9.2, owned: false },
])

const showForm = ref(false)
const newAlbum = reactive({ title: '', artist: '', year: new Date().getFullYear(), genre: '', rating: 7.0 })

function toggleOwned(id) {
  const album = albums.value.find(a => a.id === id)
  if (album) album.owned = !album.owned
}

function addAlbum() {
  if (!newAlbum.title || !newAlbum.genre) return
  albums.value.push({
    id: Date.now(),
    title: newAlbum.title, artist: newAlbum.artist,
    year: newAlbum.year,   genre: newAlbum.genre, rating: newAlbum.rating,
    owned: false,
  })
  newAlbum.title = ''; newAlbum.artist = ''
  newAlbum.year = new Date().getFullYear(); newAlbum.genre = ''; newAlbum.rating = 7.0
  showForm.value = false
}
</script>
```

1. This is the first time `AlbumsView` imports a component — routing and component-composition finally meet here. The view's job is to own the data; the component's job is to render one item of it.
2. This data lived nowhere before — it's created fresh, right here in the view that the `/albums` route renders.

!!! example "🎯 Try it live"
    - Navigate to `/albums` — a full grid of `AlbumCard`s renders, each built from the shared `AlbumCard` and `GenreBadge` components
    - Click **+ Add Album**, fill in the form, submit — a new card appears in the grid
    - Click **Mark as owned** on a card — its badge flips between Owned and Wishlist

---

➡️ *Two pages, real components, working together. Now let's give each album its own page — the part where the URL itself carries information.*

---

## 5 — Route Params: `AlbumDetailView`



### What we want

When a user clicks on an album card, they navigate to `/albums/1` (or `/albums/2`, etc.). The detail page reads the `1` from the URL, finds that album in the data, and shows a full detail view.

### Step 1 — register the new route

Add the third route to `src/router/index.js`:

```js title="src/router/index.js — updated"
import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AlbumsView from '../views/AlbumsView.vue'
import AlbumDetailView from '../views/AlbumDetailView.vue' // (1)

const routes = [
  { path: '/',            component: HomeView },
  { path: '/albums',      component: AlbumsView },
  { path: '/albums/:id',  component: AlbumDetailView }, // (2)
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router
```

1. Import the new view.
2. `:id` is a **route param** — a variable segment. `/albums/1`, `/albums/42`, `/albums/anything` all match this route.

### Step 2 — make each card link to its own detail page

Update `AlbumCard.vue` — wrap the title in a `<RouterLink>`:

```vue title="src/components/AlbumCard.vue — updated"
<template>
  <div class="bg-white rounded-xl p-5 shadow-sm">
    <div class="flex justify-between items-start mb-3">
      <GenreBadge :genre="genre" />
      <span v-if="owned" class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Owned</span>
      <span v-else       class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Wishlist</span>
    </div>

    <RouterLink :to="`/albums/${id}`" class="hover:text-indigo-600">
      <h2 class="text-lg font-semibold text-gray-800">{{ title }}</h2>
    </RouterLink>
    <p class="text-sm text-gray-500 mt-1">{{ year }} · {{ artist }}</p>

    <div class="flex justify-between items-center mt-4">
      <span class="text-yellow-500 font-semibold">★ {{ rating }}</span>
      <button @click="emit('toggle')" class="text-sm text-indigo-600 hover:underline">
        {{ owned ? 'Move to wishlist' : 'Mark as owned' }}
      </button>
    </div>
  </div>
</template>
```

1. `:to="\`/albums/${id}\`"` builds the URL dynamically using the `id` prop. This is exactly why we declared `id` as a prop back in Section 3, even though it wasn't displayed — it was always headed here.

### Step 3 — create `AlbumDetailView.vue`

```vue title="src/views/AlbumDetailView.vue"
<template>
  <div class="max-w-2xl mx-auto px-8 py-8">

    <!-- Back link -->
    <RouterLink to="/albums" class="text-sm text-indigo-600 hover:underline mb-6 inline-block">
      ← Back to Albums
    </RouterLink>

    <!-- Loading state — album not found -->
    <div v-if="!album" class="text-gray-400 mt-8 text-center">Album not found.</div>

    <!-- Album detail -->
    <div v-else class="bg-white rounded-xl p-8 shadow-sm">
      <div class="flex justify-between items-start mb-4">
        <GenreBadge :genre="album.genre" />
        <span v-if="album.owned" class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Owned</span>
        <span v-else              class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Wishlist</span>
      </div>

      <h1 class="text-3xl font-bold text-gray-800 mb-1">{{ album.title }}</h1>
      <p class="text-gray-500 mb-1">{{ album.year }} · {{ album.artist }}</p>
      <p class="text-yellow-500 font-semibold text-lg mb-6">★ {{ album.rating }}</p>

      <button @click="toggleOwned"
              class="px-5 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium hover:bg-indigo-700">
        {{ album.owned ? 'Move to Wishlist' : 'Mark as Owned' }}
      </button>
    </div>

  </div>
</template>

<script setup>
import { computed } from 'vue'
import { useRoute } from 'vue-router' // (1)
import GenreBadge from '../components/GenreBadge.vue'

const route = useRoute() // (2)

// Temporary local data — in Lec 5 this moves to a Pinia store
const albums = [ // (3)
  { id: 1, title: 'Kind of Blue',        artist: 'Miles Davis',   year: 1959, genre: 'Jazz',       rating: 9.4, owned: true  },
  { id: 2, title: 'Rumours',             artist: 'Fleetwood Mac', year: 1977, genre: 'Rock',       rating: 9.1, owned: false },
  { id: 3, title: 'Discovery',           artist: 'Daft Punk',     year: 2001, genre: 'Electronic', rating: 8.9, owned: false },
  { id: 4, title: 'Blue',                artist: 'Joni Mitchell', year: 1971, genre: 'Folk',       rating: 9.2, owned: false },
]

const album = computed(() => { // (4)
  const id = Number(route.params.id) // (5)
  return albums.find(a => a.id === id) ?? null
})

function toggleOwned() {
  if (album.value) album.value.owned = !album.value.owned // (6)
}
</script>
```

1. `useRoute()` is a composable provided by Vue Router. It gives access to everything about the current URL — params, query strings, path, name.
2. `route` is now a reactive object. `route.params.id` gives us the `:id` part of the URL as a string.
3. The data is duplicated here for now — `AlbumsView` and `AlbumDetailView` each have their own copy. This is the problem Pinia solves in Lec 5. Point this out explicitly.
4. `computed` is the right choice — if the route changes (e.g. user navigates from `/albums/1` to `/albums/2`), the computed re-runs automatically.
5. `route.params.id` is always a **string** — even if the URL is `/albums/1`, the param is `"1"`. `Number()` converts it so the `===` comparison with `album.id` (a number) works correctly.
6. This mutates the local copy — it won't affect `AlbumsView`. Again, Pinia fixes this.

!!! example "🎯 Try it live"
    - Navigate to `/albums`
    - Click an album title — URL changes to `/albums/1`
    - The detail page renders with that album's data
    - Click ← Back to Albums — returns to the list
    - Manually type `/albums/99` in the URL bar — "Album not found." appears

!!! warning "The data duplication problem"
    Right now `AlbumsView` and `AlbumDetailView` each hold their own copy of the `albums` array. Toggling owned on the detail page doesn't affect the list page — they're two separate arrays.

    **This is intentional.** It's the exact problem Pinia exists to solve. For now, note it and move on.

---

➡️ *Clicking links works. Sometimes you need to navigate from code — not from a click.*

---

## 6 — Programmatic Navigation

### `useRouter` — navigate from code

`useRoute` reads the current URL. `useRouter` lets you *navigate* to a new one.

```js
import { useRouter } from 'vue-router' // (1)

const router = useRouter()

// Navigate to a path
router.push('/albums')

// Navigate to a path with a param
router.push({ path: `/albums/${id}` })

// Navigate back
router.back()

// Replace current history entry (no back button)
router.replace('/login')
```

1. Two composables — easy to mix up. **`useRoute`** (no r at the end) = read the URL. **`useRouter`** (with r) = change the URL.


## 7 — Pitfalls & Wrap-up



### ❌ Forgetting that route params are strings

```js
const id = route.params.id                  // ❌ "1" — a string
const album = albums.find(a => a.id === id) // ❌ 1 !== "1" — finds nothing

const id = Number(route.params.id)          // ✅ 1 — a number
const album = albums.find(a => a.id === id) // ✅ works
```

### ❌ Using `<a>` instead of `<RouterLink>`

```vue
<a href="/albums">Albums</a>                    <!-- ❌ full page reload — Vue state resets -->
<RouterLink to="/albums">Albums</RouterLink>    <!-- ✅ client-side navigation -->
```

### ❌ Using `useRoute` when you need `useRouter` (and vice versa)

```js
const route  = useRoute()   // ✅ read: route.params, route.query, route.path
const router = useRouter()  // ✅ navigate: router.push(), router.back()

router.params.id   // ❌ router doesn't have params
route.push('/...')  // ❌ route can't navigate
```

### ❌ Defining routes after `createRouter` is called

```js
const router = createRouter({ routes })
routes.push({ path: '/new', component: NewView }) // ❌ too late — router already built

// ✅ All routes must be in the array before createRouter() is called
```

---

## Summary

**How we built Vinyl Vault, in order:**

| Phase | What we did |
|---|---|
| 1 — Concepts | What routing is, key terms: route, `<RouterView>`, `<RouterLink>`, param, guard |
| 2 — Simple routing | `vue-router` installed, two placeholder routes (`/`, `/albums`) proving `<RouterView>`/`<RouterLink>` work |
| 3 — Simple components | `GenreBadge.vue` and `AlbumCard.vue` built and tested standalone, no routing involved |
| 4 — Assembling a view | `AlbumsView` imports the components, owns the real data, mixes and matches them into a grid |
| 5 — Route params | `/albums/:id` added, `AlbumCard` links to it, `AlbumDetailView` reads `useRoute()` |
| 6 — Programmatic nav | `useRouter()`, `router.push()` after form submit |

**The mental model:**

```
URL bar:  /albums/2
              │
              ▼
        router/index.js
        matches: /albums/:id
        param:   id = "2"
              │
              ▼
        AlbumDetailView.vue
        useRoute().params.id → "2" → Number() → 2
        albums.find(a => a.id === 2) → { title: "Rumours...", ... }
              │
              ▼
        Page renders with that album's data
```

