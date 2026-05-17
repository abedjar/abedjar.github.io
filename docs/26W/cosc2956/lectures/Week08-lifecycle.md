---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Lecture: Vue Lifecycle Hooks

---

!!! info "Section at a Glance"
    **Assumed knowledge:** Previous lecture — Vue basics, `ref()`, `reactive()`, components
    
    | Hook | When it fires |
    |---|---|
    | `onBeforeMount` | Just before Vue inserts the component into the DOM |
    | `onMounted` | Component is in the DOM — safe to access elements |
    | `onBeforeUpdate` | Just before Vue patches the DOM after a state change |
    | `onUpdated` | DOM has been patched — reflects latest state |
    | `onBeforeUnmount` | Just before Vue tears the component down |
    | `onUnmounted` | Component is gone — clean up side effects here |

---

## What is a Lifecycle Hook?

??? note "🗣️ Talking Points"
    - Ask: *"When you set up a `setInterval` in a component, where do you put it? And where do you clear it?"* Students who've tried this in vanilla JS know the problem — there's no natural place. Lifecycle hooks solve exactly this.
    - Analogy: a component's lifecycle is like a person's — born, lives, reacts to change, dies. Hooks let you run code at each of those moments.
    - Stress that these are **registration calls**, not overrides. You're saying "when this moment happens, also run this function."

Every Vue component goes through a predictable sequence of stages:

1. **Created** — the component's reactive state and logic are initialised
2. **Mounted** — the component's HTML is inserted into the real DOM
3. **Updated** — reactive state changed, DOM has been patched to match
4. **Unmounted** — the component has been removed from the DOM

**Lifecycle hooks** are functions you register to run code at a specific stage. In the Composition API they are imported from `vue` and called inside `<script setup>`.

```javascript
import { onMounted, onUnmounted } from 'vue'

onMounted(() => {
  console.log('component is now in the DOM')
})

onUnmounted(() => {
  console.log('component has been removed')
})
```

!!! note "Registration, not override"
    You are *registering* a callback — not overriding a method. You can call `onMounted()` multiple times in the same component and all callbacks will run. This is different from class-based lifecycle methods in Angular or older Vue Options API style.

---

## The Lifecycle at a Glance

```
  createApp() called
        │
        ▼
  ┌─────────────┐
  │   CREATED   │  ← reactive state, computed, watchers ready
  └─────────────┘       (no hooks needed here in most cases)
        │
        │  onBeforeMount ← last chance before DOM exists
        ▼
  ┌─────────────┐
  │   MOUNTED   │  ← component is in the real DOM
  └─────────────┘
        │  onMounted ✅ safe to access DOM, start timers, fetch data
        │
        │   (state changes)
        │
        │  onBeforeUpdate ← DOM about to be patched
        ▼
  ┌─────────────┐
  │   UPDATED   │  ← DOM reflects latest state
  └─────────────┘
        │  onUpdated ← DOM is current again
        │
        │   (component removed, e.g. v-if becomes false)
        │
        │  onBeforeUnmount ← component still exists
        ▼
  ┌─────────────┐
  │  UNMOUNTED  │  ← component torn down
  └─────────────┘
        │  onUnmounted ✅ clean up timers, listeners, subscriptions
```

---

## `onMounted` — the most used hook

### When to use it

- Access a DOM element directly (via a template ref)
- Start a timer or interval
- Fetch initial data from an API
- Initialise a third-party library that needs a real DOM node (charts, maps, etc.)

### Example 1 — Auto-focus an input

```vue
<template>
  <input ref="searchInput" placeholder="Search..." />
</template>

<script setup>
import { ref, onMounted } from 'vue'

const searchInput = ref(null)

onMounted(() => {
  searchInput.value.focus()  // safe — the <input> is in the DOM now
})
</script>
```

!!! warning "Why not just call .focus() directly?"
    In `<script setup>`, code runs during component initialisation — *before* Vue has inserted the template into the DOM. `searchInput.value` would be `null` at that point. `onMounted` guarantees the DOM exists.

---

### Example 2 — Fetch data on load

```vue
<template>
  <p v-if="loading">Loading...</p>
  <ul v-else>
    <li v-for="post in posts" :key="post.id">{{ post.title }}</li>
  </ul>
</template>

<script setup>
import { ref, onMounted } from 'vue'

const posts = ref([])
const loading = ref(true)

onMounted(async () => {
  const res = await fetch('https://jsonplaceholder.typicode.com/posts?_limit=5')
  posts.value = await res.json()
  loading.value = false
})
</script>
```

!!! example "🎯 Demo — onMounted fetch"
    === "Scaffold (type this first)"
        ```vue
        <template>
          <p>Loading...</p>
        </template>

        <script setup>
        import { onMounted } from 'vue'

        onMounted(() => {
          console.log('mounted!')
        })
        </script>
        ```
    === "Add fetch (step 2)"
        ```vue
        <template>
          <p v-if="loading">Loading...</p>
          <ul v-else>
            <li v-for="post in posts" :key="post.id">{{ post.title }}</li>
          </ul>
        </template>

        <script setup>
        import { ref, onMounted } from 'vue'

        const posts = ref([])
        const loading = ref(true)

        onMounted(async () => {
          const res = await fetch('https://jsonplaceholder.typicode.com/posts?_limit=5')
          posts.value = await res.json()
          loading.value = false
        })
        </script>
        ```
    Open Network tab in DevTools. Show the fetch firing *after* mount, and `loading` flipping to `false` once data arrives.

---

## `onUnmounted` — cleaning up side effects

### When to use it

- Clear `setInterval` / `setTimeout`
- Remove manually added event listeners
- Cancel pending fetch requests
- Disconnect a WebSocket

### Example — interval that cleans up after itself

```vue
<template>
  <p>Elapsed: {{ seconds }}s</p>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from 'vue'

const seconds = ref(0)
let intervalId = null

onMounted(() => {
  intervalId = setInterval(() => {
    seconds.value++
  }, 1000)
})

onUnmounted(() => {
  clearInterval(intervalId)  // prevents memory leak when component is removed
})
</script>
```

!!! warning "Always pair onMounted setup with onUnmounted teardown"
    If you start an interval or add an event listener in `onMounted` and don't clean it up in `onUnmounted`, it keeps running in the background even after the component is gone. In a SPA where components mount and unmount frequently, this compounds into a memory leak.

!!! example "🎯 Demo — the leak vs the fix"
    === "Scaffold — leaking version"
        ```vue
        <!-- Parent that toggles the timer component -->
        <template>
          <button @click="show = !show">Toggle Timer</button>
          <Timer v-if="show" />
        </template>

        <script setup>
        import { ref } from 'vue'
        import Timer from './components/Timer.vue'
        const show = ref(true)
        </script>
        ```

        ```vue
        <!-- components/Timer.vue — leaking -->
        <template><p>{{ seconds }}s</p></template>

        <script setup>
        import { ref, onMounted } from 'vue'
        const seconds = ref(0)

        onMounted(() => {
          setInterval(() => {
            seconds.value++
            console.log('tick', seconds.value) // still logs after unmount!
          }, 1000)
        })
        </script>
        ```
    === "Fixed version (step 2)"
        ```vue
        <!-- components/Timer.vue — fixed -->
        <template><p>{{ seconds }}s</p></template>

        <script setup>
        import { ref, onMounted, onUnmounted } from 'vue'
        const seconds = ref(0)
        let intervalId = null

        onMounted(() => {
          intervalId = setInterval(() => {
            seconds.value++
            console.log('tick', seconds.value)
          }, 1000)
        })

        onUnmounted(() => {
          clearInterval(intervalId)  // console.log stops when component unmounts
        })
        </script>
        ```
    Toggle the component off. In the leaking version, console.log keeps firing. In the fixed version, it stops. Open the Memory tab to show the difference at scale.

---

## `onUpdated` — reacting after DOM changes

### When to use it

`onUpdated` fires after every reactive state change causes a DOM patch. Use it when you need to interact with the DOM *after* it reflects new data — for example, scrolling a list to the bottom after a new item is added.

!!! warning "onUpdated fires for every update"
    If you update state *inside* `onUpdated`, you must guard against infinite loops — the state change will trigger another update, which triggers `onUpdated` again.

### Example — scroll a chat window to the latest message

```vue
<template>
  <div ref="chatWindow" class="chat">
    <p v-for="msg in messages" :key="msg.id">{{ msg.text }}</p>
  </div>
  <button @click="addMessage">Send message</button>
</template>

<script setup>
import { ref, onUpdated } from 'vue'

const chatWindow = ref(null)
const messages = ref([
  { id: 1, text: 'Hello!' },
])
let nextId = 2

function addMessage() {
  messages.value.push({ id: nextId++, text: `Message ${nextId}` })
}

onUpdated(() => {
  // DOM has been patched — the new <p> exists now
  chatWindow.value.scrollTop = chatWindow.value.scrollHeight
})
</script>

<style scoped>
.chat { height: 150px; overflow-y: auto; border: 1px solid #ccc; padding: 0.5rem; }
</style>
```

!!! tip "Consider watchEffect as an alternative"
    For many `onUpdated` use cases, `watchEffect` or `watch` is a cleaner fit — you can react to a *specific* piece of state changing rather than any DOM update. Use `onUpdated` when you genuinely need to read or manipulate the DOM after *any* re-render.

---

## `onBeforeUnmount` — last actions before teardown

Fires while the component is still fully functional — its DOM and state still exist. Useful when you need to save state or send a final request before the component disappears.

### Example — save draft on navigate away

```vue
<script setup>
import { ref, onBeforeUnmount } from 'vue'

const draft = ref('')

onBeforeUnmount(() => {
  if (draft.value.trim()) {
    localStorage.setItem('saved-draft', draft.value)
    console.log('Draft saved before unmount')
  }
})
</script>

<template>
  <textarea v-model="draft" placeholder="Write something..."></textarea>
</template>
```

---

## Quick Reference

| Hook | DOM available? | Common use |
|---|---|---|
| `onBeforeMount` | ❌ No | Rarely needed — last setup before render |
| `onMounted` | ✅ Yes | Fetch data · Focus elements · Init libraries · Start timers |
| `onBeforeUpdate` | ✅ Yes (old state) | Capture scroll position before a re-render |
| `onUpdated` | ✅ Yes (new state) | Scroll to bottom · Read updated DOM dimensions |
| `onBeforeUnmount` | ✅ Yes | Save state · Send analytics · Final API call |
| `onUnmounted` | ❌ No | Clear timers · Remove listeners · Cancel requests |

!!! question "Reflection"
    A component fetches a user profile from an API and starts a WebSocket connection for live updates. Which lifecycle hooks would you use, and why?

---

## Putting it together — a self-contained example

A component that: fetches data on mount, tracks how many times it re-renders, and cleans up on unmount.

```vue
<template>
  <div>
    <p v-if="loading">Fetching user...</p>
    <div v-else>
      <h2>{{ user.name }}</h2>
      <p>{{ user.email }}</p>
      <button @click="user.name += '!'">Poke</button>
      <p class="meta">Re-renders: {{ renderCount }}</p>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, onUpdated, onUnmounted } from 'vue'

const user    = ref(null)
const loading = ref(true)
const renderCount = ref(0)

onMounted(async () => {
  const res = await fetch('https://jsonplaceholder.typicode.com/users/1')
  user.value  = await res.json()
  loading.value = false
  console.log('onMounted — data loaded')
})

onUpdated(() => {
  renderCount.value++  // ⚠️ this itself causes an update — harmless here but be aware
  console.log('onUpdated — DOM patched')
})

onUnmounted(() => {
  console.log('onUnmounted — goodbye')
})
</script>

<style scoped>
.meta { font-size: 0.8rem; color: #999; margin-top: 1rem; }
</style>
```

---

*COSC2956 Internet Tools — Vue Lifecycle Hooks*