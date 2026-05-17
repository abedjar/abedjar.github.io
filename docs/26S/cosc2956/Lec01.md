# Internet Tools - HTML 1: Introduction

**Course:** COSC 2956 | **Section:** W04

---

## Course Information

### Attendance & Communication

Your legal name (as registered with Algoma) will be used for attendance tracking.

**Email Communication:** Use your official Algoma email address
- Format: `First.Last@algomau.ca`
- Username: `First.Last`

### Participation Tools

**iClicker Setup:**
- Join at: `join.iclicker.com/QRPL`
- Join Code: `QRPL`

---

## Module Overview

**Textbook:** Fundamentals of Web Development, Third Edition  
**Authors:** Randy Connolly and Ricardo Hoar  
**Chapter:** 3 - HTML 1: Introduction

> Copyright © 2021, 2018, 2015 Pearson Education, Inc. All Rights Reserved

---

## What is HTML?

### Definition & Purpose

**HTML** is a markup language—a system for annotating documents in a way that distinguishes the annotations (markup) from the actual content.

Markup isn't new to you. Think of feedback from teachers or corrections made by editors—that's markup. HTML works the same way, using special notation to describe how content should be structured and interpreted.

### How Markup Works

At its core, markup communicates **information about content** in a way that's separate from the content itself.

In HTML, this markup is implemented through **tags** (formally called **HTML elements**). These tags tell the browser what type of content it's dealing with—a heading, a paragraph, a link, an image, etc.

---

## History of HTML

### The Early Days (1990-1991)

The first implementation of HTML and HTTP was created by **Tim Berners-Lee** and **Robert Cailliau** at CERN in 1990-1991, alongside the birth of the World Wide Web itself.

### Formal Standardization (1995-1997)

The **W3C (World Wide Web Consortium)** formally codified HTML standards between 1995 and 1997, creating the first official specifications.

### The Browser Wars (mid-1990s)

Competition between **Netscape Navigator** and **Microsoft Internet Explorer** drove rapid innovation:
- New HTML tags proliferated
- CSS (Cascading Style Sheets) emerged
- JavaScript was introduced
- But **interoperability problems** became a major issue as browsers diverged

By **1998**, the W3C froze HTML at **version 4.01** to stabilize the standard.

### XHTML Era (late 1990s)

The W3C developed **XHTML 1.0**, which applied stricter **XML** rules to HTML:
- Goal: Make rendering more predictable by enforcing strict syntax
- Two versions created:
  - **XHTML 1.0 Strict** - very strict rules
  - **XHTML 1.0 Transitional** - allowed legacy HTML
- **XHTML 2.0** specification stalled for years, bogging down progress

### HTML5 Revolution (2009+)

While XHTML 2.0 was stuck in development:

1. A group at **Opera** and **Mozilla** formed the **WHATWG** (Web Hypertext Application Technology Working Group)
2. By 2009, the **W3C abandoned XHTML 2.0** and adopted WHATWG's work
3. This work became **HTML5**

#### Three Main Goals of HTML5

1. **Handle Invalid Markup** - Specify unambiguously how browsers should deal with syntax errors (real-world messy HTML)
2. **Enable Rich Applications** - Provide an open, nonproprietary framework (JavaScript) for building sophisticated web apps
3. **Maintain Compatibility** - Stay backward compatible with existing web content

---

## HTML Syntax Basics

### Building Blocks: Elements & Tags

HTML documents are composed of **content** and **HTML elements**.

An **HTML element** is identified by **tags**:
- A `<tag>` is the element name enclosed in angle brackets
- Elements have an **opening tag** and a **closing tag**
- The element name appears in both tags

Example:
```html
<p>This is a paragraph element.</p>
```

### Attributes

HTML elements can also include **attributes**—name-value pairs that provide additional information:

```html
<a href="https://example.com">Click here</a>
<img src="photo.jpg" alt="A descriptive caption" width="300">
```

Attributes appear in the opening tag and modify how the element behaves.

### Empty Elements

Some elements don't contain text content. Instead, they are **instructions to the browser**:

```html
<img src="image.png" alt="Description">
<br>
<hr>
```

The most common empty element is **`<img>`** (image).

!!! note "XHTML vs HTML5"
    In **XHTML**, empty elements required a trailing slash: `<img ... />`
    
    In **HTML5**, the trailing slash is optional: `<img ...>` (though both are valid)

---

## Document Structure & Hierarchy

### Nesting Elements

Often, HTML elements contain other elements. This creates a hierarchy:

- The container element is the **parent**
- The contained element is the **child**
- Any elements within the child are **descendants** of the parent
- The parent is an **ancestor** of all its contained elements

This hierarchical structure is formalized in the **Document Object Model (DOM)**.

### Proper Nesting Rules

When nesting elements, follow this principle:

**A child's closing tag must occur before its parent's closing tag.**

**Correct:**
```html
<div>
  <p>This paragraph is inside the div.</p>
</div>
```

**Incorrect:**
```html
<div>
  <p>This paragraph is inside the div.
</div>
</p>
```

The browser expects proper nesting to understand the document structure correctly.

---

## Semantic Markup

### What is Semantic HTML?

**Semantic HTML** means using HTML tags to describe the *meaning* of content, not its appearance.

**Principle:** HTML should focus solely on **structure and meaning**. Visual presentation belongs in **CSS** (Cascading Style Sheets).

**Examples:**
- Use `<p>` for paragraphs (not for spacing)
- Use `<h1>` through `<h6>` for headings (not because of font size)
- Use `<button>` for buttons (not `<div>` styled to look like one)
- Use `<nav>` for navigation regions

### Why Semantic HTML Matters

#### **Maintainability**
Semantic markup is easier to update and modify. Your code clearly communicates intent, making future changes simpler.

#### **Performance**
- Faster to author (clearer intent)
- Faster to download (less bloated, more meaningful markup)
- Smaller file sizes

#### **Accessibility**
Not all users see web pages visually. Users with sight disabilities rely on **screen readers** (voice-reading software) to navigate content.

Semantic HTML provides the structure that screen readers need to interpret content correctly.

#### **Search Engine Optimization (SEO)**
Search engines rank pages partly based on the **title** and **major headings**. Semantic markup helps search crawlers understand page content and relevance.

---

## HTML Document Structure

### Basic HTML5 Document

Here's one of the simplest valid HTML5 documents:

```html
<!DOCTYPE html>
<html>
  <head>
    <title>My First Web Page</title>
  </head>
  <body>
    <h1>Welcome</h1>
    <p>This is my first web page.</p>
  </body>
</html>
```

### Complete HTML5 Document

A more complete example with structural elements:

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fundamentals of Web Development</title>
    <link rel="stylesheet" href="styles.css">
  </head>
  <body>
    <header>
      <h1>My Website</h1>
      <nav>
        <a href="/">Home</a>
        <a href="/about">About</a>
      </nav>
    </header>
    <main>
      <article>
        <h2>Article Title</h2>
        <p>Article content goes here...</p>
      </article>
    </main>
    <footer>
      <p>&copy; 2024 My Website</p>
    </footer>
  </body>
</html>
```

### Key Elements Explained

#### **DOCTYPE Declaration**

```html
<!DOCTYPE html>
```

The DOCTYPE tells the browser what type of document it's about to process. It **does NOT** indicate which version of HTML is used.

!!! info "DOCTYPE Purpose"
    DOCTYPE is a **document type declaration**, not a content declaration. It's a standard that modern browsers expect, even though HTML5 treats it more leniently than earlier versions.

#### **The `<html>` Element**

```html
<html lang="en">
```

- The **root element** containing all other HTML elements
- The optional `lang` attribute specifies the document language
- In HTML5, it's not strictly required, but best practice recommends including it

#### **The `<head>` Element**

```html
<head>
  <title>Page Title</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="styles.css">
</head>
```

- Contains **descriptive elements** about the document
- Includes: title, character encoding, linked stylesheets, scripts
- **Does NOT** contain visible content

##### The `<title>` Element

The `<title>` is crucial for **SEO (Search Engine Optimization)**:
- Appears in browser tabs and window titles
- Search engines use it to understand page topic
- Typically limited to ~60 characters in display
- Best practice: Put most important keywords first

#### **The `<body>` Element**

```html
<body>
  <!-- All visible content goes here -->
</body>
```

- Contains **all visible content** (HTML and text)
- Rendered and displayed by the browser
- Everything the user sees comes from `<body>`

---

## Quick Tour of HTML Elements

### Text Structure Elements

#### **Headings** (`<h1>` through `<h6>`)
Describe the main structure of the document using six levels of importance.

```html
<h1>Main Page Title</h1>
<h2>Section Heading</h2>
<h3>Subsection Heading</h3>
```

#### **Paragraphs** (`<p>`)
The basic unit of text in HTML. Block-level elements that add newlines before and after.

```html
<p>This is a paragraph of text.</p>
```

#### **Links** (`<a>`)
Hyperlinks are essential to the web. Can reference external sites, pages, or locations within the same page.

```html
<a href="https://example.com">External Link</a>
<a href="about.html">Internal Link</a>
<a href="#section-id">Link to Section</a>
```

#### **Inline Text Elements**
Don't disrupt text flow, but provide semantic meaning:

```html
<em>Emphasized text (italic)</em>
<strong>Strongly important text (bold)</strong>
<code>Programming code</code>
<mark>Highlighted text</mark>
<small>Fine print or legal text</small>
```

#### **Images** (`<img>`)
Display images by specifying a filename or URL:

```html
<img src="photo.jpg" alt="A description of the image" width="300" height="200">
```

- `src`: Required. Path to the image
- `alt`: Required. Alternative text for accessibility
- `width` and `height`: Optional. Dimensions in pixels

#### **Lists**

**Unordered List** (bulleted):
```html
<ul>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ul>
```

**Ordered List** (numbered):
```html
<ol>
  <li>First step</li>
  <li>Second step</li>
  <li>Third step</li>
</ol>
```

#### **Division** (`<div>`)
Container for grouping text or other HTML elements. Block-level with no intrinsic semantic meaning.

```html
<div class="container">
  <p>Content inside a div</p>
</div>
```

#### **Horizontal Rule** (`<hr>`)
Indicates a thematic break. Usually displays as a horizontal line.

```html
<p>End of section</p>
<hr>
<p>Start of new section</p>
```

#### **Character Entities**
Special characters that either can't be typed directly or have reserved meaning in HTML:

| Entity Name | Entity Number | Description |
|-------------|---------------|-------------|
| `&nbsp;` | `&#160;` | Non-breaking space |
| `&lt;` | `&#60;` | Less than `<` |
| `&gt;` | `&#62;` | Greater than `>` |
| `&copy;` | `&#169;` | Copyright © |
| `&euro;` | `&#8364;` | Euro € |
| `&trade;` | `&#8482;` | Trademark ™ |

#### **Semantic Block Elements**
Special containers for describing document structure (introduced in HTML5).

---

## Headings

### Heading Hierarchy

HTML provides **six levels of headings** (`<h1>` through `<h6>`):

```html
<h1>Most Important - Main Title</h1>
<h2>Section Heading</h2>
<h3>Subsection</h3>
<h4>Minor Subsection</h4>
<h5>Detailed Point</h5>
<h6>Minor Detail</h6>
```

### Using Headings Correctly

**Three key points:**

1. **Document Outline** - Headings create a document outline that browsers use for navigation and accessibility

2. **Choose Semantically, Not Visually** - Select heading level based on its *meaning* in the document structure, NOT because you like its default font size
   - ❌ Wrong: "I want big bold text, so I'll use `<h3>`"
   - ✅ Right: "This is a subsection, so it's an `<h2>`"

3. **Semantic Structure Matters** - Proper heading hierarchy helps:
   - Users with screen readers navigate the document
   - Search engines understand page content
   - Future developers understand the document structure

---

## Paragraphs, Divisions, and Structure

### Paragraphs (`<p>`)

The `<p>` tag is a container for text and inline HTML elements:

```html
<p>This is a paragraph with <em>emphasis</em> and a <a href="#">link</a>.</p>
```

- Block-level element (adds newlines before and after)
- Can contain inline elements and text
- Should not contain other block-level elements

### Divisions (`<div>`)

The `<div>` element is also a container:

```html
<div class="section">
  <h2>Section Title</h2>
  <p>Content goes here...</p>
</div>
```

- Block-level element
- **No intrinsic presentation or semantic meaning**
- Used to group and organize content
- Often paired with CSS classes for styling

### Horizontal Rules (`<hr>`)

Used to add visual and semantic breaks between sections:

```html
<section>
  <h2>First Topic</h2>
  <p>Content about the first topic...</p>
</section>

<hr>

<section>
  <h2>Second Topic</h2>
  <p>Content about the second topic...</p>
</section>
```

---

## Hyperlinks

### Creating Links

Links are created with the `<a>` (anchor) element:

```html
<a href="destination">Link label</a>
```

A link has **two main parts**:
1. **Destination** (`href` attribute) - Where the link goes
2. **Label** (text content) - What the user sees and clicks

### Types of Links

HTML supports many kinds of links:

1. **External Site Links** - Full URLs to other websites
   ```html
   <a href="https://example.com">Visit Example</a>
   ```

2. **Internal Links** - Links to other pages on your site
   ```html
   <a href="about.html">About Us</a>
   ```

3. **Same-Page Links** - Jump to a location on the current page
   ```html
   <a href="#contact">Go to Contact Section</a>
   ```

4. **Links to External Resources** - Images, PDFs, files
   ```html
   <a href="document.pdf">Download PDF</a>
   ```

5. **Email Links** - Open the user's email client
   ```html
   <a href="mailto:user@example.com">Email Us</a>
   ```

6. **JavaScript Links** - Execute JavaScript code
   ```html
   <a href="javascript:doSomething()">Click me</a>
   ```

7. **Phone Links** - Initiate phone calls on mobile
   ```html
   <a href="tel:+14165551234">Call Us</a>
   ```

8. **App Links** - Open other applications
   ```html
   <a href="skype:username">Skype Me</a>
   <a href="facetime:user@example.com">FaceTime</a>
   ```

### Absolute vs. Relative URLs

#### **Absolute URLs**
Used for external resources. Includes full URL with protocol:

```html
<a href="https://www.example.com/page.html">External Link</a>
```

Structure: `protocol://domain/path/filename`

#### **Relative URLs**
Used for internal resources. Browser assumes the current server:

```html
<a href="page.html">Link in same folder</a>
<a href="https://example.com">Without http://, browser assumes current server</a>
```

### Relative URL Examples

#### **Same Directory**
Link to a file in the same folder:
```html
<a href="about.html">About</a>
```

#### **Child Directory**
Link to a file in a subdirectory:
```html
<a href="pages/contact.html">Contact</a>
```

#### **Grandchild/Descendant Directory**
Link multiple levels down:
```html
<a href="content/products/list.html">Products</a>
```

#### **Parent/Ancestor Directory**
Use `../` to go up one level:
```html
<a href="../index.html">Home</a>
<a href="../../parent.html">Up two levels</a>
```

#### **Sibling Directory**
Go up, then into another folder:
```html
<a href="../other-section/page.html">Related Section</a>
```

#### **Root Reference**
Start from the site root:
```html
<a href="/pages/contact.html">Contact (from root)</a>
```

---

## Inline Text Elements

### What are Inline Elements?

Inline elements **do not disrupt text flow**—they don't cause line breaks. HTML defines over 30 of these elements.

Common inline text elements:

```html
<a>Anchor - hyperlinks</a>
<abbr>Abbreviation</abbr>
<br>Line break
<cite>Citation or reference</cite>
<code>Programming or markup code</code>
<em>Emphasis (typically italic)</em>
<mark>Highlighted or marked text</mark>
<small>Fine print or non-vital text</small>
<span>Inline container for styling</span>
<strong>Strongly important (typically bold)</strong>
<time>Date and time information</time>
```

### Common Uses

```html
<p>
  This paragraph contains <em>emphasized</em> text and 
  <strong>strongly important</strong> information. 
  Use <code>&lt;code&gt;</code> for showing markup.
  <br>
  Visit <a href="https://example.com">our website</a> for more.
</p>
```

---

## Images

### The `<img>` Element

```html
<img src="photo.jpg" alt="A photo description" width="300" height="200">
```

### Key Attributes

| Attribute | Required | Description |
|-----------|----------|-------------|
| `src` | ✓ | Path to the image file (URL or relative path) |
| `alt` | ✓ | Alternative text describing the image (for accessibility and SEO) |
| `width` | Optional | Width in pixels |
| `height` | Optional | Height in pixels |
| `title` | Optional | Tooltip text on hover |

### Best Practices

```html
<!-- Always include alt text -->
<img src="team-photo.jpg" alt="Our team posing outside the office">

<!-- Specify dimensions to prevent layout shift -->
<img src="logo.png" alt="Company Logo" width="200" height="80">

<!-- Use meaningful alt text, not "image" or "photo" -->
<!-- ❌ Wrong: -->
<img src="picture.jpg" alt="picture">

<!-- ✅ Right: -->
<img src="sunset.jpg" alt="Orange and purple sunset over the ocean">
```

---

## Lists

### Ordered Lists

For content where **order matters**:

```html
<ol>
  <li>Read the instructions</li>
  <li>Gather materials</li>
  <li>Follow each step</li>
  <li>Check your work</li>
</ol>
```

Renders as: 1. 2. 3. 4.

### Unordered Lists

For collections with **no particular order**:

```html
<ul>
  <li>Apples</li>
  <li>Oranges</li>
  <li>Bananas</li>
  <li>Grapes</li>
</ul>
```

Renders as: bullets (•)

### Description Lists

For **name-definition pairs**:

```html
<dl>
  <dt>HTML</dt>
  <dd>HyperText Markup Language - the standard for web pages</dd>
  
  <dt>CSS</dt>
  <dd>Cascading Style Sheets - used to style HTML documents</dd>
  
  <dt>JavaScript</dt>
  <dd>Programming language for interactive web features</dd>
</dl>
```

- `<dt>` = Definition Term
- `<dd>` = Definition Description

---

## HTML5 Semantic Structure Elements

### Semantic Elements Overview

HTML5 introduced meaningful structural elements to replace generic `<div>` tags:

| Element | Purpose |
|---------|---------|
| `<header>` | Introductory content or navigation area |
| `<nav>` | Navigation links |
| `<main>` | Main content of the page (should be unique per page) |
| `<section>` | Thematic grouping of content |
| `<article>` | Self-contained, distributable content |
| `<aside>` | Sidebar or supplementary content |
| `<figure>` | Self-contained illustration or diagram |
| `<figcaption>` | Caption for a `<figure>` |
| `<footer>` | Footer or closing information |

### Benefits of Semantic Elements

**Cleaner Code:**
```html
<!-- ❌ Old way: divs everywhere -->
<div class="header">
  <div class="nav">...</div>
</div>
<div class="content">
  <div class="article">...</div>
  <div class="sidebar">...</div>
</div>
<div class="footer">...</div>

<!-- ✅ New way: semantic structure -->
<header>
  <nav>...</nav>
</header>
<main>
  <article>...</article>
  <aside>...</aside>
</main>
<footer>...</footer>
```

### Flexibility of Semantic Elements

**Important:** Semantic elements apply **no special presentation**—they're flexible in use.

- `<article>` and `<section>` can be used in multiple ways
- Use them based on *meaning*, not appearance
- Pair with CSS classes for styling

### Article vs. Section

**`<article>`** - Self-contained, independent content:
```html
<article>
  <h2>Blog Post Title</h2>
  <p>Article content that could stand alone...</p>
</article>
```

**`<section>`** - Thematic grouping within a document:
```html
<section>
  <h2>Chapter 1</h2>
  <p>Introduction to the topic...</p>
</section>
<section>
  <h2>Chapter 2</h2>
  <p>Main content...</p>
</section>
```

### Figure and Figcaption

Use `<figure>` for self-contained content that could be moved elsewhere without disrupting the document:

```html
<figure>
  <img src="diagram.png" alt="System architecture diagram">
  <figcaption>Figure 1: Overview of the system architecture</figcaption>
</figure>

<figure>
  <blockquote>
    "The only way to do great work is to love what you do."
  </blockquote>
  <figcaption>— Steve Jobs</figcaption>
</figure>
```

### Common Document Structure

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Article Title</title>
  </head>
  <body>
    <header>
      <h1>Website Title</h1>
      <nav>...</nav>
    </header>

    <main>
      <article>
        <h2>Article Title</h2>
        <section>
          <h3>Introduction</h3>
          <p>Opening content...</p>
        </section>
        <section>
          <h3>Main Topic</h3>
          <p>Body content...</p>
        </section>
      </article>

      <aside>
        <h3>Related Links</h3>
        <ul>...</ul>
      </aside>
    </main>

    <footer>
      <p>&copy; 2024 My Site</p>
    </footer>
  </body>
</html>
```

---

## Additional Semantic Elements

### Blockquote

Indicates a quotation from another source:

```html
<blockquote>
  <p>The best time to plant a tree was 20 years ago. 
  The second best time is now.</p>
  <cite>— Chinese Proverb</cite>
</blockquote>
```

### Address

Contains contact information for a person or organization:

```html
<address>
  John Doe<br>
  123 Main Street<br>
  Anytown, ST 12345<br>
  <a href="mailto:john@example.com">john@example.com</a>
</address>
```

### Additional Elements

For a comprehensive list of text-level semantic elements and their uses, refer to Table 3.2 in your textbook.

---

## Plain HTML Rendering

!!! warning "Plain HTML Looks Plain"
    Basic HTML without CSS styling appears quite plain and unstyled. This is intentional—HTML defines *structure and meaning*, while **CSS** defines visual presentation.
    
    To create stylish, attractive web pages, you need **CSS** (Cascading Style Sheets), which you'll learn in Chapters 4 and 7.

---

## Key Takeaways

✓ **HTML is semantic markup** - Use tags to describe meaning, not appearance

✓ **Document structure matters** - Proper hierarchy and nesting are essential

✓ **Semantic HTML enables accessibility** - Screen readers and search engines depend on it

✓ **Separate content from presentation** - HTML for structure, CSS for styling

✓ **Learn HTML5 elements** - `<header>`, `<nav>`, `<main>`, `<article>`, `<section>`, `<footer>`, etc.

✓ **Use proper heading hierarchy** - `<h1>` through `<h6>` should follow document structure

✓ **Make links meaningful** - Both absolute and relative URLs have their place

✓ **Images need alt text** - Essential for accessibility and SEO

---

## Next Steps

In the next chapter, you'll learn **CSS** (Cascading Style Sheets) to make your HTML look great. CSS handles all the visual styling that makes web pages attractive and engaging.
