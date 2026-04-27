# Week 5: Employment Income — The T4 Decoded, Box by Box, Dollar by Dollar

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Read and interpret every box on a T4 slip with complete professional fluency
    - Distinguish taxable benefits from non-taxable ones — and handle each correctly
    - Handle every multiple-T4 scenario: two employers, mid-year job change, simultaneous jobs, CPP/EI over-contributions
    - Determine when employees can deduct work expenses — and when they cannot
    - Prepare Form T777 (employment expenses) with all eligible categories
    - Apply the home office rules for employees: detailed method vs. T2200S temporary flat rate
    - Handle commission salespeople's unique expense eligibility
    - Identify vehicle logbook requirements for employment use claims
    - Apply the Canada Employment Amount and understand what it does
    - Spot the seven T4-related errors that generate the most CRA reassessments
    - Understand the Ontario-specific employment income considerations that affect every provincial return

!!! warning "This is the most important income week in the course"
    Employment income appears on roughly 90% of all T1 returns you will ever prepare. Before you can handle capital gains, rental income, or self-employment, you must be flawless with the T4. Every error here — a wrong amount, a misclassified benefit, a missed Box 40 double-count — flows through the entire T1 and affects the final refund or balance for every client. Master this week. It will pay dividends on every return you file for the rest of your career.

---

## 5.1 What Is Employment Income and Why It Dominates

Employment income is income earned under a contract of service — where the worker works for an employer who controls the work, provides the tools, and bears the financial risk. This relationship is the most common economic arrangement in Canada and the one that generates the T4 slip.

CRA's definition of employment income is deliberately broad:

**Everything that goes into Box 14 (Employment Income) on the T4:**
- Base salary and wages
- Overtime pay
- Bonuses — signing bonuses, performance bonuses, retention bonuses
- Vacation pay — including amounts paid on termination
- Commissions and incentive pay (if received as an employee — self-employed commissions are different)
- Director's fees from a corporation
- Tips and gratuities reported through payroll
- Value of all **taxable benefits** received from the employer
- Employer-paid group insurance premiums (in certain circumstances)
- Amounts received under a sick leave plan
- Strike pay (in certain circumstances)

The breadth of Box 14 is the reason the Box 40/Box 14 double-counting error is so damaging — because clients often see Box 14 as "salary" and Box 40 as "benefits" and assume they need to add both. They don't. Box 40 is already inside Box 14.

### The T4 Issuance Rules

| Circumstance | T4 Required? |
|---|---|
| Employee paid **over $500** in the year | ✅ Yes |
| Employee paid **any amount** but CPP, EI, or income tax was deducted | ✅ Yes |
| Casual worker paid $350 with no deductions | ❌ No (under $500, no deductions) |
| Owner-manager who paid themselves | ✅ Yes — the corporation must issue a T4 |

**Deadline:** Employers must provide T4s to employees and file them with CRA by **February 28** of the following year.

```
T4 BOX → T1 RETURN ROUTING MAP
═══════════════════════════════════════════════════════════════
Box 14  (Employment Income)    ──────────→  Line 10100  (income)
Box 22  (Income Tax Deducted)  ──────────→  Line 43700  (already paid)
Box 16  (CPP contributions)    ──────────→  Schedule 8 → credit at 15%
Box 18  (EI premiums)          ──────────→  Line 31200  → credit at 15%
Box 20  (RPP contributions)    ──────────→  Line 20700  (deduction)
Box 44  (Union dues)           ──────────→  Line 21200  (deduction)
Box 52  (Pension Adjustment)   ──────────→  Line 20600  (info only — no tax effect)
Box 40  (Taxable benefits)     ──────────→  NOWHERE — already inside Box 14
═══════════════════════════════════════════════════════════════
```

---

## 5.2 The Complete T4 Field Guide — Every Box That Matters

The T4 has dozens of boxes. Most will be blank on a typical return. Here is the complete professional reference — every box, what it means, and exactly where it goes.

### Core Boxes — Present on Almost Every T4

| Box | Label | Goes To | Critical Notes |
|---|---|---|---|
| **14** | Employment income | **Line 10100** | Total of salary + all taxable benefits. This is the only Box that creates employment income on the T1 |
| **16** | Employee's CPP contributions | **Schedule 8 / Line 30800 credit** | The employee's share. Max 2025: $3,867. Credit at 15% |
| **16A** | Employee's CPP2 contributions | **Schedule 8 / Line 30800 credit** | Enhanced CPP2. Max 2025: $188. Deductible separately |
| **17** | Employee's QPP contributions | Schedule 8 | Quebec only — rare in Ontario practice |
| **18** | Employee's EI premiums | **Line 31200 credit** | Max 2025: $1,049. Credit at 15% |
| **20** | RPP contributions | **Line 20700 (deduction)** | Employee contributions to a Registered Pension Plan — reduces net income |
| **22** | Income tax deducted | **Line 43700** | Total tax already paid. This is the number used to calculate refund or balance |
| **24** | EI insurable earnings | Reference only | For verifying Box 18 |
| **26** | CPP/QPP pensionable earnings | Reference only | For verifying Box 16 |
| **44** | Union dues | **Line 21200 (deduction)** | Professional dues also go here — if required for employment |
| **46** | Charitable donations | **Schedule 9** | Employer-collected donations — add to client's own receipts |
| **52** | Pension adjustment (PA) | **Line 20600** | Reduces client's future RRSP contribution room. The PA is not income and does not reduce current-year income — it only records that next year's RRSP room will be smaller |
| **55** | Employee's PPIP premiums | Quebec only | |
| **85** | Employee-paid health premiums | **Medical expense potential** | The portion the employee paid (not reimbursed by employer) may be claimable as a medical expense |

### Benefit Boxes — Amounts Already Inside Box 14

!!! danger "NEVER add these boxes to Line 10100 — they are already inside Box 14"
    Boxes 30 through 84 report specific taxable benefits. Every single one of these amounts has already been calculated by the employer, added to the employee's salary, and reported in Box 14. They appear here so that CRA and the preparer can identify specific credits or deductions that may apply.

    Adding any benefit box amount to Box 14 is a **double-counting error** that overstates income and generates excess tax. It is one of the most common new-preparer mistakes.

| Box | Benefit Reported | Action Beyond Box 14 |
|---|---|---|
| **30** | Board and lodging | None — informational only |
| **31** | Special work site / remote work location | None |
| **32** | Travel in a prescribed zone | May support **Northern Residents Deduction** if client qualifies |
| **33** | Medical travel assistance | None |
| **34** | Personal use of employer's vehicle (standby charge) | None beyond Box 14 |
| **35** | Other benefits (misc employer-provided) | None |
| **36** | Interest-free or low-interest loans | None |
| **38** | Security options benefits | Can create a **Schedule 3 event** — complex. Flag for senior review |
| **39** | Security options deductions | **Line 24900** — deduction available in specific circumstances |
| **40** | Other taxable allowances and benefits | **Already in Box 14.** Identify for client education only |
| **41** | Security options deductions 50% | Line 24900 — complex |
| **42** | Employment commissions (separate from salary) | Informational — already in Box 14. Signals possible T777 expense eligibility |
| **43** | Canadian Forces personnel and police | Specific deduction eligibility |
| **67** | Eligible retiring allowance | **Line 13000** or RRSP eligible rollover — important for severance situations |
| **68** | Non-eligible retiring allowance | **Line 13000** — fully taxable |
| **77** | Workforce reduction — critical illness | Specific treatment |
| **85** | Employee-paid premiums for private health | May be claimable as medical expenses |
| **87** | Emergency services volunteer | Specific exemption for first $1,000 |

### The Box 40 Deep Dive — The Most Commonly Mishandled Box

!!! example "Case — What Box 40 Actually Looks Like"
    Patricia's T4:
    - Box 14: $94,000
    - Box 40: $9,200 (representing: company car personal use benefit $6,400 + employer-paid group life insurance premium $800 + parking at office $2,000)

    **What a new preparer often does:** Enters $94,000 + $9,200 = $103,200 on Line 10100.

    **What is correct:** Enters **$94,000 on Line 10100.** Done.

    The $9,200 in benefits is already inside the $94,000. Patricia's employer calculated each benefit value, added it to her $84,800 base salary, and reported $94,000 in Box 14.

    **The error creates:** $9,200 × Patricia's combined marginal rate (~37.16%) = **$3,419 in excess tax** paid on income that doesn't exist.

    **Additional nuance on parking ($2,000):** If the parking was at Patricia's employer's place of business, it is taxable (correctly in Box 40/14). If it was at a hospital where Patricia is a patient receiving care — different analysis. If it was at a transit station (commuter parking) — a specific exemption may apply. The nature of the benefit determines taxability. The preparer's job is to understand the benefit, not just copy the box.

---

## 5.3 Taxable vs. Non-Taxable Benefits — The Analysis Every Preparer Needs

Not every benefit an employer provides is taxable. Understanding which are taxable (and already in Box 14) and which are non-taxable (legitimately not reported anywhere) is essential for advising clients and catching errors.

### The General Rule

A benefit is taxable when the employee receives an **economic advantage** — something of personal value — from the employment relationship.

CRA's test: *"Does the benefit primarily serve the employee's personal interest, or the employer's business interest?"*

- Employee flies business class to a client meeting: employer's interest = **non-taxable**
- Employee uses the company jet for a personal vacation: personal interest = **taxable**
- Employer provides coffee and donuts at the office: de minimis, employer's interest = **non-taxable**
- Employer gives an employee a $500 cash holiday bonus: personal economic advantage = **taxable**

### Common Taxable Benefits (In Box 14 and Box 40)

| Benefit | Taxable? | Amount |
|---|---|---|
| **Personal use of employer vehicle** | ✅ Taxable | Standby charge formula + operating benefit |
| **Group life insurance premiums paid by employer** | ✅ Taxable | Employer's premium cost |
| **Employer RRSP contributions** | ✅ Taxable | Amount contributed (Box 52 reduces future room) |
| **Gifts over $500/year** | ✅ Taxable | Total value over $500 |
| **Cash bonuses** | ✅ Taxable | Full amount |
| **Interest-free employer loans** | ✅ Taxable | Imputed interest benefit |
| **Personal meals on employer** | ✅ Taxable (50% rule for employer) | Employer's cost |
| **Employer-paid personal travel** | ✅ Taxable | Full cost |
| **Parking at work (personal commuting)** | ✅ Taxable | FMV of parking |

### Common Non-Taxable Benefits (Legitimately Not in Box 14)

| Benefit | Non-Taxable? | Why |
|---|---|---|
| **Business travel expenses reimbursed** | ✅ Non-taxable | Reimbursement for employer expense |
| **Uniform or protective clothing** | ✅ Non-taxable | Business necessity, not personal use |
| **Training and professional development** | ✅ Non-taxable | Benefits the business |
| **Employee discounts on employer's products** | ✅ Non-taxable if reasonable | Not an excessive economic advantage |
| **Subsidized meals in employer cafeteria** | ✅ Non-taxable if employee pays at least cost | De minimis |
| **Group health and dental plan** | ✅ Non-taxable (premiums) | CRA provides this exemption |
| **Private health services plan (employer-paid)** | ✅ Non-taxable | Specific CRA policy |
| **Reasonable per-kilometre automobile allowance** | ✅ Non-taxable if reasonable rate | Up to CRA's prescribed rate |
| **First $1,000 of volunteer emergency services pay** | ✅ Non-taxable | Specific legislative exemption |
| **Gifts under $500 total per year (non-cash)** | ✅ Non-taxable | CRA administrative policy |

!!! example "Case — The Vehicle Benefit That Confused Everyone"
    James works as a regional sales manager. His employer provides a company car. James uses it for business travel (75% of total km) and personal trips (25%).

    **What the employer does:**
    Calculates the **standby charge** = 2% of original cost × number of months available = 2% × $42,000 × 12 = $10,080 per year
    **Operating benefit** = personal km × $0.33/km (2025 CRA rate) = personal km × $0.33

    **What appears on James's T4:**
    Box 14 includes both the standby charge and operating benefit amounts.
    Box 34 reports the personal vehicle use benefit (same amount — informational only).

    **James's reaction:** "My T4 is $28,000 higher than my actual salary. That's not right."

    **Your explanation:** *"The $28,000 includes the value of having the company car available to you — which CRA taxes as a benefit. The formula is based on the car's cost, not its actual value to you. Box 34 tells us the breakdown. All of it is already in Box 14. We don't add anything extra — it's already there."*

    **James's planning question:** "Can I reduce this benefit?"

    **Your answer:** If James kept a logbook showing his business-use percentage, the employer can use the "reduced standby charge" formula — which lowers the taxable benefit proportionally. James needs a detailed logbook. If he has one and the employer uses it, his T4 should already reflect the reduced standby charge. If not — the opportunity exists for future years.

!!! question "Quick Check — Taxable vs. Non-Taxable Benefits"
    Patricia's employer provides: (1) a $400 non-cash gift card for her work anniversary, (2) reimbursement for her business travel to a client site, (3) employer-paid group dental premiums, (4) free parking at the office. Which are taxable benefits that should appear in Box 14/40?

    ??? answer
        **Taxable (in Box 14/40):**
        - $400 gift card — non-cash gifts are non-taxable only up to $500/year total; at $400 this is under the limit, so actually **non-taxable** if it's the only gift
        - Free parking at the office — personal commuting benefit, **taxable** (FMV of parking spot)

        **Non-taxable (not in Box 14):**
        - Business travel reimbursement — employer expense, not a personal benefit
        - Group dental premiums — specifically exempt under CRA policy

        **Correction on the gift card:** If Patricia also received other non-cash gifts totalling over $500 for the year, the excess is taxable. Under $500 total — exempt. The parking is the clearest taxable benefit here.

---

## 5.4 The Canada Employment Amount — The Universal Employee Credit

Every employee who reports employment income on Line 10100 is entitled to the **Canada Employment Amount** — a non-refundable tax credit designed to recognize work-related expenses that employees incur but can't specifically claim.

**2025 Canada Employment Amount:** $1,433
**Federal credit:** $1,433 × 15% = **$215**
**Ontario equivalent:** $1,433 × 5.05% = **$72**
**Combined credit:** **$287**

This is applied automatically to every return with Line 10100 employment income. It is calculated on Schedule 1 and ON428 without any action by the client. But knowing it exists is important for explaining why a client's tax bill is lower than the raw bracket calculation suggests.

---

## 5.5 Multiple T4 Situations — The Technical Issues That Create Confusion

Multiple T4 scenarios are among the most common — and the most technically important — situations you will encounter.

### Scenario 1 — Two Employers Sequentially (Job Change)

**Client:** Sarah left her accounting firm in June and started at a bank in July.

**T4 #1 (firm, Jan–June):** Box 14 = $38,000, Box 16 = $2,060, Box 18 = $631, Box 22 = $7,800
**T4 #2 (bank, Jul–Dec):** Box 14 = $44,000, Box 16 = $2,550, Box 18 = $730, Box 22 = $9,400

**What you enter:**
- Line 10100: $38,000 + $44,000 = **$82,000** (add all Box 14 amounts)
- Line 43700: $7,800 + $9,400 = **$17,200** (add all Box 22 amounts)

**The CPP over-contribution analysis:**
Combined CPP: $2,060 + $2,550 = **$4,610**
Maximum CPP (2025): **$3,867**
Over-contribution: $4,610 − $3,867 = **$743 → Line 44800 (credit)**

**The EI over-contribution analysis:**
Combined EI: $631 + $730 = **$1,361**
Maximum EI (2025): **$1,049**
Over-contribution: $1,361 − $1,049 = **$312 → Line 45000 (credit)**

**Total over-contribution refund: $743 + $312 = $1,055**

Each employer withheld CPP and EI independently, as if Sarah would work there for the full year. The T1 corrects this automatically. Sarah receives $1,055 back that she didn't know was coming.

### Scenario 2 — Two Employers Simultaneously

**Client:** Kevin works full-time at one employer and part-time at a second employer.

**T4 #1 (full-time):** Box 14 = $62,000, Box 16 = $3,680, Box 18 = $1,029, Box 22 = $14,000
**T4 #2 (part-time):** Box 14 = $18,000, Box 16 = $867, Box 18 = $299, Box 22 = $3,400

**CPP over-contribution:**
Combined: $3,680 + $867 = **$4,547**. Max: $3,867. Over: **$680 refunded.**

**EI over-contribution:**
Combined: $1,029 + $299 = **$1,328**. Max: $1,049. Over: **$279 refunded.**

**Important additional issue — combined income and withholding adequacy:**
Kevin's combined Box 14 income = $80,000. His combined withholding = $17,400.

At $80,000 combined income, his actual tax is approximately:
Federal: ~$11,100. Ontario: ~$4,400. Combined: ~$15,500.
Withholding was $17,400 — **over-withheld by approximately $1,900 + $959 over-contributions = $2,859 refund.**

However: if Kevin's combined income crosses a higher bracket than either employer knew about, the withholding may be insufficient. Employer 1 knew about $62,000. Employer 2 knew about $18,000. If combined rates are higher than each employer estimated separately — possible balance. **Always calculate the combined picture before assuming refund.**

### Scenario 3 — Retiring Allowance (Box 67/68)

**Client:** Daniel was terminated and received $45,000 in severance.

**T4 Box 67 (Eligible retiring allowance):** $22,000
**T4 Box 68 (Non-eligible retiring allowance):** $23,000

**Treatment:**

**Box 67 (Eligible):** May be transferred directly to RRSP **without using RRSP contribution room** — up to $2,000 per year of pre-1996 service. This is a vanishing benefit as most employees no longer have pre-1996 service. If the client has pre-1996 service, the eligible amount can be transferred. If no pre-1996 service — the eligible amount must still be included in income at Line 13000 (fully taxable).

**Box 68 (Non-eligible):** Fully taxable at Line 13000. No RRSP contribution room bypass. Client can still contribute to RRSP from this amount — but it uses available RRSP room.

!!! tip "Severance and RRSP — a planning opportunity often missed"
    Regardless of Box 67/68 treatment, a client who receives a large severance payment in a year they have substantial RRSP room should maximize their RRSP contribution before April 30 (or March 1 of the following year). The high severance income pushes them into a higher bracket — making the RRSP deduction worth more. A $25,000 RRSP contribution in a year with $65,000 in severance income (combined $75,000 total income) saves $25,000 × 29.65% = **$7,413 in combined tax**.

---

## 5.6 When Employees Can Deduct Work Expenses — The T777 Framework

Most employees cannot deduct work expenses. The Canadian tax system is fundamentally different from the self-employment model in this regard. To claim employment expenses, **two conditions must both be met:**

**Condition 1:** The expense must be a type that CRA permits employees to claim (a specific legislative category).

**Condition 2:** The employer must certify that the employee was required to pay those expenses as a condition of employment — by signing **Form T2200 (Declaration of Conditions of Employment)**.

Without a signed T2200 from the employer, the T777 claim does not proceed. Full stop.

### The T2200 — Your Gatekeeper

The T2200 is a form the **employer** fills out and signs. It confirms:
- What expenses the employee was required to pay
- Whether the employee worked away from the employer's establishment
- Whether the employee received an allowance (and if it was included in income)
- Whether the employee performed their duties partly or fully at home

**Your role:** The T2200 must be in your possession or the client's possession before you claim any T777 expenses. CRA may request it. You don't submit it with the return — but it must exist.

**Common mistake:** Preparing a T777 claim based on the client's description of their expenses without confirming they have a signed T2200. If CRA asks and no T2200 exists — the claim is denied. Possible penalties.

### Form T777 — What Can Be Deducted

Employees who have a signed T2200 may claim employment expenses under **Form T777 (Statement of Employment Expenses)**. The eligible expenses depend on the type of employee.

#### General Employees

| Expense Category | Deductible? | Conditions |
|---|---|---|
| **Motor vehicle expenses** | ✅ Yes | Required to use own vehicle for employment duties; logbook required |
| **Travel expenses (accommodation, meals at 50%)** | ✅ Yes | Required to travel for employment duties |
| **Parking while working away from office** | ✅ Yes | Business parking only — not commuting |
| **Home office (detailed method)** | ✅ Yes | See Section 5.7 below |
| **Professional supplies and tools** | ✅ Yes | Must be ordinary and necessary for the work |
| **Accounting fees** | ❌ No | Not a deductible employment expense |
| **Cell phone (business portion)** | ✅ Yes | If required for employment — proportion |
| **Home internet (business portion)** | ✅ Yes (post-2020) | If required for home office use |
| **Personal protective equipment** | ✅ Yes | If required and not provided |
| **Tradesperson's tools** | ✅ Yes | Special rules — excess above $1,368 (2025) |

#### Commission Employees

Commission employees (Box 42 on the T4, or any employee paid partly by commission) have access to **broader expense categories** than general employees:

| Additional Category | Available to Commission Employees Only |
|---|---|
| **Advertising and promotion** | ✅ Yes — to help earn commission income |
| **Entertainment expenses (50%)** | ✅ Yes — to help earn commission income |
| **Meals with clients (50%)** | ✅ Yes |
| **Office rent (if maintaining own office)** | ✅ Yes |

Commission employees can claim all general employee expenses **plus** these additional categories — making their T777 potentially much larger.

!!! example "Case — Michael the Commission Salesperson"
    Michael sells medical equipment. He is an employee (gets a T4). His Box 42 shows $180,000 in commissions. He has a T2200 signed by his employer.

    **His T777 expenses:**

    | Expense | Annual Amount | Deductible | Amount |
    |---|---|---|---|
    | Car: 38,000 business km of 55,000 total = 69.1% | | | |
    | — Gas | $6,400 | 69.1% | $4,422 |
    | — Insurance | $2,200 | 69.1% | $1,520 |
    | — Oil changes, maintenance | $980 | 69.1% | $677 |
    | — CCA (Class 10, 30%, UCC $28,000) | $8,400 CCA | 69.1% | $5,804 |
    | Home office (20% of home — see 5.7) | $4,200 | — | $4,200 |
    | Cell phone (80% business) | $1,440 × 80% | — | $1,152 |
    | Client meals and entertainment (50%) | $4,800 × 50% | — | $2,400 |
    | Advertising (sample materials, brochures) | $1,600 | — | $1,600 |
    | **Total T777 deductions** | | | **$21,775** |

    Michael's $21,775 in T777 deductions reduces his employment income from Line 10100 to an effective net employment income. At his combined 43.41% rate (income above $150,000):

    Tax saving: $21,775 × 43.41% = **$9,451 in combined tax** — from documented, legitimate employment expenses the prior preparer never asked about.

    *Note: T777 deductions flow to Line 22900 (Other employment expenses) on the T1 — they reduce employment income directly.*

---

## 5.7 Home Office for Employees — Detailed Method vs. T2200S

Post-2020, CRA created a simplified temporary flat rate method for home office claims. Whether the flat rate or detailed method applies depends on the year and the client's situation.

### The Detailed Method (T777 / T2200)

For **any tax year** — the traditional detailed method requires:

1. A signed T2200 from the employer confirming the employee is required to work from home
2. The workspace must be where the employee **principally performs** their employment duties (more than 50% of the time) OR the space must be used **exclusively and regularly** for meeting clients
3. Eligible expenses are pro-rated by the business-use percentage of the home

**Eligible expenses under the detailed method:**

| Expense | Commission Employee | Non-Commission Employee |
|---|---|---|
| Rent | ✅ Yes | ✅ Yes |
| Heat, electricity, water | ✅ Yes | ✅ Yes |
| Home internet | ✅ Yes | ✅ Yes |
| Maintenance and minor repairs | ✅ Yes | ✅ Yes |
| Office supplies (pens, paper, toner) | ✅ Yes | ✅ Yes |
| Rent for furniture used in workspace | ✅ Yes | ✅ Yes |
| Property taxes | ✅ Yes | ❌ No |
| Mortgage interest | ✅ Yes | ❌ No |
| Home insurance | ✅ Yes | ❌ No |
| Capital cost allowance (depreciation) | ✅ Yes | ❌ No |

!!! warning "Non-commission employees cannot claim mortgage interest, property taxes, or home insurance"
    This surprises many clients who work from home. CRA's logic: these costs relate to homeownership, not employment. Commission employees are treated more like self-employed individuals and get broader eligibility. Non-commission employees get only the "consumption" costs (heat, electricity, maintenance, rent if applicable).

    **CCA warning for homeowners:** Even commission employees who are eligible to claim CCA on the home office portion should generally NOT do so. Claiming CCA on a home removes the portion from the Principal Residence Exemption — potentially triggering capital gains on that portion when the home is sold. Advise homeowners to skip the CCA claim. The tax saving now is typically much smaller than the PRE cost later.

**The calculation:**

```
Business-use percentage of home = 
    Area of work space ÷ Total area of home
    
    OR

    Number of rooms used for work ÷ Total number of rooms
    (use whichever is more favourable and defensible)
    
Eligible home expenses × business-use % = Home office deduction
```

**The limitation rule:** Home office expenses **cannot create or increase a loss from employment.** If the employee's employment income is $0 or the expenses exceed employment income — the unused amount carries forward to the following year when there is sufficient employment income.

!!! example "Case — Sandra's Home Office Calculation"
    Sandra works from home 4 days per week as a remote project manager. Her employer signed her T2200. She rents a 3-bedroom apartment in Toronto — 1,200 sq ft total. Her dedicated home office is a spare bedroom: 150 sq ft.

    **Business-use percentage:** 150 ÷ 1,200 = **12.5%**

    **Annual home expenses:**
    - Rent: $2,400/month × 12 = $28,800
    - Utilities (heat, electricity): $1,800/year
    - Internet (required for work): $960/year
    - Maintenance (minor, annual): $400/year
    - **Total eligible expenses: $31,960**

    **Home office deduction:** $31,960 × 12.5% = **$3,995**

    Sandra also has a cell phone at $1,440/year. 80% business use = $1,152 additional.

    **Total T777 deduction: $3,995 + $1,152 = $5,147**

    At Sandra's combined 29.65% rate: $5,147 × 29.65% = **$1,526 in annual combined tax saved.**

    Sandra has been working from home for three years and never claimed this. Her prior returns didn't include a T777. She never knew it was available.

    **Three years of T1-ADJ opportunity:** $5,147 × 3 years = $15,441 in unclaimed deductions × 29.65% ≈ **$4,578 in recoverable combined tax** through amendments.

    This is why reviewing prior returns for new clients is not optional — it is professional value creation.

### The T2200S / Temporary Flat Rate (COVID-Era Provision)

For the 2020, 2021, and 2022 tax years, CRA introduced a simplified temporary flat rate method ($2/day worked from home, max $500/year) that did not require a T2200. This provision was not extended to 2023 and beyond. For current returns (2023+), the **detailed method with a signed T2200 is the only available approach** for employees.

---

## 5.8 Vehicle Expenses for Employees — Logbook Rules and Calculations

When an employee uses their own vehicle for employment duties (not commuting — that's personal), they can claim vehicle expenses on T777 with a T2200.

### What Qualifies vs. What Doesn't

| Driving | Business or Personal? |
|---|---|
| Driving to client meetings from the office | ✅ Business |
| Driving from home to first client/job site | Context-dependent — see below |
| Driving from last client back home | Context-dependent |
| Commuting from home to the office | ❌ Personal — always |
| Driving to pick up office supplies for employer | ✅ Business |
| Personal errands during work hours | ❌ Personal |
| Driving between two job locations | ✅ Business |

**The "first and last trip" analysis:**
CRA has held that if an employee's home is their **principal place of business** (true for many home-based workers), the drive from home to a client site qualifies as business. If the employer's office is the principal place of business, the drive from home to the office is personal commuting.

### The Logbook — Mandatory for Vehicle Claims

A logbook is not optional. CRA requires it for vehicle expense claims.

**What a logbook must contain:**
- Odometer reading at the **start of the year** (or date vehicle was acquired)
- Odometer reading at the **end of the year**
- For each business trip: date, destination, purpose, kilometres
- Personal km (total km minus business km = personal km, or directly logged personal trips)

**The CRA simplified logbook method:**
After maintaining a full logbook for one representative year, CRA allows a simplified method using a **three-month sample logbook** in subsequent years. The sample must be within 10% of the full-year business percentage to remain valid.

**CRA's digital logbook acceptance:**
Apps like MileIQ, TripLog, and similar GPS tracking apps are acceptable as logbooks if they record the required information. The Uber/rideshare app is not sufficient alone — it captures only on-trip km, not deadhead km or the drive to start the first trip.

### The Vehicle Calculation

```
Business-use percentage = Business km ÷ Total km for the year

Vehicle expenses eligible for deduction:
    × Gas
    × Oil changes and maintenance
    × Insurance
    × Licence and registration
    × Interest on vehicle loan (max $300/month per CRA 2025)
    × Lease payments (max $950/month per CRA 2025 prescribed limit)
    × CCA (Class 10 — 30% rate; Class 10.1 for vehicles over $37,000 limit — treated separately)

Each expense × business-use % = Deductible amount
```

!!! example "Case — Kevin's Vehicle Claim"
    Kevin is a territory sales representative. His T2200 confirms he is required to use his vehicle for employment. His logbook shows:
    - Total km for year: 48,000
    - Business km: 32,000 (client visits, territory coverage)
    - Personal km: 16,000

    **Business-use percentage:** 32,000 ÷ 48,000 = **66.7%**

    **Vehicle expenses:**

    | Expense | Annual Amount | × 66.7% | Deductible |
    |---|---|---|---|
    | Gas | $5,600 | 66.7% | $3,735 |
    | Insurance | $1,800 | 66.7% | $1,201 |
    | Maintenance | $1,100 | 66.7% | $733 |
    | Interest on loan ($280/month × 12) | $3,360 | 66.7% | $2,241 |
    | Licence and registration | $220 | 66.7% | $147 |
    | CCA (Class 10.1, 30%×50% half-year if first year; 30% ongoing): $28,000 UCC → $28,000 × 30% = $8,400 | $8,400 | 66.7% | $5,603 |
    | **Total vehicle deduction** | | | **$13,660** |

    At Kevin's 29.65% combined rate: $13,660 × 29.65% = **$4,050 in combined tax saved** — from a vehicle he drives regardless. The logbook converts his ordinary driving into a documented deduction.

---

## 5.9 The Seven T4-Related Errors That Generate CRA Reassessments

These are the errors professional preparers must actively prevent. Build checks for all seven into your standard review process.

### Error 1 — Box 40 Added to Box 14

**What happens:** Box 40 benefit amounts are double-counted.
**CRA detects it:** Automated slip matching. T4 Box 14 differs from Line 10100 on the return.
**Tax cost:** $[benefit] × combined marginal rate in unnecessary tax.
**Prevention:** Box 40 is already inside Box 14. Never enter it anywhere on the return.

### Error 2 — CPP/EI Credits Calculated on Total Withheld Rather Than Maximum

**What happens:** With two T4s, preparer calculates CPP credit on the full $5,200 withheld rather than the $3,867 maximum. Client gets extra credit they're not entitled to.
**CRA detects it:** Math check on Schedule 1.
**Prevention:** CPP credit = maximum(all Box 16 totals, $3,867) × 15%. Similarly for EI: maximum($1,049) × 15%.

### Error 3 — T4A Box 48 Reported as Employment Income (Line 10100)

**What happens:** Self-employment fees treated as T4 employment income. No T2125 created.
**CRA detects it:** Expects a T2125 when T4A Box 48 appears. Flags missing self-employment CPP.
**Tax cost:** Unpaid CPP of approximately $[net income − $3,500] × 11.9%. Missed deductions.
**Prevention:** T4A Box 48 → T2125 always.

### Error 4 — T777 Claimed Without a Signed T2200

**What happens:** Preparer claims home office or vehicle expenses because client described them verbally.
**CRA detects it:** Requests T2200 during review. None exists.
**Tax cost:** Full T777 claim denied. Possible penalties if CRA views it as negligent.
**Prevention:** T2200 in hand before T777 is prepared. No T2200 = no T777.

### Error 5 — Box 52 (Pension Adjustment) Treated as Income

**What happens:** Box 52 is added to income (it appears to be an amount).
**CRA detects it:** Income overstated vs. T4 Box 14.
**Correct treatment:** Box 52 goes on Line 20600 — it records the pension adjustment that will reduce next year's RRSP deduction limit. It does NOT reduce current income. It does NOT affect this year's tax calculation.
**Prevention:** Box 52 = Line 20600 = informational only. It has no direct tax consequence on the current return.

### Error 6 — Home Office Claimed Without Meeting the 50% / Exclusive Use Test

**What happens:** Client says "I work from home sometimes" and claims a home office.
**CRA's test:** The workspace must be where the employee **principally performs** their employment duties (50%+ of time) OR the space must be used **exclusively and regularly** for meeting clients/customers.
**Prevention:** Ask specifically: "What percentage of your work time do you spend working from home?" If less than 50% and the space isn't exclusively used for meeting clients — no T777 home office claim.

### Error 7 — Vehicle Expenses Claimed Without a Logbook

**What happens:** Client says "I drive a lot for work" and claims 60% business use. No logbook exists.
**CRA response:** Requests logbook documentation. None produced. Claim denied. Potential gross negligence if the business-use percentage was fabricated.
**Prevention:** Confirm logbook exists before preparing T777. If no logbook — advise the client to start one immediately for future years. For prior years without a logbook: the claim is difficult to support and should be approached cautiously.

!!! tip "In your tax software"
    **Software calculates automatically:**
    - CPP and EI credits from Box 16 and Box 18 amounts you enter
    - CPP/EI over-contribution refunds when multiple T4s push totals above the annual maximum
    - Canada Employment Amount credit for any return with employment income
    - Pension Adjustment (Box 52) carried to Line 20600 for record-keeping

    **You must verify or enter manually:**
    - That Box 40 is NOT added to Box 14 — software enters what you type; entering $94,000 + $9,200 separately creates the double-count error
    - T777 expenses — software has the form but you must determine eligibility, confirm T2200 exists, and calculate the business-use percentage
    - Vehicle logbook business-use % — software applies whatever percentage you enter; you must verify it is supported by an actual logbook
    - CPP2 (Box 16A) — entered separately from CPP (Box 16); some software versions require manual selection of the CPP2 field

---

## 5.10 Ontario-Specific Employment Income Considerations

### Ontario LIFT Credit and Employment Income

The **Low-income Individuals and Families Tax (LIFT) Credit** eliminates Ontario personal income tax for eligible low-income workers.

**Eligibility (2025):**
- Must have **employment income** (self-employment income alone does not qualify)
- Individual's adjusted net income must be under approximately **$30,000** (single) or **$60,000** (couple)
- The credit reduces Ontario basic tax — potentially to zero

**Impact on returns:** An employee earning $22,000 in Ontario has Ontario basic tax of approximately $22,000 × 5.05% = $1,111 gross. After Ontario BPA and credits: approximately $512 net Ontario tax. The LIFT Credit eliminates this. **Ontario tax = $0.**

For clients with employment income under $30,000: always check the LIFT Credit. It is automatic in tax software but understanding it explains why these clients owe zero Ontario tax.

### The Ontario Employment Amount — Separate From Federal

The federal Canada Employment Amount of $1,433 × 15% = $215 applies on Schedule 1.

Ontario has its own employment amount: also $1,433 but at 5.05% = **$72 Ontario credit** on ON428.

The combined employment credit: $215 + $72 = **$287** — applied to every employed client, every year, automatically.

### Employment Income and Ontario Surtax Interaction

For clients earning above approximately $95,000 in Ontario, the surtax tiers begin applying. Employment income at this level — particularly for dual-income households or clients with significant taxable benefits — pushes them into surtax territory.

**Planning implication:** For employees earning $95,000–$115,000 in Ontario, every dollar of deduction (RRSP, union dues, employment expenses) reduces Ontario basic tax — which may reduce or eliminate the surtax, creating a compounding benefit. The marginal value of a deduction at this income level is higher than the simple bracket rate suggests, because it also reduces the surtax.

---

## 5.11 The Retiring Allowance — Special Treatment for Severance

When an employee is terminated or retires, they may receive a **retiring allowance** (severance pay). This has unique tax treatment separate from regular employment income.

### T4 Box 66 (Eligible) and Box 68 (Non-Eligible)

**Box 66 — Eligible retiring allowance:**
A portion of severance that may be **directly transferred to an RRSP without using RRSP contribution room**, but only for years of pre-1996 service ($2,000 per year of pre-1996 service). Since most current employees started after 1996, this provision is increasingly rare. When it applies: the eligible amount is on Line 11500, offset by an RRSP deduction, net effect approximately zero tax.

**Box 67 / Box 68 — Non-eligible retiring allowance:**
Fully taxable at Line 13000. No room-bypass available. However, the client can still contribute from this money to their RRSP using existing contribution room — which at the high marginal rate of the severance year often makes excellent sense.

!!! example "Case — Patricia's $85,000 Severance Package"
    Patricia, 52, is laid off after 22 years of service. Her severance: $85,000. All post-1995 service (no eligible retiring allowance component). Her T4 shows Box 68: $85,000.

    **Total 2025 income:** T4 Box 14 (Jan–Oct, salary): $72,000 + Box 68: $85,000 = $157,000.

    **At $157,000 combined income:** Patricia is in the 38.16% combined bracket for most of the severance amount.

    **Her RRSP available room:** $28,000.

    **RRSP strategy:** Contribute $28,000 to RRSP by March 1, 2026.
    Tax saving: $28,000 × 38.16% = **$10,685 in combined tax saved.**

    Patricia nets approximately $85,000 − $10,685 (tax on the non-RRSP portion) − [$28,000 in RRSP contribution that grows tax-sheltered] − [$85,000 − $28,000 = $57,000 remaining taxable severance × ~36.5% effective rate] = approximately $57,000 × 36.5% = $20,805 tax on remainder.

    **The year-of-severance RRSP contribution is almost always the right call.** High income pushes the RRSP deduction value to its maximum. Patricia loses $28,000 in liquid cash but gains $10,685 in immediate tax savings and keeps the $28,000 growing tax-sheltered.

---

## 5.12 Complete Case Studies — Employment Income Applied

### Case A — The Complete T4 Return: James, the Mid-Career Professional

**Client:** James Chen, 41, product manager in London, Ontario. Single. Rents at $1,500/month. Works from home 3 days per week — has T2200. Vehicle used for occasional client visits — logbook shows 6,200 business km of 28,000 total.

**Documents:**
- T4: Box 14 = $96,000, Box 16 = $3,867, Box 18 = $1,049, Box 22 = $22,500, Box 40 = $4,800 (company laptop personal use benefit), Box 44 = $0, Box 52 = $3,200 (pension adjustment from employer DB plan)
- T5: Box 13 = $740 (bank interest)
- RRSP receipt: $12,000

**Step 1 — Identify every item correctly:**
Box 14 = $96,000 → **Line 10100** ($96,000 — not $100,800)
Box 40 = $4,800 → **Already in Box 14** — nothing entered
Box 16 = $3,867 → Schedule 8 / credit at 15% = $580
Box 18 = $1,049 → credit at 15% = $157
Box 22 = $22,500 → **Line 43700** (already paid)
Box 52 = $3,200 → **Line 20600** — reduces 2026 RRSP room by $3,200; no current-year income effect

**Step 2 — T777 Employment Expenses:**

Vehicle: 6,200 ÷ 28,000 = 22.1% business use

| Expense | Annual | ×22.1% | Deductible |
|---|---|---|---|
| Gas | $3,800 | 22.1% | $840 |
| Insurance | $1,600 | 22.1% | $354 |
| Maintenance | $680 | 22.1% | $150 |
| CCA (UCC $22,000 × 30% = $6,600) | $6,600 | 22.1% | $1,459 |
| **Vehicle subtotal** | | | **$2,803** |

Home office: 120 sq ft (spare room office) ÷ 900 sq ft apartment = 13.3%

Annual rent: $18,000. Utilities: $1,800. Internet: $960.
Eligible expenses: $20,760 × 13.3% = **$2,761**

**Total T777 (Line 22900): $2,803 + $2,761 = $5,564**

**Step 3 — T1 Calculation:**

Total income: $96,000 + $740 = $96,740
Deductions: RRSP $12,000 + Union dues $0 + T777 $5,564 = $17,564
**Net income: $79,176**

Federal tax on $79,176:
$57,375 × 15% = $8,606
$21,801 × 20.5% = $4,469
Gross federal: $13,075

Federal credits: BPA $2,419 + CPP $580 + EI $157 + Employment $215 = $3,371
**Net federal tax: $13,075 − $3,371 = $9,704**

Ontario tax on $79,176:
$51,446 × 5.05% = $2,598
$27,730 × 9.15% = $2,537
Ontario basic: $5,135

Ontario surtax: ($5,135 − $5,315) → below threshold → **$0 surtax**
Ontario credits: $919
**Net Ontario tax: $5,135 − $919 = $4,216**

Total payable: $9,704 + $4,216 = **$13,920**

```
Tax withheld (43700):             ($22,500)
Total payable (43500):             $13,920
─────────────────────────────────────────
REFUND (48400):                    $8,580 ✅
```

**Professional observations:**
1. Box 40 ($4,800) — the new-preparer trap. If added: $13,920 + ($4,800 × 29.65%) = $13,920 + $1,423 = $15,343 payable. Refund drops from $8,580 to $7,157. The Box 40 error costs James $1,423.
2. Box 52 ($3,200) — affects James's 2026 RRSP room: $96,000 × 18% = $17,280 new room − $3,200 PA = $14,080 available for 2026. Without knowing this, James might try to contribute more than $14,080 — triggering an over-contribution penalty.
3. T777 claim ($5,564) — reduces tax by $5,564 × 29.65% = $1,650 in combined savings. Without it: refund drops to $6,930.

---

### Case B — The Nurse with Two T4s and a Pension Adjustment

**Client:** Helen Osei, 48, registered nurse. Worked at Hospital A until August, then Hospital B from September. Receives a DB pension through the nursing union's pension plan.

**T4 — Hospital A (Jan–Aug):**
Box 14: $62,000, Box 16: $3,600, Box 18: $1,030, Box 22: $14,200, Box 20 (RPP contributions): $4,800, Box 52: $0

**T4 — Hospital B (Sep–Dec):**
Box 14: $28,000, Box 16: $1,588, Box 18: $465, Box 22: $5,800, Box 20: $1,900, Box 52: $6,200

**Combined income: $90,000**
**CPP withheld: $3,600 + $1,588 = $5,188. Max: $3,867. Over-contribution: $1,321 → Line 44800**
**EI withheld: $1,030 + $465 = $1,495. Max: $1,049. Over-contribution: $446 → Line 45000**
**RPP deduction: $4,800 + $1,900 = $6,700 → Line 20700**
**Pension adjustments: Hospital A = $0; Hospital B Box 52 = $6,200 → Line 20600 (reduces 2026 RRSP room)**

**Net income after RPP: $90,000 − $6,700 = $83,300**

**Federal tax on $83,300:**
$57,375 × 15% = $8,606; $25,925 × 20.5% = $5,315. Gross: $13,921.
Credits: BPA $2,419 + CPP max $580 + EI max $157 + Employment $215 = $3,371.
Net federal: $13,921 − $3,371 = **$10,550**

**Ontario tax on $83,300:**
$51,446 × 5.05% = $2,598; $31,854 × 9.15% = $2,915. Ontario basic: $5,513.
Surtax: ($5,513 − $5,315) × 20% = $198 × 20% = **$40 surtax** (just crossed first tier).
After credits: $5,553 − $919 = **$4,634**

**Total payable: $10,550 + $4,634 = $15,184**
**Tax withheld: $14,200 + $5,800 = $20,000**
**Plus over-contribution credits: $1,321 + $446 = $1,767**

```
Tax withheld:                    ($20,000)
Total payable:                    $15,184
Over-contribution credits:         ($1,767)
──────────────────────────────────────────
REFUND:                            $6,583 ✅
```

**Planning note:** Helen's Ontario basic tax of $5,553 is just above the first surtax threshold of $5,315. Her surtax is only $40. But as her income grows in future years — or if Hospital B's pension adjustment reduces her RRSP flexibility — the surtax exposure grows. Her 2026 RRSP room: $90,000 × 18% = $16,200 − $6,200 PA = **$10,000**. Helen should know this before attempting a contribution.

---

## 5.13 The T4 Intake Checklist — Questions for Every Employee Client

Use this checklist at every appointment for employed clients.

### Documents to Verify

- [ ] T4 from each employer — verified against CRA My Account before filing
- [ ] T2200 if claiming T777 expenses — in client's possession, signed by employer
- [ ] RPP receipts if Box 20 doesn't match what employer told them
- [ ] T4 Box 85 health premium amount — verify for medical expense consideration

### Questions to Ask Every Employee

1. "Did you work for more than one employer this year? Do you have T4s from each?"
2. "Does your T4 show a pension adjustment in Box 52?"
3. "Were you required to use your own vehicle for work? Do you have a logbook?"
4. "Did you work from home? What percentage of the time? Does your employer have a signed T2200?"
5. "Did you receive any benefits from your employer — car, parking, life insurance, housing?"
6. "Did you pay any union dues or professional membership fees?"
7. "Did you receive any bonuses, signing bonuses, or severance this year?"
8. "Were you terminated or did you take a buyout? Do you have a T4 with Box 66, 67, or 68?"
9. "Did your employer contribute to your RRSP or pension on your behalf?"
10. "Did you pay any health insurance premiums out of pocket (not reimbursed by employer)?"

---

## 5.14 Week 5 Summary

!!! success "What you learned this week"
    - **Box 14 is the master employment income box.** Everything else on the T4 either feeds into Box 14 (benefits) or flows to a credit/deduction line. Box 40 is already inside Box 14 — never add it
    - **Taxable benefits** are included in Box 14 and Box 40. They represent economic value the employee received. Non-taxable benefits (reimbursements, uniforms, group health plans) don't appear on the T4 at all
    - **Box 52 (Pension Adjustment)** reduces next year's RRSP room — it does NOT affect current-year income. Goes on Line 20600 for record-keeping only
    - **Multiple T4s:** Add all Box 14 amounts. CPP credit is capped at $3,867 maximum — excess is refunded at Line 44800. EI credit is capped at $1,049 maximum — excess refunded at Line 45000. The over-contribution refund is often the most welcome surprise for clients who changed jobs
    - **Retiring allowances:** Box 66/68 — taxable income at Line 13000. The year-of-severance RRSP maximization is almost always the right tax strategy at the high marginal rate
    - **T777 requires a signed T2200** — no exceptions. Without T2200, no T777. With T2200: general employees can claim home office, vehicle, supplies, and travel. Commission employees also get advertising, entertainment (50%), and meals (50%)
    - **Home office (detailed method):** Business-use percentage × eligible home costs. Non-commission employees cannot claim mortgage interest, property taxes, or home insurance. Never claim CCA on a principal residence home office
    - **Vehicle claims:** Business km ÷ total km = business-use %. All vehicle expenses × that percentage = deductible. Logbook is mandatory — without it, the claim cannot be defended
    - **Ontario LIFT Credit** eliminates Ontario tax for employed workers under ~$30,000 net income. The combined employment amount (federal $215 + Ontario $72 = $287) is applied automatically to every employed client
    - **Ontario surtax interaction:** Employment expenses claimed at the $95,000–$110,000 income range reduce not just the base Ontario rate but also the surtax — making the marginal value of deductions at that level higher than the bracket rate alone suggests

---

## ✅ Week 5 Quiz

When you're ready, ask Claude: **"Quiz me on Week 5"** for an interactive test.

??? question "1. Patricia's T4 shows Box 14 = $88,000, Box 22 = $19,800, and Box 40 = $6,400 (car benefit and parking). What goes on Line 10100 and Line 43700? What would happen if a preparer added Box 40 to Box 14?"
    **Line 10100: $88,000** — Box 14 only. Box 40 is already inside Box 14. **Line 43700: $19,800** — Box 22, the tax already withheld. If the preparer added Box 40 to Box 14: Line 10100 would show $94,400. Income overstated by $6,400. Tax overcalculated by $6,400 × Patricia's combined marginal rate (~29.65% at her income): approximately **$1,898 in excess tax** Patricia would pay on income that doesn't exist. CRA's automated matching would also flag the discrepancy — the T4 Box 14 in their system is $88,000 but the return shows $94,400.

??? question "2. James works for two employers simultaneously all year. T4 #1: Box 16 = $3,600. T4 #2: Box 16 = $2,200. What CPP credit appears on Schedule 1, and what happens to the excess CPP withheld?"
    Maximum employee CPP (2025): $3,867. CPP credit on Schedule 1: **$3,867 × 15% = $580** (calculated on the maximum, not on $5,800 total withheld). Excess CPP withheld: $3,600 + $2,200 = $5,800 − $3,867 = **$1,933 over-contribution**. This appears at **Line 44800** as a direct credit on the return — not a deduction, but a dollar-for-dollar credit added to the refund. James receives $1,933 back that both employers withheld correctly under their individual payroll obligations but that combined into an excess when totalled.

??? question "3. Sandra works from home 4 days per week. Her employer signed her T2200. Her home is 1,100 sq ft and her dedicated office is 130 sq ft. Annual rent: $24,000. Heat and electricity: $2,100. Internet: $960. As a non-commission employee, what is her home office deduction?"
    Business-use percentage: 130 ÷ 1,100 = **11.8%**. Eligible expenses for non-commission employees: rent, heat, electricity, internet, maintenance. **NOT:** mortgage interest, property taxes, home insurance (non-commission employees cannot claim these). Eligible expenses: $24,000 + $2,100 + $960 = **$27,060**. Home office deduction: $27,060 × 11.8% = **$3,193.** This goes on T777 and flows to Line 22900. At Sandra's 29.65% marginal rate: $3,193 × 29.65% = **$947 in annual combined tax savings** — from an expense she pays regardless.

??? question "4. Michael is a commission salesperson. His T4 Box 42 = $145,000 in commissions. He has a T2200. He spent $3,600 on client meals this year. How much can he deduct, and why would a non-commission employee be denied this same claim?"
    Michael is a commission employee — he has access to broader T777 categories including entertainment and meals. The 50% meal and entertainment rule applies: $3,600 × 50% = **$1,800 deductible on T777**. A non-commission employee cannot claim client meals and entertainment on T777 — these categories are only available to commission employees. CRA's rationale: commission employees bear direct financial risk from their employment performance (their compensation depends on generating sales) — analogous to self-employed individuals. They are permitted the broader expense categories that support business development. Non-commission employees are not in this position — their income is fixed regardless of client entertainment.

??? question "5. Helen's T4 Box 52 shows a Pension Adjustment of $9,400. She is confused and thinks she owes extra tax because of it. What do you tell her, and what does Box 52 actually do?"
    *"Helen, the Pension Adjustment in Box 52 does not affect your tax bill this year at all. It is not income. It does not change your refund or balance. Here is what it actually does: it reduces the RRSP contribution room you'll earn next year. You earn RRSP room at 18% of this year's income — but if you have an employer pension plan, CRA reduces that room by the pension adjustment amount to prevent double-dipping on tax-sheltered retirement savings. So next year's available RRSP room will be [18% × salary − $9,400]. Your T4 shows this in Box 52 purely for record-keeping — it goes on Line 20600 of your return as an informational entry. Zero impact on this year's taxes."* This explanation prevents the common client misconception that Box 52 is a tax owing.

??? question "6. Kevin received a $68,000 non-eligible retiring allowance when he was terminated (T4 Box 68). He has $22,000 in RRSP contribution room. He asks whether he should contribute to his RRSP before the deadline. His total 2025 income with the severance is $134,000. What is the tax benefit calculation and your recommendation?"
    At $134,000 total income, Kevin is in the 37.16% combined bracket (income $102,895–$150,000). His RRSP contribution room: $22,000. Tax saving from maxing RRSP: $22,000 × 37.16% = **$8,175 in combined federal and Ontario tax saved.** Recommendation: **Yes — maximize the RRSP contribution.** The termination year is typically the highest-income year Kevin will experience (combining regular salary + full severance). The RRSP deduction is worth its maximum value this year. If he waits until a normal year at $66,000 regular salary, the RRSP deduction is worth only $22,000 × 29.65% = $6,523 — $1,652 less. He should contribute $22,000 by March 1 of the following year and claim the deduction on this year's return.

??? question "7. Maria is a part-time employee earning $19,000 in Ontario (T4 only). No RRSP, no deductions. What does her tax result look like, focusing on the Ontario LIFT Credit and Canada Employment Amount?"
    At $19,000 employment income: **Federal tax:** $19,000 × 15% = $2,850 gross. Credits: BPA ($2,419) + CPP credit (~$95) + EI credit (~$50) + Canada Employment Amount ($215) = $2,779. Net federal tax: $2,850 − $2,779 = **$71.** **Ontario tax:** $19,000 × 5.05% = $960 gross. Ontario BPA credit ($599) + Ontario employment amount ($72) = $671. Net Ontario basic tax: $960 − $671 = $289. **Ontario LIFT Credit:** Maria has employment income and net income well below $30,000. LIFT Credit eliminates her Ontario basic tax: **Ontario tax = $0.** **Total combined tax: $71 federal + $0 Ontario = $71.** If her employer withheld $1,400 in taxes throughout the year (estimated): **refund of approximately $1,329.** Ontario LIFT Credit saved her $289 in Ontario tax entirely — a benefit available only to employed workers at low income, which is why having T4 employment income (rather than equivalent self-employment income) is more tax-efficient for low-income Ontarians.

---

## 📚 Further Reading

- [CRA: T4 slip — employer's guide](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4001.html)
- [CRA: Employment expenses overview (T777)](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-22900-other-employment-expenses.html)
- [CRA: T2200 — Declaration of conditions of employment](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t2200.html)
- [CRA: Motor vehicle expenses for employees](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-22900-other-employment-expenses/employment-expenses-motor-vehicle-expenses.html)
- [CRA: Work-space-in-the-home expenses](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-22900-other-employment-expenses/employment-expenses-work-space-home-expenses.html)
- [CRA: Taxable benefits — A to Z](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll/benefits-allowances.html)
- [CRA: Canada Employment Amount — Line 31260](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/non-refundable-tax-credits/line-31260-canada-employment-amount.html)

---

!!! tip "Up Next: Week 6"
    **Investment Income** — Interest, dividends, the gross-up and Dividend Tax Credit mechanism, foreign income and the foreign tax credit, T5 and T3 slip mastery, GIC accrual rules, TFSA and RRSP investment income treatment, and the T-slip timing question that prevents investment-client returns from being filed in February. Week 6 is the income type that generates the most T-slip errors and the most missed planning conversations.
