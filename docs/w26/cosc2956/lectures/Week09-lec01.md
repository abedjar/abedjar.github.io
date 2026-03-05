---
search:
  exclude: true
---

# COSC2956 – Internet Tools
##  Building a Movie Watchlist

---

!!! info "Lecture at a Glance"

    **The project:** a Movie Watchlist. By the end it will look and feel like a real app — data-driven, interactive, and split into components.


---

### The static page

The following is a static HTML page that will be used as a starting point for the Vue application. It is not a Vue component and does not use any Vue logic. 


```html title="static.html"
<!doctype html>
<html lang="en">

<head>
  <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>

<body>
  <div class="min-h-screen bg-gray-100 p-8"> <!--  -->

    <h1 class="text-3xl font-bold text-gray-800 mb-6">🎬 My Watchlist</h1>

    <!-- Filter bar -->
    <div class="flex gap-3 mb-6">
      <button class="px-4 py-1.5 rounded-full bg-indigo-600 text-white text-sm">All</button>
      <button class="px-4 py-1.5 rounded-full bg-white text-gray-600 text-sm border">Watched</button>
      <button class="px-4 py-1.5 rounded-full bg-white text-gray-600 text-sm border">Unwatched</button>
    </div>

    <!-- Movie grid -->
    <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4"> <!--  -->

      <!-- Movie card — watched -->
      <div class="bg-white rounded-xl p-5 shadow-sm">
        <div class="flex justify-between items-start mb-3">
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-purple-100 text-purple-700">Sci-Fi</span>
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Watched</span>
        </div>
        <h2 class="text-lg font-semibold text-gray-800">Dune</h2>
        <p class="text-sm text-gray-500 mt-1">2021 · Denis Villeneuve</p>
        <div class="flex justify-between items-center mt-4">
          <span class="text-yellow-500 font-semibold">★ 8.0</span>
          <button class="text-sm text-indigo-600 hover:underline">Mark unwatched</button>
        </div>
      </div>

      <!-- Movie card — unwatched -->
      <div class="bg-white rounded-xl p-5 shadow-sm">
        <div class="flex justify-between items-start mb-3">
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-red-100 text-red-700">Action</span>
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Unwatched</span>
        </div>
        <h2 class="text-lg font-semibold text-gray-800">Mad Max: Fury Road</h2>
        <p class="text-sm text-gray-500 mt-1">2015 · George Miller</p>
        <div class="flex justify-between items-center mt-4">
          <span class="text-yellow-500 font-semibold">★ 8.1</span>
          <button class="text-sm text-indigo-600 hover:underline">Mark watched</button>
        </div>
      </div>

      <!-- Movie card — unwatched -->
      <div class="bg-white rounded-xl p-5 shadow-sm">
        <div class="flex justify-between items-start mb-3">
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-blue-100 text-blue-700">Drama</span>
          <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Unwatched</span>
        </div>
        <h2 class="text-lg font-semibold text-gray-800">The Shawshank Redemption</h2>
        <p class="text-sm text-gray-500 mt-1">1994 · Frank Darabont</p>
        <div class="flex justify-between items-center mt-4">
          <span class="text-yellow-500 font-semibold">★ 9.3</span>
          <button class="text-sm text-indigo-600 hover:underline">Mark watched</button>
        </div>
      </div>

    </div>
  </div>

</body>

</html>
```

1. `min-h-screen` makes the background fill the whole page. `bg-gray-100` is a light grey. `p-8` adds padding.
2. `grid-cols-3` gives us three columns on large screens. `gap-4` spaces the cards out.

!!! note "What to point out"
    - The three cards are **identical in structure** — same HTML repeated three times
    - The only differences are the title, genre, rating, year, and watched status
    - The buttons do nothing — they're just HTML
    - If you wanted a fourth movie, you'd copy-paste a whole block of HTML

    **This is the problem Vue solves.**

---

## Phase 1 — App setup

??? note "🗣️ Talking Points"
    - Don't mention Vue yet. Just build a page.
    - Ask: *"Who recognises this workflow — you design the HTML first, then figure out how to make it dynamic?"* That's exactly what we're doing today, but we'll make it dynamic the Vue way.
    - Keep the Tailwind classes minimal. Explain you're using Tailwind just for spacing and colour — not to show off, just to avoid writing a big `<style>` block during the demo.
    - After you finish this phase, pause and say: *"Right now this is dead. The data is locked inside the HTML. If a new movie comes out, you edit the HTML. If you want to mark something watched, you edit the HTML. Let's fix that."*

### Setup

Create a new Vite + Vue project:

```bash title="Terminal"
npm create vite@latest movie-watchlist -- --template vue
cd movie-watchlist
npm install
npm run dev
```

Add Tailwind. In the terminal:

```bash title="Terminal"
npm install -D tailwindcss @tailwindcss/vite
```

In `vite.config.js`:

1. Import the Tailwind Vite plugin.
2. Add it to the plugins array — this is all you need, no `tailwind.config.js` required.

```js title="vite.config.js"
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import tailwindcss from '@tailwindcss/vite' // (1)

export default defineConfig({
  plugins: [
    vue(),
    tailwindcss(), // (2)
  ],
})
```


Replace `src/style.css` with just one line:

```css title="src/style.css"
@import "tailwindcss";
```

Make sure `main.js` imports it:

```js title="src/main.js"
import { createApp } from 'vue'
import './style.css' // (1)
import App from './App.vue'

createApp(App).mount('#app')
```

1. This line must be here — it's what loads Tailwind into your app.



---

➡️ *The structure is right. Now let's make the data live outside the HTML.*

---

## Phase 2 — Data-Driven with Vue

??? note "🗣️ Talking Points"
    - The move from Phase 1 to Phase 2 is the central insight of this lecture. You're not changing what the page looks like at all — you're changing *where the data lives*.
    - Walk through the `movies` array slowly. Ask students to spot the connection between the array properties and where they appear in the template.
    - When you add `v-for`, the three hardcoded cards disappear and get replaced by one `<div>` that renders three times. That moment is worth pausing on.
    - After `v-for` works, add a fourth movie to the array and save. The page updates instantly with no HTML change. That's the payoff.

### Move the data into a `ref`

Replace `<script setup>` with:

```vue title="App.vue"
<script setup>
import { ref } from 'vue'

const movies = ref([ // (1)
  {
    id: 1,
    title: 'Dune',
    director: 'Denis Villeneuve',
    year: 2021,
    genre: 'Sci-Fi',
    rating: 8.0,
    watched: true, // (2)
  },
  {
    id: 2,
    title: 'Mad Max: Fury Road',
    director: 'George Miller',
    year: 2015,
    genre: 'Action',
    rating: 8.1,
    watched: false,
  },
  {
    id: 3,
    title: 'The Shawshank Redemption',
    director: 'Frank Darabont',
    year: 1994,
    genre: 'Drama',
    rating: 9.3,
    watched: false,
  },
])
</script>
```

1. `ref([])` makes the entire array reactive. When any movie's data changes, the template updates automatically.
2. `watched: true/false` is the single source of truth for whether a movie has been seen. We never set this in the HTML — only here.

### Replace the three cards with `v-for`

Now replace the three hard-coded card `<div>` blocks with a single `v-for`:

```vue title="App.vue" hl_lines="3 5 10 12 15 17"
<!-- Movie grid -->
<div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">

  <div v-for="movie in movies" :key="movie.id" <!-- (1) -->
       class="bg-white rounded-xl p-5 shadow-sm">

    <div class="flex justify-between items-start mb-3">
      <!-- Genre badge -->
      <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-purple-100 text-purple-700">
        {{ movie.genre }} <!-- (2) -->
      </span>
      <!-- Watched badge -->
      <span v-if="movie.watched" <!-- (3) -->
            class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">
        ✓ Watched
      </span>
      <span v-else
            class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">
        Unwatched
      </span>
    </div>

    <h2 class="text-lg font-semibold text-gray-800">{{ movie.title }}</h2>
    <p class="text-sm text-gray-500 mt-1">{{ movie.year }} · {{ movie.director }}</p>

    <div class="flex justify-between items-center mt-4">
      <span class="text-yellow-500 font-semibold">★ {{ movie.rating }}</span>
      <button class="text-sm text-indigo-600 hover:underline">
        {{ movie.watched ? 'Mark unwatched' : 'Mark watched' }} <!-- (4) -->
      </button>
    </div>

  </div>

</div>
```

1. `v-for="movie in movies"` loops over the array. `:key="movie.id"` gives Vue a stable identity for each card — always use a unique ID, never the array index.
2. `{{ movie.genre }}` pulls from the current loop item. Each card gets its own data automatically.
3. `v-if="movie.watched"` shows the green badge for watched movies, `v-else` shows the grey one for unwatched. Vue picks the right one per card.
4. A ternary expression — renders the right button label based on the current watched state.

!!! example "🎯 Try it live"
    Add a fourth movie to the `movies` array and save:
    ```javascript
    {
      id: 4,
      title: 'Parasite',
      director: 'Bong Joon-ho',
      year: 2019,
      genre: 'Thriller',
      rating: 8.5,
      watched: false,
    }
    ```
    A fourth card appears with zero HTML changes. **The template is a description of what one card looks like — the data drives how many there are.**

---

➡️ *The page is alive. Now let's make the buttons actually do something.*

---

## Phase 3 — Interactions

??? note "🗣️ Talking Points"
    - Students sometimes expect interactions to be complicated. Show them they're just function calls that change a property.
    - For the toggle: point at the `movie.watched = !movie.watched` line and ask *"How many lines of DOM code did we write?"* Zero. Vue saw the change and updated the badge and button label automatically.
    - For the add form: introduce `v-model` as revision from Lec 1. The new thing here is that the form is in the same component as the list — we're not doing components yet. That deliberate simplicity sets up the motivation for Phase 4.
    - After the form works, point out that `App.vue` is getting long. Ask: *"What if you had 50 movies and a different page for each genre? Would you keep everything in one file?"* That leads into Phase 4.

### Toggle watched status

Add a `toggleWatched` function to `<script setup>`:

1. Takes the movie's `id` as an argument — not the index, not the whole object, just the ID.
2. `movies.value.find()` searches the reactive array for the matching movie.
3. Flips `watched` between `true` and `false`. Vue detects this property change and re-renders the badge and button label automatically.

```javascript title="App.vue"
function toggleWatched(id) { // (1)
  const movie = movies.value.find(m => m.id === id) // (2)
  if (movie) movie.watched = !movie.watched // (3)
}
```



Wire the button in the template:

```vue title="App.vue"
<button @click="toggleWatched(movie.id)" 
        class="text-sm text-indigo-600 hover:underline">
  {{ movie.watched ? 'Mark unwatched' : 'Mark watched' }} 
</button>
```

1. Pass `movie.id` (not `movie`) — the function only needs the ID to find and update the right entry.

Click a button. The badge and label flip instantly. Click again — they flip back. **One line of logic, zero DOM code.**

---

### Add a movie — the form

Import reactive:
```javascript title="App.vue"
import { ref, reactive } from 'vue'
```

Add form state to `<script setup>`:

```javascript title="App.vue"
const showForm = ref(false) // (1)

const newMovie = reactive({ // (2)
  title: '',
  director: '',
  year: new Date().getFullYear(),
  genre: '',
  rating: 7.0,
})
```

1. Controls whether the form is visible. Starts hidden.
2. `reactive()` is a good fit here — these are related fields that always change together as a group.

Add the `addMovie` function:

```javascript title="App.vue"
function addMovie() {
  if (!newMovie.title || !newMovie.genre) return // (1)

  movies.value.push({
    id: Date.now(), // (2)
    title: newMovie.title,
    director: newMovie.director,
    year: newMovie.year,
    genre: newMovie.genre,
    rating: newMovie.rating,
    watched: false,
  })

  // Reset the form
  newMovie.title = ''
  newMovie.director = ''
  newMovie.year = new Date().getFullYear()
  newMovie.genre = ''
  newMovie.rating = 7.0
  showForm.value = false // (3)
}
```

1. Basic validation — don't add a movie with no title or genre.
2. `Date.now()` gives a unique number as an ID. Fine for this demo — a real app would use a database-generated ID.
3. Close the form after adding.

Add the form to the template, just above the grid:

```vue title="App.vue"
<!-- Add Movie button -->
<button @click="showForm = !showForm"
        class="mb-6 px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
  {{ showForm ? '✕ Cancel' : '+ Add Movie' }} <!-- (1) -->
</button>

<!-- Add Movie form -->
<div v-if="showForm" class="bg-white rounded-xl p-5 shadow-sm mb-6"> <!-- (2) -->
  <h2 class="font-semibold text-gray-700 mb-4">Add a Movie</h2>

  <div class="grid grid-cols-1 sm:grid-cols-2 gap-3">
    <input v-model="newMovie.title"    placeholder="Title"    class="border rounded-lg px-3 py-2 text-sm" />
    <input v-model="newMovie.director" placeholder="Director" class="border rounded-lg px-3 py-2 text-sm" />
    <input v-model.number="newMovie.year"   type="number" placeholder="Year"   class="border rounded-lg px-3 py-2 text-sm" />
    <input v-model="newMovie.genre"    placeholder="Genre"    class="border rounded-lg px-3 py-2 text-sm" />
    <input v-model.number="newMovie.rating" type="number" placeholder="Rating (0–10)" step="0.1" class="border rounded-lg px-3 py-2 text-sm" /> <!-- (3) -->
  </div>

  <button @click="addMovie"
          class="mt-4 px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
    Add to Watchlist
  </button>
</div>
```

1. The button label changes based on `showForm` — same toggle pattern as the watched status.
2. `v-if="showForm"` shows the form only when the button has been clicked.
3. `v-model.number` converts the input string to a real number automatically — without this, `rating` would be the string `"7.5"` instead of the number `7.5`.

!!! note "The full `<script setup>` at this point"
    ```vue
    <script setup>
    import { ref, reactive } from 'vue'

    const movies = ref([
      { id: 1, title: 'Dune',                      director: 'Denis Villeneuve', year: 2021, genre: 'Sci-Fi',   rating: 8.0, watched: true  },
      { id: 2, title: 'Mad Max: Fury Road',         director: 'George Miller',   year: 2015, genre: 'Action',   rating: 8.1, watched: false },
      { id: 3, title: 'The Shawshank Redemption',   director: 'Frank Darabont',  year: 1994, genre: 'Drama',    rating: 9.3, watched: false },
      { id: 4, title: 'Parasite',                   director: 'Bong Joon-ho',    year: 2019, genre: 'Thriller', rating: 8.5, watched: false },
    ])

    const showForm = ref(false)
    const newMovie = reactive({
      title: '', director: '', year: new Date().getFullYear(), genre: '', rating: 7.0,
    })

    function toggleWatched(id) {
      const movie = movies.value.find(m => m.id === id)
      if (movie) movie.watched = !movie.watched
    }

    function addMovie() {
      if (!newMovie.title || !newMovie.genre) return
      movies.value.push({
        id: Date.now(),
        title: newMovie.title, director: newMovie.director,
        year: newMovie.year,   genre: newMovie.genre, rating: newMovie.rating,
        watched: false,
      })
      newMovie.title = ''; newMovie.director = ''
      newMovie.year = new Date().getFullYear(); newMovie.genre = ''; newMovie.rating = 7.0
      showForm.value = false
    }
    </script>
    ```

!!! warning "App.vue is getting long"
    We have logic, form state, and card HTML all mixed together. And we only have 4 movies and one interaction. Imagine 10 features.

    This is the natural moment to ask: **what if the card was its own file?**

---

➡️ *The app works. Now let's organise it properly.*

---

## Phase 4 — Extract `MovieCard.vue`

??? note "🗣️ Talking Points"
    - The key message: **the app doesn't change at all from the user's perspective.** The same page, the same behaviour. We're just reorganising *where the code lives*.
    - Walk through `defineProps` carefully. For each prop, ask: *"Where does this value come from?"* — it comes from the `movie` object in `App.vue`.
    - When you add `defineEmits(['toggle'])`, ask: *"Why not just call `toggleWatched` directly from inside the card?"* — because `MovieCard` doesn't own the data. It doesn't even know `movies` exists. It can only ask politely.
    - After `App.vue` is updated, scroll through it. It's now about half the length. That's the payoff.

### What goes in the component?

Everything inside the `<div v-for>` card belongs in `MovieCard.vue`. The component will:

- **Receive** movie data via props
- **Emit** a `toggle` event when the button is clicked

The component does not own the data. It borrows it, displays it, and asks `App.vue` to make changes.

### Create `src/components/MovieCard.vue`

```vue title="MovieCard.vue"
<template>
  <div class="bg-white rounded-xl p-5 shadow-sm">

    <div class="flex justify-between items-start mb-3">
      <!-- Genre badge — we'll improve this in Phase 5 -->
      <span class="text-xs font-medium px-2 py-0.5 rounded-full bg-purple-100 text-purple-700">
        {{ genre }} <!-- (1) -->
      </span>
      <!-- Watched badge -->
      <span v-if="watched"
            class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">
        ✓ Watched
      </span>
      <span v-else
            class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">
        Unwatched
      </span>
    </div>

    <h2 class="text-lg font-semibold text-gray-800">{{ title }}</h2>
    <p class="text-sm text-gray-500 mt-1">{{ year }} · {{ director }}</p>

    <div class="flex justify-between items-center mt-4">
      <span class="text-yellow-500 font-semibold">★ {{ rating }}</span>
      <button @click="emit('toggle')" <!-- (2) -->
              class="text-sm text-indigo-600 hover:underline">
        {{ watched ? 'Mark unwatched' : 'Mark watched' }}
      </button>
    </div>

  </div>
</template>

<script setup>
const props = defineProps({ // (3)
  id:       { type: Number, required: true },
  title:    { type: String, required: true },
  director: { type: String, required: true },
  year:     { type: Number, required: true },
  genre:    { type: String, required: true },
  rating:   { type: Number, required: true },
  watched:  { type: Boolean, required: true },
})

const emit = defineEmits(['toggle']) // (4)
</script>
```

1. Props are used directly by name in the template — no `props.genre`, just `{{ genre }}`.
2. `emit('toggle')` sends a signal up to the parent. The card doesn't call `toggleWatched` — it doesn't know that function exists.
3. Every piece of data the card needs is declared here. Vue will warn in the console if the parent forgets to pass a required prop.
4. Declaring emits is optional but recommended — it documents what signals this component sends.

### Update `App.vue` to use `MovieCard`

In `<script setup>`, add the import:

```javascript hl_lines="1" title="App.vue"
import MovieCard from './components/MovieCard.vue' // (1)
```

1. The path is relative to `App.vue`. No need to register it — in `<script setup>`, imported components are ready to use immediately.

Replace the entire `<div v-for>` block with:

```vue title="App.vue"
<div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">
  <MovieCard
    v-for="movie in movies"
    :key="movie.id"
    :id="movie.id"
    :title="movie.title"
    :director="movie.director"
    :year="movie.year"
    :genre="movie.genre"
    :rating="movie.rating"
    :watched="movie.watched"
    @toggle="toggleWatched(movie.id)" <!-- (1) -->
  />
</div>
```

1. When `MovieCard` emits `'toggle'`, `App.vue` catches it here and calls `toggleWatched` with the right ID. The card sent the signal — `App.vue` decided what to do with it.

!!! note "What just happened"
    - `App.vue` went from ~80 lines of template to ~15
    - `MovieCard.vue` is now a self-contained, reusable card
    - The app behaves **identically** — toggle still works, form still adds movies
    - If you need a movie card anywhere else in the app, you import `MovieCard` and use it — no copy-paste

---

➡️ *One more step — let's make the genre badge its own component.*

---

## Phase 5 — Extract `GenreBadge.vue`

??? note "🗣️ Talking Points"
    - This is a small component, but it teaches something important: **components nest**. `App.vue` uses `MovieCard`. `MovieCard` uses `GenreBadge`. Real apps have many layers of nesting like this.
    - The genre colour logic — choosing between purple, red, blue, etc. — currently lives in the template as a hardcoded class. Moving it into `GenreBadge` means that logic has one home.
    - After replacing the `<span>` in `MovieCard`, ask: *"If we wanted to add a new genre colour, where do we go?"* — `GenreBadge.vue`, one place.

### Why a `GenreBadge` component?

Right now the genre badge in `MovieCard` is a hardcoded purple pill. Every genre gets purple. In reality, Sci-Fi, Action, and Drama should each have their own colour.

We could add a long `v-if/v-else-if` chain directly in `MovieCard`. But that colour-mapping logic is a self-contained concern — a natural fit for its own small component.

### Create `src/components/GenreBadge.vue`

```vue title="GenreBadge.vue"
<template>
  <span :class="['text-xs font-medium px-2 py-0.5 rounded-full', colourClass]"> <!-- (1) -->
    {{ genre }}
  </span>
</template>

<script setup>
import { computed } from 'vue'

const props = defineProps({
  genre: { type: String, required: true }
})

const colourClass = computed(() => { // (2)
  const map = {
    'Sci-Fi':   'bg-purple-100 text-purple-700',
    'Action':   'bg-red-100    text-red-700',
    'Drama':    'bg-blue-100   text-blue-700',
    'Thriller': 'bg-orange-100 text-orange-700',
    'Comedy':   'bg-yellow-100 text-yellow-700',
    'Horror':   'bg-gray-100   text-gray-700',
  }
  return map[props.genre] ?? 'bg-indigo-100 text-indigo-700' // (3)
})
</script>
```

1. `:class` with an array lets you merge static classes with a dynamic one. The base styling stays the same; only the colour changes per genre.
2. A `computed` property is the right tool here — the colour is *derived* from the genre prop. If the genre changes, the colour updates automatically.
3. `??` is the nullish coalescing operator — if the genre isn't in the map, fall back to indigo. New genres always get a colour.

### Use `GenreBadge` inside `MovieCard`

In `MovieCard.vue`, add the import and replace the genre `<span>`:

```vue title="MovieCard.vue — updated top of script"
<script setup>
import GenreBadge from './GenreBadge.vue' // (1)

// ...rest of defineProps and defineEmits unchanged
</script>
```

1. The import path is relative to `MovieCard.vue`, not `App.vue`.

Replace the genre `<span>` in the template:

```vue hl_lines="2"
<div class="flex justify-between items-start mb-3">
  <GenreBadge :genre="genre" /> <!-- (1) -->
  <!-- watched badge unchanged -->
  ...
</div>
```

1. Pass `genre` as a prop — `MovieCard` received it from `App.vue` and now passes it down to `GenreBadge`. This is the component tree in action.

!!! note "The component tree at the end"
    ```
    App.vue
    │  owns: movies[], showForm, newMovie
    │  handles: toggleWatched(), addMovie()
    │
    └── MovieCard.vue  (one per movie, via v-for)
        │  receives: id, title, director, year, genre, rating, watched
        │  emits: 'toggle'
        │
        └── GenreBadge.vue  (one per card)
            │  receives: genre
            │  no emits — display only
    ```
    Three files. Each one has a single, clear responsibility. `App.vue` manages data. `MovieCard` displays one movie and asks to toggle. `GenreBadge` maps a genre string to a colour.

---

## Phase 6 — Pitfalls & Wrap-up

??? note "🗣️ Talking Points"
    - Keep this fast — 5 minutes. Students are tired.
    - The prop mutation one will bite them in the assignment. Say it once clearly.
    - End on the big picture summary — it's worth spelling out what they just built.

### ❌ Mutating a prop directly

```javascript
// Inside MovieCard.vue — DON'T do this
props.watched = true  // ❌ Vue will warn and behaviour is unpredictable

// ✅ Instead, emit an event and let the parent update the data
emit('toggle')
```

### ❌ Forgetting `:` on non-string props

```vue
<MovieCard watched="true" />   <!-- ❌ passes the STRING "true", not the boolean true -->
<MovieCard :watched="true" />  <!-- ✅ passes the actual boolean -->

<MovieCard year="2021" />      <!-- ❌ passes the STRING "2021" -->
<MovieCard :year="2021" />     <!-- ✅ passes the NUMBER 2021 -->
```

### ❌ Using `v-model.number` — don't forget it for numeric inputs

```vue
<input v-model="newMovie.rating" type="number" />        <!-- ❌ rating is stored as a string -->
<input v-model.number="newMovie.rating" type="number" /> <!-- ✅ stored as a number -->
```

---

## Summary

**What we built:** a fully interactive Movie Watchlist — data-driven, with a toggle, an add form, and a clean component structure.

**The journey:**

| Phase | What changed |
|---|---|
| 1 — Static HTML | Hand-coded cards, data locked in markup |
| 2 — Data-driven | `ref([])` array + `v-for` — add a movie to data, card appears |
| 3 — Interactions | `toggleWatched()` + add form — the page responds to the user |
| 4 — `MovieCard` | Card HTML in its own file — props down, emits up |
| 5 — `GenreBadge` | Colour logic in its own file — components nest |

**The pattern to remember:**

```
Data lives in App.vue
      │
      │  :prop="value"     → pass data DOWN to child
      │  @event="handler"  → receive signals UP from child
      ▼
  MovieCard.vue
      │
      │  :prop="value"     → pass data DOWN again
      ▼
  GenreBadge.vue
```


---

!!! tip Practice
    Extend the watchlist with these features:

    1. **Delete a movie** — add a delete button to `MovieCard`, emit a `'delete'` event, handle it in `App.vue` with `movies.value.filter()`
    2. **Filter by status** — make the All / Watched / Unwatched buttons in the filter bar actually work using a `computed` property
    3. **Star rating input** — in the add form, replace the number input for rating with five clickable ★ buttons

    All three use only what you learned today: props, emits, `computed`, and `v-model`.

---

*COSC2956 Internet Tools — End of Lecture 2*