# Week 15: Provincial Taxes — Ontario Deep Dive

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Explain exactly how Ontario tax stacks on top of federal tax and why both matter
    - Apply Ontario's tax brackets and surtax system with precision
    - Claim every major Ontario-specific credit — especially the ones most preparers miss
    - Handle Ontario tax for clients who moved into or out of Ontario during the year
    - Understand the Ontario Trillium Benefit at a deeper level than Week 14 introduced
    - Know the key differences between Ontario and other provinces that affect planning
    - Identify the Ontario-specific audit triggers and common errors on the ON428 form
    - Advise clients on Ontario-specific planning opportunities — pension income, seniors, low-income workers

!!! tip "Why provincial tax deserves its own week"
    Most beginners treat provincial tax as an afterthought — "the software handles it." That mindset leaves money on the table. Ontario has its own tax brackets, its own surtax on high earners, its own refundable and non-refundable credits, and its own benefit programs. A return prepared without understanding provincial mechanics may be mathematically correct but strategically incomplete. For your clients in Ontario — which will be the majority if you're based in London, Ontario — provincial tax is half the picture.

---

## 15.1 How Provincial Tax Works — The Stacking System

Canada's income tax system has **two independent layers** that stack on top of each other:

```
TAXABLE INCOME (Line 26000)
    ↓
Applied to FEDERAL brackets → Federal Tax
    ↓
Applied to ONTARIO brackets → Ontario Tax
    ↓
Both amounts added together → Total Tax Payable
```

Both layers use the same taxable income number — but each has its own brackets, its own credits, and its own rates. They are calculated independently and then combined.

!!! warning "Provincial tax is NOT a percentage of federal tax"
    A very common beginner misconception: "Ontario charges 40% of whatever federal tax you owe." That is wrong. Ontario applies its own tax rates directly to taxable income — independently of the federal calculation. The rates happen to be lower than federal rates, but the mechanism is completely separate.

### The Combined Marginal Rate — What Your Client Actually Pays

When a client asks "what's my tax rate?", the honest answer is the **combined federal + Ontario rate**:

| Taxable Income Range | Federal Rate | Ontario Rate | **Combined Rate** |
|---|---|---|---|
| $0 – $51,446 | 15.00% | 5.05% | **20.05%** |
| $51,447 – $57,375 | 15.00% | 9.15% | **24.15%** |
| $57,376 – $102,894 | 20.50% | 9.15% | **29.65%** |
| $102,895 – $114,750 | 20.50% | 11.16% | **31.66%** |
| $114,751 – $150,000 | 26.00% | 11.16% | **37.16%** |
| $150,001 – $158,519 | 26.00% | 12.16% | **38.16%** |
| $158,520 – $220,000 | 29.00% | 13.16% | **42.16%** |
| Over $220,000 | 33.00% | 13.16% | **46.16%** |

!!! tip "Memorize the key combined rates — you'll quote them constantly"
    The numbers clients most frequently need to understand:
    - Under $51,446: **20.05%** — the lowest bracket
    - $57,376 – $102,894: **29.65%** — the "professional salary" bracket most working Canadians land in
    - Over $220,000: **46.16%** — the top combined rate in Ontario

    When a client asks "how much tax will I save if I make an RRSP contribution?", you should be able to give them the combined rate from memory within seconds. It builds confidence. It shows expertise.

---

## 15.2 Ontario's Tax Brackets in Detail — Form ON428

Ontario's provincial income tax is calculated on **Form ON428** (Ontario Tax). This is part of every Ontario resident's T1 package.

### 2025 Ontario Tax Brackets

| Taxable Income | Ontario Rate | Tax on This Portion |
|---|---|---|
| $0 – $51,446 | **5.05%** | Up to $2,598 |
| $51,447 – $102,894 | **9.15%** | Up to $4,708 |
| $102,895 – $150,000 | **11.16%** | Up to $5,256 |
| $150,001 – $220,000 | **12.16%** | Up to $8,512 |
| Over $220,000 | **13.16%** | On excess |

### The Ontario Surtax — The Hidden Layer Most Beginners Miss

Ontario is one of the few provinces that charges a **surtax** — a tax on your Ontario tax. It applies at two thresholds and catches high-income earners by surprise.

| Ontario Basic Tax Owing | Surtax Rate |
|---|---|
| Over $5,315 | **20% on Ontario tax above $5,315** |
| Over $6,802 | **Additional 36% on Ontario tax above $6,802** |

!!! example "Case — The Ontario Surtax in Action"
    James earns $180,000 in taxable income. His Ontario basic tax (before surtax):

    | Bracket | Income | Rate | Tax |
    |---|---|---|---|
    | $0–$51,446 | $51,446 | 5.05% | $2,598 |
    | $51,447–$102,894 | $51,448 | 9.15% | $4,708 |
    | $102,895–$150,000 | $47,106 | 11.16% | $5,257 |
    | $150,001–$180,000 | $30,000 | 12.16% | $3,648 |
    | **Ontario Basic Tax** | | | **$16,211** |

    **Surtax calculation:**

    | Threshold | Excess Over Threshold | Rate | Surtax |
    |---|---|---|---|
    | $5,315 | $16,211 − $5,315 = $10,896 | 20% | $2,179 |
    | $6,802 | $16,211 − $6,802 = $9,409 | 36% | $3,387 |
    | **Total surtax** | | | **$5,566** |

    **Total Ontario tax: $16,211 + $5,566 = $21,777**

    Without the surtax, James would have paid $16,211. The surtax adds $5,566 — a 34.3% increase over the basic Ontario tax. This is why the combined top rate in Ontario reaches 46.16% rather than the 33% + 13.16% = 46.16% simple addition (the surtax is already embedded in the effective rate table above — but understanding the mechanism prevents surprises when checking software output).

    **Every client earning over $100,000 in Ontario will have a surtax.** Know what it is before you see their return — not after.

---

## 15.3 Ontario Non-Refundable Tax Credits — ON428

Ontario has its own set of non-refundable credits that parallel the federal credits on Schedule 1 — but with Ontario rates and amounts. They all appear on **Form ON428**.

### Core Ontario Credits

| Credit | 2025 Ontario Amount | Ontario Credit (×5.05%) |
|---|---|---|
| Ontario Basic Personal Amount | **$11,865** | **$599** |
| Ontario Age Amount (65+) | **$5,812** | **$294** |
| Ontario Spouse / CLP Amount | **$10,114** | **$511** |
| Ontario CPP credit | Employee CPP × 5.05% | Matches T4 Box 16 |
| Ontario EI credit | Employee EI × 5.05% | Matches T4 Box 18 |
| Ontario Canada Employment Amount | **$1,433** × 5.05% | **$72** |
| Ontario Pension Income Amount | Up to **$1,533** | **$77** max |
| Ontario Disability Amount | **$9,872** | **$499** |
| Ontario Caregiver Amount | Up to **$5,488** | **$277** |

!!! warning "Ontario amounts differ from federal — never copy one to the other"
    Ontario's Basic Personal Amount ($11,865) is **lower** than the federal Basic Personal Amount ($16,129). Ontario's age amount ($5,812) is lower than the federal ($8,790). Do not assume Ontario credits mirror federal ones. They use the same structure but have their own legislated amounts.

### The Ontario Political Contribution Tax Credit

Ontario allows a tax credit for contributions to registered Ontario political parties:

| Contribution | Credit Rate |
|---|---|
| First $389 | 75% |
| $389 – $1,558 | 50% |
| $1,558 – $3,337 | 33.3% |
| **Maximum credit** | **$1,391** |

This credit is small but exists — mention it to any politically active client.

---

## 15.4 Ontario Refundable Credits — Where the Real Money Is

### The Ontario Trillium Benefit (OTB) — Deep Dive

We introduced the OTB in Week 14. Now let's go deeper, because this is where most Ontario preparers leave money on the table.

The OTB combines three credits, all claimed on **Form ON-BEN**:

#### Component 1 — Ontario Sales Tax Credit (OSTC)

A quarterly payment that offsets sales taxes for low-to-moderate income Ontarians.

**2025 Amounts:**

| Component | Amount |
|---|---|
| Base amount | **$345** |
| Spouse/CLP supplement | **$345** |
| Per child under 19 | **$345** |

**Phase-out:** Begins when adjusted family net income exceeds **$24,916** at a rate of **4%** of income above that threshold.

!!! example "Case — OSTC Calculation"
    Single individual, net income $35,000:
    Reduction: ($35,000 − $24,916) × 4% = $10,084 × 4% = $403
    Base OSTC: $345 − $403 = **$0** (fully phased out)

    Single individual, net income $22,000:
    Below threshold — full $345.

    Family of four, net income $45,000:
    Maximum: $345 × 4 = $1,380
    Reduction: ($45,000 − $24,916) × 4% = $803
    OSTC: $1,380 − $803 = **$577**

#### Component 2 — Ontario Energy and Property Tax Credit (OEPTC)

The largest and most impactful OTB component. It recognizes that property taxes and energy costs represent a disproportionate burden on low- and middle-income Ontarians.

**Two sub-components:**

**Energy component (all eligible claimants):**
- Under 65: **$277/year**
- 65 and older: **$277/year** (same — though seniors get additional amounts below)

**Property tax component:**

| Situation | Credit Calculation |
|---|---|
| **Renter** | 20% of rent paid for principal residence × OEPTC factor |
| **Homeowner** | Property tax paid for principal residence × OEPTC factor |
| **Long-term care resident** | $25% of accommodation costs |
| **Student in residence** | $25 flat amount |

The actual OEPTC formula is more complex — involving maximum amounts and phase-outs — but the key practical numbers are:

| Claimant | Max OEPTC (Under 65) | Max OEPTC (65+) |
|---|---|---|
| Single | ~$1,195 | ~$1,247 |
| Family | ~$1,195 | ~$1,247 |

**Phase-out:** OEPTC begins reducing once adjusted family net income exceeds **$36,195**, at a rate that varies by component.

!!! example "Case — The Renter vs. The Homeowner"

    **Sandra (renter):** Pays $1,600/month in rent = $19,200/year. Net income $38,000.

    Deemed property tax: 20% × $19,200 = **$3,840**

    The OEPTC formula uses this figure to calculate the credit. At this rent level and income, Sandra's OEPTC is approximately **$987/year**.

    **Robert (homeowner):** Pays $4,800/year in property tax. Net income $38,000.

    The OEPTC formula applies a different rate to actual property tax, generating a smaller benefit than the renter's deemed equivalent — approximately **$742/year**.

    **The counterintuitive result:** In many cases, renters receive a **higher** OTB than homeowners paying similar amounts — because 20% of rent tends to exceed actual property tax figures for modest homes. This surprises clients. Explain it clearly.

!!! warning "What qualifies as rent for OEPTC purposes"
    Eligible rent is paid for a **principal residence** in Ontario — not a vacation property, not a garage, not a parking space. Rent paid to a landlord who is exempt from property tax (certain non-profit housing, student residences) may be reduced. Subsidized housing where no actual rent is charged does not qualify.

    **Verify every year:** The client's address, landlord name, landlord address, and monthly rent amount are all required on ON-BEN. A return filed with approximate rent figures is a red flag in a CRA review.

#### Component 3 — Northern Ontario Energy Credit (NOEC)

Available to residents of **specific northern Ontario districts** (Algoma, Cochrane, Kenora, Manitoulin, Nipissing, Parry Sound, Rainy River, Sudbury, Thunder Bay, Timiskaming).

- Single: up to **$173/year**
- Family: up to **$266/year**

This is fully refundable regardless of income. If you serve clients in northern Ontario, never miss it.

#### Claiming the OTB — Form ON-BEN Practical Guide

ON-BEN is straightforward but contains several questions that require precision:

| Question | What to Enter | Common Mistake |
|---|---|---|
| Box 6118 — Rent paid | Total rent paid in the year | Forgetting to include last month's deposit if applied |
| Box 6119 — Property tax | Total property tax billed | Entering property tax paid (installments) rather than billed |
| Box 6110 — Address | Principal Ontario residence | Entering a different address than where you actually lived |
| Landlord information | Name and address of each landlord | Leaving blank — CRA may disallow the claim |
| Occupant type | Renter, homeowner, long-term care | Selecting wrong category |

!!! example "Case — Four Clients, Four Different OTB Situations"

    All are Ontario residents, net income ~$40,000 each:

    | Client | Situation | Annual OTB |
    |---|---|---|
    | **Ahmed, 27** | Renter, $1,500/month, no children | OEPTC ~$887 + OSTC $0 = **~$887** |
    | **Sandra, 45** | Homeowner, $3,200 property tax, 2 kids | OEPTC ~$580 + OSTC $577 (family) = **~$1,157** |
    | **Maria, 71** | Renter, $1,200/month, 65+, no spouse | OEPTC ~$940 (higher senior amount) + OSTC $0 = **~$940** |
    | **Patrick, 34** | Renter, $2,400/month (expensive apartment) | OEPTC ~$1,195 (capped) + OSTC $0 = **~$1,195** |

    Note: Patrick's high rent doesn't give him proportionally more OTB — the OEPTC is capped. The maximum benefit is reached well before his rent level.

---

## 15.5 Ontario's Senior-Specific Benefits

Ontario has meaningful additional support for residents 65 and older. These are often missed — seniors who don't file regularly are among the most systematically underserved clients in Canadian tax preparation.

### Ontario Senior Homeowners' Property Tax Grant

- For Ontarians 64+ who own and live in their home
- Maximum grant: **$500/year**
- Income-tested: phases out above a threshold
- Claimed on **Form ON-BEN** — same form as OTB

!!! tip "Many seniors qualify but never claim this"
    The Senior Homeowners' Property Tax Grant is frequently missed because it's buried in the ON-BEN form that many seniors assume doesn't apply to them. Every senior homeowner client should have ON-BEN completed. The $500 grant pays for many years of your preparation fee on its own.

### Ontario Age Amount — ON428

**2025 Ontario age amount:** $5,812 (compared to $8,790 federal)
**Ontario credit:** $5,812 × 5.05% = **$294**

The Ontario age amount has its own income reduction threshold: begins reducing when net income exceeds **$42,335** (slightly lower than the federal $44,325 threshold).

### Pension Income Deduction — Ontario Specific

Ontario allows a **pension income deduction** of up to $1,533 for eligible pension income (RRIF withdrawals if 65+, defined benefit pension, annuity). This is separate from the federal pension income amount.

**Ontario credit on maximum $1,533:** $1,533 × 5.05% = **$77**

Small — but real. Never leave it unclaimed for pension-income seniors.

---

## 15.6 The Ontario Low-Income Individuals and Families Tax (LIFT) Credit

The **LIFT Credit** is an Ontario-specific refundable credit introduced in 2019 to eliminate or reduce Ontario personal income tax for lower-income individuals and working families.

### Who Qualifies

| Situation | Condition |
|---|---|
| Individual | Employment income must be greater than $0 |
| Family (with spouse/CLP) | Combined employment income > $0 |
| Maximum benefit | All Ontario personal income tax eliminated |

### How It Works

The LIFT Credit effectively **zeroes out Ontario tax** for lower-income Ontarians who have employment income:

| Claimant | Income Range for Maximum Benefit | Phase-out |
|---|---|---|
| Single | Net income up to ~$30,000 | 5% of net income above $30,000 |
| Family | Combined net income up to ~$60,000 | 5% of combined net income above $60,000 |

!!! example "Case — The Part-Time Worker's LIFT Credit"
    Rosa works part-time, earning $24,000. She is single.

    Her Ontario basic tax (ON428): $24,000 × 5.05% = **$1,212** (approximately, simplified)

    LIFT Credit: Rosa's income is below $30,000. Her LIFT Credit equals her full Ontario tax — approximately **$1,212**.

    **Result: Rosa owes $0 Ontario provincial tax.**

    Without the LIFT Credit, Rosa would pay $1,212 to Ontario. With it, she pays nothing. The federal basic personal amount eliminates her federal tax. Rosa's total income tax bill: **$0** — plus she receives CWB and GST/HST credits as refundable benefits.

    This is a young person who has been told by friends "you don't need to file if you don't owe taxes." She does need to file — to claim these credits and benefits. The LIFT Credit alone is worth $1,212 to her this year.

!!! warning "LIFT Credit requires employment income — passive income doesn't qualify"
    A client who earns only investment income or rental income — even if their total income is $20,000 — does not qualify for the LIFT Credit. The credit specifically requires employment or self-employment income as a condition. Always check the income source before assuming a low-income client qualifies.

---

## 15.7 Ontario vs. Other Provinces — Key Differences Your Clients Will Ask About

As a tax preparer in Ontario, clients who moved here from other provinces — or who are considering moving — will ask about the differences. Know these cold.

### Combined Marginal Rate Comparison at $100,000 Income (2025)

| Province | Federal | Provincial | **Combined** | Notes |
|---|---|---|---|---|
| **Ontario** | 20.50% | 11.16% + surtax | **~31.66%** | Surtax kicks in above ~$5,315 Ontario tax |
| **Alberta** | 20.50% | 10.00% | **30.50%** | No provincial surtax — lowest combined rate |
| **British Columbia** | 20.50% | 10.50% | **31.00%** | |
| **Quebec** | 20.50% | 19.00% | **39.50%** | Files two separate returns; highest combined rate |
| **Manitoba** | 20.50% | 17.40% | **37.90%** | High provincial rate |
| **Nova Scotia** | 20.50% | 17.50% | **38.00%** | |

!!! example "Case — The Alberta-to-Ontario Move"
    David earned $120,000 while living in Calgary. In September he accepted a job in Toronto and moved permanently.

    **Province of residence on December 31:** Ontario.

    **Ontario tax applies for the full year** on his taxable income — even though he only lived there 4 months. He files one T1 as an Ontario resident.

    What he gained: Access to Ontario-specific credits (LIFT, OTB, ON-BEN)
    What he lost: Alberta's lower combined rate at $120,000 income was approximately 38.75%; Ontario's is approximately 36.86% at $120K with surtax — actually Ontario is marginally better at this income level. The perception that Ontario is always more expensive than Alberta is not always true at moderate incomes.

    **At incomes above $150,000:** Alberta's top rate (33% + 15% = 48%) vs. Ontario's top rate (33% + 13.16% + surtax = ~53.53%). Ontario becomes meaningfully more expensive at the very top.

### Quebec — The Special Case

Quebec residents file **two separate returns**:
1. **Federal T1** with the federal government (CRA)
2. **TP-1** with Revenu Québec (provincial return)

Quebec has opted out of several federal programs and runs its own versions. This means:
- Lower EI premiums federally (Quebec runs its own parental program — QPIP)
- Separate child benefits (Québec Family Allowance)
- Different deductions and credits in the provincial system

**Your practice:** Avoid preparing Quebec provincial returns until you have specific training in TP-1. Refer Quebec clients to preparers certified with Revenu Québec. You can prepare the federal T1 portion, but the TP-1 is a separate, complex document. Always clarify the scope of your service with Quebec-resident clients.

---

## 15.8 Clients Who Moved Into or Out of Ontario During the Year

This is one of the most consistently mishandled situations in Ontario tax preparation. The rule is simple, but the implications are significant.

### The December 31 Rule

**Province of residence for the tax year = the province where the client lived on December 31.**

This determines:
- Which provincial tax form is used (ON428 vs. AB428, etc.)
- Which provincial credits apply
- Which provincial benefit programs apply
- The combined marginal rate for the entire year

There is no pro-ration of provincial tax based on months lived in the province. Ontario gets the full year's provincial tax if you lived there on December 31.

!!! example "Case — The Mid-Year Ontario Arrival"
    Patricia moved from Vancouver to Toronto on July 1, 2025. She lived in Ontario for exactly 6 months.

    **Provincial tax:** Ontario — for the full year's taxable income. Not half Ontario, half BC. The entire provincial calculation uses Ontario's brackets and rates.

    **Ontario Trillium Benefit:** Patricia can claim OEPTC for the months she paid rent in Ontario — July through December = 6 months of rent.

    **ON-BEN Box 6118:** Enter only the rent paid for the Ontario portion of the year: 6 months × monthly rent.

    **BC credits:** Patricia gets no BC provincial credits — she was not a BC resident on December 31. Any BC-specific credits she might have expected (BC Climate Action Tax Credit, etc.) do not apply for this year.

!!! example "Case — The December Ontario Departure"
    Kevin lived in Toronto all year until December 15, when he permanently relocated to Calgary. He was an **Alberta** resident on December 31.

    **Provincial tax:** Alberta — for the full year's taxable income.

    **Ontario Trillium Benefit:** Kevin cannot claim OTB — he was not an Ontario resident on December 31. Even though he lived in Ontario for 11.5 months of the year.

    **Ontario LIFT Credit:** Not available — he's filing as an Alberta resident.

    This surprises people. Kevin pays the full year of Alberta provincial tax (lower rate) but loses all Ontario credits and benefits despite living there almost the entire year.

    **The practical advice:** For clients planning a cross-province move, the timing matters. A December move out of Ontario loses all Ontario credits. A January move preserves them for the current year. If the move is flexible, model the tax impact of both timing options.

---

## 15.9 Ontario Tax on Split Income (TOSI) — Awareness Level

**Tax on Split Income (TOSI)** is a federal rule (not Ontario-specific) but it has significant Ontario tax consequences because it subjects income to **the highest marginal rate** regardless of the actual income level of the recipient.

TOSI applies when income is redirected from a high-income person to a lower-income family member through a private corporation (e.g., dividends paid to a spouse or adult child who doesn't meaningfully contribute to the business).

**When TOSI applies:** The income is taxed at **33% federal + 13.16% Ontario = 46.16%** — the top combined rate — even if the recipient's own income would normally be taxed at 20%.

This is a flag, not a deep dive. If a client mentions dividends from a family corporation going to a spouse or adult child, note it and refer to a tax advisor who specializes in corporate tax. Getting TOSI wrong generates large reassessments.

---

## 15.10 The ON428 Preparation Checklist

Use this for every Ontario resident's return.

### Federal Credits (Schedule 1) — Confirmed

- [ ] Basic Personal Amount: $16,129
- [ ] Age Amount (65+): calculated with $44,325 phase-out
- [ ] Spousal amount: $16,129 − spouse's net income
- [ ] CPP credit: T4 Box 16 × 15%
- [ ] EI credit: T4 Box 18 × 15%
- [ ] Canada Employment Amount: lesser of $1,433 or employment income
- [ ] Pension income amount: up to $2,000 if eligible pension income
- [ ] Disability amount: $9,872 if DTC-approved
- [ ] Medical expenses: optimized 12-month window on lower-income spouse's return
- [ ] Charitable donations: pooled on one return

### Ontario Credits (ON428) — Confirmed

- [ ] Ontario Basic Personal Amount: $11,865 (different from federal)
- [ ] Ontario Age Amount (65+): $5,812 with $42,335 phase-out
- [ ] Ontario Spouse/CLP Amount: $10,114
- [ ] Ontario CPP credit: T4 Box 16 × 5.05%
- [ ] Ontario EI credit: T4 Box 18 × 5.05%
- [ ] Ontario Disability Amount: $9,872 × 5.05% (if DTC-approved)
- [ ] Ontario Pension Income Amount: up to $1,533 if eligible
- [ ] Ontario Caregiver Amount: if supporting infirm dependant
- [ ] Ontario LIFT Credit: low-income clients with employment income
- [ ] Ontario Surtax: verify software has calculated correctly for incomes > $100K

### Form ON-BEN — Confirmed

- [ ] Client's principal residence address on December 31
- [ ] Renter: monthly rent amount, landlord name, landlord address
- [ ] Homeowner: property tax billed (not paid) during the year
- [ ] Senior homeowner (64+): Ontario Senior Homeowners' Property Tax Grant
- [ ] NOEC: client lives in a northern Ontario district?
- [ ] All months claimed are for Ontario principal residence only (not cottage, not pre-Ontario-residency months)

---

## 15.11 Case Studies — Ontario Tax in the Real World

### Case A — The Complete Ontario Return for a Mid-Income Employee

**Client:** Sandra, 38, single. Works as a marketing manager in Toronto. Ontario resident all year. Rents her apartment for $1,900/month.

**Income:**
- Employment income: $84,000 (T4 Box 14)
- CPP withheld (Box 16): $3,867
- EI withheld (Box 18): $1,049
- Tax withheld (Box 22): $18,400
- RRSP contribution: $8,000

**Net Income:** $84,000 − $8,000 RRSP = **$76,000**

**Federal Tax (Schedule 1):**

| Bracket | Income | Rate | Tax |
|---|---|---|---|
| $0–$57,375 | $57,375 | 15% | $8,606 |
| $57,376–$76,000 | $18,625 | 20.5% | $3,818 |
| **Gross federal tax** | | | **$12,424** |

Federal non-refundable credits:

| Credit | Amount | × 15% |
|---|---|---|
| Basic Personal | $16,129 | $2,419 |
| CPP | $3,867 | $580 |
| EI | $1,049 | $157 |
| Canada Employment | $1,433 | $215 |
| **Total credits** | | **$3,371** |

**Net federal tax: $12,424 − $3,371 = $9,053**

**Ontario Tax (ON428):**

| Bracket | Income | Rate | Tax |
|---|---|---|---|
| $0–$51,446 | $51,446 | 5.05% | $2,598 |
| $51,447–$76,000 | $24,554 | 9.15% | $2,247 |
| **Ontario basic tax** | | | **$4,845** |

Ontario surtax: $4,845 < $5,315 threshold → **no surtax**

Ontario non-refundable credits:

| Credit | Amount | × 5.05% |
|---|---|---|
| Basic Personal (ON) | $11,865 | $599 |
| CPP (ON) | $3,867 | $195 |
| EI (ON) | $1,049 | $53 |
| Canada Employment (ON) | $1,433 | $72 |
| **Total Ontario credits** | | **$919** |

**Net Ontario tax: $4,845 − $919 = $3,926**

**LIFT Credit:** Sandra's net income is $76,000 — above $30,000. LIFT Credit = $0.

**Total Tax Payable:**
Federal: $9,053 + Ontario: $3,926 = **$12,979**

**Balance: $12,979 − $18,400 withheld = REFUND of $5,421** ✅

**Ontario Trillium Benefit (ON-BEN):**
OEPTC: 20% × $22,800 rent = $4,560 deemed property tax → approximately **$987 OEPTC**
OSTC: Net income $76,000 − far above $24,916 threshold → **$0 OSTC**
**Annual OTB: ~$987** ($82/month)

**Total Sandra receives:**
- Tax refund: $5,421
- Annual OTB: $987 ($82/month ongoing)
- GST/HST credit: $0 (income too high)

The RRSP contribution saved her $8,000 × 29.65% (combined rate at her income) = **$2,372 in total tax** and preserved her OTB eligibility.

---

### Case B — The Ontario Surtax Surprise

**Client:** Victor, 51, senior software architect. Taxable income: $195,000.

His Ontario basic tax before surtax:

| Bracket | Income | Rate | Tax |
|---|---|---|---|
| $0–$51,446 | $51,446 | 5.05% | $2,598 |
| $51,447–$102,894 | $51,448 | 9.15% | $4,708 |
| $102,895–$150,000 | $47,106 | 11.16% | $5,257 |
| $150,001–$195,000 | $45,000 | 12.16% | $5,472 |
| **Ontario Basic Tax** | | | **$18,035** |

**Ontario Surtax:**
First layer: ($18,035 − $5,315) × 20% = $12,720 × 20% = $2,544
Second layer: ($18,035 − $6,802) × 36% = $11,233 × 36% = $4,044
**Total surtax: $6,588**

**Total Ontario tax: $18,035 + $6,588 = $24,623**

Victor assumed his provincial tax was about $18,000. He's actually paying $24,623. The surtax added $6,588 — 36.5% more than his basic Ontario tax.

**The planning implication:** Every deduction at Victor's income level (RRSP, moving expenses, employment expenses) saves him not just at the 12.16% Ontario nominal rate — but at the effective Ontario rate including surtax, which is closer to **16–17%** for the portion of income triggering the top surtax tier. Combined with 29% federal, the effective combined rate on his top-dollar deductions is approximately **45–46%**.

Victor should be maximizing every available deduction. At his income, the tax saved per dollar of deduction is nearly 46 cents.

---

### Case C — The New Ontario Resident (Recent Immigrant)

**Client:** Mei, arrived from Hong Kong on September 20, 2025. Ontario resident on December 31. She earned $18,000 from employment in Canada (October–December). She rents an apartment at $1,700/month, which she started in October.

**Province of residence:** Ontario (December 31 rule). Files as a full Ontario resident — but her Ontario Trillium Benefit reflects only the months she lived in Ontario.

**ON-BEN — Rent paid in Ontario:** $1,700 × 3 months = **$5,100** (October, November, December only)

**OEPTC on $5,100 pro-rated rent:** 20% × $5,100 = $1,020 deemed property tax. Credit approximately **$277** (energy component only, since property tax deemed amount is modest)

**OSTC:** Net income $18,000. Below $24,916 threshold. Base amount $345 — partial credit approximately **$345** (below threshold, full amount, pro-rated by months resident)

**LIFT Credit:** Employment income $18,000. Net income below $30,000. Ontario basic tax ≈ $18,000 × 5.05% = $909. LIFT Credit: **$909** — Ontario tax reduced to $0.

**Total Ontario tax: $0**

**Federal tax:** Employment income below BPA — after credits, federal tax: approximately **$0**

**Benefits triggered by filing:**

| Benefit | Annual Amount | Notes |
|---|---|---|
| GST/HST credit | ~$175 (pro-rated from Sept) | Partial year |
| CCB | N/A (no children) | |
| OTB | ~$345 OSTC + ~$277 OEPTC | First partial year |
| **Total first-year benefits** | **~$797** | |

Mei pays zero income tax and receives $797 in government benefits from a return that shows $18,000 in income. Many new Canadians don't file in their first year — they leave all of this on the table, year after year.

---

### Case D — The Senior Ontarian (Multiple Credits)

**Client:** Margaret, 72, retired. Lives in her owned home in Ottawa.

| Income Source | Amount |
|---|---|
| OAS (T4A(OAS)) | $8,300 |
| CPP (T4A(P)) | $11,200 |
| Employer DB pension (T4A) | $38,000 |
| RRIF withdrawal (T4RIF) | $14,000 |
| **Total income** | **$71,500** |

She has no other deductions. Net Income = $71,500. Taxable Income = $71,500.

**Federal credits applicable:**
- Basic Personal Amount: $16,129 × 15% = $2,419
- Age Amount: $8,790 − [($71,500 − $44,325) × 15%] = $8,790 − $4,076 = $4,714 × 15% = **$707**
- Pension income amount: $2,000 × 15% = **$300** (eligible pension + RRIF since 65)
- CPP credit: $0 (no CPP contributions — she's retired)

**Ontario credits applicable:**
- Ontario Basic Personal: $11,865 × 5.05% = $599
- Ontario Age Amount: $5,812 − [($71,500 − $42,335) × 5.05%] = $5,812 − $1,473 = $4,339 × 5.05% = **$219**
- Ontario Pension Income: $1,533 × 5.05% = **$77**

**ON-BEN (Senior Homeowner):**
- Property tax paid: $4,200/year
- OEPTC: approximately **$742**
- Ontario Senior Homeowners' Property Tax Grant: up to **$500** (income-tested — at $71,500 she may receive a partial amount)
- OSTC: income $71,500 — above $24,916 phase-out threshold → **$0**

**Annual OTB: approximately $742 + partial grant**

**Pension Income Splitting:** Margaret can split up to 50% of her eligible pension income ($38,000 DB pension + $14,000 RRIF since 65) with her spouse if she has one. This would reduce her net income, potentially restoring part of the Age Amount that phases out above $44,325. We cover pension splitting in depth in Week 17.

---

## 15.12 Common Ontario-Specific Errors — What to Watch For

| Error | Where It Happens | Cost |
|---|---|---|
| Using federal BPA ($16,129) on ON428 instead of Ontario BPA ($11,865) | ON428 | Overstated Ontario credit — CRA will catch and reassess |
| Missing the Ontario surtax | ON428 — usually software catches this | Understated Ontario tax |
| Claiming full year of rent on ON-BEN when client moved mid-year | ON-BEN | Overstated OEPTC — potential CRA review |
| Claiming rent for a property that wasn't principal residence | ON-BEN | Disallowed credit |
| Missing the LIFT Credit for low-income employment clients | ON428 | Client overpays Ontario tax unnecessarily |
| Missing the Ontario Senior Homeowners' Property Tax Grant | ON-BEN | Up to $500 missed |
| Claiming OTB for a client who moved out of Ontario before Dec 31 | ON-BEN | Ineligible claim — refund may be clawed back |
| Forgetting that Ontario Age Amount threshold ($42,335) differs from federal ($44,325) | ON428 | Wrong Age Amount calculation |

---

## 15.13 Week 15 Summary

!!! success "What you learned this week"
    - Provincial tax is **independent** of federal tax — both applied to the same taxable income but with their own brackets, rates, and credits. Ontario's combined top rate reaches **46.16%** including surtax
    - **Ontario's tax brackets:** 5.05% / 9.15% / 11.16% / 12.16% / 13.16% — applied on ON428
    - **Ontario surtax:** 20% on Ontario tax above $5,315 + an additional 36% above $6,802. Every client earning over ~$90,000 in Ontario will encounter the surtax — know how to explain it
    - **Ontario's Basic Personal Amount is $11,865** — lower than the federal $16,129. Never confuse the two
    - **Ontario Trillium Benefit (ON-BEN):** OSTC + OEPTC + NOEC. Renters use 20% of rent as deemed property tax. The claim covers only Ontario principal residence months — never more. Landlord information is required
    - **Ontario LIFT Credit:** Eliminates Ontario tax for low-income working Canadians (under ~$30,000 individual, $60,000 family). Requires employment income — passive income doesn't qualify
    - **Ontario Senior Homeowners' Property Tax Grant:** Up to $500 for seniors who own their home — consistently missed by preparers
    - **The December 31 rule is absolute:** Province of residence on that date determines the entire provincial tax calculation for the year — there is no monthly pro-ration
    - **Quebec is a special case:** Two separate returns (federal T1 + provincial TP-1). Do not prepare TP-1 without specific training
    - **Clients moving to Ontario in mid-year:** Use full Ontario rates but pro-rate ON-BEN rent/property tax to Ontario months only

---

## ✅ Week 15 Quiz

When you're ready, ask Claude: **"Quiz me on Week 15"** for an interactive test.

??? question "1. Your client has taxable income of $78,000. Calculate their Ontario basic tax using the 2025 brackets, and confirm whether the Ontario surtax applies."
    Bracket 1: $51,446 × 5.05% = $2,598. Bracket 2: ($78,000 − $51,446) × 9.15% = $26,554 × 9.15% = $2,430. **Ontario basic tax: $5,028**. Surtax check: $5,028 > $5,315? No — $5,028 is below $5,315. **No surtax applies.** Total Ontario tax before credits: $5,028. At $78,000, the client is just below the surtax threshold — one of the planning opportunities to be aware of.

??? question "2. Sandra rents an apartment in Toronto for $1,750/month. She moved to Toronto from Vancouver on June 1. What monthly rent amount should she enter on Form ON-BEN for the OEPTC?"
    Only the rent paid for the **Ontario principal residence** qualifies. Sandra moved to Ontario on June 1, so she pays Ontario rent for June through December = **7 months**. ON-BEN entry: $1,750 × 7 = **$12,250** for the year (not $1,750 × 12 = $21,000). Entering the full year's rent when she only lived in Ontario for 7 months would overstate the OEPTC claim and could be disallowed in a CRA review.

??? question "3. Victor earns $195,000 in taxable income. His Ontario basic tax is $18,035. Calculate the Ontario surtax and his total Ontario tax."
    First surtax layer: ($18,035 − $5,315) × 20% = $12,720 × 20% = $2,544. Second surtax layer: ($18,035 − $6,802) × 36% = $11,233 × 36% = $4,044. **Total surtax: $2,544 + $4,044 = $6,588**. **Total Ontario tax: $18,035 + $6,588 = $24,623**. Victor pays $6,588 more than his basic Ontario tax — a 36.5% premium. At his income level, every deduction is worth approximately 45–46 cents on the dollar combined, not 29 cents federal alone.

??? question "4. A client with net income of $24,000 works part-time (employment income of $24,000). Is she eligible for the Ontario LIFT Credit? What does it do for her?"
    Yes — she qualifies. The LIFT Credit applies to low-income Ontarians with employment income below the threshold (approximately $30,000 for a single person). Her Ontario basic tax (approximately $24,000 × 5.05% = $1,212 simplified) is fully offset by the LIFT Credit — reducing her Ontario provincial tax to **$0**. Combined with the federal Basic Personal Amount eliminating her federal tax, she pays zero combined income tax. She should still file to claim her GST/HST credit, CWB, and Ontario Trillium Benefit — all of which generate refundable cash payments regardless of her zero tax bill.

??? question "5. Robert lived in Ontario for all of 2025 except that he moved permanently to Alberta on December 20. Which province's tax rates apply to his full year of income, and does he qualify for the Ontario Trillium Benefit?"
    Robert was an **Alberta** resident on December 31. Alberta's tax rates apply to his **entire year** of taxable income — not just December. He does **not** qualify for the Ontario Trillium Benefit because he was not an Ontario resident on December 31, regardless of how many months he lived there. He files an Alberta provincial tax return (AB428) — not ON428. He misses all Ontario-specific credits and benefits for the year, despite spending 11.5 months in Ontario. If the timing of his move was flexible, a January move would have preserved a full year of Ontario benefits — an important planning point for clients with planned relocations.

??? question "6. Maria is 73, owns her home in Hamilton (property tax $4,400/year), and has total net income of $62,000. Calculate her Ontario Age Amount (and resulting Ontario credit), and identify what she can claim on ON-BEN."
    Ontario Age Amount: $5,812 − [($62,000 − $42,335) × 5.05%] = $5,812 − [$19,665 × 5.05%] = $5,812 − $993 = **$4,819**. Ontario credit: $4,819 × 5.05% = **$243**. ON-BEN: Maria is a senior homeowner (64+). She claims the **OEPTC** based on her $4,400 property tax — approximately **$742 OEPTC**. She also qualifies for the **Ontario Senior Homeowners' Property Tax Grant** of up to $500 (income-tested — at $62,000 she likely receives a partial amount, approximately $350–$400). The **OSTC** phases out well below $62,000, so she receives $0 on that component. **Total annual OTB: approximately $1,100–$1,150**.

??? question "7. A client apologetically hands you a return that has the federal Basic Personal Amount ($16,129) entered in the Ontario BPA field on ON428 instead of Ontario's $11,865. What is the error and what does it cost the client if uncorrected?"
    The Ontario Basic Personal Amount is **$11,865** — not $16,129. The error overstates the Ontario credit by ($16,129 − $11,865) × 5.05% = $4,264 × 5.05% = **$215**. The client received a $215 Ontario tax credit they weren't entitled to. CRA's assessment system will catch this when comparing the ON428 to the legislated amounts and will reassess — adding $215 to the client's balance owing, plus interest from the original filing date. File a **T1-ADJ** immediately to self-correct before CRA reassesses. The penalty for a preparer who makes this error repeatedly is a reputational one — every return must be verified against the correct provincial amounts, not copied from the federal Schedule 1.

---

## 📚 Further Reading

- [CRA: Ontario Tax — ON428](https://www.canada.ca/en/revenue-agency/services/forms-publications/tax-packages-years/general-income-tax-benefit-package/ontario.html)
- [Ontario: Trillium Benefit and ON-BEN](https://www.ontario.ca/page/ontario-trillium-benefit)
- [Ontario: LIFT Credit details](https://www.ontario.ca/page/low-income-individuals-and-families-tax-lift-credit)
- [Ontario: Senior Homeowners' Property Tax Grant](https://www.ontario.ca/page/senior-homeowners-property-tax-grant)
- [CRA: Provincial and territorial tax rates](https://www.canada.ca/en/revenue-agency/services/tax/individuals/frequently-asked-questions-individuals/canadian-income-tax-rates-individuals-current-previous-years.html)
- [Revenu Québec: Filing in Quebec](https://www.revenuquebec.ca/en/citizens/income-tax-return/filing-your-income-tax-return/)

---

!!! tip "Up Next: Week 16"
    **Common Mistakes and CRA Audits** — the 20 errors that generate the most CRA reassessments, how to prepare a return that survives a review, what to do when a client receives a CRA review letter, and how to respond to an audit on behalf of a client. This week is about protecting your clients — and protecting your professional reputation — by understanding exactly what CRA looks for and how to stay ahead of it.
