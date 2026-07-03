---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Lecture 5: Python & FastAPI — Building Your Own API

---


## Part A — Python

---

## Phase 1 — Install & Hello World

??? note "🗣️ Talking Points"
    - Ask: *"Who has used Python before?"* — Most students will have. This is revision, not from scratch.
    - The important thing to check is the version. FastAPI requires Python 3.8+. Python 2 is dead — if a student has it, they need to upgrade.
    - On macOS `python` might point to Python 2. Always use `python3` to be safe.
    - Run hello world live. Then show `python3 -i` (interactive mode) — you can use it like a calculator, test expressions, explore data structures.

### Install

Download from [python.org/downloads](https://python.org/downloads) — get the latest 3.x version.

Verify in the terminal:

```bash
python3 --version   # Python 3.11.x or similar
pip3 --version      # pip 23.x ...
```

!!! warning "Windows users"
    Use `python` and `pip` instead of `python3` and `pip3`. If neither works, add Python to your PATH during installation — check *"Add Python to PATH"* in the installer.

### Hello World

Create `hello.py`:

```python title="hello.py"
print("Hello, World!")
print("Hello from COSC2956!")
```

Run it:

```bash
python3 hello.py
```

### Interactive mode

```bash
python3   # opens the REPL — exit with quit() or Ctrl+D
```

```python
>>> 2 + 2
4
>>> "hello".upper()
'HELLO'
>>> [1, 2, 3][0]
1
```

Use this to test expressions quickly without creating a file.

---

➡️ *Now let's cover the Python you'll actually need to write a FastAPI server.*

---

## Phase 2 — Python Essentials

??? note "🗣️ Talking Points"
    - This is fast — 20 minutes for the whole section. The goal isn't to teach Python comprehensively, it's to cover what FastAPI needs.
    - Students who already know Python: these are anchors, not new content.
    - Students who don't: focus on the *shape* of Python — indentation instead of braces, no semicolons, type annotations are optional but FastAPI uses them.
    - Run every snippet live in `python3 -i` or a scratch file. Don't just read — show the output.

### Variables & types

Python is dynamically typed — no `let`, `const`, or `var`. Just assign:

```python
name    = "Alice"          # str
age     = 22               # int
gpa     = 3.75             # float
active  = True             # bool  (capital T/F)
nothing = None             # equivalent to null / undefined
```

Type annotations are optional in plain Python but FastAPI uses them heavily:

```python
name: str   = "Alice"
age:  int   = 22
gpa:  float = 3.75
```

### Strings

```python
first = "Alice"
last  = "Smith"

print(first + " " + last)       # concatenation
print(f"Hello, {first}!")       # f-string — use this in practice
print(f"GPA: {gpa:.2f}")        # format to 2 decimal places
print(first.upper())            # "ALICE"
print(first.lower())            # "alice"
print(len(first))               # 5
```

### Conditionals

Python uses indentation (4 spaces) instead of `{}` braces:

```python
score = 75

if score >= 85:
    print("HD")
elif score >= 75:
    print("D")
elif score >= 65:
    print("C")
else:
    print("Below credit")
```

!!! warning "Indentation is not optional"
    Python uses whitespace to define blocks. A wrong indent is a `SyntaxError`. Use 4 spaces consistently — not tabs, not 2 spaces.

### Loops

```python
# for loop — iterating a range
for i in range(5):       # 0, 1, 2, 3, 4
    print(i)

# for loop — iterating a list
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)

# while loop
count = 0
while count < 3:
    print(count)
    count += 1           # Python has no count++
```

### Functions

```python
def greet(name):                        # (1)
    return f"Hello, {name}!"

print(greet("Alice"))                   # Hello, Alice!

# Default parameter values
def greet(name, greeting="Hello"):
    return f"{greeting}, {name}!"

print(greet("Alice"))                   # Hello, Alice!
print(greet("Alice", "Hi"))             # Hi, Alice!

# Type annotations — FastAPI requires these on route functions
def add(a: int, b: int) -> int:         # (2)
    return a + b
```

1. `def` defines a function. No `function` keyword. Body is indented.
2. `: int` annotates the parameter type. `-> int` annotates the return type. Python doesn't enforce these at runtime, but FastAPI reads them to validate and document your API automatically.

### Lists

```python
courses = ["COSC2956", "COSC1111", "MATH1234"]

courses[0]              # "COSC2956" — zero-indexed
courses[-1]             # "MATH1234" — last item
len(courses)            # 3

courses.append("COSC3333")   # add to end
courses.remove("COSC1111")   # remove by value
courses.pop(0)               # remove by index

# List comprehension — create a new list from another
upper = [c.upper() for c in courses]

# Filter with a condition
long_codes = [c for c in courses if len(c) > 8]
```

### Dictionaries

The Python equivalent of a JavaScript object — key/value pairs:

```python
student = {
    "name": "Alice",
    "age": 22,
    "enrolled": True,
}

student["name"]              # "Alice"
student["age"]               # 22
student["gpa"] = 3.75        # add a new key
student["name"] = "Bob"      # update a value

# Check if a key exists
if "gpa" in student:
    print(student["gpa"])

# .get() with a default — safer than direct access
print(student.get("gpa", 0.0))   # returns 0.0 if key doesn't exist

# Iterate
for key, value in student.items():
    print(f"{key}: {value}")
```

### List of dictionaries — the shape of most API data

```python
courses = [
    {"id": 1, "code": "COSC2956", "name": "Internet Tools",  "credits": 12},
    {"id": 2, "code": "COSC1111", "name": "Programming 1",   "credits": 12},
    {"id": 3, "code": "MATH1234", "name": "Discrete Maths",  "credits": 12},
]

# Access
courses[0]["name"]      # "Internet Tools"

# Filter — find all 12-credit courses
twelve_cp = [c for c in courses if c["credits"] == 12]

# Find one by ID
found = next((c for c in courses if c["id"] == 2), None)
```

This structure — a list of dicts — is exactly what a FastAPI route will return as JSON.

### File access

```python
# Write a file
with open("notes.txt", "w") as f:    # (1)
    f.write("Hello from Python\n")
    f.write("Second line\n")

# Read a file
with open("notes.txt", "r") as f:
    content = f.read()
    print(content)

# Read line by line
with open("notes.txt", "r") as f:
    for line in f:
        print(line.strip())           # .strip() removes the trailing newline
```

1. `with open(...) as f:` is Python's file context manager. It automatically closes the file when the block ends — even if an error occurs. Always use `with` for file access.

### Reading and writing JSON files

```python
import json                          # (1)

data = {"name": "Alice", "courses": ["COSC2956", "MATH1234"]}

# Write JSON
with open("data.json", "w") as f:
    json.dump(data, f, indent=2)     # indent=2 makes it human-readable

# Read JSON
with open("data.json", "r") as f:
    loaded = json.load(f)

print(loaded["name"])                # "Alice"
```

1. `import json` loads Python's built-in JSON module. No installation needed.

!!! note "JSON files as a lightweight database"
    FastAPI routes can read from and write to a JSON file as a simple data store. It's not suitable for production, but it's perfect for this course — no database setup required.

---

➡️ *Python covered. Now let's build a server.*

---

## Part B — FastAPI

---

## Phase 3 — Why FastAPI & First Server

??? note "🗣️ Talking Points"
    - Ask: *"In Lec 4 we fetched data from public APIs — restcountries, pokeapi, open-meteo. Who built those? Someone had to write a server that listens for requests and sends JSON back. Today we build that server."*
    - Why FastAPI and not Flask, Django, Express? Speed of development — one file, minimal boilerplate, automatic docs. And because it uses Python type annotations to do work for you — validation, serialisation, documentation all happen automatically.
    - The two-terminal setup is critical to explain visually. Draw it: terminal 1 runs Vue on :5173, terminal 2 runs FastAPI on :8000. The browser talks to both. They don't know about each other — yet.
    - After starting the server, open `http://localhost:8000/docs` in the browser. The interactive docs are generated automatically from the code — this always gets a reaction.

### Where FastAPI fits

```
Browser (Vue app — port 5173)
     │
     │  fetch('http://localhost:8000/courses')
     ▼
FastAPI server (Python — port 8000)
     │
     │  reads/writes data, applies logic
     ▼
Returns JSON  →  Vue renders it
```

In previous lectures Vue fetched from **other people's servers**. Now we build our own.

### Why FastAPI?

| | FastAPI | Flask | Django |
|---|---|---|---|
| Speed to first route | ⚡ 5 lines | OK | Much more setup |
| Automatic API docs | ✅ Built-in | ❌ | ❌ |
| Type validation | ✅ Automatic | ❌ Manual | ❌ Manual |
| Performance | Very fast | Moderate | Moderate |
| Best for | APIs | Small apps | Full web apps |

FastAPI generates interactive documentation at `/docs` automatically — no extra work.

### Install

```bash
pip3 install fastapi uvicorn
```

- **fastapi** — the framework
- **uvicorn** — the web server that runs your FastAPI app (like Vite, but for Python)

### First server — 5 lines

Create `main.py`:

```python title="main.py"
from fastapi import FastAPI          # (1)

app = FastAPI()                      # (2)

@app.get("/")                        # (3)
def read_root():
    return {"message": "Hello from FastAPI!"}   # (4)
```

1. Import `FastAPI` from the fastapi package.
2. Create the app instance — this is the equivalent of `createApp()` in Vue.
3. `@app.get("/")` is a **decorator** — it tells FastAPI "when someone sends a GET request to `/`, run the function below".
4. Return a Python dictionary — FastAPI automatically converts it to a JSON response.

Run it:

```bash
uvicorn main:app --reload   # (1)
```

1. `main` = the filename (`main.py`). `app` = the FastAPI instance. `--reload` restarts the server automatically when you save the file — like Vite's hot reload.

Open:
- `http://localhost:8000/` — see the JSON response
- `http://localhost:8000/docs` — interactive API documentation, auto-generated

!!! example "🎯 Demo — two terminals"
    Show students the two-terminal setup explicitly:

    **Terminal 1 — Vue:**
    ```bash
    cd my-vue-app
    npm run dev       # runs on http://localhost:5173
    ```

    **Terminal 2 — FastAPI:**
    ```bash
    cd my-api
    uvicorn main:app --reload   # runs on http://localhost:8000
    ```

    Open both URLs in the browser. They run independently. The Vue app doesn't know about FastAPI yet — that connection comes in Phase 6.

---

➡️ *Server is running. Now let's add real routes.*

---

## Phase 4 — Routes: GET, Path Params, Query Params

??? note "🗣️ Talking Points"
    - Walk through the courses data first. Students recognise it from the assignment.
    - Path params: the value comes from the URL itself — `/courses/2`. Query params: the value comes after a `?` — `/courses?status=Completed`. Ask students which one they'd use to get a specific item vs to filter a list.
    - After each route, test it in `/docs` — click the route, hit "Try it out", enter a value, hit Execute. Students see the request and response live.
    - The 404 pattern is important — `HTTPException` is how FastAPI sends an error response with the correct HTTP status code.

### The data

Add this to `main.py` — a list of dicts as an in-memory "database":

```python
courses = [
    {"id": 1, "code": "COSC2956", "name": "Internet Tools",       "credits": 12, "status": "In Progress"},
    {"id": 2, "code": "COSC1111", "name": "Programming 1",        "credits": 12, "status": "Completed"},
    {"id": 3, "code": "COSC2222", "name": "Data Structures",      "credits": 12, "status": "Completed"},
    {"id": 4, "code": "COSC3333", "name": "Web Application Dev",  "credits": 12, "status": "In Progress"},
    {"id": 5, "code": "MATH1234", "name": "Discrete Mathematics", "credits": 12, "status": "In Progress"},
]
```

### GET all items

```python
@app.get("/courses")
def get_courses():
    return courses          # (1)
```

1. FastAPI automatically serialises the list of dicts to a JSON array. `[{"id": 1, ...}, ...]`

Test: `http://localhost:8000/courses`

### Path parameter — GET one item

```python
from fastapi import FastAPI, HTTPException   # (1)

@app.get("/courses/{course_id}")             # (2)
def get_course(course_id: int):             # (3)
    course = next((c for c in courses if c["id"] == course_id), None)
    if course is None:
        raise HTTPException(status_code=404, detail="Course not found")  # (4)
    return course
```

1. Import `HTTPException` to send error responses with proper HTTP status codes.
2. `{course_id}` in the path is a placeholder — it captures whatever is in that position in the URL.
3. `course_id: int` — FastAPI reads the type annotation and automatically converts the URL string `"2"` to the integer `2`. If someone sends `/courses/abc`, FastAPI returns a 422 error automatically.
4. `HTTPException` sends a JSON error response: `{"detail": "Course not found"}` with status 404. Never return `None` — always raise an exception.

Test: `http://localhost:8000/courses/2`

### Query parameter — filter the list

```python
from typing import Optional                        # (1)

@app.get("/courses")
def get_courses(status: Optional[str] = None):    # (2)
    if status:
        return [c for c in courses if c["status"] == status]
    return courses
```

1. `Optional[str]` means the parameter can be a string or `None`.
2. `status: Optional[str] = None` — if the URL is `/courses`, `status` is `None` and all courses return. If the URL is `/courses?status=Completed`, only completed courses return. FastAPI reads this from the query string automatically — no parsing needed.

Test:
- `http://localhost:8000/courses` — all courses
- `http://localhost:8000/courses?status=Completed` — only completed

!!! note "Path param vs query param — the rule"
    - **Path param** `/courses/{id}` — use for identifying a specific resource
    - **Query param** `/courses?status=x` — use for filtering, sorting, or optional behaviour

---

➡️ *Reading data is done. Now let's accept data from Vue.*

---

## Phase 5 — POST: Receiving JSON from Vue

??? note "🗣️ Talking Points"
    - Up until now the server only reads. POST lets the Vue app send data to the server — a form submission, a new item, login credentials.
    - `BaseModel` is FastAPI's way of defining what JSON it expects. Point at it and say: "This is exactly like `defineProps` in Vue — you're declaring the shape of the data you expect, and FastAPI validates it automatically."
    - After showing the route, test it in `/docs` — paste a JSON body into the Try it out form. Then show what happens if you leave out a required field — FastAPI returns a 422 with a clear error.
    - The 422 Unprocessable Entity response is a feature, not a bug — automatic validation with no code.

### Defining the expected shape with `BaseModel`

```python
from pydantic import BaseModel         # (1)

class NewCourse(BaseModel):            # (2)
    code:     str
    name:     str
    credits:  int
    semester: str
    status:   str
```

1. `pydantic` is installed automatically with FastAPI. It handles data validation.
2. `NewCourse` defines the expected JSON structure. Every field is required by default. FastAPI validates incoming JSON against this model before your function even runs.

### POST route

```python
@app.post("/courses")                  # (1)
def create_course(course: NewCourse): # (2)
    new_id = max(c["id"] for c in courses) + 1   # (3)
    new = {
        "id":       new_id,
        "code":     course.code,       # (4)
        "name":     course.name,
        "credits":  course.credits,
        "semester": course.semester,
        "status":   course.status,
    }
    courses.append(new)
    return new                         # (5)
```

1. `@app.post` handles POST requests — the HTTP method for creating new resources.
2. `course: NewCourse` — FastAPI reads the request body, validates it against `NewCourse`, and passes it as a typed object.
3. Generate a new ID — one higher than the current maximum.
4. Access fields with dot notation: `course.code`, `course.name`, etc.
5. Return the newly created course — Vue can use this to confirm and display the new item.

### DELETE route

```python
@app.delete("/courses/{course_id}")
def delete_course(course_id: int):
    global courses                     # (1)
    course = next((c for c in courses if c["id"] == course_id), None)
    if course is None:
        raise HTTPException(status_code=404, detail="Course not found")
    courses = [c for c in courses if c["id"] != course_id]   # (2)
    return {"message": f"Course {course_id} deleted"}
```

1. `global courses` is needed to reassign the module-level `courses` variable from inside a function.
2. Filter out the deleted item — creates a new list without it.

### The full `main.py` so far

```python title="main.py"
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from typing import Optional

app = FastAPI()

courses = [
    {"id": 1, "code": "COSC2956", "name": "Internet Tools",       "credits": 12, "semester": "Sem 1", "status": "In Progress"},
    {"id": 2, "code": "COSC1111", "name": "Programming 1",        "credits": 12, "semester": "Sem 2", "status": "Completed"},
    {"id": 3, "code": "COSC2222", "name": "Data Structures",      "credits": 12, "semester": "Sem 1", "status": "Completed"},
    {"id": 4, "code": "COSC3333", "name": "Web Application Dev",  "credits": 12, "semester": "Sem 2", "status": "In Progress"},
    {"id": 5, "code": "MATH1234", "name": "Discrete Mathematics", "credits": 12, "semester": "Sem 1", "status": "In Progress"},
]

class NewCourse(BaseModel):
    code:     str
    name:     str
    credits:  int
    semester: str
    status:   str

@app.get("/")
def root():
    return {"message": "Courses API"}

@app.get("/courses")
def get_courses(status: Optional[str] = None):
    if status:
        return [c for c in courses if c["status"] == status]
    return courses

@app.get("/courses/{course_id}")
def get_course(course_id: int):
    course = next((c for c in courses if c["id"] == course_id), None)
    if course is None:
        raise HTTPException(status_code=404, detail="Course not found")
    return course

@app.post("/courses")
def create_course(course: NewCourse):
    new_id = max(c["id"] for c in courses) + 1
    new = {"id": new_id, **course.dict()}    # (1)
    courses.append(new)
    return new

@app.delete("/courses/{course_id}")
def delete_course(course_id: int):
    global courses
    course = next((c for c in courses if c["id"] == course_id), None)
    if course is None:
        raise HTTPException(status_code=404, detail="Course not found")
    courses = [c for c in courses if c["id"] != course_id]
    return {"message": f"Course {course_id} deleted"}
```

1. `**course.dict()` unpacks the Pydantic model into a dictionary and merges it with `{"id": new_id}`. Cleaner than writing every field manually.

!!! example "🎯 Demo — test everything in /docs"
    Open `http://localhost:8000/docs`. Test each route:
    - GET `/courses` — see all 5
    - GET `/courses/2` — see one
    - GET `/courses?status=Completed` — see filtered
    - POST `/courses` — paste a new course JSON body, see it added
    - GET `/courses` again — 6 courses now
    - DELETE `/courses/6` — remove it
    - GET `/courses?status=xyz` — empty array, no error

---

➡️ *The API works. Now let's connect it to Vue.*

---

## Phase 6 — CORS: Connecting Vue and FastAPI

??? note "🗣️ Talking Points"
    - CORS is the thing that breaks when you first try to fetch your own FastAPI from a Vue app. Students will hit this — it's better to explain it before they see the red browser error.
    - Draw on the board: Vue is on port 5173, FastAPI is on port 8000. The browser sees these as different origins. It blocks cross-origin requests by default as a security measure.
    - The fix is one middleware block in `main.py`. After adding it, show the browser console — the error is gone.
    - `allow_origins=["http://localhost:5173"]` is specific to dev. In production you'd put your real domain here.

### What is CORS?

**Cross-Origin Resource Sharing** — a browser security rule.

When a Vue app at `http://localhost:5173` tries to fetch from `http://localhost:8000`, the browser treats this as a **cross-origin request** — different port = different origin. By default, the browser blocks it.

```
Vue (port 5173)
    │
    │  fetch('http://localhost:8000/courses')
    ▼
Browser checks: is this allowed?
    │
    ├── FastAPI has no CORS header → ❌ BLOCKED
    └── FastAPI has CORS header   → ✅ ALLOWED
```

Without CORS enabled you'll see this in the browser console:

```
Access to fetch at 'http://localhost:8000/courses' from origin
'http://localhost:5173' has been blocked by CORS policy.
```

### Fix: add CORS middleware to `main.py`

```python title="main.py — add CORS"
from fastapi import FastAPI, HTTPException
from fastapi.middleware.cors import CORSMiddleware   # (1)
from pydantic import BaseModel
from typing import Optional

app = FastAPI()

app.add_middleware(                                  # (2)
    CORSMiddleware,
    allow_origins=["http://localhost:5173"],         # (3)
    allow_methods=["*"],                             # (4)
    allow_headers=["*"],
)

# ... rest of the file unchanged
```

1. Import the CORS middleware — included with FastAPI, nothing extra to install.
2. Register the middleware on the app. This must appear before the routes.
3. Allow requests only from the Vue dev server. In production, replace this with your actual domain.
4. `"*"` allows all HTTP methods (GET, POST, PUT, DELETE). Fine for development.

---

➡️ *CORS is fixed. Let's wire up Vue.*

---

## Phase 7 — Full Example: Vue + FastAPI

??? note "🗣️ Talking Points"
    - This is the payoff of everything in the course — Vue on one side, Python on the other, talking over HTTP.
    - The Vue code uses the exact same `fetch` pattern from Lec 4. The only difference is the URL points to `localhost:8000` instead of a public API.
    - Walk through the three operations: load the list, add a course, delete a course. Each one is a different HTTP method.
    - Emphasise: the FastAPI server holds the real data. If you add a course in Vue and then open `/docs`, you'll see it there. Two different clients, same data.
    - After the demo, open `/docs` and `/courses` in the browser while the Vue app is running — show that the data is the same in both places.

### The project structure

```
my-project/
├── api/                  ← FastAPI (Python)
│   └── main.py
└── app/                  ← Vue (Vite)
    └── src/
        └── App.vue
```

Run them in two terminals:

```bash
# Terminal 1 — FastAPI
cd my-project/api
uvicorn main:app --reload
# → http://localhost:8000

# Terminal 2 — Vue
cd my-project/app
npm run dev
# → http://localhost:5173
```

### `App.vue` — complete

```vue title="src/App.vue"
<template>
  <div class="page">
    <h1>📚 Courses Dashboard</h1>

    <!-- Summary -->
    <div class="summary">
      <span>Total: <strong>{{ courses.length }}</strong></span>
      <span>Completed: <strong>{{ completed }}</strong></span>
      <span>In Progress: <strong>{{ inProgress }}</strong></span>
    </div>

    <!-- Loading / error -->
    <p v-if="loading" class="state">Loading...</p>
    <p v-if="error"   class="state error">⚠ {{ error }}</p>

    <!-- Course list -->
    <ul v-if="!loading" class="course-list">
      <li v-for="course in courses" :key="course.id" class="course-item">
        <div>
          <strong>{{ course.code }}</strong> — {{ course.name }}
          <span :class="['badge', course.status === 'Completed' ? 'badge-green' : 'badge-blue']">
            {{ course.status }}
          </span>
        </div>
        <button @click="deleteCourse(course.id)" class="btn-delete">✕</button>
      </li>
    </ul>

    <!-- Add course form -->
    <div class="form-card">
      <h2 class="form-title">Add a Course</h2>
      <div class="form-row">
        <input v-model="form.code"     placeholder="Code"     />
        <input v-model="form.name"     placeholder="Name"     />
        <input v-model="form.semester" placeholder="Semester" />
        <input v-model.number="form.credits" type="number" placeholder="Credits" />
      </div>
      <div class="radio-row">
        <label><input type="radio" v-model="form.status" value="In Progress" /> In Progress</label>
        <label><input type="radio" v-model="form.status" value="Completed"   /> Completed</label>
      </div>
      <p v-if="formError" class="state error">{{ formError }}</p>
      <button @click="addCourse" class="btn-submit">Add Course</button>
    </div>
  </div>
</template>

<script setup>
import { ref, computed, reactive, onMounted } from 'vue'

const API = 'http://localhost:8000'    // (1)

const courses = ref([])
const loading = ref(true)
const error   = ref(null)
const formError = ref('')

const form = reactive({
  code: '', name: '', semester: '', credits: 12, status: 'In Progress'
})

// ── Computed ──────────────────────────────────────────────
const completed  = computed(() => courses.value.filter(c => c.status === 'Completed').length)
const inProgress = computed(() => courses.value.filter(c => c.status === 'In Progress').length)

// ── Load courses on mount ─────────────────────────────────
onMounted(async () => {
  try {
    const res = await fetch(`${API}/courses`)  // (2)
    if (!res.ok) throw new Error(`HTTP ${res.status}`)
    courses.value = await res.json()
  } catch (e) {
    error.value = e.message
  } finally {
    loading.value = false
  }
})

// ── Add a course ──────────────────────────────────────────
async function addCourse() {
  formError.value = ''
  if (!form.code || !form.name) { formError.value = 'Code and name are required.'; return }

  const res = await fetch(`${API}/courses`, {
    method:  'POST',                           // (3)
    headers: { 'Content-Type': 'application/json' },
    body:    JSON.stringify(form),             // (4)
  })

  if (!res.ok) { formError.value = 'Failed to add course.'; return }

  const created = await res.json()
  courses.value.push(created)                 // (5)

  form.code = ''; form.name = ''; form.semester = ''; form.credits = 12; form.status = 'In Progress'
}

// ── Delete a course ───────────────────────────────────────
async function deleteCourse(id) {
  const res = await fetch(`${API}/courses/${id}`, {
    method: 'DELETE',                          // (6)
  })
  if (!res.ok) return
  courses.value = courses.value.filter(c => c.id !== id)  // (7)
}
</script>

<style scoped>
.page { max-width: 700px; margin: 2rem auto; padding: 0 1rem; font-family: system-ui, sans-serif; }
h1   { color: #111827; margin-bottom: 1rem; }
.summary { display: flex; gap: 1.5rem; margin-bottom: 1rem; color: #6b7280; font-size: 0.9rem; }
.state   { color: #9ca3af; }
.error   { color: #dc2626; }
.course-list { list-style: none; padding: 0; }
.course-item {
  display: flex; justify-content: space-between; align-items: center;
  padding: 0.75rem 0; border-bottom: 1px solid #f3f4f6;
  font-size: 0.9rem; color: #374151;
}
.badge { font-size: 0.72rem; font-weight: 600; padding: 0.15rem 0.55rem; border-radius: 999px; margin-left: 0.5rem; }
.badge-green { background: #dcfce7; color: #16a34a; }
.badge-blue  { background: #dbeafe; color: #2563eb; }
.btn-delete  { background: none; border: none; color: #d1d5db; cursor: pointer; font-size: 1rem; }
.btn-delete:hover { color: #dc2626; }
.form-card  { background: white; border-radius: 10px; padding: 1.2rem; box-shadow: 0 1px 4px rgba(0,0,0,0.07); margin-top: 1.5rem; }
.form-title { font-size: 0.95rem; font-weight: 600; color: #111827; margin: 0 0 0.75rem; }
.form-row   { display: grid; grid-template-columns: 1fr 1fr; gap: 0.6rem; margin-bottom: 0.75rem; }
.form-row input { padding: 0.45rem 0.7rem; border: 1px solid #d1d5db; border-radius: 6px; font-size: 0.88rem; outline: none; }
.form-row input:focus { border-color: #6366f1; }
.radio-row  { display: flex; gap: 1rem; font-size: 0.88rem; color: #374151; margin-bottom: 0.75rem; }
.btn-submit { padding: 0.5rem 1.2rem; background: #6366f1; color: white; border: none; border-radius: 7px; cursor: pointer; font-size: 0.88rem; }
.btn-submit:hover { background: #4f46e5; }
</style>
```

1. Store the base URL in one constant — if the port changes, you change it in one place.
2. Same `fetch` pattern from Lec 4 — nothing new. Just a different URL.
3. `method: 'POST'` sends a POST request. Without this, `fetch` defaults to GET.
4. `JSON.stringify(form)` converts the reactive object to a JSON string for the request body. `Content-Type: application/json` tells FastAPI to parse it as JSON.
5. Push the created course returned by the server — it includes the server-assigned `id`.
6. `method: 'DELETE'` — the HTTP method for deletion.
7. Remove from the local array after the server confirms deletion — keeps Vue in sync.

!!! example "🎯 Try it live — with both servers running"
    - Open `http://localhost:5173` — see the 5 courses from FastAPI
    - Add a new course in the form — appears in the list immediately
    - Open `http://localhost:8000/courses` in another tab — the new course is there too
    - Delete a course — disappears from Vue
    - Refresh the page — data resets (we're using in-memory storage, not a real database)
    - Open `http://localhost:8000/docs` — the auto-generated docs show all four routes with full request/response schemas

---

## Phase 8 — Pitfalls & Wrap-up

??? note "🗣️ Talking Points"
    - Keep this under 5 minutes. Students are full of new information.
    - The CORS one is first because it's the first thing that goes wrong — guaranteed.
    - The indentation one is for the Python newcomers.

### ❌ CORS error in the browser

```
Access to fetch at 'http://localhost:8000/...' has been blocked by CORS policy
```

Add `CORSMiddleware` to `main.py` (Phase 6). This is always the fix.

### ❌ Python indentation error

```python
def get_courses():
return courses    # ❌ IndentationError — must be indented

def get_courses():
    return courses  # ✅
```

### ❌ Forgetting `Content-Type` header on POST

```js
// ❌ FastAPI receives empty body — 422 Unprocessable Entity
await fetch(url, { method: 'POST', body: JSON.stringify(data) })

// ✅ Tell the server it's JSON
await fetch(url, {
  method:  'POST',
  headers: { 'Content-Type': 'application/json' },
  body:    JSON.stringify(data),
})
```

### ❌ Data resets on server restart

The `courses` list lives in memory — it's reset every time `uvicorn` restarts. For persistent data, write to a JSON file or use a real database (SQLite, PostgreSQL). That's beyond this course, but the pattern is: `json.load()` on startup, `json.dump()` after every write.

### ❌ `422 Unprocessable Entity` from FastAPI

FastAPI returns 422 when the incoming data doesn't match the `BaseModel`. Check:

- All required fields are included
- Types are correct (`credits` must be a number, not a string `"12"`)
- Check the 422 response body — FastAPI tells you exactly which field failed and why

---

## Summary

**What we covered:**

| Topic | Key point |
|---|---|
| Python variables & types | Dynamic typing, type annotations for FastAPI |
| Lists & dicts | The shape of API data |
| Functions with type hints | Required by FastAPI route handlers |
| FastAPI app + routes | `@app.get`, `@app.post`, `@app.delete` |
| Path params | `/courses/{id}` — identify a resource |
| Query params | `/courses?status=x` — filter a resource |
| Pydantic `BaseModel` | Validates incoming JSON automatically |
| CORS middleware | Allows Vue (port 5173) to talk to FastAPI (port 8000) |
| `fetch` with POST/DELETE | `method`, `headers`, `body` in Vue |

**The full stack is now:**

```
Vue (port 5173)
  onMounted → fetch GET  /courses     → display list
  addCourse → fetch POST /courses     → add item
  delete    → fetch DELETE /courses/1 → remove item
                  ↕  JSON over HTTP
FastAPI (port 8000)
  GET    /courses       → return courses list
  POST   /courses       → validate + append + return new item
  DELETE /courses/{id}  → remove + confirm
```

---

!!! tip "Where to go from here"
    This course ends here, but these are the natural next steps:

    - **Persistent storage** — swap the in-memory list for a JSON file or SQLite (`pip install databases`)
    - **Authentication** — protect routes with JWT tokens using `fastapi-jwt-auth`
    - **Deployment** — deploy FastAPI to Railway or Render, Vue to Netlify or Vercel
    - **Full-stack framework** — Nuxt.js (Vue + SSR) or Next.js (React + SSR) if you want Vue and the server in one project

---

*COSC2956 Internet Tools — End of Lecture 5 & the Vue.js series*