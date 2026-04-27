# Week 2: The T1 Return Structure

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Navigate the T1 General form with confidence
    - Identify every major section and what belongs in each one
    - Trace a client's income from the first line to the final refund or balance owing
    - Understand the difference between net income, taxable income, and total income
    - Read a Notice of Assessment (NOA)

---

## 2.1 What Is the T1 General?

The **T1 General Income Tax and Benefit Return** is the official form every Canadian individual uses to report their income and calculate their tax. You will complete one of these for every single client.

Think of the T1 as a **funnel**:

```
ALL MONEY COMING IN
        ↓
   Remove deductions
        ↓
   Apply tax rates
        ↓
   Subtract credits
        ↓
   Compare to what was already paid
        ↓
  REFUND  ←——→  BALANCE OWING
```

The T1 is not one page — it's a package that includes the main form plus **schedules** (supporting calculation sheets). You'll use different schedules depending on your client's situation.

---

## 2.2 The Four Major Sections of a T1

Every T1 follows the same four-section structure. No matter how complex a return gets, it always flows through these four stages.

=== "Section 1: Identification"

    The first part of the T1 collects basic personal information about your client. This section seems simple but contains fields that affect how benefits are calculated.

    **Key fields:**

    | Field | Why It Matters |
    |---|---|
    | Social Insurance Number (SIN) | Unique ID — required; CRA links all slips to this number |
    | Date of birth | Determines eligibility for age-related credits (65+) |
    | Marital status | Affects spousal credits, income splitting, benefit amounts |
    | Province/Territory of residence | Determines which provincial tax rates apply |
    | Residency status | Full-year resident, part-year, or non-resident — different rules apply |

    !!! warning "Province of residence = December 31"
        A client's province of residence for tax purposes is where they **lived on December 31** of the tax year — not where they worked, or where they moved from. If your client moved from Ontario to Alberta in September, they file as an **Alberta** resident for that entire year.

=== "Section 2: Total Income"

    This is where you report **every dollar your client earned** from all sources. Each income type goes on a specific line.

    **Common income lines:**

    | Line | Income Type | Common Slip |
    |---|---|---|
    | 10100 | Employment income | T4 |
    | 10400 | Other employment income | T4 box 40 |
    | 11300 | Old Age Security (OAS) | T4A(OAS) |
    | 11400 | CPP/QPP benefits | T4A(P) |
    | 11500 | Other pension income | T4A |
    | 12000 | Taxable dividends | T5 |
    | 12100 | Interest and investment income | T5 |
    | 12700 | Taxable capital gains | Schedule 3 |
    | 13500 | Self-employment income (net) | T2125 |
    | 14600 | Rental income (net) | T776 |

    **Add all of these together → Line 15000: Total Income**

    !!! note "Total Income vs. Net Income"
        **Total Income (line 15000)** is everything before any deductions.
        This number appears on your NOA and is sometimes used by lenders (mortgages, etc.) to verify income.

=== "Section 3: Net Income & Taxable Income"

    After Total Income, you subtract **deductions** to arrive at two critical numbers.

    **Step 1 — Subtract deductions to get Net Income:**

    | Line | Deduction |
    |---|---|
    | 20600 | Pension adjustment |
    | 20700 | RRSP/PRPP deduction |
    | 21000 | Deduction for elected split-pension amount |
    | 21400 | Child care expenses |
    | 22200 | CPP/EI contributions on self-employment |
    | 22900 | Other employment expenses |
    | 23200 | Other deductions |

    **Total Income − Deductions = Line 23600: Net Income**

    ---

    **Step 2 — A few more deductions to get Taxable Income:**

    | Line | Deduction |
    |---|---|
    | 25100 | Limited partnership losses |
    | 25200 | Non-capital losses of other years |
    | 25300 | Net capital losses of other years |
    | 25400 | Capital gains deduction |
    | 25600 | Northern residents deductions |

    **Net Income − Additional Deductions = Line 26000: Taxable Income**

    !!! success "Why Net Income is the most important number"
        **Net Income (line 23600)** is the number the government uses to calculate:

        - GST/HST credit eligibility
        - Canada Child Benefit (CCB) amounts
        - Old Age Security (OAS) clawback threshold
        - Spousal/dependant credit amounts
        - Provincial benefit programs

        Lowering net income through smart deductions (like RRSP contributions) doesn't just reduce taxes — it can **increase benefits**. This is one of the most powerful strategies you'll use for clients.

=== "Section 4: Tax Calculation & Credits"

    Now that you have **Taxable Income**, you calculate the tax — then reduce it with credits.

    **This happens on Schedule 1 (Federal Tax):**

    ```
    Taxable Income (line 26000)
        × Federal tax rates (applied by bracket)
    ─────────────────────────────────
    Gross Federal Tax
        − Federal non-refundable tax credits
    ─────────────────────────────────
    Net Federal Tax (line 42000)
    ```

    **Then on the main T1:**

    ```
    Net Federal Tax
    + Provincial/Territorial Tax (calculated on provincial form)
    + CPP contributions on self-employment (if applicable)
    + EI premiums on self-employment (if applicable)
    ─────────────────────────────────
    Total Payable (line 43500)
        − Total Credits (tax withheld, instalments paid, etc.)
    ─────────────────────────────────
    REFUND (line 48400)  or  BALANCE OWING (line 48500)
    ```

---

## 2.3 Schedule 1 — Federal Tax Calculation

Schedule 1 is where federal tax is actually calculated. Every return uses it.

**The key non-refundable credits on Schedule 1:**

| Credit | Who Gets It | 2025 Amount |
|---|---|---|
| Basic Personal Amount | **Everyone** | $16,129 |
| Age Amount | 65 or older | Up to $8,790 |
| Spouse/Common-law Partner | If supporting a spouse | Up to $16,129 |
| CPP contributions | Employees/self-employed | Based on actual contributions |
| EI premiums | Employees | Based on actual premiums |
| Canada Employment Amount | All employed Canadians | Up to $1,433 |
| Disability Amount | If approved | $9,872 |
| Tuition Amount | Post-secondary students | Based on eligible tuition paid |
| Charitable Donations | Anyone who donates | 15% on first $200; 29%+ on remainder |

!!! info "Non-refundable credits are worth 15 cents per dollar"
    Federal non-refundable credits are multiplied by **15%** (the lowest federal rate). So the Basic Personal Amount of $16,129 × 15% = **$2,419** off your federal tax — not $16,129. This confuses many beginners.

---

## 2.4 Worked Example — Complete T1 Flow

Let's trace a real client through the entire T1 from top to bottom.

---

**Client Profile: Sandra**

- 38 years old, single, lives in Ontario all year
- Works as a marketing manager
- Has a savings account and made an RRSP contribution

| Item | Amount |
|---|---|
| Employment income (T4) | $85,000 |
| Bank interest (T5) | $400 |
| RRSP contribution | $10,000 |
| Tax withheld by employer (T4 box 22) | $18,500 |

---

**Step 1 — Total Income**

```
Employment income:     $85,000   (line 10100)
Interest income:          $400   (line 12100)
                      ────────
Total Income:          $85,400   (line 15000)
```

---

**Step 2 — Net Income**

```
Total Income:          $85,400
− RRSP deduction:     ($10,000)  (line 20800)
                      ────────
Net Income:            $75,400   (line 23600)
```

---

**Step 3 — Taxable Income**

Sandra has no additional deductions in this example.

```
Taxable Income:        $75,400   (line 26000)
```

---

**Step 4 — Federal Tax (Schedule 1)**

Apply 2025 federal brackets to $75,400:

| Bracket | Income in Bracket | Rate | Tax |
|---|---|---|---|
| $0 – $57,375 | $57,375 | 15% | $8,606 |
| $57,376 – $75,400 | $18,025 | 20.5% | $3,695 |
| **Gross Federal Tax** | | | **$12,301** |

**Non-refundable credits (×15%):**

| Credit | Amount | ×15% | Tax Reduction |
|---|---|---|---|
| Basic Personal Amount | $16,129 | 15% | $2,419 |
| CPP contributions | $3,867 | 15% | $580 |
| EI premiums | $1,049 | 15% | $157 |
| Canada Employment Amount | $1,433 | 15% | $215 |
| **Total credits** | | | **$3,371** |

```
Gross Federal Tax:     $12,301
− Non-refundable credits: ($3,371)
                       ────────
Net Federal Tax:        $8,930   (line 42000)
```

---

**Step 5 — Add Provincial Tax (Ontario)**

Ontario tax on $75,400 ≈ **$4,650** (simplified)

```
Net Federal Tax:        $8,930
+ Ontario Tax:          $4,650
                       ────────
Total Payable:         $13,580   (line 43500)
```

---

**Step 6 — Refund or Balance Owing?**

```
Total Payable:         $13,580
− Tax already withheld ($18,500)
                       ────────
REFUND:                 $4,920   (line 48400) 🎉
```

Sandra gets a **$4,920 refund** — largely because her $10,000 RRSP contribution reduced her taxable income significantly.

!!! success "Key insight from Sandra's return"
    Without the RRSP contribution, her taxable income would have been $85,400 and her refund would have been much smaller. The RRSP deduction saved her approximately **$2,050 in federal and provincial taxes combined**. This is real money — and exactly the kind of value you'll deliver to clients.

---

## 2.5 Common Slips You'll See Every Tax Season

As a preparer, clients will hand you a pile of paper (or PDFs). You need to instantly recognize what each slip is.

| Slip | Issued By | Reports |
|---|---|---|
| **T4** | Employer | Employment income, CPP, EI, tax withheld |
| **T4A** | Pension payers, CRA | Pension income, RESP withdrawals, COVID benefits |
| **T4A(OAS)** | Service Canada | Old Age Security payments |
| **T4A(P)** | Service Canada | CPP/QPP benefits |
| **T4E** | Service Canada | Employment Insurance (EI) benefits |
| **T5** | Banks, brokerages | Interest, dividends |
| **T3** | Trusts, mutual funds | Trust income, capital gains distributions |
| **T4RSP** | Financial institutions | RRSP withdrawals |
| **T2202** | Educational institutions | Tuition fees (for students) |
| **RRSP receipt** | Financial institution | RRSP contribution confirmation |

!!! warning "Missing slips are your #1 risk"
    Clients forget slips constantly. A good preparer **always** cross-references slips against prior year returns and asks: "Did you receive any other income this year?" CRA has all slips filed by issuers — if you miss one, they will find it and reassess the return, plus interest.

    **Best practice:** Access the client's CRA My Account (with their authorization) to verify all slips on file before filing.

---

## 2.6 The Notice of Assessment (NOA)

After CRA processes a return, they send a **Notice of Assessment**. This is CRA's official confirmation of what they accepted.

**Key sections of an NOA:**

| Section | What It Shows |
|---|---|
| Assessment summary | CRA's version of the key numbers (income, tax, credits) |
| Account summary | Balance owing, refund amount, or credit carried forward |
| RRSP deduction limit | How much your client can contribute next year |
| Home Buyers' Plan balance | Repayment amounts if applicable |
| Explanation of changes | If CRA changed anything from what you filed |

!!! tip "Always review the NOA with your client"
    The NOA is the first place CRA will flag a disagreement with your return. If any numbers differ from what you filed, investigate immediately. Clients have **90 days** to file a formal objection if they disagree with an assessment.

---

## 2.7 Case Studies

### Case A — The Simple Return

**Client:** Ahmed, 26, single, one employer, no investments.

**Slips received:** One T4.

**Complexity:** Very low. Fill in employment income, apply basic credits, done. You'll do dozens of these during tax season — they take 15–20 minutes each.

---

### Case B — The Forgotten Slip

**Client:** Maria, 52, works full-time but also has a savings account.

**Slips received:** T4 (she hands you).

**What you must ask:** "Do you have a T5 from your bank?" She says she doesn't think so. You check her CRA My Account — there's a T5 for $230 in interest she forgot about.

**Why it matters:** CRA already has that T5. If you file without it, CRA will reassess her return, add the income, charge interest, and possibly flag the account. Always verify slips through CRA My Account.

---

### Case C — The RRSP Impact

**Client:** David, 45, earns $110,000. Panicking about his tax bill.

**He contributed $15,000 to his RRSP in February before the deadline.**

| | Without RRSP | With RRSP |
|---|---|---|
| Total Income | $110,000 | $110,000 |
| RRSP Deduction | $0 | ($15,000) |
| Net Income | $110,000 | $95,000 |
| Federal Tax | ~$21,700 | ~$18,400 |
| **Tax Savings** | | **~$3,300** |

The RRSP contribution saved David over $3,300 in federal tax alone. This is why clients love a knowledgeable tax preparer.

---

## 2.8 Week 2 Summary

!!! success "What you learned this week"
    - The T1 has 4 sections: Identification → Total Income → Net/Taxable Income → Tax & Credits
    - **Total Income (15000)** → subtract deductions → **Net Income (23600)** → more deductions → **Taxable Income (26000)**
    - Net Income is the critical number for benefit calculations, not just taxes
    - **Schedule 1** calculates federal tax and applies non-refundable credits at 15%
    - Non-refundable credits reduce tax — they don't reduce income
    - Common slips (T4, T5, T4A, etc.) each have a specific purpose and line on the return
    - The NOA is CRA's official response — always review it for discrepancies
    - Missing slips are the #1 avoidable error in tax preparation

---

## ✅ Week 2 Quiz

When you're ready, ask Claude: **"Quiz me on Week 2"** for an interactive test.

??? question "1. What is the difference between Total Income, Net Income, and Taxable Income?"
    - **Total Income (15000):** Every dollar earned from all sources, before any deductions
    - **Net Income (23600):** Total Income minus above-the-line deductions (RRSP, childcare, etc.). Used for benefit calculations.
    - **Taxable Income (26000):** Net Income minus a few additional deductions (capital loss carryovers, etc.). This is what the tax brackets are applied to.

??? question "2. A client earned $95,000 in employment income and contributed $12,000 to their RRSP. What is their Net Income?"
    **$83,000.** Net Income = Total Income ($95,000) − RRSP deduction ($12,000) = $83,000 (line 23600).

??? question "3. Why does Net Income matter beyond calculating tax?"
    Net Income (line 23600) determines eligibility and amounts for GST/HST credits, Canada Child Benefit, OAS clawbacks, and provincial benefit programs. Reducing net income through deductions can increase benefits a client receives.

??? question "4. A client brings you a T4 and says that's all they have. What should you do before filing?"
    Log into CRA My Account (with the client's authorization) to verify all slips on file. CRA receives copies of all slips issued to your client. If any are missing from what the client provided — T5, T3, T4A, etc. — you must include them.

??? question "5. The Basic Personal Amount is $16,129. How much does this actually reduce a client's federal tax?"
    **$2,419.** Non-refundable credits are multiplied by 15% (the lowest federal rate). $16,129 × 15% = $2,419 reduction in federal tax — not a $16,129 reduction.

??? question "6. Your client moved from BC to Ontario in August. Which province's tax rates apply?"
    **Ontario.** Province of residence for tax purposes is determined by where the client lived on **December 31** of the tax year.

??? question "7. What is a Notice of Assessment and when should you be concerned about it?"
    The NOA is CRA's official confirmation of how they processed the return. You should be concerned if any numbers differ from what you filed — this means CRA made a change. Your client has 90 days to file a formal objection if they disagree.

---

## 📚 Further Reading

- [CRA: T1 General form and guide](https://www.canada.ca/en/revenue-agency/services/forms-publications/tax-packages-years/general-income-tax-benefit-package.html)
- [CRA: Understanding your slip — T4](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/tax-slips/understand-your-tax-slips/t4-slips.html)
- [CRA: My Account for Individuals](https://www.canada.ca/en/revenue-agency/services/e-services/digital-services-individuals/account-individuals.html)
- [CRA: Notice of Assessment — understanding yours](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/notice-assessment-understand.html)

---

!!! tip "Up Next: Week 3"
    **Filing Basics** — SINs, residency rules, filing deadlines, penalties for late filing, and what happens after you press submit. You'll also learn the difference between a tax return and a tax assessment.
