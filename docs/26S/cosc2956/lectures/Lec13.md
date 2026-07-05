---
search:
  exclude: true
---
# COSC2956 – Internet Tools


## 0. Frontend Frameworks — The Big Picture


### What is a frontend framework?

A **frontend framework** is a structured collection of tools, conventions, and abstractions that handles the recurring hard problems of building interactive UIs — so you don't have to solve them from scratch on every project.

The key word is *recurring*. Every non-trivial web app needs to solve the same set of problems:

- How do I keep the UI in sync with changing data?
- How do I structure a large codebase so it doesn't collapse under its own weight?
- How do I reuse UI patterns without copying and pasting HTML?
- How do I handle navigation without full page reloads?
- How do I manage shared state across different parts of the page?

Vanilla JavaScript can solve all of these — but it gives you no *system* for doing so. Every developer invents their own approach, and those approaches don't compose well across teams or time.

!!! note "Framework vs Library"
    These terms are often used interchangeably but have a meaningful distinction.

    - A **library** (e.g., jQuery, Lodash) is a tool you call on your own terms. You are in control of the architecture.
    - A **framework** inverts this — it calls *your* code. It provides the structure; you fill in the logic. This is sometimes called the **Hollywood Principle**: *"Don't call us, we'll call you."*

    Vue sits somewhere in between — it's often called a **progressive framework** because you can use as little or as much of it as you want.

---

### The evolution of frontend development

Understanding where frameworks came from helps explain why they look the way they do.

| Era | Approach | Problem it solved | Problem it created |
|---|---|---|---|
| Early 2000s | Plain HTML + basic JS | Static pages with minor interactivity | Couldn't handle complex state |
| Mid 2000s | jQuery | Cross-browser DOM manipulation | Spaghetti code at scale |
| Early 2010s | Backbone, Knockout | Gave JS apps some structure | Still mostly manual, verbose |
| 2013–2016 | React, Angular, Vue (1.x) | Component model + reactivity | Learning curve, tooling complexity |
| 2018–present | React hooks, Vue 3, Svelte | Simpler composition, better performance | Framework fatigue, fragmentation |

The pattern is consistent: each generation inherits the previous generation's unsolved problems and introduces new abstractions to address them.

---

### The three dominant frameworks today

#### Angular

- Developed and maintained by **Google**, released 2016 (complete rewrite of AngularJS)
- A **full framework**: includes routing, HTTP client, forms, dependency injection, CLI — everything
- Uses **TypeScript** by default
- Opinionated and structured — well-suited for large enterprise teams
- Steeper learning curve; less popular for smaller projects and startups
- Trade-off: lots of boilerplate, but strong conventions mean large teams stay consistent

```typescript
// Angular — TypeScript + decorators
@Component({
  selector: 'app-counter',
  template: `<button (click)="increment()">Count: {{ count }}</button>`
})
export class CounterComponent {
  count = 0;
  increment() { this.count++; }
}
```


#### React

- Developed and maintained by **Meta** (Facebook), released 2013
- Not a full framework — React itself is just the UI layer (component model + virtual DOM)
- Uses **JSX**: JavaScript with HTML-like syntax embedded directly in JS files
- Massive ecosystem: Next.js (SSR), React Router, Redux / Zustand (state)
- By far the most used framework in industry — strong hiring signal
- Trade-off: very unopinionated, so architectural decisions are left to the developer

```jsx
// React — JSX syntax
function Counter() {
  const [count, setCount] = React.useState(0);
  return <button onClick={() => setCount(count + 1)}>Count: {count}</button>;
}
```


#### Vue

- Created by **Evan You** (ex-Google), released 2014; Vue 3 released 2020
- Positions itself as the middle ground — more structured than React, less rigid than Angular
- **HTML-based templates** rather than JSX — lower barrier for developers already comfortable with HTML
- Official first-party solutions for routing (Vue Router) and state (Pinia)
- Very popular in Asia (Alibaba, Baidu), growing adoption in Europe and Australia
- Trade-off: smaller ecosystem than React, smaller talent pool in some markets

```vue
<!-- Vue — HTML-based SFC template -->
<template>
  <button @click="count++">Count: {{ count }}</button>
</template>
<script setup>
import { ref } from 'vue'
const count = ref(0)
</script>
```

---

### Pros and cons of using a framework at all

!!! warning "Frameworks are not free"
    It's easy to assume that using a framework is always better than not. That's not true. Understanding the trade-offs is part of being a good engineer.

**Pros:**

- **Productivity** — solved problems stay solved; you build on a foundation rather than from scratch
- **Consistency** — team members write code that looks the same; onboarding is faster
- **Ecosystem** — routing, testing, state management, UI component libraries all integrate cleanly
- **Performance floor** — virtual DOM diffing, code splitting, and lazy loading are handled for you
- **Community** — bugs get found and fixed quickly; documentation is extensive

**Cons:**

- **Bundle size** — even a minimal Vue or React app ships more JavaScript than a vanilla page
- **Lock-in** — migrating from one framework to another is painful; you're betting on the framework's longevity
- **Abstraction cost** — when things go wrong, you need to understand both your code *and* the framework's internals
- **Overhead for simple pages** — a marketing landing page or a simple form doesn't need a framework
- **Hiring** — your team needs to know the specific framework you chose

!!! question "Reflection"
    Can you think of a real project where reaching for a framework would be the *wrong* choice? What signals would tell you that vanilla JS is sufficient?

---

### Why Vue for this course?

Given that React has the largest market share, it's a fair question. Here's the reasoning:

**1. The learning curve maps to what you already know.**
Vue templates are valid HTML with added attributes. If you understand HTML and JavaScript, reading a Vue component requires almost no mental translation. React's JSX and Angular's decorator syntax both require you to learn a new way of writing markup first.

**2. The concepts transfer directly to React and Angular.**
Component model, reactive state, props, events, virtual DOM — these concepts are shared across all three frameworks. Learning them in Vue gives you the mental model to pick up React or Angular much faster. Vue is arguably the best *teaching* framework for this reason.

**3. It's genuinely used in industry.**
Vue is not a toy. It powers production applications at Alibaba, GitLab, Grammarly, Nintendo, and many others. It's a real professional skill.

**4. The official tooling (Vite) is state-of-the-art.**
Vite — Vue's recommended build tool — is now used by React and Svelte projects too. Learning Vite through Vue means you're learning a transferable, modern tool.

**5. The documentation is exceptional.**
The official Vue 3 docs at [vuejs.org](https://vuejs.org) are widely regarded as the best documentation of any major framework. This matters for a course — you can actually learn from them independently.

---

➡️ *With the landscape established, let's look at the specific problem Vue solves at the code level.*

---

## 1. Why Vue? The Problem with Vanilla JS

### What goes wrong at scale?

Consider a shopping cart. In vanilla JS:

```javascript
let cartItems = [];

function addItem(name, price) {
  cartItems.push({ name, price });
  renderCart(); // 👈 you must remember to call this
}

function renderCart() {
  const listEl = document.getElementById('cart-list');
  listEl.innerHTML = ''; // wipe everything
  cartItems.forEach(item => {
    const li = document.createElement('li');
    li.textContent = `${item.name} — $${item.price.toFixed(2)}`;
    listEl.appendChild(li);
  });
  document.getElementById('cart-count').textContent = cartItems.length;
}
```

**Problems with this approach:**

- **Manual sync** — forget to call `renderCart()` and the UI is wrong
- **Scattered state** — data lives in loose variables with no structure
- **Wasteful re-renders** — the entire list is rebuilt even if one item changed
- **No architecture** — as features grow, this becomes unmanageable

### Imperative vs Declarative

| | Imperative (Vanilla JS) | Declarative (Vue) |
|---|---|---|
| You describe… | *How* to update the DOM | *What* the UI should look like |
| DOM updates | Manual | Automatic |
| Data–UI sync | Your responsibility | Framework's responsibility |



## 2. Installation & Project Setup

### Prerequisites

Go to [https://nodejs.org/en/download](https://nodejs.org/en/download) and install nodejs.

Check the version.

```bash
node --version   # v18+ required
npm --version    # comes with Node
```

### Method 1 — CDN (experimentation only)

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Vue 3 App</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
</head>
<body>
  <div id="app">{{ message }}</div>

  <script>
    const { createApp } = Vue;

    createApp({
      data() {
        return {
          message: 'Hello Vue!'
        };
      }
    }).mount('#app');
  </script>
</body>
</html>
```

!!! warning "CDN Limitations"
    No `.vue` files, no TypeScript, no tree-shaking. Fine for quick tests — **not** for real projects.

### Method 2 — Vite (recommended)

!!! example "🎯 Demo — Scaffold a project"
    Run these commands live in the terminal:
    ```bash
    //gives you options to choose from
    npm create vue@latest
    ```
    or run:
    ```bash
    //skips the options and creates a vue project
    npm create vite@latest my-vue-app -- --template vue
    ```
    then:
    ```bash
    cd my-vue-app
    npm install
    npm run dev
    ```
    Open `http://localhost:5173` in the browser. Then open the folder in VSCode.

### Project Structure

```
my-vue-app/
├── public/              # Static files served as-is
├── src/
│   ├── assets/          # Images, fonts (processed by Vite)
│   ├── components/      # Reusable .vue files
│   ├── App.vue          # Root component
│   └── main.js          # Entry point
├── index.html           # The single HTML shell
├── package.json
└── vite.config.js
```

#### `index.html` — the shell

```html
<body>
  <div id="app"></div>  <!-- Vue mounts here -->
  <script type="module" src="/src/main.js"></script>
</body>
```

The page is almost empty. Vue injects everything into `#app` at runtime.

#### `main.js` — entry point

```javascript
import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

createApp(App).mount('#app')
```

#### `App.vue` — a Single File Component (SFC)

```vue
<template>
  <!-- HTML structure -->
</template>

<script setup>
  // JavaScript logic
</script>

<style scoped>
  /* CSS scoped to this component only */
</style>
```

!!! note "SFC vs vanilla separation"
    Vanilla JS separates by *file type* (`.html` / `.js` / `.css`). Vue SFCs separate by *component* — each file owns all three layers of one piece of UI.

---

➡️ *Next: let's write our first reactive data and understand what's actually happening.*

---

## 3. App Instance, Reactivity & Templates

### `createApp()` and mounting

```javascript
import { createApp } from 'vue'
import App from './App.vue'

const app = createApp(App)  // Create app instance with root component
app.mount('#app')            // Connect it to the DOM element #app
```

Vue takes control of `#app` and everything inside it.

### Reactive Data — `ref()`

Use `ref()` for primitive values (strings, numbers, booleans):

```vue
<script setup>
import { ref } from 'vue'

const count = ref(0)

// In JS code — must use .value
console.log(count.value)  // 0
count.value++
</script>

<template>
  <!-- In templates — .value is unwrapped automatically -->
  <p>Count: {{ count }}</p>
</template>
```

!!! warning "The .value rule"
    `.value` is required in `<script>` blocks. In `<template>`, Vue unwraps it for you. Forgetting `.value` in script is the most common beginner bug.

### Reactive Data — `reactive()`

Use `reactive()` for objects with multiple related properties:

```vue
<script setup>
import { reactive } from 'vue'

const user = reactive({
  name: 'Alice',
  age: 22
})

// No .value — direct property access
user.age = 23
</script>

<template>
  <p>{{ user.name }}, age {{ user.age }}</p>
</template>
```

!!! danger "Don't destructure reactive objects"
    ```javascript
    const { name } = user   // ❌ name is now a plain string — not reactive
    user.name = 'Bob'       // ❌ template won't update
    ```


-    Use `ref()` for single values 
-   Use `reactive()` for objects 

### Template Interpolation

```vue
<template>
  <p>{{ message }}</p>                  <!-- variable -->
  <p>{{ 2 + 2 }}</p>                    <!-- expression -->
  <p>{{ message.toUpperCase() }}</p>    <!-- method call -->
</template>
```

`{{ }}` accepts any single JavaScript **expression**. Not statements (`if`, `for`, declarations).

!!! example "🎯 Demo — First reactive component"
    Replace the contents of `App.vue` with:
    ```vue

        <script setup>
        import { ref } from 'vue'

        const greeting = ref('Hello, COSC2956!')
        const count = ref(0)
        function inc() {
        count.value+=4
        }
        </script>


        <template>
        <h1>{{ greeting }}</h1>
        <p>Count: {{ count }}</p>
        <button @click="inc()">Click me</button>
        </template>

    ```
    Save and show hot reload in the browser. Change `greeting` value and save again.

---

➡️ *Next: directives — Vue's way of adding logic to templates.*

---

## 4. Directives

Directives are special `v-` prefixed HTML attributes that give Vue instructions about how to render or behave.

### `v-bind` — Bind reactive data to HTML attributes
Standard HTML attributes are static. To link an attribute to a reactive variable or expression, use `v-bind`. This allows the UI to update **automatically** when the underlying data changes.

```vue
<a v-bind:href="url">Visit</a>

<!-- Shorthand (: prefix) — use this in practice -->
<a :href="url">Visit</a>
<img :src="imageUrl" :alt="imageAlt">
<button :disabled="isLoading">Submit</button>
```

```vue
<template>
  <div>
    <a :href="url">Visit website</a>
    <br>
    <img :src="imageUrl" :alt="imageAlt" />
    <br>
    <button :disabled="isLoading">
      Submit
    </button>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const url = ref('https://example.com')
const imageUrl = ref('https://play-lh.googleusercontent.com/NW2ASwJ4qtxfThhVIpm4641sR4o-yGv80yqaJnOnpC4lEmdxEcNTFcF6-TlZYtmdaA=w480-h960-rw')
const imageAlt = ref('Placeholder image')
const isLoading = ref(true)
</script>

<style scoped>
button:disabled {
  opacity: 0.5;
  cursor: not-allowed;
}

img {
  width: 100px;
  height: 100px;
}
</style>
```
**Vanilla equivalent:** `element.setAttribute('href', url)` — called manually after every change.