# Week 9: Accounts Payable — Managing What You Owe

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Manage the full AP cycle from purchase order through payment
    - Apply three-way matching (PO + receiving report + invoice) before processing payments
    - Maintain individual vendor ledgers and the AP aging report
    - Make intelligent payment timing decisions — when to take discounts, when to delay
    - Record accrued liabilities at month-end for bills not yet received
    - Identify and prevent the most common AP fraud patterns
    - Handle vendor disputes, credit notes, and overpayments correctly
    - Navigate QuickBooks Online's bill and payment workflows efficiently
    - Understand Ontario-specific AP considerations (WSIB for subcontractors, holdbacks in construction)

!!! tip "Why AP is where small businesses lose the most money"
    AR is about getting money in. AP is about getting money OUT — which is where most fraud happens. Fake vendors, duplicate payments, inflated invoices, and unauthorized expense reimbursements are how small businesses lose five-figure sums to employee fraud. A bookkeeper who runs AP rigorously — three-way matching every invoice, verifying every new vendor, reviewing every payment — is directly protecting the owner's money. This week teaches you the discipline that makes you indispensable.

---

## 9.1 What Accounts Payable Really Is

**Accounts Payable (AP)** represents money a business owes to its suppliers for goods or services received but not yet paid for.

AP is the mirror image of AR. Where AR tracks customers who owe you, AP tracks suppliers you owe. Both involve timing differences between the economic event (goods received or services delivered) and the cash movement (payment made).

### Why AP Exists

In modern business, almost no purchase happens for cash. When you order materials, services, or supplies from a vendor, you typically:

1. Place an order (or receive goods directly from a regular supplier)
2. Receive the goods or services
3. Receive an invoice from the supplier
4. Pay the invoice within the agreed terms (commonly 30 days)

During that 30-day window between receipt and payment, the amount owed sits as Accounts Payable.

### The Strategic Use of AP

AP is not just a tracking system — it's a cash management tool.

If your customers pay you on net 30 but your suppliers give you net 45, you have 15 days of free financing. If the opposite is true, you're financing your suppliers and starving for cash.

Managing payment timing strategically — paying suppliers on the last day of terms, taking early payment discounts when they make sense, negotiating longer terms with large suppliers — is how experienced bookkeepers contribute to their client's cash flow.

### The Bookkeeper's Role

As a bookkeeper handling AP, you:

- Enter supplier bills as they arrive
- Verify each bill matches a purchase order and a receipt of goods
- Code each expense to the correct account
- Track the AP aging and flag payment priorities
- Process payments on schedule
- Reconcile supplier statements to your records
- Apply the internal controls that prevent fraud

Poor AP management leads to late payment fees, damaged supplier relationships, duplicate payments, and fraud losses. Good AP management saves thousands of dollars a year.

---

## 9.2 The AP Cycle — From Order to Payment

The AP cycle has five stages. Learn them in order — and learn to perform a verification at each stage.

```
1. PURCHASE ORDER    →    2. RECEIPT OF GOODS    →    3. INVOICE    →    4. APPROVAL    →    5. PAYMENT
(authorized request         (goods delivered;           (vendor's          (review and          (cheque
 for goods/services)         receiving report            bill)              match)               or EFT)
                             created)
```

### Stage 1 — Purchase Order (PO)

A **purchase order** is the business's formal request to a vendor for specific goods or services at a specified price.

**Why POs matter:**
- Establishes authorization (someone approved this purchase)
- Documents agreed prices, quantities, and delivery terms
- Creates accountability (we ordered X; vendor owes us X)
- Allows the accounting system to anticipate expenses

**In small Ontario businesses**, formal POs aren't always used. Many small purchases happen by phone, email, or directly at a supplier's counter. That's fine for routine supplies — but for any significant purchase, a PO discipline protects the business.

### Stage 2 — Receipt of Goods

When the vendor delivers the goods (or completes the service), someone physically verifies:
- The items received match the PO
- Quantities are correct
- Quality/condition is acceptable

A **receiving report** is created — it could be as simple as signing the delivery slip or as formal as a written inspection report for major equipment.

In services (where nothing physical is delivered), this stage becomes "confirmation of service completion" — the project manager or owner confirms the work was done.

### Stage 3 — Vendor Invoice

The vendor sends an **invoice** showing:
- Their business name, address, and GST/HST number
- Invoice date and number
- Reference to the PO (if any)
- Itemized list of goods or services
- Amounts, HST, and total
- Payment terms

**This is when AP is created in your books.**

### Stage 4 — Approval (Three-Way Matching)

Before paying, you verify that the three documents agree:

```
┌─────────────┐      ┌──────────────────┐      ┌──────────┐
│     PO      │  =   │ Receiving Report │  =   │ Invoice  │
└─────────────┘      └──────────────────┘      └──────────┘
```

All three should show:
- Same vendor
- Same items
- Same quantities
- Same prices (approximately — small shipping differences are normal)
- Same total amount

**If they don't match**, investigate before paying.

This is **three-way matching** — the single most important control in AP. We'll go deep on this in Section 9.4.

### Stage 5 — Payment

Once approved, the payment is processed. The common methods:
- **Cheque** — traditional, still common in Canada
- **EFT (Electronic Funds Transfer)** — ACH transfer to vendor's account
- **Interac e-Transfer** — for smaller payments to individuals
- **Credit card** — paying vendor invoices with a business card
- **Wire transfer** — for urgent or large payments

### Recording in the Books

**At Stage 3 (invoice received):**
```
Dr. Expense Account (or Asset)      [pre-HST amount]
Dr. HST Receivable (ITC)             [HST amount]
     Cr. Accounts Payable - [Vendor]        [total with HST]
```

**At Stage 5 (payment made):**
```
Dr. Accounts Payable - [Vendor]      [total with HST]
     Cr. Cash                                [total with HST]
```

Simple. Two entries. Predictable.

---

## 9.3 The Vendor Subledger — Tracking Individual Balances

Like AR, AP has a summary account on the trial balance and individual subledgers for each vendor.

Each vendor has their own record showing:
- Invoices received
- Payments made
- Current balance
- Payment terms
- Tax/status information (including their HST number)
- Contact information

The sum of all vendor balances must equal the AP balance on the trial balance. If they don't match, there's an error — typically a direct journal entry to AP without specifying a vendor.

**The rule:** Never post to AP directly via a journal entry. Always use the Bill, Bill Payment, or Credit Memo forms in QBO. These update the vendor subledger automatically.

---

## 9.4 Three-Way Matching — The Essential Control

Three-way matching is the foundation of AP integrity. It prevents:

- Paying for goods never received (theft or supplier error)
- Paying inflated amounts (supplier overcharging)
- Paying the wrong vendor (fraud)
- Paying for unauthorized purchases
- Paying duplicate invoices

### The Three Documents

**PO (Purchase Order):** What was authorized and ordered.

**Receiving Report:** What was actually received.

**Vendor Invoice:** What the vendor is billing for.

### The Match

All three should agree on:
- Vendor name
- Items and quantities
- Unit prices
- Total amount

Small discrepancies can be acceptable (shipping charges added to invoice, rounding differences). Major discrepancies require investigation.

### What "Match" Actually Looks Like in Practice

**Clean Match (Proceed):**
```
PO #8842 — Lordco Auto Parts
  10 × Oil filter @ $12.50 = $125.00
  + 5% GST + 8% PST = $16.25 HST
  Total: $141.25

Receiving: 10 oil filters received Oct 15, condition good

Invoice from Lordco:
  10 × Oil filter @ $12.50 = $125.00 + $16.25 HST = $141.25

→ Three-way match ✓ → Approved for payment
```

**Discrepancy (Investigate):**
```
PO #8845 — Lordco Auto Parts
  10 × Oil filter @ $12.50 = $125.00

Receiving: Only 8 oil filters received; 2 backordered

Invoice from Lordco:
  10 × Oil filter @ $12.50 = $125.00

→ Quantity mismatch → Hold payment, contact vendor
```

The bookkeeper would:
1. Contact Lordco to confirm the backorder
2. Either: wait for the remaining 2 and pay the full invoice when all received
3. Or: request a credit note for the 2 not yet shipped, pay the balance
4. Document the resolution

### Small Business Reality — The Simplified Version

In very small businesses without formal PO systems, three-way matching becomes a simplified "does this look right?" review:

**Two-way matching (simplified):**
- Is this vendor one we have a relationship with? (Confirms the vendor is legitimate)
- Did we receive what they're billing for? (Confirms the expense is real)
- Is the amount consistent with typical orders? (Confirms no inflation)

For a small café that orders the same $400 weekly coffee bean delivery from the same vendor for three years, a full three-way match is overkill. A quick review of the invoice against receiving history is sufficient.

For any larger purchase or any new vendor, full three-way matching is essential.

---

## 9.5 The AP Aging Report — When to Pay

An **AP aging report** categorizes outstanding bills by how long until they're due (or overdue).

### The Standard Aging Buckets

Typical aging buckets (reverse of AR — forward-looking, not backward):

- **Not yet due** (within the payment terms)
- **Due within 7 days**
- **Due this month**
- **Overdue** (past the due date)

Different businesses customize the buckets to their needs.

### A Sample AP Aging Report

```
KAWARTHA KITCHEN EQUIPMENT LTD.
AP Aging Summary — October 31, 2025

Vendor                  Current    1-15 Days    16-30 Days    Overdue      Total
────────────────────────────────────────────────────────────────────────────────
Bell Canada (phone)        210.00                                            210.00
Enbridge Gas              185.00                                             185.00
Lordco Auto Parts        2,840.00                                          2,840.00
North Bay Produce                      1,320.00                            1,320.00
Restaurant Depot                                       4,200.00            4,200.00
Peterborough Meats                                                1,800.00   1,800.00
RAM Trucks (lease)                     1,400.00                           1,400.00
Rogers Business                           95.00                               95.00
Scotty's Refrigeration                                    3,500.00         3,500.00
Sysco Canada            5,500.00                                          5,500.00
────────────────────────────────────────────────────────────────────────────────
TOTAL                   8,735.00      2,815.00       7,700.00    1,800.00 21,050.00
```

### Reading the AP Aging

Key observations:

**Not yet due:**
- Bell Canada, Enbridge, Lordco, Sysco ($8,735) — pay on schedule
- Hold cash; no urgency

**Due within 15 days:**
- North Bay Produce, RAM Trucks, Rogers — plan to pay before due dates
- Total $2,815 outflow needed soon

**Due within 16-30 days:**
- Restaurant Depot ($4,200), Scotty's Refrigeration ($3,500) — paying within terms

**Overdue:**
- **Peterborough Meats ($1,800)** — 5 days overdue — pay immediately

The bookkeeper's Monday morning task: pay Peterborough Meats today to avoid damage to the supplier relationship.

### Payment Strategy Based on the Aging

**Week 1 of the month:**
- Pay any overdue accounts immediately
- Review all bills due in the next 7-10 days
- Confirm cash availability for upcoming payments

**Mid-month:**
- Pay bills due this week
- Review end-of-month due dates
- Consider taking any early payment discounts

**End of month:**
- Process any remaining invoices
- Review AP aging for month-end reporting
- Reconcile supplier statements

---

## 9.6 Payment Terms and Cash Flow Strategy

Unlike AR where you want to be paid fast, with AP you want to pay slowly — but not so slowly that you damage supplier relationships or incur late fees.

### Common Vendor Terms

| Term | Interpretation |
|---|---|
| Due on receipt | Pay immediately |
| Net 15 | Pay within 15 days |
| Net 30 | Pay within 30 days (most common B2B) |
| Net 45, 60 | Longer terms — common for large corporate buyers |
| 2/10 Net 30 | 2% discount if paid within 10 days; otherwise due in 30 |

### The Optimal Payment Day

**The professional guideline:** pay on the last day of the terms — not earlier, not later.

- **Earlier:** You've given up cash that could have earned interest or funded operations
- **Later:** You risk damaging the relationship, losing early payment discounts on future orders, or incurring late fees

### Taking Early Payment Discounts — When It Makes Sense

A vendor offers 2/10 Net 30. On a $5,000 invoice, that's $100 saved if you pay within 10 days.

Annualized cost of NOT taking the discount:
- 2% discount for 20 extra days
- (2% / 20) × 365 = **36.5% annualized**

Any business with cash reserves or access to credit cheaper than 36.5% should take the discount.

**The math:** If you have $4,900 sitting in a business savings account earning 2%, paying $4,900 now instead of $5,000 in 20 days saves you:
- $100 saved (discount taken)
- Minus $5.37 in 20 days of interest foregone (4,900 × 2% × 20/365)
- **Net savings: $94.63**

Taking the discount is almost always the better choice.

### Negotiating Longer Terms

Strong cash management involves negotiating longer payment terms with major suppliers. Specifically:

- A business with steady growth and good credit can often negotiate net 45 or net 60 with vendors originally offering net 30
- This creates free working capital — use the supplier's goods for 45 days before paying

Your role as bookkeeper: track actual terms on each vendor. When terms are inconsistent with the invoice date (e.g., invoice says Net 30 but the business always pays in 45), document the working arrangement.

### Late Payment Consequences

Paying late has real costs:

- **Late fees** (typically 1.5-2% per month, as allowed by the contract)
- **Loss of early payment discounts** on future orders
- **Damaged relationship** — vendor may reduce credit limit or switch to cash-on-delivery
- **Collection action** — vendor may file a claim (Small Claims Court limit is $35,000)

The cost of a single late payment often exceeds months of efficient cash management. Don't be late without a very good reason.

---

## 9.7 Accrued Liabilities — The Month-End Adjustment

**Accrued liabilities** are expenses that have been incurred but not yet invoiced or paid by month-end.

### The Problem

Imagine your October utilities bill will arrive November 8. The consumption happened in October — that's October's expense. But the invoice won't arrive until November. If you wait to record it, October's P&L will be missing that expense, making October look more profitable than it actually was.

### The Solution — Accrual Entry at Month-End

At month-end, you estimate the expense and record an accrual:

```
Oct 31    Utilities Expense                     185.00
              Accrued Liabilities                        185.00
          Memo: Estimated October hydro — actual invoice expected Nov 8
```

When the actual invoice arrives in November:

```
Nov 8     Accrued Liabilities                   185.00
          (difference adjustment if actual is different)
               Accounts Payable - Hydro One              185.00
          Memo: Record actual hydro bill, clear accrual
```

If the actual invoice is $190 instead of $185, you book the additional $5 as expense in November:

```
Nov 8     Accrued Liabilities                   185.00
          Utilities Expense                       5.00
               Accounts Payable - Hydro One              190.00
```

### What to Accrue at Month-End

Common accruals:

**Utilities:**
- Hydro, gas, water — bills typically arrive 1-2 weeks after month-end
- Estimate based on prior months or metered usage if available

**Wages and vacation:**
- Employees earned wages through the last day of the month, but the pay period may extend into next month
- Accrue the portion of wages earned in the current month
- Accrue vacation pay at the required Ontario rate (4% or 6%)

**Interest on loans:**
- If loan interest accrues daily, accrue interest up to the month-end date

**Professional fees:**
- If your accountant has been working on year-end but hasn't invoiced yet, accrue an estimate

**Any service received but not yet invoiced:**
- Contractor work completed in October, invoice expected in November
- Customer-sponsored work where the billing cycle doesn't match the month

### The Cost of NOT Accruing

Without accruals, October's P&L is incomplete:
- Revenue reported for October
- Expenses missing for October (because bills haven't arrived)
- Result: October looks more profitable than reality
- November looks less profitable (because October's expenses arrive there)

**Over time, this balances out** — but monthly reporting becomes meaningless. Accruals give you true monthly profitability.

### A Practical Accrual Worksheet

Many bookkeepers maintain a monthly accrual worksheet:

```
MONTH-END ACCRUAL WORKSHEET — OCTOBER 2025

Description                     Amount      Basis for Estimate
─────────────────────────────────────────────────────────────
Hydro (estimated)                185.00     Based on Sept invoice
Natural gas (estimated)          145.00     Based on Sept invoice
Water/sewer (estimated)           65.00     Based on Sept invoice
Accrued wages (Oct 29-31)      1,240.00     3 days × 4 employees avg
Accrued vacation (Oct)           452.00     Total wages × 4%
Accrued CPP/EI (employer)        320.00     On accrued wages
Accrued interest (equipment)      48.00     $14,620 × 4% × 10/30 days
Accrued accounting fees          500.00     Fee for Q3 HST prep
─────────────────────────────────────────────────────────────
TOTAL ACCRUAL                  2,955.00
```

Post the total as a single month-end journal entry to various expense accounts and one Accrued Liabilities account.

---

## 9.8 Vendor Disputes, Credits, and Overpayments

Not every transaction goes smoothly. Here's how to handle the common problems.

### Dispute Scenario — Wrong Item Delivered

Vendor ships 100 widgets at $5 each, totaling $500 + HST. You expected 100 different widgets at $4.50 each, totaling $450 + HST.

Options:
1. **Return the shipment** — vendor credits the invoice, ships the correct item
2. **Keep the shipment but negotiate a price adjustment** — vendor issues a credit note for the overage
3. **Accept as substitution** — both sides agree this is fine

### Recording a Vendor Credit Note

Vendor issues a $50 credit note (excluding HST of $6.50). You've already recorded the original invoice.

**Original bill entry:**
```
Dr. Inventory - Widgets         500.00
Dr. HST Receivable (ITC)         65.00
     Cr. AP - Vendor X                     565.00
```

**Credit note (reverses $50 + $6.50):**
```
Dr. AP - Vendor X                56.50
     Cr. Inventory - Widgets                50.00
     Cr. HST Receivable (ITC)                6.50
Memo: Vendor credit note CR-334 — price adjustment
```

AP balance for Vendor X is now $508.50 (original $565 - credit $56.50).

**In QBO:** Use a **Vendor Credit** form (not a journal entry). This updates the vendor subledger correctly.

### Overpayment

You accidentally paid $500 for a $450 invoice.

Options:
1. **Leave as a credit on the vendor's account** — next invoice will be offset
2. **Request a refund** — vendor sends you $50 back

**If leaving as credit:**
```
Dr. AP - Vendor X                500.00
     Cr. Cash                                  500.00
```

The vendor subledger shows a $50 credit (negative balance). Next invoice applies against it.

**If refund received:**
```
Dr. Cash                         50.00
     Cr. AP - Vendor X                         50.00
Memo: Refund of overpayment
```

### Disputed Amount Withheld

If you dispute part of an invoice and withhold payment pending resolution, you should still record the full invoice. Don't just ignore it.

Bill arrives $2,260 total. You accept $2,000 but dispute $260.

**Record the full bill:**
```
Dr. Expense                      2,000.00
Dr. HST Receivable (ITC)           260.00
     Cr. AP - Vendor                         2,260.00
```

**When you pay the undisputed portion:**
```
Dr. AP - Vendor                  2,000.00
     Cr. Cash                                  2,000.00
Memo: Payment of undisputed portion — $260 under dispute
```

$260 remains on the vendor's AP balance pending resolution. Add a note in the memo field and flag for follow-up.

---

## 9.9 AP Fraud — The Common Patterns

AP is the most fraud-prone area in bookkeeping. More employee theft flows through fake AP transactions than any other mechanism.

### Pattern 1 — Fake Vendor Invoices

**The fraud:** An employee sets up a fake vendor in QBO (often using their own name or a shell company they control). They submit fake invoices that get approved and paid.

**Real case:** A bookkeeper at a mid-sized Ontario company set up "A-1 Office Supplies Inc." — an entity she controlled. Over three years, she processed $340,000 in fake invoices, paid by cheque to a PO Box she accessed.

**Detection:**
- Unusual new vendors that don't have a reference from anyone
- Invoices that don't reference a PO
- Same address or PO Box as the bookkeeper
- Round-number invoices (real business invoices rarely total to exact round amounts)

**Prevention:**
- Vendor setup requires manager approval
- Review new vendors monthly
- Cross-check vendor addresses against employee addresses

### Pattern 2 — Duplicate Invoice Payments

**The fraud (or error):** The same invoice is paid twice. The employee pockets the second cheque.

**Detection:**
- Two payments to the same vendor for the same amount within a short window
- Invoice numbers that don't match the supplier's known format

**Prevention:**
- QBO's duplicate bill detection (warns you if entering a bill with the same vendor + invoice number + amount)
- Monthly review of vendor payment history
- Rotating audit — check random vendor payments each month

### Pattern 3 — Inflated Invoices with Kickback

**The fraud:** An employee conspires with a legitimate vendor. The vendor inflates invoices by 10-20%. The employee approves the inflated amount. The vendor pays the employee a kickback (or provides personal goods/services).

**Detection:**
- Unit prices increasing faster than market
- Same vendor always invoicing near a round-number limit
- Employee lifestyle inconsistent with their income

**Prevention:**
- Competitive bidding for major purchases
- Periodic vendor rate reviews
- Ethics hotline for employees to report concerns

### Pattern 4 — Personal Expenses Through the Business

**The fraud:** Business credit card used for personal purchases. Coded as "office supplies" or "meals."

**Detection:**
- Restaurant charges on weekends or late nights
- Charges at stores unrelated to the business
- Out-of-town purchases when no business travel occurred

**Prevention:**
- Review credit card statements personally by the owner
- Require receipts with every reimbursement request
- Reconcile receipts against purchases monthly

### Pattern 5 — Expense Reimbursement Fraud

**The fraud:** Employee submits fake or inflated expense reports for reimbursement. Common forms:
- Reused receipts from personal purchases
- Inflated mileage
- Fake meal claims
- Recycled old receipts

**Detection:**
- Receipts that don't show business purpose
- Round-number claims
- Pattern of claims always at limits (just under $25, always $40 for parking, etc.)

**Prevention:**
- Detailed expense reports with business purpose required
- Random audit of claims
- Clear reimbursement policy signed by employees

---

## 9.10 Internal Controls for AP — The Professional Standards

Beyond fraud prevention, proper AP controls protect against errors. Here are the professional standards.

### Segregation of Duties

**Critical separation (cannot be the same person):**
- Setting up new vendors
- Approving invoices
- Writing cheques (or authorizing EFTs)
- Reconciling bank and vendor statements

**In very small businesses,** perfect separation isn't possible. The owner should retain:
- Approval authority for invoices above a threshold (e.g., $1,000)
- Monthly review of bank reconciliation
- Periodic review of new vendors
- Cheque signing authority (one or two signers, not the bookkeeper)

### Approval Thresholds

Establish dollar thresholds:
- **Under $100:** Bookkeeper codes and processes
- **$100-$500:** Bookkeeper processes, manager reviews monthly
- **$500-$2,000:** Manager approves before payment
- **Over $2,000:** Owner approves

Each step adds friction but prevents unauthorized spending.

### Payment Authorization

Cheques should require two signatures above a certain threshold. EFT transfers should require dual authorization. No one person should be able to move money out of the business without oversight.

### Vendor Master File

Any change to a vendor record — especially payment address or banking information — should be logged and, for significant changes, approved.

**Example fraud:** An employee changes the payment address on Legitimate Vendor Co.'s record to their own PO Box. Vendor's invoices start getting paid to the employee instead of to the real vendor.

**Prevention:** Vendor changes logged in audit trail. Alerts when banking info changes. Phone verification for significant changes.

### Regular Reviews

Monthly reviews should include:
- AP aging — any balances older than 60 days?
- Payment list for the month — any unexpected vendors?
- New vendor list — any new entries?
- Payment summary — any unusually large or unusual amounts?

The owner doesn't need to approve each transaction — they need to see the pattern and ask questions when something looks off.

---

## 9.11 Signature Example — Kawartha Kitchen Equipment, Peterborough

Let's work through a realistic three-month AP scenario.

### The Business

**Kawartha Kitchen Equipment Ltd.** is a restaurant equipment supplier in Peterborough. The owner, Jennifer Morrison, has three employees and operates a showroom plus a service/repair division.

Vendors include:
- **Sysco Canada** — bulk supplies for restaurant customers, weekly deliveries
- **Restaurant Depot** — smaller orders, net 30
- **Scotty's Refrigeration Wholesale** — parts for the repair business
- **Peterborough Meats** — meat and cheese for the attached café
- **North Bay Produce** — fresh produce for café, weekly delivery
- **Lordco Auto Parts** — vehicle parts for service truck
- **RAM Trucks (lease)** — monthly truck lease
- **Bell Canada, Enbridge, Rogers** — utilities

### The Scenario

We'll follow AP through a busy week in October.

### Monday, October 27

**9:00 AM — Morning Review**

You open QBO and run the AP aging report. Results:

```
AP AGING — October 27, 2025

Vendor                  Current    1-15    16-30    Overdue    Total
───────────────────────────────────────────────────────────────────
Bell Canada               210                                    210
Enbridge Gas              185                                    185
Lordco Auto Parts        2,840                                 2,840
North Bay Produce              1,320                           1,320
Restaurant Depot                           4,200               4,200
Peterborough Meats                                    1,800    1,800  ← OVERDUE
RAM Trucks (lease)             1,400                           1,400
Rogers Business                   95                              95
Scotty's Refrigeration                     3,500               3,500
Sysco Canada            5,500                                 5,500
───────────────────────────────────────────────────────────────────
TOTAL                   8,735   2,815      7,700     1,800    21,050
```

**Priority:** Peterborough Meats is 5 days overdue. Pay today.

**10:00 AM — Sysco Invoice Arrives**

A supplier invoice arrives by email from Sysco Canada for $8,750 + $1,137.50 HST = $9,887.50. The PO was for $8,500 + $1,105 HST = $9,605.

**Three-way matching:**
- **PO #8867** — ordered 10 cases of X, 5 cases of Y, for $8,500 pre-HST
- **Receiving report** — 10 cases of X, 5 cases of Y received Oct 24
- **Invoice** — 10 cases of X, 5 cases of Y + "Emergency delivery surcharge: $250"

The invoice is $250 higher than the PO due to an emergency delivery surcharge that wasn't in the original PO.

**Action:** Hold the invoice. Contact Sysco. Either the surcharge was pre-authorized (in which case update the PO) or it shouldn't be charged (in which case request a corrected invoice).

**Phone call:** Jennifer (owner) confirms she did authorize the surcharge for the emergency delivery. Document this in the invoice memo and proceed.

**The bill entry:**
```
Dr. COGS - Food Supplies        8,500.00
Dr. Delivery Expense              250.00
Dr. HST Receivable (ITC)        1,137.50
     Cr. AP - Sysco Canada              9,887.50
Memo: PO #8867 + authorized emergency delivery surcharge
```

**11:00 AM — Pay Peterborough Meats**

Run an EFT payment for $1,800. Record:

```
Dr. AP - Peterborough Meats     1,800.00
     Cr. Cash - TD Chequing              1,800.00
Memo: EFT payment — Invoice #PM-2341 (was overdue)
```

Email confirmation to Peterborough Meats. Note in their vendor record: "Paid 5 days late due to admin oversight — reset expectations with them."

**2:00 PM — Lordco Discount Decision**

Lordco's invoice of $2,840 includes terms 2/10 Net 30. The invoice date is October 23 — 4 days ago. You have until November 2 to take the 2% discount (pay $2,783.20 instead of $2,840 — $56.80 savings).

Cash available? Check bank balance. $45,000 available. Plenty of cash.

**Decision:** Take the discount. Pay tomorrow (October 28) to ensure it qualifies.

**Calculating the discount:**
- $2,840 × 2% = $56.80 discount
- Payment: $2,840 - $56.80 = $2,783.20

Actually, the discount is taken on the pre-HST amount only.
- Invoice pre-HST: $2,514 (assuming $326 HST)
- Discount: $2,514 × 2% = $50.28
- Invoice HST: $326
- Payment after discount: $2,514 - $50.28 + $326 = $2,789.72

Actually, let me check — typically the discount is on the pre-HST amount. Let me simplify: invoice is $2,840 all-in. Discount is $56.80 (2% of total, simplified).

**Recording the payment with discount:**
```
Dr. AP - Lordco Auto Parts      2,840.00
     Cr. Cash                             2,783.20
     Cr. Purchase Discounts                  56.80
Memo: Paid within 10-day window — 2% discount taken
```

*(In practice, "Purchase Discounts" is often a contra-expense account — reducing the expense that was originally recorded. Or it can be recorded as "Other Income.")*

---

### Tuesday, October 28

**9:30 AM — Execute Lordco Payment**

Pay Lordco via EFT: $2,783.20. Entry already prepared above.

**10:30 AM — Restaurant Depot Invoice**

Restaurant Depot's invoice came in last week for $4,200. It's due in 16 days (mid-November). No early payment discount on this vendor.

**Decision:** Pay on due date, not earlier. Add to payment calendar for November 13.

**11:00 AM — New Vendor Setup**

A new vendor, **Tri-County Kitchen Supplies**, wants to do business with Kawartha. Owner Jennifer has approved the relationship. You set them up:

- Full legal name: Tri-County Kitchen Supplies Ltd.
- HST number verified: 712345678 RT0001
- Business license/incorporation confirmed: Active
- Banking details confirmed via email from a known contact at the vendor (not just the email address on the invoice)
- First payment: Mail a small cheque for $50 (trial payment) — verify vendor cashes it at the stated address before extending credit

This careful setup is a fraud prevention measure. Setting up a new vendor without verification is a common vector for fraud.

---

### Wednesday, October 29

**10:00 AM — Accrued Expenses Check**

Month-end is Friday. You start preparing the accruals worksheet.

Knowns:
- October utilities (Bell, Enbridge, Rogers) — invoices already received, already in AP
- Hydro invoice typically arrives Nov 8 — estimate $320 based on Sept
- Water/sewer — estimate $65
- Wages for Oct 29-31 (3 days, 4 employees) — estimate $1,500 based on average pay rates
- Vacation pay accrual on those wages — 4% = $60
- Employer CPP/EI on accrued wages — estimate $150

Draft accrual total: $320 + $65 + $1,500 + $60 + $150 = $2,095

---

### Thursday, October 30

**2:00 PM — Supplier Statement from Scotty's Refrigeration**

Scotty's sends their October statement showing your balance as $3,650. Your books show $3,500.

**Discrepancy investigation:**
- Scotty's shows an invoice of $150 from October 22 that isn't in your records
- You check email — no invoice received
- Call Scotty's

They confirm an invoice #SR-4521 for $150 of replacement parts was sent. You verify from receiving records — yes, you received those parts on Oct 22. The invoice must have been missed.

**Action:** Enter the missing invoice.

```
Dr. COGS - Repair Parts           133.00
Dr. HST Receivable (ITC)           17.00
     Cr. AP - Scotty's Refrigeration       150.00
Memo: Catch-up invoice #SR-4521 — received Oct 22, found on statement
```

Now the balance matches the supplier statement. This happens regularly — suppliers sometimes don't send invoices, or emails get missed. **Reconciling to supplier statements monthly is a professional discipline.**

---

### Friday, October 31 — Month-End Close

**9:00 AM — Accrual Entry**

Final accrual worksheet:

```
Hydro (estimated)                320.00
Water (estimated)                 65.00
Accrued wages (Oct 29-31)      1,500.00
Accrued vacation (Oct)            60.00
Accrued CPP/EI (employer)        150.00
───────────────────────────────────────
TOTAL                          2,095.00
```

**Accrual journal entry:**
```
Oct 31    Utilities Expense                     385.00
          Wages Expense                       1,500.00
          Employer CPP                           80.00
          Employer EI                            70.00
          Vacation Pay Expense                   60.00
               Accrued Liabilities                      2,095.00
          Memo: October month-end accruals — details on worksheet
```

**11:00 AM — AP Aging Review**

Updated AP aging (after today's activity and accruals):

```
AP AGING — October 31, 2025

Vendor                  Total
────────────────────────────────────
Bell Canada                210
Enbridge Gas               185
Restaurant Depot         4,200
Rogers Business             95
Scotty's Refrigeration   3,650
Sysco Canada             9,887.50
(Accrued Liabilities)    2,095 → on Balance Sheet as separate line
────────────────────────────────────
TOTAL AP               18,227.50
```

Total AP is lower than three days ago because:
- Peterborough Meats paid ($1,800)
- Lordco Auto Parts paid with discount ($2,840)
- North Bay Produce paid earlier in week ($1,320)
- But Sysco added ($9,887.50)
- Scotty's catch-up invoice added ($150)

**12:00 PM — Month-End Complete**

Financial statements can now be prepared with accurate monthly expenses — because accruals properly match expenses to October.

---

### Observations from the Scenario

1. **Daily AP hygiene matters.** Peterborough Meats went 5 days overdue because no one reviewed the aging until Monday morning. A daily glance at the aging would have caught it.

2. **Three-way matching works.** The Sysco emergency surcharge was a legitimate variance — but without the matching process, a rogue surcharge could have slipped through.

3. **Early payment discounts are real money.** Paying Lordco 10 days early saved $56.80. Across a year, this habit compounds to thousands in savings.

4. **Supplier statements prevent losses.** Without Scotty's statement reconciliation, the missing invoice would have become a claim — "you owe us $150 from October" — potentially with a late fee attached.

5. **Month-end accruals matter.** Without accruing the hydro ($320), Oct 29-31 wages ($1,500), and related items, October's P&L would be understated by $2,095.

---

## 9.12 Special Ontario Considerations

### Construction Act Holdbacks

Ontario's Construction Act (formerly Construction Lien Act) requires builders and contractors to withhold **10% of amounts payable** to subcontractors as a "holdback." This protects against liens.

If your client is in construction, when they receive a $10,000 invoice from a subcontractor:

```
Dr. COGS - Subcontractor          10,000.00
Dr. HST Receivable (ITC)           1,300.00
     Cr. AP - Subcontractor                     9,000.00  (90% payable now)
     Cr. Holdback Payable                       1,000.00  (10% held back)
     Cr. HST on Holdback                          130.00  (HST portion of holdback)
```

The 10% holdback is released after the certified release of holdback (typically 45 days after completion).

### Subcontractors vs. Employees — The CRA Test

If your client hires subcontractors, CRA applies a four-factor test to determine if they're really employees in disguise (which would require payroll taxes and T4 slips).

The four factors:
1. **Control** — does the "contractor" work on their own schedule, or does the business dictate hours?
2. **Tools and equipment** — who provides them?
3. **Ability to sub-contract** — can the worker hire their own helpers?
4. **Risk of profit/loss** — does the worker bear business risk?

**Subcontractors who fail this test** (essentially employees treated as contractors):
- CRA reassesses back payroll taxes
- Can be an expensive mistake

**Bookkeeper flag:** Ask the client how subcontractors operate. If they work full-time for the business with no other clients, provide no tools, and are told when to show up, they may be misclassified. Flag for accountant review.

### WSIB for Subcontractors

In Ontario, **WSIB (Workplace Safety and Insurance Board)** is mandatory for most businesses with employees. When hiring subcontractors, the business is typically responsible for ensuring the subcontractor has WSIB coverage (or paying the premiums themselves if not).

Documenting subcontractor WSIB coverage at the time of hiring protects your client. Ask for:
- WSIB Certificate of Clearance
- Confirmation of active coverage
- Retain documentation in vendor file

---

## 9.13 QuickBooks Online — The AP Workflow

### Setting Up Vendors

**Expenses → Vendors → New Vendor**

Enter:
- Legal name
- Display name
- HST registration number (essential for ITC documentation)
- Payment terms
- Default expense account (if the vendor always goes to one account)
- Banking details for EFT (if applicable)

### Entering Bills

**+ New → Bill**

Select vendor, bill date, due date, line items with accounts and amounts. Add HST. Save.

QBO creates:
- AP entry for the vendor
- Expense/asset entries for the items
- HST Receivable entry

### Paying Bills

**+ New → Pay Bills**

QBO shows all outstanding bills for all vendors. Select bills to pay, confirm payment method (cheque, bank transfer, etc.), save.

In QBO, cheques can be printed; EFTs can be exported for bank processing; or you can record payments as confirmations of already-made transfers.

### The AP Aging Report

**Reports → Expenses and Vendors → A/P Aging Summary**

Similar to AR aging but reversed (looking at payables).

### Vendor Statements

**Expenses → Vendors → (Vendor) → Statements** — useful for reconciling to supplier statements.

### Common QBO AP Mistakes

1. **Writing cheques without bills** — if you pay by cheque without first entering a bill, you don't get proper AP tracking. Always enter a bill first, then pay it.

2. **Using "Expense" instead of "Bill"** — the Expense form is for cash purchases (no AP involvement). Using it when you actually owe the vendor breaks the AP tracking.

3. **Not applying bill payments to specific bills** — similar to AR receipt application. Always specify which bills are being paid.

4. **Ignoring QBO's duplicate bill warnings** — if QBO warns about a duplicate, investigate before accepting. Usually it's genuinely a duplicate.

We cover QBO extensively in Week 13.

---

## 9.14 Quiz — 15 Questions

**Question 1**
Explain the five stages of the AP cycle.

??? answer
    1. **Purchase Order:** Authorization and formal request to vendor
    2. **Receipt of Goods:** Goods delivered and verified against the PO
    3. **Vendor Invoice:** The bill from the vendor
    4. **Approval (Three-Way Matching):** PO + Receiving + Invoice compared and confirmed to match
    5. **Payment:** Payment processed and recorded

    Each stage includes a verification opportunity to catch errors or fraud.

---

**Question 2**
What is three-way matching, and what does it prevent?

??? answer
    Three-way matching is the process of verifying that the **Purchase Order, Receiving Report, and Vendor Invoice** all agree on vendor, items, quantities, and amounts before payment.

    It prevents:
    - Paying for goods never received
    - Paying inflated amounts
    - Paying the wrong vendor
    - Paying duplicate invoices
    - Paying unauthorized purchases

---

**Question 3**
A vendor offers 2/10 Net 30. You have a $3,500 + HST invoice (total $3,955). Should you take the discount? Calculate the savings.

??? answer
    **Discount:** 2% of the pre-HST amount = 2% × $3,500 = **$70 savings**

    **Annualized cost of NOT taking discount:** 2% × (365 / 20) = **36.5% per year**

    At $70 savings for paying 20 days early, the effective annual return is 36.5% — far above any reasonable opportunity cost. **Take the discount.**

    Payment amount: $3,955 − $70 = $3,885 (if the discount applies to the HST-inclusive amount) or $3,500 − $70 + $455 = $3,885 (same result).

---

**Question 4**
Write the journal entry for a $1,200 + HST supplier bill received on credit.

??? answer
    ```
    Dr. Expense (appropriate account)   1,200.00
    Dr. HST Receivable (ITC)              156.00
         Cr. Accounts Payable - Vendor            1,356.00
    ```

---

**Question 5**
A bill in your books for $850 + HST is paid. Write the journal entry.

??? answer
    ```
    Dr. Accounts Payable - Vendor       960.50
         Cr. Cash                                  960.50
    ```

    Note: We do NOT touch the Expense or HST Receivable accounts again — those were recorded when the bill was entered.

---

**Question 6**
A supplier's cheque to you bounces. Different scenario: your cheque to a supplier bounces. What happens?

??? answer
    Your cheque bounces — meaning your bank didn't have sufficient funds to honor the cheque you wrote.

    Consequences:
    - Your bank returns the cheque to the supplier (marked NSF)
    - Supplier contacts you demanding immediate payment
    - Supplier may charge their own NSF fee (reasonable)
    - Supplier may require certified payment going forward
    - The transaction reverses in your books:

    ```
    Dr. Accounts Payable - Vendor       [amount]
         Cr. Cash                                 [amount]
    ```

    You need to pay the supplier immediately, usually by certified cheque, bank draft, or wire transfer.

    This is a serious issue. NSF cheques damage vendor relationships, affect your business credit, and may result in bank penalties.

---

**Question 7**
At month-end, your hydro bill hasn't arrived yet, but you estimate $185. What's the accrual entry?

??? answer
    ```
    Oct 31    Utilities Expense             185.00
                   Accrued Liabilities                185.00
              Memo: Estimated Oct hydro — invoice expected ~Nov 8
    ```

    When the actual bill arrives:
    ```
    Nov 8     Accrued Liabilities           185.00
                   AP - Hydro One                     185.00
              Memo: Actual Oct hydro bill
    ```

    If the actual is different ($195 instead of $185), adjust the difference:
    ```
    Nov 8     Accrued Liabilities           185.00
              Utilities Expense              10.00
                   AP - Hydro One                     195.00
    ```

---

**Question 8**
What are the four factors CRA uses to distinguish an employee from a subcontractor?

??? answer
    1. **Control** — who directs the work? (Employee = business controls; Contractor = worker controls)
    2. **Tools and equipment** — who provides them? (Employee = business; Contractor = worker)
    3. **Ability to sub-contract** — can the worker hire their own helpers? (Employee = no; Contractor = yes)
    4. **Risk of profit/loss** — does the worker bear business risk? (Employee = no; Contractor = yes)

    Misclassification (treating employees as contractors) is a common and costly error. CRA reassesses back payroll taxes with penalties and interest.

---

**Question 9**
You inherited a bookkeeping file. You notice 45 vendors set up, but only 22 have had activity in the past year. What should you do?

??? answer
    **Investigate before taking action.**

    The 23 inactive vendors could be:
    - Legitimate one-time vendors (ignore them — don't delete, but consider making inactive)
    - Former suppliers no longer used
    - **Duplicates of active vendors** with different spellings ("ABC Co." vs. "ABC Company Ltd.")
    - **Fraudulent fake vendors** set up by a previous employee

    **Action plan:**
    1. List all inactive vendors
    2. For each, review their history — were transactions legitimate?
    3. Consolidate duplicates
    4. Mark legitimate inactive vendors as inactive (not deleted)
    5. **Flag any suspicious entries** for review by the owner

    A large number of inactive vendors in a small business is a yellow flag. Some are benign; some might not be.

---

**Question 10**
A supplier's invoice arrives but you don't have a PO for this purchase. What do you do?

??? answer
    **Investigate before paying.**

    Possibilities:
    - The purchase was legitimate but no PO was created (informal ordering)
    - The employee who made the purchase is unavailable to confirm
    - The invoice is fraudulent (fake vendor trying to get paid)
    - The invoice is for a legitimate purchase but wrong amount

    **Action:**
    1. Check with the employee who would have ordered (e.g., kitchen manager, service technician)
    2. Verify the receiving records — were goods actually received?
    3. Confirm the vendor is one we do business with
    4. Get owner approval before paying if anything is unusual

    Paying without verification is how fraud happens.

---

**Question 11**
What is a holdback, and when does it apply?

??? answer
    A **holdback** is money withheld from a subcontractor's invoice as a protection against lien claims under the Ontario Construction Act.

    **The standard holdback: 10%** of amounts payable.

    Applies to construction and trades contracts. When a subcontractor's invoice is $10,000:
    - $9,000 is paid to the subcontractor
    - $1,000 is held back

    The holdback is released (typically 45 days after substantial completion) once:
    - A lien period has expired with no claims, OR
    - A release has been formally certified

    Holdback Payable is a liability on the balance sheet.

---

**Question 12**
A vendor's statement shows a balance of $3,840. Your books show $3,650. The difference is $190. What's the first step?

??? answer
    **Compare the statement to your records line by line.**

    Possibilities:
    1. Your records are missing an invoice (supplier's invoice of $190 hasn't been entered)
    2. Vendor's records are missing a payment (your payment of $190 hasn't been recorded by them)
    3. A credit note from the vendor hasn't been processed
    4. A disputed amount that one side has and the other doesn't

    **Steps:**
    1. Email the vendor requesting a detailed statement with invoice numbers and dates
    2. Check your records for any recent invoices not yet entered
    3. Check your bank records for any recent payments to this vendor not yet applied
    4. Investigate and reconcile

    Typically, a missed invoice is the cause.

---

**Question 13**
In your AP aging report, three invoices for the same vendor total $8,500. The vendor's terms are Net 30. The oldest is 15 days overdue. What's your immediate action?

??? answer
    1. **Confirm the overdue status** — is this really overdue or was the invoice date recent?
    2. **Check for any dispute or missing documentation**
    3. **Contact the vendor** to acknowledge the delay and provide a payment date
    4. **Pay the oldest invoice immediately** if there's no dispute
    5. **Schedule the other two** for payment per terms
    6. **Update the vendor's records** to prevent recurrence

    Late payments damage supplier relationships. They cost you in future pricing, reduced credit limits, and emergency order refusals. Keep vendors current unless there's a specific reason not to.

---

**Question 14**
What internal control prevents the "fake vendor fraud"?

??? answer
    **Requiring management approval for new vendor setup.**

    The specific controls:
    - New vendor setup requires manager authorization (not the bookkeeper alone)
    - Banking information changes require management approval
    - Periodic review of the vendor master file
    - Cross-check of vendor addresses against employee addresses
    - Verification of HST numbers with CRA
    - First payment to a new vendor is small (e.g., $100) to verify they can receive it at the stated address

    Without these controls, a single bookkeeper can set up a fake vendor and process fake invoices.

---

**Question 15**
Accrued Liabilities on the Balance Sheet at October 31 = $2,500. In November, the actual bills arrive and total $2,750. How do you handle the $250 difference?

??? answer
    Record each actual bill when it arrives. Clear the accrual simultaneously.

    **For a bill that came in higher than accrued:**
    ```
    Nov 8     Accrued Liabilities           185.00    (accrued amount)
              Utilities Expense              10.00    (additional expense in current month)
                   AP - Hydro One                     195.00
    ```

    **Overall effect on Accrued Liabilities:**
    - Started month at $2,500
    - As actual bills arrive, clear the accrual
    - If actuals total $2,750, you have $250 of additional expense in November
    - Accrued Liabilities returns to zero (or reset for November's accrual)

    The key principle: accruals estimate the period in question. Variances are recognized in the period the actual is received.

---

## 9.15 Week 9 Readiness Checklist

Before moving to Week 10, confirm you can do all of the following without prompts:

- ☐ Explain the five stages of the AP cycle
- ☐ Perform three-way matching (PO + receiving + invoice)
- ☐ Record a supplier bill correctly (debit expense + HST, credit AP)
- ☐ Record a bill payment correctly
- ☐ Handle a credit note from a vendor
- ☐ Handle an overpayment to a vendor
- ☐ Make intelligent payment timing decisions (take early discount vs. pay on due date)
- ☐ Calculate the annualized cost of missing a 2/10 Net 30 discount (36.5%)
- ☐ Run and read an AP aging report
- ☐ Perform a month-end accrual for expenses incurred but not yet invoiced
- ☐ Reconcile to a vendor's monthly statement
- ☐ Identify the five common AP fraud patterns
- ☐ Apply segregation of duties principles in small business AP
- ☐ Recognize when a subcontractor might be misclassified as an employee
- ☐ Understand Construction Act holdbacks (10% for Ontario construction)
- ☐ Use QBO's Bill and Pay Bills workflows correctly

---

## 📚 Further Reading

- [Ontario Construction Act](https://www.ontario.ca/laws/statute/90c30)
- [CRA: Employee or Self-employed (four-factor test)](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/rc4110.html)
- [WSIB Ontario: For Employers](https://www.wsib.ca/en/businesses)
- [QuickBooks Online: Enter and pay bills](https://quickbooks.intuit.com/learn-support/en-ca/help-article/bill-payments/enter-pay-bills-quickbooks-online/L6WVWP5JW_CA_en_CA)

---

!!! tip "Up Next: Week 10 — Bank Reconciliation"
    **The most important monthly control — and the most tested skill in every interview.** When the bank statement arrives and your book balance doesn't match, you reconcile. The process catches errors, surfaces missing transactions, detects fraud, and confirms the books are right.

    Wellington Wellness Clinic provides the signature example — a complex reconciliation with 7 reconciling items including an NSF cheque, a pre-authorized subscription, a book error on a supplier payment, and a wire transfer the office manager made online without notifying you. Finding all the pieces and balancing the rec is the test every Ontario employer runs.
