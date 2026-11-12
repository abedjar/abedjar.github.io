---
search:
  exclude: true
---

# COSC2956 – Internet Tools
## Final Project: Meal Planner

---

!!! info "Project Overview"
    | | |
    |---|---|
    | **Topic** | A full-stack Meal Planner application |
    | **Stack** | Vue 3 · FastAPI · JSON file storage · TheMealDB API |
    | **Groups** | 1 to 5 students — your choice |
    | **Assessment** | Live demo (10 min) + code submission + in-class discussion |
    | **Weight** | 25% of final grade |
    | **Total marks** | 100 |

!!! danger "IMPORTANT"
    Every member of the group must contribute to the project and be able to answer questions about the **entire** codebase during the demo — not just their own part.

---

## The Application

Imagine you are building the internal tool for a nutrition coaching service. Coaches build a library of recipes, then assemble weekly meal plans for their clients: what is cooked on Monday at lunch, what is served on Friday for dinner, and which recipes are used again and again.

Your application is that tool.

It has three sections. A **Dashboard** that gives the team a live snapshot of the recipe library and the plans in progress. A **Recipes** section where staff create and manage recipes and see which plans use each one. And a **Plans** section where staff build weekly plans by placing recipes into days and meal slots.

The data lives on a Python server your group builds. The interface is a Vue application your group designs. They talk to each other over HTTP — the same way every modern web application works.

---

## The Core Idea: A Many-to-Many Relationship

This project is built around one relationship:

- A **recipe** can appear in **many plans**.
- A **plan** contains **many recipes**.

Neither side owns the other, so the link between them lives in its own file: **plan entries**. This is the same pattern you used for registrations in the Event Manager, with one important difference.

!!! warning "Entries are not just links"
    A registration simply says "this member is registered for this event", and a member registers for an event once. A plan entry says **which recipe, in which plan, on which day, for which meal, for how many servings**. The same recipe can appear in the same plan several times — Monday lunch *and* Thursday dinner. Because each entry carries its own data, it can also be **edited** (moved to another day or slot), not only added and removed.

    Be ready to explain this difference during the discussion.

---

## The Three Views

### View 1 — Dashboard

The Dashboard is the first thing a user sees when they open the app. It gives a complete picture of the service's activity at a glance — without requiring the user to navigate anywhere.

At the top, a row of **summary cards** shows the key numbers: total recipes, total plans, total planned meals (plan entries), and how many plans are currently active. These numbers are always live — fetched from your API, never hardcoded.

Below the summary, a **Recent Recipes** panel lists the last 3 to 5 recipes that were added to the system. Each entry shows enough information to be useful: the recipe title, category, preparation time, and calories.

Beyond these required elements, your group must add **two additional components of your own design**. Think like a product team: what would genuinely help a nutrition coach at a glance? Consider things like: the most-used recipes, a breakdown of recipes by category, recipes that are not used in any plan yet, the number of meals still unplanned this week, or the average calories per day for a plan. The choice is yours — but the components must display real data from your API, and they must make sense on a dashboard.

---

### View 2 — Recipes

The Recipes view is where the library is built and maintained.

The view opens with the **full list of recipes**. Each recipe shows its key details — title, category, area, preparation time, calories, and how many plans use it. The list should be easy to scan.

From this view, a user can **add a new recipe** using a form. The form collects all recipe fields, including a list of ingredients (name and measure) that the user can add to and remove from. Category is not a free-text field — the user picks it from a **dropdown populated from TheMealDB**. The form also offers an **Import from TheMealDB** helper: the user picks a category, a second dropdown loads the meals in that category, and selecting a meal **pre-fills the form** with its details. The user can review and change anything before saving. This is the expected workflow: select category → meal list loads → select meal → form pre-fills.

Each recipe can be **edited** — the user can update any of its fields and save the changes. Each recipe can also be **deleted** — when a recipe is deleted, every plan entry that uses it is removed with it.

Clicking into a recipe reveals its **plan usage** — every plan that currently includes the recipe, with the day, meal slot, and servings for each entry. From here, a user can **add the recipe to a plan** by selecting from the list of existing plans (not by typing a name freehand) and choosing a day, a meal slot, and servings. They can also **remove** the recipe from any plan, deleting that entry.

---

### View 3 — Plans

The Plans view mirrors the Recipes view, but from the plan's perspective.

The view opens with the **full list of plans**. Each plan shows its name, start date, status, and how many meals are planned.

From this view, a user can **add a new plan**, **edit** an existing plan's details, or **delete** a plan. Deleting a plan also removes all of its entries.

Clicking into a plan reveals its **weekly grid**: seven days across and four meal slots (Breakfast, Lunch, Dinner, Snack) down, with the recipes placed in each cell. From the grid, a user can **add a recipe to a cell** by selecting from the list of existing recipes (not by typing a name freehand) and setting servings, **edit** an entry (change its day, meal slot, or servings), and **remove** an entry.

The goal is that a coach can open a plan, fill the whole week, rearrange meals, and clean up — without ever leaving the page.

---

## Data Model

### Recipe

| Field | Type | Notes |
|---|---|---|
| `id` | int | Auto-assigned |
| `title` | str | Required |
| `description` | str | Brief description |
| `category` | str | Selected from TheMealDB categories, e.g. `"Seafood"`, `"Dessert"` |
| `area` | str | Cuisine, e.g. `"Italian"` — optional, pre-filled by import |
| `prepTime` | int | Preparation time in minutes |
| `calories` | int | Estimated calories per serving |
| `servings` | int | Default number of servings |
| `ingredients` | list | Each item has a `name` and a `measure`, e.g. `{"name": "Flour", "measure": "2 cups"}` |
| `instructions` | str | Cooking steps |
| `imageUrl` | str | Optional picture URL |

### Plan

| Field | Type | Notes |
|---|---|---|
| `id` | int | Auto-assigned |
| `name` | str | Required |
| `startDate` | str | First day of the plan week, e.g. `"2026-11-16"` |
| `notes` | str | Goals or comments for the plan |
| `status` | str | `"Active"` or `"Archived"` |

### Plan Entry

| Field | Type | Notes |
|---|---|---|
| `id` | int | Auto-assigned |
| `planId` | int | Links to a Plan |
| `recipeId` | int | Links to a Recipe |
| `day` | str | `"Monday"` … `"Sunday"` |
| `mealType` | str | `"Breakfast"`, `"Lunch"`, `"Dinner"`, or `"Snack"` |
| `servings` | int | Servings planned (at least 1) |

One plan has many entries. One recipe can appear in many entries. A recipe may appear in the same plan more than once, but not twice in the **same day and meal slot**. Several *different* recipes may share a slot (a main and a dessert, for example).

### Rules your API must enforce

| Rule | What it means |
|---|---|
| **Referential integrity** | An entry cannot be created or updated with a `planId` or `recipeId` that does not exist. |
| **No duplicates** | The same recipe cannot be added twice to the same plan, day, and meal slot. |
| **Cascade delete** | Deleting a recipe removes its entries. Deleting a plan removes its entries. |
| **Valid values** | `day`, `mealType`, and `status` must be one of the allowed values. `servings` must be at least 1. |

!!! tip "Why does the server enforce this?"
    JSON files do not enforce relationships — nothing stops a record from pointing to something that no longer exists. In this project, **your code** is the database engine. These rules belong in `data.py` and the routes, not only in the Vue forms.

---

## External API — Recipe Import

Recipe import uses three chained calls to [TheMealDB](https://www.themealdb.com/api.php). It is free, and the examples below use the public test key `1` in the URL.

**Step 1 — Category**
```
GET https://www.themealdb.com/api/json/v1/1/categories.php
```
Returns `{ "categories": [ { "strCategory": "Beef", ... }, ... ] }`. Display as a dropdown.

**Step 2 — Meals in the category** (fires after a category is selected)
```
GET https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood
```
Returns `{ "meals": [ { "strMeal": "...", "strMealThumb": "...", "idMeal": "52959" }, ... ] }`. Display as a second dropdown.

**Step 3 — Full details** (fires after a meal is selected)
```
GET https://www.themealdb.com/api/json/v1/1/lookup.php?i=52959
```
Returns `{ "meals": [ { ...the full recipe... } ] }` — note that `meals` is a **list with one item**.

Use the result to pre-fill your recipe form:

| TheMealDB field | Your recipe field |
|---|---|
| `strMeal` | `title` |
| `strCategory` | `category` |
| `strArea` | `area` |
| `strInstructions` | `instructions` |
| `strMealThumb` | `imageUrl` |
| `strIngredient1` … `strIngredient20` with `strMeasure1` … `strMeasure20` | `ingredients` |

!!! warning "Watch out"
    - Ingredients arrive as **20 separate numbered fields**, many of them empty or `null`. Your code must turn them into a clean list and skip the blanks.
    - `meals` can be `null` when nothing matches. Handle it.
    - The API does not provide `prepTime`, `calories`, or `servings`. The user fills those in.
    - What is saved is **your own copy** of the recipe in `recipes.json`. The app must keep working with its own data after the import.

---

## Functional Requirements

### Dashboard
- Live summary counts: total recipes, total plans, total planned meals, active plans
- Recent recipes list (last 3–5 added)
- Two additional components of your group's choice — must display real API data

### Recipes View
- List all recipes with key fields visible
- Add recipe — all fields, category from the API dropdown, ingredients as an editable list
- Import helper — category → meal list → pre-filled form
- Edit recipe — update any field
- Delete recipe — removes its entries too
- Show plan usage per recipe — plan name, day, meal slot, servings
- Add a recipe to a plan — select from existing plans, choose day, slot, and servings
- Remove a recipe from a plan

### Plans View
- List all plans with key fields visible
- Add plan
- Edit plan details
- Delete plan — removes its entries too
- Weekly grid per plan — recipes shown by day and meal slot
- Add a recipe to a plan — select from existing recipes
- Edit an entry — change day, meal slot, or servings
- Remove an entry

---

## Technical Requirements

### Backend

- FastAPI with CORS enabled for `http://localhost:5173`
- All data persisted in JSON files — survives server restart
- A `data.py` file handles all file access — routes must not open files directly. Review [Week 11 – Lecture 2](https://jaradat.ca/26W/cosc2956/lectures/Week11-lec02/) for some ideas.
- Input validation with Pydantic models
- Return sensible HTTP errors: `404` when something is not found, `409` for a duplicate entry, `422` for invalid values

- Suggested routes (adapt as needed):

```
GET    /recipes                       → all recipes
GET    /recipes/{id}                  → one recipe
POST   /recipes                       → create recipe
PUT    /recipes/{id}                  → update recipe
DELETE /recipes/{id}                  → delete recipe + its entries

GET    /plans                         → all plans
GET    /plans/{id}                    → one plan
POST   /plans                         → create plan
PUT    /plans/{id}                    → update plan
DELETE /plans/{id}                    → delete plan + its entries

GET    /entries                       → all entries
GET    /plans/{id}/entries            → entries for one plan
GET    /recipes/{id}/entries          → entries for one recipe
POST   /entries                       → create entry
PUT    /entries/{id}                  → update entry (day, slot, servings)
DELETE /entries/{id}                  → remove entry
```

### Frontend

- Vue 3 with Vue Router — at least 3 views
- All form fields bound with `v-model`
- At least 2 reusable components with props
- Category and meal dropdowns from the external API
- Loading and error states on **every** fetch — including the TheMealDB calls
- Plain CSS only — no Tailwind, no CSS frameworks

---

## Submission

### Code — ZIP file

Name: `groupName_mealplanner.zip`

```
groupName_mealplanner/
├── api/
│   ├── main.py
│   ├── data.py
│   ├── recipes.json
│   ├── plans.json
│   └── plan_entries.json
└── app/
    └── src/
        ├── App.vue
        ├── main.js
        ├── router/index.js
        ├── views/
        └── components/
```

!!! warning "Exclude `node_modules` and Python virtual environments."

---

### Live Demo — 10 minutes (strict)

Rehearse. Ten minutes includes everything. Structure your demo as follows:

**Part 1 — Design (2 min)**

Before opening the browser, briefly explain:

- How your three JSON files are structured and related
- Why a plan entry has its own `id` and its own fields
- How `data.py` is organised
- What reusable components you built and why you made them components
- One interesting design decision your group made

**Part 2 — App (6 min)**

With both servers running, show:

- Dashboard — all stats correct, recent recipes visible, two extra components working
- Recipes — add a recipe using the import helper (category → meal → pre-fill), edit one, view its plan usage, add it to a plan, remove it from the plan, delete a recipe
- Plans — create a plan, fill part of the weekly grid, edit an entry (move it to another day or slot), try to add a duplicate (show it is rejected), delete a plan
- Persistence proof — stop FastAPI, restart it, refresh Vue, show data is still there

**Part 3 — Discussion (2 min)**

Each member answers at least one question. Questions may include explaining code, justifying a decision, or making a small live change.

---

### In-Class Discussion

Questions are individual. A group member who cannot explain the code is assessed on that basis, regardless of how the demo went.

Every member should be able to explain any part of the project — including parts they did not personally write.

---

### Marking Scheme

| Component | Marks |
|---|---|
| Backend: FastAPI routes, `data.py`, persistence, CORS | 20 |
| Many-to-many logic: entries, cascade delete, referential integrity, duplicate rule | 15 |
| Dashboard: live cards, recent recipes, two custom components | 10 |
| Recipes view: CRUD, API dropdowns and import, plan usage panel | 15 |
| Plans view: CRUD, weekly grid, entry add / edit / remove | 15 |
| Vue quality: components with props, `v-model`, loading and error states, plain CSS | 10 |
| Demo and individual discussion | 15 |
| **Total** | **100** |

---

!!! danger "Zero marks if:"
    - The app does not run
    - `node_modules` or virtual environment included in the ZIP
    - Data does not persist across a FastAPI restart
    - Academic dishonesty is found

---

## Advice

Build in this order — each step proves the one before it works:

1. Design your JSON file structure on paper first. Agree as a group before writing code.
2. Write `data.py` — read and write each file, including the cascade and validation rules. Test it directly in Python before touching FastAPI.
3. Build and test all routes in `/docs`. Try to break them: a missing recipe, a duplicate entry, an invalid day. Do not start Vue until the API is verified.
4. Call the three TheMealDB endpoints from a small Vue test page early, so you know what the data looks like before designing the form.
5. Build the Dashboard first — it is read-only and gives you a working Vue + FastAPI connection before you tackle forms.
6. Build Recipes, then Plans. Entries are the last piece — they depend on both.
7. Rehearse the demo as a group. Restart FastAPI mid-rehearsal. Time it.

!!! tip "Going further (optional, not required for full marks)"
    - A **shopping list** for a plan: every ingredient from its entries, grouped by name
    - **Calorie totals** per day and per plan on the weekly grid
    - A **search and filter** bar on the recipes list

---

*COSC2956 Internet Tools — Final Project*
