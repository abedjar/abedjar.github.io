# Week 8: Accounts Receivable — Getting Paid and Tracking It

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Manage the full AR cycle from invoice issuance through payment collection
    - Maintain individual customer ledgers and the overall AR subledger
    - Produce and read an AR aging report
    - Apply customer payments correctly (to specific invoices, not just the account balance)
    - Handle NSF cheques and the required reversal entries
    - Record early payment discounts correctly
    - Write off bad debts and claim the HST adjustment
    - Manage the collection process from friendly reminder through small claims court
    - Implement the internal controls that prevent AR-related fraud
    - Navigate QuickBooks Online's AR functions efficiently

!!! tip "Why AR is the skill employers test for intermediate roles"
    Entry-level bookkeepers typically handle data entry. Intermediate bookkeepers manage AR — which is where bookkeeping meets cash flow management. If you can run an AR aging, follow up on overdue accounts professionally, and handle the gnarly edge cases (NSFs, partial payments, bad debts), you demonstrate the judgment employers pay more for. Most Ontario accounting firms put their best junior bookkeepers on AR because poorly-managed AR kills small businesses.

---

## 8.1 What Accounts Receivable Really Is

**Accounts Receivable (AR)** represents money owed to a business by its customers for goods or services already delivered.

AR exists because most business-to-business (B2B) transactions don't involve immediate cash payment. When a business delivers services or ships products, it issues an invoice. The customer typically has 15, 30, 60, or even 90 days to pay. During that gap, the amount owed is tracked as Accounts Receivable.

### The Economic Reality

From the business's perspective, AR is both:

- **An asset:** The money will come in eventually
- **A risk:** The money might not come in — or might come in late

Most small business failures are caused not by lack of profit, but by lack of cash. A business can be profitable on paper while starving for cash because too much is tied up in AR. Managing AR aggressively is a survival skill.

### The Bookkeeper's Role

As a bookkeeper, you are the keeper of AR. Your responsibilities include:

- Ensuring invoices are issued promptly and correctly
- Tracking which customers owe what, and for how long
- Applying payments accurately to specific invoices
- Flagging overdue accounts for collection action
- Writing off bad debts when collection becomes impossible
- Maintaining controls that prevent fraud and errors

Not every business follows this discipline. Those that do are the ones that survive their first five years.

---

## 8.2 The AR Cycle — From Sale to Cash

The AR cycle has five stages. Learn them as a sequence.

```
1. SALE          →    2. INVOICE    →    3. STATEMENT    →    4. PAYMENT    →    5. APPLICATION
(delivery of         (formal bill         (reminder of         (customer          (matching
 goods or             sent to              outstanding          sends cash         payment to
 services)            customer)            balance)             or EFT)            specific
                                                                                   invoices)
```

### Stage 1 — Sale

The business delivers the product or performs the service. This is when revenue is earned under accrual accounting, regardless of when the customer pays.

### Stage 2 — Invoice

The business issues a formal invoice to the customer. In Ontario, an invoice must include:

- Business name and address
- Business's HST registration number (if applicable)
- Invoice date
- Invoice number (unique, sequential)
- Customer name
- Description of goods or services
- Amount, HST, and total
- Payment terms (net 30, due on receipt, etc.)

**Bookkeeping entry at invoice issuance:**
```
Dr. Accounts Receivable        [total including HST]
     Cr. Sales Revenue                [pre-HST amount]
     Cr. HST Payable                  [HST amount]
```

### Stage 3 — Statement

Some businesses send monthly statements showing all outstanding invoices for a customer. Useful for B2B relationships where customers may have multiple open invoices.

Statements are optional but helpful for maintaining visibility and professional discipline.

### Stage 4 — Payment

The customer pays. Methods include:
- Cheque (mailed)
- EFT / direct deposit
- Credit card (processed through merchant services)
- Interac e-Transfer
- Cash (rare for business-to-business)

### Stage 5 — Application

This is where beginners often stumble. When a customer sends a payment, you must **apply it to specific invoices** — not just reduce their account balance.

**Why this matters:**
- Aging reports depend on knowing which invoices are paid
- Bad debt write-offs need to identify specific invoices
- Customer disputes often reference specific invoices
- Collection escalation targets the oldest open invoices first

**Correct application:**
```
Dr. Cash                       [payment amount]
     Cr. Accounts Receivable — [Customer Name]    [payment amount]
         Applied to: Invoice #1234 ($800), Invoice #1241 ($500)
```

In QBO, you explicitly select which invoices the payment applies to. Don't just "receive payment" against the account — specify the invoices.

---

## 8.3 The Customer Subledger — Tracking Individual Balances

The Accounts Receivable account on the trial balance is a summary of every customer's balance. But you also need to know each customer's individual balance — and that's the **customer subledger**.

### How It Works

Every customer has their own "mini-ledger" showing:
- Invoices issued
- Payments received
- Current balance
- Credit limit (if any)

QBO maintains this automatically. When you view a customer, you see their complete history.

### The Reconciliation Check

The sum of all customer subledger balances must equal the AR balance on the trial balance.

```
Customer A: $2,400
Customer B: $1,200
Customer C: $3,800
Customer D: $   500
...
Total: $15,750

AR on trial balance: $15,750 ✓
```

If they don't match, something's wrong. Most commonly, it's a journal entry affecting AR directly (without going through a specific customer) — which should be avoided.

!!! warning "Never post to AR via a direct journal entry"
    In QBO, if you create a direct journal entry debiting or crediting AR, you must specify a customer. Otherwise, the subledger won't know who the entry belongs to, and you'll create a reconciliation problem.

    Always use the proper forms: Invoice (to increase AR), Receive Payment (to decrease AR), Credit Memo (to reduce AR for returns/disputes).

---

## 8.4 Payment Terms — What "Net 30" Really Means

Payment terms dictate when the customer is expected to pay. Standard terms you'll see:

| Term | Meaning |
|---|---|
| Due on Receipt | Payment expected immediately upon delivery of invoice |
| Net 15 | Payment due 15 days from invoice date |
| Net 30 | Payment due 30 days from invoice date (most common for B2B) |
| Net 45, Net 60, Net 90 | Longer terms, often for government or large corporate customers |
| 2/10 Net 30 | 2% discount if paid within 10 days; otherwise due in 30 days |
| EOM | End of Month (due at end of month of invoice date) |
| COD | Cash on Delivery (rare in modern B2B) |

### Calculating Due Dates

**Invoice date: October 5. Terms: Net 30.**

Due date: November 4 (30 days after October 5).

**Invoice date: October 5. Terms: Net 30 EOM.**

Due date: November 30 (end of month following invoice date).

QBO automatically calculates due dates based on the customer's default terms. Verify these are set correctly when you add a new customer.

### Why Terms Matter for Cash Flow

Terms dramatically affect cash flow. A business that sells $50,000/month on net 30 has $50,000 in AR at any given time (one month's worth). On net 60, that's $100,000 in AR. On net 90, $150,000.

Shorter terms mean faster collection = better cash flow. But shorter terms may be non-competitive in some industries.

---

## 8.5 The AR Aging Report — Your Most Powerful Tool

An **AR aging report** categorizes outstanding invoices by how long they've been outstanding. It's the single most important AR tool.

### The Standard Aging Buckets

Most aging reports use these buckets:
- **Current** (0-30 days outstanding, not yet due)
- **1-30 days overdue** (1-30 days past the due date)
- **31-60 days overdue**
- **61-90 days overdue**
- **Over 90 days overdue**

### A Sample Aging Report

```
SIMCOE SIGNS & GRAPHICS
AR Aging Report — October 31, 2025

Customer                  Current    1-30    31-60    61-90    >90     Total
──────────────────────────────────────────────────────────────────────────────
Alderbrook Realty        1,850.00                                     1,850.00
Barrie Boat Club         3,200.00  2,400.00                           5,600.00
Collingwood Trucking       420.00                                       420.00
Durham Medical Centre               1,800.00                          1,800.00
Empire Construction               3,850.00                           3,850.00
Ford's Dry Cleaning                           2,200.00                2,200.00
Green Valley Farms                                        4,500.00    4,500.00
Heritage Insurance         900.00                                       900.00
Innisfil Taxis                                              1,380.00   1,380.00
──────────────────────────────────────────────────────────────────────────────
TOTAL                    6,370.00  8,050.00  2,200.00   4,500.00    1,380.00 22,500.00
──────────────────────────────────────────────────────────────────────────────
PERCENT                   28.3%     35.8%     9.8%      20.0%       6.1%     100%
```

### Reading the Aging Report

Key insights from the report above:

**Good news:**
- 28% of AR is current (not yet due)
- Most balances are recent

**Warning signs:**
- $4,500 from Green Valley Farms is 61-90 days overdue — needs immediate follow-up
- $1,380 from Innisfil Taxis is over 90 days — close to write-off territory
- $2,200 from Ford's Dry Cleaning is at 31-60 days — moving toward critical

**Action items for the bookkeeper this week:**
1. Call Green Valley Farms (highest risk)
2. Send a strongly-worded collection letter to Innisfil Taxis
3. Follow up with Ford's Dry Cleaning before they slip further
4. Continue normal follow-up on 1-30 day accounts

### Collection Risk by Bucket

Industry research suggests the probability of collecting past-due AR declines sharply with age:

| Age of Debt | Probability of Collection |
|---|---|
| 0-30 days | ~98% |
| 31-60 days | ~90% |
| 61-90 days | ~75% |
| 91-120 days | ~65% |
| 121+ days | ~50% or less |

The lesson: act fast. A 45-day-old invoice is easier to collect than a 90-day-old invoice. Every week of delay reduces the probability of payment.

---

## 8.6 The Collection Process — Escalating Without Damaging the Relationship

Collections is part art, part process. You're trying to get paid without alienating the customer (who may be a future source of revenue).

### The Five-Stage Escalation

**Stage 1 — Friendly Reminder (Days 1-15 overdue)**

A short, friendly email or phone call. Tone: assumes good faith. "Just a reminder that Invoice #1234 for $X was due on [date]. Please let us know if you need a copy or have any questions."

**Template:**
```
Subject: Friendly reminder — Invoice #1234

Hi [Name],

I hope you're doing well. This is a friendly reminder that Invoice #1234
for $X,XXX.XX was due on [date]. We haven't received payment yet and
wanted to make sure everything is okay on your end.

If you need a copy of the invoice or there's any question I can help
with, please let me know. Otherwise, we'd appreciate payment at your
earliest convenience.

Thanks,
[Your name]
```

**Stage 2 — Second Notice (Days 30-45 overdue)**

More direct. Clear call to action. Reference the original invoice and the prior reminder.

**Stage 3 — Third Notice / Phone Call (Days 45-60 overdue)**

A direct phone call to the customer's AP contact. Ask specifically when payment will be made. Get a date commitment.

**Stage 4 — Collection Action Warning (Days 60-90 overdue)**

Formal letter. Warning of further collection steps. May include stopping future service or adding interest charges (only if stated in terms upfront).

**Stage 5 — Collection Agency or Small Claims Court (Days 90+)**

Either hand over to a collection agency (typically 20-30% fee on collected amount) or file in Small Claims Court.

### Ontario Small Claims Court

The Ontario Small Claims Court handles disputes up to **$35,000**. Below that limit, small claims court is the fastest, cheapest legal path for unpaid invoices.

Filing fees are modest (approximately $102 for claims up to $500; $218 for claims $500-$3,500; $358 for claims over $3,500, as of 2025).

Most businesses don't file small claims court often — the relationship cost of suing a customer usually outweighs the benefit. But knowing it's available (and the customer knowing it's available) is useful leverage.

### The Bookkeeper's Role in Collections

- **Running aging reports** and flagging overdue accounts
- **Sending routine reminder emails** (most bookkeepers handle Stage 1 and 2)
- **Scripting calls** and sometimes making them (depends on the business size and the bookkeeper's role)
- **Escalating to the owner** when collection action is needed (Stages 3-5)

Collections calls are typically not the bookkeeper's direct responsibility — but providing accurate data and timely flags is.

---

## 8.7 Recording Customer Payments — The Details

### Standard Payment

Customer pays $1,130 for Invoice #1234 ($1,000 + $130 HST).

```
Dr. Cash                      1,130.00
     Cr. Accounts Receivable          1,130.00
         Applied to Invoice #1234
```

Note: HST is NOT touched again. It was recorded when the invoice was issued. Payment just converts AR to Cash.

### Partial Payment

Customer pays only $600 on a $1,130 invoice.

```
Dr. Cash                        600.00
     Cr. Accounts Receivable            600.00
         Partial payment on Invoice #1234 ($530 remaining)
```

Invoice #1234 stays open with a $530 balance on the customer's subledger.

### Payment Covering Multiple Invoices

Customer sends one cheque for $4,750, covering three invoices:
- Invoice #1230: $2,260
- Invoice #1238: $1,356
- Invoice #1245: $1,134

Apply as follows in QBO:
```
Dr. Cash                      4,750.00
     Cr. Accounts Receivable          4,750.00
         Applied to: #1230 ($2,260), #1238 ($1,356), #1245 ($1,134)
```

The journal entry is simple. The value is in the application — QBO now knows all three invoices are closed.

### Overpayment (Customer Pays Too Much)

Customer sends $1,200 for a $1,130 invoice.

Option A: Apply the overpayment as a credit on the customer's account:
```
Dr. Cash                      1,200.00
     Cr. Accounts Receivable          1,130.00  (close Invoice #1234)
     Cr. Customer Deposits                70.00  (credit on account)
```

Next invoice to this customer can apply the $70 credit.

Option B: Refund the $70 excess to the customer.

### Payment with a Fee Deducted (Unusual)

A customer disputes a small portion and pays less than invoiced. For example, they invoice for $2,260, but pay $2,200, claiming $60 was in dispute.

Options:
1. Accept the $2,200, write off the $60 (with HST adjustment)
2. Insist on full payment and continue collection
3. Negotiate a credit memo for the $60

Option 1 is common for small disputes:
```
Dr. Cash                      2,200.00
Dr. Bad Debt Expense             53.10      (pre-HST portion)
Dr. HST Payable                   6.90      (HST recovery on disputed portion)
     Cr. Accounts Receivable          2,260.00
         Closed Invoice #1234 — $60 disputed, written off
```

---

## 8.8 Early Payment Discounts

Some businesses offer a discount for early payment — typically 2% if paid within 10 days.

**Invoice: $1,000 + $130 HST = $1,130. Terms: 2/10 Net 30.**

If customer pays within 10 days, they can take $20 off (2% of $1,000 pre-HST). They pay $1,110 instead of $1,130.

### Recording the Discount

```
Dr. Cash                      1,110.00
Dr. Sales Discount              20.00      (contra-revenue expense)
     Cr. Accounts Receivable          1,130.00
         Closed Invoice #1234 — 2% early payment discount taken
```

**Key point:** The discount reduces revenue (or is expensed as "Sales Discounts" — a contra-revenue account). HST is NOT adjusted — the original $130 HST was reported on the HST return when the invoice was issued. CRA allows an adjustment for early payment discounts on the HST return, but in practice, most small businesses don't bother claiming this small adjustment.

### The "Should I Take the Discount?" Math

For the customer offered 2/10 Net 30:
- Pay in 10 days to save 2%
- Or wait 20 additional days (from day 10 to day 30)

Annualized cost of NOT taking the discount:
- 2% discount for 20 extra days = (2%/20 days) × 365 days = **36.5% annualized**

That's an enormous implicit interest rate. Any business with access to credit at less than 36.5% should take the discount.

As a bookkeeper, if you're advising the client on bill payment timing (vendor side — we cover this in Week 9), take the 2/10 discount whenever cash flow allows.

---

## 8.9 NSF Cheques — The Proper Handling

A customer's cheque bounces. The bank returns it marked "Non-Sufficient Funds" (NSF) or "Returned."

### The Original Sale

Customer paid by cheque for $850 + $110.50 HST = $960.50. You recorded:

```
Dr. Cash                        960.50
     Cr. Accounts Receivable            960.50
         Applied to Invoice #1405
```

### The NSF Reversal

Now the cheque has bounced. The bank has taken the $960.50 back out of your account, and has likely added an NSF charge (e.g., $45).

**Entry 1 — Reverse the original receipt:**
```
Dr. Accounts Receivable        960.50
     Cr. Cash                             960.50
         Reverse NSF on Invoice #1405
```

The invoice is back on the books as unpaid.

**Entry 2 — Record the NSF bank fee:**
```
Dr. Bank Charges Expense         45.00
     Cr. Cash                              45.00
         Bank NSF fee on cheque from Customer X
```

**Entry 3 (optional) — Pass the NSF fee to the customer:**
```
Dr. Accounts Receivable          45.00
     Cr. Other Income                      45.00
         NSF fee charged to customer
```

The decision to charge the customer depends on:
- The customer's terms (does the contract allow it?)
- The owner's preference
- The business relationship

### What About HST on the NSF?

The supply still occurred. HST Payable was recorded when the invoice was issued. It stays on the HST return. The NSF is not a reason to reverse HST.

### The Important Follow-Up

After an NSF:
- Contact the customer immediately
- Request payment by certified cheque, bank draft, or EFT
- Do NOT accept another regular cheque from this customer
- Flag the customer's file — future sales may need cash-on-delivery terms
- If multiple NSFs occur, escalate to the owner

**Pattern recognition:** If a customer has two NSFs in 6 months, they're a credit risk. Flag them.

---

## 8.10 Bad Debts — When Collection Is Impossible

Eventually, some AR becomes uncollectable. The customer has gone bankrupt, moved, disappeared, or simply refuses to pay — and the cost of collection exceeds the amount owed.

At this point, the debt is **written off** as a **bad debt**.

### When to Write Off

Typical triggers:
- Customer has declared bankruptcy (creditor filing required)
- Customer has gone out of business
- 180+ days with no payment and multiple failed collection attempts
- Customer is unreachable and can't be located
- Small amount where collection cost exceeds the debt

Companies often set a specific time threshold (e.g., "automatically write off anything over 180 days overdue") as policy.

### The Write-Off Entry

**Example:** Customer X has an unpaid balance of $1,808 (which includes $208 HST on the original $1,600 invoice).

**Correct entry (reclaiming HST):**
```
Dr. Bad Debt Expense          1,600.00
Dr. HST Payable                 208.00
     Cr. Accounts Receivable         1,808.00
         Write off Customer X — bankruptcy, 180+ days overdue
```

Three things happen:
1. Bad Debt Expense recognized (reducing income)
2. HST Payable reduced (CRA effectively refunds this on next HST return)
3. AR balance reduced

### Claiming the HST Recovery

On the next HST return, the bad debt reduces HST Payable. On Form GST34:
- The HST reduction flows through Line 107 (adjustments)

### The Allowance Method — More Advanced

Some businesses use the **allowance method** — estimating bad debts in advance based on historical patterns and booking an allowance at month-end. This is more sophisticated but provides more accurate monthly financials.

For small business bookkeeping, the simpler "direct write-off" method (above) is more common. The accountant may recommend the allowance method at year-end for larger or audited businesses.

### Tax Implications

Bad debt expense is fully tax-deductible. The HST recovery is claimable. Properly documenting the write-off (date of decision, collection efforts made, customer status) protects the deduction on audit.

Documentation requirements for CRA:
- Date of the original sale and invoice
- Amount written off
- Date of write-off
- Evidence of collection efforts (copies of emails, notes of calls)
- Reason for write-off (bankruptcy notice, customer out of business, etc.)

If a bad debt is later collected (customer pays years later — rare but possible), reverse the write-off with corresponding entries.

---

## 8.11 Internal Controls for AR — Preventing Fraud

AR is a fraud-prone area. Specifically, the combination of receiving customer payments AND recording payments AND making bank deposits is a recipe for theft.

### The Classic AR Fraud — "Lapping"

One employee handles customer payments and AR. They take a $500 cheque from Customer A, deposit it but not into the business account — into their personal account. To cover Customer A's balance, they later take $500 from Customer B's payment and apply it to Customer A's account. Then Customer C's payment covers Customer B's. And so on.

The fraud runs as long as payments keep rolling in. It's called "lapping" because one customer's payment laps over to cover the previous one's gap.

**Detection:** Audit of specific invoice applications. Was Customer A's payment really deposited on that date? Is there a bank deposit matching that amount?

### The Three-Person Minimum — Segregation of Duties

The core control principle: **no single person should handle all of these:**

1. Invoicing customers
2. Receiving customer payments (physical cheques, opening mail, etc.)
3. Recording payments in the accounting system
4. Depositing payments at the bank
5. Reconciling the bank account

In a very small business with only 2-3 people, perfect segregation is impossible. But you can establish:

- Owner opens mail and endorses cheques (not the bookkeeper)
- Bookkeeper records but doesn't physically handle cash
- Owner or a separate person makes bank deposits
- Someone other than the person who reconciles makes deposits

### Practical Controls for Small Ontario Businesses

**Control 1: Lock the AR Access**
QBO lets you restrict users. The bookkeeper should have AR access; the bookkeeper should NOT have bank account signing authority.

**Control 2: Independent Bank Reconciliation Review**
We'll cover bank recs in Week 10 in detail. The key point: the person who prepares the bank rec should not be the same person who prepares all the AR entries. If one person does both, fraud is much easier to hide.

**Control 3: Regular Aging Review by the Owner**
The owner should personally review the AR aging at least monthly. They should know every customer over 60 days overdue by name. This creates accountability and prevents "phantom customer" fraud.

**Control 4: Direct Deposit Reconciliation**
When customers pay by EFT, the payments arrive directly in the bank account. The bookkeeper records them. But the bookkeeper should NOT be able to approve bank transfers OUT of the account. Keep those permissions separate.

**Control 5: Customer Master File Protection**
Adding a new customer, changing a customer's banking details, or changing an address should require manager approval. A fraudster can redirect payments to an alternate address they control.

---

## 8.12 Signature Example — Simcoe Signs & Graphics, Barrie

Let's apply everything to a realistic three-month AR scenario.

### The Business

**Simcoe Signs & Graphics** is owned by David Lin in Barrie. A small custom sign shop — vehicle graphics, storefront signs, banners. Twelve active customers on account, ranging from $500 to $8,000 in typical annual billings.

### The Three-Month Scenario

Let's follow AR through August, September, and October 2025.

### August Activity

**Aug 3** — Issue Invoice #3401 to Alderbrook Realty: $920 + $119.60 HST = $1,039.60. Terms: Net 30.

```
Dr. AR - Alderbrook Realty         1,039.60
     Cr. Sales Revenue                          920.00
     Cr. HST Payable                            119.60
```

**Aug 8** — Issue Invoice #3402 to Barrie Boat Club: $2,800 + $364 HST = $3,164. Terms: Net 30.

**Aug 10** — Issue Invoice #3403 to Durham Medical Centre: $1,600 + $208 HST = $1,808. Terms: Net 30.

**Aug 15** — Alderbrook pays Invoice #3401 in full. $1,039.60 received by cheque and deposited.

```
Dr. Cash                           1,039.60
     Cr. AR - Alderbrook Realty                1,039.60
         Applied to Invoice #3401
```

**Aug 22** — Issue Invoice #3404 to Green Valley Farms: $4,500 + $585 HST = $5,085. Terms: Net 30. (Note: this one will become problematic.)

**Aug 28** — Durham Medical pays Invoice #3403 in full by cheque.

```
Dr. Cash                           1,808.00
     Cr. AR - Durham Medical                   1,808.00
```

### August End — AR Aging

```
Customer                  Current         Total
──────────────────────────────────────────────────
Barrie Boat Club          3,164.00       3,164.00
Green Valley Farms        5,085.00       5,085.00
──────────────────────────────────────────────────
TOTAL                     8,249.00       8,249.00
```

Clean. No overdue items.

### September Activity

**Sep 2** — Issue Invoice #3405 to Empire Construction: $3,850 + $500.50 HST = $4,350.50. Terms: Net 30.

**Sep 8** — Barrie Boat Club pays $2,000 on Invoice #3402 (partial payment). Owner says they'll pay the balance by month-end.

```
Dr. Cash                           2,000.00
     Cr. AR - Barrie Boat Club                 2,000.00
         Partial payment on #3402 — $1,164 remaining
```

**Sep 10** — Issue Invoice #3406 to Collingwood Trucking: $2,200 + $286 HST = $2,486. Terms: Net 30.

**Sep 15** — Green Valley Farms misses their payment due date (was due Sep 21 — not yet overdue, but close). Send friendly reminder email.

**Sep 18** — Barrie Boat Club pays the remaining $1,164 on #3402. Invoice fully paid.

```
Dr. Cash                           1,164.00
     Cr. AR - Barrie Boat Club                 1,164.00
         Final payment on #3402
```

**Sep 25** — Follow up call to Green Valley Farms. They say "cheque is in the mail, should arrive this week."

**Sep 30** — Empire Construction's cheque arrives: $4,350.50. Deposit same day.

```
Dr. Cash                           4,350.50
     Cr. AR - Empire Construction              4,350.50
```

But **Green Valley's cheque never arrived.**

### September End — AR Aging

```
Customer                  Current    1-30 Overdue    Total
────────────────────────────────────────────────────────────
Collingwood Trucking       2,486.00                   2,486.00
Green Valley Farms                     5,085.00       5,085.00
────────────────────────────────────────────────────────────
TOTAL                      2,486.00     5,085.00      7,571.00
```

Green Valley Farms is now officially overdue. Time for escalated action.

### October Activity

**Oct 2** — Issue Invoice #3407 to Heritage Insurance: $900 + $117 HST = $1,017. Terms: Net 30.

**Oct 5** — Phone call to Green Valley Farms. They apologize, claim cash flow issues. Promise payment by October 20.

**Oct 8** — Collingwood Trucking's cheque bounces (NSF). Bank returns it with a $45 NSF fee.

Let's handle this:

**Reverse the original receipt:**

Wait — I said "Collingwood Trucking's cheque bounces" but looking at my timeline, they haven't sent a cheque yet. Their invoice #3406 was issued Sep 10, net 30, due October 10. Let me adjust the scenario.

*Let me say instead:* **Oct 7** — Collingwood Trucking pays Invoice #3406 by cheque: $2,486.

```
Dr. Cash                           2,486.00
     Cr. AR - Collingwood Trucking             2,486.00
```

**Oct 11** — The cheque bounces (NSF). Bank returns it and charges $45 NSF fee.

```
Dr. AR - Collingwood Trucking      2,486.00
     Cr. Cash                                   2,486.00
         NSF reversal Invoice #3406

Dr. Bank Charges Expense              45.00
     Cr. Cash                                      45.00
         NSF fee on Collingwood Trucking cheque

Dr. AR - Collingwood Trucking         45.00
     Cr. Other Income                              45.00
         NSF fee charged to customer per terms
```

Contact Collingwood. They apologize, promise to wire payment immediately.

**Oct 13** — Collingwood wires the full $2,486 plus the $45 NSF fee = $2,531.

```
Dr. Cash                           2,531.00
     Cr. AR - Collingwood Trucking             2,531.00
         Wire payment including NSF fee recovery
```

Collingwood's account is now clear. Flag them for cash-on-delivery terms going forward.

**Oct 20** — Green Valley's promised payment doesn't arrive. Follow-up email.

**Oct 25** — Another call to Green Valley. Owner admits significant financial difficulty. Offers to pay $1,500 now and the rest over three months.

David (owner of Simcoe) decides:
- Accept the $1,500 partial payment
- Put Green Valley on "hold" — no new work until balance is current
- Start preparing to write off the remainder if the installment plan fails

**Oct 27** — Green Valley pays $1,500.

```
Dr. Cash                           1,500.00
     Cr. AR - Green Valley Farms               1,500.00
         Partial payment on #3404 — $3,585 remaining
```

**Oct 29** — Issue Invoice #3408 to Innisfil Taxis: $1,380 + $179.40 HST = $1,559.40. Terms: Net 30.

### October End — AR Aging

```
Customer                  Current    1-30    31-60    61-90     Total
──────────────────────────────────────────────────────────────────────
Heritage Insurance        1,017.00                               1,017.00
Innisfil Taxis            1,559.40                               1,559.40
Green Valley Farms                            3,585.00           3,585.00
──────────────────────────────────────────────────────────────────────
TOTAL                     2,576.40            3,585.00           6,161.40
```

### The Decision Point — Green Valley Farms

At 40+ days overdue, Green Valley is approaching critical. David has two choices:

**Option A — Accept the payment plan.**
Green Valley has committed to three more monthly payments of approximately $1,195 each. If they honour it, the debt is recovered over Q1 2026.

**Option B — Escalate collection.**
Stop accepting the payment plan and pursue collection. Potentially file a small claims court claim for the $3,585. Time-consuming and damages the relationship.

David chooses Option A, but sets a hard rule: if the next payment (due November 15) doesn't arrive, he'll immediately escalate.

### The Year-End Path

In real scenarios, the outcome varies:

- **Best case:** Green Valley honours the payment plan, Simcoe recovers the full $5,085 over 4 months
- **Medium case:** Green Valley makes one more payment ($1,200 total recovery), then stops paying. Simcoe writes off the remaining $3,385 as bad debt at year-end.
- **Worst case:** Green Valley disappears or declares bankruptcy. Simcoe writes off the full $5,085.

Let's assume the medium case for year-end.

### The Bad Debt Write-Off (December 2025)

Green Valley pays $1,200 more over 6 weeks, then stops. Last contact in early December; no response since. David decides to write off on December 31.

Original invoice was $4,500 + $585 HST = $5,085.
- Received $1,500 (Oct 27) + $1,200 (November) = $2,700
- Remaining balance: $2,385

**The write-off entry:**
```
Dr. Bad Debt Expense             2,110.62      (pre-HST portion: 2,385 × 100/113)
Dr. HST Payable                    274.38      (HST portion: 2,385 × 13/113)
     Cr. AR - Green Valley Farms               2,385.00
         Write off uncollectable balance — customer unresponsive since Nov 30
```

The $2,110.62 is deductible bad debt. The $274.38 HST reduction flows to the HST return, effectively recovering that portion of HST previously remitted.

Document the write-off:
- Date of last contact
- Collection efforts made (copies of emails, call notes)
- Reason for write-off

### The Lessons from This Scenario

1. **Early warning signs matter.** Green Valley missed their first payment date (Sep 21). By Oct 5 they'd already been slow. A more aggressive bookkeeper might have flagged this to David earlier.

2. **NSF cheques require immediate action.** Collingwood's NSF was handled well — full recovery plus fee. But the pattern of acceptance of personal cheques from B2B customers should be reviewed.

3. **Payment plans should have consequences.** David's hard rule (escalate if November 15 payment misses) was the right discipline.

4. **Bad debt write-offs are part of business.** Not every AR becomes cash. Businesses budget for some write-off losses. The key is identifying them early and documenting them properly.

5. **HST recovery on bad debts is real money.** Don't forget to claim it.

---

## 8.13 QuickBooks Online — The AR Workflow

QBO's AR workflow is well-designed if you use it correctly. Here's the path.

### Setting Up Customers

**Sales → Customers → New Customer**

Enter:
- Customer name (legal name)
- Display name (for invoices)
- Email (for auto-send)
- Billing address
- Shipping address (if different)
- Payment terms (net 30 default)
- Tax rate (13% HST Ontario)
- Opening balance (if migrating)

### Creating Invoices

**+ New → Invoice**

Select customer, invoice date, due date, products/services, amounts. Review HST calculation. Save.

QBO automatically:
- Creates the journal entry (Dr. AR, Cr. Revenue, Cr. HST Payable)
- Updates the customer's subledger
- Sends the invoice by email (if enabled)

### Receiving Payments

**+ New → Receive Payment**

Critical step: after selecting the customer, QBO shows all their outstanding invoices. **Select the specific invoice(s) to apply the payment to.** Don't just enter an amount and save — explicitly specify which invoices are being paid.

### The Aging Report

**Reports → Sales → A/R Aging Summary**

Produces the standard aging report with bucket columns. Customize columns and date as needed. Export to Excel if you want to add notes for collection follow-up.

### The Audit Trail

**Audit Log** (Settings → Audit Log) shows every AR action: invoice creation, payment application, credits, write-offs. Review the audit log monthly to detect unauthorized changes.

### Common QBO AR Pitfalls

**Pitfall 1: Receiving payments without selecting invoices.**
If you save a "receive payment" with an amount but no invoice selected, QBO creates an unapplied credit on the customer's account. This breaks the aging report and makes reconciliation impossible.

**Pitfall 2: Duplicate customer entries.**
Sometimes "ABC Company" and "ABC Co." get set up as two customers. Invoices to one, payments to the other — the reconciliation fails. Clean up the customer list periodically.

**Pitfall 3: Writing off without credit memos.**
When writing off bad debts, use a credit memo (not a journal entry). Credit memos update the customer's subledger; journal entries often don't.

**Pitfall 4: Unapplied credits.**
Credit memos without being applied to specific invoices. The credit exists on the customer's account but no invoice is closed. Both sides stay open indefinitely.

We cover QBO comprehensively in Week 13.

---

## 8.14 Quiz — 15 Questions

**Question 1**
A business issues an invoice for $2,000 + HST on Net 30 terms. Today is October 5. When is the invoice due?

??? answer
    **November 4** (30 days after October 5). QBO automatically calculates this based on terms, but always verify.

---

**Question 2**
A customer pays $850 toward an invoice of $1,356. What happens to the invoice balance, and what's the journal entry?

??? answer
    Invoice stays open with a **$506 balance** remaining.

    ```
    Dr. Cash                          850.00
         Cr. Accounts Receivable                850.00
         Partial payment on Invoice #X
    ```

    In QBO, apply the $850 partial payment to the specific invoice. The system retains the invoice as open with $506 outstanding.

---

**Question 3**
A customer's cheque bounces NSF. The original invoice was $2,260 (including HST of $260). Write the entry to reverse the receipt.

??? answer
    ```
    Dr. Accounts Receivable       2,260.00
         Cr. Cash                             2,260.00
         NSF reversal of cheque received
    ```

    HST is NOT reversed — the original sale still occurred. The AR is back on the books. If the bank charged an NSF fee, that's a separate entry to Bank Charges Expense.

---

**Question 4**
A customer returns a $400 product (plus $52 HST) because it was defective. Write the journal entry.

??? answer
    ```
    Dr. Sales Returns (or Sales Revenue)   400.00
    Dr. HST Payable                         52.00
         Cr. Accounts Receivable                    452.00
         Credit memo issued for returned product
    ```

    The HST is reversed because the supply effectively didn't happen (the product was returned). On the next HST return, this reduces HST Payable.

    In QBO, use a Credit Memo — not a journal entry. This updates the customer's subledger and produces the formal credit document for the customer.

---

**Question 5**
You're running an AR aging report. You notice a customer has a $1,200 balance that's been in the 91-120 day bucket for three consecutive months. What does this suggest?

??? answer
    The customer is likely in serious default. Possibilities:
    - Customer is in financial trouble and unable to pay
    - Customer is intentionally not paying (dispute, dissatisfaction)
    - The debt may have been forgotten by management

    **Action items:**
    1. Review the customer's communication history
    2. Consult with the owner on the status
    3. Determine if a payment plan is being honored
    4. Consider whether the account should be written off as bad debt

    An account aging this long without collection is almost certainly uncollectable. Write-off may be appropriate.

---

**Question 6**
A customer offers 2/10 Net 30. You receive an invoice for $5,000 + HST. You have cash available. Should you take the discount? Why?

??? answer
    **Yes, take the discount.** Even if you must borrow money to pay 20 days early, the effective cost is:

    - 2% discount for 20 extra days
    - Annualized: 2% × (365 / 20) = **36.5% annual interest equivalent**

    Unless you're paying above 36.5% on any alternative financing, taking the discount is the financially optimal choice.

    From a cash management perspective: paying 20 days early to save $100 (2% of $5,000) on a single invoice is one of the highest-return decisions a business can make.

---

**Question 7**
When writing off a bad debt, why is it important to reduce HST Payable?

??? answer
    When the original sale was made, the business:
    1. Recorded revenue
    2. Recorded HST Payable (owed to CRA)
    3. Remitted that HST on the next HST return

    Now the debt is uncollectable — but CRA already got the HST. To recover it, you:
    - Reduce HST Payable by the amount originally charged on the bad debt
    - On the next HST return, this reduces net tax owed (or increases refund)

    Without this adjustment, the business permanently bears the HST cost on a sale that didn't yield any cash — a significant loss.

---

**Question 8**
A new employee in your office is handling AR entry, receiving cheques, and making bank deposits. What's the internal control concern?

??? answer
    **Lack of segregation of duties** — a classic fraud risk. One person handling all three of these functions can commit "lapping" fraud (stealing one customer's payment and covering it with another's).

    **Recommended separation:**
    - One person receives/opens cheques from customers
    - A different person enters payment receipts in the accounting system
    - A third person (or the owner) makes the bank deposits
    - A fourth person (or the owner) reviews the bank reconciliation

    In a small business, perfect separation is impossible — but having the owner review AR aging, deposits, and bank reconciliation monthly is a critical compensating control.

---

**Question 9**
A customer sends a $4,800 payment with a note saying "applied as follows: Invoice #1245 ($1,200), Invoice #1251 ($2,400), Invoice #1258 ($1,200)." How do you record this?

??? answer
    In QBO:
    1. Go to + New → Receive Payment
    2. Select the customer
    3. Enter $4,800 as payment amount
    4. QBO displays outstanding invoices
    5. Select invoices #1245, #1251, #1258 and enter the specific amounts for each
    6. Save

    Journal entry (automatic):
    ```
    Dr. Cash                       4,800.00
         Cr. AR - Customer X                 4,800.00
         Applied to: #1245 ($1,200), #1251 ($2,400), #1258 ($1,200)
    ```

    Critical: Do NOT just save the payment without specifying the invoices. That would create an unapplied credit and leave all three invoices open.

---

**Question 10**
A customer disputes a $100 portion of a $2,260 invoice. They pay $2,160. How do you record this?

??? answer
    If the owner agrees the $100 should be credited:

    ```
    Dr. Cash                         2,160.00
    Dr. Bad Debt Expense or Sales Returns  88.50    (pre-HST portion)
    Dr. HST Payable                   11.50    (HST portion)
         Cr. Accounts Receivable               2,260.00
         Closed Invoice #X — $100 disputed, credited
    ```

    Using a Credit Memo in QBO is cleaner than a journal entry because it provides a proper document trail for the customer.

    If the owner disagrees with the dispute, keep the $100 on the books as an open balance and pursue collection.

---

**Question 11**
What's the Ontario Small Claims Court monetary limit?

??? answer
    **$35,000.** Claims above $35,000 must go to Superior Court. Below $35,000, Small Claims Court is the fastest and cheapest legal path for an unpaid debt.

    Filing fees are approximately $102 - $358 depending on the claim amount.

---

**Question 12**
A customer has three overdue invoices: #1220 (45 days, $1,500), #1235 (25 days, $800), and #1241 (10 days, $2,200). They send a $2,000 payment with no specific instruction. How should you apply it?

??? answer
    **Best practice: Apply to the oldest invoices first.**

    - #1220 ($1,500) — fully paid
    - Remaining $500 applied to #1235 — partial payment
    - #1235 still has $300 remaining
    - #1241 unchanged at $2,200

    This practice (called "FIFO application" — first in, first out) has several benefits:
    - Reduces the aging of the oldest accounts
    - Provides clearer collection escalation paths
    - Is the default in most AP systems and customer-to-customer norms

    However, **confirm with the customer** if there's any ambiguity. Some customers explicitly want payments applied to specific invoices (maybe they're disputing one).

---

**Question 13**
You're reviewing an aging report. The "Current" column shows $45,000. The "1-30 days overdue" is $8,000. "31-60" is $5,000. "61+" is $15,000. What's the red flag?

??? answer
    The **$15,000 in 61+ days overdue** is the biggest red flag.

    Key observations:
    - 20% of AR is significantly overdue — a warning sign for cash flow
    - The distribution is concerning: a single long-overdue amount can signal a problematic customer
    - Whether this represents one customer or many matters

    **Immediate actions:**
    1. Identify which customers make up the $15,000 in 61+
    2. Prioritize collection on these accounts
    3. Consider whether any write-offs are appropriate
    4. Review whether credit policies need tightening for new customers

    A healthy aging typically has >70% in the "Current" bucket. Here, 67% is current — marginal but not disastrous. The 61+ bucket is the concern.

---

**Question 14**
A customer's cheque bounces twice in 6 months. What should you do?

??? answer
    **Flag the customer for special handling.** Options:

    1. **Switch to prepaid terms:** All future orders paid upfront before work begins
    2. **Switch to certified payment only:** Bank draft or wire transfer, no personal cheques
    3. **Refuse further credit:** End the credit relationship entirely
    4. **Discuss with owner:** The owner should know and decide on the relationship going forward

    The pattern of multiple NSFs is a strong predictor of future default. Acting early protects the business. Continuing to extend credit risks escalating losses.

---

**Question 15**
A customer contacts you claiming they paid an invoice two weeks ago but your records show it still outstanding. How do you respond?

??? answer
    Professionally investigate — don't dismiss, don't admit error yet.

    **Steps:**
    1. Ask the customer for payment details: date, amount, method (cheque number, EFT reference)
    2. Search your bank deposits for that amount around the claimed date
    3. Search for the payment in QBO (Reports → Sales → Deposit Detail)
    4. If found but unapplied: apply it properly to the invoice
    5. If found but applied elsewhere: investigate the error
    6. If not found anywhere: request the customer's proof of payment (cancelled cheque image, EFT confirmation)

    If the customer can produce proof of payment that's in your account but unapplied, the error is on your side — apologize, correct, close the invoice. If the customer can't produce proof, politely maintain the invoice is outstanding until they can.

    Most disputes are honest mistakes on one side or the other. Handling them calmly and factually preserves the relationship.

---

## 8.15 Week 8 Readiness Checklist

Before moving to Week 9, confirm you can do all of the following without prompts:

- ☐ Explain the 5 stages of the AR cycle
- ☐ Describe what payment terms mean (Net 30, 2/10 Net 30, EOM)
- ☐ Record an invoice, receipt, partial payment, and overpayment correctly
- ☐ Produce and interpret an AR aging report
- ☐ Recognize red flags in an aging report (over-90 balances, concentration risk)
- ☐ Handle an NSF cheque (reverse the receipt, record the fee, pass fee to customer)
- ☐ Write off a bad debt with HST recovery
- ☐ Record an early payment discount
- ☐ Know the difference between a credit memo and a journal entry (for write-offs in QBO)
- ☐ Apply payments to specific invoices (not just account balances)
- ☐ Identify the internal control risks in AR and know the segregation of duties principle
- ☐ Know Ontario's Small Claims Court limit ($35,000)
- ☐ Calculate the annualized value of a 2/10 Net 30 discount (36.5%)
- ☐ Explain the collection escalation from friendly reminder to legal action
- ☐ Navigate QBO's customer, invoice, receive payment, and aging report functions

---

## 📚 Further Reading

- [Ontario Small Claims Court](https://www.ontario.ca/page/suing-someone-small-claims-court)
- [QuickBooks Online: Create and send invoices](https://quickbooks.intuit.com/learn-support/en-ca/help-article/sales-invoices/create-invoices-quickbooks-online/L6jUXvYyA_CA_en_CA)
- [CRA: Bad debts on HST return](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/complete-file-return/bad-debt-adjustments.html)

---

!!! tip "Up Next: Week 9 — Accounts Payable"
    **The mirror image of AR.** If AR is about getting paid, AP is about paying — but paying smartly. We'll cover three-way matching, early payment decisions, accrued liabilities, and the internal controls that prevent duplicate payments and fraud. Kawartha Kitchen Equipment provides the realistic example: 8 vendors, a quantity discrepancy, an early payment opportunity, and a month-end accrual scenario.
