---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Assignment 1: Vue Basics — Student Dashboard

---

!!! info "Assignment Overview"
    | | |
    |---|---|
    | **Topic** | Vue 3 fundamentals — reactivity, directives, computed properties, components, props |
    | **Submission** | 1 × ZIP file + 1 × screen recording (max 60 seconds) |
    | **Due** | See course portal |
    | **Weight** | See course portal |

---

## The Brief

You will build a **Student Dashboard** — a single-page Vue 3 application that displays a set of enrolled courses as cards, shows a live summary, and lets the user search and filter the list.

You are given the data. Everything else — the project setup, the components, the layout, and the logic — is yours to build.

---

## What You Are Building

The app must display course cards in a grid, with a search input, status filter buttons, and a summary bar. The sketch below shows the expected layout — your visual design can differ, but all elements must be present.

```
┌──────────────────────────────────────────────────────────┐
│  📚 My Dashboard                                         │
│                                                          │
│  [Search by name or code...]                             │
│                                                          │
│  [All]  [In Progress]  [Completed]                       │
│                                                          │
│  Enrolled: 5   In Progress: 3   Completed: 2             │
│                                                          │
│  ┌─────────────────┐  ┌─────────────────┐               │
│  │  In Progress    │  │   Completed     │               │
│  │  COSC2956       │  │   COSC1111      │               │
│  │  Internet Tools │  │   Programming 1 │               │
│  │  Sem 1 · 12cp   │  │   Sem 2 · 12cp  │               │
│  └─────────────────┘  └─────────────────┘               │
└──────────────────────────────────────────────────────────┘
```

---

## The Data

Use this array exactly as shown. Declare it as a `ref()` in `App.vue`. **Do not modify it.**

```js
const courses = ref([
  { id: 1, code: 'COSC2956', name: 'Internet Tools',       credits: 12, semester: 'Sem 1', status: 'In Progress' },
  { id: 2, code: 'COSC1111', name: 'Programming 1',        credits: 12, semester: 'Sem 2', status: 'Completed'   },
  { id: 3, code: 'COSC2222', name: 'Data Structures',      credits: 12, semester: 'Sem 1', status: 'Completed'   },
  { id: 4, code: 'COSC3333', name: 'Web Application Dev',  credits: 12, semester: 'Sem 2', status: 'In Progress' },
  { id: 5, code: 'MATH1234', name: 'Discrete Mathematics', credits: 12, semester: 'Sem 1', status: 'In Progress' },
])
```

---

## Requirements

Complete **all** of the following requirements.

---

### R1 — Project setup

Set up a Vue 3 project using Vite and Tailwind CSS, following the same steps used in lectures. The app must start with `npm run dev` and open in the browser without errors.

---

### R2 — Course data

In `App.vue`, declare the provided courses array as a `ref()`. The data must not be modified — use it exactly as given above.

---

### R3 — `CourseCard` component

Create `src/components/CourseCard.vue`. This component must:

- Accept **all five fields** of a course as individual props, with correct types declared:

    | Prop | Type |
    |---|---|
    | `code` | String |
    | `name` | String |
    | `credits` | Number |
    | `semester` | String |
    | `status` | String |

- Display all five values visibly inside the card
- Show the `status` value as a badge with a **different colour** for each status:
    - `"Completed"` → a green colour scheme
    - `"In Progress"` → a blue or amber colour scheme

---

### R4 — Render cards with `v-for`

In `App.vue`, use `v-for` to render one `<CourseCard>` for each course in the array. Each card must receive its course data as individual props. Use `course.id` as the `:key`.

---

### R5 — Summary bar with `computed`

Display three counts somewhere on the page — above or below the grid:

- **Enrolled** — total number of courses
- **In Progress** — number with `status === 'In Progress'`
- **Completed** — number with `status === 'Completed'`

All three must be `computed` properties. Hardcoded numbers will not receive marks.

---

### R6 — Live search

Add a text input that filters the displayed cards in real time. The filter must:

- Be bound with `v-model` to a `ref`
- Match against both `name` and `code` fields
- Be case-insensitive
- Use a `computed` property for the filtered list (not a method)

---

### R7 — Status filter buttons

Add three buttons: **All**, **In Progress**, **Completed**. Clicking a button shows only cards with the matching status. **All** removes the filter. The currently active button must look visually different from the inactive ones.

The status filter and the search (R6) must work **together** — both are applied at the same time.

---

## Submission

### ZIP file

Name it `studentID_A1.zip`. It must contain only these files:

```
studentID_A1/
└── src/
    ├── App.vue
    ├── style.css
    └── components/
        └── CourseCard.vue
```

!!! warning "Do not include `node_modules`"
    Leave it out entirely. It can be hundreds of megabytes. The marker runs `npm install` themselves.

---

### Screen recording

Name it `studentID_A1.mp4`. Maximum **60 seconds**. No exceptions — recordings over 60 seconds will not be marked.

The video must show the following, **in this order**:

1. `App.vue` open in VSCode — scroll through it briefly
2. `CourseCard.vue` open in VSCode — scroll through it briefly
3. Run `npm run dev` in the terminal
4. The browser — all 5 course cards visible
5. Type in the search input — cards filter live
6. Click each filter button — cards update by status
7. Point at the summary counts and confirm they are correct

!!! tip "60 seconds is not much"
    Do a rehearsal run before you record. Switch tabs quickly, don't narrate, don't explain. Just show it working.

---

## Marking Rubric

| # | Requirement | Marks | What the marker checks |
|---|---|---|---|
| R1 | Project runs | 1 | `npm install && npm run dev` opens the app without console errors |
| R2 | Data as `ref()` | 1 | `courses` is `ref([...])`, all 5 entries present and unmodified |
| R3 | `CourseCard` component | 4 | Props declared with correct types (1) · all 5 values displayed (1) · status badge present (1) · badge colour differs by status (1) |
| R4 | `v-for` + `:key` | 1 | Cards rendered with `v-for`, `:key="course.id"` used |
| R5 | Computed summary | 2 | All 3 counts are correct (1) · all 3 use `computed` not hardcoded values (1) |
| R6 | Search filter | 3 | `v-model` on input (1) · matches name and code, case-insensitive (1) · uses `computed` (1) |
| R7 | Status filter | 3 | All 3 buttons change the list (1) · active button styled differently (1) · search + filter work together (1) |
| — | Video | 1 | Under 60 sec · all 7 steps visible in order |
| | **Total** | **16** | |

---

!!! danger "Automatic zero conditions"
    Any of the following results in **zero marks** for the whole assignment:

    - `node_modules` included in the ZIP
    - Video is over 60 seconds
    - `npm install && npm run dev` fails or shows console errors
    - The `courses` data array has been modified

---

## Hints

These hints show you the *technique* — you still need to apply it yourself.

??? tip "How to set up Vue Router + Tailwind (revision)"
    ```bash
    npm create vite@latest student-dashboard -- --template vue
    cd student-dashboard
    npm install
    npm install -D tailwindcss @tailwindcss/vite
    ```

    `vite.config.js`:
    ```js
    import { defineConfig } from 'vite'
    import vue from '@vitejs/plugin-vue'
    import tailwindcss from '@tailwindcss/vite'

    export default defineConfig({
      plugins: [vue(), tailwindcss()],
    })
    ```

    `src/style.css`:
    ```css
    @import "tailwindcss";
    ```

??? tip "How to colour the status badge based on a prop value"
    A `computed` inside `CourseCard.vue` that maps the `status` prop to a Tailwind class string is cleaner than a long `v-if` chain in the template:

    ```js
    const badgeClass = computed(() =>
      props.status === 'Completed'
        ? 'bg-green-100 text-green-700'
        : 'bg-blue-100 text-blue-700'
    )
    ```

    Then in the template:
    ```vue
    <span :class="['text-xs px-2 py-0.5 rounded-full font-medium', badgeClass]">
      {{ status }}
    </span>
    ```

??? tip "How to apply search and status filter together"
    Use one `computed` that chains both filters. Apply the status filter first, then narrow further with the search:

    ```js
    const filteredCourses = computed(() => {
      let result = courses.value

      if (activeFilter.value !== 'All') {
        result = result.filter(c => c.status === activeFilter.value)
      }

      if (searchQuery.value.trim()) {
        const q = searchQuery.value.toLowerCase()
        result = result.filter(c =>
          c.name.toLowerCase().includes(q) ||
          c.code.toLowerCase().includes(q)
        )
      }

      return result
    })
    ```

??? tip "How to style the active filter button"
    Bind `:class` conditionally based on whether the button's value matches `activeFilter`:

    ```vue
    <button
      v-for="f in ['All', 'In Progress', 'Completed']"
      :key="f"
      @click="activeFilter = f"
      :class="activeFilter === f
        ? 'bg-indigo-600 text-white'
        : 'bg-white text-gray-600 border'"
      class="px-4 py-1.5 rounded-full text-sm">
      {{ f }}
    </button>
    ```

---

*COSC2956 Internet Tools — Assignment 1*