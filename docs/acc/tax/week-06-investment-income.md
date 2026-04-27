# Week 6: Investment Income — Interest, Dividends, Foreign Income & the Full T5/T3 Universe

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Report every form of investment income correctly — interest, dividends, foreign income, trust distributions
    - Decode every box on a T5 and T3 slip from memory, knowing where each goes on the T1
    - Explain the dividend gross-up and Dividend Tax Credit mechanism — mechanically, mathematically, and in plain English to a client
    - Calculate and compare the after-tax cost of interest vs. eligible vs. non-eligible dividends at any income level
    - Apply the GIC accrual rule — why tax is owed annually even when no cash arrives
    - Handle foreign investment income: conversion, reporting, and the Foreign Tax Credit
    - Know when income inside a TFSA, RRSP, RRIF, or RESP is taxable — and when it isn't
    - Understand why T3 slips arrive late and why that dictates your filing schedule for investment clients
    - Recognize the six most common investment income errors that generate CRA reassessments
    - Apply the Ontario-specific considerations that affect dividend and interest income at higher income levels

!!! tip "Investment income is on every return that has savings — that's most of your clients"
    Almost everyone has a bank account. Most Canadians have some savings. Many have investment accounts, GICs, mutual funds, or corporate dividends from their own company. Understanding investment income is not advanced tax — it is essential competency. The gross-up and DTC mechanism alone requires explanation on hundreds of thousands of returns every year. Master it here. It will serve you every season.

---

## 6.1 The Three Categories of Investment Income — And Why They're Taxed Differently

Before touching a single slip, understand why Canada taxes these three categories at different effective rates. The reason is not arbitrary — it flows from deliberate policy intent.

### Category 1: Interest Income

**Tax treatment:** 100% of interest received is added to income and taxed at the marginal rate.

**Why so highly taxed?** Interest is paid from pre-tax dollars by the borrower (corporations deduct interest, governments fund deficits through interest-bearing bonds). The entire payment reaches the investor without any corporate-level tax having been paid. There is no double-taxation to compensate for. The investor pays personal tax on the full amount.

**Effective combined tax on $1,000 in interest (Ontario, $80,000 income):**
$1,000 × 29.65% = **$298 in combined tax**
After-tax: **$702**

---

### Category 2: Canadian Dividends

**Tax treatment:** Grossed-up to represent pre-tax corporate income, then a Dividend Tax Credit (DTC) partially compensates for corporate tax already paid.

**Why the different treatment?** Dividends are paid from **after-tax corporate profits**. The corporation has already paid corporate income tax on this money before distributing it. If the shareholder also paid full personal tax on the dividend as received, the income would be taxed twice — once at the corporate level and once personally. The gross-up/DTC mechanism attempts to equalize total taxation to approximately what would have been paid if the income had been earned personally in the first place.

This concept is called **integration** — the goal is that income earned through a corporation and paid as a dividend should result in approximately the same total tax as if it had been earned personally.

**Effective combined tax on $1,000 in eligible dividends (Ontario, $80,000 income):**
Grossed-up: $1,000 × 1.38 = $1,380 taxable → combined tax at ~29.65% = $409
Less federal DTC: $1,380 × 15.0198% = $207
Less Ontario DTC: $1,380 × 10.0% = $138
Total DTC: $345
Net tax: $409 − $345 = **$64 in combined tax**
After-tax: **$936**

**Effective combined tax on $1,000 in non-eligible dividends (Ontario, $80,000 income):**
Grossed-up: $1,000 × 1.15 = $1,150 taxable → combined tax at ~29.65% = $341
Less federal DTC: $1,150 × 9.0301% = $104
Less Ontario DTC: $1,150 × 3.2863% = $38
Total DTC: $142
Net tax: $341 − $142 = **$199 in combined tax**
After-tax: **$801**

---

### Category 3: Capital Gains

**Tax treatment:** Only 50% of the capital gain is included in income (the inclusion rate). The other 50% is completely exempt.

Covered in depth in Week 7. For now: capital gains are the most tax-efficient investment income category for most investors.

**Effective combined tax on $1,000 in capital gains (Ontario, $80,000 income):**
Taxable portion: $1,000 × 50% = $500
Combined tax: $500 × 29.65% = **$148 in combined tax**
After-tax: **$852**

### The Comparison That Every Investment Client Should See

| $1,000 of investment income | Combined Tax | After-Tax Amount | Effective Rate |
|---|---|---|---|
| **Interest** | $298 | **$702** | 29.65% |
| **Capital gains** | $148 | **$852** | 14.83% |
| **Non-eligible dividends** | $199 | **$801** | 19.9% |
| **Eligible dividends** | $64 | **$936** | 6.4% |

*At $80,000 Ontario income. Rates shift at different income levels.*

!!! success "The conversation this table creates"
    When a client asks "should I put my money in a GIC or buy dividend-paying stocks?" — this comparison is the technical foundation of the answer. At $80,000 income in Ontario, every $1,000 in eligible dividends keeps $234 more after-tax than the same $1,000 in GIC interest. Over a $200,000 investment portfolio, that difference compounds into tens of thousands of dollars over a decade.

    You are not an investment advisor — that is the financial advisor's domain. But understanding the tax efficiency of each income type allows you to ask intelligent questions and give clients the context they need to have informed conversations with their advisors.

---

## 6.2 Interest Income — The Complete Picture

### What Qualifies as Interest Income

| Source | Taxable? | T-Slip | Line |
|---|---|---|---|
| Bank savings account | ✅ Yes — fully | T5 Box 13 (if ≥$50) | 12100 |
| GIC interest | ✅ Yes — on accrual basis | T5 Box 13 annually | 12100 |
| Bond interest (coupon) | ✅ Yes | T5 Box 13 or T3 Box 26 | 12100 |
| Treasury bill discount | ✅ Yes | T5 Box 13 | 12100 |
| Interest on tax refund (CRA pays) | ✅ Yes | Shown on NOA | 12100 |
| Interest on Canada Savings Bonds | ✅ Yes | T5 | 12100 |
| Interest received from a private loan | ✅ Yes (self-reported) | None | 12100 |
| Interest earned inside RRSP/RRIF | ❌ Not until withdrawal | None (sheltered) | Reported when withdrawn |
| Interest earned inside TFSA | ❌ Never | None (exempt) | Never reported |
| Interest earned inside RESP | ❌ Not until EAP withdrawal | T4A Box 40 at withdrawal | 13010 |

### The $50 T5 Threshold — What It Means and What It Doesn't

Financial institutions are required to issue a T5 when total investment income paid to one person exceeds **$50** in a calendar year.

This means:
- A savings account that earned $32 in interest will **not** generate a T5
- But that $32 **is still taxable** and must be reported on Line 12100
- CRA's matching system will eventually find unreported small amounts through bank reporting

**Your intake question for every client with a bank account:** *"Did you receive any interest from savings accounts, GICs, or bonds this year — even small amounts where you might not have received a slip?"*

### The GIC Accrual Rule — The Most Common Source of Surprise Tax Bills

For GICs, bonds, or other debt instruments with **terms longer than one year**, CRA requires interest to be reported on an **annual accrual basis** — meaning each year's earned interest is taxable in that year, regardless of whether cash has been received.

The financial institution calculates and reports accrued annual interest on a T5 Box 13 each year throughout the term.

!!! example "Case — Helen's 5-Year GIC"
    Helen invested $80,000 in a 5-year GIC at 4.5% annual interest in October 2023. The GIC matures in October 2028. She will receive no cash until maturity.

    | Year | T5 Box 13 Reported | Tax at 29.65% Combined |
    |---|---|---|
    | 2023 | $1,200 (Oct–Dec, 3 months) | $356 |
    | 2024 | $3,600 (full year) | $1,067 |
    | 2025 | $3,762 (compound year 3) | $1,115 |
    | 2026 | $3,932 (compound year 4) | $1,165 |
    | 2027 | $4,109 (compound year 5) | $1,218 |
    | 2028 | $1,024 (Jan–Oct) | $304 |

    Helen is paying **$1,067–$1,218 per year in tax on money she hasn't received.** She must fund this tax bill from other sources until the GIC matures in 2028.

    **Helen's reaction:** *"Why am I paying tax on money I don't have yet?"*

    **Your explanation:** *"CRA requires interest to be reported as it accrues each year — not when you actually receive the cash. Your bank sends CRA a T5 each year for the interest that built up in the GIC, even though it won't be paid out until maturity. The logic is that the interest genuinely is yours — it's just locked in the GIC. The bank confirms this to CRA annually. For the 5 years of this GIC, you'll owe approximately $1,000–$1,200 in tax each year on income that sits locked in the certificate."*

    **The planning question for future GICs:** If Helen has this choice: a 5-year GIC earning 4.5% (fully taxable annually) vs. the same return inside her TFSA (never taxable) — the TFSA is dramatically more efficient. Inside a TFSA, she would accumulate the same $80,000 × [(1.045)^5 − 1] = $19,800 in interest completely tax-free. In the non-registered GIC, she pays approximately $5,000+ in tax over the 5 years while receiving no cash to fund it. This is the kind of context that makes clients trust your value beyond simply filing forms.

### Premium and Discount Bonds

When a bond is purchased at a price different from its face value, additional rules apply:

**Bond purchased at a discount (below face value):**
The discount (difference between face value and purchase price) is generally treated as interest income when the bond matures or is sold — not capital gain.

**Bond purchased at a premium (above face value):**
The premium amortizes over the bond's life — reducing the interest income reported each year.

These are specialized situations. Flag them and verify the T5 treatment is consistent with the rules.

!!! question "Quick Check — Interest Income"
    Helen has a GIC that matures in 18 months. She bought it January 1, 2024. The bank issues a T5 in February 2025 for the portion of interest earned in 2024 even though the GIC hasn't matured yet. Helen says "I didn't receive any money — why do I have to report income?" What do you tell her?

    ??? answer
        Interest income is taxed on an **accrual basis** — meaning it is reported as it is earned, not when it is received. CRA requires interest to be reported at least annually, even on multi-year GICs. Helen earned interest in 2024 and must report it in her 2024 return. The T5 correctly captures the accrued portion. This is one reason why "I didn't get any money" is not a valid reason to omit a T5 — the obligation is based on earning, not receipt.

---

## 6.3 The T5 Slip — Complete Field Guide

The T5 (Statement of Investment Income) is issued by financial institutions, corporations, and any entity paying investment income to Canadian residents.

**Issued by:** February 28 of the following year
**Required when:** Total investment income paid is $50 or more

### Every Box That Matters

| Box | Label | Goes To T1 | Critical Notes |
|---|---|---|---|
| **10** | Actual amount of eligible dividends | DO NOT use for Line 12000 | This is the cash received. Never report this |
| **11** | Taxable amount of eligible dividends | **Line 12000** | Box 10 × 1.38. Always use this |
| **12** | Eligible dividend tax credit | **Line 40425** | Box 11 × 15.0198%. Apply as federal credit |
| **13** | Interest from Canadian sources | **Line 12100** | Full amount. No gross-up. No credit |
| **14** | Other income from Canadian sources | **Line 12100 or 13000** | Context-dependent — royalties, rents from trust interests |
| **15** | Foreign income | **Line 12100** (in CAD) | Convert using Bank of Canada rate. See Section 6.7 |
| **16** | Foreign tax paid | **Form T2209 / Line 40500** | Foreign Tax Credit — see Section 6.7 |
| **18** | Capital gains dividends | **Schedule 3 / Line 12700** | Treated as capital gain — 50% inclusion |
| **20** | Royalties from Canadian sources | **Line 12100** | |
| **21** | Accrued income (accumulating shares) | **Line 12100** | |
| **22** | Amount of investment income (mutual fund) | Reference | Not directly on T1 |
| **24** | Actual amount of non-eligible dividends | DO NOT use for Line 12000 | Cash received. Never report this |
| **25** | Taxable amount of non-eligible dividends | **Line 12000** | Box 24 × 1.15. Always use this |
| **26** | Non-eligible dividend tax credit | **Line 40425** | Box 25 × 9.0301%. Apply as federal credit |

!!! danger "The fundamental dividend rule: ALWAYS use the taxable (grossed-up) amount"
    The single most important rule for T5 dividend reporting: use **Box 11** (eligible) or **Box 25** (non-eligible) — never Box 10 or Box 24.

    Boxes 10 and 24 show the actual cash received. Boxes 11 and 25 show the grossed-up taxable amount. Line 12000 requires the **grossed-up amount** — not the actual amount received.

    Entering the actual amount instead of the taxable amount:
    (1) Understates income (Box 10 is always lower than Box 11)
    (2) Produces a wrong Dividend Tax Credit (the DTC is a percentage of the taxable amount — calculating it on the actual amount produces an incorrect credit)
    (3) Creates a mismatch between your return and the T5 CRA received (they have Box 11)

    This error occurs on thousands of returns annually by clients who self-file and don't understand the gross-up. It may also happen with a new preparer who misreads the boxes. Know the boxes by number — not by reading the label.

---

## 6.4 The Dividend Gross-Up and Tax Credit — The Most Complex Concept on a Simple Return

This is the mechanism that trips up preparers, confuses clients, and requires careful explanation. Mastering it separates professional preparers from those who just enter numbers.

### Why the System Works This Way

Canada's tax integration objective: income earned through a corporation and distributed as a dividend should ultimately bear approximately the same total tax as if earned personally.

A corporation earns $100 in profit:
1. Corporate tax paid (small business rate ~12.2%): $12.20
2. After-tax profit available to distribute: $87.80
3. Shareholder receives $87.80 as a dividend

If the shareholder paid full personal tax on $87.80, the combined tax burden on the original $100 would be:
Corporate: $12.20 + Personal: $87.80 × marginal rate = Total taxes

The gross-up + DTC mechanism is designed to make that total roughly equal what the shareholder would have paid if they had earned the $100 personally.

### Eligible Dividends — Large Corporation / Higher Corporate Tax Rate

Eligible dividends are paid by:
- Public corporations (companies listed on a stock exchange)
- Canadian-Controlled Private Corporations (CCPCs) that paid the **general corporate tax rate** (not the small business rate) on the underlying income

**The gross-up: 38%**
The rationale: the corporation earned approximately $1.38 in pre-tax income for every $1.00 distributed as an eligible dividend (because the general corporate rate is lower, more pre-tax income maps to each dividend dollar). Grossing up by 38% restores the dividend to its approximate pre-tax corporate amount.

**The Dividend Tax Credit (DTC): 15.0198% of the grossed-up amount**
This credit partially offsets the corporate tax already paid at the general rate.

**Worked calculation — $2,000 in eligible dividends:**

```
Actual dividend received (T5 Box 10):           $2,000
Gross-up (×1.38):                               $2,760  → taxable amount (Box 11)
Income added to Line 12000:                      $2,760
Combined tax on $2,760 (at 29.65%):             $  818
Federal DTC: $2,760 × 15.0198% =               ($  414)
Ontario DTC: $2,760 × 10.0% =                  ($  276)
Total DTC:                                       ($  690)
Net combined tax on $2,000 eligible dividend:    $  128
Effective rate on actual dividend:                  6.4%
```

**The "negative tax" phenomenon at low incomes:**
At lower income levels (below approximately $52,000 for a single person), the Dividend Tax Credit can actually exceed the federal tax generated by the grossed-up dividend — creating a **negative federal tax** on eligible dividends. This means eligible dividends are effectively tax-free at low incomes.

!!! example "Case — The $0 Federal Tax on Dividends"
    Rosa, 23, earns $28,000 in employment income and receives $3,000 in eligible dividends from her father's corporation.

    Grossed-up dividends: $3,000 × 1.38 = $4,140 → Line 12000
    Total income: $32,140

    Federal gross tax on $32,140: $32,140 × 15% = $4,821
    Less BPA credit: $16,129 × 15% = ($2,419)
    Less CPP credit: ($400)
    Less EI credit: ($150)
    Less Employment Amount: ($215)
    Federal tax before DTC: $4,821 − $3,184 = $1,637

    Federal DTC on dividends: $4,140 × 15.0198% = ($622)
    Net federal tax: $1,637 − $622 = **$1,015 federal tax**

    The DTC partially offsets the tax on the dividend — but doesn't eliminate it entirely at this income level. However, as Rosa's employment income decreases and dividend income increases, a point is reached where the DTC exceeds the federal tax generated — creating negative federal tax. CRA does not refund negative federal dividend tax, but it reduces the overall tax bill significantly.

### Non-Eligible Dividends — Small Business Corporations

Non-eligible dividends are paid by Canadian-Controlled Private Corporations (CCPCs) that paid the **small business rate** (~12.2% combined in Ontario) on the underlying income.

**The gross-up: 15%**
The rationale: at the small business rate, the corporation retained more after-tax income per pre-tax dollar than a large corporation — so the gross-up is smaller.

**The DTC: 9.0301% of the grossed-up amount (federal)**

**Worked calculation — $2,000 in non-eligible dividends:**

```
Actual dividend received (T5 Box 24):           $2,000
Gross-up (×1.15):                               $2,300  → taxable amount (Box 25)
Income added to Line 12000:                      $2,300
Combined tax on $2,300 (at 29.65%):             $  682
Federal DTC: $2,300 × 9.0301% =                ($  208)
Ontario DTC: $2,300 × 3.2863% =                ($   76)
Total DTC:                                       ($  284)
Net combined tax on $2,000 non-eligible dividend: $  398
Effective rate on actual dividend:                 19.9%
```

Non-eligible dividends are taxed roughly three times more heavily than eligible dividends — because the underlying corporate income received significantly more tax relief (small business deduction) before distribution.

### Ontario's Dividend Tax Credit Rates

Ontario has its own Dividend Tax Credit on ON428, separate from the federal DTC:

| Dividend Type | Ontario DTC Rate | Applied To |
|---|---|---|
| **Eligible** | 10.0% | Grossed-up taxable amount (Box 11) |
| **Non-eligible** | 3.2863% | Grossed-up taxable amount (Box 25) |

!!! warning "Two separate DTC entries — federal AND Ontario"
    The federal DTC appears on Schedule 1 at Line 40425.
    The Ontario DTC appears on ON428.

    Both must be claimed to get the full benefit of the dividend credit mechanism. Missing the Ontario DTC significantly overstates the client's tax.

    Professional tax software calculates both automatically from the T5 Box 12/26 amounts. But you should verify the Ontario DTC is present on the ON428 for every return with dividend income.

!!! question "Quick Check — Dividend Gross-Up"
    Kevin's T5 shows Box 24 (actual eligible dividends) = $4,000. What amount goes on Line 12000, and why is it more than $4,000?

    ??? answer
        **Line 12000 = $4,000 × 1.38 = $5,520** (the taxable grossed-up amount).
        The gross-up adds 38% to reflect the pre-tax corporate income that generated the dividend. Kevin reports $5,520 on Line 12000, which increases his income — but he also gets the **Dividend Tax Credit (DTC)** on Line 40425 to offset the excess. The DTC for eligible dividends is 15.0198% of the grossed-up amount: $5,520 × 15.0198% = **$829 federal DTC**. Plus an Ontario DTC. The net effect is that Kevin pays less combined tax on eligible dividends than on the same amount of interest income — the system credits him for the corporate tax already paid.

---

## 6.5 The T3 Slip — Trust Income from Mutual Funds and ETFs

The T3 (Statement of Trust Income Allocations and Designations) is issued by mutual funds, ETFs, income trusts, REITs, and other trust entities. It reports the investor's share of the trust's income, gains, and other distributions for the year.

**Critical timing difference from T4/T5:**
- T4 and T5: due February 28
- T3: due **March 31** — a full month later

This single timing difference is the reason you cannot file investment clients in February.

### T3 Boxes — Complete Reference

| Box | Description | Goes To T1 |
|---|---|---|
| **21** | Capital gains | **Schedule 3 / Line 12700** (50% inclusion) |
| **23** | Actual amount of eligible dividends | Used to verify Box 32 |
| **32** | Taxable amount of eligible dividends | **Line 12000** |
| **33** | Federal eligible DTC | **Line 40425** |
| **34** | Foreign income | **Line 12100** (convert to CAD) |
| **35** | Foreign tax paid | **Form T2209 / Line 40500** |
| **37** | Foreign business income | Line 12100 |
| **39** | Actual amount of non-eligible dividends | Used to verify Box 49 |
| **49** | Taxable amount of non-eligible dividends | **Line 12000** |
| **50** | Federal non-eligible DTC | **Line 40425** |
| **26** | Other income | **Line 12100** |
| **42** | Amount resulting in cost base adjustment | **Adjust ACB** — not income |

### Box 42 — The ACB Adjustment No One Talks About

Box 42 on the T3 is one of the most important and most misunderstood boxes in investment taxation.

**What it means:** Some distributions from trusts (REITs, ETFs) represent a **return of capital** — the fund is paying back part of your investment, not distributing income. These amounts are **not taxable when received** — but they **reduce the ACB** of your investment.

**Why it matters:** Every dollar in Box 42 that reduces the ACB creates a larger capital gain when the investment is eventually sold. CRA essentially defers the tax — not eliminates it.

**What happens if Box 42 is ignored:** The ACB remains too high. When the investment is sold, the reported gain is too small. CRA may reassess if they track the return-of-capital history.

!!! example "Case — The REIT With Return of Capital"
    Patricia owns units in a Canadian REIT. Over 3 years, her T3 shows:
    - Year 1: Box 42 = $1,200
    - Year 2: Box 42 = $1,400
    - Year 3: Box 42 = $1,350

    Original purchase: $40,000 ACB.
    After 3 years of return of capital: $40,000 − $1,200 − $1,400 − $1,350 = **$36,050 adjusted ACB**

    When she sells for $48,000:
    Capital gain = $48,000 − $36,050 = $11,950
    (Without the ACB adjustment: $48,000 − $40,000 = $8,000 — an $3,950 understatement)

    The Box 42 deductions represent tax deferred — not eliminated. Patricia's taxable capital gain is $5,975 (50% × $11,950) rather than $4,000 — the return-of-capital distributions accumulated the deferred liability.

---

## 6.6 TFSA, RRSP, RRIF, and RESP — Investment Income Inside Registered Plans

### TFSA — Tax-Free Savings Account

**Income inside a TFSA:** Completely tax-free. Always. Interest, dividends, capital gains — none of it is reported on the T1 while in the TFSA. No T5 is issued for income earned inside.

**Withdrawals from TFSA:** Also tax-free. No T4RSP. No reporting.

**Over-contributions:** If a client contributes more than their TFSA room, the excess is subject to a **1%/month penalty tax** on the excess amount. CRA tracks TFSA contributions and withdrawals through financial institution reporting. Over-contribution penalties can accumulate significantly before clients realize the problem.

**Common TFSA question from clients:** *"I withdrew $10,000 from my TFSA in August and put it back in September — is that okay?"*
**Your answer:** *"The $10,000 you withdrew adds back to your room — but only on January 1 of the following year, not immediately. Recontributing in September uses new contribution room you don't yet have. Depending on your available room before the withdrawal, this may have created an over-contribution for September–December. Let's check your CRA My Account to confirm your current room."*

### RRSP — Registered Retirement Savings Plan

**Income inside an RRSP:** Tax-sheltered. No T5 is issued for income earned inside. No reporting until withdrawal.

**Withdrawals from RRSP:** Fully taxable in the year of withdrawal. T4RSP Box 22 reports the withdrawal — goes to Line 12900. Withholding tax is deducted by the financial institution at source.

**Withholding rates on RRSP withdrawals:**
- $0–$5,000: 10% federal withholding (21% Quebec)
- $5,001–$15,000: 20% federal withholding (26% Quebec)
- Over $15,000: 30% federal withholding (30% Quebec)

!!! warning "RRSP withholding is almost always insufficient"
    The withholding on RRSP withdrawals is a prepayment — not the actual tax. At most marginal rates, the actual combined federal + Ontario tax on an RRSP withdrawal is 29.65–46.16% — far higher than the 10–30% withheld. A client who withdraws $20,000 from an RRSP and has $6,000 withheld (30%) will likely owe an additional $3,930–$5,232 in combined tax at filing, depending on their marginal rate.

    Advise clients before RRSP withdrawals: *"The withholding at source is not your full tax. Budget for additional tax at filing."*

### RRIF — Registered Retirement Income Fund

**Income inside a RRIF:** Tax-sheltered, identical to RRSP.

**RRIF payments:** Reported on T4RIF. Box 16 (total payments) → Line 11500. Box 28 (income tax deducted) → Line 43700.

**Eligible for Pension Income Credit:** RRIF payments are eligible pension income for the Pension Income Credit ($2,000 maximum × 15% = $300 federal credit) — but **only for recipients age 65 or older.** RRIF payments received under 65 do not qualify for the pension income credit.

**Eligible for Pension Income Splitting:** RRIF payments for recipients 65+ are eligible for pension income splitting under Form T1032.

### RESP — Registered Education Savings Plan

**Income inside an RESP:** Tax-sheltered.

**Education Assistance Payments (EAP) when withdrawn by the student:** Taxable in the student's hands. T4A Box 40 → Line 13010 (student's return, not the subscriber's). At a student's typically low income, often results in minimal or zero tax.

**Contributions returned (Post-Secondary Education withdrawal):** Return of original contributions — not taxable to anyone.

---

## 6.7 Foreign Investment Income — Conversion, Reporting, and the Foreign Tax Credit

As Canadians invest globally — through US ETFs, foreign stocks, foreign bonds, foreign bank accounts — foreign investment income becomes an increasingly common filing issue.

### Step 1: Convert to Canadian Dollars

All foreign income must be reported in **Canadian dollars** using the **Bank of Canada exchange rate** for the relevant period.

**For regular periodic income (monthly dividends, quarterly interest):**
Use the **annual average exchange rate** for the year — published by the Bank of Canada.

**For one-time receipts (a single foreign dividend, proceeds from a foreign sale):**
Use the exchange rate on the **date of receipt**.

**Where to find rates:** bankofcanada.ca → Exchange rates → Annual average

| Common Currency | 2025 Approx. Annual Avg Rate (USD base) |
|---|---|
| USD | 1 CAD ≈ 0.73 USD (1 USD ≈ $1.37 CAD) |
| EUR | 1 EUR ≈ $1.50 CAD |
| GBP | 1 GBP ≈ $1.73 CAD |
| JPY | 100 JPY ≈ $0.92 CAD |

!!! tip "Always use the Bank of Canada rate — not Google, not the bank rate"
    The Bank of Canada publishes official exchange rates that CRA accepts. Using a different source creates potential disputes. Always document the rate used in the client file.

### Step 2: Report Foreign Income on the T1

| Foreign Income Type | T1 Line | Notes |
|---|---|---|
| Foreign interest | **Line 12100** | Convert to CAD — full amount |
| Foreign dividends | **Line 12100** | Convert to CAD — full amount (no Canadian gross-up applies to foreign dividends) |
| Foreign rental income | **T776 / Line 12600** | Net of allowable expenses |
| Foreign business income | **T2125 / Line 13500** | Net of allowable expenses |
| Foreign pension | **Line 11500** | Convert to CAD |
| Foreign capital gains | **Schedule 3 / Line 12700** | 50% inclusion; proceeds and ACB both converted |

!!! warning "Foreign dividends are NOT grossed up — there is no Canadian DTC on them"
    The gross-up and Dividend Tax Credit mechanism applies ONLY to Canadian-source dividends. Foreign dividends (US stocks, European ETFs, global funds) are reported at their actual received amount — in Canadian dollars — with no gross-up. The full converted amount goes on Line 12100 (not Line 12000). The Dividend Tax Credit does not apply.

    This is a common error: seeing "dividends" on a US brokerage statement and applying the gross-up. Do not. Foreign dividends are treated as straight income at Line 12100.

### Step 3: The Foreign Tax Credit (Form T2209 + T2036)

When a client paid tax in a foreign country on income also taxable in Canada, the **Foreign Tax Credit** prevents double taxation.

**Federal Foreign Tax Credit (Form T2209 → Line 40500):**
```
Federal Foreign Tax Credit = Lesser of:
    (a) Foreign tax actually paid on the income (converted to CAD)
    (b) Canadian federal tax that would apply to that same income
```

**Ontario Foreign Tax Credit (Form T2036 → ON428):**
A separate calculation for the Ontario portion.

**The credit cannot exceed the Canadian tax on the same income** — it prevents double taxation but does not generate a refund of foreign tax that exceeds Canadian rates.

!!! example "Case — Patricia's US Dividend Withholding"
    Patricia holds US stocks. Her brokerage statement shows:
    - US dividends received: $4,200 USD
    - US withholding tax: $630 USD (15% — standard US-Canada treaty rate for portfolio dividends)

    **Converted to CAD (1 USD = $1.37 CAD):**
    - Dividends: $4,200 × 1.37 = **$5,754 CAD** → Line 12100 (no gross-up — foreign dividends)
    - Foreign tax paid: $630 × 1.37 = **$863 CAD** → Form T2209

    **Federal Foreign Tax Credit:**
    Federal tax on $5,754 at 20.5%: $5,754 × 20.5% = $1,180
    Foreign tax paid: $863
    Credit = lesser of $863 and $1,180 = **$863 federal foreign tax credit → Line 40500**

    **Net Canadian federal tax on the US dividends:** $1,180 − $863 = **$317**
    Plus Ontario tax on the same income (net of Ontario foreign tax credit).

    **What Patricia paid in total (US + Canada) on $5,754 CAD:**
    US tax: $863 (withheld)
    Additional Canadian tax: approximately $317 + Ontario portion = approximately $500
    **Total:** $1,363 on $5,754 = 23.7% effective combined rate

    Without the foreign tax credit: she would have paid both the US $863 AND full Canadian tax of $1,180+ = significantly more. The treaty and the FTC prevent the double taxation.

---

## 6.8 The T3 Timing Problem — Why February Filing Is Wrong for Investment Clients

This cannot be stated too many times. It generates more avoidable T1-ADJ amendments than almost any other timing issue.

```
T4 slips (employers)        → Due February 28
T5 slips (banks, brokerages) → Due February 28
T3 slips (mutual funds, ETFs, trusts) → Due MARCH 31

Gap: 31 days
```

When you file an investment client's return in February — even after running Auto-fill my return (AFR) and finding all their T4 and T5 slips — the T3 slips simply do not exist yet. The mutual fund is still calculating its year-end distributions. AFR shows no T3. The return appears complete.

Then March arrives. The fund files its T3 with CRA. CRA's system matches the T3 against the filed return. It finds capital gains distributions, eligible dividends, interest, and foreign income that weren't reported. CRA issues an automatic reassessment, adds the income, and calculates additional tax — plus interest from April 30.

**The cost:** The client owes additional tax and interest that was entirely avoidable. You need to file a T1-ADJ acknowledging the missing T3. The relationship is damaged.

**The professional standard:** 
- Any client with mutual funds, ETFs, income trusts, REITs, or any trust investments: **do not file before April 1**
- Run AFR on or after April 1 to confirm all T3 slips are in CRA's system
- Verify T3 amounts against any paper copies the client received
- Then file

**The only exception:** A client with no investment holdings beyond GICs and savings accounts (all T5 items) can be filed after February 28. Confirm this explicitly with the client: *"Do you own any mutual funds or ETFs in any account?"*

---

## 6.9 The Interest vs. Dividend Planning Conversation

Now that you understand the mechanics, you can have the conversation that distinguishes professional preparers from data-entry clerks.

### The Comparison at Different Income Levels (Ontario)

The relative tax efficiency of eligible dividends vs. interest changes significantly across income levels:

| Ontario Net Income | Interest: Tax on $1,000 | Eligible Dividend: Tax on $1,000 | Dividend Advantage |
|---|---|---|---|
| $30,000 | $200 | $0 (negative tax) | **$200/year per $1,000** |
| $60,000 | $242 | $54 | **$188/year per $1,000** |
| $80,000 | $297 | $64 | **$233/year per $1,000** |
| $120,000 | $372 | $211 | **$161/year per $1,000** |
| $200,000 | $462 | $393 | **$69/year per $1,000** |

The dividend advantage is largest at lower and middle incomes. At very high incomes (above $150,000), the surtax and Ontario dividend credit interaction actually narrows the advantage substantially.

### The Ontario Surtax Effect on Investment Income

For Ontario clients above the surtax thresholds (approximately $90,000–$100,000+ net income), investment income has a compounding effect:

- Eligible dividends add the grossed-up amount to income
- This may push Ontario basic tax above the $5,315 first surtax threshold
- Or above the $6,802 second surtax threshold
- The effective rate on incremental investment income at surtax levels can be higher than the simple bracket rate suggests

For a client at $105,000 net income, adding $5,000 in eligible dividends (grossed-up to $6,900) may push them deeper into both surtax tiers — the effective combined rate on those grossed-up dividends may reach 35%+ even though the nominal combined rate is ~37.16%.

---

## 6.10 The Six Investment Income Errors That Generate Reassessments

Build these into your review checklist for every return with investment income.

### Error 1 — Using Actual Dividend Amount Instead of Taxable Amount

**What happens:** Client reports T5 Box 10 ($3,200 actual eligible dividends) on Line 12000 instead of Box 11 ($4,416 taxable amount).
**CRA matches Box 11** against Line 12000. Mismatch → reassessment.
**Prevention:** Always use Box 11 (eligible) or Box 25 (non-eligible). Never Box 10 or Box 24.

### Error 2 — Grossing Up Foreign Dividends

**What happens:** Preparer sees "dividends" from a US stock, applies 38% gross-up, reports a larger amount.
**CRA has the T5 showing no gross-up.** Mismatch → reassessment.
**Correct treatment:** Foreign dividends are converted to CAD and reported at actual amount on Line 12100. No gross-up. No DTC.
**Prevention:** Foreign dividends → Line 12100, flat. Canadian dividends → Line 12000 grossed-up.

### Error 3 — Filing Before T3 Slips Are Available

**What happens:** Client with mutual funds is filed in February. T3 arrives in March. CRA reassesses.
**Prevention:** Any investment account that holds mutual funds, ETFs, or trusts → wait until April 1.

### Error 4 — Not Reporting Under-$50 Interest

**What happens:** Client had $38 in savings account interest. No T5 was issued. Client (and sometimes preparer) concludes it's not taxable.
**Correct treatment:** All interest is taxable regardless of T5 issuance.
**Prevention:** Ask every client: "Did you have any savings accounts, GICs, or bonds that might have earned interest even if you didn't receive a slip?"

### Error 5 — GIC Interest Not Reported in Accrual Years

**What happens:** Client has a 5-year GIC but "I won't get the money until it matures." No T5 on hand. Interest not reported.
**Reality:** The bank issues T5 annually for accrued interest. Client may have overlooked it or never received it.
**Prevention:** Ask: "Do you have any GICs, term deposits, or bonds maturing in the future? We should verify if annual T5s have been issued."

### Error 6 — Box 42 (Return of Capital) Not Tracked as ACB Reduction

**What happens:** Client owns a REIT or return-of-capital ETF. Box 42 amounts are ignored year after year. When the investment is sold, the ACB is overstated and the capital gain is understated.
**CRA discovers this** when the client uses a higher ACB than is supported by the distribution history.
**Prevention:** For every client with trust investments, track Box 42 amounts annually and update the ACB accordingly. Start a spreadsheet for any holding with recurring Box 42 amounts.

!!! tip "In your tax software"
    **Software calculates automatically:**
    - Dividend gross-up and federal Dividend Tax Credit from T5 Box 24/25 amounts
    - Ontario Dividend Tax Credit on ON428
    - Foreign tax credit (Form T2209) when you enter the foreign income and withholding tax paid
    - Interest income routing to Line 12100

    **You must verify or enter manually:**
    - T3 slip data — software cannot pull T3s via AFR until late March; never file investment clients in February
    - ACB adjustments from T3 Box 42 (return of capital) — software does not track ACB across years; you must maintain a separate record
    - Foreign currency conversion — enter income in Canadian dollars; software does not convert automatically
    - T5008 ACB (Box 20) — treat as unreliable; manually verify against client's purchase records before accepting software's calculated gain/loss

---

## 6.11 Ontario-Specific Investment Income Considerations

### Ontario Dividend Tax Credit Rates

The Ontario DTC rates are lower than the federal rates:

| Dividend Type | Federal DTC Rate | Ontario DTC Rate |
|---|---|---|
| Eligible | 15.0198% of Box 11 | **10.0%** of Box 11 |
| Non-eligible | 9.0301% of Box 25 | **3.2863%** of Box 25 |

The Ontario DTC is claimed separately on ON428. Professional software calculates it automatically — but verify it's present on the provincial form.

### Ontario Surtax and Investment Income

At net incomes above approximately $90,000–$100,000, the Ontario surtax interacts with investment income in ways that require planning awareness:

The grossed-up amount for eligible dividends adds to income. For a client at $98,000 net income who receives $8,000 in eligible dividends:
- Grossed-up addition: $8,000 × 1.38 = $11,040
- This $11,040 increases Ontario basic tax
- If it pushes Ontario basic tax from below $5,315 to above it — the surtax tier 1 applies
- If it crosses $6,802 — tier 2 adds 36% surtax on the excess

The effective Ontario rate on eligible dividends at surtax levels can actually exceed the rate on interest income in some narrow income bands — making the planning conversation more nuanced than the simple "dividends are more efficient" narrative.

### The Ontario Dividend Tax Credit at Very Low Income

In Ontario, the eligible dividend credit can generate a **negative Ontario tax** situation at low incomes — meaning the credit exceeds the Ontario tax owing from dividends. Unlike the federal negative DTC situation (where the benefit is lost), Ontario does NOT refund negative DTC amounts — the credit simply reduces tax to zero. Any excess is lost.

For very low-income clients who receive significant eligible dividends (for example, retirees living primarily on dividend income from a portfolio), the effective Ontario tax rate on those dividends may be zero — but the Ontario DTC credit above zero is wasted. This is a planning consideration when structuring retirement income.

---

## 6.12 Complete Case Studies — Investment Income Applied

### Case A — The Retiree With Multiple Investment Income Sources

**Client:** Margaret Chen, 71, retired. Fixed income from multiple sources.

**Documents:**
- T5 from TD Bank: Box 13 = $2,400 (GIC interest)
- T5 from Royal Bank investment account: Box 11 = $4,140 (eligible dividends, grossed up), Box 12 = $622 (federal DTC), Box 25 = $2,300 (non-eligible dividends, grossed up), Box 26 = $208 (federal DTC non-eligible)
- T3 from Canadian equity mutual fund: Box 21 = $3,200 (capital gains), Box 32 = $1,104 (eligible dividend taxable amount), Box 33 = $166 (federal DTC eligible), Box 42 = $580 (return of capital — reduces ACB)
- T5 from US dividend (US ETF, held in non-registered): Box 15 = USD $1,200 converted = $1,644 CAD, Box 16 = USD $180 converted = $247 CAD (US withholding)
- T4A(OAS): $8,300 | T4A(P) CPP: $11,400

**Step 1 — Identify and categorize every item:**

| Source | Line on T1 | Amount |
|---|---|---|
| GIC interest (T5 Box 13) | 12100 | $2,400 |
| Eligible dividends — TD T5 Box 11 | 12000 | $4,140 |
| Non-eligible dividends — TD T5 Box 25 | 12000 | $2,300 |
| Eligible dividends — T3 Box 32 | 12000 | $1,104 |
| Capital gains from T3 Box 21: $3,200 × 50% | 12700 | $1,600 |
| Foreign income (US ETF, converted) — NOT grossed up | 12100 | $1,644 |
| OAS (T4A(OAS)) | 11300 | $8,300 |
| CPP (T4A(P)) | 11400 | $11,400 |

**Dividend Tax Credits:**
Federal DTC: $622 (TD eligible) + $208 (TD non-eligible) + $166 (T3 eligible) = **$996 → Line 40425**
Ontario DTC: $4,140 × 10.0% + $2,300 × 3.2863% + $1,104 × 10.0% = $414 + $76 + $110 = **$600 → ON428**

**Foreign Tax Credit:**
Federal: US tax paid = $247 CAD. Canadian federal tax on $1,644 income ≈ $337. Credit: lesser = $247 → **Line 40500**

**T3 Box 42 — ACB adjustment:**
$580 reduces Margaret's ACB in the mutual fund. Not reported as income. Track for future sale.

**Step 2 — Total Income (Line 15000):**

| Line | Amount |
|---|---|
| 11300 OAS | $8,300 |
| 11400 CPP | $11,400 |
| 12000 Dividends (grossed up): $4,140+$2,300+$1,104 | $7,544 |
| 12100 Interest + foreign: $2,400+$1,644 | $4,044 |
| 12700 Taxable capital gains | $1,600 |
| **Total Income (15000)** | **$32,888** |

**Net Income: $32,888** (no major deductions this year)

**Federal Tax on $32,888:**
$32,888 × 15% = $4,933
Less BPA ($2,419) + Age Amount (income below $44,325 — full $8,790 × 15% = $1,319) + Pension Income ($2,000 × 15% = $300) + CPP credit ($11,400 × 15% = $1,710, but capped by credit rules) + DTC $996
Let's simplify: total credits approximately $6,200+
Net federal tax: approximately **$0** (credits exceed gross tax at this income level)

**Ontario Tax:**
$32,888 × 5.05% gross − Ontario credits including Ontario Age Amount ($5,812 × 5.05% = $294) + Ontario DTC $600
Net Ontario tax: approximately **$50–$100** (very low at this income)

**The professional insight:** Margaret's investment income mix (dividends, modest capital gains) combined with her senior credits creates a dramatically lower effective tax rate than a retiree with equivalent income all from GICs would face. For the same $32,888 total income:
- If all GIC interest: combined tax approximately $2,500–$3,000
- With dividend/capital gain mix: combined tax approximately $100–$200
- **Annual tax difference: $2,300–$2,800** — from the same investment portfolio size, simply structured differently

Her financial advisor should know this. Whether you point it out or refer it is your professional judgment — but the knowledge is yours.

---

### Case B — The Young Professional With TFSA, RRSP, and Non-Registered Investments

**Client:** Kevin Mensah, 32, software developer. $88,000 employment income.

**Investment accounts:**
- TFSA: $42,000 balance, earned $1,800 in dividend income this year
- RRSP: $95,000 balance, earned $4,200 in growth this year
- Non-registered account: $38,000 balance, earned $980 in eligible dividends (T5 Box 10 = $710, Box 11 = $980) and $540 in interest (T5 Box 13)

**The taxable picture:**

| Account | Income Earned | Taxable? | T1 Amount |
|---|---|---|---|
| TFSA | $1,800 dividends | ❌ NO | $0 |
| RRSP | $4,200 growth | ❌ NO (until withdrawn) | $0 |
| Non-registered | $980 eligible dividends (grossed up) | ✅ YES | $980 → Line 12000 |
| Non-registered | $540 interest | ✅ YES | $540 → Line 12100 |

**The planning insight Kevin needs:**
Kevin has $42,000 in a TFSA where $1,800 in dividends earned completely tax-free. If he moved the same dividend-producing investments from his non-registered account into his TFSA:
- Currently: $980 grossed-up dividends in non-registered → approximately $36 in net tax after DTC
- In TFSA: $0 tax, same dividends

Over 30 years of investing, this structural optimization compounds significantly. Kevin's RRSP holds growth investments where deferral compounds. His TFSA should hold high-yielding dividend investments where the tax exemption is permanent — not just deferred.

This is asset location planning — outside your scope as a preparer to formally advise, but within your scope to observe and prompt Kevin to discuss with his financial advisor.

---

### Case C — The Corporate Shareholder With Both Eligible and Non-Eligible Dividends

**Client:** Patricia Wong, incorporated consultant. Her corporation paid her two types of dividends:

**T5 from Wong Consulting Inc.:**
- Box 10 (actual eligible dividends): $18,000
- Box 11 (taxable eligible): $18,000 × 1.38 = $24,840
- Box 12 (federal DTC): $24,840 × 15.0198% = $3,731
- Box 24 (actual non-eligible dividends): $12,000
- Box 25 (taxable non-eligible): $12,000 × 1.15 = $13,800
- Box 26 (federal DTC non-eligible): $13,800 × 9.0301% = $1,246

**On Patricia's T1:**
- Line 12000: $24,840 + $13,800 = **$38,640** (grossed-up total)
- Federal DTC (Line 40425): $3,731 + $1,246 = **$4,977**
- Ontario DTC (ON428): $24,840 × 10.0% + $13,800 × 3.2863% = $2,484 + $454 = **$2,938**

**The corporate dividend question Patricia always asks:** *"Why are my eligible dividends taxed at a lower rate than my non-eligible dividends if my corporation paid them both the same way?"*

*"Patricia, the difference comes from what your corporation paid in corporate tax before distributing the dividends. Your eligible dividends came from income taxed at the general corporate rate — higher corporate tax paid. The Dividend Tax Credit is larger because more corporate tax already went to government. Your non-eligible dividends came from income that benefited from the small business deduction — your corporation paid a much lower 12.2% rate on those profits. So the DTC is smaller — less corporate tax was paid that needs to be credited back. The system is designed so that the total tax paid (corporate + personal) is approximately the same for each type, just at different stages."*

Patricia understands. This explanation, delivered clearly, is the kind of insight that makes clients feel their preparer genuinely understands their situation.

---

## 6.13 The Investment Income Intake Checklist

Use this for every client with savings, investments, or registered accounts.

### Documents to Collect

- [ ] T5 from every bank account, brokerage, and corporation (by March 1)
- [ ] T3 from every mutual fund, ETF, income trust, REIT (by April 1 — wait!)
- [ ] T5008 from brokerage for any securities sold (only needed for Schedule 3 — Week 7)
- [ ] Foreign brokerage statements (for foreign income conversion)
- [ ] RRSP contribution receipts (if applicable)
- [ ] Prior ACB records for any non-registered holdings (critical for capital gains — Week 7)

### Questions to Ask Every Client

1. "Do you have any savings accounts, GICs, or bonds — even if you didn't receive a T5?"
2. "Do you own any mutual funds or ETFs? In which accounts — registered or non-registered?"
3. "Did you receive any dividends from Canadian companies? Public companies or from your own corporation?"
4. "Do you own any US stocks or ETFs that pay dividends?"
5. "Did you make any TFSA withdrawals and recontributions this year? Do you know your current TFSA room?"
6. "Did you take any money out of your RRSP?"
7. "Did your mutual fund ETF make any distributions in Box 42 (return of capital)? Are you tracking the ACB?"
8. "Do you have any foreign bank accounts or investment accounts that pay interest or dividends?"

---

## 6.14 Week 6 Summary

!!! success "What you learned this week"
    - **Three investment income categories:** Interest (100% taxable), eligible dividends (gross-up 38% + high DTC = lowest effective rate ~6.4%), non-eligible dividends (gross-up 15% + modest DTC = ~19.9%), capital gains (50% inclusion = ~14.8%). At $80,000 Ontario income, eligible dividends keep $234 more per $1,000 than interest
    - **T5 field guide:** Box 11 (eligible taxable amount) and Box 25 (non-eligible taxable amount) go on Line 12000. NEVER Box 10 or Box 24. Box 13 (interest) → Line 12100. Box 15 (foreign income) → Line 12100 (no gross-up). Box 12/26 DTC → Line 40425. These numbers must be reflexive
    - **GIC accrual rule:** Interest on multi-year GICs is taxable each year as it accrues — even if no cash is received. The bank issues a T5 annually. Clients planning GIC investments should consider TFSA placement to eliminate this annual tax obligation
    - **T3 slips arrive March 31 — never file investment clients before April 1.** This is the most commonly violated professional standard on investment returns. The T3 doesn't exist when you file in February
    - **Box 42 (return of capital)** reduces the ACB of trust investments — it is not income, but it creates larger capital gains on future sale. Track it annually for every trust investment client
    - **Foreign dividends go on Line 12100 — no gross-up.** The Canadian gross-up and DTC mechanism applies only to Canadian-source dividends. Foreign dividends are straight income at the converted amount
    - **Foreign Tax Credit (T2209/T2036):** Prevents double taxation when foreign tax was withheld. Credit = lesser of (a) foreign tax paid or (b) Canadian tax on the same income. Separate federal and Ontario credits
    - **Registered plan income:** TFSA = never taxable. RRSP = sheltered until withdrawal. RRIF = taxable on withdrawal (T4RIF Box 16 → Line 11500, eligible for pension income credit at 65+). RESP EAP = taxable in student's hands
    - **Ontario-specific:** Ontario DTC rates (10% eligible, 3.2863% non-eligible) are lower than federal. Both must be claimed. Ontario surtax at higher incomes can reduce the efficiency advantage of dividends over interest in narrow income bands
    - **Six investment errors to prevent:** Wrong dividend box (Box 10 vs Box 11), grossing up foreign dividends, filing before T3 available, ignoring under-$50 interest, missing GIC accrual T5, ignoring Box 42 ACB reductions

---

## ✅ Week 6 Quiz

When you're ready, ask Claude: **"Quiz me on Week 6"** for an interactive test.

??? question "1. A client's T5 shows Box 10 = $4,000 (actual eligible dividends) and Box 11 = $5,520 (taxable eligible). They also show Box 24 = $2,500 (actual non-eligible) and Box 25 = $2,875 (taxable non-eligible). What is the total amount on Line 12000 and why does it differ from what the client actually received?"
    **Line 12000: $5,520 + $2,875 = $8,395.** The client actually received $4,000 + $2,500 = $6,500 in cash. The difference ($1,895) represents the gross-up amounts — $1,520 on eligible (Box 10 × 38%) and $375 on non-eligible (Box 24 × 15%). The gross-up conceptually restores the dividend to its pre-tax corporate income level, reflecting the income the corporation earned before paying corporate tax. The gross-up is why clients often believe their return shows more income than they received — the T1 reports the economic pre-tax corporate income, not just the cash in their hands. The Dividend Tax Credit at Line 40425 then partially compensates for the corporate tax already paid.

??? question "2. Patricia received a US dividend of USD $3,600 with USD $540 withheld in US taxes. The annual average Bank of Canada rate is 1 USD = $1.37 CAD. Where on the T1 does the income go, what is the Canadian dollar amount, and how is the foreign tax calculated?"
    **Foreign dividends are NOT grossed up and do NOT go on Line 12000.** They go on **Line 12100** at the converted amount: $3,600 × $1.37 = **$4,932 CAD → Line 12100.** The US withholding converted: $540 × $1.37 = **$740 CAD.** This is claimed on **Form T2209** (Federal Foreign Tax Credit → Line 40500) and **Form T2036** (Ontario Foreign Tax Credit → ON428). The credit = lesser of (a) $740 foreign tax paid or (b) Canadian federal/Ontario tax on the same $4,932. At Patricia's combined marginal rate: Canadian federal tax on $4,932 ≈ $4,932 × 20.5% = $1,011. The lesser is $740 — the full withholding is creditable against federal tax. No excess lost in this case.

??? question "3. Kevin bought a 4-year GIC for $60,000 at 3.8% annual interest in July 2025. He will receive no cash until July 2029. Will he receive a T5? What are the tax consequences in 2025, 2026, 2027, 2028, and 2029?"
    **Yes — the bank will issue a T5 annually** for accrued interest under the GIC accrual rule. For GICs (or any debt instruments) with terms over 1 year, interest is taxable each year as it accrues. Approximate T5 Box 13 amounts: **2025:** $60,000 × 3.8% × 6/12 = $1,140 taxable (July–December). **2026:** $61,140 × 3.8% = $2,323. **2027:** $63,463 × 3.8% = $2,412. **2028:** $65,875 × 3.8% = $2,503 (full year). **2029:** $68,378 × 3.8% × 6/12 = $1,299 (January–July at maturity). Kevin owes tax each year on income he hasn't received in cash — he must fund this tax obligation from other sources. Planning implication: if Kevin had this GIC inside his TFSA, all $9,677 in total interest would be completely tax-free. In a non-registered account at his 29.65% combined rate, he pays approximately $2,877 in total tax over the 4 years on the same amount.

??? question "4. Margaret holds a REIT in her non-registered account. Her T3 shows Box 21 (capital gains) = $1,800, Box 32 (eligible dividends taxable) = $2,100, and Box 42 (return of capital) = $900. Her original ACB was $35,000. What goes on the T1 and what happens to her ACB?"
    **T1 entries:** Box 21 capital gains → Schedule 3: $1,800 × 50% = **$900 taxable capital gain → Line 12700.** Box 32 eligible dividends → **Line 12000: $2,100** (already grossed up). Federal DTC from T3 Box 33 → **Line 40425.** Box 42 return of capital → **NOT on T1** (not income). **ACB adjustment:** Box 42 reduces her ACB: $35,000 − $900 = **$34,100 adjusted ACB.** This must be tracked every year the REIT distributes return of capital. When Margaret eventually sells the REIT, her capital gain will be calculated using the adjusted $34,100 ACB — not the original $35,000. Every Box 42 dollar not tracked overstates the ACB and understates the eventual capital gain.

??? question "5. A client says they have mutual funds in their non-registered account. It's February 20 and all their T4 and T5 slips are in hand. They are asking you to file their return now. What do you tell them?"
    *"I understand you want your refund quickly, and we'll get there as soon as possible. But there's one step we can't skip: mutual funds issue a separate type of tax slip called a T3, and those slips aren't due until March 31 — a full month after the T4 and T5 slips you already have. If we file now, we'd be missing the T3 income — capital gains distributions, dividends, and interest from your funds. CRA receives that T3 from the fund company in March, and their system automatically compares it against your filed return. When they find income that wasn't reported, they issue a reassessment — adding the income, calculating extra tax, and charging interest from April 30. That's a completely avoidable problem. I'd recommend we wait until after April 1, run a fresh check through CRA's system to confirm all your T3 slips have been filed, and then submit your complete return. It's a 4–6 week wait but it prevents months of reassessment headaches. Shall we book that for early April?"*

??? question "6. Explain to a client in plain language why their eligible Canadian dividends appear to generate less tax than the same amount in GIC interest, even though dividends feel like 'extra' income."
    *"This gets at something fundamental about how Canada taxes investment income. When you receive GIC interest, that's money the bank is paying you from its own earnings — no tax has been paid on it before it reaches you. You pay your full marginal tax rate on every dollar. With Canadian dividends, the company has already paid corporate income tax on those profits before distributing them to you. If you then paid your full personal rate on top of that, the same income would be taxed twice — once at the corporate level, once personally. The tax system accounts for this through what's called the gross-up and dividend tax credit. The system bumps up the dividend amount to represent what the company earned before corporate tax, calculates tax on that higher amount, and then credits you back for the corporate tax already paid. The net result: your effective rate on eligible dividends is much lower than on interest — roughly 6–7% versus 30% at your income level — because a portion of the tax obligation was already satisfied by your company before the money ever reached you."*

??? question "7. Victor owns eligible dividend-paying Canadian bank stocks in his non-registered account. He asks whether he should move these into his TFSA. What are the tax implications of each location, and what should he consider?"
    **In a non-registered account:** Eligible dividends are grossed up by 38%, included in income, subject to combined Ontario tax (~29.65% at his income), partially offset by the federal DTC (15.0198% of grossed-up amount) and Ontario DTC (10.0% of grossed-up amount). Net effective tax: approximately 6–10% of the actual dividend received at moderate income. **In a TFSA:** Eligible dividends are completely tax-free. No T5 required. No reporting. No tax, ever, on any growth or income inside the TFSA. **The consideration:** Moving the stocks to the TFSA would eliminate the annual dividend tax entirely. If Victor's TFSA has available room, this is generally advantageous. However: (1) Transferring securities from a non-registered account to a TFSA is a **deemed disposition** — it triggers capital gains tax on any unrealized gains in the stock at the time of transfer. If the bank stocks have significant accrued gains, the tax on the deemed sale could outweigh several years of dividend tax savings. (2) If the stocks are currently at a loss, transferring would create a capital loss — but this may be subject to the superficial loss rules. The planning question is: how much unrealized gain exists vs. how much annual dividend tax would be saved? That calculation determines whether the transfer makes sense.

---

## 📚 Further Reading

- [CRA: Interest and other investment income — Line 12100](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12100-interest-other-investment-income.html)
- [CRA: Dividends — Line 12000](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12000-taxable-amount-dividends.html)
- [CRA: Dividend tax credit — Line 40425](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/non-refundable-tax-credits/line-40425-federal-dividend-tax-credit.html)
- [CRA: T5 — Return of investment income (guide)](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4015.html)
- [CRA: T3 — Trust guide](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4013.html)
- [CRA: Foreign income and the foreign tax credit (T2209)](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t2209.html)
- [CRA: TFSA — Tax-Free Savings Account](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/tax-free-savings-account.html)
- [CRA: RRSP — Withdrawals](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/rrsps-related-plans/making-withdrawals.html)
- [Bank of Canada: Exchange rates](https://www.bankofcanada.ca/rates/exchange/)

---

!!! tip "Up Next: Week 7"
    **Capital Gains and Losses** — The Adjusted Cost Base in complete technical detail. Schedule 3 line by line. The 50% inclusion rate. The Principal Residence Exemption and why it must be reported even when tax is $0. The superficial loss rule. Deemed dispositions. Cryptocurrency as capital property. Gifted and inherited securities. Capital loss carry-forwards. The T5008 ACB trap and how to reconstruct cost when records are missing. Week 7 is the week that turns the most common investment question — "I sold some stocks, what do I owe?" — into a precise, professional answer.
