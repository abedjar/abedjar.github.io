---
search:
  exclude: true
---

### `v-model` — Two-way binding for form inputs

```vue
<template>
  <input v-model="username" placeholder="Enter name">
  <p>Hello, {{ username }}</p>
</template>

<script setup>
import { ref } from 'vue'
const username = ref('')
</script>
```

`v-model` is shorthand for `:value="username" @input="username = $event.target.value"`.

**Vanilla equivalent:**
```javascript
input.addEventListener('input', () => {
  display.textContent = `Hello, ${input.value}`
})
```

Another example for other inputs:
```vue
<template>
  <div>
    <!-- Text -->
    <input v-model="username" placeholder="Enter name" />
    <p>Hello, {{ username }}</p>

    <!-- Textarea -->
    <textarea v-model="bio" placeholder="Write a short bio"></textarea>
    <p>Bio: {{ bio }}</p>

    <!-- Number -->
    <input type="number" v-model.number="age" />
    <p>Age: {{ age }}</p>

    <!-- Checkbox (single boolean) -->
    <label>
      <input type="checkbox" v-model="isSubscribed" />
      Subscribe to newsletter
    </label>
    <p>Subscribed: {{ isSubscribed }}</p>

    <!-- Checkbox (multiple values) -->
    <div>
      <label>
        <input type="checkbox" value="Vue" v-model="frameworks" />
        Vue
      </label>
      <label>
        <input type="checkbox" value="React" v-model="frameworks" />
        React
      </label>
      <label>
        <input type="checkbox" value="Svelte" v-model="frameworks" />
        Svelte
      </label>
    </div>
    <p>Selected frameworks: {{ frameworks }}</p>

    <!-- Radio -->
    <div>
      <label>
        <input type="radio" value="light" v-model="theme" />
        Light
      </label>
      <label>
        <input type="radio" value="dark" v-model="theme" />
        Dark
      </label>
    </div>
    <p>Theme: {{ theme }}</p>

    <!-- Select (single) -->
    <select v-model="country">
      <option disabled value="">Select country</option>
      <option>USA</option>
      <option>Canada</option>
      <option>Germany</option>
    </select>
    <p>Country: {{ country }}</p>

    <!-- Select (multiple) -->
    <select v-model="skills" multiple>
      <option>JavaScript</option>
      <option>Python</option>
      <option>Rust</option>
    </select>
    <p>Skills: {{ skills }}</p>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const username = ref('')
const bio = ref('')
const age = ref(0)
const isSubscribed = ref(false)
const frameworks = ref([])
const theme = ref('light')
const country = ref('')
const skills = ref([])
</script>

<style scoped>
div {
  margin-bottom: 1rem;
}
</style>
```

### `v-if` / `v-else` — Conditional rendering
```markdown
`v-if` is a directive used to conditionally render a block. The block will only be rendered if the directive's expression returns a truthy value.
```

```vue
<div v-if="role === 'admin'">Admin panel</div>
<div v-else-if="role === 'editor'">Editor tools</div>
<div v-else>Read-only view</div>
```

Example:
```vue
<template>
  <div class="container">
    <h2>User Role Demo</h2>

    <select v-model="role">
      <option value="admin">Admin</option>
      <option value="editor">Editor</option>
      <option value="viewer">Viewer</option>
    </select>

    <div class="panel">
      <div v-if="role === 'admin'" class="admin">
        Admin panel
      </div>

      <div v-else-if="role === 'editor'" class="editor">
        Editor tools
      </div>

      <div v-else class="viewer">
        Read-only view
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const role = ref('viewer')
</script>

<style scoped>
.container {
  max-width: 400px;
  margin: 2rem auto;
  padding: 1.5rem;
  font-family: system-ui, -apple-system, sans-serif;
  background: #f9fafb;
  border-radius: 8px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
}

select {
  width: 100%;
  padding: 0.5rem;
  margin-bottom: 1.2rem;
  border-radius: 6px;
  border: 1px solid #ccc;
}

.panel {
  padding: 1rem;
  border-radius: 6px;
  font-weight: 500;
}

.admin {
  background-color: #fee2e2;
  color: #991b1b;
}

.editor {
  background-color: #fef3c7;
  color: #92400e;
}

.viewer {
  background-color: #e0f2fe;
  color: #075985;
}
</style>
```
`v-if="false"` **removes** the element from the DOM entirely (not just hidden).


### `v-show` — Show or hide an element

`v-show` is a directive used to show or hide an element. The element will be shown if the directive's expression returns a truthy value, and hidden if it returns a falsy value.

```vue
<template>
  <div class="container">
    <h2>Visibility Toggle Demo</h2>

    <button @click="toggleVisibility">
      {{ isVisible ? 'Hide' : 'Show' }}
    </button>

    <div v-show="isVisible" class="box">
      This box is shown or hidden using v-show
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const isVisible = ref(true)

function toggleVisibility() {
  isVisible.value = !isVisible.value
}
</script>

<style scoped>
.container {
  max-width: 400px;
  margin: 2rem auto;
  padding: 1.5rem;
  font-family: system-ui, -apple-system, sans-serif;
  background: #f9fafb;
  border-radius: 8px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
}

button {
  padding: 0.5rem 1rem;
  border-radius: 6px;
  border: 1px solid #ccc;
  cursor: pointer;
}

.box {
  margin-top: 1.2rem;
  padding: 1rem;
  background-color: #e0f2fe;
  border-radius: 6px;
}
</style>
```


!!! tip "v-if vs v-show"
    `v-show` toggles `display: none` but keeps the element in the DOM.

    - Use `v-show` for frequent toggles (cheaper per-toggle)
    - Use `v-if` when the block is expensive to render and rarely shown

### `v-for` — List rendering

```vue
<template>
  <ul>
    <li v-for="item in items" :key="item.id">
      {{ item.name }}
    </li>
  </ul>
</template>

<script setup>
import { ref } from 'vue'
const items = ref([
  { id: 1, name: 'Apples' },
  { id: 2, name: 'Bread' },
])
</script>
```
Example:
```vue
<template>
  <div class="container">
    <h3>Countries List</h3>

    <div class="row">
      <input v-model="newCountry" @keyup.enter="addCountry" placeholder="Add country" />
      <button @click="addCountry">Add</button>
    </div>

    <ul>
      <li v-for="country in countries" :key="country.id">
        {{ country.text }}
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const newCountry = ref('')

const countries = ref([
  { id: 1, text: 'France' },
  { id: 2, text: 'Italy' }
])

function addCountry() {
  const text = newCountry.value.trim()
  if (!text) return

  countries.value.push({
    id: Date.now(),
    text
  })

  newCountry.value = ''
}
</script>

<style scoped>
.container {
  max-width: 400px;
  margin: 2rem auto;
  padding: 1rem;
  font-family: system-ui, sans-serif;
}

.row {
  display: flex;
  gap: 0.5rem;
  margin-bottom: 1rem;
}

input {
  flex: 1;
  padding: 0.4rem;
  border: 1px solid #ccc;
  border-radius: 4px;
}

button {
  padding: 0.4rem 0.6rem;
  border: none;
  background: #6366f1;
  color: white;
  border-radius: 4px;
  cursor: pointer;
}

ul {
  list-style: none;
  padding: 0;
}

li {
  padding: 0.4rem 0;
  border-bottom: 1px solid #eee;
}
</style>
```

!!! warning "Always use :key — and never use the array index"
    `:key` gives Vue a stable identifier for each element so it can diff the list efficiently.

    ```vue
    <!-- ❌ Breaks when items are reordered or inserted -->
    <li v-for="(item, index) in items" :key="index">

    <!-- ✅ Use a stable unique ID from your data -->
    <li v-for="item in items" :key="item.id">
    ```

### `v-on` — Event handling
`v-on` is a directive used to listen to DOM events and run JavaScript code when they occur. 

```vue
<!-- Long form -->
<button v-on:click="handleClick">Click</button>

<!-- Shorthand (@ prefix) — use this in practice -->
<button @click="handleClick">Click</button>
<button @click="count++">Inline expression</button>

<!-- Event modifiers -->
<form @submit.prevent="handleSubmit"> ... </form>
```

**Common event modifiers:**

| Modifier | Equivalent |
|---|---|
| `.prevent` | `event.preventDefault()` |
| `.stop` | `event.stopPropagation()` |
| `.once` | listener removed after first fire |
| `.enter` (key modifier) | fires only on Enter key |

!!! example "🎯 Demo — Directives playground"
    Add to `App.vue` to demonstrate each directive live:
    ```vue
    <template>
      <!-- v-model -->
      <input v-model="name" placeholder="Your name">
      <p v-if="name">Hello, {{ name }}!</p>

      <!-- v-for -->
      <ul>
        <li v-for="lang in languages" :key="lang">{{ lang }}</li>
      </ul>
    </template>

    <script setup>
    import { ref } from 'vue'
    const name = ref('')
    const languages = ref(['JavaScript', 'Python', 'Vue'])
    </script>
    ```

---

➡️ *Next: methods and computed properties — where your application logic lives.*

---

## 5. Methods & Computed Properties

??? note "🗣️ Talking Points"
    - Methods are just regular functions. No magic. Stress this — students coming from Options API tutorials expect a `methods: {}` object.
    - The caching point is the key insight for computed. Ask: "If filtering 10,000 items on every render sounds bad, what would you want instead?"

### Methods

In `<script setup>`, methods are just **regular functions**:

```vue
<script setup>
import { ref } from 'vue'

const count = ref(0)

function increment() { count.value++ }
function decrement() { if (count.value > 0) count.value-- }
function reset()     { count.value = 0 }
</script>

<template>
  <p>{{ count }}</p>
  <button @click="increment">+</button>
  <button @click="decrement">-</button>
  <button @click="reset">Reset</button>
</template>
```

### Computed Properties

A **computed property** is a reactive value *derived* from other reactive state. It **caches its result** and only recalculates when its dependencies change.

```vue
<script setup>
import { ref, computed } from 'vue'

const query = ref('')
const products = ref([
  { id: 1, name: 'Keyboard' },
  { id: 2, name: 'Mouse' },
  { id: 3, name: 'Monitor' },
  { id: 4, name: 'Headphones' },
  { id: 5, name: 'Microphone' },
  { id: 6, name: 'Webcam' },
  { id: 7, name: 'Laptop' },
  { id: 8, name: 'Phone' },
  { id: 9, name: 'Tablet' },
  { id: 10, name: 'Smartwatch' },
])

// Only recalculates when query or products change
const filtered = computed(() =>
  products.value.filter(p =>
    p.name.toLowerCase().includes(query.value.toLowerCase())
  )
)
</script>

<template>
  <input v-model="query" placeholder="Search...">
  <ul>
    <li v-for="p in filtered" :key="p.id">{{ p.name }}</li>
  </ul>
</template>
```

**Computed vs Method — the key difference:**

| | Computed | Method called in template |
|---|---|---|
| Result cached? | ✅ Yes | ❌ No |
| Re-runs when? | Dependencies change | Every re-render |
| Use for | Derived/filtered data | Actions, side effects |

!!! question "Reflection"
    If you called `getFiltered()` as a method in the template, and some *other* unrelated state changed causing a re-render, the filter would re-run over 10,000 items unnecessarily. How often does this matter in practice?

---

➡️ *Next: a quick introduction to components — the building block of every Vue app.*

---

## 6. Introduction to Components

??? note "🗣️ Talking Points"
    - Keep this short — components get a full lecture later. The goal is just to show the props-down / events-up pattern so students understand the mini-project's structure.
    - Draw the tree on the whiteboard: App → TaskList → TaskItem.

### What is a component?

A self-contained unit of UI in its own `.vue` file.

- The main component is `App.vue`. It is the root component of the application and is the entry point of the application.
- Other components are imported as children and used in the `App.vue` file.
- Components can be nested inside other components to create a tree of components.
- All components are placed in the `src/components` directory.

### Props & Events

- **Props** — data passed *down* from parent to child (read-only in the child)
- **Events** — signals emitted *up* from child to parent
- This creates **unidirectional data flow**: data flows down, signals flow up.

### Simple example

```vue title="Badge.vue"
<!-- src/components/Badge.vue -->
<template>
  <span class="badge" :class="type">{{ label }}</span>
</template>

<script setup>
defineProps({
  label: { type: String, required: true },
  type:  { type: String, default: 'info' }  // 'info' | 'warning' | 'error'
})
</script>

<style scoped>
.badge { padding: 0.2rem 0.6rem; border-radius: 999px; font-size: 0.8rem; }
.info    { background: #dbeafe; }
.warning { background: #fef9c3; }
.error   { background: #fee2e2; }
</style>
```

```vue title="App.vue"
<!-- App.vue — using the component -->
<script setup>
import Badge from './components/Badge.vue'
</script>

<template>
  <Badge label="New" type="info" />
  <Badge label="Urgent" type="warning" />
</template>
```

Imported components in `<script setup>` are **automatically available** in the template — no registration needed.

---

➡️ *Now let's put everything together in a live demo.*

---

## 7. Live Demo — Task List Application

??? note "🗣️ Talking Points"
    - Build this incrementally using the stages below. Don't paste the final version straight away.
    - Stage 1 alone demonstrates reactivity and v-model. Pause and explain before continuing.
    - Stage 3 is where computed properties become obviously useful — make the connection explicit.
    - If time is short, skip Stage 4 (filtering) and do it as a class exercise.

!!! example "🎯 Demo — Setup"
    Start with a clean `App.vue`:
    ```bash
    # In your my-vue-app project
    # Open src/App.vue and replace everything
    ```

---

### Stage 1 — Add tasks

```vue title="App.vue"
<template>
  <div class="app">
    <h1>Task List</h1>

    <div class="add-task">
      <input type="text" v-model="newTaskText" @keyup.enter="addTask" placeholder="New task..." />
      <button @click="addTask">Add</button>
    </div>

    <ul>
      <li v-for="task in tasks" :key="task.id">
        {{ task.text }}
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const newTaskText = ref('')
const tasks = ref([])
let nextId = 1

function addTask() {
  const text = newTaskText.value.trim()
  if (!text) return
  tasks.value.push({ id: nextId++, text, completed: false })
  newTaskText.value = ''
}

</script>

<style scoped>
.app {
  max-width: 500px;
  margin: 60px auto;
  padding: 24px;
  border-radius: 12px;
  background: #f9fafb;
  box-shadow: 0 10px 25px rgba(0, 0, 0, 0.05);
  font-family: system-ui, -apple-system, BlinkMacSystemFont, sans-serif;
}

h1 {
  margin-bottom: 20px;
  text-align: center;
  font-weight: 600;
  color: #111827;
}

.add-task {
  display: flex;
  gap: 10px;
  margin-bottom: 20px;
}

input[type="text"] {
  flex: 1;
  padding: 10px 12px;
  border-radius: 8px;
  border: 1px solid #d1d5db;
  font-size: 14px;
  transition: border 0.2s ease;
}

input:focus {
  outline: none;
  border-color: #6366f1;
}

button {
  padding: 10px 16px;
  border: none;
  border-radius: 8px;
  background: #6366f1;
  color: white;
  font-weight: 500;
  cursor: pointer;
  transition: background 0.2s ease, transform 0.05s ease;
}

button:hover {
  background: #4f46e5;
}

button:active {
  transform: scale(0.97);
}

ul {
  list-style: none;
  padding: 0;
  margin: 0;
}


li {
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 12px;

  padding: 10px 14px;
  margin-bottom: 8px;

  background: white;
  border: 1px solid #e5e7eb;
  border-radius: 10px;

  transition: all 0.2s ease;
}

li:hover {
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.05);
  transform: translateY(-1px);
}
</style>
```

**Notice:**

- `v-model` keeps `newTaskText` in sync with the input
- `@keyup.enter` lets users press Enter to add
- `tasks.value.push()` triggers a re-render automatically — no manual DOM code

---

### Stage 2 — Complete and delete tasks

Replace the template's `<li>`:

```vue
 <li v-for="task in tasks" :key="task.id" :class="{ done: task.completed }">
    <input type="checkbox" :checked="task.completed" @change="toggleTask(task.id)" />
    <span>{{ task.text }}</span>
    <button @click="deleteTask(task.id)">✕</button>
</li>
```

Add to `<script setup>`:

```javascript
function toggleTask(id) {
  const task = tasks.value.find(t => t.id === id)
  if (task) task.completed = !task.completed
}

function deleteTask(id) {
  tasks.value = tasks.value.filter(t => t.id !== id)
}
```

Add to `<style scoped>`:

```css
.done span { text-decoration: line-through; color: #999; }
```

---

### Stage 3 — Computed summary

Add to `<script setup>`:

```javascript
import { ref, computed } from 'vue'

const remaining = computed(() => tasks.value.filter(t => !t.completed).length)
```

Add to template:

```vue
<p>{{ remaining }} of {{ tasks.length }} tasks remaining</p>
```

**Point out:** `remaining` updates the moment any task's `completed` flag changes. Zero manual calls.

---

### Stage 4 — Filter by status

Add to `<script setup>`:

```javascript
const activeFilter = ref('all')

const filteredTasks = computed(() => {
  if (activeFilter.value === 'active')    return tasks.value.filter(t => !t.completed)
  if (activeFilter.value === 'completed') return tasks.value.filter(t => t.completed)
  return tasks.value
})
```

Add filter buttons to template (replace `tasks` with `filteredTasks` in `v-for`):

```vue
<div class="filters">
    <button @click="activeFilter = 'all'">All</button>
    <button @click="activeFilter = 'active'">Active</button>
    <button @click="activeFilter = 'completed'">Completed</button>
</div>
```

Change the `v-for` to use `filteredTasks`:
```vue
<ul>
  <li v-for="task in filteredTasks" :key="task.id" :class="{ done: task.completed }">
  ...
```


---

➡️ *Finally — the mistakes students most commonly make.*

---

## 8. Common Pitfalls

??? note "🗣️ Talking Points"
    - These come directly from the most common student support questions. Worth spending 3–4 minutes on.
    - The direct DOM manipulation one tends to resonate — ask "so what should you use instead?"

### ❌ Direct DOM manipulation inside components

```javascript
// Don't do this inside Vue
document.querySelector('.task-input').focus()
```

This bypasses Vue's abstraction and will break when the DOM structure changes. Use **template refs** instead:

```vue
<input ref="inputEl" />

<script setup>
import { ref, onMounted } from 'vue'
const inputEl = ref(null)
onMounted(() => inputEl.value.focus())
</script>
```

### ❌ Forgetting `.value`

```javascript
const count = ref(0)
count++          // ❌ mutates the ref object itself
count.value++    // ✅
```

### ❌ Destructuring a `reactive` object

```javascript
const state = reactive({ count: 0 })
const { count } = state   // ❌ count is now a plain number — not reactive
state.count++             // template won't update via `count`
```

### ❌ Using array index as `:key`

```vue
<!-- ❌ Causes rendering bugs when list is reordered or items inserted -->
<li v-for="(item, i) in items" :key="i">
```

### ❌ Mutating props in a child component

```javascript
// Inside a child — never do this
props.title = 'New value'                    // ❌
emit('update:title', 'New value')            // ✅ emit an event instead
```

---

## 9. Summary

### What we covered today

- **Why frameworks** — manual DOM sync doesn't scale; declarative rendering solves this
- **Vite** — modern build tool that serves ES modules natively during development
- **Reactivity** — `ref()` and `reactive()` create observable state; Vue's `Proxy`-based system updates the DOM automatically
- **Template syntax** — `{{ }}` interpolation, directives (`v-bind`, `v-model`, `v-if`, `v-for`, `v-on`)
- **Computed properties** — cached derived state; recalculates only when dependencies change
- **Components** — self-contained UI units; props flow down, events flow up

### Vue in the frontend ecosystem

```
index.html  →  createApp(App).mount('#app')
                    │
              Root Component (App.vue)
                    │
          ┌─────────┴──────────┐
     Child Components      Reactive State
     (props ↓, events ↑)   (ref, reactive, computed)
                    │
              Template → Virtual DOM diff → Real DOM
```
