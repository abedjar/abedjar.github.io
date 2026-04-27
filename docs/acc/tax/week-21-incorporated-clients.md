# Week 21: Incorporated Clients — The Personal Side of Corporate Tax

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Explain why people incorporate and what changes on their personal T1 as a result
    - Distinguish between your role (T1 personal return) and a corporate accountant's role (T2 corporate return)
    - Handle dividends paid from a corporation to a shareholder-employee on the personal return
    - Handle management fees and salaries paid from a corporation correctly on both sides
    - Apply the salary vs. dividend decision framework to a shareholder's compensation
    - Understand the Lifetime Capital Gains Exemption (LCGE) and when it appears on the T1
    - Handle shareholder loans — the rules, the risks, and the consequences of getting it wrong
    - Prepare the T1 for a shareholder-employee confidently and identify when to refer to a CPA
    - Identify the Ontario-specific considerations for business owners with corporations

!!! tip "Why incorporated clients are your highest-value T1 clients"
    A typical employee T1 takes 30–45 minutes and earns you $150–$200. A shareholder-employee T1 — with salary, dividends, shareholder loans, RRSP optimization, and family income splitting — takes 90 minutes and earns you $400–$800. They require the same software and the same filing system. The only difference is knowledge. This week gives you that knowledge. More importantly: incorporated business owners are surrounded by other incorporated business owners. One well-served client in that world generates referrals that build careers.

!!! warning "Know your lane — T1 vs. T2"
    As a personal tax preparer, your job is the **T1 personal return** for the shareholder. The **T2 corporate return** is a completely separate filing prepared by a CPA or bookkeeper. You need to understand how the corporation affects the personal return — but you are not preparing the T2. This week teaches you exactly what you need to know to serve the personal side without overstepping into corporate tax territory.

---

## 21.1 Why People Incorporate — The Tax Logic in Plain Language

When a self-employed person earns $120,000 net, they pay personal tax at Ontario's combined rate of approximately 37–43%. The money goes: earn → pay personal tax → keep what's left.

When a corporation earns $120,000, the corporation pays the **small business corporate tax rate** of approximately **12.2% in Ontario** (combined federal 9% + Ontario 3.2% for active business income up to the $500,000 small business deduction limit). The money goes: earn → corporation pays 12.2% → what remains can be left in the corporation to invest and grow, or paid out to the shareholder as salary or dividends.

The **tax deferral** is the primary benefit:

```
SELF-EMPLOYED:
$120,000 income → pay ~37% personal tax → keep ~$75,600

INCORPORATED:
$120,000 income → corporation pays 12.2% → $105,360 remains in corporation
Pay personal tax only when money is taken out as salary or dividends
"Deferral benefit": $105,360 − $75,600 = ~$29,760 stays invested longer
```

The corporation doesn't eliminate tax — it **defers** personal tax on income the shareholder leaves inside the corporation. When cash is eventually extracted, personal tax is paid. But the extra years of tax-sheltered compounding inside the corporation create real wealth.

### The Three Ways Money Comes Out of a Corporation onto the T1

| Extraction Method | Tax Treatment on T1 | Slip | Line |
|---|---|---|---|
| **Salary** | Employment income | T4 Box 14 | 10100 |
| **Dividends** | Eligible or non-eligible dividends (grossed up) | T5 Box 10/11/24/25 | 12000 |
| **Shareholder loan repayment** | May be income — see Section 21.5 | T4A sometimes | Various |

Everything the shareholder receives from their corporation flows through one of these three channels. Your job is to handle each correctly on the T1.

---

## 21.2 The Salary Channel — T4 From Your Own Company

When a shareholder-employee pays themselves a salary, the corporation:
- Issues a **T4** just like any employer
- Deducts CPP and income tax at source (EI is optional — owner-operators often opt out)
- Deducts the salary as a corporate expense (reduces corporate income and corporate tax)

### What This Looks Like on the T1

The T4 from the owner's corporation is treated **identically** to a T4 from any employer. Box 14 goes on Line 10100. Box 22 goes on Line 43700. Box 16 goes on Schedule 8 / Line 30800.

There is nothing unusual about a shareholder's T4 on the personal return.

!!! tip "Owner-operators and CPP — a planning opportunity"
    Most shareholder-employees choose to pay CPP on their salary (it builds CPP entitlement for retirement). However, owner-operators who are also **sole directors** of a corporation can elect to **exempt themselves from CPP** if they control the corporation. This saves the combined employer + employee CPP contributions (approximately 11.9% on earnings above $3,500). Many choose to continue paying CPP for the retirement benefit it provides — but knowing the option exists is important for the planning conversation.

!!! example "Case — Patricia's T4 From Her Own Corporation"
    Patricia incorporated her consulting business 3 years ago. Her corporation paid her a salary of $85,000 in 2025. The corporation issued a T4:
    - Box 14: $85,000
    - Box 22: $18,200 (income tax withheld)
    - Box 16: $3,867 (CPP withheld — employee share)
    - Box 18: $0 (Patricia opted out of EI as a controlling shareholder)

    **On Patricia's T1:** Exactly the same as any other employee. The fact that it came from her own corporation is irrelevant to the personal return.

    **What the corporation does with the salary:**
    The $85,000 salary (plus $3,867 employer CPP match) is deducted as a business expense. If the corporation earned $120,000 before this salary:
    $120,000 − $88,867 (salary + employer CPP) = $31,133 remaining in corporation.
    Corporate tax at 12.2%: $3,798.
    Patricia paid personal tax on $85,000. The remaining $27,335 stays in the corporation.

---

!!! question "Quick Check"
    Patricia paid herself $85,000 in salary from her corporation and also received a $45,000 non-eligible dividend from the corporation. What amounts appear on her T1, on which lines, and what is the grossed-up dividend amount reported on Line 12000?

??? answer
    **Line 10100 (employment income):** $85,000 — from the T4 issued by the corporation. Treated identically to any employer T4.

    **Line 12000 (taxable dividends):** Non-eligible dividends are grossed up by 15%.
    $45,000 × 1.15 = **$51,750** → Line 12000
    (T5 Box 25 will already show this grossed-up amount of $51,750)

    **Line 40425 (Dividend Tax Credit):**
    $51,750 × 9.0301% = **$4,673** → applied against federal tax

    **Total T1 income: $85,000 + $51,750 = $136,750**

    Patricia received $130,000 in cash but reports $136,750. The $6,750 gross-up represents the pre-tax corporate income — as if she had earned it personally and the corporation paid tax on it. The DTC of $4,673 partially compensates for the corporate tax already paid, preventing full double-taxation. This is the integration mechanism in action.

---

## 21.3 The Dividend Channel — T5 From Your Own Corporation

Dividends are distributions of **after-tax corporate profits** to shareholders. They appear on the shareholder's T1 as investment income — not employment income. This distinction has massive implications:

| Feature | Salary | Dividend |
|---|---|---|
| **CPP** | Yes — both halves for self-employed | ❌ No CPP obligations |
| **RRSP room** | Builds RRSP contribution room | ❌ Does NOT build RRSP room |
| **Employment income credits** | Canada Employment Amount, employment expenses | ❌ None available |
| **Tax treatment** | Full inclusion, top personal rates | Gross-up + DTC mechanism |
| **Corporate deduction** | Yes — reduces corporate income | ❌ No — paid from after-tax profits |

### Types of Dividends From a Corporation

| Dividend Type | Source | T5 Box | Gross-Up | DTC Rate |
|---|---|---|---|---|
| **Eligible** | Large corporations, CCPC that paid general corporate tax rate | Box 10/11/12 | 38% | 15.0198% |
| **Non-eligible** | CCPC that benefited from small business deduction | Box 24/25/26 | 15% | 9.0301% |

Most owner-operated Canadian small businesses (CCPCs using the Small Business Deduction) pay **non-eligible dividends**. The calculation:

```
Actual dividend received (Box 24 on T5)
    × 1.15 (gross-up)
= Taxable dividend amount (Box 25 on T5) → Line 12000
    × 9.0301% = Dividend Tax Credit → Line 40425
```

!!! example "Case — Robert's $40,000 Non-Eligible Dividend"
    Robert's corporation paid him a $40,000 dividend (non-eligible). His T5:
    - Box 24 (actual amount): $40,000
    - Box 25 (taxable amount, grossed-up): $40,000 × 1.15 = **$46,000** → Line 12000
    - Box 26 (DTC): $46,000 × 9.0301% = **$4,154** → Line 40425

    Robert received $40,000 in cash but reports $46,000 as income. The extra $6,000 "gross-up" represents the pre-tax corporate income — as if he earned the income personally and then paid corporate tax on it.

    The $4,154 DTC reduces his federal tax to offset the corporate tax already paid.

    **Combined federal + Ontario effective rate on the $40,000 actual dividend:**
    At Robert's income level (~$95,000 total): approximately 25–28% effective rate on the actual dividend received.

    Compare: if he had paid himself $40,000 in salary at the same income level: approximately 29.65% combined rate.

    **Dividend is slightly cheaper tax-wise** — but he sacrificed RRSP room and CPP contributions on this portion.

---

## 21.4 The Salary vs. Dividend Decision — The Core Planning Question

Every incorporated business owner faces this decision annually: **Pay myself salary, dividends, or a combination?**

This is the most common planning question you will discuss with incorporated clients. There is no universal right answer — it depends on the client's specific situation. But there is a clear framework.

### When Salary Is Better

=== "RRSP Room"

    Only earned income (from salary or self-employment) generates RRSP contribution room. Dividends generate zero RRSP room.

    **A shareholder who pays themselves only dividends accumulates no RRSP room** — potentially leaving years of tax-sheltered retirement savings on the table.

    **Rule of thumb:** Pay at least enough salary to generate the desired RRSP contribution room.

    **Formula:** Desired RRSP contribution ÷ 18% = Required salary income

    **Example:** If the client wants to contribute $20,000 to an RRSP:
    Required salary: $20,000 ÷ 18% = **$111,111 in salary income needed**

=== "CPP Benefits"

    CPP contributions build the client's future CPP retirement benefit. A business owner who pays only dividends for 30 years will receive little or no CPP in retirement.

    Current CPP maximum benefit (at 65 with maximum contributions): approximately **$1,306/month** in 2025.

    Over a 25-year retirement: $1,306 × 12 × 25 = **$391,800 in CPP benefits**.

    This is worth paying CPP contributions for — though the break-even analysis depends on the client's health and other retirement income.

=== "Low-Income Years"

    When corporate profits are low, paying salary can produce a small personal tax bill while maximizing RRSP room for future high-income years.

=== "The Integration Assumption"

    Canada's tax system is designed so that income earned through a corporation and then distributed to a shareholder should theoretically result in approximately the same total tax as earning that income personally. This is called **integration**.

    In practice, integration is approximate — and the small business dividend rate in Ontario results in slightly **lower** combined tax on dividends vs. salary at many income levels. But the difference is smaller than most clients think, and the non-tax factors (RRSP room, CPP) often tip the balance toward salary.

### When Dividends Are Better

=== "Avoiding CPP"

    A shareholder who already has maximum CPP (from a prior employment career) gains nothing from additional CPP contributions. Paying dividends avoids unnecessary CPP contributions — saving up to $7,735/year (both halves of self-employment CPP at maximum).

=== "Spousal Dividends (Income Splitting)"

    If the shareholder's spouse is also a shareholder, the corporation can pay dividends to the lower-income spouse — shifting income from the high-income spouse to a lower tax bracket.

    **IMPORTANT NOTE:** The **Tax on Split Income (TOSI)** rules introduced in 2018 severely restrict dividend income splitting to family members who are not genuinely engaged in the business. A spouse who works meaningfully in the business can still receive dividends; a spouse with no involvement will have their dividends subject to TOSI — taxed at the highest marginal rate. This is a complex area — flag it and refer to a CPA.

=== "High RRSP Room Already Accumulated"

    If the shareholder has maximum RRSP room already and is maximizing contributions, additional salary only creates more RRSP room that can't be used effectively. Dividends may make more sense.

### The Classic Optimization Formula

For a shareholder with a full-time corporation as their primary income, the **classic approach** is:

```
1. Pay enough salary to maximize RRSP contributions
   (or at least generate desired RRSP room)
2. Pay enough salary to cover personal living expenses
3. Consider CPP optimization
4. Pay remaining desired income as dividends
5. Leave balance in corporation to invest (the deferral benefit)
```

!!! example "Case — The Optimal Compensation Mix"
    **Client:** Sandra, 42. Her corporation earned $280,000 in 2025. She wants to maximize her RRSP ($31,560 maximum for 2025), has no prior CPP entitlement, and wants to take home approximately $100,000 after-tax.

    **Analysis:**
    Required salary to max RRSP: $31,560 ÷ 18% = $175,333
    Desired take-home: $100,000 after-tax

    At $175,333 salary in Ontario:
    - Federal + Ontario tax: approximately $49,000
    - CPP (employee + employer both from corporation): approximately $7,735
    - Net take-home: $175,333 − $49,000 − $3,867 employee CPP = approximately $122,466

    This is more than her $100,000 target. She could reduce salary to approximately $130,000 and still take home ~$100,000 while generating $23,400 in RRSP room (130,000 × 18%) — still very healthy.

    **Remaining corporate profit:** $280,000 − $130,000 salary − $3,867 employer CPP = $146,133 in the corporation.
    Corporate tax: $146,133 × 12.2% = $17,828.
    Retained in corporation for investment: **$128,305**.

    Over 10 years at 6% growth inside the corporation — this retained amount compounds to $229,753 before eventual personal tax on extraction. The deferral benefit is real and substantial.

---

!!! question "Quick Check"
    David is the sole shareholder of a corporation and currently pays himself only non-eligible dividends — no salary, no payroll. He wants to contribute $25,000 to his RRSP in 2026. What is the problem with his current approach, and what minimum 2025 salary must he pay himself to generate sufficient RRSP room?

??? answer
    **The problem:** Dividends do not generate RRSP contribution room. Only **earned income** — salary, self-employment net income, and certain other sources — creates RRSP room at 18%. If David pays himself only dividends in 2025, his 2026 RRSP contribution limit from 2025 earned income will be **$0**, regardless of how profitable his corporation is.

    **Minimum salary required for 2026:**
    RRSP room = 18% × earned income (from the prior year)
    $25,000 ÷ 18% = **$138,889 minimum salary from the corporation in 2025**

    David must pay himself at least $138,889 in salary before December 31, 2025. This salary must be processed through payroll (T4 issued, CPP deducted, income tax remitted) — it cannot be retroactively declared after year-end.

    **The CPP implication:** A salary of $138,889 triggers approximately $7,735 in combined employer + employee CPP contributions. This is a real additional cost — but it also builds David's CPP retirement entitlement. Whether the RRSP tax savings ($25,000 × marginal rate ≈ $9,000–$12,000) exceed the CPP cost ($7,735) depends on his marginal rate and CPP situation.

---

## 21.5 Shareholder Loans — The Most Dangerous Area for Non-CPAs

A **shareholder loan** is money that moves between a shareholder and their corporation. It goes in one of two directions:

1. **Shareholder borrows from corporation** (corporation owes less, shareholder owes corporation)
2. **Shareholder lends to corporation** (shareholder owes more, corporation owes shareholder)

This seems straightforward. But the tax rules around shareholder loans are a trap that catches uninformed business owners and their preparers.

### The Core Rule — Section 15(2)

If a corporation loans money to a shareholder and the loan is **not repaid within the end of the calendar year following the year the loan was made**, the **full loan amount is added to the shareholder's income** in the year the loan was made.

```
Loan made in: 2024
Must be repaid by: December 31, 2025 (end of the FOLLOWING year)
If not repaid: full loan amount added to 2024 income
```

!!! danger "Shareholder loans are one of the most common audit triggers for incorporated businesses"
    A business owner who runs personal expenses through the corporate account all year has a shareholder loan balance. If that balance isn't cleared by year-end of the following year, CRA adds the amount to their personal income — potentially triggering large reassessments with interest and penalties.

    Your job as a T1 preparer: when you see a T4A Box 15 (director's fees) or unusual amounts on a T4A from the client's own corporation, or when the client mentions drawing from the corporation informally — flag it and ask about the shareholder loan account.

### The Three Safe Outcomes for a Shareholder Loan

| Outcome | Tax Result |
|---|---|
| Repaid within the following calendar year | No income inclusion — loan treated as a true loan |
| Converted to salary (corporation issues T4) | Salary is employment income — taxed accordingly |
| Converted to dividend (corporation issues T5) | Dividend income — grossed up and credited |

### The Loan-Back Exception

If a shareholder **lends money to** the corporation (shareholder is the creditor), there is no income inclusion issue. The corporation owes the shareholder. This is common when an owner invests personal savings to capitalize or expand the business.

!!! example "Case — The Shareholder Loan Gone Wrong"
    Mike operates a plumbing corporation. Throughout 2024, he pays personal bills from the corporate account — groceries, mortgage payments, vacations, school fees — drawing $72,000 for personal use without formal salary or dividend declarations.

    At year-end, the corporate bookkeeper records a "shareholder loan" of $72,000 on the balance sheet.

    **CRA's view:** The loan must be repaid by December 31, 2025.

    Mike's corporation has a poor cash year in 2025. The $72,000 is not repaid.

    **Tax consequence:** CRA adds **$72,000 to Mike's 2024 personal income** (the year the loan was made).

    At Mike's combined marginal rate of approximately 43%: **$30,960 in additional tax** — plus interest compounding from April 30, 2025.

    Mike assumed paying from the corporate account was the same as paying himself. It is not. Money extracted from a corporation must be properly characterized — as salary (T4), dividend (T5), or a documented loan repaid on time.

    **The lesson for your practice:** Ask every incorporated client at intake: *"Have you been drawing money from your corporation informally — paying personal expenses from the corporate account without formal payroll or dividend declarations?"* If yes — flag immediately for the CPA who handles the T2.

---

## 21.6 The Lifetime Capital Gains Exemption (LCGE) — When a Business Is Sold

The **Lifetime Capital Gains Exemption** is one of the most valuable tax provisions in Canada for small business owners. It allows a qualifying shareholder to sell their shares and receive up to **$1,250,000 CAD** (2025 indexed amount) in capital gains **completely tax-free**.

### What Qualifies — The Qualified Small Business Corporation (QSBC) Test

For shares to qualify for the LCGE, the corporation must meet a three-part test:

| Test | Requirement |
|---|---|
| **Qualification Test** | At the time of sale, ≥ 90% of the FMV of corporate assets is used principally in an active Canadian business |
| **24-Month Holding Test** | The shares were owned by the selling shareholder (or a related person) for at least 24 months before the sale |
| **24-Month Asset Test** | Throughout the 24 months before the sale, ≥ 50% of FMV of corporate assets were used in an active Canadian business |

!!! warning "The LCGE is a planning exercise — not a filing surprise"
    The LCGE applies when shares of a qualifying corporation are sold. This is not something that appears on a regular annual T1 — it happens on the year of a significant business sale event. When a client mentions they are considering selling their business or have received an offer, refer them immediately to a CPA who specializes in corporate tax and business transactions. The LCGE requires corporate-level planning (purification of the corporation, structuring the sale, ensuring the tests are met) long before the T1 is prepared.

    Your role: recognize when LCGE may be in play, understand the basics, and refer appropriately.

!!! example "Case — The LCGE in Action"
    Patricia has owned all shares of her incorporated consulting business for 8 years. She receives an offer of $1,400,000 for her shares. Her ACB for the shares is $100,000.

    **Capital gain on sale:** $1,400,000 − $100,000 = **$1,300,000**

    **Without LCGE:** Taxable capital gain = $1,300,000 × 50% = $650,000. At Ontario's top rate: $650,000 × 46.16% = **$300,040 in combined tax**

    **With LCGE (assuming shares qualify):**
    LCGE amount: $1,250,000
    Gain sheltered: $1,250,000 → **$0 tax**
    Remaining gain: $1,300,000 − $1,250,000 = $50,000
    Taxable capital gain: $50,000 × 50% = $25,000
    Tax at combined rate: $25,000 × 46.16% = **$11,540**

    **Tax saving from LCGE: $300,040 − $11,540 = $288,500**

    The LCGE can save a business owner nearly **$300,000 in tax** on a single transaction. This is why business succession planning — with proper CPA guidance years before the sale — is one of the highest-value services in the Canadian professional services market.

    **How this appears on the T1:**
    Capital gain: $1,300,000 on Schedule 3
    LCGE deduction: Line **25400** — Capital Gains Deduction
    Net effect: only $50,000 in capital gains remains taxable

---

## 21.7 The T4 and T5 Combination — When an Owner Has Both

Many shareholders pay themselves a mix of salary and dividends in the same year. This is the most common structure. Here is how both appear on the T1:

!!! example "Case — David's Combined T4 + T5 Return"
    David is the sole shareholder of a software consulting corporation.

    **2025 compensation:**
    - Salary (T4): $110,000
    - Non-eligible dividend (T5): $35,000 actual → $40,250 grossed up (×1.15) → DTC = $3,636

    **T1 Income:**
    - Line 10100 (salary): $110,000
    - Line 12000 (taxable dividends): $40,250
    - **Total income: $150,250**

    **Deductions:**
    - RRSP contribution: $19,800 (18% × $110,000 prior year salary = $19,800 RRSP room)
    - **Net income: $130,450**

    **Federal tax on $130,450:**

    | Bracket | Income | Rate | Tax |
    |---|---|---|---|
    | $0–$57,375 | $57,375 | 15% | $8,606 |
    | $57,376–$114,750 | $57,375 | 20.5% | $11,762 |
    | $114,751–$130,450 | $15,700 | 26% | $4,082 |
    | **Gross federal tax** | | | **$24,450** |

    **Federal credits:**
    - BPA: $16,129 × 15% = $2,419
    - CPP (Box 16): $3,867 × 15% = $580
    - Canada Employment: $1,433 × 15% = $215
    - Dividend tax credit (T5 Box 26): $3,636
    - RRSP deduction already applied to income (reduces gross tax base)
    - **Total credits: $6,850**

    **Net federal tax: $24,450 − $6,850 = $17,600**

    **Ontario tax:**
    $51,446 × 5.05% = $2,598
    ($130,450 − $51,446) × 9.15% = $79,004 × 9.15% = $7,229 (simplified — this reaches the higher Ontario brackets)
    Actually at $130,450: spans multiple Ontario brackets:
    $51,446 × 5.05% = $2,598
    ($102,894 − $51,447) × 9.15% = $51,447 × 9.15% = $4,707
    ($130,450 − $102,894) × 11.16% = $27,556 × 11.16% = $3,075
    **Ontario basic tax: $10,380**
    **Ontario surtax** (over $5,315 Ontario tax): ($10,380 − $5,315) × 20% = $1,013 first layer. ($10,380 − $6,802) × 36% = $1,288. **Total surtax: $2,301**
    Ontario tax after credits (~$919): approximately **$11,762**

    **Total combined tax: $17,600 + $11,762 = $29,362**
    **Effective rate on $150,250 total income: 19.5%**

    David received $145,000 in cash ($110,000 salary + $35,000 dividends). He pays approximately $29,362 in personal tax. He also put $19,800 into his RRSP. The remaining corporate profits stay in the corporation building wealth.

---

## 21.8 Management Fees — What They Are and Why They Matter

A **management fee** is a payment from one corporation to another — typically from an operating corporation to a holding company or management company.

**Common structure:** Business owner has an operating corporation (OpCo) that pays a management fee to a holding company (HoldCo) owned by the same person or family. The HoldCo then pays dividends to family members.

**Why this is done:** Tax planning, asset protection, income splitting.

**Why you need to know it:** When a management fee is paid, it affects the T1 only when the HoldCo pays dividends to the shareholder or when the shareholder receives income from the HoldCo.

**Your role:** Receive the T5 from the HoldCo. Report the dividends on the T1. The management fee structure at the corporate level is the CPA's domain.

!!! warning "TOSI and management fees to family members"
    The Tax on Split Income (TOSI) rules restrict the ability to pay dividends to family members of the owner who are not genuinely participating in the business. A management fee paid to a HoldCo owned by the owner's adult child who does no work may be challenged. This is a compliance risk area — always flag unusual management fee structures to a CPA.

---

## 21.9 What to Gather From an Incorporated Client at Intake

Use this expanded checklist for every shareholder-employee client:

### Documents from the Corporation

- [ ] **T4 from the corporation:** Salary paid, CPP withheld, income tax withheld
- [ ] **T5 from the corporation:** Dividends declared — Box 10/11/12 (eligible) or Box 24/25/26 (non-eligible)
- [ ] **T4A from the corporation:** Director's fees, management fees (if any)
- [ ] **Prior year T1 Notice of Assessment:** RRSP room available

### Questions to Ask

1. "Did your corporation pay you a formal salary with payroll? Do you have a T4?"
2. "Did your corporation declare dividends this year? Do you have a T5?"
3. "Did you draw money from the corporate account informally — personal expenses from the business account?"
4. "Is the shareholder loan account cleared? Was it repaid within the required timeframe?"
5. "Were any dividends paid to other family members (spouse, adult children)?"
6. "Did you sell any shares in the corporation this year?"
7. "Is a business sale being planned in the next few years? Has anyone discussed the LCGE with you?"
8. "Who prepares the T2 corporate return? Have they confirmed the dividend amounts match the T5 issued?"

!!! tip "Always coordinate with the T2 preparer"
    The amounts on the T4 and T5 flowing to your T1 client must match exactly what the corporation deducted or reported on its T2. If the T2 preparer declared a $40,000 dividend but the T5 issued says $35,000 — you have a discrepancy that will cause problems. Introduce yourself to your client's accountant. Building that relationship makes you a better preparer and generates reciprocal referrals.

---

## 21.10 The Professional Corporation — Doctors, Dentists, Lawyers

Professional corporations (PCs) are a special class of corporation available to certain regulated professionals. In Ontario:
- **Medical professionals** (doctors, dentists, optometrists)
- **Legal professionals** (lawyers, paralegals)
- **Certain other regulated professionals**

### What's Different About a Professional Corporation T1

The **fundamentals are the same** — salary from T4, dividends from T5. But there are specific planning considerations:

**The medical professional situation:**
A physician billing OHIP receives fee-for-service income. Through a professional corporation, they can:
1. Retain profits in the corporation at the 12.2% small business rate
2. Build corporate investments (though Passive Investment Income rules limit this — CPA territory)
3. Split income with an incorporated spouse through salary (if the spouse does legitimate administrative work)

**The dentist's dilemma:**
A dentist with $600,000 in annual billings faces very high personal tax if unincorporated. Through a corporation, they can control the timing and amount of extraction. The trade-off: higher accounting fees, complexity, and the TOSI restrictions on income splitting.

**Your T1 role:** Receive the T4 and T5 from the professional corporation. Apply RRSP, pension, and credits appropriately. Note any large LCGE-eligible transactions.

!!! example "Case — Dr. Chen's Annual T1"
    Dr. Sarah Chen is a family physician. Her professional corporation (PC) billed $480,000 in OHIP fees in 2025.

    She paid herself:
    - Salary: $180,000 (T4 from PC)
    - Dividend: $60,000 actual non-eligible (T5 from PC): grossed up to $69,000

    Her husband Michael (who manages the clinic's scheduling and billing, works 20 hours/week) also received:
    - Salary: $55,000 (T4 from PC — legitimate employment for real work performed)

    **Sarah's T1:**
    Total income: $180,000 + $69,000 = $249,000
    RRSP contribution: $31,560 (maximum — 18% × prior year salary $180,000 = $32,400, max $31,560)
    Net income: $249,000 − $31,560 = **$217,440**

    At this income level, Sarah is in Ontario's top combined bracket (46.16% above $220,000). Her combined tax is approximately $70,000+. But she has retained approximately $175,000 in the corporation (after salary, dividends, and corporate tax) — tax-deferred until she extracts it.

    **RRSP note:** Sarah's $31,560 RRSP saves her approximately $31,560 × 46.16% = **$14,568** in combined tax. At this income level, every deduction is worth 46 cents on the dollar. Maximum RRSP is mandatory.

---

## 21.11 Red Flags on Incorporated Client T1s

These situations require immediate follow-up — either with the client or the T2 preparer:

| Situation | Red Flag | Action |
|---|---|---|
| T4 and T5 don't appear | Client says they "took money" from the corporation all year | Ask about shareholder loan account — could be income inclusion |
| Unusual T4A from own corporation | Box 15 (director's fees) or Box 20 (self-employed commissions) | Verify proper characterization with T2 preparer |
| Dividend amount doesn't match prior planning | T5 shows $80,000 but client expected $40,000 | Verify with bookkeeper — may be error |
| RRSP room much lower than prior year | Large pension adjustment (Box 52) | Confirm if corporation established a DB pension plan for owner |
| Client mentions "selling the business" | LCGE may apply | Refer to CPA before preparing T1 |
| Dividends to spouse or adult children | TOSI may apply | Verify family members' involvement in the business |
| Multiple T5s from different corporations | Complex corporate structure | Get a full org chart before starting |

---

## 21.12 Ontario-Specific Considerations for Incorporated Clients

### Ontario Small Business Deduction

Ontario's small business corporate tax rate is **3.2%** on active business income up to $500,000. Combined with the federal 9%: the total small business rate is **12.2%**. Business income above $500,000 is taxed at the general rate (~26.5% combined). This threshold affects the salary vs. dividend analysis — at very high corporate income, retaining money above $500,000 becomes less tax-efficient.

### Ontario Trillium Benefit for Corporate Owners

A business owner with a modest personal income (perhaps taking most income as retained earnings) may qualify for OTB. Net income for OTB purposes uses Line 23600 — after RRSP deductions. A shareholder who contributed $31,560 to an RRSP may have their net income drop below OTB phase-out thresholds.

### Ontario Surtax on Dividends

As covered in Week 15, Ontario's surtax applies to Ontario tax above $5,315. Dividend income — after the gross-up — adds to taxable income that may push a shareholder into surtax territory. The effective Ontario rate on dividends at high income levels is higher than the nominal rate suggests. The surtax makes Ontario's integrated tax on dividends less favourable compared to salary at very high income levels.

---

!!! tip "In your tax software"
    - **T4 from own corporation:** Enter identically to any employer T4. Box 14 → Line 10100, Box 22 → Line 43700 (income tax withheld), Box 16 → CPP employee contributions, Box 18 → EI premiums (if applicable). There is no special flag for "T4 from own corporation" in the software — it is processed exactly like a T4 from any employer.

    - **T5 dividend entry:** Enter T5 Box 24 (actual amount of non-eligible dividends), Box 25 (grossed-up taxable amount at ×1.15), and Box 26 (dividend tax credit). If the software allows entry from Box 24 only, it will calculate the gross-up and DTC automatically. For eligible dividends: Box 10 (actual amount), Box 11 (grossed-up at ×1.38), Box 12 (DTC at 15.0198%). Verify the correct dividend type is selected — the DTC rate is very different for eligible vs. non-eligible.

    - **Shareholder loan — no automatic T1 entry:** A shareholder loan balance does not appear on the T1 unless formally converted to income via a T4 (salary) or T5 (dividend), or unless Section 15(2) income inclusion is triggered. When a client mentions drawing from the corporation informally, note it in the file and flag it for the T2 preparer immediately. Do not guess at the amount — get the shareholder loan account balance from the bookkeeper.

    - **LCGE — Line 25400 (Capital Gains Deduction):** When shares of a qualified small business corporation are sold, the capital gain appears on Schedule 3 (Line 12700). The LCGE deduction is applied on Line 25400 — up to $1,250,000 (2025 indexed amount) less any prior capital gains deduction used in prior years (shown on prior NOA). Coordinate with the T2 preparer to confirm the QSBC qualification tests are met before claiming.

    - **TOSI check — family dividends:** If T5 dividends were paid to a spouse or adult children of the shareholder, ask about their active involvement in the business before filing. Software does not automatically apply TOSI — this is your professional judgment. If TOSI applies, the dividend is taxed at the top marginal rate in the recipient's hands rather than at their lower personal rate. Flag any unusual family dividend structures for CPA review.

    - **Coordination with the T2 preparer:** The dividend amount declared on the T2 corporate return must exactly match the T5 issued to the shareholder. If the T5 shows $40,000 but the client expected $35,000, contact the bookkeeper before filing. Filing with mismatched amounts creates corporate-personal reconciliation issues and can trigger CRA questions on both returns.

---

## 21.13 Case Studies — Incorporated Client T1s

### Case A — The First-Year Incorporation

**Client:** James, 38, a self-employed IT consultant who incorporated January 1, 2025. Prior to incorporation, he filed a T2125. Now he has a T4 and T5.

James's accountant set up his corporation and advised him to pay himself:
- Salary: $75,000/year (generates RRSP room, builds CPP)
- Non-eligible dividend: $30,000 (actual) = $34,500 grossed up

**Documents received:** T4 Box 14 = $75,000, T5 Box 24 = $30,000, Box 25 = $34,500, Box 26 = $3,115

**T1 Income:**
- Employment: $75,000 → Line 10100
- Dividends (grossed up): $34,500 → Line 12000
- **Total: $109,500**

**RRSP deduction:** $13,500 (18% × $75,000 prior year salary = $13,500 RRSP room — first year incorporating, limited room)
**Net income: $96,000**

**Federal tax:**
$57,375 × 15% = $8,606
$39,375 × 20.5% = $8,122
**Gross federal tax: $16,728**

Less credits:
- BPA: $2,419
- CPP (Box 16 $3,867): $580
- EI (Box 18 $1,049): $157 (James chose to keep EI)
- Canada Employment: $215
- Dividend tax credit: $3,115
**Total credits: $6,486**

**Net federal tax: $16,728 − $6,486 = $10,242**

Ontario tax on $96,000:
$51,446 × 5.05% = $2,598
$44,554 × 9.15% = $4,077
**Ontario basic tax: $6,675**
**Ontario surtax:** ($6,675 − $5,315) × 20% = $272. ($6,675 − $6,802)? — $6,675 is below $6,802 second threshold. **Surtax: $272**
**Ontario tax before credits: $6,947**
Less Ontario credits (~$919): **Ontario net tax: $6,028**

**Total combined tax: $10,242 + $6,028 = $16,270**

**Planning note:** James's prior year as a sole proprietor (same $109,500 equivalent income) would have had combined tax of approximately $30,000+ (including self-employment CPP). First year of incorporation + proper T4/T5 structure + RRSP: combined tax drops to $16,270. James has saved approximately $14,000 in his first incorporated year. He won't be going back.

---

### Case B — The Shareholder Loan Rescue

**Client:** Maria, 45, runs a beauty salon corporation. Her bookkeeper calls you in February after reviewing the prior year corporate books.

"Maria has a $58,000 shareholder loan balance at December 31, 2024. She drew $58,000 from the corporate account throughout 2024 for personal expenses. The corporation has cash but never declared a salary or dividend."

**The problem:** Under Section 15(2), the $58,000 must be added to Maria's **2024 personal income** if not repaid by December 31, 2025. At her combined rate of approximately 33%, this would cost her **$19,140 in additional tax.**

**The solution — option analysis:**

*Option A — Repay the loan by December 31, 2025:*
Maria repays $58,000 to the corporation before December 31, 2025. No income inclusion. She then can redraw it later as proper salary or dividend.
Requires cash available: Maria needs $58,000 available to repay.

*Option B — Declare a retroactive dividend equal to the loan:*
The corporation declares a $58,000 dividend (non-eligible) as at December 31, 2024 — converting the shareholder loan into a proper dividend. The T5 is issued for the 2024 year.
Tax on $58,000 non-eligible dividend at ~33% combined: approximately **$14,500** — less than Option C.
Maria files an amended 2024 T1 including the dividend.

*Option C — Do nothing:*
The $58,000 is added to 2024 income as a loan inclusion under S.15(2). $58,000 × full marginal rate. **Most expensive outcome.**

**Your recommendation:** Option B — retroactive dividend declaration, if the corporation has retained earnings to support it. This must be coordinated with the T2 preparer immediately — before the corporate year-end is filed.

**The lesson:** Shareholder loans are a corporate/personal tax crossover situation. When you see them, act immediately and involve the T2 preparer. The tax cost of inaction compounds daily.

---

### Case C — The Dividend Recipient Spouse (TOSI Analysis)

**Client:** Robert, 52, and his wife Linda, 49. Robert owns 51% of their restaurant corporation; Linda owns 49%.

The corporation declares $80,000 in non-eligible dividends:
- Robert's T5: $40,000 actual ($46,000 grossed up)
- Linda's T5: $40,000 actual ($46,000 grossed up)

**Robert:** Works full-time managing the restaurant (genuine business involvement).
**Linda:** Works 15 hours/week managing the front-of-house, bookkeeping, and scheduling.

**TOSI analysis:**
The Tax on Split Income rules require that the recipient of dividends from a private corporation be "actively engaged" in the business or meet other exclusions. Linda works 15 hours/week — this is genuine involvement. CRA's bright-line test for TOSI: an adult family member who works **an average of 20+ hours/week** during the business year is clearly excluded from TOSI. Linda's 15 hours is in a gray zone.

**Your action:** Flag this for the T2 preparer and advise Robert and Linda to document Linda's hours and duties carefully. If CRA audits and determines Linda isn't sufficiently engaged, her $40,000 dividend would be taxed at the **highest marginal rate** (TOSI applies) rather than at her lower personal rate.

**At stake:** Linda is in the 20.05% combined bracket. Normal tax on her $40,000 dividend: approximately $8,500. TOSI tax at top rate: approximately $18,500. **Difference: $10,000/year.** Linda should either increase her documented hours to 20+/week or the dividend structure should be revisited.

This is not your call to make alone — but flagging it is exactly what separates a competent T1 preparer from one who files blindly and leaves the client exposed.

---

## 21.14 Week 21 Summary

!!! success "What you learned this week"
    - Incorporated clients have their money come out of the corporation as **salary (T4)**, **dividends (T5)**, or **shareholder loans** — each with different tax treatment on the T1
    - Corporations pay approximately **12.2% small business corporate tax** in Ontario on active income up to $500,000. Shareholders pay personal tax when they extract money — creating a deferral benefit
    - **Salary:** Reported on T4 → Line 10100. Generates RRSP room and CPP contributions. Corporation deducts it
    - **Non-eligible dividends (most CCPC dividends):** Actual amount × 1.15 = taxable amount → Line 12000. DTC on Line 40425. Does NOT generate RRSP room
    - **Salary vs. dividends:** No universal answer. Key factors: RRSP room needed, CPP desired, income level, spouse's involvement, and total family tax. The classic approach: pay enough salary to fund RRSP, extract remaining desired income as dividends
    - **Shareholder loans:** Must be repaid by December 31 of the following year — or full amount added to personal income. This is one of the most dangerous and most common corporate-personal tax traps
    - **LCGE ($1,250,000 in 2025):** Shelters capital gains on sale of qualified small business corporation shares. Potentially saves $250,000–$300,000 in tax on a business sale. Requires CPA planning years before the sale. Appears on Line 25400 (Capital Gains Deduction) on the T1
    - **TOSI:** Dividends paid to family members who aren't genuinely engaged in the business are taxed at the highest marginal rate. Flag unusual family dividend situations for CPA review
    - **Your lane:** T1 personal return for the shareholder. The T2 corporate return is the CPA's domain. Know enough to serve the T1 correctly and to flag what needs CPA attention

---

## ✅ Week 21 Quiz

When you're ready, ask Claude: **"Quiz me on Week 21"** for an interactive test.

??? question "1. Patricia paid herself $90,000 in salary from her corporation. She also received a $45,000 non-eligible dividend. What amounts appear on her T1, on which lines, and what is the grossed-up dividend reported on Line 12000?"
    **Line 10100 (employment income):** $90,000 from the T4. **Line 12000 (taxable dividends):** Non-eligible dividends are grossed up by 15%. $45,000 × 1.15 = **$52,000** appears on Line 12000 — not the $45,000 received. The T5 Box 25 will already show the grossed-up amount of $52,000. **T5 Box 26 (DTC):** $52,000 × 9.0301% = $4,696 → Line 40425. **Total T1 income:** $90,000 + $52,000 = $142,000. Patricia received $135,000 in cash but reports $142,000 because of the gross-up mechanism. The DTC partially compensates.

??? question "2. David wants to contribute $25,000 to his RRSP in 2026. He is the sole shareholder of a corporation. What is the minimum salary he must pay himself in 2025 to generate sufficient RRSP room for 2026?"
    RRSP room = 18% of prior year earned income. Required: $25,000 ÷ 18% = **$138,889 in salary income** in 2025. Dividends do not generate RRSP room — only salary (and other earned income like self-employment net income) counts. If David pays himself only $80,000 in salary, his 2026 RRSP room is $80,000 × 18% = $14,400 — $10,600 short of his target. He would need to either increase his 2025 salary or accept a smaller 2026 RRSP contribution.

??? question "3. Mike drew $65,000 from his corporation's bank account during 2024 for personal expenses — without any formal salary or dividend declarations. The year-end is December 31, 2024. When must this be repaid to avoid income inclusion, and what happens if it isn't repaid?"
    The shareholder loan must be repaid by **December 31, 2025** — the end of the calendar year following the year the loan was made (2024). If not repaid by that date, CRA will add the **full $65,000 to Mike's 2024 personal income** under Section 15(2) of the Income Tax Act. At Mike's combined marginal rate of approximately 33%, this would generate approximately **$21,450 in additional personal tax** plus interest from the original April 30, 2025 due date. The loan can also be converted to a proper salary (T4 issued) or dividend (T5 declared) by the corporate year-end — either option triggers tax but at lower rates than the S.15(2) income inclusion in some cases.

??? question "4. Sandra's corporation sold all its shares for $1,450,000. She had an ACB of $150,000. The 2025 LCGE amount is $1,250,000. Calculate her capital gain, the LCGE deduction, and her taxable capital gain on the sale."
    **Capital gain:** $1,450,000 − $150,000 = **$1,300,000** → Schedule 3. **LCGE deduction (Line 25400):** $1,250,000 (maximum). The deduction shelters $1,250,000 of the gain entirely from tax. **Remaining capital gain:** $1,300,000 − $1,250,000 = $50,000. **Taxable capital gain** (×50%): $50,000 × 50% = **$25,000** → Line 12700. Without LCGE, the taxable capital gain would have been $650,000. The LCGE saved Sandra tax on $625,000 of additional taxable income — approximately $625,000 × 46.16% = **$288,500 in avoided tax** on a single transaction.

??? question "5. Robert works full-time in his business and pays himself a $120,000 salary (T4) and a $50,000 non-eligible dividend (T5). His wife Linda (who works 10 hours/week doing bookkeeping) also receives a $50,000 non-eligible dividend from their corporation. What concern should you flag to them?"
    **TOSI (Tax on Split Income) risk.** For dividends to be paid to a family member without TOSI applying, that member must be "actively engaged" in the business. CRA's bright-line test: 20+ average hours/week during the year generally qualifies; under 20 hours is a gray zone. Linda works only 10 hours/week — this may not meet the active engagement threshold. If TOSI applies to Linda's $50,000 dividend: it would be taxed at the **highest marginal rate** (~46.16% combined) rather than at her personal rate. Difference in tax: potentially $10,000–$18,000 per year. Advise Robert and Linda to: (1) consult their CPA before the next dividend declaration, (2) document Linda's actual hours and responsibilities in detail, and (3) consider whether increasing Linda's documented hours to 20+/week (if genuine) or restructuring the dividend is appropriate.

??? question "6. What is the key difference between why a shareholder might choose to pay salary vs. dividends — specifically regarding the two non-tax factors that make salary attractive even if dividends are slightly more tax-efficient?"
    **(1) RRSP contribution room:** Only earned income (salary, self-employment) generates RRSP room at 18%. Dividends generate zero RRSP room. A shareholder who pays only dividends accumulates no room for tax-sheltered retirement savings — potentially losing hundreds of thousands in lifetime RRSP benefits. **(2) CPP entitlement:** Salary triggers CPP contributions (both employer and employee shares paid by the corporation). These contributions build the shareholder's future CPP retirement benefit — currently up to ~$1,306/month at age 65 with maximum contributions, worth approximately $391,800 over a 25-year retirement. A dividend-only strategy sacrifices both of these long-term benefits, even if it saves modest tax in the current year.

??? question "7. You are preparing a T1 for an incorporated client. Their T4 shows $85,000 salary and their T5 shows $30,000 in actual non-eligible dividends. When you ask about shareholder loans, they mention they also 'paid some personal bills through the business' — approximately $22,000 — and their bookkeeper called it a 'loan on the books.' The year-end was December 31, 2024, and it is now February 2025. What do you do?"
    **Do not simply file the T1 as-is.** The $22,000 shareholder loan requires immediate attention. Under Section 15(2), if this loan is not repaid by **December 31, 2025** (end of the calendar year following when it arose), the $22,000 will be added to 2024 personal income. **Your immediate actions:** (1) Contact the client and explain the shareholder loan rule clearly. (2) Contact their T2 preparer to confirm the loan amount and year-end date. (3) Explore options: repay the $22,000 by December 31, 2025; or declare an additional retroactive dividend equal to $22,000 (which would require amending the T5 and T2 for 2024); or declare a salary bonus (amend T4). (4) Document your advice in the file. Do not file the T1 without resolving this situation — filing and ignoring a shareholder loan that will later generate income inclusion would not be serving your client's best interests.

---

## 📚 Further Reading

- [CRA: Incorporated businesses — salary vs dividends overview](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/corporations/corporation-income-tax.html)
- [CRA: Shareholder benefits and loans — Section 15](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/corporations/corporation-payments-benefits-shareholder.html)
- [CRA: Capital gains deduction — LCGE](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-25400-capital-gains-deduction.html)
- [CRA: Qualified small business corporation shares](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/deductions-credits-expenses/line-25400-capital-gains-deduction/qualified-small-business-corporation-shares.html)
- [CRA: Tax on split income (TOSI)](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/corporations/income-splitting-private-corporations.html)
- [CRA: Professional corporations](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/corporations/professional-corporations.html)

---

!!! tip "Up Next: Week 22"
    **Tax Software Mastery — Working Efficiently in UFile, TaxCycle and AdvTax**. You've learned every technical rule. Now you learn to work at professional speed. Week 22 covers how professional tax software is structured, how to navigate it efficiently, how to catch software errors, and how to build workflows that let you prepare 10 returns per day without sacrificing accuracy. This is the week that takes you from knowledgeable to operational.
