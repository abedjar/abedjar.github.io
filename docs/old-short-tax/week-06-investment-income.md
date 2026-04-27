# Week 6: Investment Income — Interest, Dividends & the T5

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Identify and correctly report all forms of investment income
    - Decode every important box on a T5 slip
    - Explain the dividend gross-up and dividend tax credit mechanism
    - Distinguish between eligible and non-eligible dividends and why it matters
    - Handle T3 slips from mutual funds and trusts
    - Explain to clients why Canadian dividends are taxed more favourably than interest
    - Handle foreign investment income including the foreign tax credit

---

## 6.1 The Three Types of Investment Income

Investment income comes in three main forms — each taxed differently. This is one of the most important concepts you will explain to clients because the tax efficiency of each type varies dramatically.

| Type | Tax Treatment | Where Reported |
|---|---|---|
| **Interest** | 100% included in income — taxed like employment income | T5 Box 13, Line 12100 |
| **Canadian dividends** | Grossed-up then credited — effectively taxed at a lower rate | T5 Box 24/25, Line 12000 |
| **Capital gains** | 50% included in income (inclusion rate) | Schedule 3, Line 12700 |

!!! info "Week preview"
    We cover interest and dividends in depth this week. Capital gains have enough complexity to deserve their own week — that's **Week 7**.

---

## 6.2 The T5 Slip — Box by Box

The T5 (Statement of Investment Income) is issued by banks, brokerages, credit unions, and corporations paying investment income to individuals.

**Issued by:** February 28 of the following year (same as T4)
**Threshold:** Issuers must file a T5 if total investment income paid is **$50 or more**

!!! warning "Under $50 is still taxable"
    If a client earned $35 in interest from a savings account and the bank didn't issue a T5 (because it's under $50), that $35 is **still taxable income** and must be reported on line 12100. "I didn't get a slip" is not the same as "it's not taxable."

### T5 Boxes You'll Use

| Box | Description | Where It Goes on T1 |
|---|---|---|
| **10** | Actual amount of eligible dividends | Part of Line 12000 calculation |
| **11** | Taxable amount of eligible dividends (grossed up) | Line **12000** (report this number) |
| **12** | Dividend tax credit for eligible dividends | Line **40425** (federal credit) |
| **13** | Interest from Canadian sources | Line **12100** |
| **14** | Other income from Canadian sources | Line **12100** or **13000** depending on type |
| **15** | Foreign income | Line **12100** |
| **16** | Foreign tax paid | Form T2209 / Line **40500** (foreign tax credit) |
| **18** | Capital gains dividends | Line **12700** via Schedule 3 |
| **24** | Actual amount of non-eligible dividends | Part of Line 12000 calculation |
| **25** | Taxable amount of non-eligible dividends (grossed up) | Line **12000** (report this number) |
| **26** | Dividend tax credit for non-eligible dividends | Line **40425** (federal credit) |

---

## 6.3 Interest Income — The Simple One

Interest income is the most straightforward investment income. It is fully included in income and taxed at your marginal rate — just like a paycheque.

**Common sources:**
- Savings account interest (T5 Box 13)
- GIC (Guaranteed Investment Certificate) interest
- Bond interest
- Canada Savings Bonds
- Interest on tax refunds paid by CRA (yes, this is taxable — it goes on line 12100)

**Where it goes:** Line **12100** (Interest and other investment income)

### Accrual Rule — GICs Over 1 Year

!!! warning "GIC interest is taxable annually — not just when it matures"
    For GICs or bonds with terms **over 1 year**, CRA requires interest to be reported on an **accrual basis** — meaning you report the interest earned each year even if you haven't received it yet. The bank will issue a T5 each year showing the accrued interest.

    This surprises many clients. They buy a 3-year GIC, receive no cash for 3 years, but still receive a T5 every year and owe tax on the annual accrued interest.

!!! example "Case — The GIC Surprise"
    Helen buys a 3-year GIC for $50,000 at 4% annual interest in January 2025. She won't receive any cash until 2028 when the GIC matures.

    | Year | Accrued Interest | T5 Issued? | Taxable? |
    |---|---|---|---|
    | 2025 | $2,000 | ✅ Yes | ✅ Yes |
    | 2026 | $2,080 | ✅ Yes | ✅ Yes |
    | 2027 | $2,163 | ✅ Yes | ✅ Yes |

    Helen owes tax every year even though she never touches the money. Many clients are genuinely shocked by this — explaining it early prevents an unpleasant surprise at tax time.

---

## 6.4 Canadian Dividends — The Most Misunderstood Investment Income

Dividends are payments made by corporations to shareholders out of **after-tax corporate profits**. Because the corporation already paid tax on those profits, the government gives individual shareholders a **dividend tax credit** to avoid double-taxation.

The mechanism has two steps that confuse almost every new preparer.

### Step 1 — The Gross-Up (Adding Phantom Income)

CRA requires you to **inflate (gross-up)** the actual dividend before reporting it. This seems counterintuitive — why report more income than you received?

The gross-up simulates what the income would have been **before** corporate tax. You're essentially pretending you earned the pre-tax corporate income, not just the after-tax dividend.

| Dividend Type | Gross-Up Rate | Formula |
|---|---|---|
| **Eligible dividends** | 38% | Actual dividend × 1.38 |
| **Non-eligible dividends** | 15% | Actual dividend × 1.15 |

### Step 2 — The Dividend Tax Credit (Taking It Back)

After grossing up, CRA gives you a **tax credit** to compensate for the corporate tax already paid. This credit is larger than the gross-up, resulting in a net tax advantage.

| Dividend Type | Federal DTC Rate | Applied To |
|---|---|---|
| **Eligible dividends** | 15.0198% | Taxable (grossed-up) amount |
| **Non-eligible dividends** | 9.0301% | Taxable (grossed-up) amount |

### The Full Calculation — Side by Side

=== "Eligible Dividends"

    **Definition:** Paid by Canadian public corporations (e.g. Royal Bank, Telus, CN Rail) or large private corporations that have paid full corporate tax. These get the most favourable treatment.

    **Example:** Client receives $1,000 in eligible dividends from RBC.

    | Step | Calculation | Amount |
    |---|---|---|
    | Actual dividend received | Given | $1,000 |
    | Gross-up (×1.38) | $1,000 × 1.38 | $1,380 |
    | **Reported on Line 12000** | | **$1,380** |
    | Federal DTC | $1,380 × 15.0198% | ($207) |
    | **Net federal tax addition** (at 20.5% bracket) | $1,380 × 20.5% − $207 | **$76** |
    | **Effective federal tax rate on actual $1,000** | $76 ÷ $1,000 | **7.6%** |

    Compare this to interest income of $1,000 in the same bracket: $1,000 × 20.5% = **$205 in tax**.

    The eligible dividend saved this client **$129 in federal tax** on the same $1,000 of income.

=== "Non-Eligible Dividends"

    **Definition:** Paid by Canadian-Controlled Private Corporations (CCPCs) that paid the lower small business corporate tax rate. Less favourable treatment because less corporate tax was paid upfront.

    **Example:** Client receives $1,000 in non-eligible dividends from a private company they own shares in.

    | Step | Calculation | Amount |
    |---|---|---|
    | Actual dividend received | Given | $1,000 |
    | Gross-up (×1.15) | $1,000 × 1.15 | $1,150 |
    | **Reported on Line 12000** | | **$1,150** |
    | Federal DTC | $1,150 × 9.0301% | ($104) |
    | **Net federal tax addition** (at 20.5% bracket) | $1,150 × 20.5% − $104 | **$132** |
    | **Effective federal tax rate on actual $1,000** | $132 ÷ $1,000 | **13.2%** |

    Still better than interest ($205), but less efficient than eligible dividends ($76).

!!! success "The key insight for clients"
    **Tax efficiency ranking for investment income (best to worst):**

    1. **Capital gains** — only 50% included → lowest tax
    2. **Eligible dividends** — gross-up + large DTC → moderate tax
    3. **Non-eligible dividends** — gross-up + smaller DTC → moderate-high tax
    4. **Interest income** — 100% included, no special treatment → highest tax

    This is powerful advice for clients building investment portfolios. All else being equal, holding interest-bearing investments inside a TFSA or RRSP (where they're sheltered) and Canadian dividend-paying stocks in taxable accounts is often more tax-efficient.

### Where Dividends Go on the T1

| Item | T5 Box | Line on T1 |
|---|---|---|
| Taxable eligible dividends (grossed-up) | Box 11 | Line **12000** |
| Taxable non-eligible dividends (grossed-up) | Box 25 | Line **12000** |
| Federal eligible dividend tax credit | Box 12 | Line **40425** |
| Federal non-eligible dividend tax credit | Box 26 | Line **40425** |

!!! tip "Your software does the math — but you must understand it"
    Tax software automatically grosses up dividends and applies the DTC. You don't calculate this by hand for every client. But you **must** understand the mechanism so you can explain a client's return to them and catch errors when the numbers look wrong.

---

## 6.5 Eligible vs. Non-Eligible — How Do You Know Which Is Which?

| Source | Type |
|---|---|
| Public company on TSX/NYSE (RBC, TD, Telus, etc.) | **Eligible** |
| Large private corporation (paid general corporate tax rate) | **Eligible** |
| Canadian-Controlled Private Corporation (CCPC) — small business | **Non-eligible** |
| Foreign corporations | **Neither** — foreign dividends are fully included as regular income |

!!! warning "Foreign dividends are NOT the same as Canadian dividends"
    Foreign dividends (e.g. from Apple, Microsoft, US ETFs) do **not** receive the gross-up and dividend tax credit treatment. They are reported as regular income at 100% inclusion. They often also have **foreign withholding tax** deducted at source — more on this in Section 6.7.

The T5 tells you which is which:
- Box 10/11/12 → Eligible dividends
- Box 24/25/26 → Non-eligible dividends

---

## 6.6 The T3 Slip — Trust and Mutual Fund Income

The **T3 (Statement of Trust Income Allocations and Designations)** is issued by:

- Mutual funds
- Exchange-Traded Funds (ETFs)
- Real Estate Investment Trusts (REITs)
- Estates and personal trusts

T3 slips are issued by **March 31** (one month later than T4s and T5s) — this is a common reason clients file late. Always ask clients who own mutual funds or ETFs: "Have you received your T3 yet?"

### T3 Boxes You'll Use

| Box | Description | Where It Goes |
|---|---|---|
| **21** | Capital gains | Schedule 3 → Line **12700** |
| **23** | Actual amount of eligible dividends | Line **12000** (grossed-up) |
| **25** | Actual amount of non-eligible dividends | Line **12000** (grossed-up) |
| **26** | Other income | Line **12100** or **13000** |
| **30** | Capital gains eligible for deduction | Schedule 3 |
| **32** | Taxable amount of eligible dividends | Line **12000** |
| **33** | Dividend tax credit for eligible dividends | Line **40425** |
| **34** | Foreign non-business income | Line **12100** |
| **37** | Foreign non-business income tax paid | Form T2209 |
| **49** | Taxable amount of non-eligible dividends | Line **12000** |
| **50** | Dividend tax credit — non-eligible | Line **40425** |

!!! example "Case — The Mutual Fund Client"
    David holds mutual funds at a big bank. In February he gets a T5 from his savings account. In March he gets a T3 from his mutual fund. He hands you both.

    **T5:**
    - Box 13: $420 interest → Line 12100

    **T3:**
    - Box 21: $1,850 capital gains → Schedule 3
    - Box 32: $630 taxable eligible dividends → Line 12000
    - Box 33: $94 dividend tax credit → Line 40425

    Many clients forget to wait for their T3 and file early in February — then need an amendment when the T3 arrives in March. **Best practice: always ask about mutual funds and ETFs, and confirm T3s have arrived before filing.**

---

## 6.7 Foreign Investment Income

Many clients hold foreign investments — US stocks, international ETFs, foreign bank accounts. These require special handling.

### Foreign Interest and Dividends

- Reported on **Line 12100** (interest) or **Line 12000** (dividends — but at 100%, not grossed up)
- Foreign income is reported in **Canadian dollars** — convert using the Bank of Canada annual average exchange rate for the tax year

### Foreign Withholding Tax

Most countries withhold tax on dividends paid to foreign investors. For example, the US withholds **15% (or 30%)** on dividends paid to Canadians, depending on the type of account.

This withheld tax is **not lost** — Canada has a **Foreign Tax Credit** that prevents double taxation.

**Form T2209** calculates the federal foreign tax credit.
**Line 40500** is where the credit reduces federal tax owing.

!!! example "Case — US Dividend with Withholding Tax"
    Sandra holds shares in a US company. She receives a USD dividend of $2,000. The US withholds 15% ($300 USD), so she receives $1,700 USD net.

    | Step | Amount |
    |---|---|
    | Gross USD dividend | $2,000 USD |
    | Convert to CAD (assume 1.36 rate) | $2,720 CAD |
    | Report on Line 12100 | **$2,720 CAD** (full amount, pre-withholding) |
    | US tax withheld: $300 USD × 1.36 | $408 CAD |
    | Foreign tax credit (T2209) | Up to **$408** off federal tax |

    Sandra reports the **full** $2,720 in income — not the net $2,312 she received. The withholding tax is recovered through the foreign tax credit, not by reducing income.

!!! warning "TFSA and RRSP — withholding tax treatment differs"
    - **RRSP:** Under the Canada-US tax treaty, US withholding tax is **waived** on dividends held in an RRSP. No withholding, no foreign tax credit needed.
    - **TFSA:** The US does **not** recognize TFSAs as tax-sheltered accounts. US withholding tax applies at the full rate even inside a TFSA — and because TFSA income isn't reported on a T1, the foreign tax credit **cannot** be claimed. This is a meaningful tax drag that affects investment planning.

---

## 6.8 TFSA and RRSP — What Investment Income Goes on the T1?

| Account Type | Investment Income Inside | Reported on T1? |
|---|---|---|
| **TFSA** | Earns interest, dividends, capital gains | ❌ **Never** — completely tax-free |
| **RRSP** | Earns interest, dividends, capital gains | ❌ **Not while inside** — taxed only on withdrawal |
| **Non-registered (taxable) account** | Earns interest, dividends, capital gains | ✅ **Always** — every year |

!!! success "Key client advice you'll give constantly"
    Clients often ask: "Why is my investment income so high this year?" The answer is almost always that they have non-registered (taxable) investments generating annual income. The solution is to hold interest-bearing investments (which get the worst tax treatment) inside RRSPs and TFSAs, and keep Canadian dividend stocks or growth equities (which get better treatment) in taxable accounts. This is called **asset location** — it's beyond your scope for year one but good to be aware of.

---

## 6.9 Case Studies

### Case A — The Retiree's Portfolio

**Client:** Margaret, 68, retired. No employment income. Lives off her investment portfolio.

**Slips received:**
- T5 Box 13: $4,200 interest (GICs)
- T5 Box 11: $3,864 taxable eligible dividends (grossed-up from $2,800 actual)
- T5 Box 12: $578 eligible dividend tax credit
- T3 Box 21: $1,600 capital gains from mutual fund

**What goes where:**

| Line | Item | Amount |
|---|---|---|
| 12000 | Taxable eligible dividends (T5 Box 11) | $3,864 |
| 12100 | Interest income (T5 Box 13) | $4,200 |
| 12700 | Taxable capital gains (T3 Box 21 × 50%) | $800 |
| 40425 | Dividend tax credit (T5 Box 12) | $578 |

**Net income (line 23600):** $4,200 + $3,864 + $800 = **$8,864**

This is well below the Basic Personal Amount. Margaret likely owes **no federal income tax** and receives the full GST/HST credit and Age Amount. The dividend tax credit of $578 may exceed her tax owing — but because it's non-refundable, the excess is not paid out (it simply reduces tax to $0).

---

### Case B — The Investor Who Forgot About Tax

**Client:** Kevin, 45, salaried at $95,000. Also has a non-registered brokerage account he "set up years ago and never thinks about."

**He brings only his T4. You ask about investments.**

He logs into CRA My Account — there are two T5s he forgot about:
- T5 from TD Bank: Box 13 interest $1,840
- T5 from brokerage: Box 11 taxable eligible dividends $4,140

Without these, his return would have been wrong. With them:

| Line | Item | Amount |
|---|---|---|
| 10100 | Employment income | $95,000 |
| 12000 | Taxable eligible dividends | $4,140 |
| 12100 | Interest | $1,840 |
| **15000** | **Total Income** | **$100,980** |

The additional $5,980 in investment income (pre-gross-up actual amount) pushes Kevin's net income higher — reducing his RRSP room calculation slightly and potentially affecting income-tested benefits. This is exactly why you always verify slips through CRA My Account.

---

### Case C — The TFSA vs. Non-Registered Confusion

**Client:** Patricia asks: "I made $3,200 in dividends inside my TFSA and $1,800 in dividends in my regular brokerage account. Do I report both?"

**Your answer:** Only the **$1,800** from the non-registered brokerage account is reported — and it needs to be grossed up if it's from Canadian companies. The **$3,200 from the TFSA is completely tax-free** and never appears on a T1. This is the entire point of a TFSA.

Patricia should verify which account issued each T5. Banks usually issue separate T5s for TFSA vs. non-registered — but sometimes clients get confused about which account generated which slip. If a T5 is in Patricia's name and SIN (not marked as TFSA), it belongs on the return.

---

## 6.10 Week 6 Summary

!!! success "What you learned this week"
    - Interest income goes on **Line 12100** — 100% taxable, simplest investment income
    - GIC interest over 1 year accrues **annually** — taxable even before cash is received
    - Canadian dividends use a **gross-up and dividend tax credit** mechanism to avoid double taxation
    - **Eligible dividends** (public companies): grossed up 38%, higher DTC — most tax-efficient
    - **Non-eligible dividends** (private CCPCs): grossed up 15%, lower DTC — less efficient
    - Report the **grossed-up (taxable) amount** on Line 12000 — not the actual amount received
    - Foreign dividends get **no** gross-up or DTC — reported as regular income; withholding tax recovered via T2209 (Line 40500)
    - T3 slips from mutual funds/ETFs arrive by **March 31** — later than T4s and T5s
    - **TFSA** investment income: never on T1. **RRSP** investment income: not until withdrawal. **Non-registered**: always reported annually

---

## ✅ Week 6 Quiz

When you're ready, ask Claude: **"Quiz me on Week 6"** for an interactive test.

??? question "1. Your client received $1,500 in eligible dividends from TD Bank. What amount appears on Line 12000 and how is it calculated?"
    **$2,070.** Eligible dividends are grossed up by 38%: $1,500 × 1.38 = $2,070. This grossed-up (taxable) amount is what goes on Line 12000. The actual $1,500 received does not appear directly — the T5 Box 11 already shows the grossed-up amount, but you must understand why it's higher than what the client received.

??? question "2. Why does Canada use the dividend gross-up and tax credit system?"
    To prevent **double taxation** of corporate profits. A corporation pays corporate income tax on its earnings, then distributes after-tax profits as dividends. Without the DTC mechanism, shareholders would pay personal income tax on income already taxed at the corporate level. The gross-up simulates pre-tax corporate income; the DTC refunds the notional corporate tax already paid — resulting in a single combined level of taxation.

??? question "3. A client earned $800 interest from a GIC and $600 from a US ETF dividend (after 15% US withholding of $106). How much income do they report on their T1, and on which lines?"
    - GIC interest: **$800 → Line 12100**
    - US dividend: Report the **full pre-withholding amount in CAD** on Line 12100 (not $600). If the $106 USD withholding converts to ~$144 CAD, they claim a foreign tax credit on Form T2209 / Line 40500. Foreign dividends do not get the Canadian dividend gross-up or DTC.

??? question "4. Your client has mutual funds and wants to file their return in February. What do you tell them?"
    Wait for their **T3 slip** from the mutual fund. T3s aren't due until **March 31** — about a month later than T4s and T5s. Filing before the T3 arrives is the most common reason investment income clients need to file a T1-ADJ. Confirm all expected slips are received before filing.

??? question "5. What is the tax treatment of investment income earned inside a TFSA vs. a non-registered brokerage account?"
    **TFSA:** All investment income (interest, dividends, capital gains) is completely **tax-free** and never reported on a T1. **Non-registered account:** All investment income is taxable every year and must be reported — interest on Line 12100, Canadian dividends (grossed-up) on Line 12000, capital gains on Schedule 3 / Line 12700.

??? question "6. Rank these four income types from most to least tax-efficient for a client in the 26% federal bracket: interest income, eligible dividends, non-eligible dividends, capital gains."
    1. **Capital gains** (only 50% included — effective 13% federal rate)
    2. **Eligible dividends** (gross-up + large DTC — effective ~7–8% federal rate at this bracket)
    3. **Non-eligible dividends** (gross-up + smaller DTC — effective ~13–15% federal rate)
    4. **Interest income** (100% included — full 26% federal rate)

    Note: eligible dividends beat capital gains for lower-income earners but can be less efficient at very high income levels. Capital gains consistently win at high brackets.

??? question "7. A client received $2,000 in dividends from a small private Canadian corporation (CCPC) she owns shares in. What gross-up rate applies and what is the taxable amount reported on Line 12000?"
    **Non-eligible dividend** gross-up rate of **15%**. Taxable amount: $2,000 × 1.15 = **$2,300** on Line 12000. The smaller 9.0301% federal dividend tax credit applies because CCPCs pay the lower small business corporate tax rate, so less corporate tax has been pre-paid.

---

## 📚 Further Reading

- [CRA: Interest and investment income](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12100-interest-investment-income.html)
- [CRA: Eligible dividends — Line 12000](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12000-taxable-dividends.html)
- [CRA: Dividend tax credit](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/non-refundable-tax-credits/line-40425-federal-dividend-tax-credit.html)
- [CRA: Foreign income and foreign tax credit](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-40500-federal-foreign-tax-credit.html)
- [CRA: T3 slip — trust income](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/tax-slips/understand-your-tax-slips/t3-slips.html)

---

!!! tip "Up Next: Week 7"
    **Capital Gains & Losses** — the adjusted cost base (ACB), the 50% inclusion rate, Schedule 3, principal residence exemption, superficial loss rule, and the most common capital gains mistakes. You'll also learn how to handle clients who sold stocks, mutual funds, real estate, or a business.
