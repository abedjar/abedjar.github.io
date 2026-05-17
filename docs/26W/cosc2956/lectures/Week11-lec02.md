---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Lecture 6: Persistence — Files, FastAPI & Vue

---


## Phase 1 — What is Persistence?

??? note "🗣️ Talking Points"
    - Ask: *"In Lec 5 we built a FastAPI server with a courses list. What happened when you stopped the server and started it again?"* — all added/deleted courses were gone. That's the problem.
    - Persistence = data that outlives the process that created it. When the server restarts, the data is still there.
    - Analogy: RAM vs hard drive. The in-memory list is RAM — gone when power is cut. A file is the hard drive — survives restarts.
    - Draw the difference on the board: in-memory (list in Python) vs persistent (file on disk, database).
    - Today we use JSON files — simple, readable, no installation. Not suitable for production, but perfect for learning the concept.

### The problem with in-memory data

```python
# Lec 5 — data lives only in RAM
courses = [
    {"id": 1, "name": "Internet Tools"},
    {"id": 2, "name": "Programming 1"},
]
# Server restarts → list resets → all changes are lost
```

### Persistence — data on disk

```
Server starts
    │
    ├── reads data.json into memory
    │
    User adds a course
    │
    ├── updates the in-memory list
    ├── writes the updated list back to data.json  ← persistence
    │
    Server restarts
    │
    └── reads data.json again → data is still there ✅
```

### Three tiers of persistence (simple → production)

| Tier | Storage | Good for |
|---|---|---|
| **1 — Text / JSON files** | Flat files on disk | Learning, prototypes, config |
| **2 — SQLite** | Single-file database | Small apps, desktop tools |
| **3 — PostgreSQL / MySQL** | Full database server | Production web applications |

Today we use Tier 1 — JSON files. The concept is identical at every tier. Only the storage mechanism changes.

---

➡️ *Start simple — one file, one resource.*

---

## Part A — Example 1: Notes API

---

## Phase 2 — Notes API: Basic File Persistence

??? note "🗣️ Talking Points"
    - This example is deliberately minimal. One resource (notes), one file (`notes.json`), three routes.
    - The goal is for students to clearly see the pattern: read from file → do something → write back to file.
    - Build the file layer first (`storage.py`), then the routes (`main.py`), then the Vue page.
    - After the first POST, open `notes.json` in VSCode — students should see the file update live. That moment makes persistence tangible.

### What we're building

A Notes app. Notes survive server restarts. Three operations: list all, add one, delete one.

```
notes.json  ←→  main.py (FastAPI)  ←→  Vue (browser)
```

### Project structure

```
notes-app/
├── api/
│   ├── main.py        ← FastAPI routes
│   ├── storage.py     ← file read/write logic
│   └── notes.json     ← the data file
└── app/
    └── src/
        └── App.vue
```

---

### `storage.py` — the file layer

One rule: **all file access goes through this file. Routes never touch the file directly.**

```python title="api/storage.py"
import json, os

FILE = "notes.json"

def read_notes() -> list:           # (1)
    if not os.path.exists(FILE):
        return []
    with open(FILE, "r") as f:
        return json.load(f)

def write_notes(notes: list):       # (2)
    with open(FILE, "w") as f:
        json.dump(notes, f, indent=2)
```

1. `read_notes()` — returns the list from the file. If the file doesn't exist yet, returns an empty list safely.
2. `write_notes()` — overwrites the file with the current list. `indent=2` keeps it human-readable.

---

### `main.py` — the routes

```python title="api/main.py"
from fastapi import FastAPI, HTTPException
from fastapi.middleware.cors import CORSMiddleware
from pydantic import BaseModel
from storage import read_notes, write_notes   # (1)

app = FastAPI()
app.add_middleware(CORSMiddleware,
    allow_origins=["http://localhost:5173"], allow_methods=["*"], allow_headers=["*"])

class Note(BaseModel):
    text: str

@app.get("/notes")
def get_notes():
    return read_notes()                        # (2)

@app.post("/notes")
def add_note(note: Note):
    notes = read_notes()                       # (3)
    new = {"id": len(notes) + 1, "text": note.text}
    notes.append(new)
    write_notes(notes)                         # (4)
    return new

@app.delete("/notes/{note_id}")
def delete_note(note_id: int):
    notes = read_notes()
    updated = [n for n in notes if n["id"] != note_id]
    if len(updated) == len(notes):
        raise HTTPException(status_code=404, detail="Note not found")
    write_notes(updated)
    return {"message": "Deleted"}
```

1. Import from `storage.py` — the route never opens a file directly.
2. GET just reads and returns. No state lives in the route file.
3. POST: read current state → modify → write back. This is the persistence pattern.
4. After `write_notes()`, the data is on disk. Restart the server — it's still there.

---

### `App.vue` — the Vue side

=== "Template"
    ```vue
    <template>
      <div class="page">
        <h1>📝 Notes</h1>

        <div class="add-row">
          <input v-model="newText" @keyup.enter="addNote" placeholder="New note..." />
          <button @click="addNote">Add</button>
        </div>

        <p v-if="loading" class="muted">Loading...</p>

        <ul class="note-list">
          <li v-for="note in notes" :key="note.id" class="note-item">
            {{ note.text }}
            <button @click="deleteNote(note.id)" class="del">✕</button>
          </li>
        </ul>
      </div>
    </template>
    ```

=== "Script"
    ```vue
    <script setup>
    import { ref, onMounted } from 'vue'

    const API     = 'http://localhost:8000'
    const notes   = ref([])
    const loading = ref(true)
    const newText = ref('')

    onMounted(async () => {
      const res = await fetch(`${API}/notes`)
      notes.value = await res.json()
      loading.value = false
    })

    async function addNote() {
      if (!newText.value.trim()) return
      const res = await fetch(`${API}/notes`, {
        method:  'POST',
        headers: { 'Content-Type': 'application/json' },
        body:    JSON.stringify({ text: newText.value }),
      })
      const created = await res.json()
      notes.value.push(created)
      newText.value = ''
    }

    async function deleteNote(id) {
      await fetch(`${API}/notes/${id}`, { method: 'DELETE' })
      notes.value = notes.value.filter(n => n.id !== id)
    }
    </script>
    ```

=== "Style"
    ```vue
    <style scoped>
    .page      { max-width: 500px; margin: 2rem auto; padding: 0 1rem; font-family: system-ui, sans-serif; }
    h1         { color: #111827; margin-bottom: 1rem; }
    .add-row   { display: flex; gap: 0.5rem; margin-bottom: 1rem; }
    .add-row input  { flex: 1; padding: 0.5rem 0.75rem; border: 1px solid #d1d5db; border-radius: 6px; outline: none; }
    .add-row button { padding: 0.5rem 1rem; background: #6366f1; color: white; border: none; border-radius: 6px; cursor: pointer; }
    .muted     { color: #9ca3af; font-size: 0.9rem; }
    .note-list { list-style: none; padding: 0; }
    .note-item { display: flex; justify-content: space-between; padding: 0.6rem 0; border-bottom: 1px solid #f3f4f6; font-size: 0.9rem; }
    .del       { background: none; border: none; color: #d1d5db; cursor: pointer; }
    .del:hover { color: #dc2626; }
    </style>
    ```

!!! example "🎯 Try it live"
    1. Add a note — open `notes.json` in VSCode and watch it update
    2. Stop the FastAPI server (`Ctrl+C`)
    3. Start it again (`uvicorn main:app --reload`)
    4. Refresh the Vue app — all notes are still there ✅

---

➡️ *Pattern is clear. Now let's build something realistic.*

---

## Part B — Example 2: Student Portal

---

## Phase 3 — Student Portal: Master-Detail with Files

??? note "🗣️ Talking Points"
    - This is a full multi-view application. Students list → student detail → enrolments.
    - Master-detail: the "master" is the list of students. The "detail" is one student's courses.
    - Introduce `data.py` (business logic) before the routes. The separation of concerns is the teaching point: `data.py` knows about files and data, `main.py` knows about HTTP, Vue knows about the UI.
    - Build in this order: data files → `data.py` → `main.py` routes → Vue views.
    - Keep each snippet short. Stop and test after each route before moving on.

### What we're building

A Student Portal with two views:

- **Students list** (`/`) — all students, click one to see their courses
- **Student detail** (`/students/:id`) — one student + their enrolled courses

```
View 1: Students List          View 2: Student Detail
┌─────────────────────┐        ┌──────────────────────────┐
│ Students            │        │ ← Back                   │
│                     │  click │                          │
│ Alice Smith    →    │ ──────►│ Alice Smith              │
│ Bob Jones      →    │        │ s1234567                 │
│ Carol Wu       →    │        │                          │
│                     │        │ Enrolled Courses         │
│ [+ Add Student]     │        │  COSC2956  In Progress   │
└─────────────────────┘        │  COSC1111  Completed     │
                               │                          │
                               │ [+ Enrol in Course]      │
                               └──────────────────────────┘
```

### Project structure

```
student-portal/
├── api/
│   ├── main.py          ← routes only
│   ├── data.py          ← business logic + file access
│   ├── students.json    ← student records
│   └── enrolments.json  ← enrolment records
└── app/
    └── src/
        ├── App.vue
        └── views/
            ├── StudentsView.vue
            └── StudentDetailView.vue
```

---

### The data files

`students.json`:
```json
[
  {"id": 1, "name": "Alice Smith",  "studentId": "s1234567"},
  {"id": 2, "name": "Bob Jones",    "studentId": "s2345678"},
  {"id": 3, "name": "Carol Wu",     "studentId": "s3456789"}
]
```

`enrolments.json`:
```json
[
  {"id": 1, "studentId": 1, "code": "COSC2956", "name": "Internet Tools",  "status": "In Progress"},
  {"id": 2, "studentId": 1, "code": "COSC1111", "name": "Programming 1",   "status": "Completed"},
  {"id": 3, "studentId": 2, "code": "MATH1234", "name": "Discrete Maths",  "status": "In Progress"}
]
```

!!! note "Master-detail relationship"
    `enrolments.studentId` links to `students.id`. This is a foreign key — the same concept used in databases. A student can have many enrolments; each enrolment belongs to one student.

---

### `data.py` — business logic layer

This file has one job: know about the files and the data. Routes ask it questions, it answers.

```python title="api/data.py"
import json, os

STUDENTS_FILE    = "students.json"
ENROLMENTS_FILE  = "enrolments.json"

# ── Generic helpers ───────────────────────────────────────

def _read(file: str) -> list:
    if not os.path.exists(file): return []
    with open(file) as f: return json.load(f)

def _write(file: str, data: list):
    with open(file, "w") as f: json.dump(data, f, indent=2)

def _next_id(records: list) -> int:
    return max((r["id"] for r in records), default=0) + 1

# ── Students ──────────────────────────────────────────────

def get_students() -> list:
    return _read(STUDENTS_FILE)

def get_student(student_id: int) -> dict | None:        # (1)
    return next((s for s in get_students() if s["id"] == student_id), None)

def add_student(name: str, student_id_str: str) -> dict:
    students = get_students()
    new = {"id": _next_id(students), "name": name, "studentId": student_id_str}
    students.append(new)
    _write(STUDENTS_FILE, students)
    return new

# ── Enrolments ────────────────────────────────────────────

def get_enrolments(student_id: int) -> list:            # (2)
    return [e for e in _read(ENROLMENTS_FILE) if e["studentId"] == student_id]

def add_enrolment(student_id: int, code: str, name: str, status: str) -> dict:
    enrolments = _read(ENROLMENTS_FILE)
    new = {"id": _next_id(enrolments), "studentId": student_id,
           "code": code, "name": name, "status": status}
    enrolments.append(new)
    _write(ENROLMENTS_FILE, enrolments)
    return new

def delete_enrolment(enrolment_id: int) -> bool:
    enrolments = _read(ENROLMENTS_FILE)
    updated    = [e for e in enrolments if e["id"] != enrolment_id]
    if len(updated) == len(enrolments): return False
    _write(ENROLMENTS_FILE, updated)
    return True
```

1. `dict | None` — Python 3.10+ union type. Returns the student dict if found, `None` if not.
2. Filter by `studentId` — only return enrolments belonging to that student.

---

### `main.py` — routes only

Routes are thin. They validate input, call `data.py`, return results.

```python title="api/main.py"
from fastapi import FastAPI, HTTPException
from fastapi.middleware.cors import CORSMiddleware
from pydantic import BaseModel
import data                            # (1)

app = FastAPI()
app.add_middleware(CORSMiddleware,
    allow_origins=["http://localhost:5173"], allow_methods=["*"], allow_headers=["*"])

# ── Models ────────────────────────────────────────────────

class NewStudent(BaseModel):
    name:      str
    studentId: str

class NewEnrolment(BaseModel):
    code:   str
    name:   str
    status: str

# ── Student routes ────────────────────────────────────────

@app.get("/students")
def list_students():
    return data.get_students()         # (2)

@app.get("/students/{sid}")
def get_student(sid: int):
    student = data.get_student(sid)
    if not student:
        raise HTTPException(404, "Student not found")
    return student

@app.post("/students")
def create_student(body: NewStudent):
    return data.add_student(body.name, body.studentId)

# ── Enrolment routes ──────────────────────────────────────

@app.get("/students/{sid}/enrolments")
def list_enrolments(sid: int):         # (3)
    if not data.get_student(sid):
        raise HTTPException(404, "Student not found")
    return data.get_enrolments(sid)

@app.post("/students/{sid}/enrolments")
def create_enrolment(sid: int, body: NewEnrolment):
    if not data.get_student(sid):
        raise HTTPException(404, "Student not found")
    return data.add_enrolment(sid, body.code, body.name, body.status)

@app.delete("/enrolments/{eid}")
def remove_enrolment(eid: int):
    if not data.delete_enrolment(eid):
        raise HTTPException(404, "Enrolment not found")
    return {"message": "Deleted"}
```

1. `import data` — the entire business logic layer is one import.
2. Each route is 1–3 lines. The heavy lifting is in `data.py`.
3. Nested route: `/students/1/enrolments` — returns all enrolments for student 1. This is standard REST convention for related resources.

---

### Vue — setup & router

Install router in the `app/` folder:

```bash
npm install vue-router
```

`src/router/index.js`:

```js
import { createRouter, createWebHistory } from 'vue-router'
import StudentsView      from '../views/StudentsView.vue'
import StudentDetailView from '../views/StudentDetailView.vue'

export default createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/',              component: StudentsView },
    { path: '/students/:id',  component: StudentDetailView },
  ]
})
```

`src/main.js`:

```js
import { createApp } from 'vue'
import './style.css'
import App    from './App.vue'
import router from './router'

createApp(App).use(router).mount('#app')
```

`src/App.vue`:

```vue
<template>
  <div class="shell">
    <nav class="nav">
      <RouterLink to="/" class="brand">🎓 Student Portal</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>

<style>
* { box-sizing: border-box; margin: 0; }
body { background: #f3f4f6; font-family: system-ui, sans-serif; }
.shell { min-height: 100vh; }
.nav   { background: white; padding: 1rem 2rem; box-shadow: 0 1px 3px rgba(0,0,0,0.08); }
.brand { font-weight: 700; color: #6366f1; text-decoration: none; font-size: 1.1rem; }
</style>
```

---

### `StudentsView.vue`

=== "Template"
    ```vue
    <template>
      <div class="page">
        <div class="page-header">
          <h1>Students</h1>
          <button @click="showForm = !showForm" class="btn">
            {{ showForm ? 'Cancel' : '+ Add Student' }}
          </button>
        </div>

        <!-- Add form -->
        <div v-if="showForm" class="form-card">
          <input v-model="form.name"      placeholder="Full name"   class="input" />
          <input v-model="form.studentId" placeholder="Student ID"  class="input" />
          <button @click="addStudent" class="btn">Save</button>
        </div>

        <!-- List -->
        <p v-if="loading" class="muted">Loading...</p>
        <div v-else class="student-list">
          <RouterLink
            v-for="s in students" :key="s.id"
            :to="`/students/${s.id}`"
            class="student-row"
          >
            <span class="student-name">{{ s.name }}</span>
            <span class="student-id">{{ s.studentId }}</span>
            <span class="arrow">→</span>
          </RouterLink>
        </div>
      </div>
    </template>
    ```

=== "Script"
    ```vue
    <script setup>
    import { ref, reactive, onMounted } from 'vue'

    const API      = 'http://localhost:8000'
    const students = ref([])
    const loading  = ref(true)
    const showForm = ref(false)
    const form     = reactive({ name: '', studentId: '' })

    onMounted(async () => {
      const res = await fetch(`${API}/students`)
      students.value = await res.json()
      loading.value  = false
    })

    async function addStudent() {
      if (!form.name || !form.studentId) return
      const res = await fetch(`${API}/students`, {
        method:  'POST',
        headers: { 'Content-Type': 'application/json' },
        body:    JSON.stringify(form),
      })
      students.value.push(await res.json())
      form.name = ''; form.studentId = ''
      showForm.value = false
    }
    </script>
    ```

=== "Style"
    ```vue
    <style scoped>
    .page        { max-width: 600px; margin: 2rem auto; padding: 0 1rem; }
    .page-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 1.5rem; }
    h1           { font-size: 1.5rem; color: #111827; }
    .btn         { padding: 0.45rem 1rem; background: #6366f1; color: white; border: none; border-radius: 6px; cursor: pointer; font-size: 0.88rem; }
    .form-card   { background: white; border-radius: 8px; padding: 1rem; box-shadow: 0 1px 4px rgba(0,0,0,0.07); margin-bottom: 1rem; display: flex; gap: 0.5rem; flex-wrap: wrap; }
    .input       { padding: 0.45rem 0.7rem; border: 1px solid #d1d5db; border-radius: 6px; font-size: 0.88rem; outline: none; }
    .muted       { color: #9ca3af; font-size: 0.9rem; }
    .student-list   { display: flex; flex-direction: column; gap: 0.5rem; }
    .student-row    { display: flex; align-items: center; gap: 1rem; background: white; padding: 0.9rem 1rem; border-radius: 8px; box-shadow: 0 1px 3px rgba(0,0,0,0.06); text-decoration: none; color: #111827; transition: box-shadow 0.15s; }
    .student-row:hover { box-shadow: 0 3px 8px rgba(0,0,0,0.1); }
    .student-name   { flex: 1; font-weight: 500; }
    .student-id     { font-size: 0.82rem; color: #9ca3af; }
    .arrow          { color: #6366f1; }
    </style>
    ```

---

### `StudentDetailView.vue`

=== "Template"
    ```vue
    <template>
      <div class="page">
        <RouterLink to="/" class="back">← Students</RouterLink>

        <!-- Student header -->
        <div v-if="student" class="student-card">
          <h1>{{ student.name }}</h1>
          <p class="sid">{{ student.studentId }}</p>
        </div>

        <!-- Enrolments -->
        <div class="section-header">
          <h2>Courses</h2>
          <button @click="showForm = !showForm" class="btn">
            {{ showForm ? 'Cancel' : '+ Enrol' }}
          </button>
        </div>

        <!-- Enrol form -->
        <div v-if="showForm" class="form-card">
          <input v-model="form.code"  placeholder="Course code" class="input" />
          <input v-model="form.name"  placeholder="Course name" class="input" />
          <div class="radio-row">
            <label><input type="radio" v-model="form.status" value="In Progress" /> In Progress</label>
            <label><input type="radio" v-model="form.status" value="Completed"   /> Completed</label>
          </div>
          <button @click="enrol" class="btn">Save</button>
        </div>

        <!-- Enrolments list -->
        <p v-if="loadingE" class="muted">Loading courses...</p>
        <div v-else class="enrol-list">
          <div v-for="e in enrolments" :key="e.id" class="enrol-row">
            <div>
              <span class="code">{{ e.code }}</span>
              <span class="ename">{{ e.name }}</span>
            </div>
            <div class="row-right">
              <span :class="['badge', e.status === 'Completed' ? 'green' : 'blue']">{{ e.status }}</span>
              <button @click="removeEnrolment(e.id)" class="del">✕</button>
            </div>
          </div>
          <p v-if="!enrolments.length" class="muted">No courses yet.</p>
        </div>
      </div>
    </template>
    ```

=== "Script"
    ```vue
    <script setup>
    import { ref, reactive, onMounted } from 'vue'
    import { useRoute } from 'vue-router'

    const API   = 'http://localhost:8000'
    const route = useRoute()
    const sid   = Number(route.params.id)    // (1)

    const student    = ref(null)
    const enrolments = ref([])
    const loadingE   = ref(true)
    const showForm   = ref(false)
    const form       = reactive({ code: '', name: '', status: 'In Progress' })

    onMounted(async () => {
      const [sRes, eRes] = await Promise.all([       // (2)
        fetch(`${API}/students/${sid}`),
        fetch(`${API}/students/${sid}/enrolments`),
      ])
      student.value    = await sRes.json()
      enrolments.value = await eRes.json()
      loadingE.value   = false
    })

    async function enrol() {
      if (!form.code || !form.name) return
      const res = await fetch(`${API}/students/${sid}/enrolments`, {
        method:  'POST',
        headers: { 'Content-Type': 'application/json' },
        body:    JSON.stringify(form),
      })
      enrolments.value.push(await res.json())
      form.code = ''; form.name = ''; form.status = 'In Progress'
      showForm.value = false
    }

    async function removeEnrolment(id) {
      await fetch(`${API}/enrolments/${id}`, { method: 'DELETE' })
      enrolments.value = enrolments.value.filter(e => e.id !== id)
    }
    </script>
    ```

    1. `Number(route.params.id)` — route params are always strings. Convert before using with the API.
    2. `Promise.all()` fires both fetches in parallel — student data and enrolments load simultaneously instead of sequentially. Faster UX, same code length.

=== "Style"
    ```vue
    <style scoped>
    .page         { max-width: 600px; margin: 2rem auto; padding: 0 1rem; }
    .back         { font-size: 0.85rem; color: #6366f1; text-decoration: none; display: inline-block; margin-bottom: 1rem; }
    .student-card { background: white; border-radius: 8px; padding: 1.2rem 1.5rem; box-shadow: 0 1px 4px rgba(0,0,0,0.07); margin-bottom: 1.5rem; }
    h1            { font-size: 1.4rem; color: #111827; margin-bottom: 0.25rem; }
    .sid          { font-size: 0.85rem; color: #9ca3af; }
    .section-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 0.75rem; }
    h2            { font-size: 1rem; font-weight: 600; color: #374151; }
    .btn          { padding: 0.4rem 0.9rem; background: #6366f1; color: white; border: none; border-radius: 6px; cursor: pointer; font-size: 0.85rem; }
    .form-card    { background: white; border-radius: 8px; padding: 1rem; box-shadow: 0 1px 4px rgba(0,0,0,0.07); margin-bottom: 1rem; display: flex; flex-direction: column; gap: 0.6rem; }
    .input        { padding: 0.45rem 0.7rem; border: 1px solid #d1d5db; border-radius: 6px; font-size: 0.88rem; outline: none; }
    .radio-row    { display: flex; gap: 1rem; font-size: 0.85rem; }
    .muted        { color: #9ca3af; font-size: 0.88rem; margin-top: 0.5rem; }
    .enrol-list   { display: flex; flex-direction: column; gap: 0.5rem; }
    .enrol-row    { display: flex; justify-content: space-between; align-items: center; background: white; padding: 0.75rem 1rem; border-radius: 8px; box-shadow: 0 1px 3px rgba(0,0,0,0.05); }
    .code         { font-weight: 600; font-size: 0.85rem; color: #374151; margin-right: 0.5rem; }
    .ename        { font-size: 0.85rem; color: #6b7280; }
    .row-right    { display: flex; align-items: center; gap: 0.75rem; }
    .badge        { font-size: 0.72rem; font-weight: 600; padding: 0.15rem 0.55rem; border-radius: 999px; }
    .green        { background: #dcfce7; color: #16a34a; }
    .blue         { background: #dbeafe; color: #2563eb; }
    .del          { background: none; border: none; color: #d1d5db; cursor: pointer; font-size: 0.95rem; }
    .del:hover    { color: #dc2626; }
    </style>
    ```

!!! example "🎯 Try it live"
    - Open Vue at `http://localhost:5173` — three students listed
    - Click **Alice Smith** — her two enrolments appear
    - Click **+ Enrol** — add a new course, it appears in the list
    - Open `enrolments.json` in VSCode — the new enrolment is there
    - Stop FastAPI → restart it → refresh Vue — everything is still there ✅
    - Click **Back** — return to the student list
    - Add a new student — appears immediately, persists across restarts

---

➡️ *Files work great for learning. Let's talk about what comes after.*

---

## Phase 4 — Beyond Files: Databases

??? note "🗣️ Talking Points"
    - Keep this short — 10 minutes, concept only. No code.
    - The goal is to plant the seed and map where students are in the bigger picture.
    - Ask: *"What are the limitations of JSON files?"* — no concurrent writes (two users saving at the same moment corrupt the file), no search, no relationships enforced, slow for large datasets.
    - Make clear: the FastAPI code barely changes when you swap files for a database. The routes stay the same. Only `data.py` changes — from `json.load()` to a database query.

### Limitations of file-based storage

| Problem | What happens |
|---|---|
| **Concurrent writes** | Two users save at the same time → file corruption |
| **No search** | To find one record, Python reads the whole file |
| **No enforced relationships** | Nothing stops an enrolment with a non-existent `studentId` |
| **Size** | A file with 100,000 records is slow to load every request |

These problems don't matter in this course — we have one user and small data. But they matter in production.

### The database tiers

```
JSON files (today)
    ↓  outgrow when: multiple users, or data > a few thousand records
SQLite
    • Single file database
    • SQL queries, enforced relationships, concurrent reads
    • pip install sqlalchemy — no server needed
    ↓  outgrow when: high traffic, multiple servers
PostgreSQL / MySQL
    • Full client-server database
    • Handles millions of records, concurrent writes, backups
    • Used by: Instagram, GitLab, Shopify
```

### How little the FastAPI code changes

```python
# Today — file storage
def get_students() -> list:
    with open("students.json") as f:
        return json.load(f)

# With a database — same function signature, different body
def get_students() -> list:
    return db.query(Student).all()   # SQLAlchemy ORM
```

The routes in `main.py` don't change at all. Only `data.py` changes — and only its internals.

### The connection to future courses

!!! info "Where this goes"
    The concepts you've learned in this course — HTTP, REST APIs, JSON, client-server architecture — are the foundation of every web stack.

    **COSC3000-level courses** will cover:

    - **Databases** — SQL, SQLite, PostgreSQL, data modelling
    - **ORM** — SQLAlchemy, connecting Python to a database without raw SQL
    - **Authentication** — JWT tokens, sessions, OAuth
    - **Deployment** — hosting Vue on Netlify/Vercel, FastAPI on Railway/Render
    - **Full-stack frameworks** — Django (Python) or Next.js (JavaScript) for integrated front + back

    Everything builds on what you've learned here.

---

## Phase 5 — Wrap-up

### What we built today

| Example | What it demonstrated |
|---|---|
| Notes API | Basic file persistence — read/write on every operation |
| Student Portal | Master-detail, two JSON files, business logic layer, multi-view Vue |

### The full-stack architecture

```
Browser (Vue — port 5173)
  StudentsView   → GET  /students
  StudentDetail  → GET  /students/:id
                 → GET  /students/:id/enrolments
                 → POST /students/:id/enrolments
                 → DELETE /enrolments/:id
        ↕  HTTP + JSON
FastAPI (Python — port 8000)
  main.py   → routes (thin — validate + delegate)
  data.py   → business logic (read file, transform, write file)
        ↕  json.load / json.dump
  students.json
  enrolments.json
```

### Key patterns from this lecture

| Pattern | Where it appears |
|---|---|
| Separate `data.py` from `main.py` | Keeps routes thin, logic testable |
| Read → modify → write | Every mutating operation (POST, DELETE) |
| `Promise.all()` for parallel fetches | `StudentDetailView` — student + enrolments |
| Nested REST routes `/students/:id/enrolments` | Related resources linked by ID |

---

*COSC2956 Internet Tools — End of Lecture 6 & the Course*
