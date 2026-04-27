# Week 14: Month-End Close and Job Readiness — The Final Sprint

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    **Part A — Month-End Close:**

    - Execute the month-end close sequence in the right order
    - Identify and record the six types of adjusting entries
    - Produce an adjusted trial balance
    - Hand off a clean year-end file to the accountant

    **Part B — Job Readiness:**

    - Build a resume that gets bookkeeping interviews
    - Pass the bookkeeping skills test most employers use
    - Answer the 15 most common interview questions confidently
    - Understand Ontario salary benchmarks
    - Succeed in your first 90 days
    - Plan your next steps after this course

!!! tip "This is the bridge to your career"
    For 13 weeks, you've built knowledge. This week, you assemble it into the professional skill set that gets you hired. Everything in this course converges here: chart of accounts, journal entries, bank rec, AR, AP, payroll, HST, QBO. You bring them together at month-end. Then you walk into the interview prepared. Take this week seriously — it's where everything comes together.

---

# Part A — Month-End Close

---

## 14.1 What Month-End Close Actually Is

**Month-end close** is the disciplined process of finishing all bookkeeping for a period — making sure the books accurately reflect what happened, recording adjustments to align expenses and revenues with the period they belong to, and producing financial statements.

It's not a single task. It's a sequence of tasks performed in a specific order.

### Why It Matters

A properly closed month gives you:

- **Accurate financial statements** — owners can make decisions based on real numbers
- **Reliable HST returns** — accurate Payable and Receivable balances at quarter-end
- **Audit-ready records** — CRA reviews are easier when periods are properly closed
- **Smooth year-end** — December's close is just a slightly bigger version of the monthly close

A sloppy close gives you:

- Financial statements you can't trust
- HST returns with errors
- Reconciliations that fall apart
- A nightmare year-end with weeks of cleanup

### The Time Investment

For a small Ontario business, month-end close takes:

- **Simple business** (1-2 employees, few transactions): 2-4 hours
- **Moderate business** (5 employees, ~100 transactions): 4-8 hours
- **Complex business** (10+ employees, multi-location): 8-16 hours

The goal is to complete the close within **5-10 business days** of month-end. Faster is better — but never at the cost of accuracy.

---

## 14.2 The Month-End Close Sequence

Order matters. Some steps depend on others. Here's the professional sequence.

### Step 1: Confirm All Activity is Recorded (Days 1-3)

Before closing anything, ensure all transactions for the month are in QBO:

- All customer invoices issued
- All supplier bills entered (including those received in early next month for the prior month)
- All payroll runs completed and recorded
- All bank deposits and payments captured
- All expense reimbursements processed
- All transfers between accounts recorded

This step often takes the longest because it requires gathering documents.

**Common gaps:**

- Bills received in early next month for the closing month
- Owner's personal credit card with business charges not yet submitted
- Cash receipts not yet deposited

### Step 2: Reconcile Bank and Credit Card Accounts (Days 3-5)

Once all activity is recorded:

- Reconcile each bank account
- Reconcile each credit card account
- Resolve any discrepancies
- Save reconciliation reports

If bank reconciliations don't balance, do NOT proceed to financials. Fix first.

### Step 3: Review Sub-Ledger Balances (Days 5-6)

Verify these match the corresponding GL account:

- **AR Aging total** = AR balance on Trial Balance
- **AP Aging total** = AP balance on Trial Balance
- **Customer subledger** matches AR
- **Vendor subledger** matches AP

Any mismatch indicates a journal entry that bypassed the subledger — investigate and fix.

### Step 4: Record Adjusting Entries (Days 6-7)

This is the critical step that distinguishes professional bookkeeping. Six types of adjusting entries to consider — covered in detail in Section 14.3.

### Step 5: Run Adjusted Trial Balance (Day 7)

After adjusting entries:

- Trial balance should balance (total debits = total credits)
- All abnormal balances investigated
- Reasonable balances in every account

### Step 6: Produce Financial Statements (Day 7)

Run:

- Profit & Loss
- Balance Sheet

Review for reasonableness:

- Revenue trends consistent
- Expense levels appropriate
- Net income reasonable
- Asset and liability balances make sense

### Step 7: Document and Communicate (Days 7-10)

Send to the owner:

- A brief monthly summary (key metrics, any issues)
- The full financial statements
- HST return summary if applicable

Save:

- The adjusted trial balance
- Bank reconciliations
- Supporting work papers
- Source documents for the period

### Step 8: Lock the Period (Day 10)

**Settings → Account and Settings → Advanced → Close the books**

Set the closing date to the last day of the closed period. This prevents accidental edits.

---

## 14.3 The Six Types of Adjusting Entries

Adjusting entries align revenues and expenses with the period they belong to. They are the core month-end discipline.

### Type 1: Accrued Expenses

**The situation:** Expense incurred but not yet invoiced or paid.

**Examples:**

- Hydro consumed in October, invoice arrives Nov 8
- Accountant working on year-end in December, invoice in February
- Wages earned by employees in last 3 days of month, paid in next pay period

**The entry:**
```
Dr. Expense Account              [estimated amount]
     Cr. Accrued Liabilities             [estimated amount]
Memo: Estimated Oct hydro — invoice expected Nov 8
```

When the actual bill arrives next period:
```
Dr. Accrued Liabilities         [accrued amount]
     Cr. Accounts Payable                [actual amount]
```

If actual differs from estimate, adjust the difference to the appropriate expense.

### Type 2: Accrued Revenue

**The situation:** Revenue earned but not yet billed or received.

**Examples:**

- Service performed in October, invoice issued in November
- Interest earned but not yet received
- Subscription billing for service already provided

**The entry:**
```
Dr. Accounts Receivable         [amount]
     Cr. Service Revenue                 [pre-HST]
     Cr. HST Payable                     [HST]
Memo: October services for Customer X — invoice to be issued
```

When the invoice is actually issued, the AR is already there.

### Type 3: Prepaid Expense Allocation

**The situation:** Cash paid in advance for future benefit. Need to allocate to the period actually consumed.

**Examples:**

- Annual insurance premium paid January 1 — allocate 1/12 each month
- 6-month rent paid upfront — allocate 1/6 each month
- Annual software subscription — allocate 1/12 each month

**The entry:**
```
Dr. Insurance Expense             [monthly portion]
     Cr. Prepaid Insurance              [monthly portion]
Memo: October insurance allocation — 1/12 of annual premium
```

The Prepaid asset balance decreases each month as it's consumed.

### Type 4: Deferred Revenue (Unearned Revenue)

**The situation:** Cash received in advance for service not yet delivered.

**Examples:**

- Customer prepays for 6 months of service
- Annual membership fee collected upfront
- Deposit received for work to be performed later

**Initial entry (when cash received):**
```
Dr. Cash                        [amount]
     Cr. Deferred Revenue (Liability)    [amount]
Memo: Customer prepayment for Jan-June services
```

**Monthly adjusting entry as service is delivered:**
```
Dr. Deferred Revenue            [monthly portion]
     Cr. Service Revenue                 [monthly portion]
Memo: October portion of customer prepayment earned
```

By month 6, Deferred Revenue is $0 and all has been recognized as revenue.

### Type 5: Depreciation

**The situation:** Long-term assets (equipment, vehicles) lose value over time. Spread the cost over the useful life.

**Calculation (straight-line):**
```
Annual Depreciation = (Cost − Salvage Value) ÷ Useful Life in Years
Monthly Depreciation = Annual Depreciation ÷ 12
```

**The monthly entry:**
```
Dr. Depreciation Expense        [monthly amount]
     Cr. Accumulated Depreciation        [monthly amount]
Memo: October depreciation — equipment ($X) and vehicles ($Y)
```

This reduces the asset's book value (gross cost less accumulated depreciation) over time.

**Note on book vs. tax:** Straight-line depreciation is for book purposes. CCA (for tax) is calculated separately by the accountant at year-end. As bookkeeper, record straight-line monthly.

### Type 6: Inventory Adjustments

**The situation:** Inventory shrinkage, damage, write-downs to lower of cost or market.

**Common adjustments:**

- Physical count reveals less inventory than the books show (shrinkage)
- Items damaged or expired
- Items become obsolete and must be written down

**The entry:**
```
Dr. COGS - Inventory Adjustment     [amount]
     Cr. Inventory                         [amount]
Memo: October physical count — $340 shrinkage
```

For periodic inventory systems, this also includes the regular calculation of COGS at month-end.

---

## 14.4 Closing Temporary Accounts (Year-End Concept)

This is typically the **accountant's responsibility at year-end**, not a monthly task. But you should understand the concept.

### What Are "Temporary" Accounts?

- **Permanent accounts:** Assets, Liabilities, Equity (Balance Sheet) — carry their balance forward
- **Temporary accounts:** Revenue, Expenses — accumulate during the year then reset to zero

### The Closing Process

At year-end (and only at year-end), all revenue and expense balances are closed to Retained Earnings:

1. Close Revenue accounts to Income Summary
2. Close Expense accounts to Income Summary
3. Close Income Summary to Retained Earnings

After these entries:

- All Revenue accounts are at $0
- All Expense accounts are at $0
- Net Income for the year has flowed to Retained Earnings
- The new fiscal year starts fresh

### QBO Handles This Automatically

Modern accounting software (including QBO) does year-end closing automatically when you set the fiscal year. You don't manually post closing entries.

But understanding the concept helps you read prior-year balances correctly and communicate professionally with accountants.

---

## 14.5 Signature Example — Belleville Bookbindery December Close

Let's walk through a complete December month-end close (which is also year-end for a calendar-year business).

### The Business

**Belleville Bookbindery Inc.** is a small print and book restoration shop in Belleville, Ontario. December 2025 has just ended. Owner Catherine Park asks you to close December and prepare year-end for the accountant.

### Pre-Close Status

Before adjusting entries:

- Bank reconciliations for December are complete
- AR aging matches AR on Trial Balance
- AP aging matches AP on Trial Balance
- All bills entered
- Payroll for December completed

**Trial Balance before adjusting entries (key accounts):**

```
Cash:                          $18,420
AR:                             12,800
Inventory (per books):           4,650
Prepaid Insurance:               2,400  (annual policy paid Jan 1)
Equipment:                      35,000
Accumulated Depreciation:      (14,000) (through November)
AP:                              5,200
HST Payable:                     2,180
Source Deductions Payable:       1,820
Bank Loan:                      18,500
Common Shares:                     100
Retained Earnings:              24,310  (from prior year)
Revenue (YTD):                 185,400
Various expenses (YTD)
```

### Adjusting Entries Required

**Entry 1: Hydro Accrual**

December hydro invoice arrives in mid-January. Estimated $245.

```
Dec 31    Utilities                          245.00
               Accrued Liabilities                       245.00
          Memo: Estimated December hydro
```

**Entry 2: Accountant Fee Accrual**

The accountant has worked on year-end planning in December. Estimated fee: $850.

```
Dec 31    Professional Fees                  850.00
               Accrued Liabilities                       850.00
          Memo: Estimated accountant fee for year-end work
```

**Entry 3: Accrued Wages**

Last pay period ended Dec 26. Three days (Dec 29-31) earned but not paid until next period. Two employees averaging $180/day each. Total: 3 days × $180 × 2 = $1,080 plus employer costs.

```
Dec 31    Wages Expense                     1,080.00
          Employer CPP Expense                 61.50
          Employer EI Expense                  24.85
          Vacation Pay Expense                 43.20  (4% accrual)
               Accrued Wages Payable                  1,080.00
               Source Deductions Payable                86.35
               Vacation Pay Accrual                     43.20
          Memo: Accrue Dec 29-31 wages and related costs
```

When the actual pay period (Jan 1-2) is paid in early January, the accrual will be cleared.

**Entry 4: Prepaid Insurance Allocation**

Annual policy of $2,400 paid Jan 1, 2025. Each month should expense $200. Through November, $2,200 should have been expensed (11 months × $200). December's portion: $200.

```
Dec 31    Insurance Expense                  200.00
               Prepaid Insurance                          200.00
          Memo: December insurance allocation — final month
```

After this entry, Prepaid Insurance = $0 (the full year has been consumed). When the new policy is paid in January 2026, it goes to Prepaid Insurance again.

**Entry 5: Depreciation**

Total equipment cost: $35,000. Useful life: 10 years. Salvage value: $5,000.
- Annual depreciation: ($35,000 − $5,000) ÷ 10 = $3,000
- Monthly: $250

```
Dec 31    Depreciation Expense               250.00
               Accumulated Depreciation                  250.00
          Memo: December depreciation on equipment
```

**Entry 6: Customer Deposit Earned (Deferred Revenue)**

In November, a customer paid $1,800 for a custom binding job to be completed in December and January. Half the work was done in December.

```
Dec 31    Deferred Revenue                   900.00
               Service Revenue                            900.00
          Memo: December portion of advance customer payment
```

**Entry 7: Inventory Count Adjustment**

Books show $4,650 inventory. Physical count reveals $4,180. Shrinkage of $470.

```
Dec 31    COGS - Inventory Adjustment        470.00
               Inventory                                  470.00
          Memo: December physical count — shrinkage
```

**Entry 8: Bad Debt Write-Off**

A customer's $565 invoice (including $65 HST) has been overdue for 6 months with no collection success. Catherine decides to write it off.

```
Dec 31    Bad Debt Expense                   500.00
          HST Payable                          65.00
               Accounts Receivable                       565.00
          Memo: Write-off of uncollectable account — Customer X
```

**Entry 9: Owner's Year-End Bonus**

Catherine takes an annual bonus of $5,000 in December. (As a corporation owner, this is paid through payroll with full deductions.)

```
Dec 31    Salary Expense                    5,000.00
               Source Deductions Payable               1,500.00
               Bank Account                            3,500.00
          Memo: Catherine's year-end bonus — December
```

**Entry 10: Owner Payroll Employer Costs**

Plus the employer's matching CPP, EI on the bonus (assume $250 employer CPP, $115 employer EI):

```
Dec 31    Employer CPP Expense                250.00
          Employer EI Expense                 115.00
               Source Deductions Payable                 365.00
          Memo: Employer costs on Catherine's bonus
```

**Entry 11: Accrued Vacation Year-End Verification**

Through the year, employees earned vacation but didn't take it. Accrual sits at $1,420. After review against payroll register, accrual is verified accurate. No additional entry needed.

### After All Adjustments

Adjusted Trial Balance balances (debits = credits) and reflects the period's true activity.

Key year-end totals (illustrative):

- Total Revenue: $186,300 (was $185,400 + $900 from deferred revenue earned)
- Total Expenses (after adjustments): $158,720
- Net Income for the year: $27,580

### Year-End Reports Produced

**Income Statement for Year Ended December 31, 2025:**

```
Revenue                                  $186,300

COST OF GOODS SOLD
  Materials and supplies                   (47,200)
Gross Profit                              139,100

OPERATING EXPENSES
  Wages and benefits                       58,400
  Rent                                     14,400
  Utilities                                 3,200
  Insurance                                 2,400
  Telephone & Internet                      1,680
  Bank Charges                                240
  Bad Debt                                    500
  Professional Fees                         3,200
  Office Supplies                             960
  Advertising                               2,400
  Depreciation                              3,000
  Inventory Shrinkage                         470
  Total Operating Expenses                 90,850

Operating Income                           48,250

Interest Expense                           (1,800)
Net Income (before tax)                  $46,450

(Tax provision left for accountant)
```

**Balance Sheet at December 31, 2025:**

```
ASSETS
Current Assets:
  Cash                                     $18,420
  Accounts Receivable (after write-off)     12,235
  Inventory (after shrinkage)                4,180
  HST Receivable (ITC)                       1,850
  Total Current Assets                      36,685

Non-Current Assets:
  Equipment                                 35,000
  Accumulated Depreciation                 (14,250)
  Net Equipment                             20,750

TOTAL ASSETS                              $57,435

LIABILITIES
Current Liabilities:
  Accounts Payable                           5,200
  Accrued Liabilities                        2,175
  HST Payable (after bad debt adj)           2,115
  Source Deductions Payable                  3,771
  Vacation Pay Accrual                       1,463
  Accrued Wages Payable                      1,080
  Total Current Liabilities                 15,804

Non-Current Liabilities:
  Bank Loan                                 18,500

TOTAL LIABILITIES                          34,304

EQUITY
  Common Shares                                100
  Retained Earnings (Beginning)             24,310
  Net Income for the Year                  (1,279)  (after tax provision)
  Total Equity                              23,131

TOTAL LIABILITIES + EQUITY                $57,435 ✓
```

(Numbers are illustrative — in practice everything ties exactly.)

### Hand-Off to the Accountant

For year-end, prepare the year-end package for the accountant:

1. **Adjusted trial balance**
2. **Income statement and balance sheet** (draft)
3. **Bank reconciliations** for December and any open issues from prior months
4. **AR aging**
5. **AP aging**
6. **Vendor statements** that match the books
7. **Notes on unusual items** — the bad debt write-off, deferred revenue earned, customer prepayment, etc.
8. **List of items requiring accountant attention** — CCA calculation, corporate tax provision, year-end accruals you flagged

The accountant takes this and:

- Reviews and adjusts as needed
- Calculates corporate tax (T2)
- Calculates CCA for tax purposes
- Files the corporate tax return
- Issues final reviewed financial statements

If your year-end package is clean and well-organized, the accountant's work is faster, the fee is lower, and you've earned trust for next year.

---

# Part B — Job Readiness

---

## 14.6 What Ontario Employers Actually Want

After 13+ weeks of building skills, here's what employers in Ontario look for in a bookkeeper.

### Hard Skills (What You Can Do)

In order of importance:

1. **Bank reconciliation** — every employer tests this
2. **Journal entries** — must be confident with debits/credits
3. **HST recording and return preparation** — Ontario-specific
4. **Payroll fundamentals** — at minimum, understanding the process
5. **AR/AP processing** — daily work
6. **Financial statement preparation** — read and produce
7. **QuickBooks Online proficiency** — most common software
8. **Month-end close discipline** — separates pros from amateurs

### Soft Skills (How You Work)

Equally important:

- **Attention to detail** — bookkeeping demands precision
- **Discretion** — handling confidential financial data
- **Communication** — explaining issues to non-financial owners
- **Time management** — meeting deadlines (HST, payroll, T4s)
- **Problem-solving** — investigating reconciliation differences
- **Professional ethics** — refusing to commit fraud, even when pressured
- **Adaptability** — every business uses slightly different processes

### What Junior Bookkeepers Typically Do

In an entry-level role:

- Daily transaction entry (invoices, bills, receipts)
- Bank feed categorization
- Basic AR follow-up (sending reminder emails)
- Bill payment processing
- Bank reconciliation
- Monthly closing tasks under supervision
- Filing and document management
- Liaising with the accountant on basic items

You'll start under supervision. After 3-6 months, you'll be more independent. After 12-18 months, you may be supervising new juniors yourself.

---

## 14.7 The Bookkeeping Skills Test

Most Ontario accounting firms test candidates with a practical skills test. Here's what to expect.

### Common Test Components

**Component 1: Journal Entries (10-15 minutes)**

You're given 5-10 transaction descriptions. Write the journal entry for each.

**Sample question:** *"Customer pays $1,130 by Interac for an oil change. Write the journal entry."*

Your answer:
```
Dr. Cash                       1,130.00
     Cr. Service Revenue              1,000.00
     Cr. HST Payable                    130.00
```

**Component 2: Bank Reconciliation (15-20 minutes)**

You're given a book balance, a bank statement balance, and a list of items (outstanding cheques, deposits in transit, bank charges, NSF, etc.). Prepare the reconciliation. Both adjusted balances must agree.

**Component 3: HST Return Calculation (5-10 minutes)**

Given total taxable sales for the quarter, total HST collected, and total HST paid on purchases — calculate net tax owed (or refund).

**Component 4: AR Aging Interpretation (5 minutes)**

Given an aging report, identify which customers are at risk, which need immediate follow-up, and the implications for cash flow.

**Component 5: QuickBooks Online (Live Demo)**

Sometimes the test happens in QBO directly: set up a customer, enter an invoice, receive payment, run a report.

### Tips for the Skills Test

1. **Read carefully** before answering
2. **Show your work** — especially for journal entries
3. **State assumptions** if needed (e.g., "Assuming HST applies at 13%")
4. **Don't rush** — accuracy matters more than speed
5. **Ask clarifying questions** if the scenario is ambiguous

If you've completed all 14 weeks of this course, you have the skills to pass any standard bookkeeping skills test.

---

## 14.8 The Resume — Getting the Interview

Your resume's job: get you in the door for an interview. Here's what works.

### The Structure

**Header:**

- Full name
- Phone number
- Email
- LinkedIn URL (optional but helpful)
- City, province (no full address)

**Summary (2-3 sentences):**

State who you are professionally. Don't list duties — state value.

*Example:*
> "Detail-oriented bookkeeper with hands-on experience in QuickBooks Online, Ontario HST compliance, and full-cycle bookkeeping. Recently completed comprehensive bookkeeping certification covering AR/AP, bank reconciliation, payroll, and month-end close. Looking to apply newly developed skills in a growth-oriented Ontario small business or accounting firm."

**Skills Section:**

A bulleted list of relevant skills:

```
Bookkeeping & Accounting
- Full-cycle bookkeeping (transactions to financial statements)
- HST returns and CRA compliance (Ontario)
- AR/AP management with three-way matching
- Bank and credit card reconciliation
- Payroll fundamentals (CPP, EI, income tax)
- Financial statement preparation

Software & Tools
- QuickBooks Online (intermediate)
- Microsoft Excel (intermediate)
- CRA My Business Account
- Sage Accounting (familiar)
```

**Experience Section:**

If you have prior bookkeeping experience, list it. If not, list relevant admin/finance experience and translate it.

*Example without bookkeeping experience:*

```
Office Administrator | ABC Company | 2022-Present
- Processed daily customer invoices and supplier payments
- Maintained spreadsheets tracking $250K monthly cash flow
- Reconciled monthly credit card statements with 100% accuracy
- Prepared quarterly reports for management review
```

That's bookkeeping-adjacent work — show it.

**Education / Training:**

```
Canadian Bookkeeping — Ontario Focus
14-week comprehensive program
Topics: Full accounting cycle, HST, AR/AP, bank reconciliation, 
payroll, QuickBooks Online, month-end close

Bachelor's Degree (or other relevant credential), Year
University Name
```

**Optional:**

- QBO ProAdvisor certification (if completed)
- IPBC student member (if applicable)
- Any other relevant credentials

### What NOT to Include

- Photo (Canadian privacy norms)
- Age, marital status, or other personal info
- Hobbies (unless directly relevant)
- References (provide on request)
- Salary expectations
- Long irrelevant work history (focus on the last 10 years)

### Format Tips

- Single page (or two for senior roles)
- Clean, simple layout — no fancy graphics
- Standard fonts (Arial, Calibri)
- PDF format when sending
- Update for each application — tailor the summary to the job description

---

## 14.9 The 15 Most Common Interview Questions

Practice answers for these — they'll come up.

### Question 1: "Tell me about yourself."

**Strategy:** 60-90 seconds. Professional summary, relevant experience, what you're looking for now.

*Sample answer:*
> "I have a background in administration and finance support, where I've handled invoicing, supplier payments, and basic reconciliations. I recently completed a 14-week intensive bookkeeping program focused on Ontario small business compliance — HST, payroll, full-cycle bookkeeping in QuickBooks Online. I'm looking for an entry-level bookkeeping role where I can apply these skills and grow into more responsibility over time."

### Question 2: "Why bookkeeping?"

*Sample answer:*
> "I enjoy the precision of bookkeeping — the way every transaction has a story, and the books eventually tell the truth about how a business is performing. I like systems, organization, and the discipline of getting it right the first time. Bookkeeping rewards careful work, and I want to build a career around that."

### Question 3: "What's your experience with QuickBooks Online?"

**Strategy:** Be specific. Don't oversell what you can't do.

*Sample answer:*
> "I'm comfortable with the full QBO workflow: setting up customers and vendors, processing invoices and bills, recording payments, reconciling bank and credit card accounts, and running reports. I've worked through a complete fiscal year of practice scenarios, from setup through year-end. I'd consider myself intermediate — confident with daily operations and month-end close, still learning advanced features like class tracking and complex reporting."

### Question 4: "Walk me through a bank reconciliation."

*Sample answer:*
> "Sure. I start by getting the bank statement and the QBO ledger for the same period. I check off every transaction that appears on both. The leftovers fall into four categories: outstanding cheques and deposits in transit are timing items that adjust the bank side; bank charges, interest, NSFs, and pre-authorized payments are book-side adjustments that need journal entries; and book errors are corrections to the books. I prepare the formal reconciliation with both columns adjusted, confirm they agree, then record the journal entries for the book-side items and verify the GL ties to the adjusted balance. After that, I save the reconciliation report and lock the period."

### Question 5: "What's the difference between cash and accrual accounting?"

*Sample answer:*
> "Cash basis records transactions when cash moves — revenue when collected, expenses when paid. Accrual basis records when the economic event occurs — revenue when earned, expenses when incurred — regardless of when cash moves. Most Ontario corporations and businesses use accrual because CRA requires it and it gives a more accurate picture of profitability. The bookkeeper's job is to track AR and AP carefully so accrual entries match reality."

### Question 6: "How do you handle HST on a sale?"

*Sample answer:*
> "When the business makes a $1,130 sale at 13% HST, the customer pays $1,130 total: $1,000 of revenue and $130 of HST. I record cash or AR for the full $1,130, credit Service Revenue for $1,000, and credit HST Payable for $130. The HST isn't revenue — it's a liability owed to CRA, held until the next remittance. The single biggest mistake to avoid is putting the full $1,130 in revenue, which inflates income and understates HST."

### Question 7: "How do you handle an NSF cheque?"

*Sample answer:*
> "Two journal entries. First, reverse the original receipt — debit Accounts Receivable for the full amount, credit Cash. The customer's balance is back on the books. Second, record the bank's NSF fee — debit Bank Charges, credit Cash. The HST isn't reversed because the supply still occurred — only the cash situation has changed. Then I'd contact the customer to arrange payment, possibly by certified cheque or wire, and flag them for tighter terms going forward."

### Question 8: "What's a deposit in transit?"

*Sample answer:*
> "A deposit recorded in the books but not yet on the bank statement. Typically happens when a deposit is made on the last day of the month — the bank doesn't process it until the next business day, but it's already in the books. On the reconciliation, it adds to the bank balance to align with what the books show. The next month, it appears on the statement and gets cleared."

### Question 9: "Tell me about a time you found an error."

**Strategy:** Use a specific example. Show methodical investigation.

*Sample answer:*
> "During a reconciliation, the difference was $90 — divisible by 9, which is a transposition signal. I scanned recent entries and found a cheque to a vendor entered as $135 that the bank cleared for $153 — digit reversal. I corrected the entry and the rec balanced. The lesson: when something doesn't balance, the math itself often tells you the type of error."

### Question 10: "How do you stay organized with multiple clients?"

*Sample answer:*
> "Each client has a dedicated workflow — recurring tasks scheduled, source documents organized, deadlines tracked. I use a shared calendar for HST due dates, payroll remittance dates, and month-end deadlines for each client. I batch similar tasks across clients — for example, doing all month-end bank reconciliations on the same days. And I document my process for each client so anyone can step in if needed."

### Question 11: "What do you do if you can't reconcile a difference?"

*Sample answer:*
> "I systematically eliminate possibilities. First, I verify totals and look for transposition errors (divisible by 9). Then I search for the specific amount in the bank feed and books. If I can't find it within reasonable time, I document what I've checked and flag it. I don't file a reconciliation with a forced balance. I'd rather deliver a slightly delayed but accurate result than rush an unreliable one. If urgent, I'd communicate the situation to the client and provide preliminary numbers marked as draft."

### Question 12: "How do you handle confidential information?"

*Sample answer:*
> "Bookkeepers see sensitive data — bank balances, employee salaries, owner draws. I treat all of it as confidential. I don't discuss client information outside the office, I use strong passwords, I don't leave documents on my desk unattended, and I don't share information beyond what's necessary. Discretion is foundational to bookkeeping."

### Question 13: "What's your weakness?"

**Strategy:** A real weakness with how you address it.

*Sample answer:*
> "I'm still building speed in QBO. While I'm confident with accuracy, an experienced bookkeeper will move faster through routine entries. I'm working on this through repetition — every transaction I enter, I'm building speed. I expect to be at full pace within a few months on the job."

### Question 14: "Why this company?"

**Strategy:** Research the company. Match their work to your interests.

*Sample answer:*
> "I've researched your firm, and I'm impressed by your focus on small Ontario businesses. The work seems hands-on — actually understanding clients' businesses rather than just data entry. That fits how I want to work. I also see you offer professional development, which matters to me long-term."

### Question 15: "Do you have any questions for us?"

**ALWAYS have questions.** Examples:

- "What does a typical day look like for the person in this role?"
- "How does this role grow over time?"
- "What software and tools does the team use?"
- "How are clients assigned, and how is workload managed?"
- "What's the most important quality the right hire brings?"

Avoid asking about salary or vacation in the first interview.

---

## 14.10 Ontario Salary Benchmarks

Current ranges for Ontario bookkeepers — verify with current data on Indeed, Glassdoor, Robert Half before negotiating.

### Entry-Level (0-2 years)

| Setting | Annual Salary Range |
|---|---|
| Small business in-house | $40,000 - $50,000 |
| Accounting firm | $44,000 - $58,000 |
| Mid-size company in-house | $44,000 - $54,000 |

### Intermediate (2-5 years)

| Setting | Annual Salary Range |
|---|---|
| Small business in-house | $50,000 - $62,000 |
| Accounting firm | $54,000 - $70,000 |
| Mid-size company in-house | $58,000 - $72,000 |

### Senior Bookkeeper (5+ years)

| Setting | Annual Salary Range |
|---|---|
| Small business / independent | $58,000 - $78,000 |
| Accounting firm | $68,000 - $88,000+ |
| Larger company / management | $72,000 - $98,000 |

### Independent Practice

Independent bookkeepers managing 10-20 clients can earn $80,000 - $150,000+ depending on client mix and pricing.

### Factors That Affect Salary

- **Geography:** Toronto/GTA pays more than rural Ontario
- **Industry:** Construction, manufacturing pay slightly more than services
- **Specialization:** Payroll specialists, HST experts earn premium
- **Software certifications:** QBO ProAdvisor, Sage certifications add value
- **Designation:** CPB (Certified Professional Bookkeeper) adds 10-15%

### Negotiating Tips

- Research before the interview (Glassdoor, salary calculators)
- Don't accept the first offer
- Counter with specifics: "Based on Ontario market data for entry-level QBO bookkeepers, I was hoping for closer to $X"
- Consider total package (benefits, vacation, training budget)
- Get the offer in writing before accepting

---

## 14.11 The First 90 Days on the Job

How to succeed in your new role.

### Days 1-7: Listen and Learn

- Don't assume — ask
- Take detailed notes on processes
- Meet with each team member
- Review existing documentation
- Read past financial statements for the largest clients
- Don't change anything yet

### Days 8-30: Establish Routine

- Master the daily workflow for assigned clients
- Build relationships with clients (introductions via the manager)
- Complete first month-end close under supervision
- Identify any process improvements (mentally — don't propose yet)
- Ask questions liberally

### Days 31-60: Take Ownership

- Handle full client cycle independently with supervision
- Complete first quarter-end (HST, payroll quarterly remittance if applicable)
- Begin proposing small process improvements
- Document your work for handoff/audit
- Build trust through consistent accuracy

### Days 61-90: Add Value

- Complete second month-end with confidence
- Begin training/mentoring others if junior staff arrive
- Take on additional client responsibility
- Prepare for quarterly review
- Set goals for the next 6 months

### Soft Skills That Make You Successful

- **Be honest about mistakes.** Don't hide errors. Disclose, fix, learn.
- **Ask clarifying questions.** Better than assuming and being wrong.
- **Maintain confidentiality.** Even within the office.
- **Be punctual.** Especially for client meetings.
- **Document everything.** Your future self will thank you.
- **Follow up promptly.** Email returned within 24 hours.

---

## 14.12 What to Do After This Course

You've completed 14 weeks. You're job-ready. Here's how to keep growing.

### Immediate (Next 1-3 Months)

- **Complete QBO ProAdvisor certification** (free, 1 day, looks great on resume)
- **Update LinkedIn** with course completion and skills
- **Apply to 5-10 entry-level bookkeeping roles weekly**
- **Practice the skills test** with sample scenarios
- **Connect with local bookkeepers** for advice and referrals

### Short Term (3-12 Months on the Job)

- **Build muscle memory** through daily QBO work
- **Learn one specialty deeply** — payroll, HST, or industry-specific bookkeeping
- **Complete IPBC student membership** (Institute of Professional Bookkeepers of Canada)
- **Read CRA bulletins monthly** to stay current on tax changes
- **Build a network** of accountants and other bookkeepers

### Medium Term (1-3 Years)

- **Pursue CPB designation** (Certified Professional Bookkeeper) through IPBC — significant career boost
- **Consider specialization** — payroll specialist, controller-track, industry expert
- **Decide independent vs. employee path** based on lifestyle preferences
- **Build emergency fund** if considering independent practice

### Long Term (3+ Years)

Career paths from bookkeeping include:

- **Senior bookkeeper or controller** at a growing company
- **Independent bookkeeping practice** with 10-20 clients
- **Accounting firm partner-track** (with additional credentials)
- **CPA designation** if pursuing accounting profession formally
- **Specialized consulting** (forensic, cash flow, business advisory)

The skills you've built in 14 weeks open doors. What you do with them is up to you.

---

## 14.13 The Final Mastery Quiz — 20 Questions

This quiz integrates everything from the entire course. **Score 16/20 or better and you're job-ready.**

**Question 1**
State the accounting equation and explain why it can never be broken.

??? answer
    **Assets = Liabilities + Equity**

    Every transaction must preserve this equation. If one side changes, the other must change equally. The equation reflects the reality that everything a business owns came from somewhere — either borrowed (liability) or contributed/earned (equity).

---

**Question 2**
A business sells $1,500 of taxable services in Ontario for cash. Write the journal entry.

??? answer
    ```
    Dr. Cash                       1,695.00
         Cr. Service Revenue              1,500.00
         Cr. HST Payable                    195.00
    ```

    Total: $1,500 + 13% HST ($195) = $1,695.

---

**Question 3**
A sole proprietor takes $2,000 from the business for personal use. What's the journal entry?

??? answer
    ```
    Dr. Owner's Draws        2,000.00
         Cr. Cash                       2,000.00
    ```

    Owner's Draws is a contra-equity account, NOT an expense. For a corporation, this would go to Shareholder Loan instead.

---

**Question 4**
What are the four categories of reconciling items in a bank reconciliation?

??? answer
    1. **Outstanding cheques** — recorded in books, not yet cleared bank (bank-side, subtract)
    2. **Deposits in transit** — recorded in books, not yet on statement (bank-side, add)
    3. **Bank-side adjustments** — on statement, not in books (bank charges, interest, NSF, pre-auth) (book-side, journal entries)
    4. **Book-side errors** — mistakes in the books (book-side, correct)

---

**Question 5**
A customer's $1,000 cheque (plus $130 HST) bounces NSF. The bank charges a $40 fee. Write all required journal entries.

??? answer
    Reverse the original receipt:
    ```
    Dr. Accounts Receivable    1,130.00
         Cr. Cash                          1,130.00
    ```

    Record the NSF fee:
    ```
    Dr. Bank Charges Expense      40.00
         Cr. Cash                             40.00
    ```

    HST is NOT reversed — the supply still occurred.

---

**Question 6**
A client's HST Payable for the quarter is $5,800. HST Receivable is $2,200. What's the remittance to CRA?

??? answer
    **$5,800 − $2,200 = $3,600 owed to CRA.**

    Journal entry:
    ```
    Dr. HST Payable           5,800.00
         Cr. HST Receivable           2,200.00
         Cr. Cash                     3,600.00
    ```

---

**Question 7**
What's Ontario's overtime threshold under the ESA?

??? answer
    **44 hours per week.** Overtime is paid at 1.5× the regular rate for hours worked beyond 44 in a single week.

---

**Question 8**
An employee earns $2,500 bi-weekly. Calculate their CPP contribution.

??? answer
    ```
    Pensionable earnings:           $2,500.00
    - Basic exemption (bi-weekly):    $134.62
    = Contributory earnings:        $2,365.38
    × 5.95%
    = CPP contribution:              $140.74
    ```

---

**Question 9**
What's the deadline for a Regular remitter to remit October's payroll source deductions?

??? answer
    **November 15.** Regular remitters (AMWA under $25,000) remit by the 15th of the month following the payroll period.

---

**Question 10**
Why are unremitted source deductions especially serious for corporate directors?

??? answer
    **Personal liability.** Corporate directors are personally liable for unremitted source deductions under the Income Tax Act — even after corporate bankruptcy. The limited liability that protects directors from most corporate debts does NOT apply to source deductions.

---

**Question 11**
Apply CRA's four-factor test: A worker comes to the office Monday-Friday 9-5, uses the company's computer, takes direction from the manager, has worked there for 3 years, and has no other clients. Are they an employee or contractor?

??? answer
    **Employee.** All four factors point to employment:
    - Control: Strong employer control
    - Tools: Provided by employer
    - Subcontracting: Cannot substitute
    - Risk: Receives wage regardless of business performance

    Misclassifying this person as a contractor exposes the business to retroactive payroll tax assessments with penalties.

---

**Question 12**
A vendor offers 2/10 Net 30 on a $5,000 invoice. Should the business take the discount? Why?

??? answer
    **Yes.** Annualized return:
    - 2% discount for paying 20 days early
    - Annualized: 2% × (365/20) = **36.5%**

    Any business with cash or borrowing costs below 36.5% should take it. The discount saves $100 in real dollars.

---

**Question 13**
A trial balance shows total debits of $87,360 and total credits of $87,450. What does this tell you?

??? answer
    The trial balance is out of balance by $90. Since $90 is divisible by 9, this signals a likely **transposition error** — digits reversed somewhere (e.g., $54 entered as $45).

    Action: Search recent entries for amounts that look transposed.

---

**Question 14**
What's the difference between an Income Statement and a Balance Sheet?

??? answer
    **Income Statement** measures profitability over a period (a month, quarter, or year). Shows Revenue − Expenses = Net Income.

    **Balance Sheet** shows financial position at a point in time. Shows Assets = Liabilities + Equity.

    Net Income from the Income Statement flows to Retained Earnings on the Balance Sheet. The two statements are mathematically connected.

---

**Question 15**
A bookkeeper handles AR, makes deposits, AND reconciles the bank. What's the internal control concern?

??? answer
    **No segregation of duties — classic fraud risk.** One person controlling all three functions can commit "lapping" fraud (stealing one customer's payment, covering it with another's).

    Minimum mitigation: owner reviews the bank reconciliation monthly, even if the bookkeeper prepares it.

---

**Question 16**
A client's QBO file shows $4,500 in "Undeposited Funds" at month-end. What does this likely mean and what should you do?

??? answer
    Customer payments were marked "Deposit to Undeposited Funds" but never actually combined into a bank deposit and recorded.

    **Action:** Investigate each entry, match to actual bank deposits, and reclassify properly. Undeposited Funds should be near $0 at month-end.

---

**Question 17**
A client's hydro bill for October hasn't arrived by month-end. Estimated amount: $245. What's the adjusting entry?

??? answer
    ```
    Dr. Utilities Expense        245.00
         Cr. Accrued Liabilities         245.00
    Memo: Estimated October hydro
    ```

    When the actual bill arrives:
    ```
    Dr. Accrued Liabilities      245.00
         Cr. Accounts Payable           245.00 (or actual amount)
    ```

---

**Question 18**
Annual insurance of $2,400 was paid January 1. What's the monthly adjusting entry, and what's the Prepaid Insurance balance after October's entry?

??? answer
    Monthly entry:
    ```
    Dr. Insurance Expense        200.00
         Cr. Prepaid Insurance           200.00
    ```

    After 10 months (Jan-Oct), Prepaid Insurance = $2,400 − $2,000 = **$400** remaining (Nov + Dec).

---

**Question 19**
A customer's $1,808 invoice (including $208 HST) becomes uncollectable. Write the bad debt write-off entry.

??? answer
    ```
    Dr. Bad Debt Expense       1,600.00
    Dr. HST Payable              208.00
         Cr. Accounts Receivable         1,808.00
    ```

    The HST recovery flows through the next HST return, reducing net tax owed.

---

**Question 20**
You've completed a complete month-end close. The trial balance balances. The Balance Sheet balances. The reconciliation is signed off. What's the very last thing you should do?

??? answer
    **Set the closing date in QBO** to lock the period.

    Settings → Account and Settings → Advanced → Close the books → set date to month-end.

    This prevents anyone (including future you) from accidentally editing transactions in the closed period, which would unwind the reconciliation and corrupt prior reports.

---

## 14.14 The 14-Week Mastery Checklist

Before applying for jobs, confirm you can do all of the following without prompts:

**Foundation:**

- ☐ Explain the accounting equation and apply it to any transaction
- ☐ Distinguish bookkeeping from accounting
- ☐ Name the 5 stages of the bookkeeping cycle
- ☐ Distinguish accrual from cash basis

**Chart of Accounts:**

- ☐ Build a chart of accounts from scratch
- ☐ Apply numbering conventions
- ☐ Identify Ontario-specific accounts (HST, WSIB, EHT, Source Deductions)

**Journal Entries:**

- ☐ State debit/credit rules from logic
- ☐ Record any transaction with balanced entries
- ☐ Handle HST on sales and purchases
- ☐ Handle compound entries
- ☐ Recognize common beginner errors

**General Ledger and Trial Balance:**

- ☐ Post entries to the GL
- ☐ Prepare a trial balance
- ☐ Identify the 4 errors a TB won't catch
- ☐ Apply diagnostic tests (divisible by 9, by 2)

**Financial Statements:**

- ☐ Prepare an Income Statement
- ☐ Prepare a Balance Sheet
- ☐ Explain how Net Income flows to Retained Earnings
- ☐ Handle straight-line depreciation
- ☐ Explain the profit-vs-cash gap

**HST:**

- ☐ Distinguish taxable, exempt, zero-rated supplies
- ☐ Apply the $30,000 registration threshold
- ☐ Record HST on sales and purchases
- ☐ Apply the 50% rule for M&E
- ☐ Complete the HST return (GST34)
- ☐ Know when Quick Method beats Regular Method

**Accounts Receivable:**

- ☐ Manage the AR cycle from invoice to receipt
- ☐ Read and act on an aging report
- ☐ Handle NSF cheques
- ☐ Write off bad debts with HST adjustment
- ☐ Record early payment discounts
- ☐ Identify AR fraud risks (lapping)

**Accounts Payable:**

- ☐ Apply three-way matching
- ☐ Make smart payment timing decisions
- ☐ Calculate the value of early payment discounts (36.5%)
- ☐ Handle vendor credits and disputes
- ☐ Accrue month-end expenses
- ☐ Identify AP fraud patterns

**Bank Reconciliation:**

- ☐ Categorize reconciling items correctly
- ☐ Prepare the reconciliation in standard format
- ☐ Handle NSF, pre-authorized payments, book errors
- ☐ Record book-side adjusting entries
- ☐ Reconcile a credit card account
- ☐ Use QBO's reconciliation tool

**Payroll:**

- ☐ Distinguish employees from contractors
- ☐ Calculate gross pay (salary, hourly, overtime)
- ☐ Calculate CPP (with basic exemption)
- ☐ Calculate EI
- ☐ Use PDOC for income tax
- ☐ Calculate employer costs (CPP match, EI 1.4×, WSIB, EHT)
- ☐ Write payroll journal entries
- ☐ Determine remittance schedules and deadlines
- ☐ Issue ROEs within 5 days of interruption
- ☐ Produce T4 slips and reconcile to remittances

**QuickBooks Online:**

- ☐ Set up a new QBO file with Ontario settings
- ☐ Configure HST and account numbers
- ☐ Process the sales workflow (invoice → payment → deposit)
- ☐ Process the expense workflow (bill → payment, or expense)
- ☐ Manage bank feeds without over-reliance
- ☐ Reconcile in QBO
- ☐ Run and customize essential reports
- ☐ Use Reclassify Transactions and the Audit Log
- ☐ Clean up a messy QBO file

**Month-End Close:**

- ☐ Execute the close sequence in order
- ☐ Record the 6 types of adjusting entries
- ☐ Produce an adjusted trial balance
- ☐ Hand off a year-end package to the accountant

**Job Readiness:**

- ☐ Pass a bookkeeping skills test
- ☐ Articulate experience in interview format
- ☐ Negotiate salary based on Ontario benchmarks
- ☐ Know what to do in your first 90 days

If every box is checked — you're ready. Apply for your first role with confidence.

---

## 14.15 Final Words

You started this course knowing nothing about bookkeeping. You finish it ready to work as a professional bookkeeper in Ontario.

That's not a small thing. The skills you've built — debits and credits, reconciliations, HST, payroll, financial statements, QuickBooks Online — are the same skills experienced bookkeepers use every day. The difference between you and them is hours behind the keyboard. That difference closes faster than you think.

Your first job will be humbling. You'll make mistakes. Senior bookkeepers will catch errors you didn't see. That's normal. Take feedback graciously, document what you learn, and keep showing up. Six months in, you'll be doing things you couldn't imagine today. Two years in, you'll be the senior bookkeeper teaching someone else.

Bookkeeping is a career that rewards patience, precision, and trust. Every business needs accurate books. Every business owner wants someone they can rely on. Be that person.

Good luck. You're ready.

---

## 📚 Final Reading List

For ongoing learning after this course:

- [CRA: Tax information for businesses](https://www.canada.ca/en/services/taxes/business.html)
- [CRA: Payroll information for employers](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll.html)
- [Institute of Professional Bookkeepers of Canada (IPBC)](https://ipbc.ca) — student and full membership
- [QuickBooks ProAdvisor Program](https://quickbooks.intuit.com/ca/accountants/) — free certification
- [Ontario Ministry of Labour: Employment Standards](https://www.ontario.ca/page/your-guide-employment-standards-act-0)
- [WSIB Ontario](https://www.wsib.ca)
- CPA Canada publications and webinars
- Industry-specific resources (construction, healthcare, retail) as you specialize

---

!!! tip "Course Complete"
    **Congratulations.** You've completed a comprehensive 14-week bookkeeping program covering everything an entry-level Ontario bookkeeper needs to know. From the accounting equation in Week 1 to year-end close and job readiness in Week 14, you've built real, marketable skill.

    Now go get hired. The Ontario small business community needs good bookkeepers.
