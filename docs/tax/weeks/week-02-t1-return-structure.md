# Week 2: The T1 Return Structure — Every Line, Every Section, Every Form

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Navigate every section of the T1 return — identification through refund — with complete fluency
    - Name every major income line number and the T-slip that feeds it, from memory
    - Distinguish Total Income, Net Income, and Taxable Income — explain why each exists and what it controls
    - Trace a complete client return from the first dollar earned to the final refund or balance owing, with real numbers
    - Explain Schedule 1 (federal credits) and ON428 (Ontario tax) and how they interact
    - Apply the Ontario surtax calculation correctly — including both threshold tiers
    - Recognize every common T-slip and know precisely where on the T1 it goes
    - Read and interpret a Notice of Assessment — including when CRA has changed something
    - Identify the six most common T1 structural errors that professional preparers must actively prevent
    - Build the intake habit that catches missing slips before filing — not after

!!! danger "This is the most critical technical week in the entire course"
    Everything from Week 3 onward teaches you the specific rules that fill specific parts of the T1. None of that knowledge is navigable without the structural map you build this week. A preparer who doesn't know the T1's architecture is like a surgeon who knows pharmacology but not anatomy — the knowledge exists but cannot be applied correctly.

    Master this week before moving forward. Return to it whenever something in a later week doesn't connect. Every rule, every deduction, every credit has a home here. Find the home first. The occupant will make sense.

---

## 2.1 The Fundamental Architecture — Four Sections, One Flow

Every T1 return — whether it takes 20 minutes for a simple T4 or 3 hours for a complex multi-source return — follows the same four-section architecture. This never changes. The complexity changes. The architecture does not.

```
┌─────────────────────────────────────────────────────────────┐
│  SECTION 1: IDENTIFICATION                                   │
│  Who is this person? What province? What's their situation? │
└────────────────────────────┬────────────────────────────────┘
                             │
                             ▼
┌─────────────────────────────────────────────────────────────┐
│  SECTION 2: TOTAL INCOME (Lines 10100 – 15000)              │
│  EVERY dollar from EVERY source. No deductions yet.         │
└────────────────────────────┬────────────────────────────────┘
                             │ Subtract deductions
                             ▼
┌─────────────────────────────────────────────────────────────┐
│  SECTION 3A: NET INCOME (Lines 20600 – 23600)               │
│  The master lever for both tax AND benefit programs         │
│                                                             │
│  SECTION 3B: TAXABLE INCOME (Lines 24400 – 26000)          │
│  What the tax brackets are actually applied to              │
└────────────────────────────┬────────────────────────────────┘
                             │ Apply brackets, subtract credits
                             ▼
┌─────────────────────────────────────────────────────────────┐
│  SECTION 4: TAX AND CREDITS (Lines 40424 – 48500)          │
│  Schedule 1 (federal) + ON428 (Ontario) + credits paid     │
│  = Refund or Balance Owing                                  │
└─────────────────────────────────────────────────────────────┘
```

This architecture is the skeleton of every return you will ever prepare. Your job is to correctly populate each section for each client. The sections flow in sequence — you cannot skip one. You cannot calculate Section 4 without Section 3. You cannot calculate Section 3 without Section 2.

---

## 2.2 Section 1 — Identification: The Fields That Are Not Administrative

The identification section appears routine. It is not. Several fields here have direct mechanical consequences on the tax calculation.

### Every Field and Its Tax Consequence

| Field | What You Ask | Why It Is Not Just Administrative |
|---|---|---|
| **Social Insurance Number (SIN)** | "Can you confirm your SIN for our records?" | CRA matches every T-slip to a SIN. A wrong SIN means the slips in CRA's system don't match your filed return. Automatic mismatch. Reassessment. |
| **Date of birth** | "What is your date of birth?" | Determines eligibility for Age Amount credit (65+ on December 31), RRSP conversion deadline (71 on December 31), seniors' benefit programs |
| **Marital status on December 31** | "What was your marital status on December 31 of last year?" | Controls spousal amount credit, CCB calculations, pension income splitting eligibility, GST/HST credit family unit calculation |
| **Spouse/CLP net income** | "What was your partner's net income last year?" | Required even if filing separately — determines spousal credit, CCB AFNI, and benefit phase-outs. A missing spouse income is one of the most common errors |
| **Province of residence on December 31** | "Where did you live on December 31?" | Determines which provincial tax form is used, which provincial credits apply, and which provincial benefit programs the client receives |
| **Entry date (immigrants)** | "What date did you arrive in Canada?" | Part-year residency changes income reporting rules, pro-rates credits, and affects first-year benefit eligibility |

### The December 31 Province Rule — Say This Until It Is Reflexive

!!! danger "Province of residence = December 31. Nothing else. Every time."
    A client's province for Canadian income tax purposes is the province where they **lived on December 31** of the tax year.

    Not where they work. Not where their employer is headquartered. Not where they lived most of the year. Not where they moved from. **December 31. Period.**

    **Real consequences:**

    *Scenario A:* A client lived in Alberta all year and moved to Ontario on December 28.
    They are an **Ontario resident** for the full tax year. They file ON428. They receive Ontario Trillium Benefit eligibility. Their Ontario tax is calculated on their full year's income at Ontario rates — including any months they lived in Alberta.

    *Scenario B:* A client lived in Ontario all year and moved to British Columbia on December 15.
    They are a **BC resident** for the tax year. They file BC provincial forms. They lose Ontario Trillium Benefit for the year — even for the 11.5 months they lived in Ontario.

    *Scenario C:* A client worked in Ontario all year but their family home is in Quebec and they commute.
    Their province of residence depends on where they actually lived — not where they worked. If they maintained their primary home in Quebec and commuted to Ontario, they may be a Quebec resident — and Quebec requires a separate provincial return.

    This rule creates real errors on hundreds of thousands of returns annually. Your intake question must be precise: *"What province did you live in on December 31?"* Not *"Where do you live?"* The specificity is the point.

---

## 2.3 Section 2 — Total Income: Every Dollar From Every Source

This is the widest point of the funnel. Every dollar the client earned from every source in the calendar year enters somewhere in this section. No deductions yet. No adjustments. Everything comes in.

### The Complete Income Line Reference

| Line | Income Type | Source Slip | Key Notes |
|---|---|---|---|
| **10100** | Employment income | T4 Box 14 | Wages, salary, commissions, bonuses — and all taxable benefits already included in Box 14 |
| **10400** | Other employment income | No slip — self-reported | Cash tips, gratuities not on T4, director fees without T4, employee profit-sharing |
| **11300** | OAS pension | T4A(OAS) | Old Age Security — fully taxable. High-income seniors repay via Line 23500/42200 clawback |
| **11400** | CPP/QPP benefits | T4A(P) | Government pension income — fully taxable at every income level |
| **11500** | Other pensions and superannuation | T4A Box 16/24 | DB employer pensions, annuities, LIF, PRIF — qualifies for pension income credit |
| **11600** | Elected split-pension amount | T1032 | Amount received from spouse's pension through formal splitting election |
| **11700** | Universal Child Care Benefit | T4A Box 10 | Historical 2015 and prior — rarely seen on current returns |
| **11900** | Employment Insurance | T4E | All EI benefits — regular, parental, sickness, caregiving — fully taxable |
| **12000** | Taxable dividends (all types) | T5 Box 11/25, T3 Box 32/49 | **Always use the grossed-up (taxable) amount** — never the actual amount received |
| **12100** | Interest and other investment income | T5 Box 13, T3 Box 26 | Bank interest, GIC interest, bond interest, savings account interest |
| **12200** | Net partnership income | T5013 | Share of partnership income — rare for individuals |
| **12600** | Net rental income (or loss) | T776 | Rental income net of all expenses — can be negative |
| **12700** | Taxable capital gains | Schedule 3 | 50% of the net capital gain (after losses) — from stocks, property, crypto, etc. |
| **12900** | RRSP income | T4RSP Box 22 | Any withdrawal from RRSP — fully taxable |
| **12905** | FHSA income | T4FHSA Box 22 | Non-qualifying FHSA withdrawals — rare |
| **13000** | Other income | Various | Alimony received (pre-May 1997 agreements), awards, grants |
| **13010** | RESP income / Taxable scholarships | T4A Box 40/105 | EAP withdrawals taxable in student's hands; scholarships mostly exempt for full-time students |
| **13500** | Net business income | T2125 | Self-employment — after all business expenses |
| **13700** | Net professional income | T2125 | Professionals (lawyers, doctors, accountants) — same form as business |
| **13900** | Net commission income | T2125 | Commission-based self-employed — distinct from T4 Box 42 (which is employment) |
| **14300** | Net farming income | T2042 | Farming operations |
| **14500** | Net fishing income | T2121 | Commercial fishing |
| **15000** | **TOTAL INCOME** | — | **Sum of all lines above** |

!!! tip "The income section rule: When in doubt, it comes in"
    If you are unsure whether something is taxable, put it in Total Income. The tax system is designed to exclude specific items through deductions and credits — but the default is inclusion. An amount you incorrectly exclude from Total Income can result in a CRA reassessment. An amount you incorrectly include gets corrected when a deduction or credit is applied.

    The professional habit: put everything in, then ask "what takes it back out?"

### The Three Income Lines Most Often Missed

**Line 10400 — Other employment income:**
Cash tips. Gratuities. Director fees from a corporation that didn't issue a T4. A server who earns $42,000 in wages (T4) and $18,000 in tips has $60,000 in employment income. The $18,000 in tips goes on Line 10400 — with no slip, no withholding, and no reminder from CRA that it's required.

This income is taxable. Many clients do not voluntarily report it. Your intake question: *"Did you receive any tips, gratuities, or cash payments related to your work this year?"*

**Line 12600 — Rental income:**
Many clients with rental properties report gross rent but forget income is net of expenses. The T776 calculates the net figure. More commonly missed: the client who rents out a room in their home and never thought to mention it because "it's just one room." Always ask: *"Do you rent out any space in your home, or any property you own?"*

**Line 13500 — Self-employment income:**
The T4A Box 48 trap: clients receive a T4A Box 48 from a business client and assume it's like a T4 — they report it as employment income on Line 10100. Wrong. T4A Box 48 is *fees for services* — it is self-employment income on a T2125. The difference: no CPP is withheld (you calculate and pay it yourself), home office and expenses are deductible, and CRA expects a T2125 Schedule. Reporting T4A Box 48 as employment income with no T2125 triggers automatic flags.

---

## 2.4 Section 3A — Net Income: The Most Important Number on the Return

After Total Income, you subtract deductions to arrive at **Net Income (Line 23600)**.

### Why Net Income Matters More Than Any Other Number

Net Income is simultaneously:
- The **base for income tax** calculation (via Taxable Income below it)
- The **control number** for every income-tested government benefit in Canada
- The **benchmark** that determines whether clients are pushed into or out of clawback zones
- The **number used for spousal credit calculations**
- The **AFNI component** in CCB calculations

Every dollar removed from Net Income generates a double benefit:
1. Reduces income tax at the marginal rate
2. Improves eligibility and amounts of income-tested benefits

**The benefits controlled by Net Income (Line 23600):**

| Benefit | What Happens as Net Income Changes |
|---|---|
| Canada Child Benefit | Calculated on family AFNI — lower income = higher CCB |
| GST/HST credit | Phases out above $44,324 — lower income = more credit |
| Age Amount (65+) | Phases out at $44,325 — lower income = full $8,790 credit |
| OAS (seniors 65+) | Clawback at 15% above $90,997 — lower income = less OAS repaid |
| Spousal credit | Based on spouse's net income — lower = more credit available |
| Ontario Trillium Benefit | Phases out with income — lower income = higher OTB |
| Ontario LIFT Credit | Available below $30,000 employment income with net income threshold |
| Ontario Age Amount | Phases out above $42,335 — lower income = full $5,812 Ontario credit |

This is why an RRSP contribution at Line 20800 is more powerful than it appears. It doesn't just save tax. It simultaneously improves every benefit listed above. This compounding effect is the foundation of all tax planning for families and seniors.

### The Above-Line Deductions — What Reduces Net Income

| Line | Deduction | What It Is |
|---|---|---|
| **20600** | Pension adjustment | T4 Box 52 — recorded here but does NOT reduce income; simply notes how the employer pension reduced RRSP room |
| **20700** | RPP contributions | T4 Box 20 — employee contributions to employer Registered Pension Plan |
| **20800** | RRSP/PRPP deduction | The most powerful personal deduction in Canada — Schedule 7 |
| **20810** | FHSA deduction | First Home Savings Account contributions — new from 2023 |
| **21200** | Union dues | T4 Box 44 — plus professional dues not on T4 if required for employment |
| **21300** | UCCB repayment | Historical — very rare on current returns |
| **21400** | Childcare expenses | T778 — must be on the lower-income spouse's return (with narrow exceptions) |
| **21500** | Disability supports | Attendant care and other supports paid to earn income |
| **21699** | Business investment loss | 50% of a qualifying business loss — rare but valuable |
| **21900** | Moving expenses | T1-M — must meet the 40 km distance test; deducted against new-location income |
| **22000** | Deduction for split-pension | T1032 — amount transferred to spouse reduces transferor's net income |
| **22100** | Carrying charges | Investment loan interest, investment advisory fees, safety deposit box |
| **22200** | CPP/EI on self-employment | 50% of self-employment CPP and applicable EI — deductible here |
| **22215** | CPP2 deduction | Deductible portion of enhanced CPP2 contributions |
| **22300** | Deduction for PPIP premiums | Quebec-specific — rarely applicable to Ontario |
| **22400** | Exploration and development | Investment in resource companies — rare |
| **22900** | Other employment expenses | T777 — requires employer-signed T2200 |
| **23200** | Other deductions | Support payments made to former spouse/partner, clergy residence |
| **23500** | Social benefits repayment | OAS clawback added back to income here — then repaid at Line 42200 |

**Line 15000 − All the above deductions = Line 23600: Net Income**

---

## 2.5 Section 3B — Taxable Income: What the Brackets Actually Apply To

Most clients have identical Net Income and Taxable Income. The deductions in this section are specific and not universally applicable.

### The Below-Line Deductions — What Reduces Taxable Income

| Line | Deduction | What It Is |
|---|---|---|
| **24400** | Military and police deduction | Specific to deployed Canadian Armed Forces and police |
| **24900** | Security options deductions | Related to employee stock option exercises |
| **25000** | Social benefits repayment | OAS/EI repayments — matches what was added at 23500 |
| **25100** | Limited partnership losses | From a limited partnership investment |
| **25200** | Non-capital losses from other years | Prior years' losses carried forward to offset current income |
| **25300** | Net capital losses from other years | Capital loss carry-forwards applied against current year capital gains |
| **25400** | Capital gains deduction | The Lifetime Capital Gains Exemption (LCGE) — for qualifying small business shares, farm/fishing property |
| **25500** | Northern residents deductions | Residents of prescribed northern/intermediate zones |
| **25600** | Additional deductions | Various miscellaneous |

**Line 23600 − These deductions = Line 26000: Taxable Income**

### The Critical Distinction — Why Location of a Deduction Matters

!!! success "Above vs. below Line 23600 — the most important structural concept in tax planning"
    **Above Line 23600 (reduces Net Income):**
    - Reduces income tax ✅
    - Improves all income-tested benefits ✅ (CCB, GST, OAS, Age Amount, spousal credit, OTB)
    - Example: RRSP contribution at Line 20800

    **Below Line 23600 (reduces only Taxable Income):**
    - Reduces income tax ✅
    - Does **NOT** improve any income-tested benefits ❌
    - Example: Capital loss carry-forward at Line 25300

    **Same dollar amount of deduction. Very different outcomes.**

    A client with $80,000 net income and two young children who applies a $10,000 capital loss carry-forward (Line 25300) saves approximately $2,965 in combined income tax — but their CCB doesn't improve because Net Income is unchanged.

    The same $10,000 in RRSP contributions (Line 20800) saves approximately $2,965 in income tax AND increases their annual CCB by approximately $10,000 × 19% = $1,900. Same $10,000 deduction. $1,900 difference in annual outcome.

    This distinction is what separates practitioners who understand the T1 architecturally from those who are simply entering data.

---

## 2.6 Section 4 — Federal Tax: Schedule 1 in Detail

After Taxable Income is established, the tax calculation begins. Federal tax is calculated on **Schedule 1** — a form attached to the T1 that applies the federal brackets and then subtracts federal non-refundable credits.

### Step 1: Apply Federal Brackets to Line 26000

The 2025 federal rates applied to Taxable Income:

| Taxable Income Range | Rate | Tax on This Portion |
|---|---|---|
| $0 – $57,375 | 15% | Maximum $8,606 |
| $57,376 – $114,750 | 20.5% | Maximum $11,762 |
| $114,751 – $158,519 | 26% | Maximum $11,420 |
| $158,520 – $220,000 | 29% | Maximum $17,822 |
| Over $220,000 | 33% | On excess |

**Result: Federal tax before credits (Line 40424)**

### Step 2: Subtract Federal Non-Refundable Credits

Non-refundable credits are calculated at **15%** — the lowest federal bracket rate. Each credit has a "base amount" multiplied by 15% to produce the actual credit value.

| Credit | 2025 Base Amount | ×15% = Credit |
|---|---|---|
| **Basic Personal Amount (BPA)** | $16,129 | **$2,419** |
| **Age Amount (65+ on Dec 31)** | Up to $8,790 (income-tested) | Up to $1,319 |
| **Spouse/CLP Amount** | Up to $16,129 − spouse net income | Up to $2,419 |
| **Amount for eligible dependant** | Up to $16,129 − dependant's income | Up to $2,419 |
| **CPP/QPP contributions (Sched 8)** | T4 Box 16 (max $3,867) | Max $580 |
| **CPP2 contributions** | T4 Box 16A (max $188) | Max $28 |
| **EI premiums** | T4 Box 18 (max $1,049) | Max $157 |
| **Canada Employment Amount** | $1,433 | **$215** |
| **Home Buyers' Amount** | Up to $10,000 | Up to $1,500 |
| **Digital News Subscription** | Up to $500 | Up to $75 |
| **Pension Income Amount** | Up to $2,000 of eligible pension income | Up to $300 |
| **Caregiver Amount** | Varies | Varies |
| **Disability Amount (self)** | $9,872 | **$1,481** |
| **Disability Supplement (child)** | Additional $5,758 | Additional **$864** |
| **Interest on student loans** | Amount paid on qualifying loans | Amount × 15% |
| **Tuition (current year)** | T2202 eligible tuition | Amount × 15% |
| **Medical expenses (net)** | Expenses above threshold | Net × 15% |
| **Charitable donations** | First $200 at 15%; above $200 at 29% | Variable |

**Gross federal tax − Non-refundable credits = Line 42000: Net Federal Tax**

!!! warning "Non-refundable credits cannot create a federal refund on their own"
    "Non-refundable" has a specific meaning: the credit reduces tax to zero but cannot go below zero. If a client has $1,200 in federal tax and $1,800 in non-refundable credits — their federal tax is $0. The extra $600 in credits is permanently lost (for most non-refundable credits). This is why we optimize which family member claims which credit — always claim credits where they will be fully absorbed against actual tax.

    The practical implication: for a low-income client with minimal tax, some non-refundable credits may provide no benefit if they exceed the tax owing. For example, a student with $0 federal tax — their tuition credit is worth nothing against this year's return. It must be carried forward to future years when they have tax to apply it against.

---

## 2.7 Section 4 — Ontario Tax: ON428 in Detail

Ontario tax is calculated completely separately from federal — on **Form ON428** — using Ontario's own brackets, Ontario's own credit amounts, and Ontario's own surtax mechanism.

### Ontario Brackets Applied to Line 26000

The same Taxable Income (Line 26000) is used for Ontario calculations, but through Ontario's bracket system:

| Ontario Taxable Income | Ontario Rate | Ontario Tax on This Portion |
|---|---|---|
| $0 – $51,446 | 5.05% | Maximum $2,598 |
| $51,447 – $102,894 | 9.15% | Maximum $4,712 |
| $102,895 – $150,000 | 11.16% | Maximum $5,262 |
| $150,001 – $220,000 | 12.16% | Maximum $8,512 |
| Over $220,000 | 13.16% | On excess |

**Result: Ontario basic tax**

### Ontario Non-Refundable Credits (×5.05%)

| Ontario Credit | 2025 Base Amount | ×5.05% = Credit |
|---|---|---|
| **Ontario BPA** | **$11,865** | **$599** |
| **Ontario Age Amount (65+)** | Up to $5,812 (income-tested above $42,335) | Up to $294 |
| **Ontario Pension Income** | Up to $1,533 (deduction, not a credit base) | Up to $77 |
| **Ontario Spouse/CLP** | Up to $10,582 − spouse net income | Up to $534 |
| **CPP contributions** | Same as federal | ×5.05% |
| **EI premiums** | Same as federal | ×5.05% |
| **Ontario Employment Amount** | $1,433 (same as federal) | $72 |
| **Ontario Political Contribution** | Varies | Varies |

!!! danger "Ontario BPA is $11,865 — not $16,129. This error appears on thousands of returns"
    The federal Basic Personal Amount is **$16,129**. Ontario's Basic Personal Amount is **$11,865**. These are different amounts. They appear on different forms (Schedule 1 vs. ON428). They generate different credit values ($2,419 federal vs. $599 Ontario).

    Entering $16,129 on the ON428 Ontario BPA field overstates the Ontario credit by $4,264 × 5.05% = $215. Across hundreds of returns, this error compounds into a serious accuracy problem. Most professional tax software populates this automatically — but you must know the correct values to catch any software anomaly.

    Also: Ontario's Age Amount phase-out begins at **$42,335** — lower than the federal $44,325 threshold. Ontario seniors lose the Age Amount credit at a lower income. Always calculate both separately.

### The Ontario Surtax — The Layer Most Preparers Explain Poorly

After calculating Ontario basic tax and applying Ontario non-refundable credits, you arrive at net Ontario basic tax. Then — and only for clients whose Ontario basic tax exceeds specific thresholds — Ontario applies a **surtax**:

```
If net Ontario basic tax EXCEEDS $5,315:
    Surtax Tier 1 = (Ontario basic tax − $5,315) × 20%

If net Ontario basic tax ALSO EXCEEDS $6,802:
    Surtax Tier 2 = (Ontario basic tax − $6,802) × 36% (additional)
```

**The surtax is applied on top of — not instead of — Ontario basic tax.**

!!! example "Calculating the Ontario Surtax"
    **Client A:** Ontario basic tax = $5,000. Below $5,315 threshold. **Surtax = $0.**

    **Client B:** Ontario basic tax = $6,000. Above $5,315 but below $6,802.
    Surtax Tier 1: ($6,000 − $5,315) × 20% = $685 × 20% = **$137 surtax**
    Total Ontario tax: $6,000 + $137 = **$6,137**

    **Client C:** Ontario basic tax = $9,500. Above both thresholds.
    Surtax Tier 1: ($9,500 − $5,315) × 20% = $4,185 × 20% = $837
    Surtax Tier 2: ($9,500 − $6,802) × 36% = $2,698 × 36% = $971
    Total surtax: $837 + $971 = **$1,808**
    Total Ontario tax: $9,500 + $1,808 = **$11,308**

    **Who hits the surtax?**
    The $5,315 first tier is typically reached around $93,000–$100,000 net income.
    The $6,802 second tier is typically reached around $100,000–$108,000 net income.
    Any client earning over $100,000 in Ontario is paying both tiers of surtax — making their effective Ontario rate higher than the simple bracket table suggests.

**Ontario basic tax + Ontario surtax − Ontario non-refundable credits = Net Ontario Tax**

---

## 2.8 Section 4 — Assembling the Final Calculation

With federal tax (Schedule 1) and Ontario tax (ON428) both calculated, you combine them and account for taxes already paid.

### Building the Total Payable (Line 43500)

```
Net Federal Tax (Line 42000)
    + Net Ontario Tax (from ON428)
    + CPP contributions on self-employment (Schedule 8)
    + CPP2 contributions on self-employment
    + EI premiums on self-employment (if applicable)
    + Repayment of social benefits / OAS clawback (Line 42200)
    ─────────────────────────────────────────────────────────
    = TOTAL PAYABLE (Line 43500)
```

### Subtracting What Was Already Paid (Line 43700)

| Source | Where It Comes From |
|---|---|
| Employment income tax withheld | T4 Box 22 — from every employer |
| Pension/annuity tax withheld | T4A Box 22 |
| EI tax withheld | T4E Box 22 |
| OAS tax withheld | T4A(OAS) Box 22 |
| CPP tax withheld | No — CPP is not income tax; it appears at Line 30800 as a credit |
| RRIF withholding | T4RIF Box 28 |
| RRSP withdrawal withholding | T4RSP Box 30 |
| Tax instalments paid | Amount actually remitted to CRA in quarterly payments |

**All Box 22 amounts from all slips → Line 43700: Total Income Tax Deducted**

### The Final Line

```
Total Payable (43500)
    − Total Income Tax Deducted (43700)
    − Any CPP overpayment credit
    − Any EI overpayment credit
    − Other offsets
    ─────────────────────────────────
    If result is NEGATIVE: Line 48400 — REFUND
    If result is POSITIVE: Line 48500 — BALANCE OWING
```

---

## 2.9 The Complete T-Slip Field Guide — Every Slip, Every Box, Every Line

This is your professional reference. When a client hands you a document, you identify it in seconds and know exactly where every box goes.

### T4 — Employment Income (Employer → Employee by February 28)

The most common slip. Know every box.

| Box | Label | Goes To |
|---|---|---|
| **14** | Employment income | **Line 10100** |
| **16** | Employee's CPP contributions | Line **30800** (credit); Schedule 8 for CPP2 |
| **17** | Employee's QPP contributions | Similar to Box 16 — Quebec only |
| **18** | Employee's EI premiums | Line **31200** (credit) |
| **20** | RPP contributions | Line **20700** (deduction) |
| **22** | Income tax deducted | Line **43700** (already paid) |
| **24** | EI insurable earnings | Reference only — not directly on T1 |
| **26** | CPP/QPP pensionable earnings | Reference only |
| **40** | Other taxable allowances and benefits | **Already inside Box 14 — never add again** |
| **44** | Union dues | Line **21200** (deduction) |
| **46** | Charitable donations | Schedule 9 |
| **52** | Pension adjustment | Line **20600** — records PA but doesn't reduce income |
| **55** | Employee's PPIP premiums | Quebec only |
| **85** | Employee-paid premiums for private health | Medical expenses — possible credit |

!!! danger "Box 40 is inside Box 14. Adding both double-counts the benefit by thousands of dollars"
    Box 40 reports the value of taxable benefits (company car, employer-paid life insurance, parking, etc.). These amounts are **already included** inside Box 14. Box 40 is a breakdown — not additional income. A client whose Box 14 is $92,000 and Box 40 is $6,000 has employment income of $92,000 — not $98,000. Entering $92,000 + $6,000 = $98,000 on Line 10100 overstates income by $6,000 and overstates tax by approximately $6,000 × combined rate. This error is common among new preparers who see a number in Box 40 and feel it needs to go somewhere.

### T5 — Investment Income (Financial Institutions by February 28)

| Box | Label | Goes To | Critical Note |
|---|---|---|---|
| **10** | Actual amount of eligible dividends | — | **Do NOT use for Line 12000** |
| **11** | Taxable amount of eligible dividends | **Line 12000** | This is Box 10 × 1.38 — use this |
| **12** | Eligible dividend tax credit | **Line 40425** | This is Box 11 × 15.0198% |
| **13** | Interest from Canadian sources | **Line 12100** | Full amount — no gross-up |
| **14** | Other income from Canadian sources | **Line 12100** | Royalties, etc. |
| **15** | Foreign income | **Line 12100** (converted to CAD) | Use Bank of Canada rate |
| **16** | Foreign tax paid | **Form T2209 / Line 40500** | Foreign tax credit |
| **18** | Capital gains dividends | **Schedule 3** | Treated as capital gains |
| **24** | Actual amount of non-eligible dividends | — | **Do NOT use for Line 12000** |
| **25** | Taxable amount of non-eligible dividends | **Line 12000** | This is Box 24 × 1.15 — use this |
| **26** | Non-eligible dividend tax credit | **Line 40425** | This is Box 25 × 9.0301% |

**The dividend rule to drill until automatic:**
Never use the "actual" amount received for dividends on the T1. Always use the **taxable (grossed-up) amount:**
- Eligible dividends: multiply actual (Box 10) by **1.38** → Box 11 already does this
- Non-eligible dividends: multiply actual (Box 24) by **1.15** → Box 25 already does this

The grossed-up amount represents the pre-tax corporate income. The DTC partially offsets the corporate tax already paid. If you use the actual amount instead of the taxable amount, you both understate income and miscalculate the DTC — a double error.

### T4A — Other Pension and Income (Varies by February 28)

| Box | Label | Goes To | Critical Note |
|---|---|---|---|
| **16** | Pension or superannuation | **Line 11500** | DB pensions, annuities — eligible for pension income credit |
| **20** | Self-employment commissions | **T2125 / Line 13900** | Self-employment — not employment |
| **22** | Income tax deducted | **Line 43700** | Already paid |
| **24** | Annuity amounts | **Line 11500** | Pension income credit eligible |
| **28** | Other income | **Line 13000** | Various — check context |
| **40** | RESP — Education Assistance Payment | **Line 13010** | Taxable in student's hands |
| **48** | Fees for services | **T2125 / Line 13500** | Self-employment income — NEVER Line 10100 |
| **105** | Scholarships, bursaries | **Line 13010** | Mostly exempt for full-time students |

!!! danger "T4A Box 48 always creates a T2125 — never goes directly to Line 10100"
    This error appears on thousands of incorrectly prepared returns annually. T4A Box 48 is *fees for services* — the technical descriptor for self-employment income. It goes on a **T2125 self-employment schedule**, not Line 10100 (employment). The consequences of misclassifying it:

    (1) No self-employment CPP is calculated (the client underpays CPP)
    (2) No business expenses are deducted (the client overpays tax)
    (3) No home office, vehicle, or other legitimate business expenses are captured

    CRA's system cross-references T4A Box 48 with T2125 schedules. A T4A Box 48 with no T2125 is flagged automatically. Prepare the T2125. Ask the client about expenses. Do it correctly.

### T3 — Trust Income (Mutual Funds, ETFs, Trusts by March 31)

| Box | Label | Goes To |
|---|---|---|
| **21** | Capital gains | **Schedule 3 / Line 12700** |
| **23** | Actual eligible dividends | Used to calculate Box 32 |
| **32** | Taxable eligible dividends | **Line 12000** |
| **33** | Eligible dividend tax credit | **Line 40425** |
| **34** | Foreign income | **Line 12100** |
| **37** | Foreign tax paid | **Form T2209** |
| **39** | Actual non-eligible dividends | Used to calculate Box 49 |
| **49** | Taxable non-eligible dividends | **Line 12000** |
| **42** | Amount resulting in cost base adjustment | **Adjusts ACB** — not income |

!!! warning "T3 slips arrive March 31 — never file investment clients before April"
    T4 slips: due February 28. T5 slips: due February 28. T3 slips: due **March 31** — a full month later.

    A client who owns mutual funds, ETFs, income trusts, REITs, or any trust investment may have a T3 that doesn't exist until late March. Filing their return in February without the T3 produces an incomplete return that CRA will eventually identify and reassess.

    The professional standard: any client with investment accounts beyond simple bank deposits and GICs waits until after April 1 to file. Run Auto-fill my return (AFR) on or after April 1 to confirm all T3 slips are in CRA's system. Then file.

### T5008 — Securities Transactions (Brokerages by February 28)

| Box | Label | Use |
|---|---|---|
| **16** | Proceeds of disposition | Schedule 3 — proceeds column |
| **20** | Cost or book value | **Verify independently — may be wrong** |
| **21** | Security description | Schedule 3 description column |

!!! danger "T5008 Box 20 is UNRELIABLE for ACB — using it uncritically generates overpaid capital gains tax on thousands of returns annually"

    Box 20 reports what the brokerage recorded as the cost — which may be:
    - **Blank** (many brokerages don't populate it)
    - **Wrong for DRIP investors** (dividend reinvestment plans add shares at varying prices; the brokerage average may not match CRA's adjusted cost base rules)
    - **Wrong for inherited securities** (cost resets to FMV at date of death — the brokerage may still show the original purchase price)
    - **Wrong after return of capital adjustments** (Box 42 on T3 slips reduce ACB; many brokerages don't track this)
    - **Wrong for shares purchased over multiple years** at different prices where the average doesn't match CRA's calculation method

    **Never put Box 20 directly into Schedule 3 as ACB without verifying it against the client's original purchase records.**

    In practice: ask every client with securities transactions for their original purchase confirmations. For clients who have lost them: work through the trading history, dividends received, DRIP shares acquired, and any ACB adjustments to reconstruct the correct figure.

    The client who used Box 20 without verification and overstated their capital gain paid extra tax. The client whose Box 20 understated their cost and underpaid will receive a CRA reassessment.

### Other Slips — Quick Reference

| Slip | Issued By | Goes To | Notes |
|---|---|---|---|
| **T4A(P)** | Service Canada | **Line 11400** | CPP/QPP pension benefits |
| **T4A(OAS)** | Service Canada | **Line 11300** | OAS pension |
| **T4E** | Service Canada | **Line 11900** | EI benefits — all types |
| **T4RSP** | RRSP issuer | **Line 12900** | RRSP withdrawals |
| **T4RIF** | RRIF issuer | **Line 11500** | RRIF withdrawals — Box 16 |
| **T4FHSA** | FHSA issuer | Varies | Non-qualifying withdrawals taxable |
| **T5007** | Worker's compensation | **Line 14400** | Then deducted at Line 25000 |

---

## 2.10 The Notice of Assessment — Reading It Like a Professional

The **Notice of Assessment (NOA)** is CRA's official confirmation of how it processed the filed return. For EFILE returns, it typically arrives within 2 weeks. It is the final word on the assessed result for that tax year — unless objected to within 90 days.

### The Four Parts of Every NOA

**Part 1 — Assessment Summary:**
CRA's version of the key lines:
- Total income as assessed
- Net income as assessed
- Taxable income as assessed
- Total payable (federal + Ontario combined)
- Balance: refund or amount owing

**Part 2 — Account Summary:**
- Refund amount and expected deposit date (for direct deposit clients)
- Amount owing and due date
- Prior balance adjustments if applicable

**Part 3 — RRSP / Registered Account Information:**
- **RRSP deduction limit for next year** — critical for RRSP planning
- HBP repayment balance (if applicable)
- LLP repayment balance (if applicable)
- Unused tuition credit carry-forward
- Capital loss carry-forward balance

**Part 4 — Explanation of Changes (if CRA changed anything):**
When CRA's assessment differs from the filed return, this section explains every change made. This is the section that requires professional attention.

### The Three NOA Outcomes and How to Handle Each

=== "Outcome 1 — NOA Matches Filed Return"

    **What it means:** CRA accepted the return as filed. No changes.
    **What you do:** Confirm with client that the NOA numbers match expectations. File the NOA in the client's folder. Note the RRSP deduction limit for planning. Done.

=== "Outcome 2 — NOA Shows CRA Added Income"

    **What it means:** CRA matched a T-slip you didn't include. The most common cause: a T5 from a bank account the client forgot, a T3 that arrived after filing, a T4A from a pension that started this year.

    **What you do:**
    1. Identify exactly which line changed and why — read CRA's explanation
    2. If the addition is correct (genuinely missing slip): accept the reassessment. File a T1-ADJ if the added income unlocks deductions or credits you should also be claiming
    3. If the addition is incorrect (CRA made an error): file a Notice of Objection within **90 days** of the NOA date with documentation showing the error

=== "Outcome 3 — NOA Shows CRA Disallowed a Deduction or Credit"

    **What it means:** CRA rejected or adjusted something you claimed. Common: disallowed moving expenses, adjusted medical expenses, modified capital gains.

    **What you do:**
    1. Read the explanation carefully — is it a documentation request or a permanent disallowance?
    2. If documentation can satisfy the request: gather and respond (usually via My Account correspondence)
    3. If you disagree with the disallowance: file a Notice of Objection within 90 days
    4. If the client provided incorrect information that caused the original claim: discuss honestly, accept the reassessment

!!! tip "The 90-day objection window is absolute — missing it loses the right to dispute"
    The formal Notice of Objection must be filed within **90 days of the date on the NOA** (not the date you received it — the date printed on the NOA). After 90 days, the right to object at that level is permanently lost. The client can apply for an extension, but it is not guaranteed.

    For every NOA that shows an unexpected change: calculate the 90-day deadline on the day you receive it. Note it in the client file. Act before it expires.

---

## 2.11 The Six Structural Errors That Define the Difference Between Preparers

These are the errors that generate CRA reassessments, client complaints, and reputational damage. They are all preventable with proper process.

### Error 1 — T4A Box 48 Reported as Employment Income

**What happens:** Preparer sees a T4A and puts Box 48 on Line 10100.
**CRA response:** No T2125 filed. Self-employment CPP not calculated. Business expenses not claimed. CRA assesses CPP plus penalties.
**Prevention:** T4A Box 48 → T2125 every time, without exception.

### Error 2 — Box 40 Added to Box 14 on the T4

**What happens:** Preparer enters Box 14 + Box 40 on Line 10100.
**CRA response:** Income overstated. Client pays more tax than legally required. CRA's automated matching sees the discrepancy between the slip (Box 14 only) and the T1 (Box 14 + Box 40).
**Prevention:** Box 40 is inside Box 14. Never enter it separately.

### Error 3 — Childcare Expenses on the Higher-Income Spouse

**What happens:** Preparer claims childcare on the parent who actually paid — who happens to earn more.
**CRA response:** No automatic correction. The tax bill is simply higher than it needs to be.
**Prevention:** Childcare expenses (Line 21400, Form T778) go on the **lower-income spouse's return** in almost every case. The higher-income spouse can only claim childcare in specific exceptions (school, disability, etc.).

### Error 4 — Using T5008 Box 20 as ACB Without Verification

**What happens:** Preparer uses brokerage-reported cost as the ACB without verifying against purchase records.
**Result:** Either overpaid capital gains tax (client loses money) or underpaid capital gains tax (CRA reassessment later).
**Prevention:** Always verify Box 20 against original purchase confirmations. For any client who has owned securities for years, has received DRIP shares, or has inherited securities — the ACB requires independent calculation.

### Error 5 — Missing Slips Because "That's Everything I Brought"

**What happens:** Preparer files based only on what the client physically brings.
**CRA response:** Automatic T-slip matching identifies missing T5 from a bank account the client forgot, or a T3 that arrived after the appointment. Reassessment with additional tax plus interest from April 30.
**Prevention:** CRA My Account verification of all filed slips before every filing. This step is non-negotiable professional practice.

### Error 6 — Province Set Incorrectly Based on "Where They Live"

**What happens:** Preparer asks "where do you live?" and sets the province to what the client says — without verifying December 31.
**CRA response:** Wrong provincial tax form. Wrong provincial credits. Potentially wrong provincial benefit amounts. Reassessment.
**Prevention:** The intake question is precise: *"What province did you live in on December 31?"* Not general address questions.

---

## 2.12 The Complete Worked Example — Full Ontario T1 From First Line to Last

**Client: Kevin Osei, 36, Ontario resident all year, no children, single.**

**Documents:**
- T4 from employer: Box 14 = $78,000, Box 16 = $3,867, Box 18 = $1,049, Box 22 = $17,800, Box 44 = $720
- T5 from TD Bank: Box 13 = $480 (interest)
- T5 from investment account: Box 24 (actual non-eligible dividends) = $1,200, Box 25 (taxable) = $1,380, Box 26 (DTC) = $125
- RRSP contribution receipt: $8,500 (contributed January 2025)
- Rents an apartment at $1,400/month all year
- Prior NOA RRSP deduction limit: $14,200

---

### Section 2 — Total Income

| Line | Item | Amount |
|---|---|---|
| 10100 | Employment income (T4 Box 14) | $78,000 |
| 12000 | Taxable dividends (T5 Box 25 = $1,380 non-eligible) | $1,380 |
| 12100 | Interest income (T5 Box 13) | $480 |
| **15000** | **Total Income** | **$79,860** |

---

### Section 3A — Net Income

| Line | Deduction | Amount |
|---|---|---|
| 20800 | RRSP deduction (within $14,200 limit ✅) | ($8,500) |
| 21200 | Union dues (T4 Box 44) | ($720) |
| **23600** | **Net Income** | **$70,640** |

---

### Section 3B — Taxable Income

Kevin has no capital loss carry-forwards or other sub-23600 deductions.
**Taxable Income (Line 26000): $70,640**

---

### Schedule 1 — Federal Tax

**Federal brackets on $70,640:**

| Bracket | Income | Rate | Tax |
|---|---|---|---|
| 1st | $57,375 | 15% | $8,606 |
| 2nd | $70,640 − $57,375 = $13,265 | 20.5% | $2,719 |
| **Gross federal tax** | | | **$11,325** |

**Federal non-refundable credits:**

| Credit | Base | ×15% |
|---|---|---|
| BPA | $16,129 | $2,419 |
| CPP (Box 16) | $3,867 | $580 |
| EI (Box 18) | $1,049 | $157 |
| Canada Employment Amount | $1,433 | $215 |
| DTC for dividends (T5 Box 26) | — | $125 |
| **Total credits** | | **$3,496** |

**Net Federal Tax (Line 42000): $11,325 − $3,496 = $7,829**

---

### ON428 — Ontario Tax

**Ontario brackets on $70,640:**

| Bracket | Income | Rate | Tax |
|---|---|---|---|
| 1st | $51,446 | 5.05% | $2,598 |
| 2nd | $70,640 − $51,446 = $19,194 | 9.15% | $1,756 |
| **Ontario basic tax** | | | **$4,354** |

**Ontario surtax:** $4,354 < $5,315 first threshold → **$0 Ontario surtax**

**Ontario non-refundable credits:**

| Credit | Base | ×5.05% |
|---|---|---|
| Ontario BPA | $11,865 | $599 |
| CPP (Box 16) | $3,867 | $195 |
| EI (Box 18) | $1,049 | $53 |
| Ontario Employment Amount | $1,433 | $72 |
| **Total Ontario credits** | | **$919** |

**Net Ontario Tax: $4,354 − $919 = $3,435**

---

### Final Calculation

```
Net Federal Tax (42000):          $7,829
+ Net Ontario Tax (ON428):        $3,435
─────────────────────────────────────────
Total Payable (43500):           $11,264

− Tax withheld (43700):         ($17,800)
─────────────────────────────────────────
REFUND (48400):                   $6,536 ✅
```

### Benefit Check for Kevin

**GST/HST Credit:** Net income $70,640. Phase-out threshold $44,324. Excess: $70,640 − $44,324 = $26,316. Phase-out: $26,316 × 5% = $1,316. Annual credit: $519 − $1,316 = **$0** (fully phased out at this income).

**Ontario Trillium Benefit (ON-BEN):**
Rent: $1,400 × 12 = $16,800. OEPTC: 20% × $16,800 = $3,360 deemed property tax equivalent.
At $70,640 income, the OEPTC is partially phased out but not eliminated — approximately **$640–$700/year** depending on final OTB formula calculations.
OSTC: Kevin's income exceeds the threshold for meaningful OSTC → approximately $0–$50.
**Total OTB: approximately $640–$700/year**, paid as approximately $55/month starting July 2026.

### Three Professional Observations on Kevin's Return

**Observation 1 — The RRSP math:**
Without the RRSP: net income = $79,140. Federal tax would be approximately $11,325 + additional $8,500 × 20.5% = $11,325 + $1,743 = $13,068 federal. Ontario tax similarly higher.
The RRSP saved Kevin approximately: $8,500 × 29.65% = **$2,520 in combined tax**. His refund without the RRSP would have been approximately $6,536 − $2,520 = **$4,016**. The RRSP added $2,520 to the refund.

**Observation 2 — Near the Ontario surtax threshold:**
Kevin's Ontario basic tax ($4,354) is below the $5,315 first surtax threshold by $961. If his net income were $11,000 higher (without the RRSP), his Ontario basic tax would approach the surtax zone. The RRSP contribution is partially keeping him below the surtax threshold — a layered benefit beyond the direct tax saving.

**Observation 3 — His RRSP room going forward:**
This year's employment income of $78,000 × 18% = $14,040 in new RRSP room for next year. Kevin used $8,500 of his $14,200 existing room. He has $5,700 + $14,040 = approximately **$19,740 in RRSP room available for 2026** (subject to pension adjustment adjustment if any). Planning opportunity: suggest he contribute the full $14,040+ next year to maximize the ~30% tax saving at his income level.

---

## 2.13 Case Studies — The T1 Architecture in Real Situations

### Case A — The Two-Employer Return With Hidden Windfalls

**Client:** Sarah, 29, changed employers in August. She has two T4s.

| | T4 — Employer A (Jan–Jul) | T4 — Employer B (Aug–Dec) |
|---|---|---|
| Box 14 employment income | $36,500 | $42,000 |
| Box 16 CPP withheld | $2,073 | $2,432 |
| Box 18 EI withheld | $606 | $697 |
| Box 22 income tax withheld | $7,400 | $9,800 |
| Box 44 Union dues | $0 | $840 |

**Combined:**
- Employment income: $78,500
- CPP withheld: $4,505
- EI withheld: $1,303
- Tax withheld: $17,200

**The two over-contribution refunds:**

CPP over-contribution: $4,505 withheld − $3,867 maximum = **$638 returned on Line 44800**
EI over-contribution: $1,303 withheld − $1,049 maximum = **$254 returned on Line 45000**

**Combined over-contribution refund: $892**

Sarah doesn't know about this. Neither employer knew about the other. Each employer withheld their own CPP and EI amounts independently, as if Sarah would work at their rate for the full year. The T1 corrects this automatically.

**Sarah's reaction when you tell her:** *"My refund includes $892 from CPP and EI that were over-withheld. That's not something you did — it's a built-in correction when you work for two employers in one year."*

This single piece of knowledge — delivered by you, not accidentally discovered — builds professional credibility instantly.

---

### Case B — The Same Numbers, Two Completely Different Returns

**Two clients, same total income ($65,000 net income), both Ontario residents.**

**Client 1: Marcus** — single, no children, no RRSP, rents at $1,200/month.
**Client 2: Helen** — married, two children (ages 3 and 7), $8,000 RRSP, rents at $1,200/month.

| Item | Marcus | Helen |
|---|---|---|
| Net income | $65,000 | $65,000 − $8,000 RRSP = **$57,000** |
| Federal tax (approx.) | ~$7,800 | ~$5,700 (lower taxable income) |
| Ontario tax (approx.) | ~$3,700 | ~$2,800 |
| GST/HST credit | ~$0 (phased out) | ~$130/year |
| CCB (2 children, $57,000 AFNI) | N/A | ($14,357 − [($57,000 − $36,502) × 19%]) = $14,357 − $3,895 = **$10,462/year** |
| OTB | ~$640 | ~$800 |
| **Combined annual value** | **~refund from withholding only** | **RRSP saves ~$2,370 in tax + $1,559 more CCB + $160 more OTB = $4,089 total value** |

Same income. Helen's RRSP generates **$4,089 in combined annual value** — from one planning decision costing $8,000 that generates a 51% immediate return. Marcus, with no RRSP and no children, has a straightforward but optimized return.

The key architectural insight: Helen's T1 has more sections to complete (childcare check, ON-BEN with family calculation, CCB via RC66 if not already set up), but each additional section represents additional value for her family.

---

### Case C — Reading an Unexpected NOA

**Client:** Patricia filed her return in March showing a $4,200 refund. Her NOA arrives in April showing a $1,800 refund and an explanation that CRA added $12,400 to her income on Line 12100.

**The investigation:**
Patricia had a 5-year GIC that matured in November. The bank sent a T5 to CRA with $12,400 in interest (Box 13). Patricia forgot about this GIC entirely — she hadn't thought about it in years.

**The T5 was in CRA's system. It was not on the filed return. CRA added it automatically.**

**The calculation:**
Additional income: $12,400. At Patricia's combined 29.65% marginal rate: $12,400 × 29.65% = **$3,677 in additional tax**. Her refund went from $4,200 to $4,200 − $3,677 = $1,523. (Close to the $1,800 NOA result after considering the impact on benefit calculations.)

**What you tell Patricia:**
*"CRA found a T5 for a GIC that matured — you had $12,400 in interest income that wasn't on your return. The slip went directly from your bank to CRA and it appeared in their matching system. This happens frequently with maturing GICs — the bank issues the T5 automatically. Your refund was reduced by approximately $3,700 in additional tax on that interest. There's no penalty in this case because you didn't deliberately omit it — CRA simply corrected it on assessment. For next year, let's verify all your GIC maturity dates in advance so we catch these before filing."*

**The prevention for next year:** CRA My Account slip verification before filing. Patricia's T5 was in the system. Had you checked, you would have found it and included it before filing — and Patricia would have understood her $500 refund instead of being surprised by a $2,400 reduction to her expected $4,200.

This case is why the AFR (Auto-fill my return) step is not a convenience feature. It is professional quality control.

---

## 2.14 Week 2 Summary

!!! success "What you learned this week"
    - The T1 has **four sections** in strict sequence: Identification → Total Income → Net/Taxable Income → Tax and Credits. No section can be completed without the ones before it
    - **Province of residence = December 31.** Always. Not work location, not prior residence, not "where they mostly lived." This single rule affects the entire provincial tax calculation, provincial credits, and benefit eligibility
    - **Line 15000 (Total Income)** — every dollar from every source. Employment, pensions, dividends, interest, capital gains, self-employment, rental. If you're unsure, include it first
    - **Line 23600 (Net Income)** — the master lever. Drives both income tax AND every income-tested benefit (CCB, GST/HST, OAS clawback, Age Amount, OTB, spousal credit). Deductions above this line are worth more than deductions below it for clients receiving benefits
    - **Line 26000 (Taxable Income)** — Net Income minus specific additional deductions. What the brackets actually apply to
    - **Schedule 1** calculates federal tax at federal rates and subtracts federal non-refundable credits at **15%**. Non-refundable credits cannot reduce tax below zero
    - **ON428** calculates Ontario tax independently. Ontario BPA = **$11,865** (not $16,129). Ontario Age Amount phase-out starts at **$42,335** (lower than federal $44,325). Ontario surtax: 20% above $5,315, additional 36% above $6,802
    - **T4 Box 40 is already inside Box 14** — never add it to Line 10100
    - **T4A Box 48 always creates a T2125** — never goes directly to Line 10100
    - **T3 slips arrive March 31** — never file investment clients before April 1
    - **T5008 Box 20 is unreliable for ACB** — always verify from original purchase records
    - **Dividends:** always use the grossed-up (taxable) amount — Box 11 for eligible, Box 25 for non-eligible. Never the actual amount received
    - The **NOA** confirms assessment within ~2 weeks for EFILE. Any change from the filed return: investigate, understand, and act within **90 days** if you disagree
    - Six structural errors to prevent every time: T4A Box 48 misclassification, Box 40 double-counting, childcare on wrong spouse, unreliable ACB, missing slips, wrong province

---

## ✅ Week 2 Quiz

When you're ready, ask Claude: **"Quiz me on Week 2"** for an interactive test.

??? question "1. A client moved from Manitoba to Ontario on December 20, 2025. Which province's tax is applied to their full year's income? What does their provincial tax return look like? Do they qualify for Ontario Trillium Benefit?"
    **Ontario tax applies to their entire year's income.** Province of residence is December 31 — they were an Ontario resident on that date. This means ON428 is used for provincial tax (not Manitoba rates), all Ontario non-refundable credits apply (including the Ontario BPA of $11,865, not Manitoba's amounts), and their full year's taxable income is calculated at Ontario rates — including the months they lived in Manitoba. They qualify for Ontario Trillium Benefit — but ON-BEN should only reflect rent paid while an Ontario resident (December 20–31 in this case, approximately 11 days of rent — a very small amount). The Manitoba rent does not count on ON-BEN. They receive no Manitoba provincial credits — they were not Manitoba residents on December 31.

??? question "2. A client's T4 shows Box 14 = $94,000 and Box 40 = $7,200 (representing company car and parking benefits). What amount goes on Line 10100, and why?"
    **$94,000 on Line 10100 — nothing else.** Box 40 reports the value of taxable benefits, but these amounts are **already included inside Box 14.** The employer calculated the taxable value of the car and parking benefit, added it to the base salary, and reported the combined total in Box 14. Box 40 is a breakdown for information purposes — not additional income. Entering $94,000 + $7,200 = $101,200 would overstate income by $7,200, resulting in approximately $7,200 × 29.65% = $2,135 in excess tax paid. This is one of the most common new-preparer errors on T4 processing.

??? question "3. Patricia receives a T5 with Box 24 (actual non-eligible dividends) = $3,500 and Box 25 (taxable amount) = $4,025. What amount goes on Line 12000, and why is it not $3,500?"
    **$4,025 goes on Line 12000** — the taxable (grossed-up) amount, always. Non-eligible dividends are grossed up by 15% ($3,500 × 1.15 = $4,025). The gross-up represents the pre-tax corporate income from which the dividend was paid — it conceptually restores the income to its pre-tax level. The corresponding Dividend Tax Credit (T5 Box 26 = $4,025 × 9.0301% = $363) then partially compensates for the corporate tax already paid. Reporting the actual $3,500 instead of the taxable $4,025 would both understate income AND produce an incorrect DTC calculation — a compounding error. The taxable amount (Box 25) is always what goes on Line 12000 for non-eligible dividends.

??? question "4. A client has Ontario basic tax of $8,200 after applying Ontario non-refundable credits. Calculate their Ontario surtax precisely, showing both tiers."
    **Tier 1 surtax:** $8,200 exceeds $5,315. Excess: $8,200 − $5,315 = $2,885. Tier 1 surtax: $2,885 × 20% = **$577**. **Tier 2 surtax:** $8,200 also exceeds $6,802. Excess: $8,200 − $6,802 = $1,398. Tier 2 additional surtax: $1,398 × 36% = **$503**. **Total Ontario surtax: $577 + $503 = $1,080**. **Total Ontario tax: $8,200 + $1,080 = $9,280.** Note: the surtax is applied on top of Ontario basic tax, increasing the effective Ontario rate well above the nominal bracket rates. At this level of Ontario basic tax (approximately $100,000–$115,000 total income), both surtax tiers apply, pushing the effective Ontario rate significantly higher than the 11.16% or 12.16% bracket rates suggest.

??? question "5. A client has a T4A with Box 16 = $42,000 (DB pension from a former employer) and Box 48 = $8,400 (consulting fees from a business that hired them for a project). Where does each box go on the T1, and what additional obligations does Box 48 create?"
    **T4A Box 16 = $42,000:** Line **11500** (Other Pensions and Superannuation). This is pension income eligible for the Pension Income Credit ($2,000 maximum × 15% = $300 federal credit) and potentially eligible for pension income splitting under Form T1032. No CPP obligation. **T4A Box 48 = $8,400:** Creates a **T2125** (Statement of Business or Professional Activities), with net income flowing to Line **13500**. Additional obligations: (1) CPP on self-employment must be calculated on Schedule 8 — net consulting income of $8,400 minus $3,500 basic exemption = $4,900 × 11.9% = $583 total CPP ($292 deductible at Line 22200, $291 as a credit at Line 31000). (2) Any legitimate business expenses incurred to earn the consulting income are deductible on T2125 (phone, home office proportion, etc.). (3) HST registration consideration if total consulting revenue crosses $30,000 in any rolling 12-month period. The T4A Box 48 income cannot simply be put on Line 10100 — it must go through T2125.

??? question "6. Your client filed in February showing a $3,800 refund. Their NOA arrives in April showing a $1,100 balance owing — a $4,900 swing. CRA's explanation says they added $16,500 to Line 12100. What happened, what should have prevented this, and what does the client do now?"
    **What happened:** A T5 slip for $16,500 in interest income was filed with CRA by a financial institution but was not included on the return. This is the classic scenario where a GIC matured or an investment account generated significant interest income that the client forgot about or didn't bring to the appointment. CRA's automatic T-slip matching identified the discrepancy and added the income. The $16,500 at approximately 29.65% combined rate = $4,891 in additional tax, converting the $3,800 refund to approximately a $1,100 balance owing. **What should have prevented this:** CRA My Account verification of all filed slips before filing. Running Auto-fill my return (AFR) for any client with investment or savings accounts would have shown this T5 in CRA's system. **What the client does now:** Accept the reassessment (the income is real and was legitimately earned). Pay the $1,100 balance by April 30 to avoid further interest. Note: there is no late-filing penalty (the original return was filed on time — CRA simply corrected the income amount). Interest accrues from April 30 on the unpaid balance. For next year: include this T5 in the intake checklist and verify through CRA My Account before filing.

??? question "7. Explain the architectural difference between a deduction at Line 20800 (RRSP) and a deduction at Line 25300 (capital loss carry-forward), and why this matters for a client with two young children who qualifies for the Canada Child Benefit."
    **Line 20800 (RRSP deduction) reduces Net Income (Line 23600):** It sits above the Net Income calculation. This means it: (1) reduces income tax at the marginal rate, AND (2) reduces AFNI for CCB calculations. For a client with two young children earning $55,000 whose AFNI drops by $10,000 via RRSP: tax saving = $10,000 × 29.65% = $2,965; CCB increase = $10,000 × 19% (2-child phase-out rate) = $1,900/year more CCB. Total combined annual benefit: **$4,865**. **Line 25300 (capital loss carry-forward) reduces Taxable Income (Line 26000):** It sits below Net Income. This means it: (1) reduces income tax at the marginal rate ✅, BUT (2) does NOT reduce Net Income or AFNI. CCB is unchanged. For the same client, a $10,000 capital loss carry-forward generates tax saving of $2,965 — but zero additional CCB. **The difference in outcome: $1,900/year.** Same $10,000 deduction. Very different results for a family with children. This is why understanding where on the T1 architecture a deduction lives is not academic — it directly determines how much a client benefits from tax planning strategies.

---

## 📚 Further Reading

- [CRA: T1 General — current tax year package](https://www.canada.ca/en/revenue-agency/services/forms-publications/tax-packages-years/general-income-tax-benefit-package.html)
- [CRA: Understanding your T4 slip — box by box](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/tax-slips/understand-your-tax-slips/t4-slips.html)
- [CRA: T5 — return of investment income](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t5.html)
- [CRA: Understanding your Notice of Assessment](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/notice-assessment-understand.html)
- [CRA: Ontario Tax — Form ON428](https://www.canada.ca/en/revenue-agency/services/forms-publications/tax-packages-years/general-income-tax-benefit-package/ontario.html)
- [CRA: Schedule 1 — Federal Tax](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/5000-s1.html)
- [CRA: Capital gains — adjusted cost base](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/adjusted-cost-base.html)

---

!!! tip "Up Next: Week 3"
    **Filing Basics** — Who must file. Who should file even when not required. The residency analysis for every client situation. SIN rules and obligations. Every filing deadline with exact penalty calculations for late filers. The T1-ADJ amendment process for fixing returns. The Voluntary Disclosure Program for clients who haven't filed in years. Week 3 is the operational framework that surrounds the T1 knowledge you built this week — the rules of the game rather than the game itself.
