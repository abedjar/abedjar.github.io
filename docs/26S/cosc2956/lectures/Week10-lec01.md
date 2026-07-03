---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Lecture 3: Routing & Views — Vue Router

---

!!! info "he project"

    the Movie Watchlist from prev lecture. We are adding multiple pages — a Home page, a Movies list page, and a Movie Detail page. The URL changes as you navigate. No full page reloads.

---

## Phase 1 — What is Routing?



### Traditional navigation vs client-side routing

| | Multi-Page App (Traditional) | Single-Page App (Vue Router) |
|---|---|---|
| On link click | Full HTTP request to server | URL updates, component swaps |
| Page reload | ✅ Yes — everything resets | ❌ No — state is preserved |
| Server serves | A new HTML document each time | One `index.html`, always |
| Speed | Network-dependent | Instant after initial load |

### How Vue Router works

```
User clicks <RouterLink to="/movies">

Vue Router intercepts the click
      │
      ├── Updates the browser URL bar  →  /movies
      ├── Does NOT request a new page from the server
      └── Looks up the route table:
            /          →  HomeView.vue
            /movies    →  MoviesView.vue   ← matches
            /movies/:id → MovieDetailView.vue

Vue swaps the component rendered inside <RouterView />
Page updates instantly — no reload
```

### Key terms

| Term | Meaning |
|---|---|
| **Route** | A mapping between a URL path and a component |
| **`<RouterView>`** | A placeholder in your layout — Vue renders the matched component here |
| **`<RouterLink>`** | Like `<a>` but intercepts the click — no page reload |
| **Route param** | A variable segment in the URL, e.g. `:id` in `/movies/:id` |
| **Navigation guard** | A function that runs before a route change — can allow, redirect, or block |

---

➡️ *Concepts clear. Let's install Vue Router and wire it up.*

---

## Phase 2 — Install & Configure Vue Router



### Install Vue Router

In the `movie-watchlist` project directory:

```bash
npm install vue-router
```

### Create the router file

Create a new file `src/router/index.js`:

```js title="src/router/index.js"
import { createRouter, createWebHistory } from 'vue-router' // (1)
import HomeView from '../views/HomeView.vue'
import MoviesView from '../views/MoviesView.vue'
import MovieDetailView from '../views/MovieDetailView.vue'

const routes = [ // (2)
  {
    path: '/',           // (3)
    component: HomeView,
  },
  {
    path: '/movies',
    component: MoviesView,
  },
  {
    path: '/movies/:id', // (4)
    component: MovieDetailView,
  },
]

const router = createRouter({
  history: createWebHistory(), // (5)
  routes,
})

export default router
```

1. `createRouter` builds the router instance. `createWebHistory` gives clean URLs like `/movies` instead of `/#/movies`.
2. The `routes` array is the entire routing table. Every page in your app is one entry here.
3. `path: '/'` is the root — what loads when someone visits your site's home page.
4. `:id` is a **route param** — a variable segment. `/movies/1`, `/movies/42`, `/movies/dune` all match this route.
5. `createWebHistory()` uses the browser's History API. Vite's dev server handles this automatically. On a production server you'd need to configure it to always serve `index.html`.

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

`App.vue` is now just a shell. It holds the navbar and the `<RouterView>` placeholder. Delete all the movie logic from it — that moves into `MoviesView.vue`.

```vue title="src/App.vue"
<template>
  <div class="min-h-screen bg-gray-100">

    <!-- Navbar -->
    <nav class="bg-white shadow-sm px-8 py-4 flex gap-6 items-center"> <!-- (1) -->
      <span class="text-lg font-bold text-indigo-600">🎬 Watchlist</span>
      <RouterLink to="/"        class="text-sm text-gray-600 hover:text-indigo-600">Home</RouterLink>
      <RouterLink to="/movies"  class="text-sm text-gray-600 hover:text-indigo-600">Movies</RouterLink>
    </nav>

    <!-- Active page renders here -->
    <RouterView /> <!-- (2) -->

  </div>
</template>

<script setup>
// App.vue has no logic now — each view manages its own data
</script>
```

1. `<RouterLink to="/">` renders as a regular `<a>` tag in the HTML, but Vue Router intercepts the click so no page reload happens.
2. `<RouterView />` is the slot where the matched component renders. When the URL is `/`, `HomeView` renders here. When it's `/movies`, `MoviesView` renders here.

### Create the `views/` folder

```
src/
├── components/
│   ├── MovieCard.vue
│   └── GenreBadge.vue
├── views/             ← create this folder
│   ├── HomeView.vue
│   ├── MoviesView.vue
│   └── MovieDetailView.vue
├── router/
│   └── index.js
├── App.vue
└── main.js
```

!!! note "Components vs Views — the convention"
    - `src/components/` — reusable pieces used in multiple places (`MovieCard`, `GenreBadge`)
    - `src/views/` — page-level components that map directly to a route (`MoviesView`, `HomeView`)

    Technically there's no difference — both are Vue components. The folder separation is just a widely-used convention that makes the project easier to navigate.

---

➡️ *Router is wired up. Let's build the first two pages.*

---

## Phase 3 — `HomeView` and `MoviesView`



### `HomeView.vue`

```vue title="src/views/HomeView.vue"
<template>
  <div class="max-w-2xl mx-auto px-8 py-16 text-center">
    <h1 class="text-4xl font-bold text-gray-800 mb-4">🎬 My Watchlist</h1>
    <p class="text-gray-500 mb-8">Keep track of movies you want to watch — and ones you already have.</p>
    <RouterLink
      to="/movies"
      class="px-6 py-3 bg-indigo-600 text-white rounded-xl font-medium hover:bg-indigo-700">
      Browse Movies
    </RouterLink>
  </div>
</template>
```

### `MoviesView.vue`

This is the movie list from Lec 2, moved into its own view. The `movies` data, the form, and the toggle logic all come with it — nothing changes functionally.

```vue title="src/views/MoviesView.vue"
<template>
  <div class="max-w-4xl mx-auto px-8 py-8">
    <div class="flex justify-between items-center mb-6">
      <h1 class="text-2xl font-bold text-gray-800">Movies</h1>
      <button @click="showForm = !showForm"
              class="px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
        {{ showForm ? '✕ Cancel' : '+ Add Movie' }}
      </button>
    </div>

    <!-- Add movie form -->
    <div v-if="showForm" class="bg-white rounded-xl p-5 shadow-sm mb-6">
      <h2 class="font-semibold text-gray-700 mb-4">Add a Movie</h2>
      <div class="grid grid-cols-1 sm:grid-cols-2 gap-3">
        <input v-model="newMovie.title"          placeholder="Title"    class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model="newMovie.director"       placeholder="Director" class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model.number="newMovie.year"    placeholder="Year"     type="number" class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model="newMovie.genre"          placeholder="Genre"    class="border rounded-lg px-3 py-2 text-sm" />
        <input v-model.number="newMovie.rating"  placeholder="Rating"   type="number" step="0.1" class="border rounded-lg px-3 py-2 text-sm" />
      </div>
      <button @click="addMovie" class="mt-4 px-4 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium">
        Add to Watchlist
      </button>
    </div>

    <!-- Movie grid -->
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
        @toggle="toggleWatched(movie.id)"
      />
    </div>
  </div>
</template>

<script setup>
import { ref, reactive } from 'vue'
import MovieCard from '../components/MovieCard.vue'

const movies = ref([
  { id: 1, title: 'Dune',                    director: 'Denis Villeneuve', year: 2021, genre: 'Sci-Fi',   rating: 8.0, watched: true  },
  { id: 2, title: 'Mad Max: Fury Road',       director: 'George Miller',   year: 2015, genre: 'Action',   rating: 8.1, watched: false },
  { id: 3, title: 'The Shawshank Redemption', director: 'Frank Darabont',  year: 1994, genre: 'Drama',    rating: 9.3, watched: false },
  { id: 4, title: 'Parasite',                 director: 'Bong Joon-ho',    year: 2019, genre: 'Thriller', rating: 8.5, watched: false },
])

const showForm = ref(false)
const newMovie = reactive({ title: '', director: '', year: new Date().getFullYear(), genre: '', rating: 7.0 })

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

!!! example "🎯 Try it live"
    - Click **Home** in the navbar — `HomeView` renders, URL is `/`
    - Click **Movies** — `MoviesView` renders, URL is `/movies`
    - Open DevTools → Network tab → click between pages. **No new requests.** The browser is not going to the server. Vue Router is just swapping components.

---

➡️ *Two pages working. Now let's make each movie card link to its own detail page.*

---

## Phase 4 — Route Params: `MovieDetailView`



### What we want

When a user clicks on a movie card, they navigate to `/movies/1` (or `/movies/2`, etc.). The detail page reads the `1` from the URL, finds that movie in the data, and shows a full detail view.

### Step 1 — make the movie `id` appear in the URL

We already defined the route in Phase 2:

```js
{ path: '/movies/:id', component: MovieDetailView }
```

Now we need the card to link to it. Update `MovieCard.vue` — add a `<RouterLink>` wrapping the card title:

```vue title="src/components/MovieCard.vue — updated"
<template>
  <div class="bg-white rounded-xl p-5 shadow-sm">
    <div class="flex justify-between items-start mb-3">
      <GenreBadge :genre="genre" />
      <span v-if="watched" class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Watched</span>
      <span v-else          class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Unwatched</span>
    </div>

    <RouterLink :to="`/movies/${id}`" class="hover:text-indigo-600"> <!-- (1) -->
      <h2 class="text-lg font-semibold text-gray-800">{{ title }}</h2>
    </RouterLink>
    <p class="text-sm text-gray-500 mt-1">{{ year }} · {{ director }}</p>

    <div class="flex justify-between items-center mt-4">
      <span class="text-yellow-500 font-semibold">★ {{ rating }}</span>
      <button @click="emit('toggle')" class="text-sm text-indigo-600 hover:underline">
        {{ watched ? 'Mark unwatched' : 'Mark watched' }}
      </button>
    </div>
  </div>
</template>
```

1. `:to="\`/movies/${id}\`"` builds the URL dynamically using the `id` prop. Clicking the title navigates to `/movies/1`, `/movies/2`, etc. without a page reload.

### Step 2 — create `MovieDetailView.vue`

```vue title="src/views/MovieDetailView.vue"
<template>
  <div class="max-w-2xl mx-auto px-8 py-8">

    <!-- Back link -->
    <RouterLink to="/movies" class="text-sm text-indigo-600 hover:underline mb-6 inline-block">
      ← Back to Movies
    </RouterLink>

    <!-- Loading state — movie not found yet -->
    <div v-if="!movie" class="text-gray-400 mt-8 text-center">Movie not found.</div>

    <!-- Movie detail -->
    <div v-else class="bg-white rounded-xl p-8 shadow-sm">
      <div class="flex justify-between items-start mb-4">
        <GenreBadge :genre="movie.genre" />
        <span v-if="movie.watched" class="text-xs font-medium px-2 py-0.5 rounded-full bg-green-100 text-green-700">✓ Watched</span>
        <span v-else               class="text-xs font-medium px-2 py-0.5 rounded-full bg-gray-100 text-gray-500">Unwatched</span>
      </div>

      <h1 class="text-3xl font-bold text-gray-800 mb-1">{{ movie.title }}</h1>
      <p class="text-gray-500 mb-1">{{ movie.year }} · {{ movie.director }}</p>
      <p class="text-yellow-500 font-semibold text-lg mb-6">★ {{ movie.rating }}</p>

      <button @click="toggleWatched"
              class="px-5 py-2 bg-indigo-600 text-white rounded-lg text-sm font-medium hover:bg-indigo-700">
        {{ movie.watched ? 'Mark as Unwatched' : 'Mark as Watched' }}
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
const movies = [ // (3)
  { id: 1, title: 'Dune',                    director: 'Denis Villeneuve', year: 2021, genre: 'Sci-Fi',   rating: 8.0, watched: true  },
  { id: 2, title: 'Mad Max: Fury Road',       director: 'George Miller',   year: 2015, genre: 'Action',   rating: 8.1, watched: false },
  { id: 3, title: 'The Shawshank Redemption', director: 'Frank Darabont',  year: 1994, genre: 'Drama',    rating: 9.3, watched: false },
  { id: 4, title: 'Parasite',                 director: 'Bong Joon-ho',    year: 2019, genre: 'Thriller', rating: 8.5, watched: false },
]

const movie = computed(() => { // (4)
  const id = Number(route.params.id) // (5)
  return movies.find(m => m.id === id) ?? null
})

function toggleWatched() {
  if (movie.value) movie.value.watched = !movie.value.watched // (6)
}
</script>
```

1. `useRoute()` is a composable provided by Vue Router. It gives access to everything about the current URL — params, query strings, path, name.
2. `route` is now a reactive object. `route.params.id` gives us the `:id` part of the URL as a string.
3. The data is duplicated here for now — `MoviesView` and `MovieDetailView` each have their own copy. This is the problem Pinia solves in Lec 5. Point this out explicitly.
4. `computed` is the right choice — if the route changes (e.g. user navigates from `/movies/1` to `/movies/2`), the computed re-runs automatically.
5. `route.params.id` is always a **string** — even if the URL is `/movies/1`, the param is `"1"`. `Number()` converts it so the `===` comparison with `movie.id` (a number) works correctly.
6. This mutates the local copy — it won't affect `MoviesView`. Again, Pinia fixes this.

!!! example "🎯 Try it live"
    - Navigate to `/movies`
    - Click a movie title — URL changes to `/movies/1`
    - The detail page renders with that movie's data
    - Click ← Back to Movies — returns to the list
    - Manually type `/movies/99` in the URL bar — "Movie not found." appears

!!! warning "The data duplication problem"
    Right now `MoviesView` and `MovieDetailView` each hold their own copy of the `movies` array. Toggling watched on the detail page doesn't affect the list page — they're two separate arrays.

    **This is intentional.** It's the exact problem Pinia exists to solve. For now, note it and move on.

---

➡️ *Clicking links works. Sometimes you need to navigate from code — not from a click.*

---

## Phase 5 — Programmatic Navigation


### `useRouter` — navigate from code

`useRoute` reads the current URL. `useRouter` lets you *navigate* to a new one.

```js
import { useRouter } from 'vue-router' // (1)

const router = useRouter()

// Navigate to a path
router.push('/movies')

// Navigate to a named route with a param
router.push({ path: `/movies/${id}` })

// Navigate back
router.back()

// Replace current history entry (no back button)
router.replace('/login')
```

1. Two composables — easy to mix up. **`useRoute`** (no r at the end) = read the URL. **`useRouter`** (with r) = change the URL.

### Example — navigate after adding a movie

Update the `addMovie` function in `MoviesView.vue` to navigate to the new movie's detail page after it's added:

```js title="MoviesView.vue — updated addMovie"
import { useRouter } from 'vue-router' // (1)

const router = useRouter()

function addMovie() {
  if (!newMovie.title || !newMovie.genre) return

  const id = Date.now()
  movies.value.push({
    id,
    title: newMovie.title, director: newMovie.director,
    year: newMovie.year,   genre: newMovie.genre, rating: newMovie.rating,
    watched: false,
  })

  // Reset form
  newMovie.title = ''; newMovie.director = ''
  newMovie.year = new Date().getFullYear(); newMovie.genre = ''; newMovie.rating = 7.0
  showForm.value = false

  router.push(`/movies/${id}`) // (2)
}
```

1. Import `useRouter` alongside the existing `useRoute` import (or just add it here if not already imported).
2. After adding the movie, navigate straight to its detail page. The user sees their new entry immediately.

!!! example "🎯 Try it live"
    Open the add movie form, fill it in, and click Add. Instead of just appearing in the grid, the app navigates directly to the new movie's detail page. The URL becomes `/movies/<timestamp>`.

---

➡️ *The last piece — what happens when a URL doesn't match anything valid?*

---

## Phase 6 — Navigation Guards



### What is a navigation guard?

A function that runs **before** a route loads. It can:

- ✅ Allow the navigation (return nothing or `true`)
- ↩️ Redirect to a different route (return a path string)
- ❌ Cancel the navigation (return `false`)

### `beforeEnter` — guard a single route

Add a `beforeEnter` guard to the movie detail route in `src/router/index.js`:

```js title="src/router/index.js — updated"
import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import MoviesView from '../views/MoviesView.vue'
import MovieDetailView from '../views/MovieDetailView.vue'

const movies = [ // (1)
  { id: 1 }, { id: 2 }, { id: 3 }, { id: 4 },
]

const routes = [
  { path: '/',       component: HomeView },
  { path: '/movies', component: MoviesView },
  {
    path: '/movies/:id',
    component: MovieDetailView,
    beforeEnter: (to) => { // (2)
      const id = Number(to.params.id) // (3)
      const exists = movies.some(m => m.id === id) // (4)
      if (!exists) return '/movies' // (5)
    },
  },
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router
```

1. The guard needs to know which IDs are valid. In a real app this would come from an API or a Pinia store — for now we keep a minimal list here.
2. `beforeEnter` receives `to` (the route being navigated to) and optionally `from`. It runs before the component mounts.
3. Extract and convert the `:id` param — same `Number()` trick as in the view.
4. `Array.some()` returns `true` if any element matches the condition.
5. Returning a string path redirects the user. They never see `MovieDetailView` — they land on `/movies` instead.

!!! example "🎯 Try it live"
    - Type `/movies/999` in the URL bar — you land on `/movies` instead of "Movie not found"
    - Type `/movies/2` — the detail page loads normally

### `router.beforeEach` — global guard (preview)

For auth checks you often want to protect many routes at once. Add a global guard in `router/index.js` after `createRouter`:

```js
router.beforeEach((to, from) => { // (1)
  const isLoggedIn = false // replace with real auth check later

  if (to.path !== '/' && !isLoggedIn) { // (2)
    return '/' // redirect to home if not logged in
  }
})
```

1. `beforeEach` runs before **every** navigation in the app. It's the right place for global auth logic.
2. This says: "if the user is going anywhere other than home, and they're not logged in, send them home." In a real app, you'd check a Pinia store or a cookie here.


---

## Phase 7 — Pitfalls & Wrap-up


### ❌ Forgetting that route params are strings

```js
const id = route.params.id         // ❌ "1" — a string
const movie = movies.find(m => m.id === id)  // ❌ 1 !== "1" — finds nothing

const id = Number(route.params.id) // ✅ 1 — a number
const movie = movies.find(m => m.id === id)  // ✅ works
```

### ❌ Using `<a>` instead of `<RouterLink>`

```vue
<a href="/movies">Movies</a>          <!-- ❌ full page reload — Vue state resets -->
<RouterLink to="/movies">Movies</RouterLink> <!-- ✅ client-side navigation -->
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

**What we added to the Watchlist:**

| Phase | What changed |
|---|---|
| 2 — Install & configure | `vue-router` installed, `router/index.js` created, `<RouterView>` in `App.vue` |
| 3 — Home + Movies pages | Two views, `<RouterLink>` navbar, URL-driven rendering |
| 4 — Detail page | `/movies/:id` param, `useRoute()`, `computed` lookup |
| 5 — Programmatic nav | `useRouter()`, `router.push()` after form submit |
| 6 — Navigation guard | `beforeEnter` redirects invalid IDs, `beforeEach` preview |

**The mental model:**

```
URL bar:  /movies/2
              │
              ▼
        router/index.js
        matches: /movies/:id
        param:   id = "2"
              │
              ▼
        MovieDetailView.vue
        useRoute().params.id → "2" → Number() → 2
        movies.find(m => m.id === 2) → { title: "Mad Max...", ... }
              │
              ▼
        Page renders with that movie's data
```

**The data problem we deliberately left unsolved:**

Toggling watched on the detail page doesn't affect the list page — they have separate data copies. This is what Pinia (Lec 5) solves: one shared store, any view can read from it or update it.

### Coming up next

| Lecture | Topic |
|---|---|
| **Lec 4** | Lifecycle hooks · `watch` · Fetching real data from an API |
| Lec 5 | Pinia — one shared `movies` store, fixes the data duplication |
| Lec 6 | Composables — extracting reusable logic |

---

!!! tip "Practice before Lec 4"
    1. **404 page** — add a `NotFoundView.vue` and a catch-all route `{ path: '/:pathMatch(.*)*', component: NotFoundView }`. It should show a friendly message and a link back home.
    2. **Active link styling** — Vue Router automatically adds a class `router-link-active` to the active `<RouterLink>`. Style it in your navbar so the current page is visually highlighted.
    3. **Query string filter** — on the `/movies` page, make the All / Watched / Unwatched filter buttons update the URL to `/movies?filter=watched`. Read it back with `route.query.filter` to apply the filter on load.

---

*COSC2956 Internet Tools — End of Lecture 3*