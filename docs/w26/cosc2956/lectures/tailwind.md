---
search:
  exclude: true
---

# Introduction to Tailwind CSS – Utility-First Styling for Modern Web Applications

**Course:** COSC2956 – Internet Tools  
**Lecture:** Tailwind CSS – Fundamentals, Configuration, and Practical Application  
**Estimated Duration:** 60–90 minutes

---

## Overview

This lecture introduces Tailwind CSS, a utility-first CSS framework that represents a fundamentally different philosophy from both traditional hand-crafted CSS and component-based frameworks like Bootstrap. By the end of this lecture, you should be able to explain the utility-first methodology, set up Tailwind in a modern project, compose complex UI layouts using utility classes, customise the design system via configuration, and recognise common pitfalls when transitioning from conventional CSS authoring.

---

## Table of Contents

1. [Conceptual Foundations](#conceptual-foundations)
2. [Installation and Project Setup](#installation-and-project-setup)
3. [Core Utility System](#core-utility-system)
4. [Responsive Design](#responsive-design)
5. [State Variants](#state-variants)
6. [Customising the Design System](#customising-the-design-system)
7. [Component Patterns and Reuse](#component-patterns-and-reuse)
8. [Practical Mini-Project](#practical-mini-project)
9. [Common Pitfalls](#common-pitfalls)
10. [Summary](#summary)

---

## Conceptual Foundations

### The Problem with Conventional CSS at Scale

You already know how to write CSS. You can author selectors, manage specificity, and organise stylesheets. So why would a project introduce a framework like Tailwind at all?

Consider a typical interaction between HTML structure and a stylesheet in a moderately large project:

```html
<div class="card">
  <h2 class="card__title">Product Name</h2>
  <p class="card__description">Some text here.</p>
  <button class="btn btn--primary">Add to Cart</button>
</div>
```

```css
.card {
  background: white;
  border-radius: 8px;
  padding: 1.5rem;
  box-shadow: 0 2px 4px rgba(0,0,0,0.1);
}

.card__title {
  font-size: 1.25rem;
  font-weight: 700;
  margin-bottom: 0.5rem;
}

.btn--primary {
  background-color: #3b82f6;
  color: white;
  padding: 0.5rem 1rem;
  border-radius: 6px;
}
```

This looks clean and familiar. However, at scale, this approach introduces several well-documented problems:

**Naming fatigue and inconsistency.** Developers must invent semantic names for every element. Teams disagree on naming conventions (BEM vs. SMACSS vs. OOCSS), and names like `.card-wrapper-inner-container` offer no styling information whatsoever.

**Stylesheet growth.** CSS files tend to grow monotonically. Rules are rarely deleted because developers fear breaking something. Studies of large codebases have found that a significant proportion of shipped CSS is dead code.

**Specificity conflicts.** As selectors become more complex to override existing rules, specificity battles emerge. Eventually, `!important` appears, and the cascade becomes difficult to reason about.

**Context switching.** Writing CSS requires constantly switching between HTML and CSS files. Each change involves understanding an existing class name, finding its definition, and modifying it — often with unintended side effects if that class is used elsewhere.

!!! note "Reflection Question"
    Think about a CSS file you have written for a project. Did you end up with styles you were afraid to delete? Were there naming conflicts? How did you manage them?

### What is the Utility-First Approach?

The utility-first paradigm, popularised by Tailwind CSS, inverts the conventional relationship between HTML and CSS. Rather than creating semantic CSS classes that encapsulate a group of related declarations, you compose styling directly in HTML using single-purpose utility classes — each of which applies exactly one CSS property-value pair (or a small, coherent set).

The card example above, written in Tailwind, becomes:

```html
<div class="bg-white rounded-lg p-6 shadow-md">
  <h2 class="text-xl font-bold mb-2">Product Name</h2>
  <p class="text-gray-600">Some text here.</p>
  <button class="bg-blue-500 text-white px-4 py-2 rounded-md hover:bg-blue-600">
    Add to Cart
  </button>
</div>
```

There is no separate CSS file. Every styling decision is visible directly in the markup. The class names are not invented — they are drawn from a fixed, predictable vocabulary.

!!! warning "Common Misconception"
    Utility-first CSS is sometimes conflated with inline styles. They are meaningfully different. Inline styles cannot reference design tokens (scales, colours, spacing), cannot express responsive variants, cannot express state variants like `hover` or `focus`, and cannot be purged by a build tool. Tailwind utility classes do all of these things.

### Tailwind's Design System Model

Tailwind is not simply a collection of shorthand CSS classes. It is a **constrained design system** expressed as a configuration file. The framework ships with a default design token set — a curated spacing scale, colour palette, type scale, shadow scale, and so on — derived from established principles in UI design.

When you write `p-4`, you are not applying 4 pixels of padding. You are applying the fourth step on a spacing scale where each unit represents 4px, giving you 16px. When you write `text-blue-500`, you are selecting a specific shade from a named colour ramp, not an arbitrary hex value.

This constraint is deliberate. One of the most common sources of visual inconsistency in UIs is the proliferation of "magic numbers" — arbitrary pixel values and colours chosen in the moment. Tailwind eliminates this by providing a finite, well-considered vocabulary of values.

```
Conventional CSS:          Tailwind equivalent:
margin-top: 13px;     →    (not expressible — choose mt-3 (12px) or mt-4 (16px))
color: #4287f5;       →    text-blue-500 (from the design palette)
font-size: 17px;      →    (not expressible — choose text-base (16px) or text-lg (18px))
```

!!! tip "Architectural Insight"
    The inability to express arbitrary values is a feature, not a bug. Design systems with bounded token sets produce more visually consistent UIs. Tailwind's constraints encourage you to work within a coherent system rather than making ad hoc decisions.

### How Tailwind Works at Build Time

Unlike frameworks such as Bootstrap that ship a large pre-built CSS file, Tailwind uses a build step to generate only the CSS your project actually uses. This is achieved through a process called **purging** (or, in Tailwind v3+, **Just-in-Time (JIT) compilation**).

The JIT engine scans your source files (HTML, JSX, Vue templates, etc.) for class names and generates the corresponding CSS on demand. If you never write `text-9xl`, no CSS for that class is emitted. A production Tailwind stylesheet for a typical project is often under 10KB.

```
Source files (HTML/JSX/etc.)
        ↓
  Tailwind JIT scanner
        ↓
  Only used classes → CSS generation
        ↓
  Output CSS file (often <10KB gzipped)
```

---

## Installation and Project Setup

### Prerequisites

Tailwind CSS requires Node.js and npm (or an equivalent package manager like pnpm or yarn). You should already be familiar with these tools. Confirm your environment:

```bash
node --version    # Recommended: v18 or higher
npm --version     # Recommended: v9 or higher
```

### Method 1: CDN (For Experimentation Only)

For quick prototyping or learning exercises, Tailwind provides a CDN script that runs the JIT engine in the browser:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tailwind CDN Demo</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
  <div class="bg-white rounded-xl shadow-lg p-8 max-w-sm w-full">
    <h1 class="text-2xl font-bold text-gray-800">Hello, Tailwind</h1>
    <p class="text-gray-500 mt-2">This is a CDN-based setup.</p>
  </div>
</body>
</html>
```

!!! warning "CDN Limitations"
    The CDN approach is unsuitable for production use. It cannot be customised via `tailwind.config.js`, it sends a larger runtime bundle to the browser, and it cannot be integrated with component frameworks or build pipelines. It is acceptable only for isolated experiments.

### Method 2: Vite + Tailwind (Recommended)

For any real project, Tailwind should be installed as a PostCSS plugin within a build pipeline. Vite is the recommended build tool for modern frontend development.

**Step 1: Scaffold a Vite project**

```bash
npm create vite@latest my-tailwind-project -- --template vanilla
cd my-tailwind-project
npm install
```

**Step 2: Install Tailwind, PostCSS, and Autoprefixer**

```bash
npm install -D tailwindcss postcss autoprefixer
npx tailwindcss init -p
```

This generates two configuration files:

- `tailwind.config.js` — your design system configuration
- `postcss.config.js` — PostCSS plugin configuration

**Step 3: Configure the content paths**

Open `tailwind.config.js` and specify which files Tailwind should scan for class names:

```javascript
/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx,vue,svelte}",
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}
```

!!! warning "Critical: Content Configuration"
    If your source files are not listed in `content`, Tailwind will not detect the classes you use and will generate an empty stylesheet. This is the single most common setup mistake. Always verify your glob patterns match your actual file structure.

**Step 4: Add the Tailwind directives to your CSS**

Replace the contents of `src/style.css` (or create it if it doesn't exist):

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

These three directives inject Tailwind's base reset styles, any component classes you define, and the full utility class system respectively.

**Step 5: Import the stylesheet**

In `src/main.js`:

```javascript
import './style.css'
```

**Step 6: Start the development server**

```bash
npm run dev
```

Your project is now running with Tailwind. Open `index.html` and begin adding utility classes.

### Project Structure After Setup

```
my-tailwind-project/
├── index.html
├── package.json
├── postcss.config.js         ← PostCSS configuration
├── tailwind.config.js        ← Tailwind configuration (design tokens, plugins)
├── vite.config.js
└── src/
    ├── main.js               ← Entry point (imports style.css)
    └── style.css             ← Contains @tailwind directives
```

!!! note "What is PostCSS?"
    PostCSS is a tool that transforms CSS using JavaScript plugins. Tailwind is implemented as a PostCSS plugin. When Vite builds your project, PostCSS processes your CSS file, and the Tailwind plugin replaces the `@tailwind` directives with the generated utility classes. Autoprefixer (another PostCSS plugin) adds vendor prefixes for cross-browser compatibility.

---

## Core Utility System

### Understanding the Naming Convention

Tailwind class names follow a consistent, predictable pattern:

```
[variant:][property]-[value]
```

Where:
- **variant** is an optional prefix for responsive or state targeting (e.g., `md:`, `hover:`)
- **property** is an abbreviated CSS property identifier (e.g., `p` for padding, `bg` for background-color)
- **value** is a token from the design scale (e.g., `4`, `blue-500`, `lg`)

Understanding this pattern allows you to guess class names correctly, and verify them against the documentation when needed.

### Spacing

Tailwind uses a base-4 spacing scale. The scale value multiplied by 4 gives the pixel equivalent:

| Class | CSS Output | Pixel Value |
|-------|-----------|-------------|
| `p-1` | `padding: 0.25rem` | 4px |
| `p-2` | `padding: 0.5rem` | 8px |
| `p-4` | `padding: 1rem` | 16px |
| `p-8` | `padding: 2rem` | 32px |
| `p-16` | `padding: 4rem` | 64px |

The same scale applies to margin (`m-`), gap (`gap-`), width (`w-`), height (`h-`), and more. Directional variants use axis and side notation:

```html
<!-- All sides -->
<div class="p-4">...</div>

<!-- X-axis (left + right), Y-axis (top + bottom) -->
<div class="px-6 py-3">...</div>

<!-- Individual sides: t (top), r (right), b (bottom), l (left) -->
<div class="mt-2 mb-4 ml-0 mr-auto">...</div>
```

### Colour System

Colours follow the pattern `{property}-{colour}-{shade}`:

```html
<!-- Background colour -->
<div class="bg-blue-500">...</div>

<!-- Text colour -->
<p class="text-gray-700">...</p>

<!-- Border colour -->
<div class="border border-red-300">...</div>
```

The shade scale runs from `50` (near-white) to `950` (near-black), with `500` representing the base mid-tone. The available colour families include: `slate`, `gray`, `zinc`, `neutral`, `stone`, `red`, `orange`, `amber`, `yellow`, `lime`, `green`, `emerald`, `teal`, `cyan`, `sky`, `blue`, `indigo`, `violet`, `purple`, `fuchsia`, `pink`, `rose`.

!!! note "Reflection Question"
    Why do you think Tailwind provides multiple near-neutral colour families (slate, gray, zinc, neutral, stone) rather than just a single "gray"? What UI design need does this serve?

### Typography

```html
<!-- Font size -->
<p class="text-sm">Small (14px)</p>
<p class="text-base">Base (16px)</p>
<p class="text-lg">Large (18px)</p>
<p class="text-xl">XL (20px)</p>
<p class="text-2xl">2XL (24px)</p>
<p class="text-4xl">4XL (36px)</p>

<!-- Font weight -->
<p class="font-normal">Normal (400)</p>
<p class="font-medium">Medium (500)</p>
<p class="font-semibold">Semibold (600)</p>
<p class="font-bold">Bold (700)</p>

<!-- Line height -->
<p class="leading-none">No extra leading</p>
<p class="leading-tight">Tight (1.25)</p>
<p class="leading-relaxed">Relaxed (1.625)</p>
<p class="leading-loose">Loose (2)</p>

<!-- Text alignment and decoration -->
<p class="text-center uppercase tracking-widest">Styled heading</p>
```

### Layout: Flexbox

Tailwind provides direct utility mappings for all flexbox properties:

```html
<!-- Basic flex container -->
<div class="flex items-center justify-between gap-4">
  <span>Left</span>
  <span>Right</span>
</div>

<!-- Flex direction and wrapping -->
<div class="flex flex-col gap-2">
  <div>Item 1</div>
  <div>Item 2</div>
</div>

<!-- Flex child properties -->
<div class="flex">
  <div class="flex-1">Grows to fill space</div>
  <div class="flex-none w-32">Fixed width</div>
</div>
```

| Class | CSS Property |
|-------|-------------|
| `flex` | `display: flex` |
| `flex-col` | `flex-direction: column` |
| `items-center` | `align-items: center` |
| `items-start` | `align-items: flex-start` |
| `justify-between` | `justify-content: space-between` |
| `justify-center` | `justify-content: center` |
| `flex-1` | `flex: 1 1 0%` |
| `flex-none` | `flex: none` |
| `flex-wrap` | `flex-wrap: wrap` |

### Layout: Grid

```html
<!-- 3-column grid with gap -->
<div class="grid grid-cols-3 gap-6">
  <div>Column 1</div>
  <div>Column 2</div>
  <div>Column 3</div>
</div>

<!-- Spanning multiple columns -->
<div class="grid grid-cols-4 gap-4">
  <div class="col-span-3">Wide content</div>
  <div class="col-span-1">Sidebar</div>
</div>

<!-- Auto-fit responsive grid -->
<div class="grid grid-cols-[repeat(auto-fill,minmax(200px,1fr))] gap-4">
  <!-- Items will wrap automatically -->
</div>
```

### Sizing

```html
<!-- Fixed width using spacing scale -->
<div class="w-16">64px wide</div>
<div class="w-64">256px wide</div>

<!-- Fractional widths -->
<div class="w-1/2">50% of parent</div>
<div class="w-1/3">33.33% of parent</div>

<!-- Special width values -->
<div class="w-full">100% width</div>
<div class="w-screen">100vw</div>
<div class="max-w-xl mx-auto">Max 576px, centred</div>

<!-- Height -->
<div class="h-16">64px tall</div>
<div class="h-screen">100vh</div>
<div class="min-h-screen">Min 100vh</div>
```

### Borders and Shadows

```html
<!-- Borders -->
<div class="border">1px solid (default colour)</div>
<div class="border-2 border-blue-400">2px blue border</div>
<div class="border-t border-gray-200">Top border only</div>

<!-- Border radius -->
<div class="rounded">4px radius</div>
<div class="rounded-lg">8px radius</div>
<div class="rounded-xl">12px radius</div>
<div class="rounded-full">9999px (pill / circle)</div>

<!-- Box shadows -->
<div class="shadow-sm">Subtle shadow</div>
<div class="shadow">Default shadow</div>
<div class="shadow-lg">Large shadow</div>
<div class="shadow-xl">Extra large shadow</div>
```

---

## Responsive Design

### Tailwind's Mobile-First Breakpoint System

Tailwind uses a **mobile-first** responsive approach. An unprefixed utility applies at all screen sizes. A prefixed utility applies at the specified breakpoint and above.

| Prefix | Minimum Width | Target Device |
|--------|--------------|---------------|
| (none) | 0px | All screens |
| `sm:` | 640px | Small (landscape phones) |
| `md:` | 768px | Medium (tablets) |
| `lg:` | 1024px | Large (laptops) |
| `xl:` | 1280px | Extra large (desktops) |
| `2xl:` | 1536px | Wide desktops |

!!! warning "Breakpoint Direction"
    Unlike some frameworks, Tailwind breakpoints are minimum-width (mobile-first), not maximum-width. `md:text-lg` means "apply `text-lg` at 768px **and above**", not "apply at screens below 768px". If you want a style to apply only on small screens, you need to override it at larger breakpoints.

### Responsive Layout Example

```html
<!-- Single column on mobile, two on tablet, three on desktop -->
<div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
  <div class="bg-white rounded-lg p-4 shadow">Card 1</div>
  <div class="bg-white rounded-lg p-4 shadow">Card 2</div>
  <div class="bg-white rounded-lg p-4 shadow">Card 3</div>
</div>

<!-- Hide/show elements at breakpoints -->
<nav class="hidden md:flex items-center gap-4">
  <!-- Desktop navigation (hidden on mobile) -->
</nav>

<button class="md:hidden">
  <!-- Mobile hamburger menu (hidden on desktop) -->
  ☰
</button>

<!-- Typography scaling -->
<h1 class="text-2xl md:text-4xl lg:text-6xl font-bold">
  Responsive Heading
</h1>
```

### Practical Responsive Navbar

```html
<header class="bg-white shadow-sm">
  <div class="max-w-6xl mx-auto px-4 py-3 flex items-center justify-between">
    
    <!-- Logo -->
    <a href="/" class="text-xl font-bold text-blue-600">MyApp</a>
    
    <!-- Desktop nav -->
    <nav class="hidden md:flex items-center gap-6">
      <a href="#" class="text-gray-600 hover:text-blue-600 transition-colors">Home</a>
      <a href="#" class="text-gray-600 hover:text-blue-600 transition-colors">About</a>
      <a href="#" class="text-gray-600 hover:text-blue-600 transition-colors">Contact</a>
      <a href="#" class="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600 transition-colors">
        Sign Up
      </a>
    </nav>
    
    <!-- Mobile menu button -->
    <button class="md:hidden text-gray-600 text-2xl">☰</button>
    
  </div>
</header>
```

!!! note "Reflection Question"
    How does Tailwind's mobile-first responsive system compare to writing `@media (max-width: 768px)` in conventional CSS? What are the implications for how you think about your base styles?

---

## State Variants

### Hover, Focus, and Active

State variants are prefixes that apply a utility only when the element is in a particular state:

```html
<!-- Hover state -->
<button class="bg-blue-500 hover:bg-blue-700 text-white px-4 py-2 rounded">
  Hover me
</button>

<!-- Focus state (important for accessibility) -->
<input class="border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-2 focus:ring-blue-200 px-3 py-2 rounded">

<!-- Active state -->
<button class="bg-green-500 active:bg-green-700 active:scale-95 text-white px-4 py-2 rounded transition">
  Click me
</button>

<!-- Disabled state -->
<button class="bg-blue-500 disabled:bg-gray-300 disabled:cursor-not-allowed text-white px-4 py-2 rounded" disabled>
  Disabled
</button>
```

### Transition and Animation

Tailwind provides utilities for CSS transitions and transforms:

```html
<!-- Smooth colour transition -->
<button class="bg-blue-500 hover:bg-blue-700 text-white px-4 py-2 rounded transition-colors duration-200">
  Colour Transition
</button>

<!-- Multiple property transition -->
<div class="bg-white hover:bg-blue-50 hover:shadow-lg hover:-translate-y-1 
            rounded-lg p-6 shadow transition-all duration-300 cursor-pointer">
  Hover card with lift effect
</div>

<!-- Transform utilities -->
<div class="hover:scale-105 transition-transform duration-200">
  Scale on hover
</div>

<div class="hover:rotate-3 transition-transform duration-200">
  Rotate on hover
</div>
```

### Group and Peer Variants

Two powerful variants allow you to style an element based on the state of a related element.

**`group` / `group-hover`**: Style a child when the parent is hovered:

```html
<div class="group bg-white hover:bg-blue-500 rounded-lg p-6 shadow cursor-pointer transition-colors">
  <h3 class="text-gray-800 group-hover:text-white font-bold text-lg transition-colors">
    Card Title
  </h3>
  <p class="text-gray-500 group-hover:text-blue-100 transition-colors">
    Card description that changes colour with the card.
  </p>
  <span class="inline-block mt-3 text-blue-500 group-hover:text-white group-hover:translate-x-1 transition-all">
    Learn more →
  </span>
</div>
```

**`peer` / `peer-checked`**: Style an element based on the state of a sibling:

```html
<!-- Custom checkbox using peer -->
<label class="flex items-center gap-3 cursor-pointer">
  <input type="checkbox" class="peer sr-only">
  <div class="w-5 h-5 border-2 border-gray-300 rounded peer-checked:bg-blue-500 
              peer-checked:border-blue-500 transition-colors flex items-center justify-center">
    <span class="text-white text-xs opacity-0 peer-checked:opacity-100 transition-opacity">✓</span>
  </div>
  <span class="text-gray-700">Accept terms</span>
</label>
```

!!! tip "Variant Stacking"
    Variants can be stacked. For example, `md:hover:bg-blue-700` applies the blue background on hover, but only on screens that are at least 768px wide. This allows precise, context-sensitive styling without any custom CSS.

### Dark Mode

Tailwind supports a `dark:` variant that applies styles when dark mode is active. Configure the strategy in `tailwind.config.js`:

```javascript
// tailwind.config.js
export default {
  darkMode: 'class',  // or 'media' for OS preference
  // ...
}
```

With `'class'` strategy, dark mode activates when a parent element (typically `<html>`) has the `dark` class:

```html
<html class="dark">
  <body class="bg-white dark:bg-gray-900 text-gray-900 dark:text-gray-100">
    <div class="bg-gray-100 dark:bg-gray-800 rounded-lg p-6">
      <h1 class="text-blue-600 dark:text-blue-400">Adaptive Heading</h1>
    </div>
  </body>
</html>
```

---

## Customising the Design System

### The `tailwind.config.js` File

Tailwind's default design system is intentionally comprehensive, but real projects invariably require customisation — brand colours, custom fonts, non-standard breakpoints. All customisation is managed in `tailwind.config.js`.

There are two approaches to customisation: **extending** (adding to the defaults) and **overriding** (replacing the defaults).

### Extending the Theme

Use `theme.extend` to add values without removing the defaults:

```javascript
// tailwind.config.js
export default {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      // Add brand colours alongside default palette
      colors: {
        brand: {
          50:  '#eff6ff',
          100: '#dbeafe',
          500: '#1d4ed8',
          700: '#1e3a5f',
          900: '#0f1f3d',
        },
        'cosc-purple': '#6d28d9',
      },
      
      // Add custom fonts
      fontFamily: {
        display: ['Playfair Display', 'serif'],
        body: ['Inter', 'sans-serif'],
      },
      
      // Extend spacing scale
      spacing: {
        '18': '4.5rem',   // 72px — not in defaults
        '88': '22rem',    // 352px — not in defaults
        '128': '32rem',   // 512px — not in defaults
      },
      
      // Custom breakpoints (added alongside defaults)
      screens: {
        'xs': '475px',
        '3xl': '1920px',
      },
      
      // Custom border radius
      borderRadius: {
        '4xl': '2rem',
      },
      
      // Custom animations
      animation: {
        'spin-slow': 'spin 3s linear infinite',
        'fade-in': 'fadeIn 0.5s ease-in-out',
      },
      keyframes: {
        fadeIn: {
          '0%': { opacity: '0', transform: 'translateY(10px)' },
          '100%': { opacity: '1', transform: 'translateY(0)' },
        }
      }
    },
  },
}
```

Once defined, custom values are available exactly like built-in ones:

```html
<div class="bg-brand-500 text-white font-display text-4xl p-18 rounded-4xl animate-fade-in">
  Custom design system in action
</div>
```

### Overriding the Theme

To replace defaults entirely (rather than extend them), place values directly under `theme` without `extend`:

```javascript
export default {
  theme: {
    // Replaces the ENTIRE colour palette — only these colours will exist
    colors: {
      white: '#ffffff',
      black: '#000000',
      primary: { 500: '#1d4ed8', 700: '#1e3a5f' },
      neutral: { 100: '#f5f5f5', 500: '#737373', 900: '#171717' },
    },
    // Replaces the ENTIRE spacing scale
    spacing: {
      '0': '0px',
      '1': '4px',
      '2': '8px',
      '4': '16px',
      '8': '32px',
    },
  },
}
```

!!! warning "Override Carefully"
    Overriding (rather than extending) removes all defaults. For example, overriding `theme.colors` means built-in colours like `blue-500` and `red-400` no longer exist. This is appropriate for projects with strict design systems but can be disruptive if done inadvertently.

### Arbitrary Values

For one-off values that don't belong in the design system, Tailwind v3+ supports arbitrary value syntax using square brackets:

```html
<!-- Arbitrary dimensions -->
<div class="w-[347px] h-[200px]">Exact pixel dimensions</div>

<!-- Arbitrary colours -->
<div class="bg-[#1da1f2] text-white">Twitter blue</div>

<!-- Arbitrary CSS properties via bracket notation -->
<div class="[mask-image:linear-gradient(to_bottom,black,transparent)]">
  Fade out effect
</div>

<!-- Grid template with arbitrary value -->
<div class="grid grid-cols-[250px_1fr_1fr]">
  <!-- Fixed sidebar, two flexible columns -->
</div>
```

!!! tip "Use Sparingly"
    Arbitrary values undermine the design system constraint that makes Tailwind valuable. Use them only when a genuine one-off need arises (such as matching a precise brand asset dimension), not as a convenient escape from the scale.

---

## Component Patterns and Reuse

### The Duplication Concern

If you have used Tailwind for any non-trivial time, you will have noticed a tension: if you apply the same fifteen classes to every button in your application, you have a maintenance problem. Changing the button style requires finding every instance.

This concern is real, and Tailwind addresses it in a way that is philosophically consistent with the utility-first approach: **extract components at the framework or template level, not the CSS level**.

### CSS Components with `@apply`

Tailwind provides the `@apply` directive, which allows you to compose utility classes into a custom class in your CSS file:

```css
/* src/style.css */
@tailwind base;
@tailwind components;
@tailwind utilities;

@layer components {
  .btn {
    @apply inline-flex items-center justify-center px-4 py-2 rounded-lg font-medium
           transition-colors duration-200 focus:outline-none focus:ring-2 focus:ring-offset-2;
  }

  .btn-primary {
    @apply bg-blue-500 text-white hover:bg-blue-600 focus:ring-blue-500;
  }

  .btn-secondary {
    @apply bg-gray-100 text-gray-800 hover:bg-gray-200 focus:ring-gray-400;
  }

  .btn-danger {
    @apply bg-red-500 text-white hover:bg-red-600 focus:ring-red-500;
  }

  .card {
    @apply bg-white rounded-xl shadow-md overflow-hidden;
  }

  .form-input {
    @apply w-full px-3 py-2 border border-gray-300 rounded-lg 
           focus:border-blue-500 focus:ring-2 focus:ring-blue-200 
           focus:outline-none transition-colors;
  }
}
```

These classes are now usable in HTML:

```html
<button class="btn btn-primary">Save Changes</button>
<button class="btn btn-secondary">Cancel</button>
<button class="btn btn-danger">Delete Account</button>
```

!!! note "The @layer Directive"
    Placing custom styles in `@layer components` ensures they appear in the correct cascade position in the generated stylesheet — between base styles and utility classes. This means utility classes will always be able to override component styles when needed (e.g., `btn btn-primary mt-8` would apply the margin override without specificity issues).

!!! warning "`@apply` and Its Limits"
    `@apply` is useful for genuine components (buttons, form inputs, cards) that appear frequently and have a clear, stable identity. It should not be used to recreate the anti-patterns of conventional CSS — do not create `.card-with-blue-title-and-hover-shadow` abstractions just to avoid looking at utilities in HTML. The official Tailwind documentation recommends preferring component extraction at the template or framework level (e.g., a JavaScript component) over heavy `@apply` use.

### JavaScript-Based Component Extraction

In a real application, reuse is better handled through your template/component framework. If you are using a framework like React, Vue, or Svelte, define components once and reuse them:

```javascript
// src/components/Button.js (vanilla JS example)
function createButton(label, variant = 'primary', onClick = null) {
  const variantClasses = {
    primary: 'bg-blue-500 text-white hover:bg-blue-600 focus:ring-blue-500',
    secondary: 'bg-gray-100 text-gray-800 hover:bg-gray-200 focus:ring-gray-400',
    danger: 'bg-red-500 text-white hover:bg-red-600 focus:ring-red-500',
  };

  const btn = document.createElement('button');
  btn.className = `inline-flex items-center px-4 py-2 rounded-lg font-medium
                   transition-colors duration-200 focus:outline-none focus:ring-2 
                   focus:ring-offset-2 ${variantClasses[variant]}`;
  btn.textContent = label;
  if (onClick) btn.addEventListener('click', onClick);
  return btn;
}

export { createButton };
```

This is the recommended approach: utilities in HTML, reuse through JavaScript components.

---

## Practical Mini-Project

### Task: Build a Responsive Product Card Grid

This mini-project consolidates the concepts covered so far. You will build a responsive product card layout that includes an image placeholder, product details, rating, and a call-to-action button.

**Full working example (`index.html`):**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Grid – Tailwind Demo</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50 min-h-screen">

  <!-- Page header -->
  <header class="bg-white shadow-sm sticky top-0 z-10">
    <div class="max-w-6xl mx-auto px-4 py-4 flex items-center justify-between">
      <h1 class="text-xl font-bold text-gray-900">ShopApp</h1>
      <nav class="hidden md:flex items-center gap-6">
        <a href="#" class="text-gray-600 hover:text-gray-900 text-sm font-medium transition-colors">Products</a>
        <a href="#" class="text-gray-600 hover:text-gray-900 text-sm font-medium transition-colors">About</a>
        <button class="bg-blue-600 text-white text-sm px-4 py-2 rounded-lg hover:bg-blue-700 transition-colors">
          Cart (0)
        </button>
      </nav>
    </div>
  </header>

  <!-- Main content -->
  <main class="max-w-6xl mx-auto px-4 py-10">
    
    <!-- Section heading -->
    <div class="mb-8">
      <h2 class="text-3xl font-bold text-gray-900">Featured Products</h2>
      <p class="text-gray-500 mt-1">Explore our curated selection for this season.</p>
    </div>

    <!-- Product grid: 1 col → 2 col → 3 col -->
    <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">

      <!-- Product Card (repeated 3 times with different data) -->

      <!-- Card 1 -->
      <article class="group bg-white rounded-2xl shadow-sm hover:shadow-xl transition-all duration-300 overflow-hidden">
        <!-- Image placeholder -->
        <div class="bg-gradient-to-br from-blue-100 to-blue-200 h-48 flex items-center justify-center">
          <span class="text-6xl">👟</span>
        </div>
        <!-- Card body -->
        <div class="p-5">
          <div class="flex items-start justify-between gap-2">
            <h3 class="font-semibold text-gray-900 group-hover:text-blue-600 transition-colors">
              Running Shoes Pro
            </h3>
            <span class="text-sm font-bold text-blue-600 bg-blue-50 px-2 py-0.5 rounded-full whitespace-nowrap">
              $89.99
            </span>
          </div>
          <p class="text-gray-500 text-sm mt-1 leading-relaxed">
            Lightweight and responsive for everyday training.
          </p>
          <!-- Rating -->
          <div class="flex items-center gap-1 mt-3">
            <div class="flex text-yellow-400 text-sm">★★★★★</div>
            <span class="text-gray-400 text-xs">(128 reviews)</span>
          </div>
          <!-- CTA -->
          <button class="w-full mt-4 bg-blue-600 hover:bg-blue-700 active:scale-[0.98] text-white 
                         text-sm font-medium py-2.5 rounded-xl transition-all duration-200">
            Add to Cart
          </button>
        </div>
      </article>

      <!-- Card 2 -->
      <article class="group bg-white rounded-2xl shadow-sm hover:shadow-xl transition-all duration-300 overflow-hidden">
        <div class="bg-gradient-to-br from-purple-100 to-purple-200 h-48 flex items-center justify-center">
          <span class="text-6xl">🎧</span>
        </div>
        <div class="p-5">
          <div class="flex items-start justify-between gap-2">
            <h3 class="font-semibold text-gray-900 group-hover:text-blue-600 transition-colors">
              Wireless Headphones
            </h3>
            <span class="text-sm font-bold text-blue-600 bg-blue-50 px-2 py-0.5 rounded-full whitespace-nowrap">
              $149.00
            </span>
          </div>
          <p class="text-gray-500 text-sm mt-1 leading-relaxed">
            40-hour battery life with active noise cancellation.
          </p>
          <div class="flex items-center gap-1 mt-3">
            <div class="flex text-yellow-400 text-sm">★★★★☆</div>
            <span class="text-gray-400 text-xs">(85 reviews)</span>
          </div>
          <button class="w-full mt-4 bg-blue-600 hover:bg-blue-700 active:scale-[0.98] text-white 
                         text-sm font-medium py-2.5 rounded-xl transition-all duration-200">
            Add to Cart
          </button>
        </div>
      </article>

      <!-- Card 3 — "Out of Stock" state example -->
      <article class="group bg-white rounded-2xl shadow-sm overflow-hidden opacity-75">
        <div class="bg-gradient-to-br from-green-100 to-green-200 h-48 flex items-center justify-center relative">
          <span class="text-6xl">🎒</span>
          <span class="absolute top-3 right-3 bg-red-500 text-white text-xs font-bold px-2 py-1 rounded-full">
            Sold Out
          </span>
        </div>
        <div class="p-5">
          <div class="flex items-start justify-between gap-2">
            <h3 class="font-semibold text-gray-500">Urban Backpack</h3>
            <span class="text-sm font-bold text-gray-400 bg-gray-100 px-2 py-0.5 rounded-full whitespace-nowrap">
              $59.99
            </span>
          </div>
          <p class="text-gray-400 text-sm mt-1 leading-relaxed">
            Minimalist design with 20L capacity.
          </p>
          <div class="flex items-center gap-1 mt-3">
            <div class="flex text-yellow-300 text-sm">★★★★★</div>
            <span class="text-gray-300 text-xs">(214 reviews)</span>
          </div>
          <button disabled class="w-full mt-4 bg-gray-200 text-gray-400 text-sm font-medium 
                                  py-2.5 rounded-xl cursor-not-allowed">
            Out of Stock
          </button>
        </div>
      </article>

    </div>
  </main>

</body>
</html>
```

**Line-by-line analysis of the card component:**

```html
<article class="group bg-white rounded-2xl shadow-sm hover:shadow-xl transition-all duration-300 overflow-hidden">
```
- `group` — registers this element as a group parent, enabling `group-hover:` on children
- `bg-white` — white background
- `rounded-2xl` — 16px border radius
- `shadow-sm` — subtle resting shadow
- `hover:shadow-xl` — elevated shadow on hover
- `transition-all duration-300` — all transitions over 300ms
- `overflow-hidden` — clips the image to the card's rounded corners

```html
<h3 class="font-semibold text-gray-900 group-hover:text-blue-600 transition-colors">
```
- `group-hover:text-blue-600` — changes colour when the parent `article` (the group) is hovered, not just when this `h3` is hovered

```html
<span class="text-sm font-bold text-blue-600 bg-blue-50 px-2 py-0.5 rounded-full whitespace-nowrap">
```
- `py-0.5` — 2px vertical padding (half of the base unit)
- `rounded-full` — pill shape for the price badge
- `whitespace-nowrap` — prevents the price from wrapping onto two lines

### JavaScript Integration: Dynamic Card Rendering

Here is the same card rendered dynamically from a data array, demonstrating how Tailwind integrates naturally with JavaScript DOM manipulation:

```javascript
// src/main.js
import './style.css';

const products = [
  { id: 1, name: 'Running Shoes Pro', price: 89.99, emoji: '👟', rating: 5, reviews: 128, inStock: true, gradient: 'from-blue-100 to-blue-200' },
  { id: 2, name: 'Wireless Headphones', price: 149.00, emoji: '🎧', rating: 4, reviews: 85, inStock: true, gradient: 'from-purple-100 to-purple-200' },
  { id: 3, name: 'Urban Backpack', price: 59.99, emoji: '🎒', rating: 5, reviews: 214, inStock: false, gradient: 'from-green-100 to-green-200' },
];

function createStars(rating) {
  return Array.from({ length: 5 }, (_, i) => 
    `<span class="${i < rating ? 'text-yellow-400' : 'text-gray-200'}">★</span>`
  ).join('');
}

function renderCard(product) {
  const card = document.createElement('article');
  card.className = `group bg-white rounded-2xl shadow-sm ${product.inStock ? 'hover:shadow-xl' : 'opacity-75'} transition-all duration-300 overflow-hidden`;
  
  card.innerHTML = `
    <div class="bg-gradient-to-br ${product.gradient} h-48 flex items-center justify-center relative">
      <span class="text-6xl">${product.emoji}</span>
      ${!product.inStock ? '<span class="absolute top-3 right-3 bg-red-500 text-white text-xs font-bold px-2 py-1 rounded-full">Sold Out</span>' : ''}
    </div>
    <div class="p-5">
      <div class="flex items-start justify-between gap-2">
        <h3 class="font-semibold ${product.inStock ? 'text-gray-900 group-hover:text-blue-600' : 'text-gray-500'} transition-colors">
          ${product.name}
        </h3>
        <span class="text-sm font-bold ${product.inStock ? 'text-blue-600 bg-blue-50' : 'text-gray-400 bg-gray-100'} px-2 py-0.5 rounded-full whitespace-nowrap">
          $${product.price.toFixed(2)}
        </span>
      </div>
      <div class="flex items-center gap-1 mt-3">
        <div class="flex text-sm">${createStars(product.rating)}</div>
        <span class="text-gray-400 text-xs">(${product.reviews} reviews)</span>
      </div>
      <button 
        ${!product.inStock ? 'disabled' : ''}
        class="w-full mt-4 ${product.inStock 
          ? 'bg-blue-600 hover:bg-blue-700 active:scale-[0.98] text-white' 
          : 'bg-gray-200 text-gray-400 cursor-not-allowed'} 
          text-sm font-medium py-2.5 rounded-xl transition-all duration-200">
        ${product.inStock ? 'Add to Cart' : 'Out of Stock'}
      </button>
    </div>
  `;
  
  return card;
}

const grid = document.querySelector('#product-grid');
products.forEach(product => grid.appendChild(renderCard(product)));
```

!!! note "Reflection Question"
    Notice that in the JavaScript example, Tailwind classes are composed dynamically using template literals. What are the implications of this for the JIT scanner? What rule must you follow when dynamically constructing class names?

!!! warning "Dynamic Class Construction"
    The Tailwind JIT scanner performs static analysis — it scans your source files for string literals. It cannot detect classes that are built through string concatenation at runtime. For example, `'text-' + color + '-500'` will **not** be detected. You must always write complete class names as full strings. If you need conditional classes, use ternary operators with full class name strings, as shown in the example above.

---

## Common Pitfalls

### 1. Dynamic Class Concatenation

As noted above, this is the most dangerous mistake when using Tailwind with JavaScript:

```javascript
// ❌ WRONG — JIT scanner will not detect these classes
const colour = 'blue';
const shade = 500;
element.className = `text-${colour}-${shade}`;  // class not generated

// ✅ CORRECT — full class names must appear as literals
const classes = {
  blue: 'text-blue-500',
  red: 'text-red-500',
  green: 'text-green-500',
};
element.className = classes[colour];
```

If you need to conditionally apply many class combinations, consider using a utility like `clsx` or maintaining lookup tables as shown above.

### 2. Forgetting to Configure Content Paths

If classes appear in your HTML but generate no CSS, the most likely cause is an incorrect `content` configuration:

```javascript
// ❌ Incomplete — misses files in subdirectories
content: ["./index.html"]

// ✅ Correct — covers all relevant file types recursively
content: [
  "./index.html",
  "./src/**/*.{html,js,ts,jsx,tsx}",
]
```

Test by adding a class you haven't used yet and checking the generated CSS.

### 3. Specificity Surprises with `@apply`

When using `@apply` to create component classes, you may encounter unexpected specificity issues:

```css
/* This component class... */
.btn-primary {
  @apply bg-blue-500 text-white px-4 py-2;
}
```

```html
<!-- ...might not be overridden by a utility class... -->
<button class="btn-primary bg-green-500">  ← might still be blue! </button>
```

This occurs because `@layer components` places component styles before utilities in the stylesheet, so utilities should win — but only if the generated CSS is structured correctly and you haven't introduced higher-specificity selectors. Always use `@layer components` for custom component styles to ensure utilities can override them.

### 4. Treating Tailwind as a Shorthand System

A common misconception among developers transitioning from Bootstrap is that Tailwind is simply a set of shorthand utilities for writing CSS faster. It is not. The value is the **constrained design system** and the **co-location of styles with markup**. If you find yourself using many arbitrary values (`w-[347px]`, `text-[13px]`, `bg-[#c4b8a0]`), you are likely using Tailwind incorrectly and defeating its purpose.

### 5. Over-using `@apply`

It is tempting to use `@apply` to make your HTML "cleaner" by extracting all utilities into named classes:

```css
/* ❌ Anti-pattern: recreating conventional CSS with @apply */
.product-card-image-container {
  @apply bg-gradient-to-br from-blue-100 to-blue-200 h-48 flex items-center justify-center;
}
.product-card-title {
  @apply font-semibold text-gray-900 group-hover:text-blue-600 transition-colors;
}
```

This recreates the naming fatigue problem that Tailwind was designed to solve. Reserve `@apply` for genuinely repeated, stable UI primitives: buttons, inputs, badges, alerts. Everything else is better expressed as utilities in templates or JavaScript components.

### 6. Mixing Tailwind with Global Custom CSS Carelessly

If you write custom global CSS alongside Tailwind without using the `@layer` directive, you may create cascade conflicts:

```css
/* ❌ Risky — this will compete with Tailwind utilities unpredictably */
h2 {
  color: #1a1a1a;
  margin-bottom: 1rem;
}

/* ✅ Correct — place base resets in @layer base */
@layer base {
  h2 {
    @apply text-gray-900 mb-4;
  }
}
```

### 7. Ignoring Accessibility

Tailwind makes it easy to visually style elements in any way, including in ways that break accessibility. Common pitfalls include removing focus rings without replacement and using colour alone to convey information.

```html
<!-- ❌ Removes focus indicator entirely — keyboard users cannot see focus -->
<button class="focus:outline-none">Click</button>

<!-- ✅ Replace default outline with custom ring -->
<button class="focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-offset-2">Click</button>

<!-- ❌ Colour alone indicates error state -->
<input class="border-red-500">

<!-- ✅ Colour + text + ARIA attribute -->
<input class="border-red-500" aria-invalid="true" aria-describedby="error-msg">
<p id="error-msg" class="text-red-500 text-sm mt-1">This field is required.</p>
```

---

## Summary

### Key Takeaways

This lecture has introduced the utility-first CSS paradigm and Tailwind CSS as its most mature implementation. The central ideas are:

**Styling is co-located with structure.** Rather than maintaining a separate stylesheet with invented class names, styling is expressed directly in HTML using a fixed, learnable vocabulary. This eliminates naming, specificity, and dead-code problems.

**Tailwind is a constrained design system.** The spacing scale, colour palette, and type scale are not arbitrary — they are curated tokens that produce visually consistent UIs. Working within these constraints is the framework's fundamental value proposition.

**The build tool does the heavy lifting.** The JIT compiler scans source files and generates only the CSS you use. Production builds are small, and the development experience is fast. This requires correct `content` configuration.

**Customisation happens in configuration, not overrides.** Brand colours, fonts, and custom tokens are added through `tailwind.config.js`, integrating them into the same vocabulary as the defaults.

**Reuse happens at the component level.** Repeated UI patterns are extracted through JavaScript components or `@apply` for genuine primitives — not through semantic CSS classes that recreate the problems Tailwind was designed to solve.

### Where Tailwind Fits in the Ecosystem

```
Design System Layer
  └── tailwind.config.js (tokens: colours, spacing, type, breakpoints)
       │
Build Pipeline Layer
  └── Vite + PostCSS + Tailwind JIT (scans source → emits minimal CSS)
       │
Application Layer
  └── HTML / JSX / Vue templates (utilities applied directly)
  └── JS Components (reuse via component abstraction)
  └── @layer components (reuse via @apply for primitives only)
       │
Output
  └── Optimised CSS bundle (<10KB typical) + semantically rich HTML
```

Tailwind sits alongside — and integrates well with — every major JavaScript framework. In React, class names are expressed in `className`. In Vue, they appear in `:class` bindings. In Svelte, directly in `class` attributes. The utility vocabulary is identical regardless of framework, making Tailwind skills directly transferable.

### Further Reading

- [Tailwind CSS Official Documentation](https://tailwindcss.com/docs) — comprehensive reference for all utilities, configuration options, and plugins
- [Refactoring UI](https://www.refactoringui.com/) — by the creators of Tailwind; explains the design principles underlying the framework's token choices
- [Tailwind CSS IntelliSense (VS Code Extension)](https://marketplace.visualstudio.com/items?itemName=bradlc.vscode-tailwindcss) — autocomplete, linting, and hover previews for Tailwind classes in your editor

---

!!! note "Lab Exercise"
    Using what you have learned in this lecture, build a responsive profile card component. The card should include an avatar (use an emoji or colour block), a name, a short bio, two or three "skill tags" (styled badges), a social link, and a "Connect" button. The card should have a hover lift effect, use at least one `group-hover:` variant, and be fully responsive. Use the Vite + Tailwind setup rather than the CDN.

---

*End of Lecture – COSC2956 Internet Tools*