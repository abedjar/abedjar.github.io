# Week 17: Seniors, Pension Income Splitting & Deceased Returns

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Identify every tax credit and deduction available exclusively to seniors in Ontario
    - Apply pension income splitting (Form T1032) to reduce a couple's combined tax
    - Calculate the OAS clawback and advise on strategies to reduce or eliminate it
    - Understand the unique tax situation of a deceased taxpayer and their estate
    - Prepare a terminal T1 return (the final return for the year of death)
    - Know which optional returns are available for a deceased person — and when they create value
    - Handle RRSP and RRIF on death — including the spousal rollover
    - Advise executors on filing obligations, deadlines, and CRA clearance certificates
    - Identify the Ontario-specific senior benefits and how they interact

!!! tip "Why this week matters to your business"
    Seniors are the **highest-value client segment** in Canadian tax preparation. They have the most complex returns, the most planning opportunities, the highest willingness to pay for competent advice, and the highest referral rates. A senior whose return is optimized — pension income split correctly, OAS preserved, estate handled professionally — will refer their adult children, their friends, and their siblings. One well-served senior client can generate five new client relationships over two years. Learn this material deeply. It is one of the most commercially important weeks in this entire course.

---

## 17.1 Who Is a "Senior" for Tax Purposes?

In Canadian tax, certain credits and strategies become available at specific ages. Know these thresholds precisely:

| Age | What Becomes Available |
|---|---|
| **60** | Can begin receiving CPP (reduced amount) |
| **65** | Age Amount credit (federal + Ontario). Pension Income Amount. RRIF withdrawals eligible for pension income credit. Pension income splitting. OAS begins |
| **70** | Maximum CPP if deferred |
| **71** | RRSP must be converted to RRIF or annuity by December 31 |
| **72** | Mandatory RRIF minimum withdrawals begin |

The most important threshold for tax planning is **65** — it unlocks the majority of senior-specific tax tools.

---

## 17.2 Senior Tax Credits — The Complete Ontario Picture

### Federal Senior Credits (Schedule 1)

=== "Age Amount — Line 30100"

    **Who:** Taxpayer is 65 or older on December 31 of the tax year.
    **2025 federal amount:** $8,790
    **Federal credit:** $8,790 × 15% = **$1,319**

    **Phase-out:** Reduces at 15% of net income above **$44,325**

    ```
    Age Amount = $8,790 − [(Net Income − $44,325) × 15%]
    Fully eliminated at net income of approximately $103,925
    ```

    **Transfer to spouse:** If the senior does not have enough federal tax to use the full Age Amount, the unused portion can be transferred to their spouse. This is done via the Spouse/CLP Amount calculation on Line 30300 — not a separate transfer form.

=== "Pension Income Amount — Line 31400"

    **Who:** Taxpayer receives **eligible pension income** (see definition below).
    **2025 maximum:** $2,000
    **Federal credit at maximum:** $2,000 × 15% = **$300**

    **What counts as eligible pension income:**

    | Income Source | Under 65 | 65 and Over |
    |---|---|---|
    | Defined benefit (DB) pension | ✅ Yes | ✅ Yes |
    | Annuity from RRSP or DPSP | ✅ Yes | ✅ Yes |
    | RRIF payments | ❌ No | ✅ Yes |
    | LIF/PRIF payments | ❌ No | ✅ Yes |
    | CPP and OAS | ❌ No | ❌ No (never) |
    | RRSP withdrawals (lump sum) | ❌ No | ❌ No |

    !!! warning "CPP and OAS are NEVER eligible for the pension income amount"
        This surprises many seniors. CPP and OAS payments — the two most common retirement income sources — do **not** qualify for the $2,000 pension income amount. The credit is designed for private pension arrangements. A senior living entirely on CPP and OAS gets zero pension income amount unless they have some DB pension or RRIF income.

        **The planning implication:** A senior with only CPP and OAS can open a RRIF, move a small amount from their RRSP, and begin drawing even $2,000/year — which qualifies as eligible pension income and unlocks the $2,000 pension income amount ($300 federal credit + $77 Ontario credit = $377 combined annually). This works even before age 71.

=== "OAS Clawback — Line 23500 / Line 42200"

    **What it is:** The OAS Recovery Tax — a mechanism by which high-income seniors repay part or all of their Old Age Security benefit.

    **2025 clawback threshold:** **$90,997** net income
    **Clawback rate:** 15% of net income above the threshold
    **Full OAS repayment at:** approximately **$148,179** net income

    ```
    OAS clawback = (Net Income − $90,997) × 15%
    Maximum OAS (2025): approximately $8,500/year
    Full clawback at net income: $90,997 + ($8,500 ÷ 15%) = ~$147,664
    ```

    **How it appears on the return:**
    - OAS received: added to income on Line 11300
    - OAS clawback: deducted on Line 23500 (reduces net income)
    - OAS clawback repayment: added to tax payable on Line 42200

    The net effect: the gross OAS is included in income (raising benefits calculations) but the repayment comes out of the tax calculation. The clawback is effectively a 15% surtax on every dollar of net income above $90,997.

    !!! example "Case — The Painful OAS Clawback"
        Robert, 73, has a large RRIF (a consequence of not starting withdrawals early — covered in Week 11). His 2025 income:

        | Source | Amount |
        |---|---|
        | DB pension | $52,000 |
        | CPP | $14,000 |
        | OAS received | $8,300 |
        | RRIF mandatory minimum | $68,000 |
        | **Net income** | **$142,300** |

        OAS clawback: ($142,300 − $90,997) × 15% = $51,303 × 15% = **$7,695**

        Robert keeps only $8,300 − $7,695 = **$605 of his annual OAS** — he is repaying almost all of it.

        At his combined marginal rate, every dollar of RRIF income above $90,997 costs him not 46.16% but effectively **46.16% + 15% = 61.16%** — one of the highest effective tax rates in the Canadian system.

        **The lesson:** Robert needed a melt-down strategy 8–10 years ago. Now the damage is done. For younger clients approaching retirement with large RRSPs, the OAS clawback conversation is urgent, not optional.

### Ontario Senior Credits (ON428)

=== "Ontario Age Amount"

    **2025 Ontario amount:** $5,812
    **Ontario credit:** $5,812 × 5.05% = **$294**

    **Phase-out begins:** Net income above **$42,335** (note: $1,990 lower than the federal $44,325 threshold)

    ```
    Ontario Age Amount = $5,812 − [(Net Income − $42,335) × 5.05%]
    ```

    At $42,335 net income: full $294 Ontario credit
    At $55,000 net income: $5,812 − [$12,665 × 5.05%] = $5,812 − $640 = $5,172 × 5.05% = $261
    At $115,000+: fully eliminated

=== "Ontario Pension Income Deduction"

    Ontario allows a **pension income deduction** of up to $1,533 for eligible pension income — reducing Ontario taxable income directly.

    **Ontario credit on maximum:** $1,533 × 5.05% = **$77**

    Eligible pension income (same definition as federal pension income amount). The Ontario deduction applies at the ON428 level — separate from the federal pension income credit.

=== "Ontario Senior Homeowners' Property Tax Grant (ON-BEN)"

    **Who:** Ontario residents age 64 or older who own and reside in their home.
    **2025 maximum:** **$500**
    **Claimed on:** Form ON-BEN

    This is a fully refundable grant — it is paid even if the senior owes no Ontario tax.

    **Phase-out:** Income-tested. At higher incomes, the grant reduces. Most seniors receiving meaningful pension income receive a partial or full grant.

    **Why it's missed:** It's buried in ON-BEN, which many seniors assume only applies to renters claiming OEPTC. Every senior homeowner client — without exception — should have ON-BEN completed.

---

!!! question "Quick Check"
    Robert (72) has net income of $96,500: DB pension $54,000, CPP $13,000, OAS $8,300, and RRIF mandatory minimum $21,200. His wife Helen (68) has only CPP $7,200 and OAS $7,500 (total income: $14,700). Calculate Robert's OAS clawback before any pension splitting, then determine the minimum eligible pension allocation to Helen that eliminates the clawback entirely.

??? answer
    **OAS clawback before splitting:**
    ($96,500 − $90,997) × 15% = $5,503 × 15% = **$826 clawed back**
    Robert keeps only $8,300 − $826 = $7,474 of his annual OAS.

    **Minimum allocation to eliminate the clawback:**
    Robert's net income must drop to $90,997.
    Required reduction: $96,500 − $90,997 = **$5,503**

    Allocate $5,503 of eligible pension income to Helen via Form T1032.
    Robert's eligible income: DB pension $54,000 + RRIF $21,200 (eligible at age 65+) = $75,200. The $5,503 allocation is well within the 50% maximum of $37,600.

    **After the split:**
    Robert's net income: $90,997 → OAS clawback: **$0** ✅
    Helen's new income: $14,700 + $5,503 = $20,203 — still below BPA, so she pays **no additional federal tax**.

    **Total annual saving:** $826 OAS recovered + marginal rate differential on $5,503 ≈ **$1,052/year** — from allocating just $5,503 on a form that takes 15 minutes. Over a 15-year retirement: **$15,780 in cumulative savings** from one overlooked planning decision.

---

## 17.3 Pension Income Splitting — The Most Powerful Senior Tax Strategy

**Pension income splitting** allows a taxpayer to allocate up to **50% of their eligible pension income** to their spouse or common-law partner — even if the pension is paid entirely to one person. The split is made on paper only — no money actually changes hands. The tax savings are real.

### The Mechanics

1. The **transferring spouse** (the one who received the pension income) allocates a portion to their spouse using **Form T1032 (Joint Election to Split Pension Income)**
2. The allocated amount is **deducted** from the transferring spouse's income on Line 21000
3. The allocated amount is **added** to the receiving spouse's income on Line 11600
4. **Both returns** must be filed in the same year and both spouses must sign Form T1032

### What Income Can Be Split

| Income Source | Under 65 | 65 and Over |
|---|---|---|
| DB pension (registered pension plan) | ✅ Yes | ✅ Yes |
| RRIF payments | ❌ No | ✅ Yes |
| Life Income Fund (LIF) payments | ❌ No | ✅ Yes |
| Annuity payments from RRSP/DPSP | ✅ Yes | ✅ Yes |
| CPP | ❌ No — use CPP sharing instead | ❌ No |
| OAS | ❌ No | ❌ No |
| RRSP withdrawals | ❌ No | ❌ No |

!!! warning "CPP cannot be split using Form T1032"
    CPP income is split through a separate **CPP sharing** arrangement administered directly by Service Canada — not through pension income splitting on the T1. Many clients confuse the two. Form T1032 handles DB pension and RRIF income only.

### Calculating the Optimal Split

The goal of pension income splitting is to equalize the marginal tax rates of both spouses — ideally bringing both into the same bracket, which minimizes the combined tax paid by the family unit.

The optimal split is not always 50%. Sometimes a smaller allocation achieves the same rate equalization with less complexity.

!!! example "Case — Pension Income Splitting in Action"
    **Robert** (68): DB pension $62,000, CPP $14,000, OAS $8,300. Total income: **$84,300**
    **Helen** (65): CPP $6,400, OAS $7,200. Total income: **$13,600**

    Combined family income: **$97,900**

    Without splitting:
    Robert's net income: $84,300 → marginal combined rate: ~29.65% on income above $57,375
    Robert's federal tax (approximate): ~$12,800
    Helen's net income: $13,600 → no federal tax (below BPA)
    OAS clawback: Robert's net income is below $90,997 → **no clawback**

    **Can they do better?** Yes. Robert's DB pension ($62,000) is eligible for splitting.

    **Strategy: Split $24,000 of DB pension to Helen**

    Robert's new income: $84,300 − $24,000 = **$60,300**
    Helen's new income: $13,600 + $24,000 = **$37,600**

    **Tax savings:**
    Robert saves tax on $24,000 moved out of his ~29.65% bracket
    Helen pays tax on $24,000 at her ~20.05% combined bracket
    **Annual saving: $24,000 × (29.65% − 20.05%) = $24,000 × 9.60% = $2,304**

    Over a 20-year retirement: **$46,080 in cumulative tax savings** — from a form that takes 15 minutes to complete.

    **Additional benefits of splitting:**
    - Robert's lower net income may restore part of his Age Amount (reduces below $44,325 threshold)
    - Helen's new income of $37,600 stays below the CCB/GST phase-out thresholds
    - Helen now has $2,000 in eligible pension income → unlocks her $300 federal + $77 Ontario pension income amount credit = **$377/year additional**

    **The combined effect of pension income splitting goes far beyond the rate difference alone.**

### The OAS Clawback Strategy — Use Splitting to Stay Below $90,997

When a high-income senior has net income approaching or above the OAS clawback threshold ($90,997), pension income splitting is one of the most powerful tools to keep income below the threshold.

!!! example "Case — Splitting to Preserve OAS"
    **Margaret** (71): DB pension $55,000, CPP $13,000, OAS $8,300, RRIF minimum $18,000. Net income: **$94,300**

    OAS clawback: ($94,300 − $90,997) × 15% = $3,303 × 15% = **$495 clawed back**

    Margaret's husband **George** (70): CPP only $9,000, no other income.

    **Strategy: Split $4,000 of RRIF income to George**

    Margaret's new net income: $94,300 − $4,000 = **$90,300** — below the clawback threshold.
    **OAS clawback: $0**

    George's new income: $9,000 + $4,000 = $13,000 — still below BPA, so he pays no additional tax.

    **Annual saving:**
    OAS recovered: **$495**
    George's additional tax: **$0**
    Net annual saving: **$495** — from a $4,000 income reallocation that costs nothing.

    Every year Margaret and George go forward without this strategy costs them $495 in unnecessary OAS repayment. Over 15 years: **$7,425 in avoidable losses** from a single missed planning decision.

---

## 17.4 CPP Sharing — A Separate Strategy

CPP sharing is **different** from pension income splitting. It is administered by Service Canada (not CRA) and works as follows:

- Both spouses must be 60+ and receiving CPP
- A portion of each spouse's CPP is "shared" (assigned to the other) based on cohabitation period
- The result: lower-earning spouse receives more CPP; higher-earning spouse receives less
- **Tax effect:** The higher-income spouse has less CPP income; the lower-income spouse has more — partial income equalization

**How to apply:** Form ISP-1002 (Application for CPP Benefit Sharing) — submitted to Service Canada, not CRA.

**Key distinction:** CPP sharing is a benefit administration change. Pension income splitting (T1032) is a tax election. Both can be used simultaneously, but they operate through completely different systems.

---

!!! question "Quick Check"
    Patricia is 69 years old. She receives only OAS ($8,300) and CPP ($9,800) — total income $18,100. She has a $35,000 RRSP she has never touched. She currently claims neither the federal Pension Income Amount nor the Ontario pension income deduction. What single action generates these credits, and what is the combined annual credit worth?

??? answer
    Patricia has no eligible pension income — CPP and OAS **never** qualify for the Pension Income Amount, regardless of age. To unlock the credit, she can **convert a portion of her RRSP to a RRIF** and take a minimum withdrawal of at least $2,000. RRIF payments qualify as eligible pension income for taxpayers age 65+.

    Even a withdrawal of exactly $2,000 is sufficient to access the full $2,000 Pension Income Amount base.

    **Annual credit value:**
    - Federal Pension Income Amount: $2,000 × 15% = **$300**
    - Ontario pension income deduction: $1,533 × 5.05% = **$77**
    - **Combined annual credit: $377**

    At Patricia's income level ($18,100), she pays minimal or zero tax. The $377 offsets any residual Ontario tax, and any excess reduces her tax to zero. The $2,000 RRIF withdrawal itself is taxable — but fully sheltered by her BPA and other credits at this income level. Net additional tax: approximately $0.

    RRIF setup costs nothing at major banks. This one-time suggestion delivers **$377 per year for the rest of her life** — from a single phone call to her bank.

---

## 17.5 Deceased Returns — The Terminal T1

When a client dies, their executor (or estate trustee) has a legal obligation to file one or more income tax returns for the deceased. As a tax preparer, you may be asked to prepare these — either by the executor or by a surviving family member.

This is specialized work. Handle it carefully. The executor is personally liable for the deceased's tax obligations if they distribute the estate before obtaining a CRA clearance certificate.

### The Timeline and Obligations

| Event | Filing Obligation | Deadline |
|---|---|---|
| Death occurs | File the **terminal T1** for the year of death | 6 months after date of death, or April 30 (June 15 if self-employed), whichever is later |
| Prior years not filed | File any outstanding returns for prior years | Normal filing rules apply |
| Estate earns income after death | File a **T3 Trust Return** for estate income | 90 days after the estate's tax year-end |
| Distribution of assets | Obtain **CRA Clearance Certificate (TX19)** | Before final distribution |

!!! warning "The executor's personal liability is real"
    If an executor distributes estate assets before obtaining a CRA clearance certificate and CRA later determines the deceased owed additional taxes, the executor can be held **personally liable** for the shortfall — from their own assets. This is not a hypothetical risk. It happens. Always advise executors to obtain the clearance certificate before final distribution.

### What Goes on the Terminal T1

The terminal return covers **January 1 to the date of death** of the final year. It is essentially a normal T1 with these key differences:

| Item | How It's Handled on the Terminal T1 |
|---|---|
| Income | All income earned up to the date of death — including a fraction of periodic income (pension, OAS, CPP) |
| RRSP/RRIF | **Deemed disposition** — full fair market value added to income unless rolled to a surviving spouse |
| Other capital property | **Deemed disposition at FMV** on date of death — capital gains triggered |
| Credits | Full annual amounts for the year — not pro-rated (except refundable benefits) |
| Spousal credits | May still be claimed for a spouse who was alive at any point in the year |
| RRSP deduction | Can still be claimed for contributions made before death |

### The RRSP/RRIF on Death — The Biggest Tax Event

!!! danger "An unsheltered RRSP/RRIF can generate a massive tax bill on the terminal return"
    When someone dies with an RRSP or RRIF, the **entire fair market value** of the plan is added to income in the year of death — unless a qualifying rollover is available.

    A 78-year-old with a $600,000 RRIF who dies with no surviving spouse: $600,000 is added to terminal return income. Combined with DB pension and OAS, the terminal return income could reach $700,000+. Tax at Ontario's top rate (46.16%): approximately $280,000 owing from the estate — plus interest if not paid promptly.

    This is why RRSP/RRIF melt-down strategies (covered in Week 11) are so important during a client's lifetime. Prevention is infinitely better than estate tax management after death.

### Qualifying Rollovers — Who Reduces This Tax

**Rollover to a surviving spouse or CLP:** If there is a surviving spouse, the RRSP or RRIF can roll over to the spouse's RRSP or RRIF — **with no tax consequence in the year of death**. The spouse pays tax as withdrawals occur, preserving the deferral.

**Rollover to a financially dependent child or grandchild:** A dependent child (under 18 or financially dependent due to disability) can receive the RRSP/RRIF with reduced tax consequences. Rules are complex — refer to a tax specialist for these situations.

**Rollover to a spouse (T2019):** The executor elects the rollover using **Form T2019 (Death of an RRSP Annuitant)**. This is filed with the terminal return. The surviving spouse must be designated as successor annuitant or beneficiary.

!!! example "Case — RRSP on Death with and without Rollover"
    **Margaret dies on October 15, 2025.** She has a $380,000 RRSP. Her husband George is alive and is the designated beneficiary.

    **Without rollover:**
    $380,000 added to Margaret's terminal return income.
    Combined with her pension/CPP/OAS for the year (~$52,000):
    Terminal return income: ~$432,000
    Estimated Ontario top-rate tax on the RRSP portion: $380,000 × 46.16% = **$175,408** payable from the estate.

    **With spousal rollover:**
    $0 added to Margaret's terminal return for the RRSP.
    George receives $380,000 in his own RRSP — no immediate tax.
    George pays tax gradually as he withdraws from the RRSP over the rest of his retirement.

    Tax saved by the rollover: approximately **$175,408** — deferred until George's withdrawals.

    If George is already in a lower bracket in retirement, the ultimate tax will be far less than $175,408. The rollover is almost always the right decision when a surviving spouse exists.

---

## 17.6 The Three Optional Returns for Deceased Persons

Beyond the terminal T1, the tax rules allow up to **three additional optional returns** for a deceased person. Each optional return gets its own set of personal credits (BPA, etc.) — effectively multiplying the credits available to the estate.

Filing optional returns where applicable can save the estate thousands of dollars.

### Optional Return 1 — Return for Rights or Things

**What it covers:** Amounts that were earned but not yet received at the date of death, such as:
- Salary earned but not yet paid (e.g., last two weeks of wages)
- Vacation pay owing but not yet received
- Unpaid dividends that were declared before death
- Bond interest accrued but not yet paid
- Crops harvested but not yet sold (farming)

**Why it saves tax:** Instead of stacking these amounts on top of the terminal return income (which may already be in the highest bracket), they are reported on a **separate return** — which gets its own BPA, Age Amount, and other personal credits. Effectively, you apply the low tax brackets twice.

!!! example "Case — Rights or Things Return Saving"
    David dies on November 30, 2025. He was employed until death.

    **Rights or things owed at death:**
    - Unpaid salary (December 1–30 wages, paid in January): $4,800
    - Vacation pay owing: $2,200
    - Total rights or things: $7,000

    **Option A — Include on terminal return:**
    David's terminal return income is already $78,000. The additional $7,000 pushes him further into the 29.65% combined bracket.
    Tax on $7,000 at 29.65%: **$2,076**

    **Option B — File a separate Rights or Things return:**
    The $7,000 is the only income on this return.
    After applying the BPA ($16,129): taxable income is $0.
    Tax on $7,000: **$0** (fully sheltered by the duplicate BPA)

    **Saving: $2,076** — from filing a second return that takes 20 minutes to prepare.

    The Rights or Things return uses its own set of personal credits — it's as if you get to apply the BPA twice. For an estate with significant rights or things, this is pure value.

### Optional Return 2 — Return for Income from a Testamentary Trust

Applies when the deceased was a beneficiary of a testamentary trust that had a non-December 31 year-end. Less common — mention it but you'll rarely need it in your first years.

### Optional Return 3 — Return for a Partner or Proprietor

Applies when the deceased had business income from a proprietorship or partnership with a non-December 31 fiscal year-end. The income from the prior fiscal year that wasn't yet reportable can go on a separate return with its own credits.

---

## 17.7 The Estate — After the Terminal Return

After the terminal return is filed, the estate itself may generate income (investment income, rental income, etc.) while assets are being administered and distributed. This income is reported on a **T3 Trust and Estate Return** — a completely different return from the T1.

As a personal tax preparer, T3 trust returns are outside your scope in Year 1. Know they exist, know they have their own filing deadline (90 days after the estate's year-end), and refer to a CPA or tax lawyer who handles estate administration for complex situations.

### The CRA Clearance Certificate (TX19)

Before an executor distributes the estate assets to beneficiaries, they should obtain a **CRA Clearance Certificate** confirming that all taxes have been assessed and paid.

**Why it matters:** Without a clearance certificate, if CRA later audits and finds additional taxes owed, the executor is personally liable to the extent of the distributed assets.

**How to obtain it:**
1. File all outstanding T1 returns for the deceased
2. Ensure all T3 trust returns are filed
3. Pay all taxes owing
4. Submit **Form TX19** to CRA with supporting documentation
5. CRA issues the clearance certificate — typically within 4–6 months

**Advise every executor:** Do not make the final distribution until you have this certificate in hand.

---

## 17.8 Ontario-Specific Senior Considerations

### The Ontario Trillium Benefit — Senior Enhancements

**OEPTC for Seniors (65+):**
The OEPTC has a slightly higher maximum for seniors:
- Under 65: maximum approximately $1,195
- 65 and over: maximum approximately $1,247

The difference is modest but real. Seniors who have been claiming the OEPTC for years may not realize the amount increased when they turned 65. Verify the correct age-related maximum is being used each year.

**Senior Homeowners' Property Tax Grant:**
Covered in Week 15. Maximum $500. Claimed on ON-BEN. Income-tested but most seniors with moderate pension income qualify for at least a partial amount. **Never miss this for senior homeowner clients.**

### Long-Term Care and Nursing Homes

For seniors who live in a long-term care facility (nursing home) in Ontario:

**Medical expenses:** Fees paid for long-term care that include nursing care, therapy, and medical services are eligible medical expenses. The full accommodation cost is generally eligible — it is not just the medical component.

**OEPTC:** Residents of long-term care homes claim 25% of their accommodation cost as the "property tax" equivalent for OEPTC purposes. The landlord information on ON-BEN is the nursing home's name and address.

!!! example "Case — The Long-Term Care Resident's Tax Return"
    Patricia, 84, moved into a long-term care home in London, Ontario in March 2025. Monthly fee: $3,400. Annual cost from March–December: $34,000.

    **Medical expense credit:** $34,000 may qualify as a medical expense. Patricia's net income: $28,000 (OAS + CPP + small pension). Her 3% threshold: $840. Net eligible: $34,000 − $840 = $33,160 × 15% = **$4,974 federal credit** alone.

    This is potentially the largest single medical expense credit you will prepare. Nursing home fees for a full year can exceed $40,000 — and virtually the entire amount qualifies. For a senior paying $40,000 in care costs on $28,000 in income, the medical credit can eliminate their federal and Ontario tax entirely — plus generate a refund if refundable credits are available.

    **OEPTC on ON-BEN:** 25% × $34,000 = $8,500 deemed property tax → approximately **$1,247 OEPTC** (senior maximum)

    Never prepare a long-term care resident's return without capturing both the medical expense credit and the OEPTC. These two items alone can represent thousands of dollars in combined credits.

---

## 17.9 Complete Senior Planning Checklist

Use this for every client aged 65 or older.

### Income Optimization

- [ ] OAS clawback check: Is net income above $90,997? If yes — are there splitting or deduction opportunities to bring it below?
- [ ] RRIF minimum taken: Amount confirmed from T4RIF Box 16
- [ ] Pension income splitting: Is one spouse in a significantly higher bracket? Have both spouses signed T1032?
- [ ] Age Amount phase-out: Is net income between $44,325 and $103,925? Any available deductions (RRSP, pension split) to restore the Age Amount?
- [ ] Ontario Age Amount phase-out: Is net income between $42,335 and $115,000? Separate from federal calculation

### Credits — Federal

- [ ] Age Amount (Line 30100): Calculated with income-based reduction
- [ ] Pension Income Amount (Line 31400): $2,000 maximum — confirmed eligible pension income
- [ ] Medical expenses (Line 33099): Long-term care fees included if applicable. 12-month window optimized
- [ ] Disability Tax Credit: Applied for and approved if relevant cognitive or physical impairment
- [ ] Home Accessibility Tax Credit: Any accessibility renovations in the year?

### Credits — Ontario (ON428)

- [ ] Ontario Age Amount: $5,812 base with $42,335 reduction threshold
- [ ] Ontario Pension Income Deduction: Up to $1,533 for eligible pension income
- [ ] Ontario LIFT Credit: Not applicable at pension income levels (employment income required) — confirm not incorrectly claimed

### Form ON-BEN

- [ ] OEPTC claimed using correct senior rate (higher maximum at 65+)
- [ ] Senior Homeowners' Property Tax Grant: ON-BEN completed for every senior homeowner
- [ ] Long-term care resident: 25% of accommodation cost used as property tax equivalent

---

!!! tip "In your tax software"
    - **T1032 joint election (pension income splitting):** Both spouses' returns must be prepared together in the same software session. Enter the split amount in the T1032 section — it deducts from the transferring spouse's income (Line 21000) and adds to the receiving spouse's income (Line 11600). Both must sign the Form T1032 before filing. Confirm the allocated amount does not exceed 50% of the transferring spouse's eligible pension income for the year.

    - **OAS clawback verification:** When net income exceeds $90,997, software should automatically populate Line 23500 (social benefits repayment deduction) and Line 42200 (repayment amount added to tax payable). Verify both appear. If the client is splitting pension income to drop below the threshold, confirm the split is entered first before rechecking the clawback calculation.

    - **T4RIF entry:** Box 16 (minimum RRIF amount) goes to the pension income section (Line 11500). Confirm age: RRIF payments are eligible for pension income splitting and the Pension Income Amount only for taxpayers age 65+. For taxpayers under 65 receiving RRIF income, neither the split nor the credit applies.

    - **Terminal T1 — death date entry:** Enter the date of death in the taxpayer information section. Software should prompt for the RRSP/RRIF deemed disposition. If a surviving spouse exists and the rollover is elected (Form T2019), indicate this in the RRSP section — the RRSP value does not appear in income. If no rollover is available, the full FMV is added to terminal return income.

    - **Rights or Things optional return:** File as a separate T1 within the software. This optional return gets its own complete set of personal credits — BPA, Age Amount, etc. — which is the entire source of the tax saving. Explain to the executor why a second return is being prepared; many assume one return per deceased person.

    - **Senior Homeowners' Property Tax Grant (ON-BEN):** Every senior homeowner client — age 64+ — must have ON-BEN completed. Maximum $500, refundable. Verify the client's age and ownership status at intake. This grant is routinely missed when preparers assume ON-BEN only applies to renters.

---

## 17.10 Case Studies — Senior Returns and Deceased Estates

### Case A — The Complete Senior Couple Return

**Clients:** Robert (71) and Helen (68). Both Ontario residents. Robert retired from a manufacturing company.

**Robert's income:**
- DB pension (T4A): $58,000
- CPP (T4A(P)): $13,200
- OAS (T4A(OAS)): $8,300
- RRIF minimum withdrawal (T4RIF): $22,000
- **Total: $101,500**

**Helen's income:**
- CPP: $6,800
- OAS: $7,200
- **Total: $14,000**

**Combined family income: $115,500**

**Step 1 — OAS Clawback Check:**
Robert's net income: $101,500
OAS clawback threshold: $90,997
Excess: $101,500 − $90,997 = $10,503
Clawback: $10,503 × 15% = **$1,575** — Robert repays $1,575 of his $8,300 OAS.

**Step 2 — Pension Income Splitting Analysis:**
Robert's eligible income for splitting: $58,000 (DB pension) + $22,000 (RRIF, since 65) = $80,000 eligible.
Maximum split: 50% = **$40,000**

**Target:** Bring Robert's net income below $90,997 to eliminate the OAS clawback.
Required reduction from Robert: $101,500 − $90,997 = **$10,503**
Amount to allocate to Helen: minimum $10,504 (round to $11,000 for a clean number)

**After allocating $11,000 to Helen:**
Robert's net income: $101,500 − $11,000 = **$90,500** (below $90,997) ✅
OAS clawback: **$0** ✅

Helen's new income: $14,000 + $11,000 = **$25,000**
Helen's marginal rate at $25,000: ~20.05%
Robert's marginal rate at $90,500: ~29.65%
Tax saving on $11,000 allocated: $11,000 × (29.65% − 20.05%) = $11,000 × 9.60% = **$1,056**
Plus OAS clawback eliminated: **$1,575**
**Total annual saving from this one strategy: $2,631**

**Additional benefit:**
Robert's Age Amount (federal): $8,790 − [($90,500 − $44,325) × 15%] = $8,790 − $6,926 = $1,864
Without splitting: $8,790 − [($101,500 − $44,325) × 15%] = $8,790 − $8,576 = $214
**Age Amount restored by splitting: an additional $1,650 in eligible amount = $1,650 × 15% = $248 more federal credit**

Helen now has $2,000 in eligible pension income (the $11,000 RRIF allocation qualifies) → Helen can now claim the **pension income amount**: $2,000 × 15% = $300 federal + $77 Ontario = **$377 annual credit she didn't have before**

**Total combined annual optimization from pension income splitting: approximately $3,256**

This takes 20 minutes to implement on Form T1032. This family was leaving $3,256 on the table every single year before you.

---

### Case B — The Terminal Return

**Client:** Margaret Chen dies on August 22, 2025, at age 79. Her daughter Linda is the executor.

**Margaret's income January 1 – August 22, 2025:**

| Source | Amount |
|---|---|
| DB pension (T4A, prorated to Aug 22) | $26,400 (8 months of $3,300/month) |
| OAS (T4A(OAS), prorated) | $5,533 (8 months of $692/month) |
| CPP (T4A(P), prorated) | $7,467 (8 months of $933/month) |
| RRSP (FMV at death — no surviving spouse) | $148,000 deemed disposition |
| **Terminal return income** | **$187,400** |

**RRSP on death:** Margaret had no surviving spouse. Her RRSP has a named beneficiary (Linda). The full $148,000 is added to Margaret's terminal return income. No rollover available.

**Tax consequences on terminal return:**
Income: $187,400
Federal tax (approximate): $42,000
Ontario tax with surtax (approximate): $22,000
**Estimated total tax: ~$64,000** payable from the estate

Linda is shocked. Margaret had $148,000 in her RRSP "for her." She didn't realize that naming a non-spouse beneficiary means the RRSP is fully taxable in the year of death. The estate must pay the tax before distributing what remains to Linda.

**What you explain to Linda:**
*"This is called a deemed disposition on death. When your mother passed away with an RRSP and no surviving spouse, CRA treats the full RRSP value as income in the year of death. The estate owes approximately $64,000 in combined tax before distributing anything to you. This is why estate planning with a tax advisor is so important before someone passes away — there are strategies to minimize this, but they need to be in place before death."*

**Rights or Things return opportunity:**
Margaret had unpaid pension (September 2025 pension payment that arrived after death: $3,300) and OAS September payment ($692) — total rights or things: $3,992.

File a separate Rights or Things return for $3,992. After the duplicate BPA, tax is approximately $0.
Tax saving: $3,992 × 46.16% (top rate on terminal return) = **$1,843**

**Filing deadline:**
Date of death: August 22, 2025
Six months after death: February 22, 2026
Usual deadline: April 30, 2026
**Terminal return deadline: April 30, 2026** (the later of the two — but file as soon as possible to avoid interest on any balance owing)

---

### Case C — Pension Splitting Uncovers the Pension Income Amount

**Client:** Susan, 67. Lives alone after her divorce. She receives only:
- OAS: $8,300
- CPP: $11,200
- Total income: $19,500

She has been filing her own return for years. She's never heard of the Pension Income Amount.

**Your intake question:** "Do you receive any other pension income — from a former employer, or do you have an RRSP or RRIF?"

**Susan:** "I have a small RRSP — about $22,000. I haven't touched it."

**The opportunity:**
If Susan transfers even $2,000 from her RRSP to a RRIF and takes the minimum withdrawal, she now has $2,000 in eligible pension income (RRIF withdrawals are eligible for the pension income amount when the recipient is 65+).

**Result:**
- **Federal pension income amount:** $2,000 × 15% = $300
- **Ontario pension income deduction:** $1,533 × 5.05% = $77
- **Combined annual credit: $377**

Cost to Susan: the RRIF setup fee (~$0 at most big banks). She still keeps the $2,000 in the RRIF — or she can withdraw it (taxable, but sheltered by her BPA and other credits at her income level).

At $19,500 income, Susan pays virtually no income tax anyway. But the RRIF minimum withdrawal could be as small as $880 at her age — well within her zero-tax threshold — and still unlock the pension income amount.

**Annual value of this suggestion: $377** — from a RRIF conversion that costs nothing and takes one phone call to her bank.

This is the kind of detail that makes clients feel you are genuinely working for them.

---

### Case D — The Estate Filing Error That Cost $22,000

**Cautionary case:** An executor (no preparer involved) distributed a $180,000 estate to three adult children six weeks after the death, without filing the terminal T1 or obtaining a CRA clearance certificate.

Eighteen months later, CRA audited the deceased's prior three years of self-employment returns and found $38,000 in unreported income. Tax assessed: approximately $14,000. With interest and penalties: **$22,000**.

The estate had already been distributed. The children had spent the money.

**Result:** The executor was held personally liable for the $22,000 — from their own assets.

**What should have happened:**
1. File the terminal T1 for the year of death
2. File T1-ADJ for any amended prior years if known issues existed
3. Wait for CRA to assess and issue NOAs for all outstanding years
4. Pay all taxes owing from the estate
5. Apply for CRA Clearance Certificate (Form TX19)
6. Only after receiving the clearance certificate — distribute the remaining estate

**The lesson for your practice:** When a family comes to you after a death, the first conversation must include: *"Do not distribute any estate assets until I've filed all required returns and we've received a clearance certificate from CRA. The executor is personally liable if we skip that step."*

---

## 17.11 Week 17 Summary

!!! success "What you learned this week"
    - **Senior tax credits begin at 65:** Age Amount (federal $8,790, Ontario $5,812), Pension Income Amount ($2,000 base), RRIF eligibility for pension income credit, OAS commencement
    - **OAS clawback:** 15% on net income above $90,997. Every dollar above this costs the senior 15 extra cents on top of their marginal rate — creating effective rates of 44–61%. Pension income splitting is the primary tool to stay below the threshold
    - **Pension income splitting (Form T1032):** Allocate up to 50% of eligible pension income (DB pension, RRIF if 65+) to a lower-income spouse. Target: equalize marginal rates AND stay below OAS clawback threshold. Benefits compound — lower net income also restores Age Amount and improves benefit eligibility
    - **CPP sharing:** Separate from T1032. Administered through Service Canada. Reduces the higher-earning spouse's CPP income. Both strategies can be used simultaneously
    - **Terminal T1:** Filed for January 1 to the date of death. Deadline: 6 months after death or April 30, whichever is later. RRSP/RRIF deemed disposed at FMV — unless rolled to surviving spouse
    - **RRSP/RRIF on death:** Full FMV added to terminal return income unless spousal rollover elected via Form T2019. For a senior with a large RRIF and no surviving spouse, this is the single largest tax event in their estate
    - **Optional returns:** Rights or Things return duplicates personal credits — saves tax by sheltering amounts earned but unpaid at death in a separate return with its own BPA and credits
    - **CRA Clearance Certificate (TX19):** Executor must obtain before distributing estate assets. Failure to do so = personal liability for the executor
    - **Ontario senior specifics:** Senior Homeowners' Property Tax Grant ($500, ON-BEN), higher OEPTC maximum at 65+, nursing home accommodation costs as medical expenses AND OEPTC base

---

## ✅ Week 17 Quiz

When you're ready, ask Claude: **"Quiz me on Week 17"** for an interactive test.

??? question "1. Robert (72) has net income of $96,500: DB pension $54,000, CPP $13,000, OAS $8,300, RRIF $21,200. His wife Helen (68) has only CPP $7,200 and OAS $7,500. Calculate Robert's OAS clawback before splitting, and determine the minimum pension allocation to Helen that eliminates it."
    **Before splitting:** OAS clawback = ($96,500 − $90,997) × 15% = $5,503 × 15% = **$826 clawed back**. **Minimum allocation to eliminate clawback:** Robert's net income must drop to $90,997. Required reduction: $96,500 − $90,997 = $5,503. Allocate **$5,503 from eligible pension income to Helen**. Robert's eligible income for splitting: $54,000 DB pension + $21,200 RRIF (since he's 65+) = $75,200 eligible. $5,503 is well within the 50% maximum ($37,600). **Result:** Robert's net income = $90,997 (at threshold — $0 clawback). Helen's new income: $14,700 + $5,503 = $20,203 — still below BPA, paying no additional federal tax. **Total saving: $826 OAS recovered + marginal rate differential on $5,503 = approximately $1,052 annually.**

??? question "2. Patricia, 69, receives only OAS ($8,300) and CPP ($9,800) — total income $18,100. She has a $35,000 RRSP she has never touched. What one action can generate a new tax credit she is currently missing, and what is it worth?"
    Patricia has no eligible pension income, so she cannot claim the Pension Income Amount. If she transfers a portion of her RRSP to a RRIF and takes a minimum withdrawal (even $2,000), that RRIF payment qualifies as eligible pension income for someone 65+. **Federal Pension Income Amount:** $2,000 × 15% = $300 federal credit. **Ontario Pension Income Deduction:** $1,533 × 5.05% = $77 Ontario credit. **Combined annual value: $377.** At her income level ($18,100), she pays minimal tax and may already have credits exceeding her tax. But the $377 can offset any provincial tax owing, and any excess non-refundable credit reduces her tax to zero. Even a small RRIF withdrawal that keeps her total income well below the BPA has zero or near-zero additional tax cost. The RRIF setup costs nothing at major banks. This is a one-time suggestion that delivers $377/year for the rest of her life.

??? question "3. David dies on September 15, 2025. His income from January to September 15 includes: DB pension $29,000 (prorated), CPP $8,400, OAS $5,775, and a $220,000 RRSP (no surviving spouse). What is the filing deadline for the terminal T1, and approximately how much will the estate owe in combined federal and Ontario tax?"
    **Filing deadline:** The later of (a) 6 months after death = March 15, 2026, or (b) April 30, 2026. **Deadline: April 30, 2026.** **Terminal return income:** $29,000 + $8,400 + $5,775 + $220,000 (RRSP deemed disposed) = **$263,175.** At Ontario's combined top rates (starting at $220,000 income), the tax on $263,175 is approximately: federal tax ~$64,000 + Ontario tax with surtax ~$32,000 = **~$96,000 in combined tax** payable from the estate. The $220,000 RRSP essentially costs the estate roughly $90,000–$100,000 in tax — more than 40% of its value — because it's stacked on top of other income already taxed at moderate rates. Had David had a surviving spouse, the full $220,000 could have rolled to the spouse's RRSP with no immediate tax. This case illustrates why spousal RRSP contributions and proper beneficiary designations are essential estate planning tools.

??? question "4. Margaret's mother died on July 10, 2025. She had: unpaid salary for July 1–10 of $1,800, and a pension payment of $2,400 that arrived in the mail after her death (for the July period). Her terminal return income is already $84,000 (in the 29.65% combined bracket). Should these amounts go on the terminal return or a Rights or Things return? Calculate the tax saving."
    Both amounts qualify as **Rights or Things** — income earned but not received at the date of death (unpaid salary and pension for the period up to death, payment received after). File a **separate Rights or Things return** for $4,200 total. On this optional return, the $4,200 is the only income. After applying the Basic Personal Amount ($16,129): taxable income = $0. **Tax on Rights or Things return: $0.** If included on the terminal return: $4,200 × 29.65% (combined rate at $84,000 income) = **$1,245 in tax**. **Saving from filing the optional return: $1,245.** This is a return that takes 20 minutes to prepare. Always check for rights or things — even small amounts of unpaid wages or pension arrears can yield meaningful savings when sheltered by the duplicate BPA on the optional return.

??? question "5. An executor distributes the entire estate ($185,000 to three adult children) three weeks after the death, without filing any returns or obtaining a CRA clearance certificate. Four months later, CRA reassesses the deceased's prior year return and finds $28,000 in unreported rental income, generating a $9,800 tax liability with penalties and interest. What happens to the executor?"
    The executor is **personally liable** for the $9,800 tax debt to the extent of the assets they distributed without obtaining a clearance certificate. The law is clear: an executor who distributes estate assets before settling all CRA obligations — and before obtaining a CRA Clearance Certificate (Form TX19) — assumes personal responsibility for unpaid taxes up to the value distributed. The children who received the money are not directly pursued (though CRA has some recourse there too). The executor, acting in good faith but without due diligence, must pay $9,800 from their own pocket. **The lesson:** Never advise an executor to distribute assets quickly. The terminal T1 must be filed, all prior outstanding returns must be filed, all taxes must be paid, and Form TX19 must be submitted and approved before a single dollar leaves the estate.

??? question "6. Why does a RRIF withdrawal qualify for the Pension Income Amount when the account holder is 65, but an RRSP lump-sum withdrawal does not — even for the same person?"
    The Income Tax Act defines **eligible pension income** narrowly. For taxpayers 65 and older, RRIF payments qualify because a RRIF is a structured retirement income vehicle — its purpose is to provide periodic income in retirement, paralleling a traditional pension. RRSP withdrawals are **lump-sum dispositions** from an accumulation vehicle — they are not structured retirement income, they are simply taking money out of savings. The distinction reflects the policy intent: the pension income amount rewards income received through systematic retirement income mechanisms (DB pensions, annuities, RRIFs) rather than ad-hoc savings withdrawals. CPP and OAS also don't qualify — they are government programs, not private pension arrangements — which is why encouraging a small RRIF conversion just to access the pension income credit is genuinely valuable planning for seniors living primarily on CPP and OAS.

??? question "7. Robert splits $18,000 of his eligible RRIF income to his wife Helen using Form T1032. Robert's marginal rate is 37.16%; Helen's is 20.05%. Calculate: (a) the annual tax saving from the rate differential, (b) the additional pension income amount credit Helen now qualifies for, and (c) what both of them must do for the split to be valid."
    **(a) Rate differential saving:** $18,000 × (37.16% − 20.05%) = $18,000 × 17.11% = **$3,080/year.** **(b) Helen's new Pension Income Amount:** Helen now has $18,000 in eligible pension income. Pension Income Amount is capped at $2,000 base. Federal credit: $2,000 × 15% = $300. Ontario: $1,533 × 5.05% = $77. **Additional annual credit: $377.** (c) **Both Robert and Helen must sign Form T1032** — the Joint Election to Split Pension Income. Both returns must be filed for the same tax year. The election is not valid if only one spouse signs or if the forms are filed in different years. The split amount must be between $1 and 50% of Robert's eligible pension income. The election is made annually — it is not permanent and must be reviewed each year to confirm it remains optimal.

---

## 📚 Further Reading

- [CRA: Pension income splitting — T1032](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-21000-deduction-elected-split-pension-amount.html)
- [CRA: OAS Recovery Tax — Line 23500](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-23500-social-benefits-repayment.html)
- [CRA: Filing returns for deceased persons](https://www.canada.ca/en/revenue-agency/services/tax/individuals/life-events/what-happens-when-someone-dies/final-return.html)
- [CRA: Optional returns for deceased persons](https://www.canada.ca/en/revenue-agency/services/tax/individuals/life-events/what-happens-when-someone-dies/optional-returns.html)
- [CRA: RRSP on death — deemed disposition](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/rrsps-related-plans/what-happens-rrsp-rrif-prpp-after-death.html)
- [CRA: Clearance certificate — TX19](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/changes-your-business/corporation-winding-up/clearance-certificate.html)
- [CRA: Age Amount — Line 30100](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/non-refundable-tax-credits/line-30100-age-amount.html)

---

!!! tip "Up Next: Week 18"
    **Students and New Graduates** — tuition credits and the transfer strategy, student loan interest, the moving expense opportunity most students miss, education-related deductions for employed professionals, and RESP withdrawals. Students are a high-growth client segment — they have simpler returns today but become complex, high-income clients within 5 years. Serving them well from the start builds lifetime loyalty.
