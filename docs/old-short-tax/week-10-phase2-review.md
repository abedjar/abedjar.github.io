# Week 10: Phase 2 Review — Income Types Consolidated

!!! info "What This Week Is"
    Week 10 is your Phase 2 consolidation. No new material — this week stress-tests everything from Weeks 5 through 9 by putting it all together in realistic multi-source scenarios. By the end of this week you will be able to:

    - Identify every income type from client documents alone
    - Handle a return with 4–5 simultaneous income sources without confusion
    - Know exactly which form, which line, and which schedule handles each income type
    - Recognize interaction effects between income types (e.g. rental loss + employment, capital loss + investment income)
    - Feel genuinely ready for Phase 3 — Deductions and Credits

!!! warning "Don't rush this week"
    Phase 3 assumes you can handle income without thinking about it. If any income type from Phase 2 still feels shaky, go back to that week before continuing. The deduction and credit rules in Phase 3 layer on top of everything you've learned so far.

---

## 10.1 Phase 2 Master Reference — One Page

Before the scenarios, here is every income type on a single reference table. This is the cheat sheet you'll reach for constantly in your first tax season.

| Income Type | Slip/Form | Key Line(s) on T1 | Common Issues |
|---|---|---|---|
| Employment income | T4 Box 14 | **10100** | Multiple T4s, over-contributed CPP/EI |
| Other employment income | No slip needed | **10400** | Tips, gratuities not on T4 |
| Old Age Security | T4A(OAS) | **11300** | OAS clawback if income > ~$90,997 |
| CPP/QPP benefits | T4A(P) | **11400** | May be partially deferred — pension splitting available |
| Other pension income | T4A | **11500** | RRIF withdrawals, annuities |
| Employment insurance | T4E | **11900** | Always taxable — even parental EI |
| Interest income | T5 Box 13, T3 Box 26 | **12100** | GIC accrual, foreign interest at 100% |
| Taxable dividends | T5 Box 11/25, T3 Box 32/49 | **12000** | Grossed-up amount — not actual received |
| Capital gains | T5008, Schedule 3 | **12700** | ACB from purchase records, not T5008 Box 20 |
| RRSP income | T4RSP | **12900** | Withdrawals fully taxable |
| Self-employment — business | T2125 | **13500** | Net income after expenses and CCA |
| Self-employment — professional | T2125 | **13700** | Same form, different line |
| Self-employment — commission | T2125 | **13900** | Same form, different line |
| Rental income | T776 | **12600** | CCA restricted — cannot create loss |
| Support payments received | No slip | **12800** | Only court-ordered amounts; child support not taxable |
| Other income | Various | **13000** | Scholarships, research grants, RESP withdrawals |

---

## 10.2 Income Interaction Map

This is where new preparers get confused — not from individual income types, but from how they interact. Know these combinations cold.

```
┌────────────────────────────────────────────────────────────────┐
│ RENTAL LOSS (from operating expenses, not CCA)                 │
│   ✅ Can offset employment income on same T1                   │
│   ❌ CCA cannot create the loss — only operating expenses can  │
└────────────────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────────────────┐
│ BUSINESS LOSS (from T2125)                                     │
│   ✅ Can offset employment income on same T1                   │
│   ✅ CCA can create or deepen a business loss                  │
│   ✅ Can be carried back 3 years or forward 20 years           │
└────────────────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────────────────┐
│ CAPITAL LOSS                                                   │
│   ❌ Cannot offset employment, rental, or business income      │
│   ✅ Can only offset capital gains (current year or carried)   │
│   ✅ Carry back 3 years, carry forward indefinitely            │
└────────────────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────────────────┐
│ SELF-EMPLOYMENT INCOME                                         │
│   ⚠️ Triggers CPP at 11.9% — deduct 50%, credit 50%           │
│   ⚠️ GST/HST registration required if revenue > $30,000       │
└────────────────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────────────────┐
│ DIVIDENDS AND NET INCOME                                       │
│   ⚠️ Grossed-up amount increases net income                    │
│   ⚠️ Higher net income can reduce GST/HST credit, CCB, etc.   │
│   ✅ Dividend tax credit reduces federal tax owing             │
└────────────────────────────────────────────────────────────────┘
```

---

## 10.3 Multi-Source Income Practice Scenario

Work through this completely before reading the solution. Use a spreadsheet or paper. This is as complex as 80% of real client returns you'll encounter.

---

### Client Profile: The Chen Family — Victor and Helen

**Victor Chen**, 52, Ontario resident, full year.

**Income sources:**
- T4 from his employer: Box 14 = **$88,000**, Box 22 = **$19,500** (tax withheld), Box 16 = **$3,867** (CPP), Box 18 = **$1,049** (EI), Box 44 = **$960** (union dues)
- T5 from bank: Box 13 = **$1,240** (interest), Box 11 = **$2,070** (taxable eligible dividends), Box 12 = **$310** (dividend tax credit)
- He sold 400 shares of a TSX company: proceeds **$22,000**, ACB **$14,500**, commission on sale **$9.99**
- He contributed **$12,000** to his RRSP in February
- He owns a rental condo: gross rent **$21,600**, mortgage interest **$13,200**, condo fees **$3,900**, property taxes **$2,800**, insurance **$780**, repairs **$650**. Building UCC at start of year: **$195,000** (Class 1, 4% rate)

**Helen Chen**, 49, Ontario resident, full year.

- She is self-employed as a marketing consultant
- Gross revenues: **$67,000**
- Business expenses: advertising $2,400, software $1,800, professional development $1,100, accounting $500, home office (dedicated 160 sq ft of 800 sq ft owned home: mortgage interest $12,000, property taxes $4,200, insurance $1,400, utilities $2,100), meals with clients $1,800 (receipts)
- She has a capital loss carryforward from 2023: **$4,200**
- No RRSP contribution this year

---

### Questions

**Victor — Work through each step:**

1. What is Victor's Total Income (Line 15000)?
2. What is his Net Income (Line 23600)?
3. What is his net rental income (or loss) before CCA? Can he claim CCA?
4. What is his taxable capital gain from the share sale?
5. Estimate his federal tax refund or balance owing (use simplified Ontario tax of $6,400 on his taxable income).

**Helen — Work through each step:**

6. Calculate Helen's home office deduction (business-use-of-home).
7. What is Helen's net business income on T2125?
8. Calculate Helen's CPP obligation.
9. Helen has a capital loss carryforward of $4,200 but no capital gains this year. What happens to it?
10. What is Helen's Net Income (Line 23600)?

---

??? success "Full Solution — Victor and Helen Chen"

    ## Victor's Return

    ### Question 1 — Victor's Total Income

    | Line | Item | Amount |
    |---|---|---|
    | 10100 | Employment income (T4 Box 14) | $88,000 |
    | 12000 | Taxable eligible dividends (T5 Box 11) | $2,070 |
    | 12100 | Interest income (T5 Box 13) | $1,240 |
    | 12600 | Net rental income (calculated below) | $270 |
    | 12700 | Taxable capital gain (calculated below) | $3,745 |
    | **15000** | **Total Income** | **$95,325** |

    ---

    ### Question 3 — Rental Income (calculated first, needed for Q1)

    | Item | Amount |
    |---|---|
    | Gross rent | $21,600 |
    | Mortgage interest | ($13,200) |
    | Condo fees | ($3,900) |
    | Property taxes | ($2,800) |
    | Insurance | ($780) |
    | Repairs | ($650) |
    | **Net income before CCA** | **$270** |

    Available CCA: $195,000 × 4% = $7,800 (no half-year rule — not the year of purchase)

    Victor's net income before CCA is only $270. He can claim **maximum $270 in CCA** to bring rental income to zero. He should consider whether it's worth the administrative complexity to claim only $270 in CCA — he could also claim $0 and preserve the UCC for a more profitable year. Either approach is valid.

    **Net rental income for T1:** $270 (before any CCA claim — or $0 if he claims $270 CCA)

    For this solution we'll use **$270** (no CCA claimed).

    ---

    ### Question 4 — Taxable Capital Gain

    | Item | Amount |
    |---|---|
    | Proceeds | $22,000 |
    | ACB | $14,500 |
    | Outlays (commission) | $9.99 |
    | **Capital gain** | **$7,490.01** |
    | × 50% inclusion | |
    | **Taxable capital gain** | **$3,745.01** → Line 12700 |

    ---

    ### Question 2 — Victor's Net Income

    | Item | Amount |
    |---|---|
    | Total Income | $95,325 |
    | − Union dues (Line 21200, Box 44) | ($960) |
    | − RRSP deduction (Line 20800) | ($12,000) |
    | **Net Income (Line 23600)** | **$82,365** |

    No additional deductions → **Taxable Income (Line 26000): $82,365**

    ---

    ### Question 5 — Victor's Federal Tax and Refund

    **Gross federal tax on $82,365:**

    | Bracket | Income | Rate | Tax |
    |---|---|---|---|
    | $0–$57,375 | $57,375 | 15% | $8,606 |
    | $57,376–$82,365 | $24,990 | 20.5% | $5,123 |
    | **Gross Federal Tax** | | | **$13,729** |

    **Non-refundable credits (×15%):**

    | Credit | Amount | ×15% |
    |---|---|---|
    | Basic Personal Amount | $16,129 | $2,419 |
    | CPP (Box 16) | $3,867 | $580 |
    | EI (Box 18) | $1,049 | $157 |
    | Canada Employment Amount | $1,433 | $215 |
    | Eligible dividend tax credit (T5 Box 12) | $310 | (applied directly — already calculated) |
    | **Total credits** | | **$3,371 + $310 = $3,681** |

    ```
    Gross Federal Tax:          $13,729
    − Non-refundable credits:   ($3,681)
    ─────────────────────────────────
    Net Federal Tax:            $10,048

    + Ontario Tax (simplified):  $6,400
    ─────────────────────────────────
    Total Payable:              $16,448

    − Tax withheld (Box 22):   ($19,500)
    ─────────────────────────────────
    REFUND:                      $3,052  🎉
    ```

    Victor's RRSP contribution and union dues saved him approximately **$4,536** compared to filing without them ($12,960 × ~35%). His $12,000 RRSP alone saved him ~$4,200.

    ---

    ## Helen's Return

    ### Question 6 — Home Office Deduction

    Business-use %: 160 sq ft ÷ 800 sq ft = **20%**

    | Expense | Total | × 20% | Deductible |
    |---|---|---|---|
    | Mortgage interest | $12,000 | 20% | $2,400 |
    | Property taxes | $4,200 | 20% | $840 |
    | Insurance | $1,400 | 20% | $280 |
    | Utilities | $2,100 | 20% | $420 |
    | **Home office total** | | | **$3,940** |

    ---

    ### Question 7 — Helen's Net Business Income (T2125)

    | Item | Amount |
    |---|---|
    | Gross revenues | $67,000 |
    | − Advertising | ($2,400) |
    | − Software | ($1,800) |
    | − Professional development | ($1,100) |
    | − Accounting | ($500) |
    | − Meals (50% of $1,800) | ($900) |
    | − Home office | ($3,940) |
    | **Net Business Income** | **$56,360** → Line 13500 |

    No CCA claimed in this scenario.

    ---

    ### Question 8 — Helen's CPP Obligation

    | Item | Amount |
    |---|---|
    | Net business income | $56,360 |
    | − Basic exemption | ($3,500) |
    | CPP base | $52,860 |
    | Total CPP (×11.9%) | **$6,290** |
    | Deductible half (Line 22200) | **$3,145** |
    | Credit half (Line 31000) | $3,145 × 15% = **$472** |

    ---

    ### Question 9 — Capital Loss Carryforward

    Helen has a **$4,200 capital loss carryforward** from 2023 but **no capital gains** in 2025. Capital losses can only offset capital gains — they cannot offset business or other income.

    The $4,200 carryforward **stays on file** and rolls to 2026 (and beyond until used). It does not expire. Helen will note it on her return (Line 25300 is only used when applying the loss — this year it stays as a carryforward with no effect on 2025 income).

    ---

    ### Question 10 — Helen's Net Income

    | Item | Amount |
    |---|---|
    | Net business income | $56,360 |
    | − CPP deduction (Line 22200) | ($3,145) |
    | **Net Income (Line 23600)** | **$53,215** |

    !!! success "Victor vs. Helen — an interesting contrast"
        Victor earns more ($95K employment) but gets a $3,052 refund largely because of his RRSP and tax withheld at source. Helen earns $56K self-employment but owes CPP on top of income tax and had no withholding — she likely needs to pay quarterly **tax instalments** next year to avoid owing a large lump sum in April. This is an important planning conversation to have with self-employed clients.

---

## 10.4 The Instalment Problem — Self-Employed Clients

Helen's situation above leads directly to one of the most important things you'll tell self-employed and rental income clients.

### When CRA Requires Instalments

CRA requires **quarterly tax instalments** if your client's net tax owing (after withholding) exceeds **$3,000** in the current year AND in either of the two previous years ($1,800 for Quebec residents).

Self-employed clients and landlords with significant income almost always hit this threshold because no employer is withholding tax on their behalf.

**Instalment due dates:**

| Quarter | Due Date |
|---|---|
| Q1 | **March 15** |
| Q2 | **June 15** |
| Q3 | **September 15** |
| Q4 | **December 15** |

!!! warning "Instalment interest is compounded daily"
    CRA charges interest on missed or late instalments at the prescribed rate (currently ~8–9%). A self-employed client who earns $80,000 and ignores instalments all year could face $1,500–$2,000 in interest charges — on top of their tax bill. Alert every new self-employed client to this on your first meeting.

---

## 10.5 The Intake Checklist — All Income Types

Use this for every new client. Check off what applies, then collect the relevant documents.

### Step 1 — Employment & Government Benefits

- [ ] T4 from each employer
- [ ] T4A(OAS) — Old Age Security
- [ ] T4A(P) — CPP/QPP benefits
- [ ] T4A — Other pension, RRSP income, COVID benefits
- [ ] T4E — Employment Insurance
- [ ] T4RSP — RRSP withdrawals
- [ ] T4RIF — RRIF withdrawals

### Step 2 — Investment Income

- [ ] T5 from bank(s) and brokerage (wait for all — some arrive late February)
- [ ] T3 from mutual funds, ETFs, trusts (wait — due March 31)
- [ ] T5008 from brokerage (securities transactions)
- [ ] ACB records for any securities sold (separate from T5008)
- [ ] Foreign investment income and foreign tax paid

### Step 3 — Capital Transactions

- [ ] Any real estate sold? → need purchase price, ACB, selling costs
- [ ] Principal residence sold? → T2091 designation required
- [ ] Inherited any property? → FMV at date of death = new ACB
- [ ] Crypto transactions? → complete transaction history in CAD

### Step 4 — Self-Employment

- [ ] Revenue records (invoices, sales reports)
- [ ] All business expense receipts
- [ ] Vehicle logbook (if claiming vehicle expenses)
- [ ] Home office dimensions and home expense receipts
- [ ] T2200 (if both T4 employment and home office claim)
- [ ] GST/HST registration number (if registered)

### Step 5 — Rental Income

- [ ] Rental income records for each property
- [ ] All rental expense receipts
- [ ] Mortgage statement (to separate interest from principal)
- [ ] Property tax bill
- [ ] Prior year T776 (to confirm UCC carried forward)
- [ ] Any property purchased or sold this year

### Step 6 — Prior Year Carryforwards

- [ ] Prior NOA (to check: RRSP room, capital loss balance, unused tuition)
- [ ] Any capital losses from prior years not yet used?
- [ ] Any non-capital losses from prior years?
- [ ] Unused home office expenses carried forward?

---

## 10.6 Comprehensive Phase 2 Quiz

Ten questions — mix of all income types. No notes.

??? question "1. A client has employment income of $72,000 and a net rental loss of $3,800 (from operating expenses — no CCA). What is their Total Income? What is their Net Income after a $10,000 RRSP deduction?"
    **Total Income (Line 15000):** Employment $72,000 + Rental loss ($3,800) = **$68,200**. Note: rental losses from operating expenses are allowed and reduce Total Income directly.
    **Net Income (Line 23600):** $68,200 − $10,000 RRSP = **$58,200**.

??? question "2. A client received $3,000 in actual eligible dividends. What amount appears on Line 12000, and what is the approximate federal dividend tax credit?"
    **Line 12000:** $3,000 × 1.38 = **$4,140** (grossed-up taxable amount). **Federal DTC:** $4,140 × 15.0198% = **$622**. This credit goes on Line 40425 and directly reduces federal tax owing.

??? question "3. Your client is self-employed with $48,000 net business income. They also had a $6,000 capital gain (50% taxable = $3,000) from selling mutual funds. The capital gain is their only investment income. Can their 2022 capital loss carryforward of $4,500 offset the $3,000 taxable capital gain?"
    Yes — capital loss carryforwards offset capital gains of any kind, including those from mutual fund sales. The $3,000 taxable capital gain is fully offset by $3,000 of the $4,500 carryforward. The remaining **$1,500 carries forward** to 2026. Line 12700 shows $0 after applying the carryforward on Line 25300.

??? question "4. Name the three conditions required before rental CCA can be claimed."
    (1) There must be **net rental income before CCA** — CCA cannot create or worsen a rental loss. (2) The CCA can only reduce net rental income to **zero** — not below. (3) The asset must be a **depreciable capital property** used to earn rental income — land is never depreciated.

??? question "5. A client worked two jobs. Job A: Box 16 CPP = $3,200. Job B: Box 16 CPP = $2,100. What happens on their return and what amount goes to Schedule 8?"
    Total CPP withheld: $3,200 + $2,100 = $5,300. The 2025 maximum is $3,867. **Over-contribution: $1,433** — automatically refunded on the return. The credit on Schedule 8 is based on the maximum $3,867 (the employee's proper share), and the excess $1,433 is returned to the client.

??? question "6. A client sold their principal residence and made a $380,000 gain. They lived there for 8 of the 10 years they owned it, renting it for 2 years. How much of the gain is exempt and how much is taxable?"
    Exempt portion: (1 + 8) ÷ 10 × $380,000 = 90% × $380,000 = **$342,000 exempt**. Taxable portion: $380,000 − $342,000 = $38,000. Taxable capital gain (×50%): **$19,000** → Line 12700. The sale must still be reported on Schedule 3 with Form T2091 even though most of the gain is exempt.

??? question "7. What is recapture income, which line does it go on, and how is it taxed compared to a capital gain?"
    Recapture is the portion of proceeds allocated to a building that exceeds the Undepreciated Capital Cost (UCC) — it represents CCA claimed that turned out not to represent real depreciation. It goes on **Line 13600** and is taxed at the **full marginal rate** (100% inclusion). By contrast, a capital gain has a 50% inclusion rate. On the same property sale, recapture and capital gain are calculated and taxed separately.

??? question "8. A freelance writer earned $38,000 gross revenue, $9,000 in business expenses, and $4,500 in home office expenses. Her net business income before CPP is $24,500. Calculate her total CPP and the split between deduction and credit."
    CPP base: $24,500 − $3,500 = $21,000. Total CPP: $21,000 × 11.9% = **$2,499**. Deductible half (Line 22200): **$1,250**. Credit half (Line 31000): $1,250 × 15% = **$188** reduction in federal tax.

??? question "9. A client has a T5008 showing proceeds of $18,500 in Box 16 and $14,200 in Box 20. Can you use Box 20 as the ACB? What should you do instead?"
    **No** — Box 20 is unreliable. It may reflect the brokerage's internal cost tracking (average cost method) which can differ from CRA's ACB rules, especially for DRIP investors, partial sales, or inherited securities. Always obtain the original purchase records and reconstruct the ACB independently. If you file with an incorrect ACB, CRA may reassess and the client — and your reputation — suffer.

??? question "10. What three things should you always advise a first-year self-employed client before they leave your office?"
    (1) **Save 25–35% of all income** for tax and CPP obligations — no employer is withholding on their behalf. (2) **Register for GST/HST** once (or before) revenues hit $30,000 — retroactive assessments are painful. (3) **Pay quarterly tax instalments** once their net tax owing exceeds $3,000 annually — CRA charges compounding daily interest on missed instalments, and the bill arrives at the worst possible time (April 30).

---

## 10.7 Phase 2 Readiness Checklist

Before moving to Phase 3, be honest with yourself about each item.

**Employment Income (Week 5)**
- [ ] I can decode every important T4 box and know where each goes on the T1
- [ ] I handle multiple T4s confidently and calculate CPP/EI over-contributions
- [ ] I know when a T2200 is required and can complete Form T777
- [ ] I correctly apply the 50% meals rule without exception

**Investment Income (Week 6)**
- [ ] I can explain the dividend gross-up and DTC in plain language to a client
- [ ] I know the difference between eligible and non-eligible dividends
- [ ] I always wait for T3 slips (due March 31) before filing
- [ ] I never report TFSA investment income on a T1

**Capital Gains (Week 7)**
- [ ] I calculate capital gains using proceeds − ACB − outlays
- [ ] I never use T5008 Box 20 as the ACB without verification
- [ ] I always report principal residence sales on Schedule 3 + T2091
- [ ] I know the superficial loss rule and the 30-day window
- [ ] I can calculate partial principal residence exemptions

**Self-Employment (Week 8)**
- [ ] I complete a T2125 from revenue to net income confidently
- [ ] I apply the 50% meals cap, home office restrictions, and vehicle logbook rules
- [ ] I calculate CPP at 11.9% and split it between Line 22200 and Line 31000
- [ ] I know the $30,000 GST/HST registration threshold

**Rental Income (Week 9)**
- [ ] I complete a T776 and know the difference between current and capital expenses
- [ ] I never let rental CCA create a loss
- [ ] I calculate recapture and capital gain separately on rental property sales
- [ ] I advise basement suite landlords against claiming CCA on their home
- [ ] I handle co-ownership by giving each owner their own T776

!!! success "If you can check every box — you are ready for Phase 3"
    Phase 3 covers deductions (RRSP, childcare, moving expenses) and credits (disability, tuition, medical, donations). This is where you unlock the tools that actively reduce client tax bills — and where clients really start to see your value.

---

## 10.8 Phase 2 Summary

!!! success "What you mastered in Phase 2"

    | Week | Income Type | Key Form | T1 Line |
    |---|---|---|---|
    | 5 | Employment income | T4 | 10100 |
    | 6 | Investment income (interest/dividends) | T5, T3 | 12000, 12100 |
    | 7 | Capital gains and losses | Schedule 3 | 12700 |
    | 8 | Self-employment income | T2125 | 13500/13700 |
    | 9 | Rental income | T776 | 12600 |
    | 10 | All five — integrated and applied | All of the above | All of the above |

    You can now handle the income section of a T1 for virtually any individual client in Canada. The skills you've built in Phase 2 form the core of 95% of the returns you will prepare.

---

## 📚 Phase 2 Reference Resources

- [CRA: T4 slips](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/tax-slips/understand-your-tax-slips/t4-slips.html)
- [CRA: Interest and dividends](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12100-interest-investment-income.html)
- [CRA: Capital gains guide T4037](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4037.html)
- [CRA: T2125 — Business income](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t2125.html)
- [CRA: T776 — Rental income guide T4036](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4036.html)
- [CRA: Instalment payments](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/paying-your-income-tax/paying-your-income-tax-instalments.html)

---

!!! tip "Up Next: Week 11 — Phase 3 Begins"
    **RRSP — The Most Powerful Deduction in Canada**. You'll learn contribution room, the RRSP deduction limit, over-contributions, spousal RRSPs, the Home Buyers' Plan, the Lifelong Learning Plan, and why the RRSP is still one of the best tax tools available to your clients. Phase 3 is where preparation becomes planning — and where clients realize you're worth far more than the cost of your fee.
