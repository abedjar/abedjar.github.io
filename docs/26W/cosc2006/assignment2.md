---
search:
  exclude: true
---
### COSC2006 - Data Structures I

# Assignment 2

## Learning Objectives

By completing this assignment, you should be able to:

- Use Stack and Queue ADTs as a client — without accessing their internals
- Reason about the order of elements when using LIFO and FIFO structures
- Implement non-trivial algorithms using only ADT operations
- Handle edge cases carefully
- Write readable and maintainable Java code

!!! danger "Deadline"
    This assignment is due on **Tuesday March 24, 2026 at 23:55 EST (Brampton time)**.

??? success "This assignment is worth 5% of the total course grade."

---

## Overview

In this assignment, you will implement a utility class called `Utils` that provides a collection of methods for processing and manipulating **Stacks** and **Queues**.

!!! info "Key Assumptions"
    - You are a **client** of the Stack and Queue ADTs. You may only call the methods defined in `StackADT` and `QueueADT` — you cannot access internal fields, arrays, or nodes of any implementation.
    - You may use **any implementation** of Stack and Queue (array-based, linked-based, etc.) inside your methods to create auxiliary structures.
    - All provided interfaces must **not** be modified.

---

## Provided Interfaces

You are given the following two interfaces. Do **not** modify them.

!!! danger "Warning"
    Do not modify any of the provided interfaces. Modifying them may cause your submission to fail during grading even if it works on your machine.

```java title="StackADT.java" linenums="1"
/**
 * A collection of objects that are inserted and removed according
 * to the last-in, first-out principle.
 */
public interface StackADT<E> {

    /** Returns the number of elements in the stack. */
    int size();

    /** Tests whether the stack is empty. */
    boolean isEmpty();

    /** Adds an element at the top of the stack. */
    void push(E e);

    /** Returns, but does not remove, the element at the top of the stack. */
    E top();

    /** Removes and returns the top element from the stack. */
    E pop();
}
```

```java title="QueueADT.java" linenums="1"
/**
 * A collection of objects that are inserted and removed according
 * to the first-in, first-out principle.
 */
public interface QueueADT<E> {

    /** Returns the number of elements in the queue. */
    int size();

    /** Tests whether the queue is empty. */
    boolean isEmpty();

    /** Adds an element at the rear of the queue. */
    void enqueue(E e);

    /** Returns, but does not remove, the first element of the queue. */
    E first();

    /** Removes and returns the first element of the queue. */
    E dequeue();
}
```

---

## The `UtilsADT` Interface

You are also given the following interface that your `Utils` class **must implement**.

!!! danger "Warning"
    Do not modify this interface.

    ```java title="UtilsADT.java" linenums="1"
    public interface UtilsADT {

        // --- Stack only ---
        void transfer(StackADT<Integer> src, StackADT<Integer> dst);
        void reverse(StackADT<Integer> s);

        // --- Queue only ---
        QueueADT<Integer> cut(QueueADT<Integer> q);
        QueueADT<Integer> mirror(QueueADT<Integer> q);

        // --- Cross-structure (medium) ---
        QueueADT<Integer> stackToQueue(StackADT<Integer> s);
        StackADT<Integer> queueToStack(QueueADT<Integer> q);
        boolean isPalindrome(QueueADT<Integer> q);

        // --- Cross-structure (hard) ---
        QueueADT<Integer> interleave(StackADT<Integer> s, QueueADT<Integer> q);
        void rotate(StackADT<Integer> s, int k);
        boolean balance(StackADT<Integer> s, QueueADT<Integer> q);
    }
    ```

---

## Method Descriptions

### Warm-Up — Stack Methods

---

## (1) transfer
#### `void transfer(StackADT<Integer> src, StackADT<Integer> dst)`

Moves all elements from `src` into `dst`.  
After this method completes, `src` must be **empty**.  
The element that was on top of `src` must end up on top of `dst`.  
This is an **in-place** operation — no new structure is returned.

!!! warning "Edge Cases"
    - If `src` is empty, `dst` must remain unchanged.
    - If `dst` already has elements, the transferred elements are placed on top of the existing ones.

**Examples:**

| `src` (top → bottom) | `dst` (top → bottom) before | `src` after | `dst` after (top → bottom) |
|---|---|---|---|
| `[A, B, C]` | `[]` | `[]` | `[A, B, C]` |
| `[A, B, C]` | `[X, Y]` | `[]` | `[A, B, C, X, Y]` |
| `[]` | `[X, Y]` | `[]` | `[X, Y]` |

---

## (2) reverse
#### `void reverse(StackADT<Integer> s)`

Reverses the order of all elements in the stack **in place**.  
The element that was at the bottom must now be on top.  
No new stack is returned — the original stack is modified directly.

!!! warning "Edge Cases"
    - If the stack is empty or has one element, it remains unchanged.

**Examples:**

| Stack before (top → bottom) | Stack after (top → bottom) |
|---|---|
| `[5, 3, 1]` | `[1, 3, 5]` |
| `[7, 2, 9, 4]` | `[4, 9, 2, 7]` |
| `[42]` | `[42]` |

---

### Warm-Up — Queue Methods

---

## (3) cut
#### `QueueADT<Integer> cut(QueueADT<Integer> q)`

Splits the queue into two halves.  
The **front half** stays in the original queue `q`.  
The **back half** is returned as a **new queue**.

If the size is odd, the extra element stays in the **front half**.

This method **modifies** the original queue and **returns** a new queue.

!!! warning "Edge Cases"
    - If the queue is empty, `q` remains empty and an empty queue is returned.
    - If the queue has one element, `q` keeps that element and an empty queue is returned.

**Examples:**

| Queue before (front → rear) | `q` after | Returned queue (front → rear) |
|---|---|---|
| `[1, 2, 3, 4, 5]` | `[1, 2, 3]` | `[4, 5]` |
| `[A, B, C, D]` | `[A, B]` | `[C, D]` |
| `[X]` | `[X]` | `[]` |

---

## (4) mirror
#### `QueueADT<Integer> mirror(QueueADT<Integer> q)`

Returns a **new queue** that contains the same elements as `q` but in **reverse order**.  
The original queue `q` must be **left unchanged**.

!!! warning "Edge Cases"
    - If the queue is empty, return an empty queue.
    - If the queue has one element, return a new queue with that same element.

**Examples:**

| Queue `q` (front → rear) | `q` after | Returned queue (front → rear) |
|---|---|---|
| `[1, 2, 3]` | `[1, 2, 3]` | `[3, 2, 1]` |
| `[5, 10, 15, 20]` | `[5, 10, 15, 20]` | `[20, 15, 10, 5]` |
| `[7]` | `[7]` | `[7]` |

---

### Medium — Cross-Structure Methods

---

## (5) stackToQueue
#### `QueueADT<Integer> stackToQueue(StackADT<Integer> s)`

Drains the stack and returns a **new queue**.  
The element at the **bottom** of the stack must become the **front** of the queue.  
The original stack is **empty** after this call.

!!! warning "Edge Cases"
    - If the stack is empty, return an empty queue.

**Examples:**

| Stack (top → bottom) | Stack after | Returned queue (front → rear) |
|---|---|---|
| `[C, B, A]` | `[]` | `[A, B, C]` |
| `[3, 2, 1]` | `[]` | `[1, 2, 3]` |
| `[]` | `[]` | `[]` |

---

## (6) queueToStack
#### `StackADT<Integer> queueToStack(QueueADT<Integer> q)`

Drains the queue and returns a **new stack**.  
The element at the **front** of the queue must become the **bottom** of the stack.  
The original queue is **empty** after this call.

!!! warning "Edge Cases"
    - If the queue is empty, return an empty stack.

**Examples:**

| Queue (front → rear) | Queue after | Returned stack (top → bottom) |
|---|---|---|
| `[A, B, C]` | `[]` | `[C, B, A]` |
| `[1, 2, 3]` | `[]` | `[3, 2, 1]` |
| `[]` | `[]` | `[]` |

---

## (7) isPalindrome
#### `boolean isPalindrome(QueueADT<Integer> q)`

Returns `true` if the elements of the queue form a **palindrome** — that is, the sequence reads the same from front to rear as it does from rear to front.  
The original queue must be **left unchanged** after this call.

!!! warning "Edge Cases"
    - An empty queue is considered a palindrome — return `true`.
    - A queue with one element is always a palindrome — return `true`.

**Examples:**

| Queue (front → rear) | Queue after | Return |
|---|---|---|
| `[1, 2, 3, 2, 1]` | `[1, 2, 3, 2, 1]` | `true` |
| `[A, B, B, A]` | `[A, B, B, A]` | `true` |
| `[1, 2, 3]` | `[1, 2, 3]` | `false` |

---

### Hard — Cross-Structure Methods

---

## (8) interleave
#### `QueueADT<Integer> interleave(StackADT<Integer> s, QueueADT<Integer> q)`

Returns a **new queue** built by alternating one element from the stack top and one element from the queue front, starting with the stack.

If one structure runs out of elements before the other, the remaining elements from the non-empty structure are appended to the result in their natural order.

Both the original stack and queue are **empty** after this call.

!!! warning "Edge Cases"
    - If both are empty, return an empty queue.
    - If only the stack has elements, drain the stack into the result.
    - If only the queue has elements, drain the queue into the result.

**Examples:**

| Stack (top → bottom) | Queue (front → rear) | Returned queue (front → rear) |
|---|---|---|
| `[S1, S2, S3]` | `[Q1, Q2, Q3]` | `[S1, Q1, S2, Q2, S3, Q3]` |
| `[S1, S2]` | `[Q1, Q2, Q3]` | `[S1, Q1, S2, Q2, Q3]` |
| `[]` | `[Q1, Q2]` | `[Q1, Q2]` |

---

## (9) rotate
#### `void rotate(StackADT<Integer> s, int k)`

Moves the **top `k` elements** of the stack to the **bottom**, preserving their relative order.  
This is an **in-place** operation — the original stack is modified directly, no new stack is returned.

If `k` is greater than the size of the stack, use `k % size` to determine the effective rotation.  
If `k` is `0` or `k % size == 0`, the stack remains unchanged.

!!! warning "Edge Cases"
    - If the stack is empty or has one element, it remains unchanged.
    - If `k` is `0`, the stack remains unchanged.
    - If `k` equals the size of the stack, the stack remains unchanged.
    - `k` will always be a non-negative integer — you do not need to handle negative values.

**Examples:**

| Stack before (top → bottom) | k | Stack after (top → bottom) |
|---|---|---|
| `[A, B, C, D, E]` | `2` | `[C, D, E, A, B]` |
| `[1, 2, 3, 4]` | `1` | `[2, 3, 4, 1]` |
| `[X, Y, Z]` | `3` | `[X, Y, Z]` |

---

## (10) balance
#### `boolean balance(StackADT<Integer> s, QueueADT<Integer> q)`

Returns `true` if the stack and the queue have the **same size** and contain the **same elements in the same corresponding order** — that is, the top of the stack matches the front of the queue, the second element of the stack matches the second element of the queue, and so on.

Both the stack and the queue must be **left unchanged** after this call.

!!! warning "Edge Cases"
    - If both are empty, return `true`.
    - If they have different sizes, return `false` immediately.
    - Two structures are **not** balanced if they have the same elements in a different order.

**Examples:**

| Stack (top → bottom) | Queue (front → rear) | Return |
|---|---|---|
| `[A, B, C]` | `[A, B, C]` | `true` |
| `[1, 2, 3]` | `[1, 2, 4]` | `false` |
| `[A, B]` | `[A, B, C]` | `false` |

---

## Your Task

!!! note "Your Task"
    1. Create a class named `Utils.java`
    2. The class must implement the `UtilsADT` interface
    3. Implement all 10 methods exactly as described above
    4. Do not add extra public methods.
    5. Do not add a `main()` method.
    6. You may create private helper methods inside `Utils.java` if needed.
    7. Implement proper exception handling.

---

## Package Name

!!! danger "Important — Package Name"
    At the very top of your `Utils.java` file, you must declare a package using your **Algoma University username**.

    Your username is the part of your email before `@algomau.ca`, with **each name capitalized**.

    **Example:**  
    If your email is `jdoe@algomau.ca`, your package declaration must be:

    ```java
    package com.dsa.jdoe;
    ```

    If your email is `jsmith@algomau.ca`, your package declaration must be:

    ```java
    package com.dsa.jsmith;
    ```

    Submissions without a correct package declaration will **lose marks**.

---
## Starter Code

You can use the following starter code. Make sure to replace `Your.Username` with your actual username.

```java title="Utils.java" linenums="1"
package Your.Username;   // (1)!

public class Utils implements UtilsADT {

-------------------------------------------------------

    /**
     * Moves all elements from src into dst.
     * src is empty after this call.
     * The top of src ends up on top of dst.
     */
    @Override
    public void transfer(StackADT<Integer> src, StackADT<Integer> dst) {
        // TODO
    }

    /**
     * Reverses the stack in place.
     * The bottom element becomes the top.
     */
    @Override
    public void reverse(StackADT<Integer> s) {
        // TODO
    }


    /**
     * Splits q into two halves.
     * The front half stays in q.
     * The back half is returned as a new queue.
     * If size is odd, the extra element stays in q.
     */
    @Override
    public QueueADT<Integer> cut(QueueADT<Integer> q) {
        // TODO
        return null;
    }

    /**
     * Returns a new queue containing the elements of q in reverse order.
     * q is left unchanged.
     */
    @Override
    public QueueADT<Integer> mirror(QueueADT<Integer> q) {
        // TODO
        return null;
    }


    /**
     * Drains the stack into a new queue.
     * The bottom of the stack becomes the front of the queue.
     * The stack is empty after this call.
     */
    @Override
    public QueueADT<Integer> stackToQueue(StackADT<Integer> s) {
        // TODO
        return null;
    }

    /**
     * Drains the queue into a new stack.
     * The front of the queue becomes the bottom of the stack.
     * The queue is empty after this call.
     */
    @Override
    public StackADT<Integer> queueToStack(QueueADT<Integer> q) {
        // TODO
        return null;
    }

    /**
     * Returns true if the elements of q form a palindrome.
     * q is left unchanged.
     */
    @Override
    public boolean isPalindrome(QueueADT<Integer> q) {
        // TODO
        return false;
    }

 
    /**
     * Returns a new queue built by alternating elements from
     * the stack top and the queue front, starting with the stack.
     * Both structures are empty after this call.
     */
    @Override
    public QueueADT<Integer> interleave(StackADT<Integer> s, QueueADT<Integer> q) {
        // TODO
        return null;
    }

    /**
     * Moves the top k elements of the stack to the bottom,
     * preserving their relative order.
     * In-place — no new stack is returned.
     */
    @Override
    public void rotate(StackADT<Integer> s, int k) {
        // TODO
    }

    /**
     * Returns true if the stack and queue have the same size
     * and matching elements in corresponding positions.
     * Both structures are left unchanged.
     */
    @Override
    public boolean balance(StackADT<Integer> s, QueueADT<Integer> q) {
        // TODO
        return false;
    }
}
```

---

## Submission

!!! question "Submission Instructions"
    1. You will submit **ONLY 1 file** (the filename is case-sensitive):
          1. `Utils.java`
    2. Submission will be on **BrightSpace**
    3. Make sure your file compiles before submitting

!!! danger "Warning — Do Not Submit"
    Do **not** submit `StackADT.java`, `QueueADT.java`, `UtilsADT.java`, or any implementation classes.  
    Submit **only** `Utils.java`.

!!! danger "Late Submission Policy"
    -30% marks will be deducted for each day late. On Day 4 after the deadline, you will receive **0 marks** even if you submit.