# Week 7: Capital Gains & Losses — ACB, Schedule 3, and the Principal Residence

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Calculate a capital gain or loss using the Adjusted Cost Base (ACB)
    - Complete Schedule 3 for any common disposition
    - Apply the 50% inclusion rate correctly
    - Explain and apply the Principal Residence Exemption
    - Handle capital loss carrybacks and carryforwards
    - Identify and explain the superficial loss rule
    - Handle T5008 slips from brokerages
    - Recognize situations that require referral to a specialist

---

## 7.1 What Is a Capital Gain?

A **capital gain** arises when you sell (or are deemed to have sold) a **capital property** for more than you paid for it.

**Capital property** includes:
- Stocks, bonds, ETFs, mutual funds
- Real estate (other than your principal residence — more on that below)
- Rental properties
- Cottages and vacation properties
- Business assets
- Cryptocurrency ← increasingly common; CRA treats it as property, not currency
- Precious metals, artwork, collectibles

**Capital property does NOT include:**
- Inventory held for sale in a business (that's business income)
- Items of personal use worth less than $1,000
- Your principal residence (fully or partially exempt)

### The Basic Formula

```
Proceeds of Disposition
  − Adjusted Cost Base (ACB)
  − Outlays and Expenses of Disposition
═══════════════════════════════════
Capital Gain (or Loss)
  × 50% inclusion rate
═══════════════════════════════════
Taxable Capital Gain → Line 12700
```

---

## 7.2 Proceeds, ACB, and Outlays — Defined

### Proceeds of Disposition

The amount received (or deemed received) when a property is sold.

- For publicly traded stocks: the selling price
- For real estate: the sale price agreed upon
- For gifts: the **fair market value** on the date of the gift
- For death: the **fair market value** on the date of death (deemed disposition)

### Adjusted Cost Base (ACB)

The ACB is your **total cost** of acquiring the property, adjusted over time. It is NOT always just the purchase price.

**ACB includes:**
- Original purchase price
- Brokerage commissions paid on purchase
- Legal fees on purchase (real estate)
- Capital improvements (real estate) — renovations that add value, not repairs
- Reinvested dividends (for DRIP investors — see below)

**ACB does NOT include:**
- Repairs and maintenance (these are expenses, not capital improvements)
- Property taxes and mortgage interest (deductible elsewhere for rentals)

!!! warning "DRIP investors — ACB is almost always wrong"
    Clients enrolled in **Dividend Reinvestment Plans (DRIPs)** automatically buy more shares with their dividends. Each reinvested dividend increases the ACB because those dividends were already reported as income in previous years. If a client sells shares acquired through a DRIP and doesn't account for the reinvested amounts, they will **overstate their capital gain and pay too much tax**. Always ask: "Have you been reinvesting your dividends?"

### Outlays and Expenses of Disposition

Costs incurred **to sell** the property:
- Real estate agent commissions
- Legal fees on sale
- Brokerage commissions on stock sales
- Survey costs, advertising, fix-up costs to sell

!!! example "Case — Simple Stock Sale"
    Ahmed bought 100 shares of a Canadian bank at $45/share ($4,500 total) in 2022, paying a $9.99 commission. He sold them in 2025 at $68/share ($6,800 total), paying a $9.99 commission.

    | Item | Amount |
    |---|---|
    | Proceeds | $6,800.00 |
    | ACB: purchase price | $4,500.00 |
    | ACB: buy commission | $9.99 |
    | **Total ACB** | **$4,509.99** |
    | Outlays: sell commission | $9.99 |
    | **Capital Gain** | $6,800 − $4,509.99 − $9.99 = **$2,280.02** |
    | Taxable capital gain (×50%) | **$1,140.01** → Line 12700 |

---

## 7.3 The 50% Inclusion Rate

Canada taxes only **50% of capital gains** — called the **taxable capital gain**. This is more favourable than employment or interest income, where 100% is taxable.

```
Capital Gain:         $10,000
× Inclusion Rate:         50%
Taxable Capital Gain:  $5,000  → added to income, taxed at marginal rate
```

At a 26% marginal rate:
- Tax on $10,000 capital gain = $5,000 × 26% = **$1,300**
- Effective rate on the actual gain = **13%**

Compare to $10,000 of interest income: $10,000 × 26% = **$2,600**

!!! warning "2024 Budget proposed an inclusion rate change — verify current rules"
    The 2024 federal budget proposed increasing the inclusion rate from 50% to **66.67%** for gains over $250,000 annually for individuals. This was announced but has faced legislative delays. **Always verify the current inclusion rate with CRA before filing season** — this is exactly the kind of rule that can change between when you study and when you file. As of this writing, the 50% rate still applies for individuals on the first $250,000 of annual gains.

---

## 7.4 Schedule 3 — Capital Gains (or Losses)

Every capital disposition goes on **Schedule 3**, which feeds into **Line 12700** on the T1.

Schedule 3 has separate sections for different property types:

| Section | Property Type |
|---|---|
| Section 1 | Qualified small business corporation shares |
| Section 2 | Qualified farm and fishing property |
| Section 3 | Real estate, depreciable property, and other properties |
| Section 4 | Publicly traded shares, mutual fund units, deferral of eligible small business corporation shares |
| Section 5 | Bonds, debentures, promissory notes |
| Section 6 | Other mortgage foreclosures and conditional sales repossessions |
| Section 7 | Personal-use property |
| Section 8 | Listed personal property |

For most clients, you'll use **Section 3** (real estate) and **Section 4** (stocks, ETFs, mutual funds).

### What Goes on Each Line of Section 4

For each stock or fund sold:

| Column | What to Enter |
|---|---|
| Description | Name of the stock/fund |
| Year acquired | Year of original purchase |
| Proceeds | Selling price (from T5008 or brokerage statement) |
| ACB | Total adjusted cost base |
| Outlays and expenses | Commissions, fees to sell |
| Gain (or loss) | Proceeds − ACB − Outlays |

---

## 7.5 The T5008 Slip

The **T5008 (Statement of Securities Transactions)** is issued by brokerages to report the proceeds from securities sales.

!!! warning "T5008 does NOT include ACB — this is the most common capital gains error"
    The T5008 tells you what your client **received** from selling securities. It does **not** tell you what they originally paid. You must obtain the ACB from the client's own purchase records, brokerage statements, or account history.

    If a client hands you a T5008 and says "just use that," filing with only the proceeds and zero ACB would report the **entire sale price** as a capital gain — massively overstating their income and tax.

| T5008 Box | Description | Use On T1 |
|---|---|---|
| Box 16 | Proceeds of disposition | Schedule 3 proceeds column |
| Box 20 | Cost or book value (sometimes) | **Verify against purchase records — not always accurate** |
| Box 21 | Description of security | Schedule 3 description column |

!!! tip "Box 20 is unreliable"
    Some brokerages populate Box 20 with cost information, but it may reflect the **average cost** used by the brokerage (which differs from CRA's ACB rules) or may simply be blank. Always ask clients for their original purchase records and calculate ACB independently.

---

## 7.6 Capital Losses

A **capital loss** occurs when proceeds are less than ACB plus expenses.

### Rules for Capital Losses

| Rule | Detail |
|---|---|
| Deductible against | Capital gains **only** — cannot offset employment or other income |
| Current year | Losses first offset current year gains |
| Net loss carryback | Can carry back **3 years** to offset prior year capital gains |
| Net loss carryforward | Can carry forward **indefinitely** to offset future capital gains |
| Form to use | **T1A** — Request for Loss Carryback |
| Line on T1 | Net capital losses of other years → Line **25300** |

!!! example "Case — Using a Capital Loss Carryforward"
    In 2023, Sandra had a net capital loss of $8,000 (the stock market dropped and she sold at a loss). She had no gains that year to offset.

    In 2025, Sandra sells investments and has capital gains of $12,000.

    | Item | Amount |
    |---|---|
    | 2025 Capital gains | $12,000 |
    | 2023 loss carryforward applied (Line 25300) | ($8,000) |
    | **Net capital gains** | **$4,000** |
    | × 50% inclusion | |
    | **Taxable capital gain** | **$2,000** → Line 12700 |

    Without the carryforward, Sandra would pay tax on $6,000 of taxable gains. With it, she pays on only $2,000. **Always ask: "Have you had capital losses in prior years that weren't fully used?"** Check prior NOAs — CRA tracks unused capital losses on file.

### The Superficial Loss Rule

A **superficial loss** is a capital loss that CRA **disallows** because the same (or identical) property was purchased within 30 days before or after the sale.

**The rule:** If you sell a security at a loss AND you (or an affiliated person — spouse, corporation you control) buys the same security within 30 days before or after the sale, the loss is **denied**. It's added to the ACB of the repurchased shares instead.

!!! example "Case — The Superficial Loss Trap"
    Marcus sells 200 shares of a tech ETF on December 15, 2025 at a loss of $3,400 — hoping to claim a capital loss before year-end.

    On January 8, 2026 (24 days later), he buys 200 shares of the same ETF back.

    **Result:** The $3,400 loss is a **superficial loss** — denied. The $3,400 is instead added to the ACB of the January repurchase. The loss isn't gone forever; it's deferred until Marcus eventually sells without repurchasing within the 30-day window.

    **What you tell Marcus:** "The loss is denied for 2025 because you bought back the same ETF within 30 days. If you had waited until January 15 to repurchase, or had bought a different but similar ETF, the loss would have been valid." Tax-loss selling requires careful timing.

---

## 7.7 The Principal Residence Exemption (PRE)

This is one of the most powerful tax exemptions in Canadian law — and one of the most important things to explain to homeowner clients.

### The Basic Rule

When you sell your **principal residence**, the capital gain is **fully or partially exempt** from tax.

A property qualifies as a principal residence for a year if:
- You (or your spouse/partner/child) **ordinarily inhabited** it during the year
- It's designated as your principal residence for that year
- It's in Canada (generally)

### The Exemption Formula

```
Exempt Portion = (1 + Years Designated as Principal Residence) ÷ Total Years Owned × Capital Gain
```

The **"+1"** in the formula is a special CRA rule that allows one overlap year when you buy and sell homes in the same year.

!!! example "Case — Full Exemption (Most Common)"
    Linda and her husband bought their Toronto home in 2010 for $420,000 (including legal fees). They sold it in 2025 for $1,100,000 (after agent commission).

    | Item | Amount |
    |---|---|
    | Proceeds | $1,100,000 |
    | ACB (purchase + improvements) | $440,000 |
    | Capital gain | **$660,000** |

    They lived in the home all 15 years of ownership and designate it as their principal residence for all 15 years.

    Exempt portion: (1 + 15) ÷ 15 × $660,000 = **$660,000** — fully exempt.

    **Tax owing on $660,000 gain: $0.** This is why Canadian homeowners have accumulated enormous tax-free wealth.

!!! example "Case — Partial Exemption (Rental Conversion)"
    David bought a condo in 2015 for $300,000. He lived there until 2019 (4 years), then rented it out from 2020–2025 (6 years) and sold in 2025 for $620,000.

    Total years owned: 10 (2015–2025, inclusive)
    Years as principal residence: 4 (2015–2019)

    | Item | Amount |
    |---|---|
    | Proceeds | $620,000 |
    | ACB | $310,000 (purchase + improvements) |
    | Capital gain | $310,000 |
    | Exempt portion | (1 + 4) ÷ 10 × $310,000 = **$155,000** |
    | **Taxable portion** | $310,000 − $155,000 = **$155,000** |
    | Taxable capital gain (×50%) | **$77,500** → Line 12700 |

    David owes tax on $77,500 — but without the PRE he would have owed tax on $155,000. The exemption still saved him significantly.

### Critical PRE Rules

| Rule | Detail |
|---|---|
| Must be **designated** | File **Schedule 3 + Form T2091** to formally designate. Starting 2016, CRA requires this even for fully exempt sales |
| One per family unit per year | You, your spouse, and minor children can only designate **one** property as principal residence per year |
| Cottage problem | If you own both a home and a cottage, you can only designate one per year — the other may have a taxable gain on sale |
| **Must report the sale** | Since 2016, ALL principal residence sales must be reported on Schedule 3, even if fully exempt. Failure to report can result in penalties |
| Non-residents | Non-residents cannot claim the PRE |

!!! warning "The most common PRE mistake — not reporting the sale"
    Many clients (and some inexperienced preparers) believe that if the home sale is fully exempt, they don't have to report it. **This is wrong since 2016.** CRA requires all home sales to be reported on Schedule 3 with Form T2091. Failure to report can result in the CRA denying the exemption and assessing the full capital gain. Never skip reporting a home sale, even if the gain is $0 or fully exempt.

---

## 7.8 Deemed Dispositions

A **deemed disposition** occurs when CRA treats a property as if it were sold, even though no actual sale took place. Tax on the resulting gain may be triggered.

### Common Deemed Disposition Triggers

| Trigger | What Happens |
|---|---|
| **Death** | All capital property deemed sold at FMV on date of death — terminal return must report the gains |
| **Emigration from Canada** | All capital property deemed sold at FMV on departure date (with some exceptions for RRSPs) |
| **Gift to someone (non-spouse)** | Deemed sold at FMV — donor reports the gain |
| **Gift to spouse/common-law partner** | **Rollover** — deferred at ACB, no immediate gain (but recipient inherits the ACB) |
| **Transfer to RRSP** | Deemed sold at FMV — gain triggered (loss denied) |
| **Change in use** | Converting personal property to rental (or vice versa) deemed disposition at FMV |

!!! example "Case — Change in Use (Rental Conversion)"
    Patricia owns a condo she bought for $280,000. She moves out in 2025 and begins renting it. On the day she changes its use, it's worth $450,000.

    **Deemed disposition at change of use:** $450,000 − $280,000 = $170,000 capital gain.

    However — Patricia can **elect** under Section 45(2) to **defer** this deemed disposition. If she makes this election, she can continue to treat the property as her principal residence for up to **4 additional years** after she stops living there (even longer if the change of use is employer-related), avoiding the immediate gain. This election is made by filing a letter with CRA — no special form required.

    This is complex territory. Know it exists and refer clients with rental conversions to ensure proper handling.

---

## 7.9 Cryptocurrency

CRA treats cryptocurrency as **property**, not currency. Every transaction involving crypto is potentially a taxable event.

| Transaction | Tax Treatment |
|---|---|
| Buy crypto with CAD | No tax event — establishes ACB |
| Sell crypto for CAD | Capital gain or loss |
| Trade one crypto for another | Deemed disposition at FMV — capital gain or loss |
| Use crypto to buy goods/services | Deemed disposition at FMV — capital gain or loss |
| Mining income | **Business income** or investment income depending on scale |
| Staking rewards | Likely income when received at FMV |

!!! warning "Crypto clients need records — most don't have them"
    Every crypto transaction requires knowing the ACB in CAD at the time of purchase and the FMV in CAD at the time of disposal. Many crypto investors have hundreds or thousands of transactions spread across multiple exchanges.

    For clients with significant crypto activity, recommend they use a crypto tax tool (Koinly, CoinTracker, etc.) to reconstruct their ACB history. Filing without proper ACB records is a CRA audit risk.

---

## 7.10 Case Studies

### Case A — The First-Time Stock Seller

**Client:** James, 38, sold three stock positions this year. He brings a T5008 and a brokerage statement.

| Stock | Proceeds (T5008) | ACB (from statement) | Commission Sell | Gain / (Loss) |
|---|---|---|---|---|
| Royal Bank | $12,400 | $8,200 | $9.99 | $4,190.01 |
| Shopify | $3,100 | $6,800 | $9.99 | ($3,709.99) |
| CN Rail | $9,500 | $7,100 | $9.99 | $2,390.01 |
| **Net capital gain** | | | | **$2,870.03** |

Taxable capital gain: $2,870.03 × 50% = **$1,435.02** → Line 12700

James's Shopify loss offset his RBC and CN Rail gains. Net result is much lower than if he'd only looked at the winners. This is **tax-loss harvesting in action** — losses saved him from reporting $6,580 in gains.

---

### Case B — The Inherited Cottage

**Client:** Susan inherited her parents' cottage when her mother passed away in 2024. Her parents bought it in 1988 for $45,000. Its fair market value on the date of death was $680,000. Susan sold it in 2025 for $710,000.

| Step | Detail | Amount |
|---|---|---|
| Susan's ACB | FMV at date of death (stepped-up) | $680,000 |
| Proceeds | Sale price | $710,000 |
| Selling costs | Agent + legal | $28,000 |
| **Capital gain** | $710,000 − $680,000 − $28,000 | **$2,000** |
| Taxable capital gain (×50%) | | **$1,000** |

The estate (via the terminal return) reported the deemed disposition gain from $45,000 to $680,000 — a $635,000 gain taxed in the deceased's final return. Susan's ACB is **stepped up** to $680,000 (FMV at death), so she only pays tax on the $2,000 appreciation since she inherited it.

Key lesson: **Inherited property gets a stepped-up ACB to FMV at death.** The gain isn't lost — it was taxed in the estate. Susan didn't double-pay.

---

### Case C — The Home with a Home Office

**Client:** Rachel sold her home for $850,000. She paid $500,000 in 2018. She has claimed home office expenses for a 15% dedicated office space since 2018.

**Problem:** When you claim a home office deduction, that portion of the home may be considered to have changed use — which could affect the principal residence exemption on that portion.

In practice, CRA's administrative position is that **claiming the flat-rate home office deduction** does not affect the PRE. However, if Rachel claimed **CCA (Capital Cost Allowance)** on the business portion of her home, the PRE is **reduced** for that portion. The lesson: never claim CCA on a home office unless the client is fully aware they may lose partial PRE protection. Most preparers avoid recommending CCA on a principal residence for exactly this reason.

---

## 7.11 Week 7 Summary

!!! success "What you learned this week"
    - Capital gain = Proceeds − ACB − Outlays and Expenses of Disposition
    - Only **50%** of a capital gain is taxable (the taxable capital gain) — report on **Line 12700** via Schedule 3
    - ACB is your **total adjusted cost** — includes purchase price, commissions, improvements, and DRIP reinvestments
    - T5008 shows **proceeds only** — never assume Box 20 is the correct ACB
    - Capital losses can only offset capital gains; carry back 3 years or forward indefinitely via **Line 25300**
    - The **superficial loss rule** denies a loss when the same property is repurchased within 30 days
    - The **Principal Residence Exemption** can shelter an entire home sale gain — but **must be reported** on Schedule 3 + T2091 since 2016
    - Deemed dispositions trigger capital gains without an actual sale — death, emigration, gifts, change of use
    - Cryptocurrency is **property** — every trade, sale, or purchase is a potential taxable event

---

## ✅ Week 7 Quiz

When you're ready, ask Claude: **"Quiz me on Week 7"** for an interactive test.

??? question "1. Your client sold 500 shares for $18,000. She bought them for $11,500 and paid $10 commission on purchase and $10 on sale. What is her capital gain and her taxable capital gain?"
    - ACB: $11,500 + $10 = $11,510
    - Outlays: $10
    - Capital gain: $18,000 − $11,510 − $10 = **$6,480**
    - Taxable capital gain (×50%): **$3,240** → Line 12700

??? question "2. What is the superficial loss rule and why does it exist?"
    The superficial loss rule **denies a capital loss** when the same (or identical) property is purchased by the taxpayer or an affiliated person within 30 days before or after the sale. It exists to prevent tax-motivated selling — investors selling at a loss purely to claim the tax deduction while immediately buying back the same investment. The denied loss is added to the ACB of the repurchased shares, deferring it rather than eliminating it permanently.

??? question "3. A client bought a home in 2012 for $350,000 and sold it in 2025 for $900,000. They lived there the entire time. How much tax do they owe on the sale?"
    **$0.** The property qualifies as a principal residence for all 13 years of ownership. The full $550,000 capital gain is exempt under the Principal Residence Exemption. However, the sale must still be **reported** on Schedule 3 with Form T2091 — failure to report can result in penalties and possible denial of the exemption.

??? question "4. A client had a $12,000 net capital loss in 2022 that was never used. In 2025 they have a $7,000 capital gain. How is the loss applied and what is their taxable capital gain for 2025?"
    The 2022 carryforward loss is applied on **Line 25300** against the 2025 gain: $7,000 − $7,000 = $0 net capital gain. The remaining $5,000 of unused 2022 loss carries forward indefinitely. **Taxable capital gain for 2025: $0.**

??? question "5. Why is the ACB from a T5008 Box 20 potentially unreliable?"
    Box 20 may reflect the brokerage's internal average cost calculation, which can differ from CRA's ACB rules — especially for DRIP investors, partial sales at different prices, or securities received as gifts or inheritances. It may also simply be blank. Always obtain original purchase records and calculate ACB independently rather than relying on Box 20.

??? question "6. A client sold their condo that they owned for 8 years. They lived there for the first 3 years then rented it for 5 years. The capital gain is $200,000. Calculate the taxable capital gain."
    - Years designated as principal residence: 3
    - Exempt portion: (1 + 3) ÷ 8 × $200,000 = 50% × $200,000 = **$100,000 exempt**
    - Taxable portion: $200,000 − $100,000 = $100,000
    - Taxable capital gain (×50%): **$50,000** → Line 12700

??? question "7. Your client has been buying Bitcoin since 2020. In 2025 they traded some Bitcoin for Ethereum. Is this a taxable event? What records do you need?"
    Yes — trading one cryptocurrency for another is a **deemed disposition** at fair market value. CRA treats each crypto-to-crypto trade as selling the original crypto (triggering a capital gain or loss based on ACB vs. FMV at the trade date) and buying the new one at FMV (establishing its ACB). You need: the ACB of the Bitcoin sold (in CAD), the FMV of both cryptocurrencies in CAD on the date of the trade, and records of every prior Bitcoin transaction to correctly establish the ACB.

---

## 📚 Further Reading

- [CRA: Capital gains guide (T4037)](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4037.html)
- [CRA: Schedule 3 — Capital gains or losses](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/5000-s3.html)
- [CRA: Principal residence and related topics](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/principal-residence-other-real-estate.html)
- [CRA: Cryptocurrency guide](https://www.canada.ca/en/revenue-agency/programs/about-canada-revenue-agency-cra/compliance/digital-currency/cryptocurrency-guide.html)
- [CRA: Superficial losses](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/superficial-losses.html)

---

!!! tip "Up Next: Week 8"
    **Self-Employment Income — T2125** — the Statement of Business or Professional Activities. You'll learn how to calculate net business income, what expenses are deductible, the difference between capital and current expenses, home office for the self-employed, vehicle expenses, and how CPP obligations work for self-employed individuals. This is one of the most complex and highest-value skills you'll develop.
