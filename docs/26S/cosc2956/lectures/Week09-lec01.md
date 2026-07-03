---
search:
  exclude: true
---

# COSC2956 – Internet Tools
##  Components in Depth


---

## 1. Recap & What's Ahead

??? note "🗣️ Talking Points"
    - Quick 3-question verbal check: *"What does `ref()` do? What is `v-for` for? What is a component?"*
    - Last lecture: we built a Task List in one file — `App.vue`. It worked, but everything was crammed into one place.
    - Today's problem: what happens when your app has 10 pages and 50 UI elements? You can't keep them all in `App.vue`.
    - The answer is **components** — breaking the UI into small, focused, reusable pieces.
    - Draw on the board: a box labelled `App.vue` with child boxes `Header`, `TaskList`, `TaskItem`, `Badge`. This tree is what we're building towards.

### Where we left off

In Lecture 1 we introduced components with a simple `Badge` example. We touched on:

- Creating a `.vue` file in `src/components/`
- `defineProps` to receive data
- Importing and using a component in `App.vue`

### What we're adding today

| Concept | What it enables |
|---|---|
| **Typed props + validation** | Components that fail loudly when used incorrectly |
| **`defineEmits`** | Children that send signals back up to the parent |
| **Slots** | Components whose inner content can be customised by the parent |
| **`v-model` on components** | Two-way binding between parent state and a child input |

---

➡️ *Let's start with props — the primary way a parent talks to a child.*

---

## 2. Props — Passing Data Down

??? note "🗣️ Talking Points"
    - Analogy: props are like function arguments. Every time you call the function (use the component), you pass in different values.
    - Key rule to land early and hard: **props are read-only in the child**. The child can read them, display them, use them in computed properties — but it must never mutate them. If it needs to change something, it emits an event (next section).
    - Walk through the type definitions slowly — students coming from plain JS aren't used to declaring types. Explain that Vue validates at runtime and logs warnings in the dev console.

### What are props?

Props are the inputs a component declares. The parent passes values in; the child reads them. Data flows **one way** — parent → child.

```
Parent (App.vue)
  │
  │  :title="'Hello'"   ← prop passed down
  ▼
Child (Card.vue)
  reads props.title — cannot change it
```

### Declaring props with `defineProps`

=== "Basic (no types)"
    ```vue title="Card.vue"
    <!-- Card.vue -->
    <script setup>
    defineProps(['title', 'description'])
    </script>

    <template>
      <div class="card">
        <h2>{{ title }}</h2>
        <p>{{ description }}</p>
      </div>
    </template>
    ```

=== "With types and validation (recommended)"
    ```vue title="Card.vue"
    <!-- Card.vue -->
    <script setup>
    defineProps({
      title: {
        type: String,
        required: true
      },
      description: {
        type: String,
        default: 'No description provided.'
      },
      badge: {
        type: String,
        default: null
      },
      count: {
        type: Number,
        default: 0
      },
      active: {
        type: Boolean,
        default: false
      }
    })
    </script>

    <template>
      <div class="card" :class="{ active }">
        <span v-if="badge" class="badge">{{ badge }}</span>
        <h2>{{ title }}</h2>
        <p>{{ description }}</p>
        <small>Items: {{ count }}</small>
      </div>
    </template>
    <style scoped>
    .card {
        border: 1px solid #ccc;
        border-radius: 8px;
        padding: 16px;
        margin: 16px;
    }

    .active {
        background-color: #42b983;
    }

    .badge {
        display: inline-block;
        padding: 2px 6px;
        border-radius: 999px;
        background-color: #42b983;
        color: white;
        margin-right: 8px;
    }
    </style>
    ```

!!! warning "Props are read-only"
    ```javascript
    // ❌ Never do this inside a child component
    props.title = 'New title'

    // If you need a local modifiable copy, make one:
    const localTitle = ref(props.title)
    ```

### Using a component with props

```vue title="App.vue"
<script setup>
import Card from './components/Card.vue'
import { ref } from 'vue'

const projectName = ref('Vue App')
</script>

<template>
  <!-- Static string prop -->
  <Card title="Getting Started" description="Learn the basics." />

  <!-- Dynamic prop bound to reactive data — note the : prefix -->
  <Card :title="projectName" badge="Active" :count="5" :active="true" />
</template>
```

!!! note "Static vs dynamic props"
    Without `:`, the value is a **plain string** — `count="5"` passes the string `"5"`, not the number `5`.
    With `:`, the value is a **JavaScript expression** — `:count="5"` passes the number `5`.

    This catches students out constantly. If a prop expects a `Number` and you write `count="5"`, Vue will log a type warning.

### Prop types Vue supports

| Type | Example |
|---|---|
| `String` | `title: { type: String }` |
| `Number` | `count: { type: Number }` |
| `Boolean` | `active: { type: Boolean }` |
| `Array` | `items: { type: Array }` |
| `Object` | `user: { type: Object }` |
| Multiple | `id: { type: [String, Number] }` |

!!! example "🎯 Demo — Card component with props"
    === "Step 1 — create Card.vue"
        Create `src/components/Card.vue`:
        ```vue
        <template>
          <div class="card" :class="{ active }">
            <span v-if="badge" class="badge">{{ badge }}</span>
            <h2>{{ title }}</h2>
            <p>{{ description }}</p>
          </div>
        </template>

        <script setup>
        defineProps({
          title:       { type: String, required: true },
          description: { type: String, default: 'No description.' },
          badge:       { type: String, default: null },
          active:      { type: Boolean, default: false }
        })
        </script>

        <style scoped>
        .card {
          border: 1px solid #e5e7eb;
          border-radius: 10px;
          padding: 1.2rem;
          margin-bottom: 1rem;
          background: white;
          font-family: system-ui, sans-serif;
        }
        .card.active { border-color: #6366f1; box-shadow: 0 0 0 3px #e0e7ff; }
        .badge {
          display: inline-block;
          padding: 0.2rem 0.6rem;
          border-radius: 999px;
          background: #6366f1;
          color: white;
          font-size: 0.75rem;
          margin-bottom: 0.5rem;
        }
        h2 { margin: 0 0 0.4rem; font-size: 1.1rem; color: #111827; }
        p  { margin: 0; color: #6b7280; font-size: 0.9rem; }
        </style>
        ```

    === "Step 2 — use it in App.vue"
        ```vue
        <script setup>
        import Card from './components/Card.vue'
        </script>

        <template>
          <div style="max-width:500px; margin:2rem auto; padding:0 1rem;">
            <Card title="Lecture 1" description="Vue basics, reactivity, directives." badge="Done" />
            <Card title="Lecture 2" description="Components in depth." badge="Today" :active="true" />
            <Card title="Lecture 3" description="Reactivity and lifecycle hooks." />
          </div>
        </template>
        ```

    Show the browser. Point out:
    - The `active` card has a highlighted border
    - The last card shows the default description because none was passed
    - Open DevTools console, temporarily remove `title` from a card — Vue warns about the required prop

---

➡️ *Props let the parent talk to the child. Now let's go the other direction — events.*

---

## 3. Events — Sending Signals Up

??? note "🗣️ Talking Points"
    - The instinct students have is to pass a function as a prop and call it from the child. That works in React. In Vue, the convention is events — cleaner and more explicit.
    - Analogy: a button on a TV remote emits a signal. The TV (parent) decides what to do with it. The remote (child) doesn't know — and shouldn't know — what the TV will do.
    - Show the broken version first (mutating a prop directly) before showing the event solution. Students need to feel the problem before the solution makes sense.
    - `defineEmits` is the mirror image of `defineProps` — it declares what signals the component can send out.

### The problem: children can't change parent data directly

```
Parent owns: tasks = [...]

Child wants to delete a task...
  ❌ props.tasks.splice(i, 1)   — mutating a prop
  ✅ emit('delete', task.id)    — ask the parent to do it
```

The parent owns the data. The child asks politely by emitting an event.

### `defineEmits` — declaring what a component can emit

```vue title="DeleteButton.vue"
<script setup>
// Declare the events this component can send
const emit = defineEmits(['delete', 'archive'])

function handleDelete() {
  emit('delete')           // emit with no payload
}

function handleArchive(id) {
  emit('archive', id)      // emit with a payload
}
</script>

<template>
  <button @click="handleDelete">Delete</button>
  <button @click="handleArchive(42)">Archive</button>
</template>
```

### Listening to events in the parent

```vue title="App.vue"
<script setup>
import DeleteButton from './components/DeleteButton.vue'

function onDelete() {
  console.log('delete event received')
}

function onArchive(id) {
  console.log('archive event received, id:', id)
}
</script>

<template>
  <!-- v-on / @ listens for custom events just like DOM events -->
  <DeleteButton @delete="onDelete" @archive="onArchive" />
</template>
```

### Full example — a Card that can be dismissed

!!! example "🎯 Demo — dismissable Card"
    === "Step 1 — add emit to Card.vue"
        Add `defineEmits` and a close button to `Card.vue`:
        ```vue
        <template>
          <div class="card" :class="{ active }">
            <button class="close" @click="emit('close')">✕</button>
            <span v-if="badge" class="badge">{{ badge }}</span>
            <h2>{{ title }}</h2>
            <p>{{ description }}</p>
          </div>
        </template>

        <script setup>
        defineProps({
          title:       { type: String, required: true },
          description: { type: String, default: 'No description.' },
          badge:       { type: String, default: null },
          active:      { type: Boolean, default: false }
        })

        const emit = defineEmits(['close'])
        </script>

        <style scoped>
        /* ...keep existing styles, add: */
        .card { position: relative; }
        .close {
          position: absolute;
          top: 0.75rem; right: 0.75rem;
          background: none; border: none;
          color: #9ca3af; cursor: pointer;
          font-size: 1rem; line-height: 1;
        }
        .close:hover { color: #111827; }
        </style>
        ```

    === "Step 2 — handle it in App.vue"
        ```vue
        <script setup>
        import { ref } from 'vue'
        import Card from './components/Card.vue'

        const cards = ref([
          { id: 1, title: 'Lecture 1', description: 'Vue basics.', badge: 'Done' },
          { id: 2, title: 'Lecture 2', description: 'Components.', badge: 'Today', active: true },
          { id: 3, title: 'Lecture 3', description: 'Lifecycle hooks.' },
        ])

        function removeCard(id) {
          cards.value = cards.value.filter(c => c.id !== id)
        }
        </script>

        <template>
          <div style="max-width:500px; margin:2rem auto; padding:0 1rem;">
            <Card
              v-for="card in cards"
              :key="card.id"
              :title="card.title"
              :description="card.description"
              :badge="card.badge"
              :active="card.active"
              @close="removeCard(card.id)"
            />
          </div>
        </template>
        ```

    Click the ✕ on a card. Point out:
    - The child emitted `'close'`
    - The parent called `removeCard` with the right `id`
    - The child has no idea what `removeCard` does — it just sends a signal

---

➡️ *Props and events handle data. But what about the HTML content inside a component?*

---

## 4. Slots — Flexible Component Content

??? note "🗣️ Talking Points"
    - Props pass data. Slots pass *markup*. That's the one-sentence summary.
    - Without slots, every component is a closed box. With slots, the parent can inject any HTML it wants into a designated spot inside the child.
    - Real-world analogy: a `Modal` component. The modal's structure (overlay, box, close button, animation) is always the same. But what's *inside* the modal is different every time — a form, a confirmation message, an image gallery. Slots solve this.
    - Named slots: think of them as multiple insertion points — a `header` slot, a `default` slot, a `footer` slot.

### Default slot

Without slots, a component ignores any content written between its tags:

```vue
<!-- ❌ This content is silently ignored — Card has no slot -->
<Card title="Hello">
  <p>This paragraph goes nowhere.</p>
</Card>
```

To allow content, add `<slot>` inside the component template:

```vue title="Panel.vue"
<template>
  <div class="panel">
    <div class="panel-header">
      <h3>{{ title }}</h3>
    </div>
    <div class="panel-body">
      <slot />   <!-- parent content is injected here -->
    </div>
  </div>
</template>

<script setup>
defineProps({ title: { type: String, required: true } })
</script>
```

```vue title="App.vue"
<template>
  <Panel title="User Profile">
    <!-- This markup goes into the slot -->
    <p>Name: Alice</p>
    <p>Email: alice@example.com</p>
    <button>Edit profile</button>
  </Panel>
</template>
```

### Slot fallback content

Provide default content that shows when the parent gives nothing:

```vue
<slot>
  <p class="empty">Nothing to show here.</p>
</slot>
```

### Named slots

When a component needs more than one injection point:

```vue title="PageLayout.vue"
<template>
  <div class="layout">
    <header>
      <slot name="header" />
    </header>

    <main>
      <slot />          <!-- unnamed = "default" slot -->
    </main>

    <footer>
      <slot name="footer" />
    </footer>
  </div>
</template>
```

```vue title="App.vue"
<template>
  <PageLayout>
    <template #header>
      <h1>My App</h1>
      <nav>...</nav>
    </template>

    <!-- content here goes to the default slot -->
    <p>Main page content.</p>

    <template #footer>
      <p>© 2025 COSC2956</p>
    </template>
  </PageLayout>
</template>
```

`#header` is shorthand for `v-slot:header`.

!!! example "🎯 Demo — Modal with slots"
    === "Step 1 — create Modal.vue"
        Create `src/components/Modal.vue`:
        ```vue
        <template>
          <div v-if="open" class="overlay" @click.self="emit('close')">
            <div class="modal">
              <div class="modal-header">
                <slot name="header">
                  <h2>Dialog</h2>
                </slot>
                <button class="close" @click="emit('close')">✕</button>
              </div>
              <div class="modal-body">
                <slot />
              </div>
              <div class="modal-footer">
                <slot name="footer">
                  <button @click="emit('close')">Close</button>
                </slot>
              </div>
            </div>
          </div>
        </template>

        <script setup>
        defineProps({ open: { type: Boolean, required: true } })
        const emit = defineEmits(['close'])
        </script>

        <style scoped>
        .overlay {
          position: fixed; inset: 0;
          background: rgba(0,0,0,0.4);
          display: flex; align-items: center; justify-content: center;
          z-index: 100;
        }
        .modal {
          background: white; border-radius: 12px;
          width: 90%; max-width: 480px;
          box-shadow: 0 20px 60px rgba(0,0,0,0.2);
          font-family: system-ui, sans-serif; overflow: hidden;
        }
        .modal-header {
          display: flex; justify-content: space-between; align-items: center;
          padding: 1.2rem 1.5rem; border-bottom: 1px solid #e5e7eb;
        }
        .modal-header h2 { margin: 0; font-size: 1.1rem; }
        .modal-body   { padding: 1.5rem; }
        .modal-footer { padding: 1rem 1.5rem; border-top: 1px solid #e5e7eb; text-align: right; }
        .close { background: none; border: none; font-size: 1.1rem; cursor: pointer; color: #9ca3af; }
        .close:hover { color: #111; }
        button {
          padding: 0.5rem 1.2rem; border: none; border-radius: 6px;
          background: #6366f1; color: white; cursor: pointer;
        }
        </style>
        ```

    === "Step 2 — use it in App.vue"
        ```vue
        <script setup>
        import { ref } from 'vue'
        import Modal from './components/Modal.vue'

        const showModal = ref(false)
        </script>

        <template>
          <div style="padding: 2rem;">
            <button @click="showModal = true"
              style="padding:0.6rem 1.2rem; background:#6366f1; color:white; border:none; border-radius:8px; cursor:pointer;">
              Open Modal
            </button>

            <Modal :open="showModal" @close="showModal = false">
              <template #header>
                <h2>Confirm Delete</h2>
              </template>

              <p>Are you sure you want to delete this item? This action cannot be undone.</p>

              <template #footer>
                <button @click="showModal = false"
                  style="background:#e5e7eb; color:#111; margin-right:0.5rem;">
                  Cancel
                </button>
                <button @click="showModal = false">Confirm</button>
              </template>
            </Modal>
          </div>
        </template>
        ```

    Show the modal opening and closing. Then change the content between the `Modal` tags — point out the modal's *structure* never changes, only the *content* does. That's the power of slots.

    Click outside the modal (the overlay) — it also closes, because of `@click.self` on `.overlay`.

---

➡️ *Now let's look at a common pattern that combines props and events in one directive.*

---

## 5. `v-model` on Components

??? note "🗣️ Talking Points"
    - Students already know `v-model` on native inputs from Lec 1. Now we're lifting that concept to custom components.
    - The key insight: `v-model` on a component is syntactic sugar for `:modelValue` + `@update:modelValue`. Once students see what it expands to, they can implement it themselves.
    - This is the first pattern that feels genuinely 'clever' — students often have a lightbulb moment here.
    - Good real-world use case: a custom `SearchInput` component that a parent uses in many places. The parent binds its `query` ref to it with `v-model` and forgets about it.

### What `v-model` expands to on a component

On a native input:
```vue
<input v-model="name" />
<!-- expands to: -->
<input :value="name" @input="name = $event.target.value" />
```

On a **custom component**, `v-model` expands to:
```vue
<SearchInput v-model="query" />
<!-- expands to: -->
<SearchInput :modelValue="query" @update:modelValue="query = $event" />
```

So to support `v-model`, your component must:

1. Accept a prop named `modelValue`
2. Emit an event named `update:modelValue`

### Implementing a `v-model`-compatible component

!!! example "🎯 Demo — SearchInput with v-model"
    === "Step 1 — create SearchInput.vue"
        Create `src/components/SearchInput.vue`:
        ```vue
        <template>
          <div class="search-wrapper">
            <span class="icon">🔍</span>
            <input
              class="search-input"
              :value="modelValue"
              @input="emit('update:modelValue', $event.target.value)"
              :placeholder="placeholder"
            />
            <button v-if="modelValue" class="clear" @click="emit('update:modelValue', '')">✕</button>
          </div>
        </template>

        <script setup>
        defineProps({
          modelValue:  { type: String, required: true },
          placeholder: { type: String, default: 'Search...' }
        })

        const emit = defineEmits(['update:modelValue'])
        </script>

        <style scoped>
        .search-wrapper {
          display: flex; align-items: center; gap: 0.5rem;
          border: 1px solid #d1d5db; border-radius: 8px;
          padding: 0.5rem 0.75rem; background: white;
          font-family: system-ui, sans-serif;
        }
        .search-wrapper:focus-within { border-color: #6366f1; box-shadow: 0 0 0 3px #e0e7ff; }
        .search-input { flex: 1; border: none; outline: none; font-size: 0.95rem; }
        .icon  { color: #9ca3af; }
        .clear { background: none; border: none; color: #9ca3af; cursor: pointer; font-size: 0.9rem; }
        .clear:hover { color: #111; }
        </style>
        ```

    === "Step 2 — use v-model in App.vue"
        ```vue
        <script setup>
        import { ref, computed } from 'vue'
        import SearchInput from './components/SearchInput.vue'

        const query = ref('')

        const courses = ref([
          'Introduction to Vue.js',
          'Components in Depth',
          'Reactivity and Lifecycle',
          'Vue Router',
          'State Management with Pinia',
          'Composables',
        ])

        const filtered = computed(() =>
          courses.value.filter(c =>
            c.toLowerCase().includes(query.value.toLowerCase())
          )
        )
        </script>

        <template>
          <div style="max-width:500px; margin:2rem auto; padding:0 1rem; font-family:system-ui, sans-serif;">
            <h2>Course Search</h2>

            <!-- v-model wires the parent's query ref to the child component -->
            <SearchInput v-model="query" placeholder="Search courses..." />

            <p style="margin:1rem 0 0.5rem; color:#6b7280; font-size:0.9rem;">
              {{ filtered.length }} result(s)
            </p>

            <ul style="list-style:none; padding:0;">
              <li v-for="course in filtered" :key="course"
                  style="padding:0.6rem 0; border-bottom:1px solid #f3f4f6;">
                {{ course }}
              </li>
            </ul>
          </div>
        </template>
        ```

    Type in the search box. Point out:
    - `query` in `App.vue` updates as you type — even though the `<input>` is inside `SearchInput.vue`
    - The clear button emits `update:modelValue` with an empty string — the parent's `query` resets
    - The parent just writes `v-model="query"` and doesn't care how `SearchInput` is built internally

---

➡️ *Now let's build something that uses all four concepts together.*

---

## 6. Live Demo — Product Card + Quick-View Modal

??? note "🗣️ Talking Points"
    - This demo uses everything from today: typed props, emits, slots, and v-model.
    - Build it stage by stage. Don't rush to stage 4 — the value is in watching each piece connect.
    - After stage 3, pause and ask: *"What does the ProductCard component know about the modal? Nothing. What does the modal know about the product? Nothing. Who connects them?"* — App.vue. That's the component architecture point.

!!! example "🎯 Demo — Setup"
    Start fresh. Delete the content from `App.vue`. We will build three components: `ProductCard.vue`, `QuickViewModal.vue`, and wire them in `App.vue`.

---

### Stage 1 — ProductCard with props and emit

Create `src/components/ProductCard.vue`:

```vue title="ProductCard.vue"
<template>
  <div class="product-card">
    <div class="product-image">{{ product.emoji }}</div>
    <div class="product-info">
      <h3>{{ product.name }}</h3>
      <p class="price">${{ product.price.toFixed(2) }}</p>
      <p class="desc">{{ product.description }}</p>
    </div>
    <button class="view-btn" @click="emit('quickview', product)">Quick View</button>
  </div>
</template>

<script setup>
defineProps({
  product: { type: Object, required: true }
})

const emit = defineEmits(['quickview'])
</script>

<style scoped>
.product-card {
  display: flex; flex-direction: column; gap: 0.75rem;
  border: 1px solid #e5e7eb; border-radius: 12px;
  padding: 1.2rem; background: white;
  font-family: system-ui, sans-serif;
  transition: box-shadow 0.2s;
}
.product-card:hover { box-shadow: 0 4px 16px rgba(0,0,0,0.08); }
.product-image { font-size: 3rem; text-align: center; padding: 0.5rem 0; }
.product-info h3 { margin: 0 0 0.25rem; color: #111827; }
.price { margin: 0 0 0.4rem; color: #6366f1; font-weight: 600; }
.desc  { margin: 0; color: #6b7280; font-size: 0.875rem; }
.view-btn {
  width: 100%; padding: 0.6rem; border: none; border-radius: 8px;
  background: #6366f1; color: white; cursor: pointer; font-size: 0.9rem;
}
.view-btn:hover { background: #4f46e5; }
</style>
```

```vue title="App.vue — stage 1"
<script setup>
import { ref } from 'vue'
import ProductCard from './components/ProductCard.vue'

const products = ref([
  { id: 1, emoji: '⌨️', name: 'Mechanical Keyboard', price: 89.99, description: 'Tactile switches, RGB backlit.' },
  { id: 2, emoji: '🖱️', name: 'Wireless Mouse',      price: 49.99, description: 'Ergonomic design, long battery life.' },
  { id: 3, emoji: '🖥️', name: '4K Monitor',           price: 399.99, description: '27-inch IPS panel, 144Hz.' },
])
</script>

<template>
  <div class="page">
    <h1>Products</h1>
    <div class="grid">
      <ProductCard
        v-for="product in products"
        :key="product.id"
        :product="product"
        @quickview="p => console.log('Quick view:', p.name)"
      />
    </div>
  </div>
</template>

<style>
body { background: #f9fafb; margin: 0; }
.page { max-width: 700px; margin: 2rem auto; padding: 0 1rem; font-family: system-ui, sans-serif; }
h1    { color: #111827; margin-bottom: 1.5rem; }
.grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(200px, 1fr)); gap: 1rem; }
</style>
```

Open the console and click Quick View. Show the product object arriving.

---

### Stage 2 — QuickViewModal with slots

Create `src/components/QuickViewModal.vue`:

```vue title="QuickViewModal.vue"
<template>
  <div v-if="open" class="overlay" @click.self="emit('close')">
    <div class="modal">
      <div class="modal-header">
        <slot name="header" />
        <button class="close" @click="emit('close')">✕</button>
      </div>
      <div class="modal-body">
        <slot />
      </div>
      <div class="modal-footer">
        <slot name="footer">
          <button class="btn-secondary" @click="emit('close')">Close</button>
        </slot>
      </div>
    </div>
  </div>
</template>

<script setup>
defineProps({ open: { type: Boolean, required: true } })
const emit = defineEmits(['close'])
</script>

<style scoped>
.overlay {
  position: fixed; inset: 0; background: rgba(0,0,0,0.45);
  display: flex; align-items: center; justify-content: center; z-index: 100;
}
.modal {
  background: white; border-radius: 14px; width: 90%; max-width: 420px;
  box-shadow: 0 24px 64px rgba(0,0,0,0.2); overflow: hidden;
  font-family: system-ui, sans-serif;
}
.modal-header {
  display: flex; justify-content: space-between; align-items: center;
  padding: 1rem 1.25rem; border-bottom: 1px solid #f3f4f6;
}
.modal-body   { padding: 1.5rem; }
.modal-footer { padding: 1rem 1.25rem; border-top: 1px solid #f3f4f6; display: flex; justify-content: flex-end; gap: 0.5rem; }
.close        { background: none; border: none; font-size: 1.1rem; color: #9ca3af; cursor: pointer; }
.close:hover  { color: #111; }
.btn-secondary { padding: 0.5rem 1rem; border: 1px solid #d1d5db; border-radius: 6px; background: white; cursor: pointer; }
</style>
```

---

### Stage 3 — Wire modal into App.vue

```vue title="App.vue — stage 3"
<script setup>
import { ref } from 'vue'
import ProductCard from './components/ProductCard.vue'
import QuickViewModal from './components/QuickViewModal.vue'

const products = ref([
  { id: 1, emoji: '⌨️', name: 'Mechanical Keyboard', price: 89.99, description: 'Tactile switches, RGB backlit.' },
  { id: 2, emoji: '🖱️', name: 'Wireless Mouse',      price: 49.99, description: 'Ergonomic design, long battery life.' },
  { id: 3, emoji: '🖥️', name: '4K Monitor',           price: 399.99, description: '27-inch IPS panel, 144Hz.' },
])

const selectedProduct = ref(null)
const showModal = ref(false)

function openQuickView(product) {
  selectedProduct.value = product
  showModal.value = true
}

function closeModal() {
  showModal.value = false
  selectedProduct.value = null
}
</script>

<template>
  <div class="page">
    <h1>Products</h1>
    <div class="grid">
      <ProductCard
        v-for="product in products"
        :key="product.id"
        :product="product"
        @quickview="openQuickView"
      />
    </div>

    <QuickViewModal :open="showModal" @close="closeModal">
      <template #header>
        <h2 style="margin:0; font-size:1.1rem;">
          {{ selectedProduct?.emoji }} {{ selectedProduct?.name }}
        </h2>
      </template>

      <div v-if="selectedProduct" style="text-align:center;">
        <div style="font-size:5rem; margin-bottom:1rem;">{{ selectedProduct.emoji }}</div>
        <p style="color:#6b7280; margin:0 0 1rem;">{{ selectedProduct.description }}</p>
        <p style="font-size:1.5rem; font-weight:600; color:#6366f1; margin:0;">
          ${{ selectedProduct.price.toFixed(2) }}
        </p>
      </div>

      <template #footer>
        <button style="padding:0.5rem 1rem; border:1px solid #d1d5db; border-radius:6px; background:white; cursor:pointer;"
                @click="closeModal">Cancel</button>
        <button style="padding:0.5rem 1rem; border:none; border-radius:6px; background:#6366f1; color:white; cursor:pointer;">
          Add to Cart
        </button>
      </template>
    </QuickViewModal>
  </div>
</template>

<style>
body { background: #f9fafb; margin: 0; }
.page { max-width: 700px; margin: 2rem auto; padding: 0 1rem; font-family: system-ui, sans-serif; }
h1   { color: #111827; margin-bottom: 1.5rem; }
.grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(200px, 1fr)); gap: 1rem; }
</style>
```

**Pause and point out:**

- `ProductCard` emits `'quickview'` with the product object — it has no idea a modal exists
- `App.vue` receives it, stores `selectedProduct`, and opens the modal
- `QuickViewModal` renders `selectedProduct`'s data via slots — it has no idea how it was triggered
- **Three components. Zero shared knowledge between them. App.vue is the conductor.**

---

### Stage 4 — Add SearchInput with v-model

```javascript title="App.vue"
// Add to App.vue <script setup>
import SearchInput from './components/SearchInput.vue'

const query = ref('')
const filteredProducts = computed(() =>
  products.value.filter(p =>
    p.name.toLowerCase().includes(query.value.toLowerCase())
  )
)
```

Import computed:
```vue title="App.vue"
import { ref, computed } from 'vue'
```

Add the search input above the grid in App.vue
```vue title="App.vue"
<!-- Add above the grid in App.vue <template> -->
<SearchInput v-model="query" placeholder="Search products..." style="margin-bottom:1rem;" />

```

Change v-for to use filteredProducts
```vue title="App.vue"
<!-- Change v-for to use filteredProducts -->
<ProductCard
  v-for="product in filteredProducts"
  ...
```

Type in the search field — the grid filters live.

---

## 7. Pitfalls & Wrap-up

??? note "🗣️ Talking Points"
    - These are the mistakes that will show up in student assignments. Keep it fast — 5 minutes.
    - The prop mutation one is the most important. If a student hits a confusing reactivity bug, 80% of the time it's this.

### ❌ Mutating a prop directly

```javascript
// Inside a child component
props.title = 'New value'      // ❌ Vue will warn, behaviour is unpredictable

// ✅ If you need a local copy:
const localTitle = ref(props.title)
// ✅ If the parent needs to change:
emit('update:title', 'New value')
```

### ❌ Using a string where a prop expects a Number or Boolean

```vue
<Card count="5" />   <!-- ❌ passes the STRING "5" — type mismatch warning -->
<Card :count="5" />  <!-- ✅ passes the NUMBER 5 -->

<Card active="true" />  <!-- ❌ passes the STRING "true", not the boolean true -->
<Card :active="true" /> <!-- ✅ -->
```

### ❌ Forgetting `defineEmits` before calling `emit`

```javascript
// ❌ emit is not available unless you call defineEmits first
emit('close')

// ✅
const emit = defineEmits(['close'])
emit('close')
```

### ❌ Passing content into a component with no `<slot>`

```vue
<Card title="Hello">
  <p>This disappears silently — Card has no slot defined.</p>
</Card>
```

Add `<slot />` to the component template to accept content.

### ❌ Implementing `v-model` with the wrong prop/event names

```javascript
// ❌ Wrong names — v-model won't work
defineProps(['value'])
const emit = defineEmits(['input'])

// ✅ Correct names for v-model to work
defineProps(['modelValue'])
const emit = defineEmits(['update:modelValue'])
```

---

## 8. Summary

| Concept | One-liner |
|---|---|
| **Props** | Parent passes data down — child reads, never mutates |
| **Emits** | Child sends a named signal up — parent decides what to do |
| **Slots** | Parent injects markup into a designated spot in the child |
| **`v-model` on components** | Shorthand for `:modelValue` + `@update:modelValue` |

```
           App.vue (owns data + logic)
           │
           │  :product="p"          → props down
           │  @quickview="handler"  → events up
           │  v-model="query"       → shorthand for both
           ▼
      ProductCard.vue
           │
           │  <slot />              → parent injects content
           ▼
      QuickViewModal.vue
```

### Coming up next

| Lecture | Topic |
|---|---|
| **Lec 3** | Lifecycle hooks · `watch` · Async data fetching |
| Lec 4 | Vue Router — client-side navigation |
| Lec 5 | Pinia — shared state management |
| Lec 6 | Composables — reusable stateful logic |

---

!!! tip "Practice — extend the demo"
    Before Lecture 3, try these:

    1. **Add an "Add to Cart" counter** — when the modal's Add to Cart button is clicked, emit an event and show a cart count in `App.vue`
    2. **Create a `Badge` component** — use it inside `ProductCard` to show a "Sale" or "New" label via a prop
    3. **Add a `TextInput` component** — supports `v-model`, shows a character count below the input

    These will require all four concepts from today: props, emits, slots, and `v-model`.

