# Week 9: Rental Income — The T776 From First Tenant to Final Sale

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Determine whether income is rental income (T776) or business income (T2125) — with every edge case resolved
    - Report every category of rental income correctly — deposits, subsidies, forfeited amounts, sublease payments
    - Apply the current vs. capital improvement distinction to every renovation scenario — the most consequential judgment call on a rental return
    - Build a complete T776 for any rental situation, from a single basement suite to a multi-unit building
    - Apply the mortgage interest deductibility tracing rules — including when a refinanced mortgage creates complications
    - Handle the below-market rent situation — renting to family members and the consequences
    - Apply CCA strategically — claiming it, not claiming it, or partially claiming it — and explain the recapture consequence precisely
    - Calculate recapture and terminal loss on disposal — the two events most rental clients don't see coming
    - Apply the ITA 45(2) change-in-use election when a principal residence becomes a rental
    - Handle the reverse — when a rental becomes a principal residence
    - Handle co-ownership, attribution rules between spouses, and proportional income reporting
    - Handle the basement suite situation: allocation method, PRE protection, CCA decision
    - Handle Airbnb and short-term rentals — classification, HST obligations, what they mean for the PRE
    - Handle multi-unit buildings: the separate property rule and consolidated expense allocation
    - Handle soft costs during construction or major renovation
    - Identify the eight rental income audit triggers that generate the most CRA reviews
    - Apply Ontario-specific considerations affecting every rental property owner in the province

!!! warning "Rental income is routinely prepared incorrectly — and the errors compound over years"
    Two categories of error dominate: (1) treating capital improvements as current expenses, inflating deductions and creating audit risk; and (2) claiming CCA without understanding that every dollar claimed now becomes fully taxable recapture income at sale. A client who claimed $80,000 in CCA over a decade and sells their rental property doesn't expect $80,000 added to their income in the sale year — taxed at the full marginal rate, not the 50% capital gains rate. This week prevents that surprise and every other material rental error.

---

## 9.1 Rental Income vs. Business Income — The Classification Decision

Before opening the T776, you must classify the activity correctly. The classification determines which form you use, which expenses are deductible, whether losses can shelter other income, and whether HST applies.

### The Service-Level Test

| Factor | Rental Income (T776) | Business Income (T2125) |
|---|---|---|
| **Nature of activity** | Passive — providing space and nothing more | Active — providing accommodation plus significant services |
| **Services provided** | Key handover, basic maintenance | Cleaning, linen service, meals, concierge, daily housekeeping |
| **Long-term residential** | ✅ Almost always T776 | Rare exceptions for rooming houses with meals |
| **Airbnb — basic** | T776 if host simply provides access and the guest self-serves | T2125 if host provides cleaning, linens, check-in service |
| **Airbnb — hotel-like** | — | T2125 — bed and breakfast classification |
| **CCA loss restriction** | CCA cannot create or increase a rental loss | No CCA restriction — business losses unrestricted |
| **GST/HST — long-term (30+ days)** | **Exempt supply** — no HST on rent, no ITCs available | Same |
| **GST/HST — short-term (under 30 days)** | Taxable supply — HST applies if over $30,000 | Taxable supply |

### Airbnb — The Most Frequently Misclassified Situation

Airbnb hosts exist on a spectrum. Classification depends on what the host actually does:

| Host Activity | Classification | Tax Form | HST Required? |
|---|---|---|---|
| Provides key, guest completely self-sufficient, no services | Rental income | T776 | Only if short-term AND over $30,000 |
| Provides cleaning between guests, fresh linens, toiletries | Business income | T2125 | Yes if over $30,000 (or Day 1 if hotel-like) |
| Provides breakfast, daily housekeeping, concierge | Business income (B&B) | T2125 | Yes — hotel classification |

!!! warning "Airbnb and the Principal Residence Exemption — a trap most hosts don't know exists"
    When a homeowner rents their home short-term on Airbnb during periods they're away, CRA may take the position that a change-in-use occurred for those periods — potentially affecting the PRE on eventual sale.

    CRA's administrative position (as of 2023): if the Airbnb activity is limited in scope and the property is primarily a principal residence, CRA will generally not apply the change-in-use rules. However, if a significant portion of the year is spent on short-term rental — and the property generates business income rather than rental income — the PRE protection for the business-use portion may be compromised.

    Advise clients: document that the property is primarily their personal residence. Do not let Airbnb rental activity dominate the property's use. If short-term rental becomes the primary purpose, consult a CPA about the PRE implications before continuing.

---

## 9.2 The T776 — Form Structure and Complete Flow

One T776 is required for each rental property. Exception: a group of properties managed together as a single operation may be reported on a single T776 (common for multi-unit buildings owned by one person).

### The T776 Flow

```
╔══════════════════════════════════════════════════════════╗
║  PART 1: IDENTIFICATION                                   ║
║  Property address, % ownership, fiscal year              ║
╚════════════════════════╦═════════════════════════════════╝
                         │
╔════════════════════════╩═════════════════════════════════╗
║  PART 2: GROSS RENTAL INCOME                              ║
║  All rents + parking + laundry + government subsidies    ║
╚════════════════════════╦═════════════════════════════════╝
                         │ Subtract current expenses
╔════════════════════════╩═════════════════════════════════╗
║  PART 3: NET INCOME BEFORE CCA                            ║
║  ← This controls the CCA maximum                         ║
╚════════════════════════╦═════════════════════════════════╝
                         │ Subtract CCA (if income positive)
╔════════════════════════╩═════════════════════════════════╗
║  PART 4: NET RENTAL INCOME (or LOSS) → Line 12600        ║
║  Positive: taxable income | Negative: deductible loss    ║
╚══════════════════════════════════════════════════════════╝
```

**Where net rental income flows on the T1:**

| Result | T1 Line | Treatment |
|---|---|---|
| Net rental income (positive) | **Line 12600** | Added to Total Income |
| Net rental loss from operations | **Line 12600** (negative) | Deducted — offsets other income |
| Net rental loss from CCA | **Cannot occur** — CCA loss restriction prevents it | — |

---

## 9.3 What Counts as Rental Income — Every Source

| Amount | Taxable? | Year Reported |
|---|---|---|
| Monthly rent | ✅ Yes | Year received |
| Last month's rent deposit — received | ✅ CRA's technical position | Year received |
| Last month's deposit — when applied | ✅ Practical approach | Year applied (consistent) |
| Damage deposit — refunded | ❌ No | Never — remains a liability |
| Damage deposit — forfeited by tenant | ✅ Yes | Year forfeited |
| Lease cancellation / buyout payment | ✅ Yes | Year received |
| Parking revenue | ✅ Yes | Year received |
| Coin laundry revenue | ✅ Yes | Year received |
| Storage locker fees | ✅ Yes | Year received |
| Utilities billed to tenant separately | ✅ Yes | Year received (then deduct utility costs) |
| Government rent subsidies (CMHC, provincial housing programs) | ✅ Yes | Year received |
| Sublease income (landlord subleases to a third party) | ✅ Yes | Year received |
| Payments in kind (tenant does repairs instead of paying rent) | ✅ FMV of services | Year received |
| Key money / finder's fees | ✅ Yes | Year received |

### The Last Month's Deposit — The Consistent-Approach Rule

CRA's technical position: a last month's deposit is income in the year received because the tenant owes the landlord the rent and the deposit is a pre-payment of that rent.

In practice: many preparers report it in the year it is applied (the tenant's final month), and CRA rarely challenges this for residential landlords with a consistent approach. Both approaches exist in the literature.

**Your practice:** choose one approach and apply it consistently for each client. Inconsistency — reporting it in different years based on which produces a lower tax bill — is what attracts scrutiny.

---

## 9.4 Current Rental Expenses — The Complete Deductible List

Current expenses are deductible in full in the year incurred. They maintain the property in its existing condition without adding lasting value.

### The Complete Expense Categories

| Expense | Deductible? | Rate | Critical Notes |
|---|---|---|---|
| **Mortgage interest** | ✅ Yes | 100% | Interest portion only — never the principal component |
| **Property taxes** | ✅ Yes | 100% | Municipal + provincial education levy |
| **Insurance** | ✅ Yes | 100% | Landlord/property insurance — not tenant's personal contents |
| **Property management fees** | ✅ Yes | 100% | Third-party management company fees |
| **Advertising** | ✅ Yes | 100% | Kijiji, rental listing sites, signage |
| **Repairs and maintenance** | ✅ Yes (current) | 100% | See Section 9.5 for the current/capital distinction |
| **Utilities paid by landlord** | ✅ Yes | 100% | Heat, hydro, water, gas — if included in rent |
| **Landscaping and snow removal** | ✅ Yes | 100% | Routine seasonal maintenance |
| **Legal fees** | ✅ Yes | 100% | Leases, eviction proceedings, rent collection |
| **Accounting and bookkeeping** | ✅ Yes | 100% | Including preparation of this T776 |
| **Travel to manage property** | ✅ Yes | km rate | Trips to property for legitimate management — logbook required |
| **Meals during travel to property** | ✅ 50% | 50% | Subject to the standard 50% meal limitation |
| **Office expenses (managing rental)** | ✅ Yes | 100% | Supplies used to administer the rental activity |
| **Condominium fees** | ✅ Yes | 100% | For rental condos — the full monthly fee |
| **Salaries to employees** | ✅ Yes | 100% | If you hire a superintendent or maintenance person |
| **Interest on renovation loans** | ✅ Yes | 100% | Interest on money borrowed for current repairs |
| **Mortgage principal** | ❌ No | 0% | Capital repayment — never deductible |
| **Personal living expenses** | ❌ No | 0% | Any portion of the property used personally |
| **Land transfer tax** | ❌ No (not current) | — | Capital cost — adds to ACB |
| **Legal fees on purchase** | ❌ No (not current) | — | Capital cost — adds to ACB |

---

## 9.5 Mortgage Interest — The Tracing Rules (Advanced)

Mortgage interest is the largest rental deduction for most clients. But the deductibility is not automatic — it depends on the **purpose** of the borrowing, not the security.

### The Basic Rule: Purpose-Based Deductibility

Interest is deductible when the borrowed money was used **for the purpose of earning income from a business or property.** The key is what the money was actually used for — not what the mortgage is secured against.

**Straightforward case:** Patricia borrows $280,000 to buy a rental house. She uses every dollar to purchase the property. Interest is 100% deductible — the loan funded an income-earning asset.

### The Refinancing Trap

!!! danger "Refinancing can destroy mortgage interest deductibility — permanently"
    When a rental property is refinanced and the proceeds are used for personal purposes, the interest on the personal-use portion becomes **non-deductible** — even though the mortgage is secured against the rental property.

    **Example:** David bought his rental house with a $300,000 mortgage. He refinanced to $420,000 (the property had appreciated). He used the extra $120,000 to pay off his personal car loan and take a vacation.

    Result: Only the interest on $300,000 (the original amount used to acquire the income-earning property) is deductible. Interest on the $120,000 that went to personal purposes is NOT deductible — because that money wasn't used to earn rental income.

    **CRA's tracing approach:** CRA traces the use of borrowed funds. The security (the rental property) is irrelevant — what matters is what the money funded.

    **The tax cost of David's mistake:** If $120,000 of the mortgage is non-deductible, the annual interest cost (at 5.5%) is $6,600. At David's 37.16% combined rate: $6,600 × 37.16% = **$2,453 in lost annual tax deductions.** Over 10 years: $24,530 in permanently lost deductions — from one refinancing decision.

    **Planning implication:** Advise clients before they refinance. If they need cash for personal purposes: (1) consider a separate personal loan rather than refinancing the rental mortgage, or (2) understand that the personal-use portion of the refinanced mortgage will never be deductible.

### The Interest Deductibility When the Property Is Sold

When a rental property is sold, can the former owner continue deducting interest if they still owe money on the property?

Generally **no** — once the income-earning property is gone, the purpose test fails. If the sale proceeds were used to pay down the mortgage, the remaining mortgage (if any) has no income-earning purpose.

Exception: if the sale proceeds were insufficient to pay off the mortgage and the property was sold at a loss — CRA has some administrative positions supporting continued deductibility in genuine cases. These are complex — refer to a CPA.

---

## 9.6 Current Expenses vs. Capital Improvements — The Most Consequential Judgment Call

This distinction determines whether an expenditure is deducted fully this year (current expense) or deducted slowly over years through CCA while also adding to the property's ACB (capital improvement). Getting it wrong in either direction costs money.

### The Governing Principle

**Current expense:** Maintains the property in its existing condition. Restores to original state. No lasting value added beyond what already existed.

**Capital improvement:** Adds value to the property, extends its useful life, or replaces a component with something better or more extensive than what was there.

### The Three Test Questions

When the category is ambiguous, ask:

1. *Does this restore to the original condition, or does it go beyond what existed?*
2. *Would this command a higher sale price? Or just prevent a lower one?*
3. *Is this a recurring maintenance cost or a one-time structural change?*

### The Complete Judgment Table

| Work Done | Current or Capital? | Why |
|---|---|---|
| Repaint rooms (same quality paint) | **Current** | Maintenance — restores existing condition |
| Repaint entire exterior of building | **Current** | Maintenance, not improvement |
| Install new hardwood where carpet existed | **Capital** | Upgrade — increases value beyond original |
| Replace like-for-like broken window | **Current** | Equivalent restoration |
| Replace all windows with triple-pane | **Capital** | Upgrade improves energy efficiency and value |
| Patch a section of damaged roof | **Current** | Repair — partial restoration |
| Replace the entire roof | **Capital** | Major component replacement |
| Fix leaky faucet | **Current** | Repair |
| Replace kitchen faucet with equivalent | **Current** | CRA has allowed equivalent appliance/fixture replacements |
| Full kitchen renovation (cabinets, counters) | **Capital** | Major improvement — adds lasting value |
| Replace broken appliance with equivalent | **Current** | Like-for-like restoration |
| Add central air conditioning that didn't exist | **Capital** | Addition — adds value to property |
| Service existing air conditioning | **Current** | Maintenance of existing system |
| Replace old furnace with equivalent | **Capital (usually)** | Major component — though some preparers treat equivalent furnace as current. Conservative approach: capital |
| Seasonal landscaping and planting | **Current** | Maintenance |
| Install new patio and retaining wall | **Capital** | Permanent structure — adds value |
| General cleaning between tenants | **Current** | Routine maintenance |
| Refinish hardwood floors | **Current** | Maintenance of existing floors |
| Add a new room or addition | **Capital** | Addition — clear capital expenditure |
| Insulate walls or attic | **Capital** | Improvement — increases energy efficiency permanently |
| Install smoke detectors, CO detectors | Likely **Current** | Required safety maintenance — small cost, recurring |
| Install security camera system | **Capital** if permanent | Permanent installation adds value |

!!! example "Case — The $34,000 Between-Tenant Work-Up"
    Sarah's tenant vacated in September. Before relisting, she spent $34,000 on the following work:

    | Work | Invoice Amount | Classification | Reasoning |
    |---|---|---|---|
    | Replace all carpets with vinyl plank flooring | $11,400 | **Capital** | Upgrade beyond what existed — adds value |
    | Repaint all rooms | $4,200 | **Current** | Routine between-tenant maintenance |
    | Replace kitchen sink (equivalent fixture) | $840 | **Current** | Like-for-like — restores to working order |
    | New bathroom vanity (upgrade from 20-year-old unit) | $3,600 | **Capital** | Improvement — better than original |
    | General repairs: patched walls, fixed door hardware, replaced light switches | $5,800 | **Current** | Routine repairs — restores to original condition |
    | Replace deteriorated bathroom caulking | $380 | **Current** | Standard maintenance |
    | Add pot lights throughout (didn't exist before) | $7,780 | **Capital** | Addition — new fixtures add value |

    **Current expenses:** $4,200 + $840 + $5,800 + $380 = **$11,220** (deducted this year)
    **Capital improvements:** $11,400 + $3,600 + $7,780 = **$22,780** (added to building UCC and ACB)

    If Sarah's preparer incorrectly treated everything as current: $34,000 deducted vs. correct $11,220. Overstatement: $22,780. At Sarah's 37.16% rate: **$8,465 in excess deductions** — and a clear audit trigger when CRA reviews the return against building permit records or contractor invoices.

!!! question "Quick Check — Current vs. Capital"
    Ahmed owns a rental property. This year he paid: (1) $800 to repaint the exterior, (2) $12,000 to replace the entire roof, (3) $450 for a new lock set on the front door, (4) $18,000 to add a new bathroom that didn't exist before. Which are current expenses and which are capital?

    ??? answer
        **Current expenses (deduct in full this year):**
        - $800 exterior paint — routine maintenance, restores to original condition
        - $450 lock set — minor repair, incidental cost

        **Capital expenditures (add to UCC, claim CCA over time):**
        - $12,000 roof replacement — replaces a major structural component, extends the property's useful life significantly beyond the original
        - $18,000 new bathroom — adds something that didn't previously exist; clear capital improvement

        The key test: does it restore to original condition (current) or improve/extend/add (capital)?

---

## 9.7 Soft Costs During Construction and Renovation

**Soft costs** are financing and administrative costs incurred during the construction or renovation period — before the property is available for rental.

### What Qualifies as Soft Costs

| Soft Cost | Treatment |
|---|---|
| Interest on money borrowed to construct or substantially renovate | Soft cost — see rules below |
| Legal fees during construction | Soft cost |
| Property taxes during construction period | Soft cost |
| Insurance during construction | Soft cost |
| Architect and engineering fees during construction | Capital cost — added to building |

### The Soft Cost Rule

Soft costs incurred during a construction/renovation period can be:
- **Capitalized** (added to the building's cost and deducted via CCA over time), OR
- **Deducted currently** — but only to the extent of rental income earned from the property in the year, OR
- **Deducted as carrying charges** on Line 22100 of the T1

The choice matters because capitalized soft costs increase the CCA base — building up a larger deduction base that provides long-term benefits. Expensed soft costs reduce current-year income immediately.

**Practical rule:** For small renovation projects (under $50,000), simply tracking the construction period interest separately and ensuring it is deducted correctly is sufficient. For major construction or substantial renovation: flag for CPA review.

---

## 9.8 CCA on Rental Properties — The Strategic Analysis

### What Gets CCA

| Component | CCA Class | Rate | Notes |
|---|---|---|---|
| **Land** | N/A | ❌ 0% | Land never depreciates — never gets CCA |
| **Residential building** | **Class 1** | **4%** | Applied to building only, not land |
| **Commercial building (non-residential)** | **Class 1** | **4%** (or 6% if acquired after 2016) | |
| **Appliances (stove, fridge, dishwasher)** | **Class 8** | **20%** | Furnished rental units |
| **Furniture (furnished rental)** | **Class 8** | **20%** | Tables, beds, sofas in furnished units |
| **Parking lot paving** | **Class 17** | **8%** | Paved surface |
| **Building purchased after Nov 21, 2018** | **Class 1 Accelerated** | **4% + 3% bonus** | Temporary first-year enhanced rate |

### Separating Land and Building at Purchase — The Most Common CCA Error

When a rental property is purchased, only the **building** (not land) generates CCA. The purchase price must be allocated between land and building.

**Standard allocation method:** Use the proportions from the municipal property tax assessment.

*Example:* Sandra buys a rental house for $540,000. The city assessment shows: land value $162,000, building value $378,000 (70% building, 30% land).

Class 1 CCA base: **$378,000** (not $540,000)

Using the full purchase price as the CCA base overstates Class 1 by $162,000 × 4% = $6,480/year — a material error that inflates CCA deductions and creates recapture exposure.

### The CCA Loss Restriction — The Most Important Rental Rule

!!! danger "CCA cannot create or increase a net rental loss — no exceptions"
    **Net income before CCA** is the ceiling for CCA claims:

    - Net income before CCA = $4,800 → maximum CCA = $4,800 (brings income to $0)
    - Net income before CCA = $0 → CCA = $0 (already at zero, nothing to absorb)
    - Net income before CCA = ($3,200) (operating loss) → CCA = $0 (loss already exists — no CCA allowed)

    **Unused CCA is not lost** — the UCC simply doesn't decrease. In future years when operating income is higher, the full available CCA can be claimed.

    **Important:** Operating losses (current expenses exceeding gross income) ARE fully deductible against other income (employment, pensions, etc.). The CCA restriction applies only to CCA, not to operating losses from current expenses.

### The Strategic CCA Decision — The Analysis That Protects Clients

This is the planning question that separates professionals from data-entry preparers.

**The mechanism of recapture:**
Every dollar of CCA claimed reduces the building's UCC. When the property sells, the difference between the building's allocated proceeds and the remaining UCC is **recaptured CCA** — added to income at 100% (the full marginal rate). This is not a capital gain — it is regular income. The capital gains 50% inclusion doesn't help here.

**The time-value analysis:**

| Claim CCA | Don't Claim CCA |
|---|---|
| Receive a tax deduction now | No deduction now |
| Defer paying tax on that amount | Preserve the UCC |
| Pay recapture tax at sale (same dollar amount, full rate) | No recapture at sale on that amount |
| Benefit: time value of tax saved → invested returns | Benefit: larger UCC reduces gain at sale |

**When to claim CCA:**
- Client expects to be in a significantly lower tax bracket when the property sells
- Client plans to die holding the property (spousal rollover defers recapture)
- Client needs the cash from the tax savings now and will invest wisely
- Client holds the property in a corporation with different tax rates

**When NOT to claim CCA (the most common recommendation for individual rental property owners):**
- Client expects to sell at a relatively similar or higher income level
- Property may eventually qualify for principal residence exemption (any portion)
- Client doesn't need the current tax savings and won't invest them strategically
- The recapture exposure accumulates faster than the tax savings compound

!!! example "Case — Patricia's 10-Year CCA Decision"
    Patricia's rental house: building value at purchase $378,000 (Class 1, 4%).

    **Scenario A — Claim CCA every year:**
    Year 1: $378,000 × 4% × 50% (half-year) = $7,560. UCC: $370,440.
    Year 2: $370,440 × 4% = $14,818. UCC: $355,622.
    ... continuing for 10 years.
    Approximate remaining UCC after 10 years: $378,000 × (0.96)^10 ≈ **$253,000**
    Total CCA claimed: $378,000 − $253,000 = **$125,000**
    Annual tax savings at 37.16%: approximately $4,900/year for $49,000 total over 10 years.

    **At sale (Year 10), building proceeds = $650,000:**
    Building allocation (70%): $650,000 × 70% = $455,000
    Recapture: $455,000 > $378,000 original cost → capped at $378,000 − $253,000 = **$125,000 recapture**
    Recapture tax at 37.16%: **$46,450**

    Patricia "saved" $49,000 in tax deductions over 10 years but pays back $46,450 in one lump sum. Her net benefit from 10 years of CCA: approximately **$2,550 + time value of $49,000 invested for ~5 years average** = roughly $10,000–$15,000 in genuine financial benefit, assuming the savings were invested at 5–6%.

    **Scenario B — Claim no CCA:**
    No deductions during the holding period.
    No recapture at sale.
    Capital gain at sale: full appreciation taxed at 50% inclusion.
    Simpler. No year-end UCC tracking. No surprise recapture conversation at sale.

    **The professional conversation:** *"Patricia, here's the math. CCA on rental buildings is a deferral, not an elimination. You save approximately $5,000/year now and pay it back at sale. The real benefit is only the return you earn on those savings in the interim. If you'll invest the savings wisely — it's modestly beneficial. If you won't, there's an argument for not claiming it and keeping your life simpler at sale. What would you do with the annual tax savings?"*

!!! question "Quick Check — CCA on Rental Property"
    Robert owns a rental property. Original building cost: $320,000 (land value: $80,000, building value: $240,000). He has claimed CCA for 5 years totalling $28,800. The UCC is now $211,200. He sells the property for $480,000 (land $120,000, building $360,000). What is the recapture amount?

    ??? answer
        **Recapture occurs when proceeds of the building exceed the UCC.**
        Building proceeds: $360,000
        Building UCC: $211,200
        Recapture: $360,000 − $211,200 = **$148,800** — this is fully taxable as income (not a capital gain) at Line 13000.

        Additionally, the original building cost was $240,000. Proceeds are $360,000. Capital gain = $360,000 − $240,000 = $120,000 → taxable capital gain = $60,000.

        **This is why CCA on rentals is a deferral not an elimination** — Robert deducted $28,800 over 5 years but now faces $148,800 in recapture. The deferral benefit was the time value of money on those annual savings.

---

## 9.9 Recapture and Terminal Loss — The Disposition Consequences

### Recapture — When Building Proceeds Exceed Remaining UCC

**Formula:**
```
If Building Proceeds > Remaining UCC:

    Recapture = min(Building Proceeds, Original Building Cost) − Remaining UCC

    → Added to income as ordinary income (NOT capital gain)
    → Taxed at full marginal rate
    → Reported as rental income in the year of sale
```

**The capital gain is separate:**
Building proceeds above the original building cost are a capital gain (50% inclusion). Recapture and capital gain operate independently and are both reported in the year of sale.

!!! example "Case — Complete Recapture and Capital Gain Calculation"
    Robert bought a rental house in 2014:
    - Purchase price: $350,000
    - Land (30%): $105,000 ACB
    - Building (70%): $245,000 — Class 1 CCA base

    He claimed CCA for 11 years. Remaining UCC at sale in 2025: **$163,000**
    Total CCA claimed: $245,000 − $163,000 = $82,000

    He sells for $680,000 in 2025:
    - Land proceeds (30%): $680,000 × 30% = $204,000
    - Building proceeds (70%): $680,000 × 70% = $476,000

    **Recapture:**
    Building proceeds ($476,000) > Original building cost ($245,000) → recapture capped at original cost − UCC
    Recapture: $245,000 − $163,000 = **$82,000** → added to income, taxed at full rate

    **Capital gains:**
    Land gain: $204,000 − $105,000 = $99,000
    Building gain (above original cost): $476,000 − $245,000 = $231,000
    Total capital gain: $99,000 + $231,000 = $330,000
    Taxable capital gain (50%): **$165,000** → Line 12700

    **Robert's 2025 tax on the sale:**
    Recapture $82,000 at 38.16% combined rate: **$31,291**
    Capital gain $165,000 at ~38.16%: **$63,000**
    Ontario surtax on elevated income: ~$8,000–$12,000
    **Total tax on the sale: approximately $105,000–$110,000**

    Robert was stunned. He expected to net $330,000 in gains but pays $105,000 in tax. The recapture component alone — $31,291 — represents exactly the tax he "saved" over 11 years of CCA claims. If he hadn't claimed CCA: no recapture, slightly higher UCC, slightly different capital gain math — but no large lump-sum surprise.

### Terminal Loss — The Rare Good News at Sale

**Terminal loss** occurs when the building proceeds are less than the remaining UCC.

```
If Remaining UCC > Building Proceeds:

    Terminal Loss = Remaining UCC − Building Proceeds

    → Fully deductible against any income — no restriction
    → Reported in the year of sale
```

!!! example "Case — Terminal Loss in a Declining Market"
    Karen bought a rental condo in 2018 for $420,000. Building allocation (75%): $315,000 Class 1 base.
    She claimed minimal CCA — remaining UCC: $280,000.

    The condo market declined. She sells in 2025 for $340,000.
    Building proceeds (75%): $340,000 × 75% = $255,000

    Since $255,000 < $280,000 UCC:
    **Terminal loss: $280,000 − $255,000 = $25,000** → fully deductible as an income deduction

    Karen also has a capital loss on the overall sale:
    Total proceeds $340,000 − ACB $420,000 = ($80,000) capital loss → Schedule 3

    Terminal loss and capital loss are independent — both apply in the same year:
    - Terminal loss ($25,000): deducted against any income at full rate
    - Capital loss ($80,000): applied against capital gains only (carry-forward if no current gains)

!!! warning "Terminal loss is NOT available on Class 10.1 personal-use vehicles — only on rental/business buildings"
    This distinction from Week 8 is worth reinforcing. Class 1 rental buildings allow terminal losses. Class 10.1 vehicles (over $37,000 limit) do NOT allow terminal losses — the loss is simply forfeited. Always apply the right rule to the right asset class.

---

## 9.10 Change-in-Use Rules — The Principal Residence/Rental Crossover

### When a Principal Residence Becomes a Rental

Moving out of your home and starting to rent it triggers a **deemed disposition** at the property's fair market value — and the beginning of a new capital cost period for CCA purposes.

**What happens without an election:**
- Capital gain on appreciation from original cost to FMV at change-in-use: eligible for PRE for years it was actually a PR
- Going forward: the FMV at change-in-use becomes the new "cost" for CCA and capital gain purposes
- CCA can now be claimed on the building portion at the FMV-based cost

### The ITA 45(2) Election — Up to 4 Additional PRE Years

The Section 45(2) election allows a homeowner who starts renting their former principal residence to:
- **Continue designating the property as their principal residence** for up to 4 additional years after moving out
- Defer the deemed disposition until they actually sell
- Preserve the PRE for those additional years
- **Condition:** The owner must NOT claim CCA on the property during the election period

**How to make the election:** Attach a letter to the T1 return for the year the property's use changed, explicitly stating that you are electing under ITA Section 45(2).

!!! example "Case — The 45(2) Election That Saved $42,000"
    Maria bought a Toronto condo in 2014 for $340,000. She lived there until December 2020 (7 years). She began renting in January 2021 at $3,200/month. The condo's FMV in January 2021: $680,000. She sells in October 2025 for $860,000.

    **Ownership period:** 2014–2025 = 12 years.
    **Without the 45(2) election:**
    PR years: 2014–2020 = 7 years
    Exempt fraction: (1+7) ÷ 12 = 8/12 = 66.7%
    Capital gain: $860,000 − $340,000 = $520,000
    Taxable: $520,000 × (1 − 66.7%) = $173,160
    Taxable capital gain (50%): $86,580 → Line 12700
    Tax at 38.16%: approximately **$33,060**

    **With the 45(2) election (made January 2021, no CCA claimed):**
    Additional PR years: 2021, 2022, 2023, 2024 = 4 more years
    Total PR years: 2014–2024 = 11 years
    Exempt fraction: (1+11) ÷ 12 = 12/12 = **100% exempt**
    Capital gain: $520,000 → fully exempt
    Tax: **$0**

    **Saving from the election: $33,060** — for a letter attached to the 2021 return.

    **The critical condition:** Maria did NOT claim CCA during 2021–2025. If she had claimed even one year of CCA, the election would be disqualified (or never have been made in the first place), and the full tax would apply.

### Renting to Family Members — The Below-Market-Rent Problem

When a landlord rents to a family member at below-market rates, CRA applies special rules:

**CRA's position:** Expenses deductible on the T776 are limited to the rental income actually received. If market rent is $2,800/month but the landlord charges their son $1,000/month, expenses can only be deducted up to $12,000 (the $1,000 × 12 actually received) — not up to $33,600 (market rate × 12).

**No losses are deductible** when renting at below-market rates to non-arm's length persons. The rental is treated as a personal arrangement — not a commercial rental activity.

**The solution:** If a client wants both a family member as a tenant AND full deductibility — they must charge **fair market rent**. The family member can receive the rent reduction as a gift if desired — but the T776 must reflect fair market value transactions.

!!! example "Case — David Rents to His University-Aged Daughter"
    David owns a condo he bought for his daughter at university. He charges her $800/month (market rent: $2,400/month). His annual expenses: $28,000 (mortgage interest, condo fees, property taxes, insurance).

    **Income from daughter:** $800 × 12 = $9,600
    **Expenses:** $28,000
    **Net: ($18,400) loss**

    CRA's treatment: this is a personal arrangement, not a commercial rental. **Zero deductible losses.** David cannot offset his $65,000 employment income with this $18,400 rental loss.

    **Additionally:** The $9,600 in rent received may still be taxable as rental income — even though the losses aren't deductible. The income side is reportable; the expense deductions are restricted.

    **David's options:**
    1. Charge $2,400/month (market rent) — full deductibility, losses can shelter his employment income. His daughter gets the money from him as a gift or through other means.
    2. Accept that this is a personal arrangement with no tax benefit.

    **The planning conversation:** *"David, if you're charging below-market rent, the tax rules don't allow you to deduct the losses. The property is treated as a personal asset while it's below market. If you'd like the tax benefit of deductibility, you'd need to charge fair market rent — which your daughter would pay you, and you could help her separately as you see fit. Let's calculate what the difference would mean for your tax position."*

---

## 9.11 Co-Ownership and the Attribution Rules

### The Proportional Ownership Default

Each co-owner reports their proportionate share of rental income and expenses on their own T776. This is simple, defensible, and CRA's expected approach.

**Example:** Patricia and her husband David each own 50% of a rental house. Patricia's T776 shows 50% of income and 50% of expenses. David's T776 shows the other 50%.

### Unequal Allocations — When CRA Scrutinizes

Co-owners can agree to allocate income differently from ownership percentages, but only if:
- The allocation reflects each person's actual contribution (time, capital, management)
- It is not primarily motivated by income-splitting for tax purposes

**Practical reality:** CRA scrutinizes unequal allocations between spouses. A 90/10 split on a property where both are 50/50 owners, filed to concentrate income with the lower-income spouse, is a clear audit target. Document any departure from proportional ownership carefully.

### The Attribution Rules — Spousal Property Transfers

!!! danger "Gifting or lending money to a spouse to purchase rental property may attribute income back to the transferor"
    When Patricia gives David $200,000 to buy a rental property in his name:
    - CRA's attribution rules: rental income (and losses) from property acquired with transferred funds are attributed back to Patricia — the source of the funds
    - David's lower marginal rate provides no benefit — the income is taxed at Patricia's rate

    **How to break the attribution:**
    Option 1: David borrows the $200,000 from Patricia at the **CRA prescribed rate** (currently 4–5%) and actually pays interest annually. This breaks attribution — David retains the income.
    Option 2: David uses his own funds or a third-party mortgage.

    **Common error:** Many couples simply transfer funds between accounts for property purchases without understanding the attribution consequence. The T776 is filed in the recipient's name and CRA matches it against the family income picture. Professional review of co-ownership arrangements is essential.

---

## 9.12 The Basement Suite — Partial Rental in a Principal Residence

### The Allocation Method

Expenses must be allocated between the personal portion (principal residence) and the rental portion, based on floor area.

```
Rental percentage = Rental area ÷ Total home area
```

**Example:** 3,200 sq ft total home. Basement suite: 950 sq ft.
Rental %: 950 ÷ 3,200 = **29.7%**

| Expense | Total Annual | × 29.7% | Rental Portion |
|---|---|---|---|
| Mortgage interest | $22,000 | 29.7% | $6,534 |
| Property taxes | $7,000 | 29.7% | $2,079 |
| Insurance | $2,800 | 29.7% | $832 |
| Heat and electricity | $4,400 | 29.7% | $1,307 |
| Water | $800 | 29.7% | $238 |
| **Basement-direct (100%)** | | | |
| Basement maintenance | $520 | 100% | $520 |
| Tenant advertising | $0 | 100% | $0 |
| **Total deductible expenses** | | | **$11,510** |

### The PRE Decision — Should You Claim CCA on a Basement Suite?

This is the single most important planning point for basement suite landlords.

**CRA's administrative concession:** For residential homeowners renting a minor portion of their principal residence (typically under 33%), where:
1. The structural integrity of the unit remains part of the main dwelling
2. No CCA is claimed on the building
3. No major structural changes converted it to a separate legal dwelling

CRA will generally NOT apply the change-in-use rules. The entire home retains PRE protection.

**If CCA is claimed:** The rental portion is treated as having undergone a change in use. On sale, that portion of the capital gain (29.7% in our example) loses PRE protection.

**The math on a typical Ontario home:**
- Home purchased for $580,000, sold for $920,000 → $340,000 capital gain
- CCA claimed on 29.7% of building for 8 years: approximately $2,800/year = $22,400 total savings at 37.16%
- PRE lost on 29.7%: $340,000 × 29.7% = $100,980 × 50% = $50,490 taxable capital gain
- Tax on lost PRE: $50,490 × 37.16% = **$18,762** in additional capital gains tax at sale
- Plus recapture of $22,400 × 37.16% = $8,327
- **Total cost of claiming CCA: approximately $27,089**
- **CCA saved: $22,400**
- **Net loss from claiming CCA: $4,689**

The CCA almost never pays on a principal residence basement suite. The recommendation in virtually every situation: **do not claim CCA on the building.**

---

## 9.13 Multi-Unit Rental Buildings

When a client owns a rental building with multiple units (duplex, triplex, fourplex, apartment building), the T776 mechanics are the same but with some specific considerations.

### One T776 vs. Multiple T776s

**One T776** (aggregate approach): All units reported together on a single T776. One gross income line. One set of expenses. One CCA pool.

**Multiple T776s** (per property): One T776 per property address. Standard for separate properties at different addresses.

For a single multi-unit building at one address — one T776 is correct and simplest.

### The Land/Building Allocation on Multi-Unit Buildings

For larger residential buildings, the land/building split may differ from a single-family rental:

- **Small multi-unit (2–4 units):** Same approach as single-family — use municipal assessment proportions
- **Larger apartment buildings:** May have professional appraisal to establish the allocation at purchase

### Mixed-Use Buildings (Residential + Commercial)

When a building has both residential rental units and commercial space (retail on the ground floor, apartments above):

- The commercial portion and residential portion must be tracked separately
- Residential: Class 1, 4% CCA
- Commercial: Class 1, 4% (or 6% if acquired after 2016 without residential component)
- Expenses allocated between residential and commercial proportionally

For larger mixed-use buildings: recommend a CPA who specializes in real estate.

---

## 9.14 Ontario-Specific Rental Considerations

### Ontario Land Transfer Tax — Capital Cost, Not Current Expense

When purchasing a rental property in Ontario, the Land Transfer Tax (LTT) is paid on closing. This is a **capital cost** — it is added to the ACB of the property, not deducted as a current rental expense.

In Toronto: an additional **Municipal Land Transfer Tax** also applies.

**Example:** Sandra buys a rental property in Toronto for $680,000.
Ontario LTT: approximately $11,475
Toronto MLTT: approximately $11,225
Total: $22,700 → **added to ACB** ($680,000 + $22,700 = $702,700 total ACB for capital gain purposes)

### Ontario Property Tax — Fully Deductible on T776

All Ontario property taxes — municipal tax, education levy, and any supplementary taxes — are deductible on the T776 for the rental property. This is one of the largest current deductions available.

**Double-claiming trap:** If a client owns a home with a rental suite, they may be tempted to claim the rental portion of property taxes on BOTH the T776 (current expense) AND the ON-BEN (Ontario Trillium Benefit). They cannot do both. The rental portion deducted on T776 is not eligible for ON-BEN credit. Only the personal-use portion of the property taxes is eligible for OEPTC through ON-BEN.

### HST on Residential Rental — The Exempt Supply Rule

Long-term residential rentals (tenancy agreements of more than 30 consecutive days) are **exempt supplies** for GST/HST purposes:
- No HST is charged on rent
- No Input Tax Credits are available for expenses incurred to earn exempt rental income

This means: if Patricia pays $2,600 in professional fees to manage her residential rental and pays $338 in HST on those fees — she **cannot claim** the $338 as an ITC. The HST becomes part of the deductible expense ($2,938 total deducted rather than $2,600 + $338 separately).

**Short-term exception:** Rentals under 30 consecutive days are taxable supplies. Operators over $30,000 must register and charge HST.

### New Residential Rental Property Rebate

When a newly constructed residential rental property is purchased from a builder, the buyer may qualify for a **New Residential Rental Property (NRRP) Rebate** — returning a portion of the HST paid on the purchase.

**Eligibility:** The property must be used as a long-term rental from the date of purchase. The rebate is approximately 36% of the federal HST portion paid on properties up to a certain value.

This is a significant tax recovery on a new build: on a $750,000 new condo, the HST paid is approximately $97,500. The NRRP rebate might recover $24,000–$36,000.

If a client purchased a new rental property in the past 2 years and hasn't claimed this rebate — there's a recovery opportunity. Flag it immediately.

### The Rental Income and Ontario Surtax

For clients with significant rental income pushing their net income above the Ontario surtax thresholds (~$90,000+), rental income has the same surtax interaction as employment income. Every dollar of rental deduction — whether from current expenses, CCA, or mortgage interest — reduces Ontario basic tax, potentially eliminating some surtax exposure. At these income levels, a $10,000 rental deduction saves approximately $10,000 × 37.16% + additional surtax reduction = effectively 40%+ in combined savings.

---

## 9.15 The Rental Income Audit Triggers

These eight patterns generate the most CRA reviews of rental returns. Each one should be part of your standard review checklist.

### Trigger 1 — Capital Improvements Claimed as Current Expenses

The most consistently targeted issue. Roof replacements, kitchen renovations, flooring upgrades claimed as "repairs." CRA's reviewers look for single large repair invoices, building permits on file with the municipality, and the scope of work described in contractor invoices. A $35,000 "repair" that includes new cabinets and flooring is a capital improvement.

### Trigger 2 — 100% of Home Expenses Claimed on a Principal Residence Rental

When a client rents a basement suite and deducts 100% of mortgage interest, taxes, utilities — without the required proportional allocation. Immediately obvious in the numbers.

### Trigger 3 — Chronic Rental Losses Used to Shelter Employment Income

Three or more consecutive years of net rental losses where rents appear deliberately set below market. CRA applies the "reasonable expectation of profit" analysis to rental income in certain cases — particularly where the rental appears designed more for loss generation than profit.

### Trigger 4 — Mortgage Interest on a Refinanced Mortgage with Personal-Use Proceeds

Claiming 100% of interest on a mortgage that was refinanced and partly used for personal purposes. CRA's tracing rules are clear — only the income-earning portion is deductible.

### Trigger 5 — Revenue Not Matching Bank Deposits

Cash rental income is particularly vulnerable. CRA compares declared rental income to bank deposit patterns and property registry records. A landlord with a 3-unit building declaring $24,000 in annual rent (suggesting $667/unit/month) in an area where market rent is $1,800/unit is an obvious discrepancy.

### Trigger 6 — Missing Recapture on Property Sale

The rental property is sold, the T776 is discontinued, but no recapture income is reported in the year of sale. CRA identifies this through property transfer records. Missing recapture is one of the highest-value audit recoveries for CRA.

### Trigger 7 — Renting to Family at Below-Market Rates and Claiming Losses

A clearly below-market rental to a family member (son, daughter, sibling) combined with a claimed rental loss. CRA is acutely aware that this is a common tax-planning attempt. If the rent doesn't approximate market value, the losses are not deductible.

### Trigger 8 — Personal Condo Rental Portion Overstated

Clients who rent their vacation property or a second home "sometimes" but claim it as a full rental property with 100% business expenses. Particularly for Muskoka cottages or Florida condos claimed as rentals but used primarily personally.

!!! tip "In your tax software"
    **Software calculates automatically:**
    - Net rental income flowing from T776 to Line 12600 on the T1
    - CCA deduction within the T776 once UCC and class are entered
    - Recapture at Line 13000 when building proceeds exceed UCC (you must flag the disposition)

    **You must verify or enter manually:**
    - Land vs. building split — software requires separate entries; use the municipal property tax assessment ratio as the starting point
    - CCA class selection (Class 1 for most residential buildings at 4%; Class 3 for older buildings)
    - Whether CCA should be claimed at all — software will claim maximum CCA unless you override; for properties the client will sell, consider skipping CCA to avoid recapture
    - Rental-use percentage for partially personal properties — software applies what you enter; you must determine the defensible percentage
    - One T776 per property — software allows multiple T776s; create a separate one for each rental address

---

## 9.16 Complete Case Studies

### Case A — Patricia's Long-Term Rental: Year 1 Through Sale

**Background:** Patricia bought a rental house in Hamilton in 2015 for $380,000. Municipal assessment: 25% land ($95,000), 75% building ($285,000).

**Year 1 (2015) T776:**
Gross rent: $22,800 ($1,900/month)

| Current Expense | Amount |
|---|---|
| Mortgage interest | $14,200 |
| Property taxes | $4,800 |
| Insurance | $1,650 |
| Utilities (included in rent) | $3,900 |
| Repairs (fixing deck boards, window seals) | $840 |
| Accounting | $250 |
| **Total current expenses** | **$25,640** |

Net income before CCA: $22,800 − $25,640 = **($2,840) — operating loss**

Since there is already an operating loss before CCA: **CCA = $0** (CCA cannot increase a rental loss)

Year 1 rental loss: **($2,840) → Line 12600** — deductible against Patricia's employment income

**Year 6 (2020) — Property now profitable:**
Rent increased to $2,600/month = $31,200

| Current Expense | Amount |
|---|---|
| Mortgage interest (10 years in, less interest) | $10,400 |
| Property taxes | $5,200 |
| Insurance | $1,800 |
| Utilities | $4,200 |
| Repairs and maintenance | $1,600 |
| **Total current expenses** | **$23,200** |

Net income before CCA: $31,200 − $23,200 = **$8,000**

CCA available: $285,000 × 4% = $11,400 (full rate, past half-year year). But limited to $8,000.
**CCA claimed: $8,000** (brings income to $0)

Patricia has been claiming CCA to zero since Year 3. By Year 10 (2025):
Approximate remaining UCC: $285,000 × (0.96)^10 approx. adjusting for partial claims early years: roughly **$200,000**
Total CCA claimed: approximately $85,000

**2025 Sale for $720,000:**
Land (25%): $180,000
Building (75%): $540,000

Recapture: $540,000 > $285,000 original building cost.
Capped at: $285,000 − $200,000 = **$85,000 recapture** → regular income, 100% taxable
Capital gain: Land $180,000 − $95,000 = $85,000. Building $540,000 − $285,000 = $255,000. Total $340,000.
Taxable capital gain (50%): **$170,000**

**Patricia's year-of-sale tax:**
Recapture $85,000 × 37.16% = $31,586
Capital gain $170,000 × 37.16% = $63,172
Ontario surtax: ~$9,000
**Approximately $104,000 in total tax on the sale.**

---

### Case B — Ahmed's Basement Suite: Optimal T776

**Background:** Ahmed owns a 2,600 sq ft semi-detached in Brampton purchased for $680,000 in 2019. He finished the basement and has rented it since 2021. Basement: 800 sq ft = 30.8%.

**2025 T776:**
Gross rental income: $1,350/month × 12 = **$16,200**

| Expense | Total Annual | × 30.8% | Rental Portion |
|---|---|---|---|
| Mortgage interest | $26,400 | 30.8% | $8,131 |
| Property taxes | $7,800 | 30.8% | $2,402 |
| Insurance | $3,200 | 30.8% | $986 |
| Heat and electricity | $5,400 | 30.8% | $1,663 |
| Water | $1,200 | 30.8% | $370 |
| **Direct basement costs (100%)** | | | |
| Basement maintenance | $620 | 100% | $620 |
| Tenant advertising | $80 | 100% | $80 |
| **Total deductible expenses** | | | **$14,252** |

**Net rental income before CCA:** $16,200 − $14,252 = **$1,948**

**CCA decision:** Ahmed's home is his principal residence. Building value at purchase: $680,000 × 70% (building) = $476,000. Annual available CCA on 30.8%: $476,000 × 30.8% × 4% = $5,867. But the PRE cost on eventual sale is far greater.

**Recommendation: $0 CCA claimed.** Protecting the full PRE on a property that has already appreciated from $680,000 to approximately $900,000 (2025 FMV) is worth far more than $1,948/year in CCA deductions.

**Net rental income: $1,948 → Line 12600**

Ahmed rents the basement for $16,200/year and pays tax on only $1,948 — an effective rate of only 12% of gross rental income — because his mortgage interest, property taxes, and utilities appropriately shelter most of the income.

---

### Case C — Sandra's Condo Rental: The 45(2) Election in Action

**Background:** Sandra bought a Mississauga condo in 2013 for $295,000. She lived there until July 2020. She began renting it at $2,800/month from August 2020. She made the 45(2) election immediately in August 2020 and has claimed no CCA. She sells in September 2025 for $710,000.

**Ownership: 2013 to September 2025 = 13 years (2013, 2014...2025)**
**Without election:** PR years = 2013 to July 2020 = 8 years
**With 45(2) election (no CCA claimed):** Additional 4 years: 2020, 2021, 2022, 2023

Total PR years with election: 2013–2023 = 11 years
Exempt fraction: (1 + 11) ÷ 13 = 12/13 = **92.3%**

Capital gain: $710,000 − $295,000 = $415,000
Exempt portion: $415,000 × 92.3% = $382,945
**Taxable portion: $415,000 × 7.7% = $31,955**
Taxable capital gain (50%): **$15,978 → Schedule 3**

**Without the election:**
Exempt fraction: (1 + 8) ÷ 13 = 9/13 = 69.2%
Taxable: $415,000 × 30.8% = $127,820. Taxable capital gain: $63,910.
Tax at 37.16%: **$23,749**

**With the election:** tax on $15,978 × 37.16% = **$5,937**

**Tax saving from the 45(2) election: $23,749 − $5,937 = $17,812** — from a letter attached to the 2020 return.

---

## 9.17 The Rental Property Intake Checklist

### Documents to Collect

- [ ] Complete rental income records: leases, rent receipts, bank statements for rental account
- [ ] Annual mortgage statement — showing interest paid vs. principal repayment (NOT the full mortgage payment)
- [ ] Property tax bill — annual amount, confirming full year if acquired mid-year
- [ ] Insurance certificate with annual premium
- [ ] All repair and maintenance invoices — with detailed descriptions (CRA may request)
- [ ] Capital improvement receipts — separate from repairs (will add to ACB and/or UCC)
- [ ] Property management company annual statement
- [ ] Prior year T776 and NOA — for UCC carryforward and loss carryforward amounts
- [ ] Original purchase records — land/building allocation from assessment or appraisal
- [ ] If sold: copy of sale agreement, lawyer's statement of adjustments

### Questions to Ask Every Rental Client

1. "What was your total gross rent received this year, including any last-month deposits taken and any parking or storage fees?"
2. "Did any tenants leave or forfeit a damage deposit this year?"
3. "What was your total mortgage payment, and do you have a statement showing the interest vs. principal breakdown?"
4. "Was the mortgage refinanced at any point? What was the additional borrowing used for?"
5. "What repairs or maintenance work did you do? Were any of these major improvements that added lasting value?"
6. "Is this a former principal residence? When did you stop living there, and did you make a 45(2) election?"
7. "Do you rent any part of your own home? What percentage is the rental area?"
8. "Are you co-owning with a spouse or partner? What is the ownership split, and how was it funded?"
9. "Did you sell, transfer, or change the use of any rental property this year?"
10. "Are you renting to any family members? Are you charging market rent?"

---

## 9.18 Week 9 Summary

!!! success "What you learned this week"
    - **Rental (T776) vs. Business (T2125):** Service-level test. Long-term residential = T776. Airbnb with services = T2125. Short-term under 30 days = taxable supply for HST. The classification affects CCA loss restriction, expense eligibility, and HST
    - **T776 flow:** Gross income → current expenses → net before CCA → CCA (limited) → net income at Line 12600
    - **Rental income sources:** All rent, forfeited deposits, lease cancellations, parking, government subsidies. Last month's deposit: CRA says report when received; consistent treatment is key
    - **Mortgage interest:** Only the interest portion, not principal. Tracing rules: if a refinanced mortgage proceeds were used personally, that portion is non-deductible — permanently. This rule costs clients thousands in lost deductions from one poorly planned refinancing
    - **Current vs. capital:** The most consequential T776 judgment. Restore to original = current. Improve beyond original = capital. Sarah's $34,000 renovation: $11,220 current, $22,780 capital
    - **CCA loss restriction:** Absolute. CCA cannot create or increase a rental loss. Operating losses from current expenses ARE deductible against all other income
    - **CCA strategic decision:** Every CCA dollar claimed creates recapture income at sale — taxed at 100% (not 50% capital gains rate). The benefit is time-value only. For most principal residence landlords: do not claim CCA
    - **Recapture:** Building proceeds above remaining UCC (capped at original building cost) = recapture income. Patricia's sale: $82,000 recapture, $31,000 in tax — exactly the tax she "saved" over 10 years of CCA claims
    - **Terminal loss:** Building proceeds below remaining UCC = terminal loss, fully deductible. Available on Class 1 buildings. Not available on Class 10.1 vehicles
    - **45(2) election:** Former principal residence can be designated as PR for up to 4 additional rental years — IF no CCA is claimed. Sandra's case: $17,812 saved from a letter in 2020. The most underused planning tool for landlords
    - **Below-market rent to family:** Losses not deductible. Expenses limited to income received. Must charge market rent for full deductibility
    - **Basement suite:** Allocate by floor area. Do not claim CCA on building — the PRE math always favours protecting the exemption over CCA savings
    - **Co-ownership:** Default is proportional. Attribution rules apply to spousal transfers without interest at prescribed rate
    - **Ontario:** LTT adds to ACB (not current expense). Residential rent is HST-exempt — no ITCs. New Residential Rental Property Rebate recovers significant HST on new-build purchases. Do not double-claim rental property taxes on both T776 and ON-BEN

---

## ✅ Week 9 Quiz

When you're ready, ask Claude: **"Quiz me on Week 9"** for an interactive test.

??? question "1. Patricia's rental house had gross rent of $28,800. Current expenses total $23,400. Available Class 1 CCA (4% on UCC of $210,000) = $8,400. What is the maximum CCA she can claim, what is her net rental income, and what is the UCC opening balance for next year?"
    Net income before CCA: $28,800 − $23,400 = **$5,400.** Available CCA: $8,400. But CCA is capped at net income before CCA — it cannot create a rental loss. **Maximum CCA: $5,400.** Net rental income: $5,400 − $5,400 = **$0 → Line 12600.** The remaining $3,000 of potential CCA ($8,400 − $5,400) is simply not claimed this year. Opening UCC for next year: $210,000 − $5,400 = **$204,600.** The unclaimed $3,000 in CCA doesn't disappear — the UCC simply reflects only the CCA actually claimed. Next year's available CCA will be $204,600 × 4% = $8,184.

??? question "2. David bought his rental property for $480,000 with a $320,000 mortgage. Five years later he refinanced to $440,000. He used the extra $120,000 for: (a) $60,000 to renovate the rental property, and (b) $60,000 to buy a personal vacation. How much of the annual mortgage interest is deductible?"
    CRA's tracing rules apply. Interest is deductible to the extent borrowed money was used to earn income. The original $320,000 was used to acquire the rental property → fully deductible. Of the additional $120,000: $60,000 was used for rental renovations (income-earning purpose) → deductible. $60,000 was used for a personal vacation (personal purpose) → **NOT deductible.** Total deductible mortgage principal: $320,000 + $60,000 = **$380,000.** Non-deductible portion: $60,000. If the mortgage rate is 5.5%, annual interest is approximately $24,200 total. Deductible portion: $380,000/$440,000 × $24,200 = **$20,900.** Non-deductible: $60,000/$440,000 × $24,200 = **$3,300/year permanently forfeited** — from one personal spending decision.

??? question "3. A client bought a rental property for $560,000 (land 30%, building 70%). He claimed CCA for 12 years, leaving a remaining UCC of $182,000. He sells for $740,000. Calculate: (a) land/building allocation of proceeds, (b) recapture amount, (c) capital gain on both land and building, and (d) the tax treatment of each."
    **(a) Proceeds allocation:** Land (30%): $740,000 × 30% = $222,000. Building (70%): $740,000 × 70% = $518,000. **(b) Recapture:** Original building cost: $560,000 × 70% = $392,000. Building proceeds ($518,000) > original building cost ($392,000) → recapture capped at original − UCC: $392,000 − $182,000 = **$210,000 recapture** → 100% taxable as regular income. **(c) Capital gains:** Land: $222,000 − $168,000 (30% × $560,000) = **$54,000 capital gain.** Building above original cost: $518,000 − $392,000 = **$126,000 capital gain.** Total capital gain: $180,000. **(d) Tax treatment:** Recapture $210,000: added to rental income, taxed at full marginal rate — treated like employment income. Capital gain $180,000: 50% included = $90,000 → Line 12700, taxed at the marginal rate on the $90,000 taxable portion only. The recapture is the more heavily taxed component — it reflects the CCA deductions the client took over 12 years being "repaid" at sale.

??? question "4. Sandra moved out of her condo in January 2021 and started renting it. The condo was worth $620,000 in January 2021 and she bought it in 2014 for $310,000. She made the 45(2) election and claimed no CCA. She sells in December 2025 for $790,000. Calculate her exempt fraction, taxable capital gain, and the tax saving from the election."
    **Ownership: 2014–2025 = 12 years.** PR years without election: 2014–2020 = 7 years. With 45(2) election: additional 4 years (2021–2024). Total PR years: 2014–2024 = 11 years. **Exempt fraction: (1 + 11) ÷ 12 = 12/12 = 100% exempt.** Capital gain: $790,000 − $310,000 = $480,000. Taxable capital gain: **$0** — fully exempt. **Without the election:** PR years: 7. Exempt fraction: (1+7)÷12 = 8/12 = 66.7%. Taxable: $480,000 × 33.3% = $159,840. Taxable CG (50%): $79,920. Tax at 37.16%: **$29,703.** **Saving from the 45(2) election: $29,703** — from attaching a single letter to the 2021 return and not claiming CCA during the rental period.

??? question "5. Kevin rents his basement suite (28% of total home) to his daughter at $750/month. Market rent for the space would be $1,900/month. His total home expenses are $32,000. Can he deduct a rental loss? What are his options?"
    **No — Kevin cannot deduct a rental loss.** When a landlord rents to a non-arm's length person (his daughter) at below-market rates, CRA restricts deductible expenses to the income actually received. Kevin received $9,000 ($750 × 12). His expenses are $32,000 × 28% = $8,960. His "net income" appears to be $40 — but he cannot create a loss by claiming more than the income from this arrangement. The below-market rent removes the commercial nature of the rental. **Kevin's options:** (1) **Charge market rent ($1,900/month):** Full deductibility — expenses of $8,960 vs. income of $22,800 = $13,840 net rental income, taxable. Kevin could give his daughter a separate cash gift to help with rent if desired. (2) **Accept it's a personal arrangement:** No T776, no deductions, no income to declare (if truly just a family arrangement). (3) **Continue at $750 but claim only to zero:** Gross income $9,000 minus expenses (limited to $9,000) = $0 net income. No loss deductible. Kevin gets minimal tax benefit.

??? question "6. Helen owns a rental property and her husband David wants to take over 50% ownership by using $180,000 that Helen gives him. Helen is in the 43.41% combined rate and David is at 20.05%. Will the income-splitting benefit work? What would make it work?"
    **No — the attribution rules will prevent income-splitting.** When Helen gives David $180,000 to purchase a 50% interest in the rental property, CRA's attribution rules apply: income from property acquired using transferred funds is attributed back to the transferor (Helen). David's 50% rental income will be taxed at Helen's 43.41% rate — the income-splitting objective fails. **What would make it work:** Option 1 — David borrows the $180,000 from Helen at the CRA prescribed rate (currently 4–5%) and actually pays Helen interest each year. This breaks attribution — David's income stays in his hands at 20.05%. Helen includes the interest received as income (small amount). The net saving: ($180,000 × rental yield − $180,000 × 4% interest to Helen) × (43.41% − 20.05%) = meaningful annual saving. Option 2 — David uses his own funds or a third-party mortgage to fund his 50% interest. Option 3 — Helen and David purchase the property together from the beginning, each funding their own half from their own resources.

??? question "7. A new client tells you he received the New Residential Rental Property Rebate when he bought a new condo for rental purposes in 2022 — but his prior preparer never filed for it. The HST paid was $87,000. He bought the condo as a rental from day one, still rents it, and is within the 2-year filing window. What is this rebate, what is it worth approximately, and what do you do?"
    The **New Residential Rental Property (NRRP) Rebate** allows purchasers of newly constructed residential rental properties to recover a portion of the HST paid on acquisition — specifically the 36% federal rebate portion. The rebate is available when: (1) the property is a new build purchased from a builder, (2) it is used as a long-term residential rental immediately, (3) the purchaser is an individual and the unit will be someone's primary place of residence. **Approximate value:** On $87,000 HST paid (assuming this represents the 13% Ontario HST on roughly $669,000 building value): the federal portion is 5/13 × $87,000 = $33,462. The NRRP rebate: 36% × $33,462 = approximately **$12,046.** The Ontario portion of HST may also have a provincial rebate component — verify with CRA's NRRP guide. **Action:** File a GST190 form (application for NRRP rebate) as soon as possible. The filing deadline is **2 years from the closing date** — if it's within the window, file immediately. If the 2-year window has just passed, there may be a taxpayer relief application available in specific circumstances. This is potentially $12,000+ in recoverable money the prior preparer missed — a high-value catch that demonstrates professional competence.

---

## 📚 Further Reading

- [CRA: Rental income guide — T4036](https://www.canada.ca/en/revenue-agency/services/forms-publications/publications/t4036.html)
- [CRA: T776 — Statement of Real Estate Rentals](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t776.html)
- [CRA: Current expenses vs. capital expenditures](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/business-expenses/current-capital-expenses.html)
- [CRA: Principal residence — change in use (ITA 45)](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12700-taxable-capital-gains/principal-residence-other-real-estate/changes-use.html)
- [CRA: Co-ownership rental property](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12600-net-rental-income/co-ownership-rental-property.html)
- [CRA: Recapture and terminal loss](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/sole-proprietorships-partnerships/report-business-income-expenses/claiming-capital-cost-allowance/recapture-terminal-loss.html)
- [CRA: Mortgage interest deductibility — IT-533](https://www.canada.ca/en/revenue-agency/services/tax/technical-information/income-tax/income-tax-folios-index/series-3-property-income-deemed-income-inclusions-modifications/series-3-property-income-deemed-income-inclusions-modifications-folio-6-interest/income-tax-folio-s3-f6-c1-interest-deductibility.html)
- [CRA: New Residential Rental Property Rebate (GST190)](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/gst190.html)

---

!!! tip "Up Next: Week 10"
    **Phase 2 Review and Integration** — You have now built the complete income-types foundation: employment (T4), investment income (T5/T3), capital gains (Schedule 3), self-employment (T2125), and rental income (T776). Week 10 consolidates all five income types through a demanding multi-source client simulation, a complete dual-return calculation for a married couple, instalment planning, a 15-question comprehensive Phase 2 quiz, and the readiness checklist that confirms you're ready to move into Phase 3 — the deductions and credits that reduce all this taxable income.
