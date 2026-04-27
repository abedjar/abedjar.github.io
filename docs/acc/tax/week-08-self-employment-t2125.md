# Week 8: Self-Employment Income — The T2125 From First Dollar to Last Line

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Apply CRA's four-factor test to determine whether any worker is self-employed or an employee
    - Build a complete T2125 for any self-employed client — sole proprietor, professional, or contractor
    - Calculate Cost of Goods Sold correctly for product-based businesses
    - Identify and correctly categorize every common business expense — current vs. capital
    - Calculate home office deductions using the business-use-of-home method
    - Calculate vehicle expenses with full logbook-based business-use percentage
    - Apply CCA across the most common asset classes — Classes 8, 10, 10.1, 12, 50, and 1
    - Calculate CPP on self-employment income — both the deductible and credit components
    - Explain HST registration obligations for self-employed clients and Input Tax Credits
    - Distinguish between a business and a hobby using CRA's reasonable expectation of profit test
    - Handle fiscal year elections and their interaction with the December 31 reporting requirement
    - Identify the eight most common T2125 errors that generate CRA audits
    - Apply Ontario-specific considerations for self-employed individuals — LIFT Credit, instalment obligations

!!! warning "This is the most complex single form on the T1 — and the most commercially valuable"
    Self-employment income affects a growing share of every tax preparer's client base — gig workers, contractors, freelancers, professionals, small business owners. The T2125 requires judgment calls that no other form demands: current vs. capital, personal vs. business, hobby vs. commercial activity. Getting it right means protecting your client from audit exposure while capturing every legitimate deduction. Getting it wrong means either leaving money on the table or creating reassessment risk. Master every section of this week.

---

## 8.1 Who Is Self-Employed — The Four-Factor Test

Before completing a T2125, you must establish that the client is genuinely self-employed. This is not a formality — CRA has reassessed employment relationships for millions of dollars in CPP, EI, and income tax when workers were misclassified.

### The Four CRA Factors

CRA applies four factors holistically. No single factor is determinative — the overall picture of the relationship controls.

| Factor | Points to Employee | Points to Self-Employed |
|---|---|---|
| **Control** | Payer controls when, where, and how work is performed | Worker controls their own schedule and methods. Payer controls the result, not the process |
| **Tools and equipment** | Payer provides the tools, equipment, and workspace | Worker provides their own tools at their own cost and risk |
| **Chance of profit / risk of loss** | Fixed pay regardless of business performance. No financial risk beyond wages | Can profit more by working efficiently. Bears cost of errors, redos, and bad debts |
| **Integration** | Worker's activities are essential to the payer's core operations | Worker's services could be provided to multiple clients. Not integral to any one operation |

### The T4A Box 48 Signal

When a client brings a T4A with Box 48 (Fees for Services), CRA has already been told this was self-employment income — the payer classified it that way. The T2125 is required. If you put Box 48 on Line 10100 (employment), you've misclassified it AND missed the CPP obligation AND missed all legitimate business expense deductions.

!!! example "Case — The IT Contractor on the Boundary"
    David works full-time at a tech company. He also does evening and weekend consulting for three other firms, each paying him through T4A Box 48. He uses his own laptop and home office, sets his own hours, and could be replaced by anyone with his skills.

    **Self-employed or employee for the consulting work?**
    Control: David controls his hours and methods ✅ self-employed
    Tools: His own laptop, his own home office ✅ self-employed
    Financial risk: If he quotes wrong, he absorbs the time cost ✅ self-employed
    Integration: Three different clients, could work for anyone ✅ self-employed

    **Verdict: Self-employed.** T2125 required for the consulting income.

    David's T4 from his full-time job: Line 10100 (employment).
    David's T4A Box 48 consulting income: T2125 → Line 13500.

    The two income streams are handled completely differently — one is employment, the other is self-employment. He pays employment CPP through his T4 employer AND self-employment CPP through his T2125. He claims home office and vehicle expenses for the consulting work on T2125 (supported by T2200 is NOT required for self-employment — he is his own employer).

---

## 8.2 The T2125 Structure — The Complete Flow

The T2125 (Statement of Business or Professional Activities) follows this logical sequence. Every professional preparer should know this flow cold.

```
PART 1: IDENTIFICATION
    Business name (if any)
    Industry code (NAICS 6-digit)
    Business address
    Fiscal year (usually December 31)
    GST/HST registration number (if registered)

PART 2: INCOME
    Gross income from all sources
    Minus: Returns, allowances, discounts
    = Net revenue

PART 3: COST OF GOODS SOLD (product businesses only)
    Opening inventory
    + Purchases of goods for resale or raw materials
    − Closing inventory
    = Cost of goods sold
    
    Gross profit = Net revenue − COGS

PART 4: EXPENSES
    All eligible business operating expenses
    (See complete list in Section 8.4)

PART 5: CALCULATION OF BUSINESS-USE-OF-HOME EXPENSES
    Home office if client works from home
    
PART 6: VEHICLE EXPENSES DETAIL
    Logbook-based business use percentage
    
PART 7: CCA (CAPITAL COST ALLOWANCE)
    Depreciation on business assets by CCA class

PART 8: NET INCOME (OR LOSS)
    Gross profit
    − Operating expenses
    − Business-use-of-home
    − CCA
    = NET INCOME (or LOSS) → Line 13500 on T1
```

### Where T2125 Net Income Goes on the T1

| Business Type | T1 Line |
|---|---|
| Business income (products, services, retail, manufacturing) | **Line 13500** |
| Professional income (doctors, lawyers, accountants, architects) | **Line 13700** |
| Commission income (agents, sales) | **Line 13900** |
| Farming income | **Line 14100** |
| Fishing income | **Line 14300** |

For most clients, Line 13500 is the correct destination. Professionals use Line 13700. The tax treatment is identical — the distinction matters only for CRA classification purposes.

### The NAICS Industry Code

Every T2125 requires a **6-digit NAICS (North American Industry Classification System) code** identifying the nature of the business. Your software will prompt for it. Common codes:

| Business Type | NAICS Code |
|---|---|
| Taxi and rideshare (Uber, Lyft) | 485310 |
| Courier and delivery | 492210 |
| Residential cleaning | 561720 |
| Computer consulting/IT | 541512 |
| Accounting services | 541219 |
| Graphic design | 541430 |
| Photography | 541921 |
| Real estate agent | 531210 |
| Hair salon / barber | 812111 |
| Restaurant and food service | 722511 |
| Retail – online | 454110 |
| Landscaping | 561730 |
| Tutoring | 611630 |

If in doubt: search "NAICS Canada [business type]" — Statistics Canada publishes the complete code directory.

---

## 8.3 Gross Income and Revenue — Reporting Correctly

### The Gross Revenue Rule — No Exceptions

The first and most fundamental T2125 rule: **always report gross revenue — never net deposits or net after fees.**

This rule is violated more often than any other on self-employment returns:
- An Uber driver reports what Uber deposited, not the gross fares
- An Etsy seller reports what Etsy paid out, not total sales
- A freelancer reports what they received, not the invoice total minus PayPal fees

**Gross revenue** is the total amount earned before any deductions — the platform fees, payment processing fees, and refunds come OUT as business expenses on the expense side of the T2125. They do not come off the top.

**Why it matters:** CRA cross-matches T4A Box 48 slip amounts (which report gross revenue) against the T2125 gross income line. If the T2125 shows $38,000 but the T4A shows $52,000 — the mismatch triggers a review. The client's own bank deposits may also be used in audit to verify revenue.

!!! example "Case — Kevin's Uber Revenue Correctly Reported"
    Kevin's Uber annual summary shows:
    - Total fares collected from riders: $68,400 (gross fares)
    - Uber service fee (25%): ($17,100)
    - Net deposited to Kevin: $51,300

    **Incorrect approach:** T2125 gross revenue = $51,300 (what he received)
    **Correct approach:** T2125 gross revenue = **$68,400**; Uber service fee = $17,100 in expenses

    The T4A CRA received from Uber: $68,400 (Box 48 reports gross fares).
    Filing with $51,300 creates a $17,100 unexplained discrepancy.

    When Kevin's accountant later audits the expenses: the $17,100 Uber fee is deductible — the net tax result is identical. But the gross revenue line must match the documented evidence.

### Multiple Revenue Streams on One T2125

If a client has one business that earns revenue in multiple ways (a photographer who does weddings, sells prints, and teaches workshops), all revenue from that single business goes on one T2125. If the business activities are genuinely distinct (a photographer who ALSO drives Uber), use separate T2125 forms.

---

## 8.4 Cost of Goods Sold — For Product-Based Businesses

Cost of Goods Sold (COGS) applies to businesses that sell physical products. Service businesses (consultants, drivers, advisors) have no COGS — they go straight from gross revenue to expenses.

### The COGS Formula

```
Opening inventory (January 1, or date business started)
  + Purchases of goods or raw materials during the year
  + Direct labour (in a manufacturing context)
  + Overhead allocated to production
  − Closing inventory (December 31)
══════════════════════════════════════════════════════
= COST OF GOODS SOLD
```

**Gross profit = Net revenue − COGS**

### Inventory Valuation

At December 31, the client must conduct a physical count of remaining inventory and value it. CRA permits three valuation methods:

| Method | When Used | Notes |
|---|---|---|
| **Cost** | Most common | What was paid for the inventory |
| **Fair market value** | If lower than cost (damaged, obsolete goods) | Lower of cost or market value permitted |
| **Direct cost (manufacturing)** | Manufacturing businesses | Only production costs — not overhead |

!!! example "Case — Rachel's Handmade Jewelry Business (Etsy)"
    Rachel makes and sells handmade silver jewelry on Etsy. Her 2025 T2125 COGS section:

    | Item | Amount |
    |---|---|
    | Opening inventory (Dec 31, 2024): silver, clasps, findings on hand | $1,840 |
    | Purchases of materials during 2025 | $9,600 |
    | Closing inventory (Dec 31, 2025 — physical count) | ($2,150) |
    | **Cost of Goods Sold** | **$9,290** |

    Rachel's gross revenue: $42,800 (all Etsy sales — including Platform fees paid separately as business expense)
    Less COGS: ($9,290)
    **Gross profit: $33,510**

    The gross profit is what's left before deducting operating expenses. For Rachel, the raw materials cost represents 21.7% of her revenue — a healthy margin for handmade jewelry.

!!! question "Quick Check — Revenue vs. COGS"
    David is a freelance web developer. He earned $85,000 in client fees and paid $3,200 for stock photos and third-party APIs used in client projects. He also paid $1,800 for his home office and $600 for professional development courses. What is his gross profit, and where do each of these expenses go on the T2125?

    ??? answer
        **Revenue:** $85,000
        **COGS** (direct costs of delivering the service): $3,200 (stock photos and APIs used in client projects) → Part 3 of T2125
        **Gross profit:** $85,000 − $3,200 = **$81,800**
        **Operating expenses** (cost of running the business): home office $1,800 + professional development $600 → Part 4 of T2125
        **Net income:** $81,800 − $2,400 = **$79,400** — this flows to Line 13500 on the T1. The distinction between COGS and operating expenses matters for the gross profit calculation and for CRA audit review of margin ratios.

---

## 8.5 Operating Expenses — The Complete Deductible Business Expense Catalogue

This is the core of the T2125. A self-employed client can deduct any expense that was:
1. Incurred to earn business income
2. Reasonable in amount
3. Not of a personal nature
4. Not capital in nature (capital costs go through CCA — see Section 8.7)
5. Supported by documentation

### The Complete T2125 Expense Categories

=== "Advertising and Promotion"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Google/Facebook/Instagram ads | ✅ 100% | Digital advertising is fully deductible |
    | Business website hosting and domain | ✅ 100% | Business necessity |
    | Business cards, flyers, brochures | ✅ 100% | |
    | Logo and branding design | ✅ 100% | |
    | Trade show booth fees | ✅ 100% | |
    | Sponsored content / influencer fees | ✅ 100% | If for business promotion |
    | Gifts to clients (over $50 threshold) | ✅ 100% | As advertising — no personal benefit test issue |
    | Meals for advertising purposes | ✅ 50% | Subject to the 50% meal limitation |

=== "Meals and Entertainment"

    **The 50% limitation rule:**
    Meals and entertainment expenses are deductible at only **50% of the actual cost.** This applies to both employees (T777) and self-employed (T2125).

    | Deductible at 50% | Notes |
    |---|---|
    | Business meals with clients or associates | Client must be present and business purpose documented |
    | Restaurant meals during business travel | Away from home for business |
    | Client entertainment (events, tickets) | Business purpose required |

    | Not deductible | Notes |
    |---|---|
    | Meals between business owners (no client) | Considered personal |
    | Holiday parties for employees only | Exception: staff event limit applies separately |
    | Meals alone (no client or business discussion) | Personal — 0% deductible |

    **Documentation:** For every meal or entertainment claim: date, venue, names of all people present, and the business purpose. CRA auditors review these meticulously.

=== "Office Expenses and Supplies"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Pens, paper, toner, printer ink | ✅ 100% | Consumable supplies |
    | Postage and courier fees | ✅ 100% | |
    | Shipping supplies (boxes, tape, bubble wrap) | ✅ 100% | |
    | Printer paper, notebooks, file folders | ✅ 100% | |
    | Small tools under $500 | ✅ 100% (Class 12) | Or current expense if truly consumable |
    | Annual software subscriptions | ✅ 100% | Recurring SaaS costs are current expenses |
    | Computer peripherals under $500 | ✅ 100% or Class 12 | Keyboard, mouse, monitor — see CCA if over threshold |

=== "Professional Fees"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Accounting and bookkeeping fees | ✅ 100% | Including preparation of this T2125 |
    | Legal fees (business-related) | ✅ 100% | Contract review, dispute resolution |
    | Professional membership dues | ✅ 100% | Industry associations required for business |
    | Business licences and permits | ✅ 100% | |
    | Consulting fees paid to others | ✅ 100% | Must issue T4A if ≥$500 to a single payee |

=== "Insurance"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Business liability insurance | ✅ 100% | Errors and omissions, general liability |
    | Property insurance (business premises) | ✅ 100% | |
    | Vehicle insurance (business portion) | ✅ Business % | Part of vehicle expense calculation |
    | Life insurance (business-owned policy on owner) | ❌ Generally no | Personal — complex exceptions exist |
    | Health insurance premiums | ✅ Partial | Via Medical Expense Credit; different rules for PHSP |

=== "Interest and Bank Charges"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Interest on business loans | ✅ 100% | Loan must be used to earn business income |
    | Bank service charges on business account | ✅ 100% | Business account only — not personal account |
    | Credit card interest (business purchases) | ✅ 100% | Business charges only |
    | NSF fees (business account) | ✅ 100% | |

=== "Travel Expenses"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Airfare (business purpose) | ✅ 100% | |
    | Hotel/accommodation (business purpose) | ✅ 100% | |
    | Taxis, Ubers, parking at business destinations | ✅ 100% | Not parking while at regular workplace |
    | Meals during overnight business travel | ✅ 50% | 50% limitation applies |
    | Personal vacation attached to business trip | Allocate | Personal portion is not deductible |
    | Convention/conference registration | ✅ 2 per year max | Two conventions annually (ITA limitation) |

=== "Telephone and Utilities"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Business phone line (dedicated) | ✅ 100% | |
    | Cell phone (business portion) | ✅ Business % | Must allocate — can't claim 100% if personal use exists |
    | Internet (business portion for home-based) | ✅ Business % | Blended with home office if applicable |
    | Second phone line for fax or business | ✅ 100% | |

=== "Salaries and Wages"

    | Expense | Deductible? | Notes |
    |---|---|---|
    | Employees' salaries and wages | ✅ 100% | Including CPP and EI employer contributions |
    | Owner's own salary | ❌ No | Owner draws are not deductible (they're business income) |
    | Arm's length family employees' wages | ✅ If reasonable | Must be for real work at fair market rates |
    | Non-arm's length family wages (spouse, child) | ✅ If reasonable | Must be for actual work performed at commercial rates |

    !!! warning "Owner's salary is not a T2125 deduction"
        A sole proprietor cannot pay themselves a salary and deduct it on the T2125. The entire net profit of the business IS the owner's income. Drawing money from the business account is not a deduction — it's simply extracting income that is already taxed as part of net income. This is different from an incorporated business owner who pays themselves a T4 salary (deductible at the corporate level).

---

## 8.6 Home Office for Self-Employed — The Detailed Method

Self-employed individuals can claim a business-use-of-home deduction when they work from their home.

### The Two Tests

**Test 1:** The home must be the place where the business is **principally carried on** (more than 50% of working hours), OR

**Test 2:** The home workspace must be used **exclusively and on a regular and continuous basis** for meeting clients, customers, or patients.

Unlike employees (who need a T2200), self-employed individuals do not need any employer authorization. They are their own employer. The key is that the workspace genuinely meets one of the two tests.

### Eligible Home Office Expenses for Self-Employed

| Expense | Renter | Homeowner |
|---|---|---|
| Rent | ✅ Yes | N/A |
| Mortgage interest | N/A | ✅ Yes (unlike employees) |
| Property taxes | N/A | ✅ Yes |
| Home insurance | N/A | ✅ Yes |
| Heat, electricity, water | ✅ Yes | ✅ Yes |
| Internet (home portion) | ✅ Yes | ✅ Yes |
| Maintenance and minor repairs | ✅ Yes | ✅ Yes |
| **CCA on the home** | N/A | ⚠️ Avoid — see warning |

!!! danger "Never claim CCA on a principal residence home office — even when self-employed"
    Self-employed individuals CAN legally claim CCA on the business-use portion of their home. Employees cannot — but self-employed can. However, claiming CCA on a principal residence removes that portion from the **Principal Residence Exemption**. When the home is eventually sold, the portion that had CCA claimed loses its PRE protection — triggering capital gains AND recapture.

    At typical home office proportions (10–20% of home), claiming CCA on the home office for 10 years might save $500–$1,500 in CCA deductions. But when the home sells 10 years later at a $400,000 gain, 15% of that gain ($60,000) is now taxable — generating $60,000 × 50% × 29.65% = **$8,895 in additional capital gains tax** PLUS recapture on the CCA claimed.

    The math almost never works in the client's favour. Never claim CCA on a principal residence home office.

### The Business-Use Percentage Calculation

**Two methods — use whichever produces the higher (more defensible) percentage:**

**Method 1 — Square footage:**
Business workspace area ÷ Total home area = Business %

**Method 2 — Number of rooms:**
Rooms used exclusively for business ÷ Total rooms = Business %

CRA accepts either method. Use the one that produces the larger (but still reasonable) percentage.

!!! example "Case — Ahmed's Freelance Design Studio (Complete Calculation)"
    Ahmed is a self-employed graphic designer working from his Waterloo apartment. His apartment: 950 sq ft total. His dedicated home office (spare bedroom used exclusively for work): 140 sq ft.

    **Business-use percentage:** 140 ÷ 950 = **14.7%**

    **Annual home expenses:**

    | Expense | Annual Amount | × 14.7% | Business Portion |
    |---|---|---|---|
    | Rent ($1,600/month) | $19,200 | 14.7% | $2,822 |
    | Heat and electricity | $1,440 | 14.7% | $212 |
    | Internet (split from phone bill) | $720 | 14.7% | $106 |
    | Maintenance and minor repairs | $360 | 14.7% | $53 |
    | **Total home office deduction** | | | **$3,193** |

    Ahmed also claims his phone at 80% business use: $1,320 annual × 80% = **$1,056**

    Combined deduction for home/phone: $3,193 + $1,056 = **$4,249**
    At Ahmed's 29.65% combined rate: $4,249 × 29.65% = **$1,260 in annual combined tax savings** from working from home.

### The Business-Use-of-Home Loss Restriction

**Critical rule:** The home office deduction **cannot create or increase a net business loss.** If the business has a net loss before the home office deduction — the home office deduction is zero for the year. The unused amount carries forward to the following year when there is sufficient business income to absorb it.

```
Net income before home office: $8,400
Home office deduction available: $4,200
Home office claimed: $4,200 ✅ (income remains positive at $4,200)

Net income before home office: $1,500
Home office deduction available: $4,200
Home office claimed: $1,500 ✅ (maximum — does not create a loss)
Carry-forward to next year: $2,700
```

---

## 8.7 Vehicle Expenses for Self-Employed — The Full Calculation

Vehicle expenses are often the largest single deduction for self-employed clients who travel for their business. The rules are similar to employees (Week 5) but there is no T2200 requirement — the business context replaces it.

### The Logbook — Mandatory

A logbook remains mandatory for all vehicle expense claims, whether employment-based or self-employment-based.

**Required logbook entries:**
- Odometer at January 1 (or start of vehicle use)
- Odometer at December 31
- For each business trip: date, starting point, destination, business purpose, kilometres
- Personal km (total km minus business km = personal km)

**The one-year representative sample rule (CRA):**
After one year of complete records, a driver can use a **3-month sample logbook** in subsequent years — if the sample period shows business use within 10% of the prior year's percentage. The sample must be documented and retained.

### Vehicle Expense Calculation

**Business-use percentage = Business km ÷ Total km**

| Eligible Vehicle Expenses | Notes |
|---|---|
| Fuel and oil | Business % applied |
| Insurance | Business % applied |
| Maintenance and repairs | Business % applied |
| Licence and registration | Business % applied |
| Lease payments | CRA maximum $950/month (2025) × business % |
| Interest on vehicle loan | CRA maximum $300/month (2025) × business % |
| Parking at business locations | Business % applied (but client site parking is 100% business) |
| **CCA (see below)** | Business % applied to allowed CCA |

### The CCA Class for Vehicles

| Vehicle Cost | CCA Class | Annual Rate | Notes |
|---|---|---|---|
| Vehicle cost **≤ $37,000** (2025 limit) | **Class 10** | **30%** | Pooled — all Class 10 vehicles together |
| Vehicle cost **> $37,000** (2025 limit) | **Class 10.1** | **30%** | Separate per vehicle — important distinction |

!!! warning "Class 10.1 vehicles are treated separately — and have special rules on disposal"
    When a Class 10.1 vehicle (over $37,000) is sold, there is **no terminal loss** allowed — even if the proceeds are below the remaining UCC. This is a significant difference from Class 10, where a terminal loss is deductible. The half-year rule also applies differently to Class 10.1 disposals.

    For most Ontario clients, the practical implication: the CCA deduction on a $62,000 SUV is calculated as if it cost $37,000 maximum. The portion above $37,000 generates no additional CCA.

!!! example "Case — Sandra's Consulting Vehicle (Complete CCA Calculation)"
    Sandra is a self-employed IT consultant. She bought a 2023 Honda CR-V in 2024 for $41,000. This puts her in Class 10.1 (cost exceeds $37,000 limit).

    **Class 10.1 treatment:**
    Maximum CCA base: $37,000 (not $41,000)
    Prior year CCA (Year 1, 2024): $37,000 × 30% × 50% (half-year rule) = $5,550
    Opening UCC for 2025: $37,000 − $5,550 = $31,450

    **2025 CCA:** $31,450 × 30% = $9,435 (full year — half-year rule only applies in year of acquisition)

    **Sandra's logbook:** 38,000 business km of 55,000 total = 69.1% business use

    **2025 vehicle CCA deduction:** $9,435 × 69.1% = **$6,519**

    **All other vehicle expenses (fuel, insurance, maintenance):**
    Total other vehicle costs: $10,200 × 69.1% = **$7,048**

    **Total vehicle deduction for Sandra's T2125: $6,519 + $7,048 = $13,567**

    At Sandra's 37.16% combined rate: $13,567 × 37.16% = **$5,042 in annual combined tax savings** from her vehicle — on a car she drives regardless.

---

## 8.8 Capital Cost Allowance (CCA) — Depreciation for Business Assets

When a self-employed person buys equipment, computers, furniture, or other long-lived assets for the business, the cost is NOT deducted as a current expense. Instead, it is deducted over multiple years through **Capital Cost Allowance (CCA)** — Canada's system of tax depreciation.

### Why CCA Instead of Immediate Expensing

CRA's logic: a laptop purchased for $2,400 will be used for several years. Deducting its full cost in year one would misstate the economics. CCA allocates the cost over the asset's useful life using declining-balance rates.

**Exception — Immediate Expensing (post-2021):**
The federal government introduced temporary immediate expensing for "eligible depreciable property" (most CCA classes except Class 1 and Class 10.1). For 2023 and 2024, CCPCs could expense up to $1.5M annually. Individual self-employed persons had a $100,000 immediate expensing limit for 2021 and 2022. These provisions may still apply in modified form — check the current year's budget confirmation for applicability.

For this course, we use standard CCA rules as the foundation.

### The Most Common CCA Classes

| Class | Rate | Asset Types |
|---|---|---|
| **Class 1** | **4%** | Buildings (commercial). Long life = slow depreciation |
| **Class 8** | **20%** | Furniture, fixtures, equipment, tools over $500, most machinery |
| **Class 10** | **30%** | Motor vehicles under $37,000 (2025 limit); taxis; car rentals |
| **Class 10.1** | **30%** | Passenger vehicles costing over $37,000 (separate per vehicle) |
| **Class 12** | **100%** | Small tools under $500, computer software, uniforms, dies, moulds |
| **Class 50** | **55%** | General-purpose computers, servers, laptops, tablets, smartphones |
| **Class 14** | SL over life | Patents, franchises with limited life |
| **Class 14.1** | **5%** | Goodwill, customer lists, franchises with unlimited life |

### The Half-Year Rule (First Year of Acquisition)

In the year an asset is purchased, only **50% of the normal CCA rate** applies — regardless of when during the year the asset was purchased.

**Year of purchase:** CCA = UCC × Rate × 50%
**All subsequent years:** CCA = UCC × Rate × 100%

**Why it exists:** The half-year rule prevents taxpayers from buying an asset December 31 and claiming a full year of CCA.

!!! example "Case — Class 8 Equipment (Office Furniture)"
    Patricia bought a home office desk and chair set for $1,800 (Class 8, 20% rate) in March 2025.

    **2025 CCA (first year, half-year rule):**
    $1,800 × 20% × 50% = **$180**

    **Opening UCC for 2026:** $1,800 − $180 = $1,620
    **2026 CCA:** $1,620 × 20% = **$324**

    The deduction grows in year 2 because the half-year rule no longer applies.

!!! example "Case — Class 50 Computer (The Fast One)"
    Ahmed bought a MacBook Pro for $2,800 for his design business in January 2025. It is Class 50 (55% rate).

    **2025 CCA (half-year rule):** $2,800 × 55% × 50% = **$770**
    UCC after 2025: $2,800 − $770 = **$2,030**

    **2026 CCA:** $2,030 × 55% = **$1,117**
    UCC after 2026: $2,030 − $1,117 = **$913**

    **2027 CCA:** $913 × 55% = **$502**

    By 2027, 85% of the computer's cost has been deducted — three years in. The declining balance method front-loads the deductions.

### Class 12 — 100% in the First Year

Class 12 includes tools, software (non-SaaS), and specific items costing under certain thresholds. The 100% rate PLUS the half-year rule = 50% in year 1, 100% of the balance in year 2 (which then fully deducts it).

**In practice:** Small tools under $500 and many software purchases can be treated as Class 12 — effectively a two-year write-off at 50%/50%.

**Or as current expenses:** Tools costing under $500 can often be expensed directly as current business expenses rather than going through CCA at all. The choice depends on whether the item is truly consumable or has lasting value.

### The CCA Limitation Rule — Cannot Exceed Business Income

CCA deductions **cannot create a business loss.** Unlike operating expenses (which can create a loss that carries forward or is deducted from other income), CCA is limited to the amount that brings net income to zero.

```
Net income before CCA: $12,400
Available CCA: $18,000
CCA claimed: $12,400 ✅ (limited — cannot create a loss)
UCC continues at the full rate next year
```

Unused CCA is NOT lost — the UCC remains in the class and generates future CCA when there is income to absorb it.

!!! question "Quick Check — CCA Calculation"
    Ahmed bought a laptop for his consulting business on March 1 for $2,400. It is a Class 10 asset (30% rate). This is his first year in business. What CCA can he claim?

    ??? answer
        Class 10 rate = 30%. However, in the **year of acquisition**, the half-year rule (50% rule) applies — CCA is limited to 50% of the normal claim.
        Normal CCA: $2,400 × 30% = $720
        Half-year rule: $720 × 50% = **$360 maximum CCA in Year 1**
        UCC at end of Year 1: $2,400 − $360 = **$2,040** (carries forward to future years)

        Note: if Ahmed's net business income before CCA is less than $360, the CCA claim is limited to net income (CCA cannot create a business loss). The unused amount stays in the UCC and is available in future profitable years.

---

## 8.9 CPP on Self-Employment — The Calculation Nobody Enjoys

Self-employed individuals must pay **both** the employer and employee portions of CPP — because they are both the employer and the employee.

### The CPP Rate Structure (2025)

| Component | Rate | Who Pays in Employment | Who Pays Self-Employed |
|---|---|---|---|
| Employee CPP | 5.95% | Employee | Self-employed person |
| Employer CPP | 5.95% | Employer | Self-employed person |
| **Total CPP on self-employment** | **11.9%** | Split between two parties | Same person pays both |
| CPP2 (enhanced) | 4.00% on income $71,300–$73,200 | Shared | Both halves |

### The CPP Self-Employment Calculation

```
Net self-employment income (from T2125)
  − Basic CPP exemption: $3,500
  = CPP base

CPP base × 11.9% = Total self-employment CPP

Deductible half: Total CPP × 50% → Line 22200 (deduction from net income)
Credit half: Total CPP × 50% → Line 31000 (non-refundable credit at 15%)
```

!!! example "Case — Patricia's Consulting CPP"
    Patricia's net business income from T2125: $72,000

    CPP base: $72,000 − $3,500 = $68,500
    But CPP is also subject to a maximum: the maximum pensionable earnings in 2025 is $71,300. So:
    CPP base: min($68,500, $71,300 − $3,500 = $67,800) = $67,800

    Total self-employment CPP: $67,800 × 11.9% = $8,068

    **However:** Maximum combined CPP (employee + employer equivalent) is 2 × $3,867 = $7,734 (2025 maximum).

    CPP is actually capped: $7,734 total self-employment CPP.

    **Deductible half: $7,734 ÷ 2 = $3,867 → Line 22200** (reduces Net Income)
    **Credit half: $3,867 × 15% = $580 → Line 31000** (federal credit)

    **The important point:** The deductible half goes ABOVE Line 23600 (reduces Net Income — improves benefit calculations). The credit half provides a tax reduction directly. This is the most financially efficient split of CPP between deduction and credit that the tax system allows.

### CPP on Multiple Income Streams

If a client has BOTH T4 employment income AND self-employment income:

- T4 employer already withheld employee CPP (Box 16) — credited as normal
- Self-employment CPP is calculated on Schedule 8 based on net self-employment income
- The combined CPP is subject to the overall maximum
- No double-paying: Schedule 8 automatically accounts for CPP already paid through the T4

---

## 8.10 GST/HST for Self-Employed — The Awareness Framework

### The $30,000 Registration Threshold

A self-employed person **must register for HST** when their total annual taxable revenues (not net income — gross revenues) exceed **$30,000 in any rolling 12-month period.**

This is measured on a **rolling 12-month basis** — not a calendar year. If a consultant earned $29,500 from January to November and another $1,000 in December — they crossed the $30,000 threshold in December and must register immediately.

**Exceptions — register from Day 1, no threshold:**
- Rideshare drivers (Uber, Lyft, etc.) — taxi service rule
- Directors of publicly traded corporations receiving fees

### What Happens When You Cross $30,000

1. You must **register for a Business Number (BN) with a GST/HST account** — apply online at canada.ca
2. From the date of registration, you **charge 13% HST** on all taxable supplies in Ontario
3. You file **HST returns** (quarterly for most new registrants, annually for small registrants)
4. You remit **net HST**: HST collected − **Input Tax Credits (ITCs)**

### Input Tax Credits — The Hidden Benefit of HST Registration

Once registered, you can claim **Input Tax Credits (ITCs)** — recovering the HST you paid on business expenses.

| Business Expense | HST Paid | ITC Recoverable |
|---|---|---|
| Office supplies ($500 + $65 HST) | $65 | **$65 recovered** |
| Business software subscription ($960 + $125 HST) | $125 | **$125 recovered** |
| Professional fees ($2,000 + $260 HST) | $260 | **$260 recovered** |
| Vehicle fuel ($3,800 + $494 HST, 70% business) | $346 business | **$346 recovered** |

**The practical value:** For a consultant spending $18,000/year on business expenses with HST: $18,000 × 13% × business-use portions ≈ **$2,340 in annual ITC recoveries.** This is real cash recovered that non-registered businesses simply lose.

!!! tip "Voluntary HST registration — should you register before reaching $30,000?"
    For clients approaching $30,000 who have significant business expenses: voluntary registration before the threshold allows early ITC recovery. The administrative cost (a quarterly return and the process of tracking HST separately) must be weighed against the ITC value. For clients spending heavily on taxable business inputs — early registration often makes financial sense.

### The Annual Filing Option for Small Registrants

HST registrants with annual taxable revenues under $1.5M can elect to file and remit **annually** (with the return due 3 months after the fiscal year-end for most registrants). This reduces administrative burden for small businesses significantly.

---

## 8.11 Fiscal Year Elections and the December 31 Reporting Requirement

Most self-employed individuals use a **December 31 fiscal year-end** — it aligns with the T1 tax year and simplifies reporting. However, the Income Tax Act technically allows individuals to elect a non-December-31 fiscal year.

### The December 31 Default

For simplicity and to avoid complications: always recommend December 31 unless there is a specific business reason for a different year-end.

If a client comes to you with a non-December-31 fiscal year already established, CRA has complex transitional rules that require the fiscal period income to be allocated to the calendar year — effectively requiring proration and creating additional work.

**For new clients starting a business:** Set up December 31 from day one. The complexity of any other year-end rarely justifies the benefit.

---

## 8.12 Hobby vs. Business — The Reasonable Expectation of Profit Test

CRA distinguishes between a **business** (profit-motivated commercial activity) and a **hobby** (personal pursuit that incidentally generates some income).

**The distinction matters enormously:**
- **Business:** All expenses deductible. Losses can offset other income.
- **Hobby:** Income is taxable. Expenses are NOT deductible beyond the income earned. Cannot create a loss.

### CRA's Factors for Determining Business vs. Hobby

| Factor | Points to Business | Points to Hobby |
|---|---|---|
| **Profit history** | Has made a profit in some years | Chronic losses year after year with no improvement |
| **Time commitment** | Significant regular hours committed | Occasional, when convenient |
| **Training and expertise** | Deliberately developed skills for commercial success | Personal interest drives the activity |
| **Business plan** | Written plan, specific goals | No plan, no goals |
| **Investment of capital** | Significant capital invested | Minimal investment |
| **Steps to improve profitability** | Changed approaches when unprofitable | Never changed strategy |
| **Nature of the activity** | Similar to profitable businesses in the same field | Primarily recreational |

!!! example "Case — Marco's Photography: Two Different Verdicts"
    **Version A — Hobby:**
    Marco is an engineer who shoots wildlife photography on weekends. He occasionally sells prints through a website, earning $2,400 in 2025. He spent $4,800 on new camera lenses and travel. He's never changed his approach despite losses every year for 4 years.

    **CRA's verdict:** Hobby. The $2,400 is taxable income. The $4,800 in expenses produces a net loss of $2,400 — which is **NOT deductible** against his engineering income. The expenses cannot exceed the income.

    **Version B — Business:**
    Marco shoots corporate events, headshots, and product photography. He has a website, client contracts, and invoices clients at market rates. He made $38,000 in 2024 but only $12,000 in 2025 (slow year after a major lens replacement). He has a plan to reach $50,000 by 2027 and is actively marketing.

    **CRA's verdict:** Business. The $12,000 − $14,000 in expenses = $2,000 net loss is deductible against Marco's other income. He has a reasonable expectation of profit even in a loss year.

### The Safe Harbour for Losses

CRA's administrative position: a business that has been unprofitable for three or more consecutive years faces increased scrutiny. After five or more consecutive years of losses — especially with no realistic path to profitability — CRA may reclassify the activity as a hobby retroactively.

**For clients with chronic losses:** Document the commercial rationale. Show changes made to improve profitability. If the activity is genuinely recreational — don't claim it as a business.

---

## 8.13 The Eight T2125 Audit Triggers

These patterns generate the most CRA reviews of self-employment returns.

### Trigger 1 — Gross Revenue Doesn't Match T4A Box 48

CRA auto-matches T4A Box 48 (gross fees) against T2125 gross income. Any discrepancy flags the return immediately. Ensure gross revenue reported = T4A Box 48 + any revenue not on T4A.

### Trigger 2 — Large Meal and Entertainment Claims

Meals over 5% of gross revenue typically trigger scrutiny. Documentation (receipts with names/dates/purpose) is essential. CRA has disallowed entire meal claims when documentation was inadequate.

### Trigger 3 — 100% Vehicle Business Use

Claiming 100% (or anything above 90%) vehicle business use is an immediate audit flag. Most people have some personal driving. Without a detailed logbook showing truly zero personal use, 100% claims are presumptively false. Claims above 80% require exceptionally clear logbook documentation.

### Trigger 4 — Chronic Consecutive Losses

Three or more consecutive years of net losses, especially on part-time or side activities. CRA may argue hobby classification retroactively.

### Trigger 5 — Home Office Exceeding 20% of Home

Home office deductions above 20% attract scrutiny unless the business genuinely uses that proportion of the home. A "home office" that comprises 35% of the home should correspond to 35% of the physical space measurably occupied for business.

### Trigger 6 — Personal Expenses Through Business Account

Mixing personal and business bank accounts — and then claiming personal expenses as business — is one of the most commonly detected frauds in small business audits. Always recommend a dedicated business bank account. Deposits that don't correspond to business revenue are immediately suspicious.

### Trigger 7 — Cash Business With Unreported Revenue

CRA uses "net worth assessments" for cash businesses — comparing the taxpayer's net worth growth, personal spending, and reported income. If someone reports $28,000 in income but has $80,000 in mortgage payments and living costs — the math doesn't work. CRA notices.

### Trigger 8 — Business Losses Used to Offset Employment Income for Multiple Years

A full-time employee who repeatedly shows a side business generating $30,000+ in losses that offset their $90,000 salary is a pattern CRA recognizes as a tax shelter. The business must have a genuine commercial purpose and reasonable expectation of profit.

!!! tip "In your tax software"
    **Software calculates automatically:**
    - Self-employment CPP (both halves) via Schedule 8 once net business income is entered
    - The deductible half of CPP flowing to Line 22200
    - HST/GST remittance is a separate CRA filing — software does not file HST returns

    **You must verify or enter manually:**
    - NAICS code — software requires it; choose the most accurate 6-digit code for the business type
    - CCA class for each asset — software applies the correct rate once you select the class, but class selection is your judgment call
    - Business-use percentage for home office and vehicle — software applies what you enter; you must verify supporting documentation exists
    - Whether multiple T2125s are needed — one per business activity; software allows multiple but does not create them automatically
    - Revenue recognition — software enters what you type; gross revenue vs. net-of-fees must be clarified with the client before entry

---

## 8.14 Ontario-Specific Self-Employment Considerations

### Ontario LIFT Credit — Self-Employed Are Excluded

The Ontario LIFT Credit eliminates Ontario tax for low-income workers with **employment income**. Self-employment income does not qualify.

A solo freelancer earning $22,000 in net self-employment income pays Ontario tax at the normal rate with no LIFT Credit relief. An employee earning the same $22,000 pays zero Ontario tax due to LIFT.

**Planning implication:** For clients who have a mix of T4 employment and self-employment income — the LIFT Credit applies only to the employment income portion. This affects the relative value of T4 income vs. self-employment income for lower-income Ontario workers.

### Ontario Surtax and Self-Employment Income

For self-employed clients with higher incomes (net income above $90,000–$100,000), the Ontario surtax applies. Every dollar of business deduction (including home office, vehicle, CCA) reduces Ontario basic tax — which may reduce or eliminate surtax tier exposure.

The marginal value of a deduction for a self-employed Ontario client at $105,000 net income is not just 37.16% (the combined rate) — it is effectively higher because the deduction also reduces the surtax obligation.

### Ontario and Quarterly Tax Instalments

Self-employed individuals whose combined federal and Ontario tax owing exceeds $3,000 in the current year AND either of the two prior years must pay quarterly tax instalments.

**Instalment due dates:** March 15, June 15, September 15, December 15.

**Advise every new self-employed client from the start:** *"In your first year, you won't owe instalments — you have no prior year history. But in your second year, based on this year's tax, CRA will likely send you an instalment schedule. Let's calculate the quarterly amount at year-end so you're not caught with a large April balance plus instalment interest."*

The instalment interest rate is the same as late-payment interest (~9% annual in 2025). Setting aside 30–33% of net self-employment income monthly into a separate tax savings account is the most practical advice you can give a new self-employed client.

---

## 8.15 Complete Case Studies — T2125 End to End

### Case A — The IT Consultant: Simple Service Business

**Client:** David Kim, 36, self-employed IT consultant in London, Ontario. Single. Employment income: $0 (full-time self-employed). Works from home.

**Documents:**
- Three T4A Box 48 slips: $28,400 + $18,600 + $9,200 = **$56,200 gross consulting income**
- One additional client paid $4,800 cash (no T4A issued)
- Home office: apartment 850 sq ft total, home office (spare bedroom dedicated) 110 sq ft = 12.9% business
- Monthly rent: $1,450 × 12 = $17,400. Utilities: $1,600/yr. Internet: $840/yr
- Cell phone: $1,320/yr (90% business use for client calls, Teams meetings)
- Professional liability insurance: $780/yr
- Software subscriptions (VS Code extensions, Figma, Jira): $1,460/yr
- MacBook Pro (new purchase Jan 2025): $3,200 (Class 50, 55%)
- USB hub and external monitor: $380 (Class 8, 20%)
- Professional development course: $1,100
- Prior year NOA RRSP room: $16,800

**Step 1 — Gross income:**

Total gross consulting revenue: $56,200 + $4,800 = **$61,000**

Note: The $4,800 cash income has no T4A — but CRA has the three T4As totalling $56,200. David must report all income. Filing only the T4A amounts leaves a $4,800 gap visible to anyone who reviews his bank deposits.

**Step 2 — Business expenses:**

| Expense | Calculation | Amount |
|---|---|---|
| Professional fees (insurance) | $780 × 100% | $780 |
| Software subscriptions | $1,460 × 100% | $1,460 |
| Cell phone | $1,320 × 90% | $1,188 |
| Professional development | $1,100 × 100% | $1,100 |
| **Home office** | ($17,400+$1,600+$840) × 12.9% | $2,562 |
| **Total operating expenses** | | **$7,090** |

**Step 3 — CCA:**

MacBook Pro (Class 50): $3,200 × 55% × 50% (half-year) = **$880**
Monitor and hub (Class 8): $380 × 20% × 50% (half-year) = **$38**
Total CCA: **$918**

**Step 4 — Net income from T2125:**

```
Gross revenue:              $61,000
− Operating expenses:       ($7,090)
− CCA:                        ($918)
═══════════════════════════════════
Net business income:        $52,992 → Line 13500
```

**Step 5 — CPP on self-employment:**
$52,992 − $3,500 = $49,492 × 11.9% = $5,890 (capped at $7,734 max — $5,890 is below max)
Deductible half: $5,890 ÷ 2 = **$2,945 → Line 22200**
Credit half: $2,945 × 15% = **$442 → Line 31000**

**Step 6 — Net income for benefits:**
$52,992 − $2,945 CPP deduction = **$50,047 net income**

David also contributes $10,000 to his RRSP:
**Net income: $50,047 − $10,000 = $40,047**

**Step 7 — Federal and Ontario tax (simplified):**

Federal tax on $40,047:
$40,047 × 15% = $6,007 gross. After BPA + CPP credits (~$3,600 total): ~$2,407 net federal.

Ontario tax on $40,047:
$40,047 × 5.05% = $2,022 gross. After Ontario BPA + credits (~$919 + CPP 5.05%): ~$930 net Ontario.
LIFT Credit: David has no T4 employment income → **LIFT Credit does not apply.**

**Combined tax: approximately $3,337**

**No quarterly instalments in Year 1** (no prior year history). In 2026, CRA will expect quarterly instalments based on 2025's $3,337 tax bill.

---

### Case B — Rachel's Product Business: Etsy Jewelry

From earlier in this week, Rachel's complete T2125:

**Gross revenue:** $42,800 (all Etsy sales)
**COGS:** $9,290 (from Section 8.4)
**Gross profit:** $33,510

**Operating expenses:**

| Expense | Amount |
|---|---|
| Etsy fees (6.5% + payment processing): $42,800 × 10% approximately | $4,280 |
| Shipping materials (boxes, tissue, ribbon) | $620 |
| Actual shipping costs | $2,840 |
| Home office (120 sq ft of 900 sq ft apartment = 13.3%): ($15,000 rent + $1,600 utilities + $720 internet) × 13.3% | $2,308 |
| Photography equipment (Class 8, $450 — under $500, claim as Class 12): $450 × 100% × 50% | $225 |
| Canva Pro subscription | $168 |
| Phone (60% business) $1,200 × 60% | $720 |
| **Total expenses** | **$11,161** |

**Net income: $33,510 − $11,161 = $22,349 → Line 13500**

**CPP on self-employment:**
$22,349 − $3,500 = $18,849 × 11.9% = $2,243
Deductible: $1,122 → Line 22200. Credit: $1,122 × 15% = $168 → Line 31000

**HST analysis:** Rachel's gross revenue was $42,800 — **exceeds $30,000.** She must be registered for HST. If she hasn't registered: immediate compliance obligation. Going forward, she adds 13% HST to Canadian sales and files HST returns, claiming ITCs on her business inputs.

---

### Case C — Sandra the Commission Consultant: Higher Complexity

**Client:** Sandra Patel, 44, management consultant. Incorporated? No — sole proprietor (for this example). Net consulting income from T2125: $148,000.

**CPP calculation:**
Maximum pensionable earnings 2025: $71,300
Less basic exemption: $3,500
Maximum CPP base: $67,800

Self-employment CPP: $67,800 × 11.9% = $8,068
Capped at 2 × $3,867 employee maximum = **$7,734**

Deductible half: $7,734 ÷ 2 = **$3,867 → Line 22200**
Credit half: $3,867 × 15% = **$580 → Line 31000**

**Sandra's tax picture:**
Net consulting income: $148,000
Less CPP deduction: ($3,867)
Less RRSP (max, $31,560): ($31,560)
**Net income: $112,573**

Federal tax: spans 15%, 20.5%, 26% brackets → approximately $22,000
Ontario tax: spans 5.05%, 9.15%, 11.16% brackets → approximately $11,000
**Ontario surtax:** Ontario basic tax well above $6,802 threshold → significant surtax
Combined estimated tax: approximately **$37,000**

**Planning insight:** Sandra should have been making quarterly instalments throughout 2025. By November, her expected annual tax bill was clear. If she hasn't set aside quarterly payments, she faces approximately $37,000 owing on April 30 — plus potential instalment interest on the shortfall from the prior year.

---

## 8.16 The Self-Employment Intake Checklist

Use this for every self-employed client before starting the T2125.

### Documents to Collect

- [ ] All T4A slips (Box 48 and any other boxes)
- [ ] Bank statements for business account (full year) — for revenue reconciliation
- [ ] Expense receipts organized by category
- [ ] Vehicle logbook (if claiming vehicle expenses)
- [ ] Home office dimensions and total home dimensions (or room count)
- [ ] Home lease or mortgage statement (for rent/interest amounts)
- [ ] Utility bills for the year
- [ ] CCA records from prior year (UCC balances by class)
- [ ] Prior year T2125 (for opening inventory and carryforward items)
- [ ] HST returns and remittance records (if registered)
- [ ] Equipment purchase receipts (for new CCA assets)

### Questions to Ask Every Self-Employed Client

1. "What was your total gross revenue — before any fees or deductions? Do your bank deposits match?"
2. "Did you receive any income not on a T4A slip? Cash clients, foreign clients, marketplace income not generating a slip?"
3. "Did your business involve selling physical products? What was your opening and closing inventory?"
4. "Do you work from home? What percentage of your home space is dedicated exclusively to business?"
5. "Did you use your vehicle for business? Do you have a logbook? What were your total and business km?"
6. "Did you purchase any equipment over $500 that you're still using?"
7. "Are you registered for HST? What was your gross revenue last year — were you near or above $30,000?"
8. "Did you hire any staff or contractors? Did you issue T4As to anyone you paid over $500?"
9. "Have you made quarterly tax instalments? What was your tax bill last year?"
10. "Did you have any start-up costs in year 1 that preceded your first revenue?"

---

## 8.17 Week 8 Summary

!!! success "What you learned this week"
    - **Self-employment determination:** The four-factor test — control, tools, financial risk, integration. T4A Box 48 always goes to T2125, never Line 10100
    - **T2125 structure:** Gross revenue → COGS (product businesses) → Gross profit → Operating expenses → Home office → CCA → **Net income → Line 13500/13700**
    - **Gross revenue rule:** Always report gross — never net deposits. Platform fees, payment processing, and commissions are deducted as expenses on the other side. T4A Box 48 amounts must match T2125 gross income
    - **COGS:** Opening inventory + purchases − closing inventory = COGS. Gross profit = Net revenue − COGS. Service businesses have no COGS
    - **Operating expenses:** Current and ordinary. The 50% meal rule (both employment and self-employment). Advertising, insurance, professional fees, supplies, interest — all at 100%. Salaries to arm's length employees deductible. Owner's own drawings are NOT deductible
    - **Home office:** Two tests — principally carried on (50%+ of time) OR exclusively and regularly for meeting clients. Self-employed can claim mortgage interest, property taxes, insurance (unlike employees). NEVER claim CCA on a principal residence home office — the PRE cost is too high
    - **CCA:** Declining-balance method by class. Half-year rule in year of acquisition. Most common classes: 50 (55% computers), 8 (20% equipment/furniture), 10/10.1 (30% vehicles), 12 (100% small tools/software), 1 (4% buildings). CCA cannot create a business loss
    - **CPP on self-employment:** 11.9% on net income above $3,500 basic exemption (capped at maximum). Deductible half (Line 22200) reduces Net Income. Credit half (Line 31000) is a 15% non-refundable credit
    - **HST:** Register when gross revenue exceeds $30,000 in any rolling 12-month period. Charge 13% Ontario HST. Claim Input Tax Credits on business expenses. Rideshare drivers register Day 1. Annual filing option for small registrants
    - **Hobby vs. business:** Reasonable expectation of profit test. Chronic losses without commercial rationale = hobby reclassification. Hobby income is taxable. Hobby expenses are NOT deductible beyond income
    - **Ontario LIFT Credit:** Requires employment income. Self-employment income alone does not qualify. Ontario surtax can make business deductions more valuable at higher income levels

---

## ✅ Week 8 Quiz

When you're ready, ask Claude: **"Quiz me on Week 8"** for an interactive test.

??? question "1. Ahmed's T4A shows Box 48 = $44,200 (consulting fees from three clients). He also received $6,800 in cash from two clients who didn't issue T4As. What is his gross revenue on the T2125, and what is the risk of reporting only $44,200?"
    **T2125 gross revenue: $44,200 + $6,800 = $51,000.** All income from all sources must be reported regardless of whether a T4A was issued. The $6,800 cash is taxable self-employment income. The risk of reporting only $44,200: CRA has the T4As on file showing $44,200. If they audit Ahmed's bank deposits, they will see $51,000 in consulting deposits. The $6,800 discrepancy is unexplained income — CRA will assess it plus gross negligence penalties if the omission appears deliberate. Additionally, Ahmed is missing $6,800 in declared income from which legitimate business expenses could be deducted — potentially overpaying tax on expenses incorrectly allocated.

??? question "2. Sandra is a self-employed management consultant who bought a laptop for $3,400 in June 2025 (Class 50, 55% rate). She also bought a standing desk for $890 in March 2025 (Class 8, 20% rate). Her net business income before CCA is $68,000. Calculate her 2025 CCA for each asset and her net income after CCA."
    **Laptop (Class 50):** $3,400 × 55% × 50% (half-year rule) = $935 CCA. **Desk (Class 8):** $890 × 20% × 50% (half-year rule) = $89 CCA. **Total CCA: $935 + $89 = $1,024.** Net income after CCA: $68,000 − $1,024 = **$66,976.** Opening UCC for 2026: Laptop: $3,400 − $935 = $2,465. Desk: $890 − $89 = $801. 2026 CCA (no half-year rule): Laptop: $2,465 × 55% = $1,356. Desk: $801 × 20% = $160. The deductions grow in year 2 because the half-year rule no longer applies.

??? question "3. Patricia is self-employed and earns $78,000 in net consulting income before CPP deductions. Calculate (a) her total self-employment CPP, (b) the deductible half going to Line 22200, (c) the credit half going to Line 31000, and (d) her net income after the CPP deduction."
    **CPP base:** $78,000 − $3,500 basic exemption = $74,500. Maximum pensionable earnings: $71,300 − $3,500 = $67,800 max base. So: min($74,500, $67,800) = $67,800. **Total self-employment CPP:** $67,800 × 11.9% = $8,068. Maximum total self-employment CPP (2 × $3,867 = $7,734). Since $8,068 > $7,734: **Total CPP = $7,734** (capped). **(b) Deductible half: $7,734 ÷ 2 = $3,867 → Line 22200.** **(c) Credit half: $3,867 × 15% = $580 → Line 31000.** **(d) Net income after CPP deduction: $78,000 − $3,867 = $74,133.** The CPP deduction reduces Net Income — which affects benefit calculations (CCB, OAS threshold, etc.). The credit reduces tax directly.

??? question "4. Kevin drives for Uber. His Uber annual summary shows gross fares collected: $54,000, Uber service fee (25%): $13,500, net deposited: $40,500. His T4A Box 48 shows $54,000. He has a vehicle logbook: 36,000 business km of 48,000 total km. Annual vehicle costs: gas $4,800, insurance $1,900, maintenance $740, CCA (Class 10, UCC $18,000): opening UCC used. Calculate (a) his T2125 gross revenue, (b) the correct vehicle business-use percentage, (c) his CCA, and (d) his estimated net income."
    **(a) Gross revenue: $54,000** — the T4A amount, not the net deposit. **(b) Business-use: 36,000 ÷ 48,000 = 75%.** **(c) CCA (Class 10):** $18,000 × 30% = $5,400 × 75% = $4,050. **(d) Net income:** Gross revenue $54,000. Expenses: Uber fee $13,500 + Gas ($4,800 × 75% = $3,600) + Insurance ($1,900 × 75% = $1,425) + Maintenance ($740 × 75% = $555) + CCA $4,050 = total expenses $23,130. **Net income: $54,000 − $23,130 = $30,870.** Note: Uber drivers must also be registered for HST from Day 1 — regardless of revenue. Kevin should have an HST account. The $54,000 gross fares include HST that Uber collects and remits on his behalf through their account, but Kevin needs his own registration to claim ITCs on his vehicle and other business expenses.

??? question "5. A client has operated a photography side business for 5 consecutive years, all producing losses: ($3,200), ($4,100), ($5,400), ($3,800), ($2,900). She also has $72,000 in T4 employment income each year. She asks you to claim the losses against her employment income again this year. What do you do?"
    Apply CRA's reasonable expectation of profit analysis. Five consecutive years of losses with no improvement signals a hobby reclassification risk. Before claiming the loss: (1) Ask specifically: *"Has anything changed in your photography business this year — new clients, new marketing, change in approach, new revenue model?"* (2) *"Do you have a documented business plan or specific actions you've taken to improve profitability?"* (3) *"What is your realistic path to profit — and in what year?"* If the client cannot articulate a genuine commercial path to profitability and has made no meaningful changes to improve results, CRA has grounds to reclassify all five years as a hobby and reassess all five years' losses (approximately $19,400 total × 29.65% ≈ $5,750 in additional tax plus interest and penalties going back 5 years). **Your professional obligation:** If you proceed with the claim, document your analysis thoroughly. If the client genuinely has a commercial path to profit, note it in your file. If it is genuinely a hobby, explain the risk clearly and let the client make an informed decision — with your recommendation documented.

??? question "6. Rachel is an Etsy seller who crossed $30,000 in gross sales last October. She never registered for HST. It is now February. What are her obligations, and what about the sales she made from October through December without charging HST?"
    Rachel was required to register for HST when her cumulative revenue crossed $30,000 in the rolling 12-month period — immediately upon crossing the threshold (within 29 days). She is approximately 4 months late in registering. **Obligations now:** Register immediately for a Business Number with HST account at canada.ca. Going forward, charge 13% Ontario HST on all taxable supplies. **Pre-registration sales (before she crossed $30,000):** These were made while she was a small supplier — no HST obligation retroactively on those sales. **Sales from October–December:** Made after the threshold was crossed but before registration. Rachel technically owed HST on these sales but failed to collect it. CRA may assess her for the HST that should have been collected — she is the deemed collector and the failure to charge doesn't eliminate the obligation. She may need to remit HST on the October–December sales from her own funds if she didn't collect it from buyers. **ITC benefit going forward:** Now that she's registered, she recovers all HST paid on business inputs (materials, platform fees where applicable, shipping supplies) through quarterly ITCs.

??? question "7. David's net business income (consulting) is $52,000 before the home office deduction. His home office calculation produces a $3,800 eligible deduction. His prior year's NOA shows a $1,200 business-use-of-home carry-forward from last year (when income was insufficient). What can he claim in 2025?"
    David's net income before home office: $52,000. Home office cannot create a business loss. Current year eligible home office: $3,800. Prior-year carry-forward: $1,200. **Total available:** $3,800 + $1,200 = $5,000. Maximum claimable (limited to net income): $52,000 is well above $5,000 — so **the full $5,000 can be claimed.** Net income after home office: $52,000 − $5,000 = $47,000 → Line 13500. The carry-forward from last year is consumed in the current year. This demonstrates the importance of tracking the business-use-of-home carry-forward on the NOA each year — missing it leaves $1,200 × marginal rate in unclaimed deductions. At 29.65% combined: **$355 in missed combined tax savings** for forgetting to check the prior-year carry-forward.

---

## 📚 Further Reading

- [CRA: T2125 — Statement of Business Activities (guide)](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t2125.html)
- [CRA: Business and professional income — Guide T4002](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4002.html)
- [CRA: Motor vehicle expenses for self-employed](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/business-expenses/motor-vehicle-expenses.html)
- [CRA: Business-use-of-home expenses](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/business-expenses/business-use-home-expenses.html)
- [CRA: Capital Cost Allowance — CCA classes and rates](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/report-business-income-expenses/claiming-capital-cost-allowance.html)
- [CRA: GST/HST for small businesses](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses.html)
- [CRA: Employee or self-employed? RC4110](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/rc4110.html)
- [CRA: Reasonable expectation of profit](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/report-business-income-expenses/claiming-capital-cost-allowance/claiming-business-investment-losses.html)

---

!!! tip "Up Next: Week 9"
    **Rental Income and the T776** — The complete landlord's return: rent calculation, repairs vs. capital improvements, CCA on rental buildings (and the strategic decision about whether to claim it), recapture when the property is sold, terminal loss, co-ownership scenarios, the change-in-use rules for renting out a former principal residence, and the basement-suite client who thinks their rental income doesn't need to be reported. Week 9 is the income type most often handled incorrectly by non-professional preparers.
