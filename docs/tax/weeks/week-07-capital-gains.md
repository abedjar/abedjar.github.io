# Week 7: Capital Gains & Losses — ACB, Schedule 3, PRE, and Every Complication That Exists

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Calculate a capital gain or loss using the Adjusted Cost Base — correctly, for every common scenario
    - Explain why T5008 Box 20 cannot be trusted and how to reconstruct ACB from purchase records
    - Complete Schedule 3 for every common disposition type
    - Apply the 50% inclusion rate and understand what it actually means
    - Apply the Principal Residence Exemption — including the mandatory reporting requirement since 2016
    - Handle DRIP investors, partial dispositions, stock splits, and return-of-capital adjustments
    - Apply the superficial loss rule — the 30-day window, what triggers it, and how to work around it
    - Recognize every deemed disposition situation (gifts, emigration, death, corporate rollovers)
    - Handle cryptocurrency as capital property — the special complications it creates
    - Apply capital loss carry-forwards (indefinite) and carry-backs (3 years) correctly
    - Identify the situations that require referral to a CPA or tax lawyer
    - Apply the Ontario-specific considerations that affect capital gains taxation at higher incomes

!!! warning "Capital gains is where the biggest tax errors occur — and the biggest recoveries"
    Capital gains errors generate some of the largest CRA reassessments in individual tax. A client who used T5008 Box 20 as their ACB without verification may have overpaid capital gains tax by thousands of dollars — or underpaid and faces reassessment. A homeowner who didn't report their principal residence sale faces up to $8,000 in penalties. A DRIP investor who ignored reinvested dividends overpays on every disposition. Master this week. The recoveries you create for clients through correct ACB reconstruction will be among the most tangible financial contributions you make.

---

## 7.1 The Capital Gains Framework — Before Any Numbers

### What Is Capital Property?

A **capital gain** (or loss) arises when you dispose of **capital property** — property held for investment, not for sale in the ordinary course of business.

**Capital property includes:**

| Property | Notes |
|---|---|
| Publicly traded stocks, ETFs, mutual funds | Most common — held in non-registered accounts |
| Bonds (when sold at a gain) | Interest portion is income; gain on sale is capital |
| Rental real estate | Land and building — not including recaptured CCA |
| Vacation properties, cottages | Non-principal residences |
| Small business corporation shares | May qualify for the Lifetime Capital Gains Exemption |
| Farm and fishing property | LCGE may apply |
| Cryptocurrency | CRA treats all crypto as property — see Section 7.12 |
| Precious metals, artwork, collectibles | Personal use property rules may apply |
| Options and warrants | Complex — flag for specialist review |
| Foreign property | Converted to CAD — FMV on date of acquisition |

**Capital property does NOT include:**

| Item | Why Not Capital Property |
|---|---|
| Inventory in a business | Sold in the ordinary course of business → business income |
| Personal use property under $1,000 | Exempted by ITA |
| Lottery winnings | Windfall — not a property disposition |
| Inherited cash or life insurance proceeds | Not a disposition of capital property |
| RRSP/RRIF/TFSA/RESP assets (inside the plan) | Exempt from capital gains rules while inside registered plan |

### The Difference Between Capital Gain and Business Income — Why It Matters Enormously

The 50% capital gains inclusion rate creates a massive tax advantage over ordinary income. When CRA reclassifies a capital gain as business income, the taxpayer pays tax on 100% — not 50%.

**CRA's "adventure in the nature of trade" doctrine:**
If the primary intent when purchasing property was to profit from resale (not hold for investment), CRA may characterize the gain as business income. Factors CRA considers:

- Frequency of similar transactions
- Length of holding period
- Nature of the property (typical for investment?)
- Relationship to the taxpayer's business
- Financing structure (highly leveraged = likely flip intention)

!!! example "Case — The Property Flipper Who Got Reclassified"
    Kevin bought a house, renovated it over 4 months, and sold it at a $85,000 profit. He reported it as a capital gain: taxable = $85,000 × 50% = $42,500.

    CRA reviewed the transaction. Kevin had done three similar renovations in the past two years. His brother is a real estate agent. The holding period was short. CRA assessed the gain as **business income** — 100% of $85,000 taxable.

    Additional tax: $85,000 × 50% (the untaxed half) × 29.65% = **$12,601** in additional combined tax plus interest and penalties.

    **The lesson:** Pattern of trading, short holding periods, and close ties to the real estate industry create reclassification risk. Flag clients with multiple property transactions for specialist review.

---

## 7.2 The Capital Gain Formula — Every Component Defined

```
PROCEEDS OF DISPOSITION
    − ADJUSTED COST BASE (ACB)
    − OUTLAYS AND EXPENSES OF DISPOSITION
    ══════════════════════════════════════
    CAPITAL GAIN (or CAPITAL LOSS)
    × 50% (inclusion rate)
    ══════════════════════════════════════
    TAXABLE CAPITAL GAIN → Line 12700
```

Each component requires precision. Let's define each one completely.

### Proceeds of Disposition

The **fair market value** received (or deemed received) when a property is disposed of.

| Disposition Type | Proceeds Used |
|---|---|
| Cash sale of securities | Selling price per share × shares sold |
| Real estate sale | Sale price in the purchase agreement |
| Gift to a non-arm's length person | **Fair market value at date of gift** — regardless of cash received |
| Property transferred to a corporation | FMV at date of transfer (unless specific rollover election) |
| Death | FMV at date of death (deemed disposition) |
| Emigration from Canada | FMV at date of departure (departure tax) |
| Theft or total loss | Insurance proceeds received |
| Deemed disposition on trust settlement | FMV at settlement |

### Adjusted Cost Base (ACB) — The Most Important Number You Calculate

The ACB is the **total economic cost** of the property — not just the purchase price. Getting ACB right is the single most important technical skill in capital gains preparation.

**ACB includes:**

| Component | Included in ACB? | Notes |
|---|---|---|
| Original purchase price | ✅ Yes | Cash price or FMV at acquisition |
| Brokerage commissions on purchase | ✅ Yes | "Trading fees" add to cost |
| Legal fees on purchase (real estate) | ✅ Yes | Including land transfer tax |
| Capital improvements (real estate) | ✅ Yes | Adding a new room, new roof — permanent improvements that add lasting value |
| Reinvested dividends (DRIP shares) | ✅ Yes | Each reinvested dividend that was already taxed as income adds to ACB |
| Stock splits (adjusted) | ✅ Yes — ACB per share adjusts | Total ACB unchanged; per-share ACB reduces |
| Return of capital adjustments (Box 42) | Reduces ACB | Each Box 42 amount reduces ACB for trust units |
| Foreign property — ACB on date of Canadian residency | ✅ Yes | Deemed acquisition at FMV when becoming a Canadian resident |

**ACB does NOT include:**

| Component | Why Not |
|---|---|
| Repairs and maintenance | Current expenses — deductible (if rental) but not capital |
| Property taxes and mortgage interest | Carrying costs — deductible but not capital |
| Insurance premiums | Same — deductible costs but not capital |
| CCA already claimed | CCA reduces UCC, not ACB — recaptured separately |
| Losses in prior years | Prior losses are separate — they don't reduce ACB |

### Outlays and Expenses of Disposition

Costs directly incurred to complete the sale — reduce the proceeds before calculating the gain.

| Expense | Deductible as Outlay? |
|---|---|
| Brokerage commissions on sale | ✅ Yes |
| Real estate agent commissions | ✅ Yes |
| Legal fees on sale | ✅ Yes |
| Advertising costs for the sale | ✅ Yes |
| Survey costs for real estate sale | ✅ Yes |
| Mortgage penalty for breaking a mortgage early to sell | ✅ Yes (CRA has confirmed this) |
| Moving costs related to the sale | ❌ No — these are moving expenses (different deduction) |

---

## 7.3 The ACB Calculation — From Purchase to Sale

### The Average Cost Method for Multiple Purchases

When a client has purchased the same security multiple times, the ACB is calculated using the **average cost method** — each purchase is averaged into the total pool.

**Formula:**
```
New ACB per unit = (Previous total ACB + New purchase cost) ÷ Total units held

OR equivalently:

New total ACB = Previous total ACB + New purchase cost
New ACB per unit = New total ACB ÷ New total units
```

!!! example "Case — Robert's TD Bank Shares Over Multiple Purchases"
    Robert bought TD Bank shares in three separate purchases:

    | Date | Shares Bought | Price/Share | Brokerage Fee | Total Cost |
    |---|---|---|---|---|
    | Jan 2020 | 100 shares | $75.00 | $8.95 | $7,508.95 |
    | Jun 2021 | 50 shares | $88.00 | $8.95 | $4,408.95 |
    | Mar 2023 | 75 shares | $82.00 | $8.95 | $6,158.95 |
    | **Total** | **225 shares** | | | **$18,076.85** |

    **ACB per share: $18,076.85 ÷ 225 = $80.34**

    In October 2025, Robert sells 100 shares at $96.00/share. Brokerage fee: $8.95.

    ```
    Proceeds: 100 × $96.00 = $9,600.00
    Less outlay (commission): ($8.95)
    Net proceeds: $9,591.05
    
    ACB of shares sold: 100 × $80.34 = $8,034.00
    
    Capital gain: $9,591.05 − $8,034.00 = $1,557.05
    Taxable capital gain (×50%): $778.53 → Schedule 3 / Line 12700
    ```

    Robert's **remaining ACB:** Total ACB was $18,076.85. He sold 100 shares at $80.34 each = $8,034. Remaining ACB for 125 shares: $18,076.85 − $8,034.00 = **$10,042.85** (or $80.34 per share — unchanged by the sale).

### T5008 Box 20 — The Trap That Generates Thousands in Overpaid Tax

The T5008 (Securities Transactions) slip issued by brokerages includes Box 20 (Cost or Book Value). This box is supposed to show the ACB. In practice, it is frequently wrong or blank.

**Why T5008 Box 20 is unreliable:**

| Situation | Why Box 20 Is Wrong |
|---|---|
| DRIP shares | Brokerage may show original cost only, excluding reinvested dividends |
| Multiple purchases at different prices | Brokerage averaging may not match CRA's average cost method |
| Inherited shares | Brokerage may show original purchase price (deceased's cost) rather than FMV on date of death |
| Return of capital adjustments (Box 42) | Brokerage rarely adjusts cost base for return of capital |
| Shares received in a corporate reorganization | May show $0 or an incorrect adjusted amount |
| Box 20 is blank | Brokerage simply didn't populate it |
| Foreign securities | May be in USD — needs CAD conversion |

!!! danger "Using T5008 Box 20 as ACB without verification is professional negligence — and it generates two types of errors"
    **Overpayment (client loses money):** If Box 20 understates the true ACB (because it missed DRIP shares, return of capital adjustments, or reinvestment amounts), the calculated gain is too large. The client pays excess capital gains tax.

    **Underpayment (client faces reassessment):** If Box 20 overstates the true ACB (because return of capital reduced the real ACB but wasn't reflected), the calculated gain is too small. CRA eventually identifies the error and reassesses with additional tax plus interest.

    **The professional standard:** Verify Box 20 against the client's original purchase confirmations, DRIP records, and any Box 42 adjustments before using any ACB figure on Schedule 3.

    For long-held securities, reconstructing ACB from scratch may take time — but the alternative (a potentially large reassessment years later) is worse.

---

## 7.4 DRIP Investors — The ACB Complication Nobody Explains

**Dividend Reinvestment Plans (DRIPs)** allow investors to automatically reinvest dividends into additional shares rather than receiving cash. This is extremely common for clients with long-held positions in dividend-paying companies.

### Why DRIP Creates ACB Complexity

When a dividend is reinvested through a DRIP:
1. The investor reports the dividend as taxable income (Box 11 or Box 25 on the T5) — they pay tax on it
2. Additional shares are purchased with the reinvested amount
3. Those additional shares were purchased with after-tax dollars (the tax was already paid when the dividend was reported)
4. Therefore: the reinvested dividend amount must be added to the ACB of the position

**If the DRIP share cost is NOT added to ACB:**
The investor will be taxed again on the reinvested dividends when they sell — effectively paying tax twice on the same income.

!!! example "Case — Patricia's RBC DRIP Position"
    Patricia bought 200 RBC shares in 2015 for $78/share = $15,600 ACB.

    Over 10 years of DRIPs, she received and reinvested dividends that bought an additional 47 shares at an average cost of $97/share = $4,559 in reinvested dividends.

    Each year, Patricia reported these dividends as income on her T5 — paying tax on them.

    **2025: Patricia sells all 247 shares at $140/share.**

    **Incorrect ACB calculation (common mistake):**
    Proceeds: 247 × $140 = $34,580
    ACB: 200 × $78 = $15,600 (original purchase only)
    Capital gain: $34,580 − $15,600 = **$18,980**
    Taxable: $18,980 × 50% = $9,490

    **Correct ACB calculation (with DRIP shares):**
    Total ACB: $15,600 + $4,559 (DRIP shares) = **$20,159**
    Capital gain: $34,580 − $20,159 = **$14,421**
    Taxable: $14,421 × 50% = $7,211

    **Difference: $2,279 in taxable capital gain overstated without DRIP adjustment**
    At Patricia's 29.65% combined rate: approximately **$676 in excess tax** Patricia would overpay by not tracking DRIP contributions.

    Over a 20-year holding period with annual DRIP reinvestments, this error compounds into thousands of dollars.

    **Your intake question for long-held positions:** *"Do you have any shares where dividends have been automatically reinvested over the years? If so, we need to account for those when calculating your gain."*

### Building the DRIP ACB Schedule

For DRIP investors, maintain a running spreadsheet tracking:
- Original purchase (date, shares, price, commission, ACB)
- Each DRIP reinvestment (date, shares issued, dividend amount = new cost = ACB addition)
- Any partial sales (reduction in shares + reduction in total ACB using average cost)
- Running total ACB after each event
- Current ACB per share

This spreadsheet becomes one of the most valuable documents in the client's file.

---

## 7.5 Stock Splits and Stock Dividends — ACB Adjustments

### Stock Splits

When a corporation splits its shares (e.g., a 2-for-1 split), the **total ACB remains unchanged** but the **ACB per share decreases** proportionally.

**Example:** Patricia held 100 RBC shares with a total ACB of $12,000 ($120/share). RBC does a 3-for-2 stock split. Patricia now has 150 shares. ACB per share: $12,000 ÷ 150 = **$80/share**. Total ACB: still $12,000.

**The trap:** Clients who track cost per share in their head (not the total) may forget to adjust after a split. They think their shares "cost $120 each" but after the split they cost $80 each. If they sell using $120 as the ACB per share, they understate the gain.

### Stock Dividends

When a corporation pays a **stock dividend** (issues new shares instead of cash), the investor receives new shares taxable as ordinary income — and those shares have an ACB equal to their taxable value.

This is similar to DRIP but through a different mechanism. The same principle applies: the taxable dividend amount paid adds to the ACB.

---

## 7.6 Schedule 3 — Line by Line

Schedule 3 is the form where all capital dispositions are reported. It has distinct sections for different property types.

### Schedule 3 Sections

| Section | Property Type | Notes |
|---|---|---|
| **Section 1** | Publicly traded shares, debt obligations, options, and identical properties | Stocks, ETFs, mutual funds sold |
| **Section 2** | Qualified small business corporation shares | LCGE may apply |
| **Section 3** | Qualified farm or fishing property | LCGE may apply |
| **Section 4** | Real estate, depreciable property, other | Rental properties, vacation homes |
| **Section 5** | Personal-use property | Boats, cars, artwork — $1,000 floor rules apply |
| **Section 6** | Listed personal property | Art, jewelry, stamps, coins, rare books |
| **Section 7** | Business investment losses | ABIL — 50% of loss deductible from income |

### Completing Schedule 3 for Public Securities

For each disposition in Section 1, you record:

| Column | What to Enter |
|---|---|
| Description | Security name (e.g., "TD Bank shares") |
| Year of acquisition | Approximate year if multiple purchases — or use "various" |
| Proceeds of disposition | Cash received from sale |
| Adjusted cost base | Your verified ACB calculation |
| Outlays and expenses | Brokerage commission on sale |
| Gain or loss | Proceeds − ACB − Outlays |

**The aggregation option:** For identical properties (same security), CRA allows you to aggregate multiple dispositions in the same year into a single line — as long as you can support the ACB calculation with records.

### Section 4 — Real Estate Dispositions

For real estate, the T2091 (Principal Residence Designation) or T776 recapture analysis is also required — depending on whether it was a principal residence, rental, or mixed-use property.

---

## 7.7 The Principal Residence Exemption — The Most Important Real Estate Rule

The **Principal Residence Exemption (PRE)** potentially exempts the entire capital gain on the sale of a home from taxation. It is the largest single tax benefit available to most Canadian homeowners.

### What Qualifies as a Principal Residence

A property qualifies as a principal residence for a given year if:

1. It is a **housing unit** (house, condo, cottage, houseboat, mobile home)
2. The taxpayer **ordinarily inhabited** it during the year (or their spouse/CLP, former spouse, or child did)
3. The taxpayer or their spouse/CLP **designates** it as their principal residence for that year
4. The taxpayer is resident in Canada for the year (non-residents cannot use the PRE)

**One principal residence per family unit per year:**
A couple (married or CLP) can only designate one property as their principal residence in any given year. A person cannot designate their house in Toronto AND their cottage in Muskoka for the same year — only one can be designated.

### The PRE Formula

When a property qualifies as a principal residence for all or some years of ownership:

```
Exempt Fraction = (1 + Number of years designated as principal residence)
                   ────────────────────────────────────────────────────────
                   Total number of years the property was owned

Capital Gain × (1 − Exempt Fraction) = Taxable portion of gain
```

The "+1" in the numerator is a technical provision that prevents double-counting when a person moves — it allows a property to be exempt for the year it was purchased even if it was sold the same year a new principal residence was acquired.

!!! example "Case — Mixed-Use: First Home Then Rental"
    Sandra bought a house in 2016 for $380,000. She lived in it until 2019, then moved and rented it out from 2020–2024. She sold in 2025 for $780,000.

    Total years owned: 2016–2025 = 10 years (2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025)
    Years designated as principal residence: 2016, 2017, 2018, 2019 = 4 years

    Capital gain: $780,000 − $380,000 = $400,000

    Exempt fraction: (1 + 4) ÷ 10 = 5/10 = **50% exempt**

    Taxable gain: $400,000 × (1 − 50%) = $200,000
    Taxable capital gain (×50% inclusion): $200,000 × 50% = **$100,000 → Line 12700**

    Note: CCA recapture on the building is a SEPARATE calculation — covered in the rental income context. The PRE applies only to the capital gain on land and building, not to recaptured CCA.

### The Election to Not Claim CCA on a Rental That Was Once a Principal Residence

When a property shifts from principal residence to rental, the owner can elect to treat it as continuing to be their principal residence for up to **4 additional years** after they stop living in it — as long as they don't designate a different property as their principal residence during that time. This is called the **change-in-use election** (ITA 45(2)).

**Effect:** If Sandra could use the 45(2) election, she extends her principal residence designation by 4 more years — potentially covering all 10 years of ownership and making the gain fully exempt.

**Conditions:** She must not have claimed CCA on the property while it was a rental (or she must make the election before claiming CCA). If she claimed CCA during the rental period, the election may not be available.

This is a planning conversation — not a filing-season surprise. Advise clients before they start renting out their former home.

### The Mandatory Reporting Requirement — Since 2016

!!! danger "Principal residence sales must be reported even when the gain is fully exempt"
    Since the 2016 tax year, CRA requires every taxpayer who sold a principal residence to report the disposition on their T1:
    - On **Schedule 3** (Section 4 — real estate dispositions)
    - On **Form T2091** (Designation of a Property as a Principal Residence)

    **Even when the capital gain is $0 or the gain is fully exempt.**
    **Even when no tax is owed.**

    The filing obligation and the tax obligation are completely separate.

    **Penalty for not reporting:**
    - Late-filing penalty on the T2091: $100/day late, minimum $100, maximum **$8,000**
    - In egregious cases, CRA may deny the PRE claim entirely and tax the full gain

    **Every homeowner who sold their principal residence must file Schedule 3 and T2091.**

    The intake question is non-negotiable: *"Did you sell any property during the year — including your home?"*

!!! example "Case — The $780,000 Gain That Was $0 Tax But Required Reporting"
    Victor sold his Toronto condo. He bought it for $340,000 in 2009 and sold it for $1,120,000 in 2025. He lived in it the entire 16 years. The entire $780,000 gain is fully exempt under the PRE.

    Victor's reaction: "There's no tax. So I don't need to report it, right?"

    **Wrong.** Victor must:
    1. Report the sale on Schedule 3: Proceeds $1,120,000, ACB $340,000+improvements, capital gain $[amount]
    2. File Form T2091 designating all 16 years as principal residence years
    3. The exempt fraction = 17/16 = 1 (capped at 100%) = fully exempt

    If Victor doesn't report: CRA receives the disposition information through land registry data. They flag the unreported sale. They request Schedule 3 and T2091. If responses are delayed: $100/day penalty begins accumulating. Possible threat to PRE claim.

    **Filing takes 10 minutes. Not filing risks $8,000 in penalties on a $0-tax event.**

---

## 7.8 Capital Losses — How They Work and Where They Go

A **capital loss** occurs when proceeds are less than ACB plus outlays.

### The Four Rules for Capital Losses

**Rule 1: Capital losses can only offset capital gains**
Capital losses cannot be deducted against employment income, rental income, pension income, or any other income type. They can only reduce net capital gains.

Exception: **Allowable Business Investment Losses (ABILs)** — losses on shares or debt of small business corporations — can be deducted against other income at 50%. This is complex; flag for specialist review.

**Rule 2: Losses are applied in a specific order**
Current-year losses first offset current-year gains. If losses exceed gains — net capital loss occurs.

**Rule 3: Net capital losses carry back 3 years**
A net capital loss in the current year can be carried back to reduce taxable capital gains in any of the **3 previous years**. A T1-ADJ is filed for the prior year. CRA refunds the tax already paid on those prior gains.

**Rule 4: Net capital losses carry forward indefinitely**
Any unused portion carries forward to future years — with no expiry date. It accumulates on the client's NOA and carries until either used against future gains or the client dies (special rules apply on death).

### Where Capital Losses Appear on the T1

| Amount | Line | Notes |
|---|---|---|
| Current-year capital gain | 12700 | After netting current gains and losses |
| Prior-year capital loss carry-forward applied | 25300 | Below Line 23600 — reduces Taxable Income only, NOT Net Income |

!!! warning "Capital loss carry-forwards reduce only Taxable Income — not Net Income"
    This is the architectural distinction from Week 2 applied specifically to capital losses. A $10,000 capital loss carry-forward applied at Line 25300 reduces taxable income by $10,000 × 50% = $5,000 — saving approximately $5,000 × combined rate in tax. But Net Income (Line 23600) is unchanged. The client's CCB, GST/HST credit, OAS clawback, Age Amount, and spousal credit are all unaffected. Capital loss carry-forwards are less valuable than RRSP contributions to families receiving income-tested benefits.

### Carrying Back a Capital Loss — How It Works

**Scenario:** James had $22,000 in taxable capital gains in 2022. In 2025, he has a net capital loss of $14,000.

**Option:** Carry the 2025 net capital loss back to 2022.

**Process:**
1. File Form T1-ADJ for the 2022 return
2. Request adjustment to Line 12700: reduce by the carry-back amount
3. CRA recalculates the 2022 tax, determines the refund, and issues an amended NOA for 2022
4. Refund: $14,000 × 50% × James's 2022 combined marginal rate

At James's 29.65% combined rate in 2022: $14,000 × 50% × 29.65% = **$2,075 in combined tax refunded from 2022**

**This carry-back can be done up to 3 years back** — but only against capital gains, not against all income.

---

## 7.9 The Superficial Loss Rule — The 30-Day Window

The superficial loss rule prevents investors from selling a security at a loss purely for tax purposes and then immediately repurchasing the same security.

### When Does the Superficial Loss Rule Apply?

A loss is superficial if:
1. A security is sold at a loss, **AND**
2. The **same or identical** security is repurchased (by the same taxpayer, their spouse/CLP, or a corporation they control) within **30 days before or after** the sale

**Effect of superficial loss:** The capital loss is **denied** — it does not appear on Schedule 3. Instead, the denied loss amount is **added to the ACB of the newly repurchased shares**, deferring the loss to a future disposition.

!!! example "Case — The Superficial Loss That Didn't Save Tax"
    Patricia held 500 shares of Shopify (purchased at $60/share, total ACB $30,000). By December 2025 they were trading at $41/share.

    **December 27:** Patricia sells all 500 shares.
    Proceeds: $41 × 500 = $20,500
    ACB: $30,000
    Capital loss: $9,500

    **January 8 (12 days later):** Patricia buys 500 shares of Shopify at $42/share = $21,000.

    **The superficial loss rule applies:** The repurchase occurred within 30 days after the sale. The $9,500 loss is **denied** on Schedule 3.

    **Effect on the new shares:** ACB of new Shopify shares = $21,000 + $9,500 (denied loss added) = **$30,500**

    The $9,500 loss is not lost permanently — it is deferred into the new shares' higher ACB. When Patricia eventually sells the new shares, she will realize a larger loss (or smaller gain) that incorporates the denied amount.

    **Working around the superficial loss rule:**
    - Wait 31 days before repurchasing the same security
    - Buy a **similar but not identical** security immediately (different index ETF, different company in the same sector)

    Patricia could have immediately bought a different tech company or a broad tech ETF — maintaining her sector exposure while legitimately harvesting the $9,500 loss.

### The "Identical Properties" Definition

"Identical property" is interpreted broadly by CRA:
- Same shares of the same company: identical ✅
- Same mutual fund: identical ✅
- Horizons S&P 500 ETF and iShares S&P 500 ETF: generally **not** identical (different issuers, different structures)
- Shopify Class A and Shopify Class B: identical ✅ (same company)
- A stock and its ADR (American Depositary Receipt): may be identical — use caution

### The Corporation and Spouse/CLP Trap

The superficial loss rule applies not just to the taxpayer's own repurchase — but also to:
- Repurchases by their **spouse or common-law partner**
- Repurchases by a **corporation controlled by the taxpayer**

A client who sold shares at a loss and had their corporation repurchase the same shares within 30 days has triggered the superficial loss rule. The loss is denied. This is a common planning error when clients try to manage losses at year-end through their corporate accounts.

---

## 7.10 Deemed Dispositions — When You're Treated as Having Sold Without Selling

CRA deems a disposition to have occurred in several situations where no actual sale took place. These create capital gain (or loss) reporting obligations even without cash proceeds.

### The Major Deemed Disposition Situations

=== "Gifts and Transfers to Non-Arm's Length Persons"

    When you give property to a family member or other non-arm's length person (e.g., spouse, child, corporation you control), CRA deems you to have disposed of the property at its **fair market value** — regardless of what cash (if any) was received.

    **Example:** Margaret gives her daughter 100 shares of TD Bank (FMV $9,400, ACB $5,200). Margaret is deemed to have sold the shares for $9,400. Capital gain: $9,400 − $5,200 = $4,200. Taxable gain: $2,100 → Line 12700.

    **Exception — gifts to spouse or CLP:** A special "rollover" provision allows property to transfer to a spouse/CLP at ACB (no gain triggered), unless the taxpayer elects fair market value treatment. This is the spousal rollover — commonly used for estate planning.

    **Why the rollover matters:** Without the spousal rollover, every gift between spouses would trigger a capital gain at fair market value. With it, property moves between spouses at ACB — deferring the gain until the receiving spouse eventually sells.

=== "Death — The Deemed Disposition at FMV"

    On the day of death, a taxpayer is deemed to have disposed of all capital property at fair market value (with exceptions for rollovers to surviving spouses).

    **What gets deemed disposed:**
    - Non-registered investments (stocks, bonds, ETFs) — all at FMV on date of death
    - Rental properties — at FMV on date of death (triggers both capital gain AND recapture on building)
    - Cottage or vacation property — at FMV on date of death
    - RRSP/RRIF — not a capital property — full FMV added to income as regular income (different rule)

    **What is exempt:** Canadian real estate is not deemed disposed on death — it passes through the estate at ACB. Capital gains on Canadian real estate are deferred.

    **Spousal rollover on death:** Capital property can roll to a surviving spouse at ACB (no gain triggered) using Form T1032 or the applicable rollover provisions. The surviving spouse then takes on the deferred gain.

=== "Emigration from Canada — Departure Tax"

    When a Canadian resident permanently leaves Canada, they are deemed to have disposed of most capital property at FMV on the date they ceased residency (Section 128.1 departure tax). Covered in Week 19 for new immigrants (their arrival creates a deemed acquisition).

    **What is exempt from departure tax:**
    - Real estate situated in Canada
    - Inventory of a Canadian business
    - Pension plans (RRSP, RRIF, CPP, OAS)

    Departure tax can be deferred if the taxpayer posts adequate security with CRA.

=== "Change in Use — Rental to Personal or Personal to Rental"

    When a property changes from personal use to income-producing (or vice versa), a deemed disposition at FMV occurs.

    **Personal → Rental:** Deemed sold at FMV → potential capital gain. Can elect to defer under ITA 45(2).
    **Rental → Personal:** Deemed sold at FMV → capital gain plus recapture on CCA.

---

## 7.11 Personal Use Property and Listed Personal Property

### Personal Use Property — The $1,000 Floor

Personal use property (boats, cars, vacation cabins, furniture) has special rules:

- **For capital gains:** The ACB and the proceeds are each subject to a **minimum of $1,000**. If the property sells for less than $1,000, proceeds are deemed to be $1,000. If the ACB is less than $1,000, the ACB is deemed to be $1,000.
- **For capital losses:** Losses on personal use property are **NOT deductible** — they are simply ignored.

**Practical effect:** Capital gains on personal use property (selling a boat at a profit) are taxable. Capital losses (selling a boat at a loss) are ignored.

### Listed Personal Property — Different Rules

Listed personal property (LPP) is a subset of personal use property that includes:
- Art, prints, and sculptures
- Jewelry
- Rare books and manuscripts
- Stamps and stamp collections
- Coins and coin collections

**LPP rules:**
- The $1,000 floor applies to both proceeds and ACB
- **Losses on LPP CAN offset gains on OTHER LPP** — but not against other capital gains
- Net LPP losses carry forward 7 years and back 3 years (against LPP gains only)

---

## 7.12 Cryptocurrency — Capital Property, Special Complications

CRA treats cryptocurrency (Bitcoin, Ethereum, and all other crypto) as **capital property** — not currency. Every transaction involving crypto is potentially a capital event.

### What Constitutes a Disposition of Crypto

| Transaction | Disposition? | Capital Event? |
|---|---|---|
| Selling crypto for Canadian dollars | ✅ Yes | Capital gain or loss |
| Selling crypto for USD or other fiat currency | ✅ Yes | Capital gain or loss |
| Trading one crypto for another (e.g., BTC → ETH) | ✅ Yes | Capital gain or loss on the BTC |
| Using crypto to buy goods or services | ✅ Yes | Capital gain or loss at time of use |
| Receiving crypto as payment for services | ✅ Yes | Business income (value at receipt = income AND ACB of crypto) |
| Mining cryptocurrency | Complex | May be business income or capital — fact-based |
| Staking rewards | Complex | Generally income at FMV on receipt; forms ACB |
| Gifting crypto to a family member | ✅ Yes | Deemed disposition at FMV |
| Moving crypto between your own wallets | ❌ No | Not a disposition |
| Crypto held inside a TFSA | Complex | Generally not permitted — TFSA violations possible |

!!! warning "Every crypto-to-crypto trade is a taxable event — even if no money changed hands"
    This is the most common misconception among crypto investors. When a client says "I didn't sell anything — I just traded Bitcoin for Ethereum," they are describing a taxable event. CRA treats the BTC as disposed at its FMV at the time of trade, generating a capital gain (or loss) on the BTC.

    A client who made 200 crypto-to-crypto trades in 2025 has 200 separate capital gain/loss events to calculate.

### The Crypto ACB Problem

Tracking ACB for cryptocurrency is significantly more complex than for stocks:
- Many clients have traded across multiple exchanges (Coinbase, Binance, Kraken, local exchanges)
- Many exchanges have closed or lost records
- Crypto prices fluctuate continuously — each trade requires the FMV at the exact time of the trade
- The same average-cost method applies — but tracking across hundreds of transactions and multiple wallets is a significant undertaking

**Your intake question for every client under 45:** *"Have you bought, sold, traded, used, or received any cryptocurrency in the past few years?"*

For clients with significant crypto history: specialized crypto tax software (Koinly, CoinTracker) that imports transaction history from exchanges may be necessary. This is labour-intensive work — factor it into your fee estimate.

### Crypto and the Business vs. Capital Distinction

If a client is trading cryptocurrency frequently, at high volume, and with the primary intent of profit from price movements — CRA may characterize this as **business income** (100% taxable) rather than capital gains (50% taxable). The same "adventure in the nature of trade" doctrine applies.

---

## 7.13 The Capital Gains Calculation in Practice — Schedule 3 Complete

### A Real Schedule 3 With Multiple Dispositions

**Client:** James, age 45, Ontario resident, $88,000 employment income.

**Dispositions in 2025:**

**1. Sold TD Bank shares (Section 1):**
- 200 shares sold at $91.50/share, commission $8.95
- ACB: 200 shares × $80.34/share (from prior example) = $16,068
- Proceeds: $18,300 − $8.95 = $18,291.05
- Capital gain: $18,291.05 − $16,068 = **$2,223.05**

**2. Sold Shopify shares at a loss (Section 1):**
- 300 shares sold at $58/share, commission $8.95
- ACB: 300 × $84/share = $25,200
- Proceeds: $17,400 − $8.95 = $17,391.05
- Capital loss: $17,391.05 − $25,200 = **($7,808.95)**

**3. Sold vacation cottage (Section 4):**
- Purchased 2010 for $185,000 (plus $4,200 legal fees + $1,800 land transfer tax = **$191,000 ACB**)
- Capital improvements 2018: new deck $18,500 → **ACB becomes $209,500**
- Sold for $445,000; real estate commission $22,250; legal fees $2,800; outlay total $25,050
- Net proceeds: $445,000 − $25,050 = $419,950
- Capital gain: $419,950 − $209,500 = **$210,450**

**4. Prior-year capital loss carryforward from 2023:** $14,200 (from NOA)

---

**Step 1: Net current-year gains and losses:**
Gains: $2,223.05 + $210,450 = $212,673.05
Losses: $7,808.95

Net capital gain: $212,673.05 − $7,808.95 = **$204,864.10**

**Step 2: Apply prior-year capital loss carry-forward:**
Net capital gain after carry-forward: $204,864.10 − $14,200 = **$190,664.10**

Wait — the carry-forward is applied at Line 25300 below Net Income, not directly on Schedule 3. Schedule 3 shows the current-year net: **$204,864.10**. The carry-forward reduction ($14,200) is at Line 25300.

**Step 3: Taxable capital gain (50% inclusion):**
$204,864.10 × 50% = **$102,432.05 → Line 12700**

After carry-forward at Line 25300: $14,200 × 50% = $7,100 reduction to Taxable Income (not Net Income).

**James's combined tax impact of the cottage sale alone:**
The $210,450 gain (mostly from the cottage) generates a taxable capital gain of $210,450 × 50% = $105,225 added to Line 12700. At his combined rate (income now exceeds $114,750 due to the gain — entering 37.16% bracket):

Tax on the cottage gain: approximately $105,225 × 37.16% (blended) = approximately **$39,100 in combined tax**

Plus Ontario surtax on the elevated income: approximately **$4,200**

**Total tax on the cottage sale: approximately $43,300**

**James's planning question:** *"Why is the tax on the cottage so high?"*

*"James, the $210,000 profit on the cottage is a capital gain — which means only half is taxable ($105,000). If it were business income or employment income, the full $210,000 would be taxed. But even at 50% inclusion, at your income level the combined tax is about $43,000. The cottage was held 15 years, which helps establish it as capital (not a flip). If you had any years where you used the cottage as your principal residence, we could potentially apply the PRE to reduce the gain — but that requires it to have been designated as your principal residence for those years. Given you have a primary home in London, the cottage was unlikely designated as a principal residence. One note: if you bought the cottage with the intent to eventually sell at a profit — we should discuss whether CRA might try to characterize this as business income, though a 15-year hold strongly supports capital treatment."*

---

## 7.14 Ontario-Specific Capital Gains Considerations

### Ontario Tax on Capital Gains — The Surtax Effect

For Ontario clients with significant capital gains pushing net income above the surtax thresholds:

At $88,000 employment income + $102,432 taxable capital gain = $190,432 total income for James (simplified — before the cottage, roughly):

**Ontario bracket:** At $190,432, income spans across the 12.16% and 13.16% Ontario brackets. The Ontario surtax applies at both tiers:
- First surtax tier (20% above $5,315) — both tiers likely triggered at this income level
- Second tier (36% above $6,802) — also triggered

This creates an effective Ontario rate significantly above the nominal bracket rates on the capital gain portion.

### Ontario and the Lifetime Capital Gains Exemption

The federal LCGE ($1,250,000 in 2025) for qualifying small business corporation shares is claimed at Line 25400 on the federal return. Ontario respects this deduction — there is no Ontario equivalent LCGE, but Ontario does not tax the exempted gain either. A properly claimed LCGE eliminates both federal and Ontario tax on the qualifying gain.

### Ontario Capital Gains and Instalment Requirements

A large unexpected capital gain (cottage sale, business sale) can push a client well above the $3,000 instalment threshold. If the capital gain is not expected in future years, the instalment obligation may return to normal. But for the year of the gain — if the combined tax liability exceeds $3,000 and the prior year also had over $3,000 — instalments may be required.

Advise clients who have a large one-time capital gain: *"Next year, CRA may send you an instalment request based on this year's high income. But if this was a one-time event and your income returns to normal, you can base your instalments on your expected income — not last year's. Let's calculate that next fall so you're not over-paying instalments."*

---

## 7.15 Capital Gains Errors to Prevent — Your Checklist

| Error | Consequence | Prevention |
|---|---|---|
| Using T5008 Box 20 as ACB without verification | Overpaid or underpaid capital gains tax — potentially large | Always verify against original purchase records |
| Ignoring DRIP share additions to ACB | Overpaid capital gains tax | Ask about DRIP enrollment for every long-held position |
| Not applying superficial loss rule correctly | Capital loss claimed that should be denied; ACB not adjusted | Check: same security repurchased within 30 days before/after sale? |
| Reporting PRE gain without filing T2091 | Up to $8,000 penalty even on $0-tax gain | File Schedule 3 + T2091 for every principal residence sale |
| Treating crypto-to-crypto trades as non-events | Unreported capital gains — CRA enforcement priority | Every crypto trade (including crypto-to-crypto) is a taxable event |
| Not tracking Box 42 return of capital on trust investments | ACB overstated → capital gain understated on eventual sale | Maintain ACB schedule for every trust unit holding |
| Ignoring capital improvements on real estate ACB | ACB understated → capital gain overstated | Ask about major renovations: "Did you make any substantial improvements?" |
| Treating spouse's crypto/security repurchase as not triggering superficial loss | Loss claimed that should be denied | The 30-day window applies to spouse/CLP purchases too |

---

## 7.16 Case Studies — Capital Gains in Practice

### Case A — The Inherited Portfolio

**Client:** Helen's father died in 2022, leaving her 500 Royal Bank shares. At the date of death, RBC was trading at $123/share. In 2025, Helen sells all 500 shares at $141/share.

**Helen's ACB:** Under the deemed disposition on death rules, her father was deemed to have disposed of the shares at FMV = $123/share on his terminal return. Helen's ACB = $123/share × 500 = **$61,500** (the FMV at the date of death).

*Note: This is NOT what her father originally paid for the shares. If he bought them in 2001 for $30/share, his terminal return reported a capital gain on the entire appreciation to $123. Helen's ACB starts fresh at the date of death FMV.*

**Helen's capital gain (2025 sale):**
Proceeds: 500 × $141 = $70,500
ACB: $61,500
Outlay (commission): $8.95
Capital gain: $70,500 − $61,500 − $8.95 = **$8,491.05**
Taxable: $8,491.05 × 50% = **$4,245.53 → Line 12700**

**Common mistake:** Using the father's original 2001 purchase price as Helen's ACB. If the original price was $30/share ($15,000 total), the capital gain would be $70,500 − $15,000 = $55,500 — grossly overstating the gain by $47,000 and generating approximately $47,000 × 50% × 29.65% = $6,967 in excess combined tax.

---

### Case B — The Crypto Investor Who Thought They Had No Gains

**Client:** Ahmed, 31, IT professional. "I did some crypto investing but I didn't really make any money."

**His records (pulled from three exchanges):**

| Date | Transaction | Detail | Gain/(Loss) CAD |
|---|---|---|---|
| Jan 2025 | Bought 0.5 BTC | $26,000 CAD | — |
| Mar 2025 | Traded 0.2 BTC → ETH | BTC FMV = $30,000. Cost basis for 0.2 BTC = $10,400. Proceeds = $6,000 USD = $8,220 CAD | ($2,180) loss |
| Jun 2025 | Sold ETH for $7,400 CAD | ETH ACB was $8,220. Loss: $820 | ($820) loss |
| Sep 2025 | Sold 0.3 BTC for $18,900 CAD | ACB for 0.3 BTC = $15,600. Gain: $3,300 | $3,300 gain |

Ahmed's net: $3,300 gain − $2,180 loss − $820 loss = **$300 net capital gain**
Taxable: $300 × 50% = $150 → Schedule 3

Ahmed was right that he "didn't really make money" — but he had four separate taxable events that required individual calculation and reporting. The March crypto-to-crypto trade was a taxable event he didn't know about.

**Your work:** Reconstruct the ACB tracking, calculate each transaction, and complete Schedule 3 with four separate entries. The net is small — but the obligation is real.

---

### Case C — The PRE Claim That Was Almost Filed Wrong

**Client:** Sandra, sold her Toronto condo in June 2025. She purchased it in 2015 for $320,000. Sold for $875,000. She lived there from 2015–2020, then rented it out 2021–2025.

**Without the ITA 45(2) election (no election was made):**
Years owned: 2015–2025 = 11 years
Years as principal residence: 2015–2020 = 6 years

Exempt fraction: (1 + 6) ÷ 11 = 7/11 = **63.6% exempt**

Capital gain: $875,000 − $320,000 = $555,000
Taxable portion: $555,000 × (1 − 63.6%) = $555,000 × 36.4% = $201,820
Taxable capital gain (50%): $201,820 × 50% = **$100,910 → Line 12700**

**With the ITA 45(2) election (if available):**
If Sandra made the 45(2) election when she first started renting (2021) AND did not claim CCA on the property during the rental period — she could extend her principal residence designation by up to 4 additional years (2021–2024):

Years as principal residence with election: 2015–2020 + 2021–2024 = 10 years

Exempt fraction: (1 + 10) ÷ 11 = 11/11 = **100% exempt**

Capital gain: $0 taxable (fully exempt)
Tax saving vs. no election: **$100,910 × combined rate (37.16%) = approximately $37,498**

**Critical question at intake for every rental property client:** *"Was this property your principal residence before you started renting it? Did you claim CCA on the building during the rental period?"*

The 45(2) election is worth up to tens of thousands of dollars — but it requires that no CCA was claimed. This is why Week 9 (rental income) always mentions the CCA decision on a former principal residence.

---

## 7.17 Week 7 Summary

!!! success "What you learned this week"
    - **Capital gains formula:** Proceeds − ACB − Outlays = Capital Gain. The 50% inclusion rate means only half is added to income and taxed at the marginal combined rate
    - **ACB is not just the purchase price.** It includes commissions, legal fees, capital improvements (real estate), DRIP shares, and adjustments for return of capital. It excludes repairs, property taxes, and insurance
    - **T5008 Box 20 is unreliable.** Never use it without verification against original purchase records. DRIP investors, return-of-capital recipients, and inherited securities all have incorrect Box 20 amounts
    - **DRIP investors:** Every reinvested dividend that was taxed as income must be added to ACB. Ignoring DRIP additions overpays capital gains tax — sometimes by thousands of dollars over a holding period
    - **Schedule 3 sections:** Section 1 (securities), Section 4 (real estate), Section 5 (personal use), Section 6 (listed personal property). Complete separately for each type
    - **Principal Residence Exemption:** Exempt fraction formula = (1 + years as PR) ÷ total years owned. The PRE can fully exempt gains on mixed-use properties using the 45(2) election if no CCA was claimed. Mandatory reporting on Schedule 3 + T2091 even when gain is $0 — penalty up to $8,000 for not reporting
    - **Capital losses:** Only offset capital gains. Carry back 3 years (T1-ADJ for prior year). Carry forward indefinitely. Reduce only Taxable Income, not Net Income — no benefit effect
    - **Superficial loss rule:** Loss is denied when the same or identical security is repurchased within 30 days before or after the sale (by taxpayer, spouse/CLP, or controlled corporation). Denied loss is added to ACB of repurchased shares — deferred, not lost
    - **Deemed dispositions:** Gifts to family members (at FMV), death (all capital property at FMV), emigration (departure tax), change in use (rental to personal or vice versa). Spousal rollovers defer gains
    - **Cryptocurrency:** Every transaction is potentially taxable. Crypto-to-crypto trades are dispositions. Mining and staking rewards are generally income. Track ACB across all exchanges and wallets
    - **Ontario surtax:** Large capital gains push Ontario basic tax into surtax territory — effective Ontario rate significantly higher than nominal bracket rate for one-time large gains

---

## ✅ Week 7 Quiz

When you're ready, ask Claude: **"Quiz me on Week 7"** for an interactive test.

??? question "1. Robert bought 200 TD Bank shares in January 2020 for $78/share plus $9 commission, 100 more in June 2021 for $87/share plus $9 commission, and enrolled in DRIP — receiving 15 additional shares at an average price of $82/share through dividend reinvestment. He sells all 315 shares in October 2025 at $94/share with a $9 commission. Calculate his capital gain."
    **Building the ACB:** Jan 2020: 200 × $78 + $9 = $15,609. Jun 2021: 100 × $87 + $9 = $8,709. Total purchases: $15,609 + $8,709 = $24,318 for 300 shares. DRIP shares: 15 × $82 = $1,230 (each reinvested dividend was previously taxed as income — adds to ACB). **Total ACB: $24,318 + $1,230 = $25,548 for 315 shares. ACB per share: $25,548 ÷ 315 = $81.10.** Sale proceeds: 315 × $94 = $29,610. Less commission: $9. Net proceeds: $29,601. ACB of 315 shares: $25,548. **Capital gain: $29,601 − $25,548 = $4,053.** Taxable capital gain: $4,053 × 50% = **$2,027 → Line 12700.** Without DRIP: ACB = $24,318; capital gain = $29,601 − $24,318 = $5,283; taxable = $2,642 — **$615 more in taxable capital gain from ignoring the DRIP shares.** At 29.65% combined rate: $182 in excess tax per this disposal alone.

??? question "2. Sandra sold her principal residence in 2025 for $920,000 (ACB $290,000 including improvements). She lived there from 2012–2019 (8 years) and rented it 2020–2025 (6 years). She did NOT claim CCA during the rental period. She DID make the ITA 45(2) election when she began renting in 2020. What is her taxable capital gain?"
    **Without the 45(2) election:** Years owned: 2012–2025 = 14 years. Years as PR: 2012–2019 = 8. Exempt fraction: (1+8)÷14 = 9/14 = 64.3%. Capital gain: $630,000. Taxable portion: $630,000 × (1−64.3%) = $224,910. Taxable capital gain: $112,455. **With the 45(2) election (no CCA claimed):** The election extends principal residence designation by up to 4 additional years. Extended PR years: 2012–2019 + 2020–2023 = 12 years. Exempt fraction: (1+12)÷14 = 13/14 = 92.9%. Taxable portion: $630,000 × (1−92.9%) = $630,000 × 7.1% = $44,730. Taxable capital gain: $44,730 × 50% = **$22,365 → Line 12700.** Tax saving from the 45(2) election: ($112,455 − $22,365) × combined rate (~38%) ≈ **$34,235** — from making an election when she first started renting.

??? question "3. Kevin sold 400 Shopify shares at $52/share on December 26 (loss of $14,800 from his ACB of $89/share). On January 15 (20 days later), he repurchased 400 Shopify shares at $54/share. What happens to the capital loss and what is the ACB of the new shares?"
    **Superficial loss rule applies.** The identical security (Shopify) was repurchased within 30 days after the sale (20 days). The $14,800 capital loss is **denied** on Schedule 3 — it does not reduce Kevin's taxable capital gains this year. **Effect on new shares:** The denied loss of $14,800 is added to the ACB of the newly purchased shares. New shares: 400 × $54 = $21,600 purchase cost. ACB adjustment: $21,600 + $14,800 = **$36,400 total ACB for the 400 shares ($91/share).** The $14,800 is not lost permanently — when Kevin eventually sells the new shares, the higher ACB will generate a larger loss (or smaller gain) that incorporates the deferred amount.

??? question "4. Patricia gifted 300 RBC shares to her adult daughter Sarah. Patricia's ACB was $72/share. The FMV at the time of the gift was $98/share. Sarah did not pay anything. What are the tax consequences for Patricia, and what is Sarah's ACB?"
    **Patricia:** A gift to a non-arm's length person triggers a deemed disposition at FMV, regardless of consideration received. Patricia is deemed to have sold the 300 shares at $98/share. Proceeds: $29,400. ACB: 300 × $72 = $21,600. **Capital gain: $7,800. Taxable: $3,900 → Line 12700.** Patricia owes combined tax on $3,900 at her marginal rate even though she received no cash. **Sarah's ACB:** $98/share × 300 = **$29,400** — the FMV at the date of the gift. When Sarah eventually sells, her gain or loss is calculated from $29,400. Note: if Patricia had gifted to her spouse (not her daughter), the spousal rollover provision would apply — the shares transfer at ACB ($72/share) with no immediate gain for Patricia. The gain defers until the spouse sells.

??? question "5. Marcus sold Bitcoin for $24,000 CAD in March 2025. He then traded his remaining Ethereum for Litecoin in June — Ethereum was worth $8,400 at the time of the trade. He paid $17,000 total for all his crypto. Explain what taxable events occurred and roughly what the tax consequences are."
    **Two separate taxable events:** (1) **BTC sale for CAD (March):** This is a straightforward disposition. Marcus needs his ACB for the Bitcoin sold — the portion of the $17,000 total cost that applies to the Bitcoin. Without those records we cannot calculate the exact gain, but proceeds were $24,000. (2) **ETH-to-LTC trade (June):** This crypto-to-crypto trade IS a taxable event. When Marcus traded ETH for LTC, CRA treats this as a disposition of the ETH at its fair market value of $8,400. He needs the ACB of his ETH to calculate the gain or loss — another portion of the $17,000 total. Marcus likely thought "I didn't sell anything for money in June" — he did not realize that CRA treats the ETH as sold at its current value of $8,400 on the trade date. Every crypto-to-crypto exchange is a disposition at FMV. Marcus needs to reconstruct his ACB for each crypto separately using the average cost method, calculate each gain/loss, and report both transactions on Schedule 3.

??? question "6. Maria's T3 from her REIT shows Box 21 (capital gains) = $2,800 and Box 42 (return of capital) = $1,100. Her original ACB for the REIT units was $18,000. What goes on the T1 and what is her adjusted ACB after these distributions?"
    **T1 entries:** Box 21 = $2,800 capital gains → Schedule 3: $2,800 × 50% = **$1,400 taxable capital gain → Line 12700.** (Note: T3 Box 21 capital gains distributions are reported as capital gains — not as a return on investment.) Box 42 = $1,100 return of capital → **NOT reported on the T1** (not income — it is a return of original investment). **ACB adjustment:** Box 42 reduces Maria's ACB: $18,000 − $1,100 = **$16,900 adjusted ACB.** This must be tracked every year. When she eventually sells the REIT units, the capital gain will be calculated on this adjusted $16,900 ACB — not the original $18,000. Each year's Box 42 amount that isn't tracked creates an accumulated ACB error that will understate the eventual capital gain.

??? question "7. James has a net capital loss of $18,000 in 2025. He had taxable capital gains of $11,000 in 2024, $7,500 in 2023, and $4,200 in 2022. If he carries the 2025 loss back, what is the maximum refund he can generate and which years should he amend?"
    The net capital loss of $18,000 is available to carry back up to 3 years against capital gains (2024, 2023, 2022). He should carry back to the highest-marginal-rate year first to maximize the refund. **Taxable capital gains available (3-year window):** 2024: $11,000; 2023: $7,500; 2022: $4,200. Total: $22,700. His net capital loss of $18,000 can be applied (up to the total prior gains of $22,700). **Optimal strategy:** Apply against 2024 first ($11,000) then 2023 ($7,000 of the remaining $7,000). This uses the entire $18,000 carry-back. Unused capital loss: $0. **Process:** File T1-ADJ for 2024 requesting adjustment to Line 12700, reducing taxable capital gains from $11,000 to $0. File T1-ADJ for 2023 reducing Line 12700 from $7,500 to $500 (only $7,000 needed from 2023). **Combined refund:** At assumed 29.65% combined rate: ($11,000 + $7,000) × 29.65% = $18,000 × 29.65% = **$5,337 in combined refunds from the two amended returns** plus CRA pays compound interest on overpaid taxes.

---

## 📚 Further Reading

- [CRA: Capital gains — Guide T4037](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4037.html)
- [CRA: Principal residence — designation and exemption](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/principal-residence-other-real-estate.html)
- [CRA: Schedule 3 — Capital Gains and Losses](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/5000-s3.html)
- [CRA: Adjusted cost base (ACB)](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/adjusted-cost-base.html)
- [CRA: Superficial losses](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/superficial-losses.html)
- [CRA: T2091 — Designation of a property as a principal residence](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t2091.html)
- [CRA: Cryptocurrency — tax treatment](https://www.canada.ca/en/revenue-agency/programs/about-canada-revenue-agency-cra/compliance/digital-currency/cryptocurrency-guide.html)
- [CRA: Capital losses and how to apply them](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-25300-net-capital-losses-other-years.html)

---

!!! tip "Up Next: Week 8"
    **Self-Employment Income and the T2125** — The most complex single form on the T1. Gross revenue vs. net income. COGS calculations for product businesses. Home office (detailed method, business-use percentage). Vehicle logbooks and CCA classes. CPP on self-employment at 11.9%. HST registration obligations for small businesses. Fiscal year elections. The hobby vs. business distinction. Inventory valuation. Week 8 is the week that opens the door to serving the fastest-growing client segment in Canada: the self-employed.
