# Week 7: HST in Ontario — Complete and Practical

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Explain how HST flows through an Ontario business from first sale to CRA remittance
    - Distinguish between taxable, exempt, and zero-rated supplies
    - Record HST correctly on both sales (output tax) and purchases (Input Tax Credits)
    - Apply the 50% rule for meals and entertainment
    - Complete the HST return (GST34) from the books
    - Calculate the remittance (or refund) owed to (from) CRA
    - Understand the Quick Method and when it produces a lower remittance
    - Identify the most common HST errors that trigger CRA reviews
    - Handle HST on NSF cheques, bad debts, and customer refunds

!!! tip "Why HST is the most interview-tested topic"
    Ontario employers ask about HST in almost every bookkeeping interview. Why? Because HST is where most small businesses make errors — and where CRA catches them. A bookkeeper who handles HST cleanly is worth significantly more than one who doesn't. Master this week, and you'll pass the HST portion of any skills test. Beyond that — you'll save your future clients real money by claiming every legitimate ITC they're entitled to.

---

## 7.1 What HST Is — The Fundamental Mechanism

**HST (Harmonized Sales Tax)** is Ontario's consumption tax. It combines the federal **GST (Goods and Services Tax)** at 5% with Ontario's provincial portion at 8%, for a total rate of **13%** on most goods and services.

The critical thing to understand: HST is a **flow-through tax**. Businesses collect it from customers and remit it to CRA. They don't keep it. They don't earn it. It passes through the business.

### The Supply Chain Flow

Imagine a coffee shop that buys beans from a roaster, which buys them from an importer, who buys from a farmer cooperative.

```
Farmer Coop → Importer → Roaster → Coffee Shop → Customer

Each transaction is subject to HST (if taxable):

Importer buys from Farmer:  $5,000 + $650 HST = $5,650
Roaster buys from Importer: $8,000 + $1,040 HST = $9,040
Coffee Shop buys:           $10,000 + $1,300 HST = $11,300
Customer buys a latte:      $5.00 + $0.65 HST = $5.65
```

At each stage, the business collects HST on its sales and pays HST on its purchases. Through the **Input Tax Credit (ITC)** mechanism, each business recovers the HST it paid — so effectively only the **value it added** is taxed.

### The Net Effect

For the importer at year-end:
- HST collected from roaster (on sales): $1,040
- HST paid to farmer coop (on purchases): $650
- **Net HST to CRA: $1,040 − $650 = $390** (13% of the $3,000 value the importer added)

This is why HST is called a "value-added tax" internationally. Each business remits tax only on the value they added, not on the full price.

The final consumer (at the coffee shop) pays the full tax — that's who ultimately bears the cost. Every business along the chain is just a collector.

### Why This Matters for Bookkeeping

For every transaction, you need to know:
1. **Is the supply taxable, exempt, or zero-rated?**
2. **What HST rate applies?**
3. **Do we collect it (sale) or pay it (purchase)?**
4. **Is the HST we paid recoverable (ITC)?**

Get these four questions right on every transaction, and your HST return will reconcile to the penny at quarter-end.

---

## 7.2 The Three Categories — Taxable, Exempt, Zero-Rated

Every supply a business makes or receives falls into exactly one of three categories. The difference matters enormously.

### Taxable Supplies

**HST applies at the standard rate (13% in Ontario).**

- The business charges HST to customers
- The business claims ITCs on related purchases

**Examples:**
- Most goods and services (repairs, consulting, retail products)
- Commercial rent
- Professional services (accountants, lawyers, consultants)
- Most restaurant meals
- Hair salon services
- Dry cleaning
- Auto sales and repairs
- Software and software subscriptions
- Construction and renovation services

If you're unsure, assume a supply is taxable unless there's a specific reason otherwise. The vast majority of business transactions are taxable.

### Exempt Supplies

**HST does NOT apply. The business does not charge HST. ITCs on related purchases are NOT claimable.**

This is critical — with exempt supplies, the ITC door closes. Businesses that make exempt supplies effectively absorb the HST on their inputs as a cost.

**Examples of exempt supplies in Canada:**
- **Residential rent** (apartments, houses rented to tenants)
- **Most healthcare services** (physician, dental, optometry, chiropractic)
- **Most educational services** (K-12, university tuition, vocational training)
- **Most financial services** (bank fees, loan interest, insurance premiums)
- **Childcare services**
- **Legal aid services**

### Zero-Rated Supplies

**HST technically applies, but at 0%. The business charges 0% HST to customers. ITCs on related purchases ARE claimable.**

Zero-rating is the best of both worlds — no tax collected, but full ITC recovery. This is why exports are zero-rated (it keeps Canadian goods competitive internationally).

**Examples of zero-rated supplies:**
- **Basic groceries** (most unprepared food — vegetables, meat, dairy, bread)
- **Prescription drugs**
- **Medical devices** (glasses, hearing aids, mobility aids)
- **Most agricultural products** (seeds, livestock feed)
- **Exports** (goods and services sold to foreign customers)
- **International transportation**
- **Feminine hygiene products** (zero-rated as of 2015)

### The Critical Distinction

| Category | Charge HST? | Claim ITCs? | Example |
|---|---|---|---|
| Taxable | Yes, 13% | Yes | Oil change, consulting, restaurant meal |
| Zero-rated | Yes, but 0% | Yes | Groceries, prescription drugs, exports |
| Exempt | No | No | Residential rent, healthcare, bank fees |

### Why This Matters in Practice

Consider two Ontario landlords:

**Landlord A** rents a commercial storefront to a business for $3,000/month. This is a **taxable supply**. Landlord charges $3,390 ($3,000 + $390 HST). Landlord claims ITCs on all related expenses (maintenance, insurance, repairs).

**Landlord B** rents a residential apartment to a tenant for $2,500/month. This is **exempt**. Landlord charges $2,500 flat, no HST. Landlord CANNOT claim ITCs on maintenance, repairs, or anything else — the HST they pay on those expenses becomes a real cost they can't recover.

Same economic activity (renting real estate). Completely different tax treatment. Your bookkeeping must reflect this correctly or CRA will reassess.

---

## 7.3 HST Registration — Who Needs It and When

### The $30,000 Threshold

Any business in Canada is required to register for HST once **worldwide taxable revenue exceeds $30,000 in any four consecutive calendar quarters**.

Before reaching that threshold, a business is a **small supplier** — registration is optional.

### Why a Small Business Might Register Voluntarily

Even below the $30,000 threshold, many businesses choose to register voluntarily. Why?

**Reason 1: Recover ITCs.** A small supplier can't claim ITCs on purchases. A registered business can. For a business with significant start-up costs (equipment, inventory, tools), voluntary registration can save thousands.

**Example:** A new landscaping company buys $18,000 of equipment in year 1. The $2,340 HST they paid is recoverable only if registered. Without registration, that $2,340 is just a sunk cost.

**Reason 2: Business credibility.** Many commercial clients (especially larger corporations) prefer dealing with registered businesses. Being unregistered signals "very small operation."

**Reason 3: Catching up is painful.** If you accidentally exceed $30,000 without registering, you become liable for HST on all sales from that point forward — even if you didn't charge it. Voluntary registration upfront avoids this trap.

### How to Register

A business registers for HST through:
- **CRA's Business Registration Online (BRO)** system
- **Form RC1** (paper registration)
- Through their accountant

Registration assigns an HST account (nine-digit BN + RT0001 suffix, e.g., 123456789 RT0001).

**Effective date:** The business chooses the effective date. This can be up to 30 days before the registration application. If registering voluntarily, start the effective date early enough to capture ITCs on start-up purchases.

### As a Bookkeeper — Always Verify Registration Status

When starting with any new client, verify:
1. Is the business HST-registered?
2. What's their HST account number?
3. What's their reporting period (monthly, quarterly, annual)?
4. What's their fiscal year-end for HST purposes?

A business that thinks it's registered but isn't (or vice versa) creates chaos in the books. Check CRA My Business Account to confirm.

---

## 7.4 HST Reporting Periods

CRA assigns HST reporting periods based on the size of the business:

| Annual Taxable Sales | Default Reporting Period |
|---|---|
| $1.5 million or less | Annual |
| $1.5M – $6M | Quarterly |
| Over $6M | Monthly |

Businesses can elect to file more frequently than required. Small businesses often elect to file quarterly or annually for simplicity.

### Why Reporting Period Matters for Bookkeepers

- **Monthly filers:** Need the books closed and HST reconciled within 30 days of each month-end. High maintenance.
- **Quarterly filers:** Books closed and HST reconciled by the 30th of the month following quarter-end.
- **Annual filers:** Typically must make quarterly installment payments if net tax exceeds $3,000, and reconcile at year-end.

**Due dates:**
- Monthly and quarterly returns: Due 1 month after the end of the period
- Annual returns: Due 3 months after the fiscal year-end (for most businesses); individuals reporting HST on their T1 have until June 15

### Late-Filing Consequences

- **Late filing penalty:** Generally 5% of net tax owing, plus 1% per month late (capped)
- **Interest:** Compounded daily on unpaid amounts
- **Compliance history:** Late filings flag the account for increased audit probability

Filing on time matters. Don't let clients drift on HST deadlines.

---

## 7.5 Recording HST on Sales — Output Tax

### The Basic Entry

When your client makes a taxable sale:

```
Dr. Cash (or Accounts Receivable)       [total including HST]
     Cr. Sales Revenue                        [pre-HST amount]
     Cr. HST Payable                          [HST amount]
```

**Example:** Repair shop invoices a customer $680 + 13% HST:
- Pre-HST: $680
- HST: $88.40
- Total: $768.40

```
Dr. Accounts Receivable       768.40
     Cr. Service Revenue               680.00
     Cr. HST Payable                    88.40
Memo: Invoice #1428 — brake job, Honda Accord
```

### Running Balance of HST Payable

Over the quarter, HST Payable accumulates as sales are made. At the end of the reporting period, the balance represents the total HST collected (owed to CRA).

### What If a Customer Returns a Sale?

A customer returns a $300 item they bought last month (with HST of $39).

```
Dr. Sales Revenue (or Sales Returns)    300.00
Dr. HST Payable                          39.00
     Cr. Cash (or Accounts Receivable)        339.00
Memo: Return of Invoice #1389
```

The original HST collected is reversed. On the next HST return, the HST liability is correspondingly lower.

---

## 7.6 Recording HST on Purchases — Input Tax Credits

### The Basic Entry

When your client makes a taxable purchase (for business use):

```
Dr. Expense Account (or Asset)     [pre-HST amount]
Dr. HST Receivable (ITC)           [HST amount]
     Cr. Cash (or Accounts Payable)     [total including HST]
```

**Example:** Business buys $425 of office supplies:

```
Dr. Office Supplies           425.00
Dr. HST Receivable (ITC)       55.25
     Cr. Cash                        480.25
Memo: Staples order — general office supplies
```

### Running Balance of HST Receivable

Over the quarter, HST Receivable accumulates as purchases are made. At the end of the reporting period, the balance represents the total ITCs claimable.

### The ITC "Tests"

To claim an ITC, four conditions must be met:

1. **The business must be HST-registered** at the time of the purchase
2. **The supplier must have charged HST** (and be registered themselves — you can't just claim ITCs on HST that was never charged)
3. **The purchase must be for business use** (commercial activity)
4. **You must have documentation** (receipt or invoice showing the HST charged and the supplier's registration number)

If any of these fails, no ITC.

### The Documentation Rule — It Matters

CRA's documentation requirements for ITCs are specific. The receipt or invoice must show:

- Supplier's name (legal name, not just DBA)
- Date of the invoice
- Total consideration (amount paid)
- **Supplier's GST/HST registration number** (this is the killer one — if it's missing, CRA can disallow the ITC on audit)

For small purchases (under $30), only the basic information is required. For $30–$149.99, more information is needed. For $150+, full documentation is required.

!!! warning "The practical reality"
    Many small suppliers (especially tradespeople) issue handwritten invoices without their GST/HST number. Your client may have paid $2,000 of HST on such invoices. If CRA audits and the supplier's GST/HST number isn't on the invoice, the ITC can be denied.

    Your job as bookkeeper: when reviewing source documents, note any invoices lacking a GST/HST number. Flag them for the client to obtain corrected invoices. Better to ask now than lose the ITC later.

---

## 7.7 The 50% Rule for Meals and Entertainment

**Meals and entertainment (M&E) expenses are only 50% deductible for income tax purposes — and only 50% of the HST paid is claimable as an ITC.**

This is a rule most beginner bookkeepers miss. It's a CRA hot spot on audit.

### How to Record M&E Correctly

A client takes a prospective customer to dinner. The bill is $120 + $15.60 HST = $135.60 total.

**The 50% rule means:**
- Deductible M&E expense: 50% × $120 = $60
- Non-deductible M&E expense: 50% × $120 = $60
- Claimable ITC: 50% × $15.60 = $7.80
- Non-claimable HST: 50% × $15.60 = $7.80

### Two Common Approaches

**Approach 1: Record full amounts, adjust at year-end**

```
Dr. Meals & Entertainment    120.00
Dr. HST Receivable            15.60
     Cr. Cash                        135.60
```

At year-end, the accountant adjusts for the 50% disallowance. The bookkeeper does nothing special during the year. **This is the most common approach in practice.**

**Approach 2: Apply the adjustment at entry time**

```
Dr. Meals & Entertainment - 50% Deductible      60.00
Dr. Meals & Entertainment - Non-Deductible       60.00
Dr. HST Receivable (claimable)                    7.80
Dr. M&E HST - Non-Claimable (expense)             7.80
     Cr. Cash                                          135.60
```

This is more accurate throughout the year but requires more accounts and more thought on each entry.

### Which Approach to Use?

- **For most small businesses:** Approach 1. Keep M&E separate on the chart of accounts. The accountant adjusts at year-end.
- **For businesses with heavy M&E spending:** Approach 2 gives more accurate monthly financial statements.
- **For Quick Method filers (see below):** The distinction matters less because the ITC calculation is different.

Your instinct by default: Approach 1.

### The Audit Reality

CRA reviews M&E heavily. If M&E is lumped in with other expenses (like "Office Supplies") and it's significant, the auditor will ask to see every receipt. Keeping M&E in a separate account makes audit response straightforward — the accountant runs one report, provides the supporting receipts.

---

## 7.8 The HST Return — Form GST34

The HST return (Form GST34) is how businesses report HST to CRA. Let's walk through a complete return.

### The Key Line Items

| Line | What It Reports |
|---|---|
| 101 | Total sales and other revenue (for information purposes — excludes HST) |
| 103 | Total HST collected on sales (the HST Payable amount) |
| 104 | Adjustments (bad debt recoveries, HST on bad debts recovered, etc.) |
| 105 | Total HST collected and adjustments (101 + 104) |
| 106 | Total ITCs (the HST Receivable amount) |
| 107 | Adjustments |
| 108 | Total ITCs and adjustments (106 + 107) |
| 109 | Net tax (105 − 108) |
| 110 | Installment payments made |
| 111 | Other rebates |
| 112 | Total payments (110 + 111) |
| 113 | Refund claimed or balance owing (109 − 112) |
| 114 | Refund claimed (if 113 is negative) |
| 115 | Balance owing (if 113 is positive) |

### A Worked Example

**Lakeshore Auto Repair Inc. — Q3 2025 HST Return (July 1 – Sept 30)**

From the books at quarter-end:

- **Total taxable sales:** $68,500
- **HST Payable (Q3 balance):** $8,905
- **HST Receivable (Q3 balance):** $3,420
- **No installments paid during the quarter**

Completing the return:

```
Line 101: Sales                              $68,500
Line 103: HST collected on sales              $8,905
Line 104: Adjustments                              $0
Line 105: Total                               $8,905

Line 106: ITCs                                $3,420
Line 107: Adjustments                              $0
Line 108: Total ITCs                          $3,420

Line 109: Net tax (Line 105 − Line 108)       $5,485

Line 110: Installments paid                        $0
Line 112: Total payments                           $0

Line 113: Balance owing                       $5,485
Line 115: Remit to CRA                        $5,485
```

### Reconciling to the Books

After filing the return, you need to record the payment AND "clear" the HST accounts so they're ready for the next period:

**Step 1: Pay CRA.**

```
Dr. HST Payable                   8,905.00
     Cr. HST Receivable                     3,420.00
     Cr. Cash                              5,485.00
Memo: Q3 2025 HST remittance — net tax paid
```

This journal entry:
- Zeros out HST Payable (which was $8,905 — now $0 at start of Q4)
- Zeros out HST Receivable (which was $3,420 — now $0 at start of Q4)
- Records the $5,485 actual cash paid to CRA

Both HST accounts are now ready to accumulate Q4's activity.

### What If There's a Refund?

If the return shows a net refund (ITCs > HST collected), the entry is reversed:

**Example:** HST Payable $2,000, HST Receivable $3,500. Net refund: $1,500.

```
Dr. Cash (refund expected or received)   1,500.00
Dr. HST Payable                          2,000.00
     Cr. HST Receivable                         3,500.00
Memo: Q3 HST refund
```

The refund may take 2-4 weeks to arrive from CRA. Some bookkeepers record the refund receivable upfront; others wait until cash arrives. Either is acceptable if consistent.

---

## 7.9 The Quick Method — A Simpler Alternative

The **Quick Method** is an optional simplified HST calculation designed for small businesses.

### How It Works

Under the Quick Method:
- You still charge customers the full 13% HST
- But instead of tracking ITCs separately, you remit a **reduced rate** to CRA
- The difference between 13% collected and the reduced rate you remit represents an implicit credit for your inputs
- You still get a 1% credit on the first $30,000 of sales in each fiscal year

### Quick Method Rates (for Ontario)

The applicable rate depends on the type of business:

| Type of Business | Quick Method Rate (Ontario) |
|---|---|
| Retail/wholesaler (goods for resale) | 4.4% |
| Service providers (most professional services, consulting) | 8.8% |

*These rates are current as of 2025. Always verify current rates on CRA's website.*

### A Quick Method Example

**Halton Home Renovations** is a renovation contractor (service provider, Quick Method rate 8.8%).

Q3 taxable sales: $60,000
HST collected: $7,800 (customers paid)

Under regular method:
- HST Payable: $7,800
- Suppose ITCs: $900
- Net tax: $6,900

Under Quick Method:
- HST Payable: $7,800 (still collected)
- HST required to remit: 8.8% × ($60,000 + $7,800) = 8.8% × $67,800 = $5,966.40
  - (The calculation base is sales INCLUDING HST — gross revenue)
- 1% credit on first $30,000 × 1.088 = $326.40
- Net tax under Quick Method: $5,966.40 − $326.40 = $5,640.00

**Savings:** $6,900 − $5,640 = $1,260 saved in the quarter.

The Quick Method is mathematically better when your ITCs are small relative to sales — common for service businesses with low input costs.

### Who Can Use the Quick Method?

- Annual taxable sales (including HST) not exceeding $400,000
- Must elect to use it (fill out Form GST74)
- Cannot be used by certain businesses (some financial institutions, charities, public institutions)
- Once elected, must stay for at least one year

### Recording Quick Method in the Books

Under Quick Method, ITCs are NOT tracked separately in the books. All purchases go to expense accounts at the full (HST-inclusive) cost.

**Example:** $1,000 + $130 HST purchase:

```
Under Regular Method:
Dr. Expense             1,000.00
Dr. HST Receivable       130.00
     Cr. Cash                     1,130.00

Under Quick Method:
Dr. Expense             1,130.00
     Cr. Cash                     1,130.00
```

The full $1,130 is expensed because no ITC is separately claimed.

For HST Payable collected on sales, the regular 13% still applies:

```
Dr. Cash                    1,130.00
     Cr. Sales Revenue              1,000.00
     Cr. HST Payable                  130.00
```

At quarter-end, the Quick Method calculation produces a smaller HST remittance than the full 13% collected — and the difference is effectively captured as additional revenue (or simply a reduction of expense). This creates a book-to-tax difference that the accountant handles at year-end.

### When to Recommend Quick Method

As a bookkeeper, you don't recommend — the decision is between the client and the accountant. But you should:

- Know the Quick Method exists
- Understand which businesses might benefit
- Be able to record transactions correctly under both methods
- Flag potential Quick Method candidates to the accountant during year-end review

---

## 7.10 Signature Example — Halton Home Renovations, Burlington

Let's work through a complete HST quarter for a realistic Ontario contractor.

### The Business

**Halton Home Renovations Inc.** is a renovation contractor in Burlington. The owner, Marco Silva, has three employees and a diversified revenue mix:

- **Residential renovations** (kitchens, bathrooms, basements) — taxable
- **One residential rental property** Marco owns personally but inside the company structure — exempt
- **Commercial tenant improvements** — taxable

### The Q3 2025 Activity (Summary)

**Sales:**
- Renovation contracts completed in July: $28,400
- Renovation contracts completed in August: $31,200
- Renovation contracts completed in September: $26,800
- Commercial TI project: $15,500
- Rental income from residential tenant (3 months × $2,400): $7,200
- **Total gross revenue: $109,100**

**Purchases and expenses (HST-taxable inputs):**
- Materials (lumber, drywall, fixtures, paint): $38,500 + HST $5,005
- Subcontractor costs (electrician, plumber): $12,000 + HST $1,560
- Vehicle fuel: $2,800 + HST $364
- Insurance (commercial vehicle): $1,200 + HST $156
- Commercial vehicle repairs: $850 + HST $110.50
- Tools: $1,400 + HST $182
- Office supplies: $320 + HST $41.60
- Phone/internet: $450 + HST $58.50
- Accounting fees (Q2 filing): $650 + HST $84.50

**Purchases and expenses (not tied directly to taxable supplies):**
- Residential rental property maintenance: $1,800 + HST $234 (BUT — since rental income is exempt, these ITCs are NOT claimable)

**Meals and entertainment:**
- Client dinners: $480 + HST $62.40

**Exempt expenses:**
- Business insurance (commercial general liability): $2,400 (exempt — no HST)
- Bank charges: $85 (exempt)

### Step 1 — Classify Each Revenue Stream

- **Taxable revenue:** Renovation contracts + commercial TI = $86,400 + $15,500 = **$101,900**
- **Exempt revenue:** Residential rental = **$7,200**

HST collected on taxable sales: $101,900 × 13% = **$13,247**

### Step 2 — Determine ITC Eligibility

**Fully claimable ITCs (tied to taxable supplies):**
- Materials: $5,005
- Subcontractors: $1,560
- Vehicle fuel (commercial): $364
- Vehicle insurance: $156
- Vehicle repairs: $110.50
- Tools: $182
- Office supplies: $41.60
- Phone/internet: $58.50
- Accounting fees: $84.50
- **Subtotal: $7,561.60**

**50% claimable ITC (Meals & Entertainment):**
- M&E HST: $62.40 × 50% = **$31.20**

**NOT claimable (tied to exempt supplies):**
- Residential rental maintenance: $234 (cannot claim because rental income is exempt)

**Total ITCs: $7,561.60 + $31.20 = $7,592.80**

### Step 3 — Complete the HST Return

```
Line 101: Sales (excluding HST)               $109,100
         Note: Include both taxable AND exempt for line 101
Line 103: HST collected                        $13,247
Line 105: Total                                $13,247

Line 106: ITCs                                  $7,593  (rounded)
Line 108: Total ITCs                            $7,593

Line 109: Net tax                               $5,654

Line 115: Balance owing                         $5,654
```

### Step 4 — Record the Remittance

```
Jan 25    HST Payable                           13,247.00
              HST Receivable                                  7,593.00
              Cash                                           5,654.00
          Memo: Q3 2025 HST remittance
```

Both HST accounts reset to $0 for Q4.

### The Commentary — What Made This Complex

1. **Mixed supplies.** Halton has both taxable and exempt revenue. Only ITCs tied to taxable supplies are claimable.

2. **The rental property issue.** Marco's residential rental is exempt. He pays HST on maintenance but can't recover it. This is a real cost of the rental business that affects his return on investment — something his accountant likely discussed when recommending the rental structure.

3. **M&E 50% rule.** Without careful tracking, the $31.20 non-claimable HST could be missed.

4. **Documentation.** Every invoice for materials and subcontractor costs must have proper supplier documentation including GST/HST numbers. A sloppy supplier's invoice could cost Halton hundreds in disallowed ITCs on audit.

---

## 7.11 HST on Special Situations

### NSF Cheques

A customer's cheque bounces (NSF). The original invoice was $1,000 + $130 HST = $1,130.

The original entry (when cheque was received):
```
Dr. Cash                     1,130.00
     Cr. Accounts Receivable          1,130.00
```

When the bank returns the cheque NSF:
```
Dr. Accounts Receivable      1,130.00
     Cr. Cash                         1,130.00
```

**HST is NOT affected.** The supply still occurred. The customer still owes the HST. The receivable is just back on the books, waiting for collection. We covered this in Week 3.

### Bad Debts — The HST Adjustment

If the customer never pays and the account is written off as a bad debt, CRA allows a recovery of the HST that was remitted.

**Example:** Customer's $1,130 debt (including $130 HST) has become uncollectable.

**Write-off entry:**
```
Dr. Bad Debt Expense          1,000.00
Dr. HST Payable                 130.00      (recovery of HST)
     Cr. Accounts Receivable         1,130.00
Memo: Write off uncollectable account
```

The $130 HST is claimed back by reducing HST Payable. On the next HST return, this lower HST Payable flows through line 107 (adjustments).

**The conditions for claiming the HST recovery:**
- The original supply was taxable
- HST was reported and remitted on the original sale
- The debt has been written off in your accounting records
- Reasonable collection efforts have been made

### Customer Refunds

If you refund a customer for a returned product, the HST on the refund reduces HST Payable.

**Example:** Customer returns a $300 + $39 HST product.

```
Dr. Sales Returns             300.00
Dr. HST Payable                39.00
     Cr. Cash (or AP Credit Issued)         339.00
Memo: Customer return, Invoice #1234
```

HST Payable is reduced, which flows through to the HST return as a lower net tax.

### Self-Assessment on Imported Services

If your Ontario client buys services from a non-registered foreign supplier (e.g., a US consulting firm, a US software company with no Canadian registration), the Canadian business may need to **self-assess** HST on that purchase.

This is complex and often the accountant's territory. But as a bookkeeper, flag any significant foreign purchases for accountant review. A common scenario: a Canadian business subscribes to a US SaaS product at $5,000/year. No HST was charged (US vendor, no Canadian registration). In many cases, the Canadian business must self-assess and remit 13% on that $5,000 as if it were a domestic purchase.

This 14-week course doesn't go deep on self-assessment. Just know: foreign purchases flag accountant involvement.

---

## 7.12 Common HST Errors and How to Prevent Them

### Error 1 — HST Mixed Into Revenue

The single most common error. Recording a $1,130 sale as:

```
Dr. Cash                 1,130.00
     Cr. Sales Revenue           1,130.00
```

Revenue is overstated by $130. HST Payable is understated by $130. HST return won't reconcile.

**Prevention:** In QBO, always use sales tax codes on every transaction. The software automatically splits HST Payable correctly.

### Error 2 — Wrong HST Rate

Using 12% (old HST rate before 2010), 14% (wrong), 13.0% vs. 13% (rounding issue), or applying GST only (5%) when the province requires HST.

Ontario is 13%. Only 13%.

**Prevention:** Set up the HST rate correctly in QBO once, and don't override it per-transaction unless a specific non-Ontario transaction applies.

### Error 3 — Missed ITCs

A bill comes in with HST charged. The bookkeeper enters only the pre-HST amount as expense and codes the HST as cash (treating it as a full expense).

This means the ITC is lost. Over a year, this can cost a client thousands.

**Prevention:** Every supplier bill should be entered with HST explicitly. The expense amount should be the pre-HST amount; the HST should go to HST Receivable (ITC).

### Error 4 — Claiming ITCs on Exempt Supplies

A client with rental property claims ITCs on maintenance of a residential rental. This is disallowed — residential rent is exempt.

**Prevention:** If any revenue is exempt, carefully allocate expenses. Some are fully claimable (tied to taxable activities), some are not claimable (tied to exempt), some are partially claimable (overhead — usually proportional to taxable share).

### Error 5 — Forgetting the 50% Rule on M&E

M&E entered at 100% — full ITC claimed on the HST. On audit, CRA disallows half.

**Prevention:** Code all client entertainment and meals to a separate "Meals & Entertainment" account. The accountant applies the 50% adjustment at year-end. Keep the receipts organized for audit defense.

### Error 6 — Personal Expenses Claimed as Business

The owner buys personal items on the business credit card. The bookkeeper codes everything as "Office Supplies." ITCs claimed.

**Problems:**
- ITCs cannot be claimed on personal purchases
- CRA will reassess on audit
- Penalties and interest accrue

**Prevention:** Every questionable charge should be flagged. If the bookkeeper can't verify the business purpose, flag it for the client. Don't claim ITCs on anything you're not certain was for business.

### Error 7 — Filing After Bookkeeping Errors Go Uncaught

A bookkeeper files an HST return based on the books — but the books have errors. Recorded revenue is wrong. ITCs are overclaimed. The return is filed.

**Discovery later:** A subsequent audit or a new bookkeeper discovering errors means amending the return.

**Prevention:** Reconcile HST Payable and HST Receivable to supporting reports (sales by customer, purchase journal) before filing. Don't file until the numbers make sense.

---

## 7.13 Filing the HST Return — The Practical Process

### Pre-Filing Preparation

A week before the filing deadline:

1. **Close the period in QBO** — ensure no more transactions will be entered to the filing period
2. **Run the HST Liability report** (in QBO: Reports → Sales Tax → Sales Tax Liability)
3. **Verify HST Payable balance** — does it match your Sales Revenue × 13% (approximately)? Any significant mismatch needs investigation
4. **Verify HST Receivable balance** — does it make sense given the expenses for the quarter?
5. **Review M&E coding** — are expenses correctly in the M&E account?
6. **Review any exempt revenue** — are ITCs on related expenses correctly excluded?

### Filing Options

**Option 1: QBO's Sales Tax Centre**
QBO can file HST directly to CRA if enabled. This is increasingly common. Enter your CRA credentials once; QBO submits electronically.

**Option 2: CRA My Business Account**
Log in to CRA directly. Enter the numbers from your QBO report. File.

**Option 3: NetFile through tax software**
Some tax preparation packages can file HST. Less common for ongoing compliance.

**Option 4: Paper form**
Still allowed, but slow and error-prone. Avoid unless there's a specific reason.

### After Filing

1. **Pay the balance** (if owing) — use CRA's online payment, bank online billing, or pre-authorized debit
2. **Record the remittance** in QBO (the journal entry we showed earlier)
3. **Reconcile** — after the remittance entry, HST Payable and HST Receivable should both be zero. Confirm.
4. **File documentation** — keep the return, the HST Liability report from QBO, and the payment confirmation together for 6+ years
5. **Note the next deadline** — set a reminder for the next period's filing

---

## 7.14 Quiz — 15 Questions

**Question 1**
What HST rate applies to taxable sales in Ontario?

??? answer
    **13%** (5% federal GST + 8% Ontario provincial portion).

---

**Question 2**
Give three examples each of taxable, zero-rated, and exempt supplies.

??? answer
    **Taxable (13%):** Oil change, consulting services, commercial rent, restaurant meals, retail goods, hair services, software subscriptions.

    **Zero-rated (0%, ITCs claimable):** Basic groceries, prescription drugs, exports, medical devices, feminine hygiene products.

    **Exempt (no HST, no ITCs):** Residential rent, healthcare services, educational services, most financial services, childcare, legal aid.

---

**Question 3**
A business is not HST-registered. They buy $500 of office supplies and pay $65 HST. Can they claim a $65 ITC?

??? answer
    **No.** Only HST-registered businesses can claim ITCs. An unregistered business treats the $65 as part of the cost of the purchase — it's just a cost of doing business, not recoverable.

    If the business is a small supplier but expects to make significant purchases, voluntary registration is worth considering.

---

**Question 4**
A client sells $850 + HST of services. Write the journal entry.

??? answer
    $850 × 13% = $110.50 HST. Total: $960.50.

    ```
    Dr. Accounts Receivable (or Cash)     960.50
         Cr. Service Revenue                         850.00
         Cr. HST Payable                             110.50
    ```

---

**Question 5**
A client pays $350 + HST on office supplies (business use, registered business). Write the journal entry.

??? answer
    $350 × 13% = $45.50 HST. Total: $395.50.

    ```
    Dr. Office Supplies                   350.00
    Dr. HST Receivable (ITC)               45.50
         Cr. Cash (or AP)                             395.50
    ```

---

**Question 6**
A client takes a client to dinner. Bill: $200 + $26 HST = $226. What's the correct treatment?

??? answer
    Record the full amount to Meals & Entertainment:

    ```
    Dr. Meals & Entertainment            200.00
    Dr. HST Receivable (ITC)              26.00
         Cr. Cash                                    226.00
    ```

    The accountant applies the 50% disallowance at year-end. Only $100 is deductible and only $13 of HST is a claimable ITC.

    Alternatively, the bookkeeper can apply the 50% at entry time — but keeping the full amount in M&E and letting the accountant adjust is most common.

---

**Question 7**
What's the annual taxable sales threshold above which a business MUST register for HST?

??? answer
    **$30,000 in any four consecutive calendar quarters.** Businesses below this are "small suppliers" and registration is optional.

---

**Question 8**
Explain the difference between the Quick Method and the regular method.

??? answer
    **Regular method:** The business tracks HST Payable (on sales) and HST Receivable (on purchases) separately. The HST return nets them together. Detailed ITC tracking is required.

    **Quick Method:** The business still charges 13% to customers. But instead of claiming ITCs individually, they remit a reduced rate (4.4% for retail/wholesale, 8.8% for services). The difference effectively captures the inputs implicitly. ITCs are not tracked separately.

    Quick Method is often better for service businesses with low input costs. Regular method is better for businesses with significant HST paid on inputs.

---

**Question 9**
A client's Q3 HST Payable is $9,400. HST Receivable is $3,800. No installments. What's the remittance to CRA?

??? answer
    **$9,400 − $3,800 = $5,600** remitted to CRA.

    Journal entry:
    ```
    Dr. HST Payable              9,400.00
         Cr. HST Receivable               3,800.00
         Cr. Cash                         5,600.00
    ```

---

**Question 10**
A client's Q3 HST Payable is $2,200. HST Receivable is $3,500. What happens?

??? answer
    The client is owed a **refund of $1,300** from CRA.

    Journal entry (assuming refund received):
    ```
    Dr. Cash                      1,300.00
    Dr. HST Payable               2,200.00
         Cr. HST Receivable               3,500.00
    ```

    CRA typically processes refunds within 2-4 weeks.

---

**Question 11**
A supplier's invoice doesn't show their GST/HST registration number. Can the ITC still be claimed?

??? answer
    **Technically no.** CRA's documentation requirements specify that invoices for purchases over $30 must include the supplier's registration number. Without it, the ITC can be disallowed on audit.

    **Practical approach:**
    - For small amounts, ask the supplier to include their number on future invoices
    - For significant amounts, request a corrected invoice from the supplier
    - If correction isn't possible, consult the accountant about whether to claim anyway (low risk at small amounts, significant risk at large amounts)

    Document your efforts to obtain proper documentation. This helps on audit.

---

**Question 12**
A client rents a commercial property for $3,500/month + HST. The tenant sub-leases part of it as a residential apartment for $1,800/month. What's the HST treatment?

??? answer
    **Commercial rent to landlord:** Taxable. Tenant pays $3,500 + $455 HST. Tenant claims $455 as ITC (if registered).

    **Residential sub-lease:** Exempt. Tenant (now acting as landlord to the residential sub-tenant) does NOT charge HST on the $1,800.

    The tenant's ITC recovery on the commercial lease is now restricted because part of the space generates exempt revenue (residential rent). The tenant must apportion ITCs — claiming only the portion related to taxable use.

    This is a complex area. Flag for accountant review.

---

**Question 13**
A $4,200 customer invoice (including $483 HST) becomes uncollectable after 6 months of collection efforts. Write the bad debt entry including the HST recovery.

??? answer
    ```
    Dr. Bad Debt Expense          3,717.00
    Dr. HST Payable                 483.00
         Cr. Accounts Receivable           4,200.00
    Memo: Write off uncollectable account — Customer X
    ```

    The HST recovery of $483 reduces HST Payable. On the next HST return, this flows through as an adjustment, reducing the net tax owed (or increasing the refund).

---

**Question 14**
A client's HST return is due on the 31st. The client's books aren't closed and HST Receivable looks suspicious. What do you do?

??? answer
    **Don't file yet.** Never file an HST return based on bookkeeping you haven't verified.

    Steps:
    1. Communicate to the client that the filing may be delayed
    2. Investigate the HST Receivable — compare to the sum of HST from supplier bills and expense transactions
    3. Find the discrepancy (is there a missing bill? a duplicate entry? an exempt expense miscoded with ITC claimed?)
    4. Correct the books
    5. File as soon as accurate

    If the filing deadline absolutely cannot be moved and the discrepancy is small, consult the client and the accountant. A late filing with a small penalty is often preferable to filing incorrect numbers. A knowingly incorrect return is much worse than a late return.

---

**Question 15**
A Canadian business subscribes to a US-based SaaS product for $6,000/year. The US vendor is not registered for Canadian HST and doesn't charge HST. Is anything required on the HST return?

??? answer
    Possibly yes — **self-assessment** may apply.

    If the Canadian business is HST-registered and the services would have been taxable if purchased from a Canadian supplier, the Canadian business may be required to self-assess HST on the imported service.

    Self-assessment means: the Canadian business reports 13% HST on the $6,000 as both HST Payable (self-assessed) AND HST Receivable (ITC — because it's a business input). Net tax effect is typically zero IF the business has full ITC recovery — but the gross-up still needs to be reported correctly.

    For businesses with any exempt supplies, the ITC recovery may be limited, and the self-assessment creates a real cost.

    **Bookkeeper action:** Flag any foreign service purchases for accountant review. Self-assessment is an advanced area that the accountant should handle.

---

## 7.15 Week 7 Readiness Checklist

Before moving to Week 8, confirm you can do all of the following without prompts:

- ☐ Explain how HST flows from one business to the next in a supply chain
- ☐ Distinguish taxable, exempt, and zero-rated supplies with examples
- ☐ Know the $30,000 registration threshold
- ☐ Identify the current Ontario HST rate (13%)
- ☐ Record HST correctly on a taxable sale (credit HST Payable)
- ☐ Record HST correctly on a taxable purchase (debit HST Receivable)
- ☐ Apply the 50% rule for Meals & Entertainment
- ☐ Recognize when an expense relates to exempt supplies (no ITC)
- ☐ Complete the HST return from the books — knowing what goes on each line
- ☐ Record the HST remittance and clear the HST accounts to zero
- ☐ Know when the Quick Method might be beneficial
- ☐ Handle NSF cheques (HST not affected), bad debts (HST recovery), and customer returns (HST reversal)
- ☐ Recognize the most common HST errors and how to prevent them
- ☐ Know HST documentation requirements (supplier's registration number must be shown)
- ☐ Know what the filing deadlines are for monthly, quarterly, and annual filers

---

## 📚 Further Reading

- [CRA: GST/HST for Businesses](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses.html)
- [CRA: Input Tax Credits](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/input-tax-credits.html)
- [CRA: Quick Method of Accounting](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/complete-file-return/accounting-method.html)
- [CRA: GST/HST on Imported Services](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/importing-goods-services.html)

---

!!! tip "Up Next: Week 8 — Accounts Receivable"
    **Getting paid — and tracking it right.** Every business that extends credit to customers needs a rigorous AR process. We cover invoicing, aging reports, NSF cheques, bad debts, early payment discounts, and the internal controls that prevent fraud. Simcoe Signs & Graphics provides three months of realistic AR scenarios — including the moment a long-standing customer goes 90 days overdue and the collection conversation that follows.
