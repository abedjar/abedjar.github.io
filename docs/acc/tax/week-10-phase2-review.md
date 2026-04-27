# Week 10: Phase 2 Review — Five Income Types, One Return, No Confusion

!!! info "What This Week Is"
    Week 10 is the pressure test for everything Weeks 5 through 9 built. No new rules — only application. Every income type you have learned (employment, investment, capital gains, self-employment, rental) appears simultaneously on real client returns this week. You will trace each dollar from the document it arrived on to the exact line on the T1, interact the income types correctly, calculate the tax, identify the planning opportunities, and confirm that your Phase 2 foundation is solid before Phase 3 (deductions and credits) layers on top of it.

    **This week's structure:**
    - 10.1 — Phase 2 master reference: every income type on one page
    - 10.2 — The income interaction map: how income types affect each other
    - 10.3 — The Net Income master lever revisited: how each income type flows through benefits
    - 10.4 — Multi-source return Simulation 1: Victor Mensah — five income types simultaneously
    - 10.5 — Multi-source return Simulation 2: The Chen family — two complete returns, linked
    - 10.6 — The instalment calculation: when and how much
    - 10.7 — The error hunt: eight returns with embedded income-type mistakes
    - 10.8 — Phase 2 comprehensive quiz: 15 questions
    - 10.9 — Phase 2 readiness checklist

!!! warning "Work every simulation before reading the answer key"
    The gap between what you produce and what the answer shows is your most honest learning signal. If you can complete Simulations 1 and 2 accurately and within 45 minutes each — you are ready for Phase 3. If specific income types slow you down or produce errors — return to that week before proceeding.

---

## 10.1 Phase 2 Master Reference — Every Income Type on One Page

Commit this table to memory. In your first tax season, you will reach for this mental map constantly.

| Income Type | Source Document | T1 Line | Critical Rule |
|---|---|---|---|
| Employment income | T4 Box 14 | **10100** | Box 40 already inside Box 14 — never add separately |
| Other employment income | No slip | **10400** | Cash tips, gratuities, director fees without T4 |
| OAS pension | T4A(OAS) | **11300** | Clawback above $90,997 net income |
| CPP benefits | T4A(P) | **11400** | Fully taxable. Eligible for pension income splitting at 65+ |
| Other pensions, RRIF | T4A Box 16, T4RIF | **11500** | Eligible for pension income credit ($2,000 limit) |
| Employment Insurance | T4E | **11900** | Always taxable — parental EI, sickness, regular |
| Eligible dividends (taxable) | T5 Box 11, T3 Box 32 | **12000** | Grossed-up 38% — NEVER use Box 10 or Box 24 |
| Non-eligible dividends (taxable) | T5 Box 25, T3 Box 49 | **12000** | Grossed-up 15% — use Box 25, not Box 24 |
| Interest income | T5 Box 13, T3 Box 26 | **12100** | GIC accrual annual — even without cash receipt |
| Foreign income | T5 Box 15 | **12100** | No gross-up. Convert to CAD at Bank of Canada rate |
| Net rental income | T776 | **12600** | CCA cannot create or increase a rental loss |
| Taxable capital gains | Schedule 3 (T5008, T2091) | **12700** | 50% inclusion. ACB from records — not T5008 Box 20 |
| RRSP withdrawals | T4RSP Box 22 | **12900** | Fully taxable. Withholding usually insufficient |
| Other income | T4A Box 28, various | **13000** | Support payments received, grants, retiring allowance |
| RESP / scholarships | T4A Box 40/105 | **13010** | EAP in student's hands; scholarships mostly exempt |
| Net self-employment — business | T2125 | **13500** | Net after all expenses + CCA. CPP at 11.9% |
| Net self-employment — professional | T2125 | **13700** | Same form, different line — doctors, lawyers, accountants |
| Net self-employment — commission | T2125 | **13900** | Same form — broader expense eligibility |

**Then: deductions to Net Income (Line 23600):**

| Deduction | Line | Key Rule |
|---|---|---|
| RRSP deduction | 20800 | Deduction limit from prior NOA — never exceed |
| RPP contributions | 20700 | T4 Box 20 |
| Union dues | 21200 | T4 Box 44 + professional dues |
| Childcare expenses | 21400 | Lower-income spouse claims |
| Moving expenses | 21900 | 40 km distance test |
| Employment expenses | 22900 | T777 — requires T2200 |
| CPP on self-employment (50%) | 22200 | Deductible half reduces Net Income |
| Carrying charges | 22100 | Investment loan interest, advisory fees |
| Support payments made | 23200 | Court-ordered to former spouse only |

```
ALL FIVE INCOME TYPES → ONE T1 RETURN
═══════════════════════════════════════════════════════════════════════
Employment (T4)        → Line 10100 ─┐
Self-Employment (T2125) → Line 13500 ─┤
Rental (T776)           → Line 12600 ─┼→ LINE 15000: TOTAL INCOME
Investment (T5/T3)      → Line 12100 ─┤    (every dollar from every source)
Capital Gains (Sched 3) → Line 12700 ─┘
                                           │
                              Minus above-the-line deductions
                              (RRSP, union dues, childcare, T777...)
                                           │
                                   LINE 23600: NET INCOME
                              (used for: CCB, OTB, GST credit,
                               OAS clawback, benefit phase-outs)
                                           │
                              Minus below-the-line deductions
                              (capital loss carry-forwards, etc.)
                                           │
                                   LINE 26000: TAXABLE INCOME
                              (tax brackets applied here)
═══════════════════════════════════════════════════════════════════════
```

---

## 10.2 The Income Interaction Map — How Types Affect Each Other

Different income types don't just add up on Line 15000 — they interact with each other in ways that change the tax result. Understanding these interactions is what separates a preparer who can handle complexity from one who can only handle simple returns.

### Interaction 1 — Rental Operating Loss vs. Employment Income

**Rule:** Rental operating losses (from current expenses exceeding rental income, NOT from CCA) are fully deductible against employment income, pension income, and other income types on the same T1.

```
Employment income:         $72,000
Rental operating loss:    ($4,200)  ← T776, from expenses exceeding rent
Net income before other deductions: $67,800
```

**The CCA distinction:** Only operating losses (current expenses) can shelter other income. CCA cannot create the loss. If the T776 was already at a loss before CCA — CCA = $0, and that loss flows to Line 12600 negative.

!!! example "Case — Patricia's rental loss shelters employment income"
    Patricia earns $72,000 employment income. Her rental property generates:
    Gross rent: $18,400. Current expenses: $22,600. Operating loss: ($4,200).
    No CCA claim (loss already exists).

    Patricia's Line 12600: ($4,200) — deducted from her combined income.
    Her net income is reduced by $4,200, saving $4,200 × 29.65% = **$1,245 in combined tax.**

    This is why owning a rental property that runs at an operating loss (typically in early years when mortgage interest is high) can reduce a client's overall tax bill. It is not tax avoidance — it is the legislative intent.

### Interaction 2 — Business Loss vs. Employment Income

**Rule:** Net business losses (from T2125) are fully deductible against all other income — including employment. Unlike rental losses, CCA can create or deepen a business loss (it is not restricted).

```
Employment income:                $68,000
Business loss (T2125):           ($12,400)  ← including CCA
Net income before other deductions: $55,600
```

A business that has start-up losses in Year 1 effectively reduces the tax on the owner's employment income. This is one reason many clients with side businesses experience larger-than-expected tax savings in the early years.

**Carry-forward:** A net business loss can be carried back 3 years (T1-ADJ) or forward **20 years**. This is different from capital losses (indefinite carry-forward) and rental losses (no specific carry-forward — they just reduce income in the year).

### Interaction 3 — Capital Losses vs. Capital Gains Only

**Rule:** Capital losses can ONLY offset capital gains. They cannot offset employment, rental, business, or pension income.

```
Employment income:     $78,000
Capital gain:          $14,000  ← from stock sale
Capital loss:         ($8,000)  ← from another stock sale
Net capital gain:       $6,000  ← 50% taxable = $3,000 taxable capital gain
```

What a capital loss CANNOT do:
```
Employment income:     $78,000
Capital loss:         ($8,000)  ← CANNOT reduce employment income
                                    Carries forward to future capital gains
```

**Carry-back:** A net capital loss in the current year can be carried BACK 3 years to reclaim tax already paid on prior capital gains. File a T1-ADJ. This is often the optimal strategy when there are large gains in one year and losses in another.

### Interaction 4 — Self-Employment Income and Benefit Phase-Outs

Net self-employment income (after CPP deduction) adds directly to Net Income — affecting all income-tested benefits.

For a self-employed client with two children earning $58,000 net:
- CCB phase-out for 2 children: $58,000 > $36,502 threshold → some CCB reduced
- RRSP contribution → reduces net income → increases CCB

The CPP deductible half (Line 22200) reduces Net Income before benefits are calculated — one of the few "free" reductions for self-employed individuals.

### Interaction 5 — Dividend Gross-Up and Net Income

This is a subtle but important effect that affects high-income clients receiving eligible dividends.

The grossed-up amount (Box 11 or Box 25) is what appears on Line 12000 — not the cash received. This higher amount increases Net Income — which can:
- Push seniors above the OAS clawback threshold
- Reduce the Age Amount credit
- Reduce the GST/HST credit
- Increase Ontario surtax exposure

!!! example "Case — Dividend gross-up pushes George into OAS clawback"
    George, 72, receives $10,000 in eligible dividends. Grossed up: $10,000 × 1.38 = $13,800 on Line 12000.

    Without dividends, his net income: $88,000.
    With grossed-up dividends: $88,000 + $13,800 = $101,800.

    OAS clawback threshold: $90,997. Excess: $101,800 − $90,997 = $10,803.
    OAS clawback: $10,803 × 15% = $1,620.

    George received $10,000 in dividends and faces $1,620 in OAS clawback PLUS his normal income tax on the dividends. The gross-up mechanism that makes dividends tax-efficient at most income levels becomes a hidden cost at OAS clawback territory.

    **Planning implication:** For clients near the OAS threshold, shifting investments from dividend-paying stocks to capital-gain-generating assets (which don't generate grossed-up amounts — only 50% of the gain enters net income) can reduce or eliminate the OAS clawback. This is a planning conversation, not a filing conversation — but recognizing it during the return prep is what triggers it.

### Interaction 6 — Multiple Income Types and the Combined Marginal Rate

When a client has employment income at $95,000 AND $15,000 in rental income AND $8,000 in capital gains:
The combined income of $118,000 means the rental income and capital gains are being taxed at the HIGHER combined marginal rate applicable to incomes above $102,895 (37.16% bracket) — not at the rate that would apply if they were earned in isolation.

The order of income on the T1 doesn't change the tax — all income is combined and the brackets apply progressively to the total. But the marginal rate on the "last" income type depends on everything else earned.

---

## 10.3 The Net Income Master Lever — Applied to All Five Income Types

Net Income (Line 23600) controls not just the income tax calculation — it controls every income-tested benefit. This is the architectural concept that runs through all five Phase 2 income types.

### How Each Income Type Affects Net Income

| Income Type | Adds to Net Income? | Benefit Effect |
|---|---|---|
| Employment income | ✅ Full amount | Increases Net Income → reduces benefits |
| Investment interest | ✅ Full amount | Increases Net Income |
| Eligible dividends | ✅ Grossed-up amount (38% more than received) | Increases Net Income MORE than cash received |
| Taxable capital gains | ✅ 50% of gain | Increases Net Income — less than full gain |
| Self-employment income (net) | ✅ After CPP deduction | CPP deductible half reduces Net Income |
| Rental income (net) | ✅ Net of expenses | Operating losses REDUCE Net Income |
| RRSP deduction | ❌ Reduces Net Income | Most powerful single reducer of benefits |

### The Planning Summary in One Sentence

*Every dollar you add to Net Income costs you money twice — in income tax AND in reduced benefits. Every dollar you remove from Net Income saves you money twice — in income tax AND in improved benefits.*

This is why a $10,000 RRSP contribution for a parent with two children at $52,000 income saves $10,000 × 29.65% in tax = $2,965 AND generates $10,000 × 19% (2-child CCB phase-out rate) = $1,900 in additional annual CCB = **$4,865 in total annual value** from one $10,000 decision.

---

## 10.4 Simulation 1 — Victor Mensah: Five Income Types Simultaneously

Victor is a 42-year-old Ontario resident working as a project manager. He also has investment accounts, sold a rental condo this year, and completed consulting work on the side. This return touches all five Phase 2 income types.

Work through all seven steps before checking the answer key.

### Victor's Complete 2025 Document Package

**Employment:**
- T4 from employer: Box 14 = $86,000, Box 16 = $3,867, Box 18 = $1,049, Box 22 = $20,200, Box 44 = $720, Box 52 = $0

**Investment (non-registered account):**
- T5 from RBC: Box 13 = $940 (interest), Box 11 = $3,588 (taxable eligible dividends — already grossed up), Box 12 = $539 (federal DTC)
- T3 from Canadian REIT ETF: Box 21 = $2,600 (capital gains), Box 32 = $828 (taxable eligible dividends), Box 33 = $124 (federal DTC), Box 42 = $440 (return of capital — reduces ACB)

**Capital Gains:**
- Sold 300 shares of TD Bank: Proceeds $28,800, ACB (verified from records) $18,300, commission on sale $9.99

**Self-Employment (consulting — T4A Box 48 from two clients):**
- Client A T4A Box 48 = $18,400
- Client B T4A Box 48 = $12,200
- Home office: 120 sq ft of 880 sq ft apartment (13.6%); monthly rent $1,550
- Cell phone: $1,440/year, 85% business
- Software subscriptions: $960/year
- MacBook (purchased March 2025, $2,600, Class 50, 55%)

**Rental (sold mid-year):**
- Rental condo sold April 2025 for $540,000
- Original purchase price 2016: $295,000 (land 20% = $59,000, building 80% = $236,000)
- CCA claimed over 9 years: building UCC remaining = $168,000
- Rental income Jan–March (3 months at $2,100/month): $6,300
- Rental expenses Jan–March: $4,800 (mortgage interest $3,100, condo fees $900, taxes $800)

**RRSP:** $8,000 contribution in February. Prior deduction limit from NOA: $19,400.

---

### Step 1 — Identify and Classify Every Document

Before calculating, classify every item:

| Document | Type | Form/Line |
|---|---|---|
| T4 Box 14 = $86,000 | Employment income | Line 10100 |
| T4 Box 16 = $3,867 | CPP — credit | Line 30800 credit |
| T4 Box 18 = $1,049 | EI — credit | Line 31200 credit |
| T4 Box 22 = $20,200 | Tax withheld | Line 43700 |
| T4 Box 44 = $720 | Union dues | Line 21200 deduction |
| T5 Box 13 = $940 | Interest | Line 12100 |
| T5 Box 11 = $3,588 | Eligible dividends (grossed up) | Line 12000 |
| T5 Box 12 = $539 | Federal DTC eligible | Line 40425 |
| T3 Box 21 = $2,600 | Capital gains from trust | Schedule 3 → Line 12700 |
| T3 Box 32 = $828 | Eligible dividends from trust (grossed up) | Line 12000 |
| T3 Box 33 = $124 | Federal DTC eligible (trust) | Line 40425 |
| T3 Box 42 = $440 | Return of capital | Reduces ACB — NOT income |
| TD Bank shares — capital gain | Capital property sold | Schedule 3 |
| T4A Box 48 × 2 | Self-employment income | T2125 → Line 13500 |
| Rental condo sold | Rental income (partial year) + recapture + capital gain | T776 + Schedule 3 |
| RRSP receipt | RRSP deduction | Line 20800 |

---

### Step 2 — Total Income (Line 15000)

**Employment: $86,000**

**Investment — Line 12000 (dividends):**
T5 Box 11 eligible: $3,588
T3 Box 32 eligible: $828
Total Line 12000: **$4,416**

**Investment — Line 12100 (interest):**
T5 Box 13: $940
Total Line 12100: **$940**

**Capital gains — Schedule 3:**

| Disposition | Proceeds | ACB | Outlay | Gain/Loss |
|---|---|---|---|---|
| TD Bank (300 shares) | $28,800 | $18,300 | $9.99 | $10,490 |
| REIT ETF (T3 Box 21) | — | — | — | $2,600 (trust distribution) |
| Rental condo — land (20% of $540,000) | $108,000 | $59,000 | — | $49,000 |
| Rental condo — building appreciation | $236,000+ sold | $236,000 original cost | — | $196,000 (above original cost — capital gain) |

Wait — let's calculate the rental condo correctly:

Rental condo allocation:
Land (20%): $540,000 × 20% = $108,000. ACB: $59,000. Capital gain: $49,000.
Building (80%): $540,000 × 80% = $432,000. Original building cost: $236,000. Building appreciation (capital gain): $432,000 − $236,000 = $196,000.
Recapture: building original cost ($236,000) − remaining UCC ($168,000) = $68,000 (added to rental income — not a capital gain).

Total capital gains:
TD Bank: $10,490
REIT trust: $2,600
Rental condo land: $49,000
Rental condo building: $196,000
**Total capital gains: $258,090**
Taxable capital gains (50%): $129,045 → **Line 12700**

**Rental income (Jan–Mar 2025):**
Gross rent: $6,300
Expenses: ($4,800)
Net rental before CCA: $1,500
Recapture: $68,000 (added to income — see note below)

*Note: Recapture on rental property sale is reported as rental income in the year of disposition. It goes on Line 12600 (or as part of the rental income section, increasing it). For T1 purposes, recapture appears as income on Line 12600 plus the net rental operating income.*

Line 12600 rental: $1,500 + $68,000 = **$69,500**

**Self-employment gross income:**
Client A: $18,400 + Client B: $12,200 = $30,600 gross

T2125 expenses:
Home office: (rent $1,550 × 12 = $18,600) × 13.6% = $2,530
Cell phone: $1,440 × 85% = $1,224
Software: $960
MacBook CCA (Class 50): $2,600 × 55% × 50% (half-year) = $715
Total T2125 deductions: $5,429
**Net self-employment income: $30,600 − $5,429 = $25,171 → Line 13500**

**Total Income (Line 15000):**

| Line | Amount |
|---|---|
| 10100 Employment | $86,000 |
| 12000 Dividends | $4,416 |
| 12100 Interest | $940 |
| 12600 Rental + Recapture | $69,500 |
| 12700 Taxable capital gains | $129,045 |
| 13500 Self-employment | $25,171 |
| **15000 TOTAL INCOME** | **$315,072** |

---

### Step 3 — Net Income (Line 23600)

| Deduction | Line | Amount |
|---|---|---|
| RRSP | 20800 | ($8,000) |
| Union dues | 21200 | ($720) |
| CPP on self-employment (50% of $25,171 − $3,500 = $21,671 × 11.9% = $2,579 ÷ 2) | 22200 | ($1,290) |
| **Net Income** | **23600** | **$305,062** |

---

### Step 4 — Taxable Income (Line 26000)

No capital loss carry-forwards, no additional deductions.
**Taxable Income: $305,062**

---

### Step 5 — Federal Tax (Schedule 1)

Federal brackets on $305,062:
$57,375 × 15% = $8,606
$57,375 × 20.5% = $11,762 ($57,376–$114,750)
$43,769 × 26% = $11,380 ($114,751–$158,519)
$61,481 × 29% = $17,829 ($158,520–$220,000)
$85,062 × 33% = $28,070 ($220,001–$305,062)
**Gross federal tax: $77,647**

Federal credits:
BPA: $16,129 × 15% = $2,419
CPP: $3,867 × 15% = $580
EI: $1,049 × 15% = $157
Canada Employment Amount: $1,433 × 15% = $215
DTC eligible: $539 + $124 = $663
CPP on self-employment credit (50%): $1,290 × 15% = $194
Total credits: **$4,228**

**Net federal tax: $77,647 − $4,228 = $73,419**

---

### Step 6 — Ontario Tax (ON428)

Ontario brackets on $305,062:
$51,446 × 5.05% = $2,598
$51,448 × 9.15% = $4,707 ($51,447–$102,894)
$47,106 × 11.16% = $5,257 ($102,895–$150,000)
$70,000 × 12.16% = $8,512 ($150,001–$220,000)
$85,062 × 13.16% = $11,194 ($220,001+)
**Ontario basic tax: $32,268**

Ontario surtax:
Tier 1: ($32,268 − $5,315) × 20% = $26,953 × 20% = $5,391
Tier 2: ($32,268 − $6,802) × 36% = $25,466 × 36% = $9,168
Total surtax: **$14,559**

Ontario credits (×5.05%): approximately $919 (BPA + employment + CPP/EI)
Ontario DTC (eligible dividends: $4,416 × 10.0% = $442)
Total Ontario credits: approximately $1,361

**Net Ontario tax: ($32,268 + $14,559) − $1,361 = $45,466**

---

### Step 7 — Final Calculation

```
Net federal tax (42000):              $73,419
Net Ontario tax (ON428):              $45,466
CPP on self-employment credit (30000): (already included in credits above)
─────────────────────────────────────────────────
Total Payable (43500):               $118,885

Tax withheld (43700):               ($20,200)
─────────────────────────────────────────────────
BALANCE OWING (48500):               $98,685
```

**Victor owes $98,685 at filing!**

!!! warning "This is why self-employed high earners must make quarterly instalments"
    Victor's rental condo sale generated $258,090 in capital gains and $68,000 in recapture — neither of which had any tax withheld at source. His employment withholding of $20,200 covered only his T4 income. The $98,685 balance owing with no instalments made will also trigger instalment interest from May 1.

    Victor needed to make instalment payments as each large transaction occurred. In particular, when the condo sale closed in April, he should have immediately calculated the approximate tax owing ($68,000 recapture + $245,000 capital gain × 50% = $122,500 additional taxable income × ~46% combined rate = ~$56,000 in additional tax) and made an instalment payment.

### Professional Insights on Victor's Return

**Insight 1 — T3 Box 42 ($440 return of capital):**
This is NOT income — it reduces the ACB of the REIT ETF. Victor's ACB for that holding must be reduced by $440 for future dispositions. If ignored, when he eventually sells, the capital gain will be understated.

**Insight 2 — The $98,685 balance:**
Victor must pay this by April 30. If he can't — interest runs at ~9% annual compounding from that date. On $98,685, that's approximately $24/day in interest. A 60-day delay costs approximately $1,440 in avoidable interest.

**Insight 3 — 2026 instalment obligation:**
Victor's combined tax for 2025 was $118,885. He should expect instalments for 2026. If 2026 income is similar, quarterly payments of approximately $25,000 each (March 15, June 15, September 15, December 15) would eliminate any year-end surprise.

---

## 10.5 Simulation 2 — The Chen Family: Two Complete Returns, Linked

Helen and Victor Chen are married Ontario residents. Their returns are filed separately — but they affect each other through the spousal credit, CCB, and benefit calculations.

Work through both returns, then check the combined analysis.

### Victor Chen — 52, IT Manager

**T4:** Box 14 = $92,000, Box 16 = $3,867, Box 18 = $1,049, Box 22 = $21,400, Box 44 = $840
**T5:** Box 13 = $1,180 (interest), Box 11 = $2,484 (eligible dividends grossed up), Box 12 = $373 (federal DTC)
**RRSP:** $12,000 contribution. Prior limit: $22,000.
**Rental property:** Net operating income before CCA = $3,200. Building UCC: $180,000. CCA available: $7,200 (4%). CCA claimed: $3,200 (limited to income).

Net rental income after CCA: **$0**

### Helen Chen — 49, Part-Time Nurse (Returns From Maternity Leave)

**T4:** Box 14 = $38,000, Box 16 = $2,050, Box 18 = $631, Box 22 = $7,800, Box 44 = $0
**T4A (maternity EI, first 4 months):** Box 14 = $14,800 (parental EI benefits), Box 22 = $1,480
**T5:** Box 13 = $280 (interest)
**Childcare:** Paid $9,600 for daycare (two children, ages 3 and 6)
**RRSP:** $5,000 contribution. Prior limit: $8,400.

### Step 1 — Victor's T1

**Total Income:**
Line 10100: $92,000
Line 12000: $2,484
Line 12100: $1,180
Line 12600: $0 (rental breaks even after CCA)
**Line 15000: $95,664**

**Net Income deductions:**
RRSP: ($12,000)
Union dues: ($840)
**Line 23600: $82,824**

**Federal tax on $82,824:**
$57,375 × 15% = $8,606
$25,449 × 20.5% = $5,217
Gross: $13,823

**Federal credits:**
BPA: $2,419
CPP: $580
EI: $157
Employment amount: $215
DTC: $373
Total: $3,744

**Net federal tax: $13,823 − $3,744 = $10,079**

**Ontario tax on $82,824:**
$51,446 × 5.05% = $2,598
$31,378 × 9.15% = $2,871
Ontario basic: $5,469

Ontario surtax: $5,469 > $5,315 → Tier 1: ($5,469 − $5,315) × 20% = $31
Ontario DTC ($2,484 × 10% = $248); Ontario credits ~$919 total: approximately $1,167
Net Ontario: ($5,469 + $31) − $1,167 = **$4,333**

**Victor's total payable: $10,079 + $4,333 = $14,412**
**Tax withheld: $21,400**
**Spousal credit: Helen's net income = $45,860 (calculated below) — above $16,129 threshold → $0 spousal credit for Victor**

**Victor's refund: $21,400 − $14,412 = $6,988 ✅**

---

### Step 2 — Helen's T1

**Total Income:**
Line 10100 (T4 employment): $38,000
Line 11900 (T4E parental EI): $14,800
Line 12100 (interest): $280
**Line 15000: $53,080**

**Net Income deductions:**
Childcare (T778): The lower-income spouse claims childcare. Helen earns $38,000 employment + $14,800 EI = $52,800 total, Victor earns $92,000. Helen is the lower-income spouse. Maximum childcare for 2 children: child aged 3 = $8,000 max; child aged 6 = $5,000 max; total potential claim $13,000. But limited to two-thirds of the lower-income spouse's income: 2/3 × $52,800 = $35,200 (well above the $9,600 paid). **Childcare claimed: $9,600** (the actual amount paid, which is below all applicable limits).
RRSP: ($5,000)
**Line 23600: $53,080 − $9,600 − $5,000 = $38,480**

**Federal tax on $38,480:**
$38,480 × 15% = $5,772 gross
Credits: BPA $2,419, CPP $308 ($2,050 × 15%), EI $95 ($631 × 15%), Employment $215, total: $3,037
Net federal tax: $5,772 − $3,037 = **$2,735**

**Ontario LIFT Credit check:**
Helen has employment income = $38,000. Net income = $38,480 (slightly above the LIFT threshold of approximately $30,000 for the individual).
The LIFT Credit is partially reduced at this income level but may still provide some relief. Approximately $200–$400 in Ontario tax eliminated.

**Ontario tax on $38,480:**
$38,480 × 5.05% = $1,943 gross
After Ontario BPA credit ($599) + employment amount ($72) + CPP × 5.05% ($104) = $775 credits
Ontario basic: $1,943 − $775 = $1,168
LIFT Credit: approximately $200 reduction
Net Ontario: approximately **$968**

**Helen's total payable: $2,735 + $968 = $3,703**

**Tax withheld:**
T4 Box 22: $7,800
T4A Box 22: $1,480
Total withheld: **$9,280**

**Helen's refund: $9,280 − $3,703 = $5,577 ✅**

---

### Step 3 — The Benefits Analysis (Where the Two Returns Connect)

**Canada Child Benefit:**
CCB is calculated on the family's **Adjusted Family Net Income (AFNI)** — the sum of both spouses' Net Income (Line 23600):
Victor: $82,824
Helen: $38,480
**Combined AFNI: $121,304**

At $121,304 AFNI with 2 children:
Maximum CCB (2 children under 6 and under 17): ~$14,357
Phase-out: ($121,304 − $79,087) × 5.7% (rate for 2 children at tier 2) = $42,217 × 5.7% = $2,406
(Plus prior tier phase-out from $36,502 to $79,087: this bracket's phase-out would have already reduced the CCB significantly)

Simplified: at $121,304 combined AFNI with 2 children — approximately **$2,800–$4,000/year in CCB** depending on ages.

**GST/HST credit:**
Family unit combined income above phase-out threshold → **$0 GST/HST credit** for the Chens.

**OTB — Ontario Trillium Benefit:**
If they rent — would phase out significantly at this income. If homeowners — property tax credit component available but reduced.

### Combined Family Tax Summary

| | Victor | Helen | Total |
|---|---|---|---|
| **Refund** | $6,988 | $5,577 | **$12,565** |
| **Net income (23600)** | $82,824 | $38,480 | $121,304 |
| **CCB** | — | — | ~$3,400/yr |
| **Total tax paid** | $14,412 | $3,703 | $18,115 |

**Professional observations on the Chen family:**

**Observation 1 — Childcare was correctly claimed on Helen's return (lower income).**
If a prior preparer had claimed it on Victor's return (higher income): the deduction reduces a higher-rate income → saves more tax. But CRA's rule is explicit: childcare must be claimed by the lower-income spouse (with narrow exceptions). It belongs on Helen's return. Claiming on Victor would be an error requiring a T1-ADJ.

**Observation 2 — Victor's rental CCA was correctly limited to income ($3,200).**
The available CCA was $7,200, but the limit was $3,200. The unclaimed $4,000 remains in UCC for future years. Victor's building UCC now: $180,000 − $3,200 = $176,800 for 2026.

**Observation 3 — Helen's parental EI is fully taxable.**
Helen's employer withheld $1,480 in tax on $14,800 in parental EI (10% withholding rate used by Service Canada). But Helen's actual marginal rate on this income (she was at $38,000 + $14,800 = $52,800) is in the 24.15% combined bracket. Her T4A EI is significantly under-withheld. Without the RRSP contribution and childcare deductions, she would have owed a balance. These deductions absorbed the under-withholding.

**Planning opportunity for next year:**
Victor's combined rate is approximately 29.65% on income from $57,376–$102,894. He has $10,000 remaining RRSP room ($22,000 − $12,000 used). Contributing $10,000 more would save:
Tax: $10,000 × 29.65% = $2,965
CCB improvement: AFNI drops from $121,304 to $111,304. CCB improvement: $10,000 × 5.7% = $570/year
**Total annual value: $3,535** — from $10,000 invested in RRSP.

---

## 10.6 The Instalment Calculation — When and How Much

When a client's combined federal and Ontario tax owing exceeds **$3,000** in the current year AND in at least one of the two prior years, CRA requires quarterly tax instalments for the following year.

### Three Methods to Calculate Instalments

CRA provides three methods. Clients choose the one that minimizes their payment while avoiding instalment interest.

=== "Method 1 — No-Calculation Method (CRA's Estimate)"

    CRA calculates expected instalments based on prior years and sends an instalment reminder letter. If the client simply pays these amounts, they avoid instalment interest regardless of the actual current-year tax.

    **Use when:** The client's income is similar to prior years and the CRA estimate is reasonable.

    **Risk:** If CRA's estimate is too high — the client overpays during the year (interest-free loan to CRA). If too low — client still owes the balance but no instalment interest.

=== "Method 2 — Prior Year Method"

    Pay equal quarterly instalments totalling 100% of the **prior year's** net tax owing.

    **Formula:** Prior year total tax ÷ 4 per quarter

    **Use when:** Current year income is expected to be similar to or lower than the prior year.

    **Advantage:** Simple. Uses a known number.

=== "Method 3 — Current Year Method"

    Pay equal quarterly instalments totalling 100% of the **estimated current year's** net tax owing.

    **Formula:** Estimated current year tax ÷ 4 per quarter

    **Use when:** Current year income is significantly lower than prior year (e.g., major capital gain last year, normal income this year).

    **Risk:** If the estimate is too low — instalment interest applies to the shortfall.

!!! example "Case — Victor's Instalment Calculation for 2026"
    Victor's 2025 combined tax: $118,885 (unusually high due to rental property sale).
    Victor's expected 2026 income: Employment $92,000 + consulting $28,000 = $120,000 net income (roughly). Expected 2026 combined tax: approximately $28,000.

    **Method 2 (prior year):** $118,885 ÷ 4 = $29,721 per quarter — massively overpays based on the 2025 one-time gain.

    **Method 3 (current year estimate):** $28,000 ÷ 4 = **$7,000 per quarter** — accurate if 2026 income as expected.

    Victor should use Method 3 — his 2025 income was an anomaly due to the property sale. He should document his 2026 income estimate and pay $7,000 quarterly. If his estimate is accurate, no instalment interest applies.

    **Instalment due dates:** March 15, June 15, September 15, December 15.

### When Instalment Interest Applies

CRA charges instalment interest when the actual quarterly payments fall short of the amounts required by whichever method the client is using. The interest rate is the same as the late-payment rate (~9% annual in 2025).

**CRA also charges an instalment penalty** when instalment interest exceeds $1,000 and the instalment payments were less than 75% of what was required. This penalty is 50% of the excess interest above $1,000 — a rare but real consequence for repeated significant instalment shortfalls.

---

## 10.7 The Error Hunt — Eight Returns With Embedded Income-Type Mistakes

These are statements from real client files. Each contains at least one material error spanning the Phase 2 income types. Find every error, explain why it's wrong, and state the correct treatment.

---

**Error 1:**
*"James has two T4s. T4 #1: Box 16 CPP = $3,600. T4 #2: Box 16 CPP = $2,800. I calculated his CPP credit as $6,400 × 15% = $960 and entered that on Schedule 1."*

??? success "Error 1 — Answer"
    **The error:** The CPP credit on Schedule 1 is calculated on the **maximum employee CPP contribution** ($3,867 in 2025) — not on the total withheld. The correct federal CPP credit: $3,867 × 15% = **$580.** The overstated credit of $960 reduces James's federal tax by $380 more than permitted. The excess CPP withheld ($6,400 − $3,867 = $2,533) is returned as a **CPP over-contribution credit at Line 44800** — not as an inflated credit on Schedule 1. These are two completely different items. The correct return shows: Schedule 1 CPP credit = $580; Line 44800 over-contribution credit = $2,533.

---

**Error 2:**
*"Patricia received a T5 Box 10 = $4,800 (actual eligible dividends). I entered $4,800 on Line 12000 and calculated the DTC as $4,800 × 15.0198% = $721."*

??? success "Error 2 — Answer"
    **The error — two separate errors in one entry:** First, dividends must be reported at the **taxable (grossed-up) amount** — Box 11, not Box 10. Box 11 = $4,800 × 1.38 = **$6,624** (the amount that goes on Line 12000). Second, the DTC is calculated on the taxable amount (Box 11), not the actual amount. The DTC is already calculated on the T5 in Box 12 — use Box 12 directly. DTC: $6,624 × 15.0198% = **$995** (or use the T5 Box 12 figure directly). Reporting $4,800 instead of $6,624: understates income by $1,824, creating a mismatch between Patricia's return and the T5 CRA received (Box 11 = $6,624). CRA will flag the discrepancy. Also, the DTC is then calculated on the wrong base — double error.

---

**Error 3:**
*"Karen bought a rental house in 2017 for $340,000. The city assessment allocates 30% land and 70% building. I have been claiming CCA at 4% on the full $340,000 purchase price every year."*

??? success "Error 3 — Answer"
    **The error:** CCA is only available on the **building portion** — never on land (land doesn't depreciate). The correct CCA base: $340,000 × 70% = **$238,000** (building only). Using the full $340,000 as the CCA base: overclaims CCA by $340,000 × 30% = $102,000 × 4% = $4,080/year in excess CCA. Over 8 years: approximately $32,640 in overclaimed CCA. This creates: (1) an inflated tax refund over 8 years, and (2) when the property sells, a dramatically higher recapture income — because the UCC has been artificially reduced. CRA would also assess gross negligence penalties if the overclaim is found in an audit and the scale of error is considered significant. The correct Class 1 UCC starting point: **$238,000**, not $340,000.

---

**Error 4:**
*"David's consulting business earned $68,000 in gross revenue. He spent $8,400 on a new car this year for the business. I deducted the full $8,400 as a business expense on the T2125."*

??? success "Error 4 — Answer"
    **The error:** A vehicle is a **capital asset** — it cannot be expensed in full as a current deduction on the T2125. Vehicle purchases go through **CCA (Capital Cost Allowance)** in the appropriate class (Class 10 if under $37,000; Class 10.1 if over $37,000). The correct treatment: determine the class based on the vehicle's cost, establish the UCC, apply the half-year rule (50% of rate in year of purchase), and multiply by the business-use percentage from the logbook. Deducting $8,400 as a current expense: overclaims the deduction in Year 1 (should be: $8,400 × 30% × 50% × business % = much less), and then there is no UCC remaining for future years. The vehicle's full cost should have been entered in the CCA schedule — not written off as an expense.

---

**Error 5:**
*"My client sold their principal residence in 2025. Full PRE exemption — no capital gain. I didn't include the sale on the return because there's nothing to report."*

??? success "Error 5 — Answer"
    **The error:** Since 2016, every principal residence sale must be reported on **Schedule 3** with **Form T2091** (Designation as Principal Residence) — even when the gain is fully exempt. The reporting obligation and the tax obligation are completely separate. Not reporting: CRA identifies the sale through land registry data. They send an inquiry. If the T2091 is filed late (after the original assessment date), the penalty is **$100/day late, minimum $100, maximum $8,000** — on a transaction with $0 tax owing. In some cases, CRA may deny the PRE claim entirely if the designation is never filed. The return must include Schedule 3 and a properly completed T2091. This takes 10 minutes and prevents an $8,000 penalty.

---

**Error 6:**
*"Victor's T2125 shows gross revenue of $46,800 and expenses of $28,200. Net income is $18,600. I claimed the home office deduction of $5,800 — which brings his T2125 income to $12,800. His employment income from T4 is $82,000. Total net income: $94,800."*

??? success "Error 6 — Answer"
    **The error is potentially correct — but requires verification of the home office loss restriction.** The home office deduction of $5,800 reduces net business income from $18,600 to $12,800 — this is fine **because there was positive income to absorb it** ($18,600 > $5,800). The home office deduction cannot reduce business income below zero. In this case, $18,600 − $5,800 = $12,800 is still positive, so the full $5,800 is allowable. **However:** A second check is needed. The gross revenue of $46,800 requires a T4A Box 48 reconciliation — does $46,800 match the sum of T4A Box 48 slips Victor received? If clients paid him $46,800 but only $36,000 shows in T4A slips, the remaining $10,800 must be self-reported cash revenue. If $46,800 doesn't match available T4A data, the return may understate income. The mathematical T2125 structure here is correct — the verification question is whether gross revenue is complete.

---

**Error 7:**
*"Sandra had a net capital loss of $22,000 in 2025. She also had employment income of $74,000. I deducted the $22,000 capital loss on her T1 against her employment income, reducing her net income to $52,000."*

??? success "Error 7 — Answer"
    **The error:** Capital losses can **only offset capital gains** — they cannot reduce employment income, rental income, pension income, or any other income type. Sandra's $22,000 net capital loss in 2025 can only be used against capital gains. If she has no capital gains in 2025 — the loss is either: (1) carried back up to 3 years against prior capital gains (via T1-ADJ), or (2) carried forward indefinitely to future years. Her employment income of $74,000 is unaffected. Her net income should be $74,000 (employment) with the capital loss recorded as a carryforward balance on her NOA. The error — reducing employment income by $22,000 — would result in a $22,000 × 29.65% = $6,523 overclaim and a CRA reassessment.

---

**Error 8:**
*"George receives eligible dividends of $12,000/year from his stock portfolio. He's 72 and retired. His only other income is CPP ($14,400) and OAS ($8,300). I reported the dividends as $12,000 on Line 12000."*

??? success "Error 8 — Answer"
    **The error:** The grossed-up taxable amount must be used — not the actual dividend received. Eligible dividends: $12,000 × 1.38 = **$16,560 → Line 12000.** Not $12,000. The correct amount is $4,560 higher than entered. This error: (1) understates income by $4,560 — CRA's T5 shows $16,560 (Box 11), the return shows $12,000 → immediate mismatch on automated processing; (2) produces an incorrect (too small) DTC calculation; (3) may understate George's net income in a way that affects his OAS clawback calculation — OAS clawback threshold is $90,997. George's total income: $14,400 + $8,300 + $16,560 (correct) = $39,260 — well below clawback. The error doesn't affect OAS in this case, but the income understatement and DTC error remain and will be caught by CRA's automated slip-matching.

---

## 10.8 Phase 2 Comprehensive Quiz — 15 Questions

Work through all 15 before checking answers. Target: 13+ correct before proceeding to Phase 3. Below 11 — return to the relevant income-type week.

??? question "Q1. A client has employment income ($64,000), eligible dividends (taxable amount $4,140 — Box 11), and a T3 Box 21 capital gain of $2,800. What is the amount on Line 15000 (Total Income), and what is the taxable capital gain on Line 12700?"
    Line 10100 (employment): $64,000. Line 12000 (dividends): $4,140 (always use taxable/grossed-up amount). Line 12700 (taxable capital gains): T3 Box 21 = $2,800 is a capital gains distribution from the trust. Apply 50% inclusion: $2,800 × 50% = **$1,400 → Line 12700.** **Total Income (Line 15000): $64,000 + $4,140 + $1,400 = $69,540.** The T3 Box 21 goes through Schedule 3 where the 50% inclusion is applied. The dividends use the grossed-up amount — not the actual cash received.

??? question "Q2. Helen's T4A Box 48 shows $22,400 in consulting fees. Her eligible expenses on T2125 total $6,200 (including home office and cell phone). What is her net self-employment income on Line 13500, and what is her self-employment CPP obligation?"
    **Net business income: $22,400 − $6,200 = $16,200 → Line 13500.** CPP calculation: $16,200 − $3,500 basic exemption = $12,700 × 11.9% = **$1,511 total self-employment CPP.** Deductible half: $1,511 ÷ 2 = $756 → **Line 22200** (reduces Net Income). Credit half: $756 × 15% = **$113 → Line 31000** (non-refundable federal credit). Net income after CPP deduction: $16,200 − $756 = $15,444. At Helen's combined marginal rate (~24.15%): the CPP deductible half saves approximately $756 × 24.15% = $183 in combined tax — in addition to the $113 credit on the credit half. The total effective benefit of the CPP split is $183 + $113 = $296 on $1,511 in CPP paid.

??? question "Q3. Victor's rental property had gross rent of $24,000. Current expenses were $18,400. Building UCC at year-start: $162,000 (Class 1, 4%). He claims CCA. What is the maximum CCA he can claim, what is his net rental income, and what is the UCC at year-end?"
    Net income before CCA: $24,000 − $18,400 = $5,600. Available CCA: $162,000 × 4% = $6,480. CCA is limited to net income before CCA (cannot create a loss): **CCA = $5,600 (limited).** Net rental income: $5,600 − $5,600 = **$0 → Line 12600.** Year-end UCC: $162,000 − $5,600 = **$156,400.** The $880 of unclaimed CCA ($6,480 − $5,600) doesn't disappear — it remains in the class for future years. Next year's available CCA: $156,400 × 4% = $6,256.

??? question "Q4. A client has: employment income $72,000, capital gain $8,000 (50% taxable = $4,000), rental operating loss ($3,200), business loss from T2125 ($5,400). What is their Line 15000 (Total Income) and Line 23600 (Net Income)? Which of these losses can shelter their employment income?"
    **Total Income (Line 15000):** Employment $72,000 + Taxable capital gain $4,000 = $76,000. Rental operating loss ($3,200) flows directly to Line 12600 as negative → enters Total Income as ($3,200). Business loss ($5,400) flows from T2125 to Line 13500 as ($5,400). Total Income: $72,000 + $4,000 + ($3,200) + ($5,400) = **$67,400.** **Net Income (Line 23600):** Assuming no other deductions: **$67,400** (same as Total Income in this simplified case). **Losses that shelter employment income:** Both the **rental operating loss ($3,200)** and the **business loss ($5,400)** can offset employment income — they reduce Total Income from $76,000 to $67,400, saving $8,600 × 29.65% = **$2,550 in combined tax.** The **capital loss** (had there been one) could NOT shelter employment income — only capital gains.

??? question "Q5. Patricia worked for two employers in 2025. T4 #1: Box 16 = $3,200, Box 18 = $900. T4 #2: Box 16 = $2,100, Box 18 = $650. What are the over-contribution amounts and where do they appear on the T1?"
    **CPP:** Total withheld = $3,200 + $2,100 = $5,300. Maximum employee CPP (2025): $3,867. **Over-contribution: $5,300 − $3,867 = $1,433 → Line 44800** (CPP over-contribution returned as credit). **EI:** Total withheld = $900 + $650 = $1,550. Maximum EI (2025): $1,049. **Over-contribution: $1,550 − $1,049 = $501 → Line 45000** (EI over-contribution returned as credit). The over-contributions ($1,433 + $501 = $1,934) reduce the balance owing or increase the refund directly. **CPP and EI credits on Schedule 1:** Based on the maximum — $3,867 × 15% = $580 (CPP credit), $1,049 × 15% = $157 (EI credit). Not based on the total withheld.

??? question "Q6. Sandra is self-employed (net income $68,000 before CPP deduction). She also has employment income of $22,000 from a part-time T4 job (Box 16 CPP = $1,197). How does CRA prevent Sandra from paying double CPP?"
    The combined CPP obligation is calculated on **Schedule 8**, which coordinates both CPP streams. Sandra's employment CPP ($1,197 already withheld via T4) is credited against the overall CPP maximum. Her self-employment CPP is calculated on the remaining income above the maximum pensionable earnings threshold, reduced by what was already contributed through employment. **Simplified:** Maximum pensionable earnings: $71,300. Less basic exemption: $3,500. Maximum CPP base: $67,800. Maximum combined employee CPP: $3,867. Sandra already paid $1,197 through employment. Remaining room: $3,867 − $1,197 = $2,670 employee half. Self-employment adds the employer half. Schedule 8 handles this precisely — the software calculates it automatically. Key point: she does NOT pay $3,867 (employment) + full 11.9% on $68,000 (self-employment). Schedule 8 ensures the combined total doesn't exceed the maximum.

??? question "Q7. Robert sold a rental property. Building UCC remaining: $140,000. Building allocated proceeds: $380,000. Original building cost: $210,000. Calculate the recapture amount and explain where it appears on the T1."
    Building proceeds ($380,000) > original building cost ($210,000) → recapture is capped at original cost − UCC. **Recapture = $210,000 − $140,000 = $70,000.** This $70,000 is added to income as **ordinary income** (NOT capital gain). It appears as rental income in the year of sale — Line 12600. It is taxed at the full marginal rate, not at the 50% capital gains inclusion. Additionally, the building proceeds above the original cost ($380,000 − $210,000 = $170,000) is a **capital gain** → Schedule 3 → Line 12700 → 50% inclusion = $85,000 taxable. So Robert has: $70,000 recapture (100% taxable) AND $85,000 taxable capital gain — both from the same sale transaction, handled separately.

??? question "Q8. A client's T5 shows Box 15 (foreign income) = USD $3,800 and Box 16 (foreign tax paid) = USD $570. The annual average Bank of Canada USD rate is 1 USD = $1.37 CAD. What goes on the T1?"
    **Foreign income converted:** $3,800 × $1.37 = **$5,206 CAD → Line 12100** (NOT Line 12000 — foreign dividends are NOT grossed up; they go on 12100 at the actual converted amount). **Foreign tax converted:** $570 × $1.37 = **$781 CAD** → claimed on Form T2209 (Federal Foreign Tax Credit) → Line 40500. The federal FTC = lesser of (a) $781 CAD or (b) Canadian federal tax on $5,206 income. At 20.5% federal rate: $5,206 × 20.5% = $1,067. The lesser is $781 → full foreign tax credited federally. A separate Ontario Foreign Tax Credit (Form T2036) also applies. Together, these prevent most double taxation. **Note:** No gross-up. No Canadian DTC. Foreign dividends on Line 12100, full stop.

??? question "Q9. Ahmed's self-employment gross revenue was $48,200 (all T4A Box 48). His expenses include: meals with clients $2,400 (all documented), home office $3,800, vehicle (from logbook 68% business): fuel $3,200, insurance $1,600, CCA $4,100. What is his total T2125 expense deduction?"
    **Meals:** $2,400 × 50% (50% meal limitation) = $1,200. **Home office:** $3,800 (full amount if within income limit). **Vehicle:** Fuel $3,200 × 68% = $2,176. Insurance $1,600 × 68% = $1,088. CCA $4,100 × 68% = $2,788. **Total T2125 deductions:** $1,200 + $3,800 + $2,176 + $1,088 + $2,788 = **$11,052.** Net business income: $48,200 − $11,052 = **$37,148 → Line 13500.** Key point: meals are 50%, not 100%. Vehicle expenses each must be multiplied by the logbook business-use percentage. CCA is also multiplied by the business-use percentage before being deducted.

??? question "Q10. George is 73 and receives OAS ($8,600), CPP ($12,400), and eligible dividends (actual amount $16,000; taxable grossed-up amount $22,080). What is his net income and does he face OAS clawback?"
    **Total Income (Line 15000):** OAS $8,600 (Line 11300) + CPP $12,400 (Line 11400) + Dividends $22,080 (Line 12000, grossed-up Box 11 amount) = **$43,080.** With no deductions, Net Income = $43,080. OAS clawback threshold: $90,997. George's net income ($43,080) is well below $90,997 → **No OAS clawback.** However, the grossed-up dividend amount ($22,080 vs. the actual $16,000 received) inflated his reported income by $6,080 compared to cash actually received. If George's other income were higher — say CPP was $42,000 instead — the gross-up could push him over the threshold. At higher income levels, the dividend gross-up creates OAS clawback exposure on income that was partly phantom (the $6,080 gross-up portion was never actually received as cash). This is the OAS/dividend interaction discussed in Section 10.2.

??? question "Q11. Karen bought a rental condo for $420,000 in 2019 (25% land, 75% building). She has claimed CCA every year and her remaining building UCC is $230,000. She sells in 2025 for $310,000. Calculate: (a) any recapture or terminal loss, (b) any capital gain or capital loss, and (c) the tax treatment of each."
    **Land allocation:** $420,000 × 25% = $105,000 ACB land. Building original cost: $420,000 × 75% = $315,000. Building proceeds (75% of $310,000): $232,500. **(a) Recapture or terminal loss:** Building proceeds $232,500 < Building UCC $230,000? $232,500 > $230,000 → slight recapture: $232,500 − $230,000 = **$2,500 recapture** (small amount of regular income). **(b) Capital gain/loss:** Total proceeds $310,000 < Total ACB ($420,000) → **Capital loss: $310,000 − $420,000 = ($110,000).** Allowable capital loss: $110,000 × 50% = **($55,000)** to apply against capital gains (carry back 3 years, carry forward indefinitely). **(c) Tax treatment:** Recapture $2,500: ordinary income at full marginal rate — relatively small. Capital loss $55,000 (allowable): can only offset capital gains — carry back against 2022/2023/2024 gains if they exist; otherwise carry forward. Karen also has no terminal loss here because the building proceeds ($232,500) exceeded the UCC ($230,000).

??? question "Q12. Maria is considering a $15,000 RRSP contribution. She has employment income of $88,000 and two children under 8. Her current AFNI is $88,000. Calculate the combined annual value of the RRSP: (a) income tax saving, (b) CCB improvement, and (c) total percentage return on $15,000."
    **(a) Income tax saving:** $15,000 × 29.65% combined (income $57,376–$102,894 bracket) = **$4,448.** **(b) CCB improvement:** AFNI drops from $88,000 to $73,000. Both levels are above the $36,502 Tier 1 threshold. Phase-out rate for 2 children under 6: 19% in Tier 1 phase-out zone. Wait — at $88,000 she may be in the Tier 2 phase-out ($79,087 threshold). Tier 2 rate for 2 children: 5.7% for income above $79,087. The RRSP brings her from $88,000 to $73,000 — crossing back through both the Tier 2 and into the Tier 1 range: From $88,000 to $79,087 ($8,913 reduction) at 5.7% = $508 additional CCB. From $79,087 to $73,000 ($6,087 further reduction) at 19% (Tier 1 rate) = $1,157 additional CCB. Total CCB improvement: approximately **$1,665/year.** **(c) Total annual value:** $4,448 + $1,665 = **$6,113.** As a percentage of $15,000: $6,113 ÷ $15,000 = **40.8% immediate annual return** on the contribution.

??? question "Q13. Two clients both earn $82,000 in Ontario. Client A has $82,000 from employment. Client B has $60,000 from employment and $22,000 net from a rental property (operating profit). Is their tax the same? Why or why not?"
    Their total income is the same ($82,000) and their combined marginal rate is the same (29.65% for income in the $57,376–$102,894 range). **However, they may differ in subtle ways:** (1) Client B's rental income, if it includes mortgage interest deductions, has already reduced a higher gross rental income to $22,000 net — the deductions happened inside the T776 before reaching Line 12600. Client A's employment income had no such pre-netting. (2) Client A has the Canada Employment Amount credit ($215 federal + $72 Ontario = $287 combined) applied to all their income. Client B only gets the Employment Amount on their $60,000 employment portion — the $22,000 rental income is not "employment." (3) If Client B's rental property has a different ownership structure or co-ownership — the $22,000 on Line 12600 represents their share. (4) Ontario LIFT Credit: available to employed workers. Client B's employment income portion ($60,000) is above the LIFT threshold — neither client qualifies for LIFT in this example. **Bottom line:** For these specific amounts with no other differences, the tax is effectively the same. The subtle differences (Employment Amount applying to all of Client A's income vs. only $60,000 for Client B) create a minor difference of approximately $287 × 22/82 allocated difference — a small amount but a real difference. Tax is not solely determined by total income — it also depends on the composition.

??? question "Q14. A client had a net capital loss of $28,000 in 2025. In 2022, they had taxable capital gains of $12,000 on Line 12700. In 2023, taxable capital gains of $18,000. In 2024, taxable capital gains of $6,000. If they carry the 2025 loss back to eliminate as many prior gains as possible, what T1-ADJ forms are filed and what is the approximate combined tax refund?"
    **Available carry-back window:** 3 years back from 2025 = 2022, 2023, 2024. **Prior taxable capital gains:** 2022: $12,000; 2023: $18,000; 2024: $6,000. Total available: $36,000. Net capital loss 2025: $28,000 (this is the net capital loss, not yet halved — wait, need to clarify). A net capital loss for carry-back purposes is applied against the taxable capital gains (which are already at 50% inclusion). So: 2025 net capital loss of $28,000 means allowable capital losses of $28,000 exceed taxable capital gains — carry forward/back amount: $28,000. **Optimal application:** Apply to 2024 first ($6,000), then 2023 ($18,000), then 2022 ($4,000 remaining from 28,000 − 6,000 − 18,000 = 4,000). Total applied: $28,000. **T1-ADJ forms:** T1-ADJ for 2024 (eliminates $6,000 taxable gains) + T1-ADJ for 2023 (eliminates $18,000) + T1-ADJ for 2022 (reduces by $4,000). **Approximate refund:** ($6,000 + $18,000 + $4,000) × 29.65% average combined rate = $28,000 × 29.65% = approximately **$8,302 in combined tax refunded** across the three amended returns.

??? question "Q15. Patricia earned $0 in 2025 — she was on extended disability. She had a $4,200 rental operating loss from her investment property. She has employment income from prior years only. Can she deduct the rental loss, and if not, what happens to it?"
    Patricia has no income in 2025 to absorb the rental operating loss. The ($4,200) rental loss flows to Line 12600 on her 2025 T1. With no other income, her net income is ($4,200) — she has a **net non-capital loss for 2025.** This loss can be: (1) **Carried back** 3 years against employment income from 2022, 2023, or 2024 by filing T1-ADJ for those years — generating a refund of taxes previously paid at her marginal rate. (2) **Carried forward** 20 years against future income in any category. The rental loss does not expire like capital losses — it is a non-capital loss with a 20-year carry-forward window. **Recommended approach:** If Patricia had employment income in 2022–2024, carry the $4,200 back to the most recent year with income — reclaim the tax on $4,200 at whatever rate applied. At 29.65% combined: $4,200 × 29.65% = approximately **$1,245 refunded** from the carry-back.

---

## 10.9 Phase 2 Readiness Checklist

Before proceeding to Phase 3 (Deductions and Credits), confirm every item:

### Income Type Mastery ✅

- [ ] **Employment (Week 5):** Box 40 never added to Box 14. CPP credit capped at $3,867 maximum. T4A Box 48 always creates a T2125. Over-contributions from multiple T4s automatically returned via Lines 44800/45000
- [ ] **Investment (Week 6):** Dividends always reported at grossed-up (taxable) amount — Box 11 or Box 25 never Box 10 or Box 24. Foreign dividends on Line 12100 (no gross-up). T3 slips arrive March 31 — never file investment clients before April. Box 42 reduces ACB — tracked annually
- [ ] **Capital Gains (Week 7):** ACB is verified from purchase records — T5008 Box 20 is unreliable. 50% inclusion rate. PRE reported on Schedule 3 + T2091 even when gain is $0. Superficial loss rule — 30-day window. DRIP shares add to ACB
- [ ] **Self-Employment (Week 8):** Gross revenue always reported — never net deposits. CCA goes through the schedule — not as a current expense. CPP at 11.9%: deductible half reduces Net Income (Line 22200), credit half (Line 31000). HST registration when gross revenue exceeds $30,000
- [ ] **Rental (Week 9):** Current vs. capital — the most important judgment call. CCA cannot create a rental loss. Recapture is 100% taxable ordinary income (not 50% capital gain). 45(2) election preserves PRE for 4 additional rental years if no CCA claimed. Basement suite — allocate by floor area, never claim CCA on principal residence building

### Income Interactions ✅

- [ ] Rental operating losses and business losses can shelter employment income
- [ ] CCA cannot create a rental loss — only operating losses do
- [ ] Capital losses can only offset capital gains — carry back 3 years, forward indefinitely
- [ ] Dividend gross-up increases Net Income — can trigger OAS clawback, reduce Age Amount, increase Ontario surtax
- [ ] RRSP deduction reduces Net Income → saves tax AND improves benefit eligibility simultaneously

### Planning Awareness ✅

- [ ] RRSP is most valuable when: (a) high marginal rate, AND (b) income-tested benefits in play (CCB, OAS clawback, Age Amount)
- [ ] CCA on rental buildings is a deferral, not elimination — recapture equals exactly what was saved
- [ ] Principal residence sales must always be reported (Schedule 3 + T2091) — the tax may be $0 but the filing obligation is real
- [ ] Clients with $3,000+ tax and prior year over $3,000 need quarterly instalments — advise in November, not April
- [ ] Self-employed + high income = instalment obligation in Year 2 — set expectations at Year 1 intake

---

## 10.10 Week 10 Summary

!!! success "Phase 2 is complete — what you now hold"
    You have built the complete income-types framework across five weeks:

    **Week 5 — Employment:** The T4 decoded box-by-box. Taxable benefits. T777 and T2200. Vehicle logbooks. Home office. Commission employees. Multiple T4 over-contributions.

    **Week 6 — Investment Income:** The dividend gross-up and Dividend Tax Credit — mechanically and conceptually. T5 and T3 field guides. GIC accrual. Foreign income and the Foreign Tax Credit. TFSA/RRSP/RRIF treatment.

    **Week 7 — Capital Gains:** ACB from scratch. DRIP investors. The superficial loss rule. The PRE formula and mandatory reporting. Recapture distinction. Deemed dispositions. Cryptocurrency.

    **Week 8 — Self-Employment:** The T2125 from first dollar to last. COGS. Complete expense catalogue. CCA by class with half-year rules. CPP at 11.9%. HST threshold and ITCs. Hobby vs. business.

    **Week 9 — Rental Income:** T776 complete flow. Current vs. capital expense judgment. The CCA loss restriction. Recapture and terminal loss. The 45(2) election. Co-ownership and attribution. Basement suites.

    **Week 10 — Integration:** All five income types simultaneously. Interaction effects. The instalment obligation. Error hunt across all types. 15-question Phase 2 quiz.

    **The next six weeks** (Phase 3, Weeks 11–16) build the deduction and credit layer — RRSP mechanics, common deductions, non-refundable credits, refundable benefits, provincial tax, and CRA audit management. Every rule in Phase 3 attaches to the income architecture you now hold. The knowledge connects.

---

!!! tip "Up Next: Week 11"
    **RRSP, FHSA, and Retirement Savings** — The RRSP deduction limit formula in complete detail. Over-contribution penalties and the $2,000 buffer. Spousal RRSPs and income-splitting in retirement. The Home Buyers' Plan and repayment rules. The Lifelong Learning Plan. FHSA (First Home Savings Account) — the new account that combines RRSP deductibility with TFSA withdrawal flexibility. RRSP meltdown strategies for high-income years. The conversion to RRIF at 71. Week 11 is the week where the most valuable tax savings conversations happen for middle-income clients.
