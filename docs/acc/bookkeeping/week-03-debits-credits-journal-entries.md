# Week 3: Debits, Credits, and Journal Entries — The Core Mechanism

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - State the debit/credit rule for every account type without hesitation
    - Understand *why* debits and credits work the way they do (not just memorize the rules)
    - Record any basic business transaction as a journal entry with debits equal to credits
    - Handle compound entries (transactions affecting three or more accounts)
    - Record HST correctly on both sales and purchases
    - Recognize and fix the five most common beginner errors
    - Read a journal entry in QuickBooks Online and understand what it's doing
    - Translate a plain-English business event into a correct journal entry automatically

!!! tip "Why this is the single most important week in the course"
    Every bookkeeping task you will ever do — recording a sale, paying a bill, running payroll, reconciling the bank, posting an adjusting entry — is fundamentally a journal entry. The software hides the mechanics behind pretty forms, but underneath every click, QuickBooks is creating a journal entry. A bookkeeper who doesn't understand the underlying entry is dependent on the software's defaults. A bookkeeper who understands the entry can fix any error, handle any unusual transaction, and explain the books to anyone. This is the week that converts you from someone who *uses* accounting software into someone who *controls* accounting software.

---

## 3.1 The Real Meaning of Debit and Credit

Beginners often assume "debit" means *decrease* and "credit" means *increase* — because that's how we think about bank card transactions. A debit card takes money out. A credit card gives money.

Forget that. In bookkeeping, debit and credit have nothing to do with "out" and "in."

**Debit** simply means **the left side of an account**. Nothing more.
**Credit** simply means **the right side of an account**. Nothing more.

That's it. No moral weight. No "good" or "bad." Just left and right.

### The T-Account

Every account in bookkeeping has two sides. We visualize this as a "T":

```
              ACCOUNT NAME
    ─────────────────────────────
    DEBIT             │    CREDIT
    (left side)       │    (right side)
                      │
                      │
```

Every transaction posts to at least two accounts — with a debit to one account and a credit to another. The total of all debits must equal the total of all credits. This is **double-entry bookkeeping**, and it's why bookkeeping is self-checking.

### Why the Bank Card Analogy Confuses People

When your bank statement says "debit $50" it means your bank's record of YOUR ACCOUNT was credited — because from the bank's perspective, your money deposited there is a liability (they owe it back to you). When you withdraw, they debit their liability account (reducing what they owe you).

In other words: the "debit" on your bank card is from the bank's point of view, not yours. It's their internal bookkeeping language leaking into customer statements.

Your job as a bookkeeper is different. When your client's cash increases, you debit their Cash account — because Cash is an asset, and assets increase with a debit. That's the rule you live by.

---

## 3.2 The Debit/Credit Rule — Derived From the Accounting Equation

In Week 2, we established normal balances. Let's refine that into an actionable rule.

### Visualizing the Equation

```
          ASSETS     =     LIABILITIES    +    EQUITY
          ─────              ────────          ──────
           DR            │      CR        │      CR
         (left)          │    (right)     │    (right)
```

Every account type has a "normal side" — the side where its balance naturally sits:

- **Assets** live on the LEFT (debit side) of the equation → increase with a **debit**
- **Liabilities** live on the RIGHT (credit side) → increase with a **credit**
- **Equity** lives on the RIGHT (credit side) → increase with a **credit**

Revenue and Expenses are sub-categories of Equity:

- **Revenue** increases equity → increases with a **credit**
- **Expenses** decrease equity → increase with a **debit**

### The Complete Rule Table

Memorize this by understanding it, not by rote.

| Account Type | Increase | Decrease |
|---|---|---|
| Assets | **Debit** | Credit |
| Liabilities | Credit | **Debit** |
| Equity | Credit | **Debit** |
| Revenue | Credit | **Debit** |
| Expenses | **Debit** | Credit |

### A Useful Mnemonic — DEAD CLIC

If you need a memory shortcut while the logic settles in:

- **DEAD** — **D**ebits increase **E**xpenses, **A**ssets, and **D**raws
- **CLIC** — **C**redits increase **L**iabilities, **I**ncome (Revenue), and **C**apital (Equity)

Use this mnemonic as training wheels. Drop it as soon as you can.

---

## 3.3 Every Transaction Has Two Sides

This is the foundational truth of double-entry bookkeeping:

**Every transaction affects at least two accounts, and the debits must equal the credits.**

Why? Because every business event has two dimensions. When you receive cash, something gave it to you. When you spend cash, you got something in exchange. When a customer owes you money, you must have delivered them something. The accounting equation *always* stays balanced because every transaction preserves it.

### The Logic of Two Sides

Consider a simple transaction: a business buys $500 of office supplies with cash.

```
What happened?
  Office Supplies (an asset/expense) INCREASED by $500
  Cash (an asset) DECREASED by $500
```

Now apply the rules:

```
Office Supplies Expense increases with a DEBIT   → Debit $500
Cash decreases (asset opposite) with a CREDIT    → Credit $500
```

The entry:

```
Debit  Office Supplies Expense    $500
Credit     Cash                        $500
```

Debits = Credits = $500. The books stay in balance.

### Every Entry Answers Two Questions

For every transaction, ask:

1. **What did the business GET?** (Something came in — debit it.)
2. **What did the business GIVE UP?** (Something went out — credit it.)

For the office supplies example:
- Got: office supplies (an expense we "acquired")
- Gave up: cash

Debit what you got, credit what you gave up.

This isn't a universal rule for every kind of transaction (it breaks down with loans and equity transactions) — but for 90% of daily transactions, it works as a quick mental check.

---

## 3.4 The Journal Entry Format

Every journal entry follows a standard format. Learn it. Use it every time.

```
DATE              ACCOUNT                              DEBIT       CREDIT

2025-01-15        Office Supplies Expense              500.00
                      Cash                                            500.00

                  Memo: Staples order for first aid and printing
```

Key conventions:

- **Date first** — always record the transaction date, not the date you're entering it
- **Debit accounts listed first** — no indent
- **Credit accounts listed below** — indented to distinguish
- **Amounts in separate columns** — debits in one, credits in the other
- **Memo** — a brief description of what the transaction was for; essential for anyone reviewing later

The format feels formal, but it's critical. Anyone reading your journal entries — another bookkeeper, the accountant, a CRA auditor — should be able to understand what happened without needing to ask you.

---

## 3.5 The Ten Transactions of Lakeshore Auto Repair — Walking Through Each One

Let's apply everything we've learned to a real business. This is the section where theory becomes skill.

### Background

**Lakeshore Auto Repair** is a small independent auto shop in Kingston, Ontario. It's been in business three years, incorporated. The owner, Elena Vasquez, has two full-time mechanics and one part-time service advisor.

Today is **Friday, October 17, 2025**. We're recording this week's transactions. Elena uses QuickBooks Online, but I'm going to walk you through the underlying journal entries that QBO creates automatically when Elena enters these transactions through its forms.

### Transaction 1 — Customer Pays Cash for an Oil Change

**Monday, October 13**
Jennifer drops her 2018 Corolla off for an oil change. When she picks it up that afternoon, she pays $70 + $9.10 HST = $79.10 by Interac.

**Step 1: What happened?**
- The business got cash
- The business provided a service (earned revenue)
- The business collected HST on behalf of CRA

**Step 2: Which accounts are affected?**
- RBC Chequing (cash asset) — increased
- Service Revenue — increased
- HST Payable (liability) — increased

**Step 3: Apply the rules.**
- Asset increased → debit Cash
- Revenue increased → credit Service Revenue
- Liability increased → credit HST Payable

**The journal entry:**

```
2025-10-13  RBC Chequing                              79.10
                Service Revenue                                 70.00
                HST Payable                                      9.10

Memo: Oil change - J. Chen - 2018 Corolla - Interac payment
```

**Check:** Debits ($79.10) = Credits ($70.00 + $9.10 = $79.10) ✓

Notice a key point: the business only earned **$70 of revenue**, not $79.10. The HST is never revenue — it flows through as a liability. Revenue on the P&L will show $70 for this transaction. If you mistakenly coded the full $79.10 to Service Revenue, you'd overstate revenue and fail to track your HST obligation — a classic beginner error.

---

### Transaction 2 — Customer Charges Repair on Account (Credit Sale)

**Tuesday, October 14**
Kingston Municipal Utilities brings in one of their fleet vans for brake work. The invoice is $1,400 + $182 HST = $1,582. Per the agreement, they pay on net-30 terms. No money changes hands today.

**Step 1: What happened?**
- The business provided a service (earned revenue)
- The business collected HST (liability)
- The customer now OWES the business $1,582

**Step 2: Which accounts?**
- Accounts Receivable (asset) — increased
- Service Revenue — increased
- HST Payable (liability) — increased

**Step 3: Apply rules.**
- Asset increases → debit AR
- Revenue increases → credit Revenue
- Liability increases → credit HST Payable

**The entry:**

```
2025-10-14  Accounts Receivable                    1,582.00
                Service Revenue                              1,400.00
                HST Payable                                    182.00

Memo: Inv #1237 - Kingston Municipal Utilities - brake repair fleet van #4 - Net 30
```

**Check:** Debits ($1,582) = Credits ($1,400 + $182) ✓

Critical distinction: this is **accrual bookkeeping**. We recorded the revenue today even though no cash arrived. The service was delivered, the revenue is earned, period. When the customer pays in November, we'll record a different entry — a receipt.

---

### Transaction 3 — Customer Pays an Invoice From Last Month (Receipt)

**Tuesday, October 14 (later)**
The mail arrives. A cheque from a customer, Rideau Transport, for $2,825 — payment of an invoice from September for $2,500 + $325 HST. We already recorded the revenue and HST back in September when we invoiced them. Today, cash arrives.

**Step 1: What happened?**
- Cash came in
- The receivable is being satisfied

**Step 2: Which accounts?**
- Cash (or Undeposited Funds, if you're holding the cheque until deposit) — increased
- Accounts Receivable — decreased

**Step 3: Apply rules.**
- Asset increases → debit Cash
- Asset decreases → credit AR

**The entry:**

```
2025-10-14  RBC Chequing                            2,825.00
                Accounts Receivable                          2,825.00

Memo: Payment received - Rideau Transport - Invoice #1221
```

**Check:** Debits ($2,825) = Credits ($2,825) ✓

Notice what we did NOT do: we didn't touch Revenue or HST Payable. Why? Because the revenue was already recorded in September. HST was already recorded as a liability in September. Today's event is purely asset substitution: AR (asset) converts to Cash (asset). No new revenue; no new HST.

**If you accidentally recorded revenue AND HST again today, you'd double-count.** A classic error that inflates revenue, inflates HST, and requires a correction to unwind.

---

### Transaction 4 — Buy Parts on Account (Supplier Bill)

**Wednesday, October 15**
The weekly auto parts delivery arrives from Lordco Auto Parts. The bill is $620 + $80.60 HST = $700.60. Terms: net 30.

**Step 1: What happened?**
- The business received parts (expense — parts will be used in repair jobs, so they're an expense)
- The business paid HST that's recoverable from CRA (an ITC)
- The business owes Lordco $700.60

**Step 2: Which accounts?**
- Parts Expense (or Cost of Goods Sold - Parts) — increased
- HST Receivable / ITC (asset) — increased
- Accounts Payable (liability) — increased

**Step 3: Apply rules.**
- Expense increases → debit
- Asset increases → debit
- Liability increases → credit

**The entry:**

```
2025-10-15  Parts Expense                             620.00
            HST Receivable (ITC)                       80.60
                Accounts Payable - Lordco                       700.60

Memo: Parts order #LDC-8842 - weekly stock replenishment
```

**Check:** Debits ($620 + $80.60 = $700.60) = Credits ($700.60) ✓

This is your first **compound entry** — one with more than two accounts. It's still balanced. Multiple debits, one credit. The total debits equal the total credits. Same rules apply.

Note the HST treatment: because Lakeshore is HST-registered, the $80.60 of HST paid to Lordco is **recoverable from CRA** as an Input Tax Credit. It sits as an asset in HST Receivable until the HST return is filed, at which point it offsets HST Payable.

---

### Transaction 5 — Pay the Rent

**Wednesday, October 15**
Elena writes cheque #1248 to the landlord for monthly rent: $3,200 + $416 HST = $3,616. (Commercial rent is taxable in Ontario.)

**Step 1: What happened?**
- Cash went out
- Rent was paid (an expense)
- HST was paid on rent (recoverable ITC)

**Step 2: Which accounts?**
- RBC Chequing (asset) — decreased
- Rent Expense — increased
- HST Receivable (asset) — increased

**Step 3: Apply rules.**
- Asset decreases → credit Cash
- Expense increases → debit Rent Expense
- Asset increases → debit HST Receivable

**The entry:**

```
2025-10-15  Rent Expense                            3,200.00
            HST Receivable (ITC)                      416.00
                RBC Chequing                                  3,616.00

Memo: Cheque #1248 - October rent - Kingston Commercial Properties
```

**Check:** Debits ($3,200 + $416) = Credits ($3,616) ✓

A key point: two debits and one credit, still balanced. The HST paid on rent IS recoverable — many beginners miss this because "rent" feels like a fixed cost. It's still a taxable supply in Ontario and the HST is an ITC.

---

### Transaction 6 — Pay an Existing Supplier Bill

**Thursday, October 16**
Elena pays last month's bill from Lordco — cheque #1249 for $842.45, which covers Invoice #LDC-8771 from September ($745.53 plus HST of $96.92).

**Step 1: What happened?**
- Cash went out
- The payable is being settled

**Step 2: Which accounts?**
- RBC Chequing — decreased
- Accounts Payable - Lordco — decreased

**Step 3: Apply rules.**
- Asset decreases → credit Cash
- Liability decreases → debit AP

**The entry:**

```
2025-10-16  Accounts Payable - Lordco                 842.45
                RBC Chequing                                    842.45

Memo: Cheque #1249 - Payment of Inv #LDC-8771
```

**Check:** Debits = Credits ✓

Like Transaction 3 but in reverse: we don't touch Parts Expense or HST Receivable again because those were recorded in September when the bill came in. Today is just settlement.

The symmetry matters. Every credit sale (invoicing a customer) has a matching receipt transaction later (customer pays). Every credit purchase (receiving a supplier bill) has a matching payment transaction later (paying the supplier). The original entries record the economics; the later entries record the cash movement.

---

### Transaction 7 — Owner Takes a Salary

**Thursday, October 16 (payroll day)**
Elena is an employee of her own corporation (because Lakeshore is incorporated). Her bi-weekly salary is $2,500 gross. From that, the following are deducted:
- Income Tax: $425.00
- CPP: $145.00
- EI: $39.50

Net pay to Elena: $2,500.00 − $609.50 = $1,890.50

**Step 1: What happened?**
- Elena earned $2,500 in wages (business expense)
- The business withheld $609.50 in source deductions — owed to CRA
- Net $1,890.50 was paid by direct deposit

**Step 2: Which accounts?**
- Salary Expense — increased ($2,500)
- Source Deductions Payable — increased ($609.50)
- RBC Chequing — decreased ($1,890.50)

**Step 3: Apply rules.**

**The entry:**

```
2025-10-16  Salary Expense                          2,500.00
                Source Deductions Payable                       609.50
                RBC Chequing                                  1,890.50

Memo: Bi-weekly payroll - Elena Vasquez - Oct 3-16 period
```

**Check:** Debits ($2,500) = Credits ($609.50 + $1,890.50 = $2,500) ✓

Notice what we did NOT do here:
- We didn't expense the source deductions again (they're a liability held temporarily)
- We didn't touch HST (payroll has no HST)

Elena's full $2,500 is a salary expense for the corporation. But only $1,890.50 actually left the bank. The difference is held as a liability to CRA until the monthly payroll remittance.

There's also the **employer's portion** of CPP and EI (we don't cover that fully until Week 11), which would be an additional expense and additional liability. For now, keep this simple.

---

### Transaction 8 — Buy a Small Tool (Capital vs. Expense Decision)

**Thursday, October 16**
Elena buys a new tire pressure gauge for $35 + $4.55 HST = $39.55. She uses the business debit card.

**The decision:** Is $35 a capitalized asset or an expense?

The general bookkeeping rule for Lakeshore (set by Elena and her accountant): purchases under $500 are expensed; over $500 are capitalized as equipment. At $35, this is clearly an expense.

**The entry:**

```
2025-10-16  Small Tools & Supplies                     35.00
            HST Receivable (ITC)                         4.55
                RBC Chequing                                     39.55

Memo: Tire pressure gauge - Napa #1847
```

**Check:** Debits ($35 + $4.55) = Credits ($39.55) ✓

If Elena instead bought a hydraulic press for $2,800, we'd capitalize it:

```
2025-10-16  Equipment                               2,800.00
            HST Receivable (ITC)                      364.00
                RBC Chequing                                  3,164.00
```

And we'd book depreciation on it monthly thereafter (Week 5 topic).

---

### Transaction 9 — Owner Reimburses Herself for a Personal-Card Business Purchase

**Thursday, October 16**
Last week Elena had to rush to buy a specialty tool from the competitor next door and put it on her personal Visa. Cost: $85 + $11.05 HST = $96.05. Today she writes herself a reimbursement cheque.

**Step 1: What happened?**
- The business is compensating Elena for an out-of-pocket business expense
- The expense is recorded (with ITC)
- Cash leaves the business

**Step 2: Which accounts?**
- Small Tools & Supplies — increased
- HST Receivable — increased
- RBC Chequing — decreased

**The entry:**

```
2025-10-16  Small Tools & Supplies                     85.00
            HST Receivable (ITC)                       11.05
                RBC Chequing                                     96.05

Memo: Expense reimbursement - Elena - specialty tool from Main Street Auto
```

**Check:** Debits = Credits ✓

Important nuance: the ITC ($11.05) is claimable only if there's a valid receipt in Elena's name or the company's name showing HST charged. Since Elena has the receipt, we can claim it. Without a receipt, no ITC.

Also notice: we did NOT run this through the Shareholder Loan account because Elena is being reimbursed via cheque promptly. If the business instead owed Elena for this purchase (didn't pay her yet), we might record:

```
2025-10-16  Small Tools & Supplies                     85.00
            HST Receivable (ITC)                       11.05
                Shareholder Loan - Elena                          96.05
```

— which creates an IOU from the corporation to Elena, to be paid later.

---

### Transaction 10 — Bank Charges Appear on the Statement

**Friday, October 17**
Elena logs into online banking and sees a $28.00 monthly bank service charge deducted from the chequing account yesterday.

**Step 1: What happened?**
- The bank charged a fee
- Cash left the account

**Step 2: Which accounts?**
- Bank Charges Expense — increased
- RBC Chequing — decreased

**The entry:**

```
2025-10-16  Bank Charges Expense                      28.00
                RBC Chequing                                     28.00

Memo: Monthly service fee - RBC October 2025
```

**Check:** Debits ($28) = Credits ($28) ✓

Notice: no HST. Financial services are **exempt** from HST in Canada — no HST charged, no ITC to claim.

Typically you'd catch this transaction during the bank reconciliation at month-end (Week 10). QBO bank feeds may import it automatically.

---

### The Week's Trial Balance Snapshot

Let's see what the ten transactions did to the books this week. Summing just these ten transactions:

| Account | Debit | Credit |
|---|---|---|
| RBC Chequing (net change) |   | 5,663.00 |
| Accounts Receivable | 1,582.00 − 2,825.00 = | 1,243.00 (net credit) |
| HST Receivable | 911.20 |   |
| Parts Expense | 620.00 |   |
| Rent Expense | 3,200.00 |   |
| Salary Expense | 2,500.00 |   |
| Small Tools & Supplies | 120.00 |   |
| Bank Charges Expense | 28.00 |   |
| Accounts Payable (net change) | 842.45 − 700.60 = 141.85 | |
| HST Payable |   | 191.10 |
| Source Deductions Payable |   | 609.50 |
| Service Revenue |   | 1,470.00 |

If we total properly: total debits from these 10 transactions = total credits from these 10 transactions. Every single entry is balanced. The sum is balanced.

That's the power of double-entry. If the trial balance doesn't balance, we know with certainty there's an error — and we can find it.

---

## 3.6 Compound Journal Entries — When More Than Two Accounts Are Involved

Transactions 4, 5, 7, 8, and 9 above were all compound entries — multiple accounts, with the total debits still equaling total credits.

**Rule:** The number of debit lines and credit lines can be anything. What matters is that **total debits = total credits.**

You might have:
- 1 debit, 1 credit (most basic transaction)
- 2 debits, 1 credit (expense with HST paid in cash)
- 1 debit, 2 credits (receiving cash that includes revenue + HST)
- 3 debits, 1 credit (expense + HST + tip, all paid in cash)
- 2 debits, 3 credits (payroll with salary, ER-CPP, ER-EI on debit side; Source Deductions, EI/CPP payable, and net pay on credit side)

The structure of the entry follows the economics of what happened, not a predetermined shape.

### A More Complex Example

Imagine a contractor client paying a supplier for $2,000 of materials, but the supplier offered a 2% discount for paying within 10 days ($40). The contractor pays $1,960 cash. Everything is taxable.

- Materials Expense: $2,000 (already recorded when bill came in)
- HST Receivable: $260 (already recorded)
- AP had increased by $2,260 when bill came in

When we pay today with the 2% discount:

```
2025-10-17  Accounts Payable                        2,260.00
                RBC Chequing                                  1,960.00
                Purchase Discounts (Other Income)                40.00
                HST Receivable Adjustment (see note)            260.00 × 0.02 = 5.20
```

Wait — this is getting complicated. Let's simplify. In practice, the most common handling:

Option A — Discount reduces materials cost:

```
2025-10-17  Accounts Payable                        2,260.00
                RBC Chequing                                  1,960.00
                Materials Expense                                40.00
                HST Receivable                                    5.20
```

Wait, but if the discount reduces the cost, the HST on that portion shouldn't have been paid either, so the ITC should be reduced.

Option B — Discount as income:

```
2025-10-17  Accounts Payable                        2,260.00
                RBC Chequing                                  1,960.00
                Purchase Discounts (Income)                      40.00
                HST Adjustment                                    5.20? (rare)
```

Canadian practice varies. For simple bookkeeping, Option A (reducing the expense and the ITC by the discount) is most common for cash discounts taken. We revisit this in Week 9.

The point here: compound entries can get genuinely complex. But the core rule holds: **total debits = total credits.** If you can keep that true and you know which accounts are affected, you can handle any transaction.

---

## 3.7 HST on Journal Entries — The Quick Reference

We've seen HST in several transactions this week. Let's crystallize the rules.

### On Sales (You Charge HST)

When you sell something taxable:

- **Debit:** Cash or AR (the full amount including HST)
- **Credit:** Revenue (the pre-HST amount — the actual revenue)
- **Credit:** HST Payable (the 13% you collected on behalf of CRA)

### On Purchases (You Pay HST — ITC)

When you buy something taxable (and your business is HST-registered):

- **Debit:** Expense or Asset (the pre-HST amount)
- **Debit:** HST Receivable / ITC (the 13% you paid, recoverable)
- **Credit:** Cash or AP (the full amount including HST)

### On HST-Exempt Transactions

No HST on either side of the entry. Examples:
- Residential rent paid to or received from a landlord
- Most healthcare services
- Financial services (bank fees, loan interest)
- Educational services (most)

### On Zero-Rated Supplies

Zero-rated means HST is charged at 0% — technically taxable but at a 0% rate. You still claim ITCs on inputs. Examples:
- Basic groceries
- Prescription drugs
- Exports to foreign customers

Zero-rated transactions have the same journal structure as fully taxable — you just charge $0 of HST Payable. ITCs on purchases related to zero-rated supplies are still claimable.

!!! warning "The HST registration threshold"
    A business is required to register for HST once worldwide taxable revenue exceeds **$30,000 in any four consecutive calendar quarters**. Below that threshold, registration is optional. A non-registered business does NOT charge HST on sales and does NOT claim ITCs on purchases — they just pay HST and treat it as part of the cost of the purchase.

    Always verify HST registration status before doing any bookkeeping. A client operating as non-registered but with you claiming ITCs will face a CRA reassessment.

---

## 3.8 The Five Most Common Beginner Errors

Every beginner makes the same mistakes. Here they are, so you can catch yourself before a client catches you.

### Error 1 — Flipping Debits and Credits

You know which accounts are affected but put the debit and credit on the wrong sides. The entry balances (debits = credits), but both accounts have the wrong direction.

**Example:**

```
INCORRECT:
2025-10-20  Cash                  500.00
                Sales Revenue            500.00

Wait, this is actually correct. Let me try:

INCORRECT:
2025-10-20  Sales Revenue          500.00
                Cash                     500.00

This is backwards — it's recording a refund-like transaction, not a sale.
```

**How to catch:** After entering every transaction, mentally verify: "Did cash go up or down? If up, should be debited." And: "Did revenue go up or down? If up, should be credited." The DEAD/CLIC mnemonic is a useful sanity check.

---

### Error 2 — Posting HST to Revenue Instead of a Separate Liability

This is the most expensive error — and the most common. You record a $1,130 cash sale as:

```
INCORRECT:
2025-10-20  Cash                 1,130.00
                Sales Revenue          1,130.00
```

**Consequences:**
- Revenue is overstated by $130 (the HST portion)
- HST Payable is understated by $130
- When the HST return is filed, books won't reconcile
- Taxable income (for T2 or T2125) is overstated by $130 per transaction
- Year-end requires painful forensic work to unwind

**The correct entry:**

```
2025-10-20  Cash                 1,130.00
                Sales Revenue          1,000.00
                HST Payable              130.00
```

**How to catch:** Every time you record a sale, ask yourself: "Did I separate the HST?" In QBO, the sales tax tracker catches this if you set up HST properly — but only if you're using tax codes on every transaction.

---

### Error 3 — Treating Asset Purchases as Expenses (or Vice Versa)

The contractor buys a $3,200 air compressor and codes it to "Equipment Repairs."

**Consequences:**
- Equipment (asset) is understated on the balance sheet
- Expenses are overstated, understating profit for the period
- No depreciation will be booked going forward
- CRA will disallow the full expense (it's a capital asset, not a current expense)
- The accountant has to correct at year-end with a journal entry crossing periods

**How to catch:** Ask yourself the capitalization question for any purchase over $500: "Will this benefit the business for more than a year?" If yes — asset. If no — expense.

The reverse error: capitalizing every small purchase. Buying $45 of screws and booking it to Equipment is absurd and will require correction.

---

### Error 4 — Double-Counting Revenue on Credit Sales

You record an invoice in September:

```
2025-09-15  Accounts Receivable      1,130.00
                Sales Revenue              1,000.00
                HST Payable                  130.00
```

Customer pays in October. A beginner, seeing the $1,130 deposit, might record:

```
INCORRECT:
2025-10-10  Cash                     1,130.00
                Sales Revenue              1,000.00
                HST Payable                  130.00
```

**Consequences:**
- Revenue recorded twice (once in September, once in October)
- HST Payable recorded twice
- Accounts Receivable never got cleared — it still sits as an uncollected balance

**The correct entry for the October receipt:**

```
2025-10-10  Cash                     1,130.00
                Accounts Receivable         1,130.00
```

**How to catch:** Always ask: "Has this transaction already been recorded once?" If you invoiced on credit terms, the revenue is already there. Receiving payment just clears the receivable.

---

### Error 5 — Forgetting the HST Side on a Transaction

The cleaning service vendor sends a bill for $400. You record:

```
INCORRECT:
2025-10-20  Cleaning Expense          400.00
                Accounts Payable               400.00
```

But the bill actually shows $400 + $52 HST = $452. You forgot to split out the HST.

**Consequences:**
- Cleaning Expense is overstated by $52
- HST Receivable is understated by $52
- AP was recorded as $400 but the actual bill is $452 — reconciliation will fail
- ITC recovery is lost unless corrected

**The correct entry:**

```
2025-10-20  Cleaning Expense          400.00
            HST Receivable             52.00
                Accounts Payable               452.00
```

**How to catch:** Every bill with HST must show a three-line entry (expense, HST, AP or Cash). If you have a two-line entry and HST was charged, you missed it.

---

## 3.9 Recording Entries in QuickBooks Online

QBO doesn't ask you to enter journal entries directly most of the time. Instead, it provides forms that generate the journal entries behind the scenes.

### How QBO Generates Entries

When you create an **invoice** in QBO:

- Customer is selected (QBO knows which AR subledger to debit)
- Products/services are selected (QBO knows which revenue account to credit)
- Sales tax is calculated (QBO generates the HST Payable credit)
- Behind the scenes, QBO creates the journal entry automatically

When you record a **bill** in QBO:
- Vendor is selected (AP subledger)
- Expense categories are assigned (the expense debits)
- Sales tax is applied (HST Receivable debit)
- QBO creates the entry

### When You Might Still Need a Direct Journal Entry

Some transactions don't fit neatly into QBO's forms. For these, you use the **Journal Entry** function directly:

- Adjusting entries at month-end (accruals, prepaid allocations)
- Depreciation entries
- Reclassifying transactions between accounts
- Recording owner's draws or shareholder loan movements
- Opening balances when setting up a new company

To create a journal entry in QBO:
**+ New → Journal Entry**

Then enter the debit line(s), credit line(s), date, and memo. Save.

### Reading Journal Entries Behind QBO Transactions

To see the underlying entry QBO generated for any transaction:

1. Open the transaction
2. Click **More** → **Transaction Journal** (at the bottom)
3. QBO displays the debits and credits

Get in the habit of checking this for any unusual transaction. The journal entry is the truth — the form is just an interface.

### A Cautionary Note

QBO's forms will automatically assign default accounts based on what you selected. **Always verify** the account assignments are correct. If a service is linked to the wrong revenue account in your product/service setup, every invoice for that service goes to the wrong account. The error is invisible from the form — it only shows up in the underlying journal entry.

We go deep into QBO in Week 13. For now, know that:
- Every QBO transaction generates a journal entry
- The underlying entry is viewable and verifiable
- You can always create direct journal entries when forms don't fit
- The debit/credit rules you've learned this week apply universally, in QBO or anywhere else

---

## 3.10 Quiz — 15 Questions

**Question 1**
What is the normal balance of the following accounts?

(a) Cash
(b) HST Payable
(c) Service Revenue
(d) Rent Expense
(e) Owner's Draws

??? answer
    (a) Cash — **Debit** (it's an asset)
    (b) HST Payable — **Credit** (it's a liability)
    (c) Service Revenue — **Credit** (it's revenue, which increases equity via credit)
    (d) Rent Expense — **Debit** (it's an expense, which decreases equity via debit)
    (e) Owner's Draws — **Debit** (it's a contra-equity account; draws reduce equity, and you reduce a credit-balance account by debiting)

---

**Question 2**
A client sells $500 of taxable services in Ontario for cash. Write the full journal entry.

??? answer
    ```
    Debit  Cash                  565.00
    Credit     Service Revenue        500.00
    Credit     HST Payable             65.00
    ```

    The HST amount is $500 × 13% = $65. The customer pays $565 total. The business keeps $500 (revenue), holds $65 as a liability to CRA.

---

**Question 3**
A client pays $1,130 to a supplier for a bill that had been recorded last month. What's the journal entry?

??? answer
    ```
    Debit  Accounts Payable       1,130.00
    Credit     Cash                       1,130.00
    ```

    The original expense and HST Receivable were recorded when the bill came in. Today's transaction is pure cash movement to settle the liability. We do NOT touch Expense or HST Receivable again.

---

**Question 4**
A client buys $300 of office supplies with cash, plus $39 HST. Record the entry.

??? answer
    ```
    Debit  Office Supplies             300.00
    Debit  HST Receivable (ITC)         39.00
    Credit     Cash                           339.00
    ```

    This is a compound entry — two debits, one credit. Total debits ($339) = Credit ($339). The HST paid is recoverable as an ITC.

---

**Question 5**
A sole proprietor takes $2,000 from the business bank account for personal use. Record the entry.

??? answer
    ```
    Debit  Owner's Draws           2,000.00
    Credit     Cash                         2,000.00
    ```

    Draws reduce equity. Since equity's normal balance is credit, reducing equity requires a debit. We debit Owner's Draws (a contra-equity account). Cash as an asset decreases with a credit.

    This is NOT an expense. It would be very wrong to debit "Owner Compensation" or "Salary" here.

---

**Question 6**
A customer's $1,500 cheque bounces (NSF). The original invoice was $1,500 for taxable services. Write the correcting entry.

??? answer
    When the cheque was received (before it bounced):
    ```
    Debit  Cash                    1,500.00
    Credit     Accounts Receivable        1,500.00
    ```

    When the bank NSFs the cheque, we reverse that receipt — the receivable is back on the books:
    ```
    Debit  Accounts Receivable     1,500.00
    Credit     Cash                       1,500.00
    ```

    If the bank charges an NSF fee (say $45), record it separately:
    ```
    Debit  Bank Charges Expense     45.00
    Credit     Cash                          45.00
    ```

    The original HST on the invoice is NOT affected — it was recorded when the invoice was created, and the supply still occurred. The customer just hasn't paid.

---

**Question 7**
Which is the larger problem: (a) recording a $2,000 asset purchase as an expense, or (b) recording a $45 expense as an asset?

??? answer
    **(a) is the much larger problem.**

    Recording a $2,000 asset as an expense:
    - Understates total assets on the balance sheet by $2,000
    - Overstates expenses, understating profit by $2,000
    - CRA will likely disallow the full $2,000 expense on audit (since capital items must be depreciated over time, not expensed in one year)
    - The correction crosses periods once the error is discovered

    Recording a $45 expense as an asset:
    - Technically overstates assets by $45
    - Understates expenses by $45
    - CRA is unlikely to care about $45
    - Easily corrected when discovered

    Bookkeepers worry more about (a) — which is why the capitalization decision matters, especially for purchases above the $500 threshold.

---

**Question 8**
A corporation declares a $5,000 dividend to its shareholder. The shareholder owns 100% of shares. Record the entry when the dividend is declared. (Ignore tax withholding.)

??? answer
    ```
    Debit  Dividends Declared         5,000.00
    Credit     Dividends Payable            5,000.00
    ```

    When declared, the corporation has committed to paying but hasn't paid yet — so we create a payable. When paid:
    ```
    Debit  Dividends Payable          5,000.00
    Credit     Cash                         5,000.00
    ```

    Dividends Declared (an equity account) reduces retained earnings at year-end. It is NOT an expense — it doesn't reduce net income.

---

**Question 9**
A business receives a $25,000 bank loan. Record the entry.

??? answer
    ```
    Debit  Cash                     25,000.00
    Credit     Bank Loan Payable           25,000.00
    ```

    The business got cash (asset increases → debit). The business now owes the bank (liability increases → credit). No revenue — borrowing money isn't income. No expense — receiving a loan isn't a cost.

    A common error is coding loan receipts to "Other Income." This wildly overstates revenue and understates the actual liability.

---

**Question 10**
The corporation pays the first loan installment: $800 principal + $150 interest = $950 total. Record the entry.

??? answer
    ```
    Debit  Bank Loan Payable          800.00
    Debit  Interest Expense           150.00
    Credit     Cash                         950.00
    ```

    The loan balance decreases by $800 (principal portion). Interest is an expense (cost of borrowing). Cash decreases by the total $950. Three-line entry, debits = credits.

    Common mistake: booking the entire $950 as Interest Expense. This overstates expense and leaves the loan balance on the books forever.

---

**Question 11**
What's the difference between "Sales Revenue" and "HST Payable" when you make a $113 taxable sale?

??? answer
    **Sales Revenue** is the actual economic income of the business — the $100 in this example. It increases equity. It appears on the P&L as revenue.

    **HST Payable** is a liability — the $13 of HST collected on behalf of CRA. It does NOT belong to the business; it is held until remitted via the HST return. It appears on the balance sheet as a liability.

    If you recorded the full $113 as revenue, you would:
    - Overstate revenue by $13
    - Understate the HST you owe CRA by $13
    - Have an unbalanced HST return at quarter-end
    - Overstate taxable income for the business

---

**Question 12**
You're entering ten transactions in QBO and your trial balance suddenly shows debits of $18,530 and credits of $18,457 — a $73 difference. What does this tell you?

??? answer
    One or more of your entries is unbalanced — at least one transaction has debits ≠ credits. Since QBO generally prevents you from saving an unbalanced journal entry, the issue might be:

    - A recent direct journal entry where you typed amounts wrong and QBO let it through (rare but possible if you used "balance" poorly)
    - An opening balance that wasn't entered correctly during setup
    - A migration issue from another system
    - A recently deleted entry that half-unwound

    Action: Run a journal report for recent activity and look for any entries where the debit and credit totals don't match. Investigate the $73 gap specifically.

    In a properly functioning QBO, a trial balance off-balance is rare — the software enforces balance on every form. If it does happen, it usually indicates a hand-edited journal entry or a data corruption situation requiring investigation.

---

**Question 13**
An Ontario business owner buys a $600 tablet for personal use with the business credit card. How should you record it?

??? answer
    For a sole proprietor:
    ```
    Debit  Owner's Draws              600.00
    Credit     Credit Card Payable         600.00
    ```

    No HST claimed (it's a personal expense). No expense account (not a business cost).

    For a corporation:
    ```
    Debit  Shareholder Loan           600.00
    Credit     Credit Card Payable         600.00
    ```

    The corporation "loaned" $600 to the shareholder who used company funds for personal purposes. The shareholder loan balance grows. This is flagged at year-end for the accountant — if not repaid within a year, CRA may treat the entire shareholder loan as taxable income to the shareholder.

    Under no circumstance is this an expense of the business.

---

**Question 14**
A client signs a contract to receive $12,000 in consulting services to be provided over the next 12 months. The client pays $12,000 upfront. As the bookkeeper, what's the correct entry when the cash arrives?

??? answer
    ```
    Debit  Cash                    13,560.00 (with HST of $1,560)
    Credit     Deferred Revenue           12,000.00
    Credit     HST Payable                 1,560.00
    ```

    **Key insight:** The $12,000 has not been EARNED yet. The service will be delivered over 12 months. Cash has been received, but revenue recognition has not occurred.

    The correct treatment: credit **Deferred Revenue** (a liability — we owe the client services). Each month as the service is delivered, we reduce Deferred Revenue and recognize Revenue:
    ```
    Debit  Deferred Revenue         1,000.00
    Credit     Consulting Revenue         1,000.00
    ```

    By month 12, Deferred Revenue is zero and all $12,000 has been recognized as revenue over the period earned.

    Note on HST: HST is generally recognized when cash is received OR when the invoice is issued, whichever is earlier. So HST is payable upfront even though revenue is deferred. Ask the accountant if uncertain — this is an advanced area.

---

**Question 15**
A beginner's journal entry:
```
Debit  RBC Chequing             5,000.00
Credit     Service Revenue            5,650.00
```

What are ALL the problems with this entry?

??? answer
    Let's count the issues:

    1. **Debits ≠ Credits.** $5,000 ≠ $5,650. The entry is unbalanced and would be rejected by QBO.

    2. **HST appears to be mixed into revenue.** The $5,650 looks like $5,000 + 13% HST. Revenue should be $5,000; HST Payable should be $650.

    3. **Only one side on the debit.** If the customer paid $5,650 cash, the debit should match — $5,650, not $5,000.

    **The correct entry** (assuming customer paid full cash including HST):
    ```
    Debit  RBC Chequing             5,650.00
    Credit     Service Revenue            5,000.00
    Credit     HST Payable                  650.00
    ```

    Three problems in a two-line entry. A good diagnostic exercise for spotting errors quickly — the kind of detail review that catches beginners and saves clients real money.

---

## 3.11 Week 3 Readiness Checklist

Before moving to Week 4, confirm you can do all of the following without prompts:

- ☐ State the debit/credit rule for any account type (Assets, Liabilities, Equity, Revenue, Expenses) and explain why
- ☐ Apply DEAD/CLIC as a sanity check — but prefer logic over the mnemonic
- ☐ Write a journal entry in the standard format (date, account, debit, credit, memo)
- ☐ Record a simple two-line entry (cash in, revenue out)
- ☐ Record a compound entry with HST
- ☐ Distinguish between the original transaction entry and a subsequent cash movement (invoice vs. receipt; bill vs. payment)
- ☐ Handle HST on sales (credit HST Payable) and purchases (debit HST Receivable)
- ☐ Handle Owner's Draws correctly (contra-equity, not expense)
- ☐ Handle a bank loan (liability, not revenue)
- ☐ Handle an NSF cheque (reverse the receipt)
- ☐ Handle a payroll entry with source deductions
- ☐ Recognize and avoid the 5 most common beginner errors
- ☐ View the underlying journal entry for any QBO transaction
- ☐ Create a direct journal entry in QBO when needed

---

## 📚 Further Reading

- [CRA: Charge and collect the tax (GST/HST)](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/charge-collect.html)
- [CRA: Input tax credits](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/input-tax-credits.html)
- [QuickBooks Online: Create a journal entry](https://quickbooks.intuit.com/learn-support/en-ca/help-article/journal-entries/create-journal-entry-quickbooks-online/L6Bzy9mT0_CA_en_CA)

---

!!! tip "Up Next: Week 4 — The General Ledger and Trial Balance"
    **From individual entries to organized summary.** Now that you can record any transaction as a journal entry, we learn how entries accumulate into the general ledger — the master record of every account's full history. Then we run the trial balance — the moment of truth when we confirm debits equal credits across the entire business. We also cover the four types of errors a balanced trial balance will NOT catch, because a balanced trial balance does not mean the books are correct — it only means the arithmetic is consistent. You'll learn what to look for beyond the math.
