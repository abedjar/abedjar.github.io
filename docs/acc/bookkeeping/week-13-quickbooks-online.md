# Week 13: QuickBooks Online — The Complete Working Toolkit

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Choose the right QBO subscription plan for a given client
    - Set up a new QBO company file from scratch with correct Ontario settings
    - Configure the chart of accounts, HST, and fiscal year settings
    - Connect bank feeds and review/categorize imported transactions intelligently
    - Process the full sales workflow (customers → invoices → payments → deposits)
    - Process the full expense workflow (vendors → bills → bill payments)
    - Reconcile bank and credit card accounts using QBO's reconciliation tool
    - Run and customize the essential reports
    - Fix common QBO errors using the right method (edit vs. void vs. delete)
    - Use the Audit Log to track changes and detect issues
    - Apply efficiency habits that separate fast users from slow ones
    - Clean up a messy QBO file inherited from a previous bookkeeper

!!! tip "Why QBO is the software you must master"
    Roughly 80% of Ontario small business bookkeeping jobs use QuickBooks Online. Sage, Xero, FreshBooks, and others exist — but QBO is the dominant platform. Every interview will ask: "Are you comfortable with QuickBooks Online?" If you can confidently say "yes" and demonstrate it, you've cleared a major hiring hurdle. This week makes "yes" honest.

---

## 13.1 QuickBooks Online — Plans and Pricing

QuickBooks Online has multiple subscription tiers. As a bookkeeper, you need to know which plan fits which type of business.

### The Plans (As of Late 2025)

| Plan | Monthly Cost | Key Features | Typical Client |
|---|---|---|---|
| **Self-Employed** | ~$15 | Mileage tracking, basic income/expense, no balance sheet | Sole proprietors, freelancers |
| **Simple Start** | ~$30 | Income, expenses, invoices, basic reports — no AP, no inventory | Smallest businesses, sole proprietors |
| **Essentials** | ~$55 | Adds bills (AP), multi-currency, time tracking | Most small businesses |
| **Plus** | ~$85 | Adds inventory, project profitability, class/location tracking | Growing businesses, contractors |
| **Advanced** | ~$200 | Adds custom fields, batch invoicing, dedicated support | Larger small businesses |

*Prices are approximate and frequently change. Always verify current pricing.*

### Choosing the Right Plan

**Self-Employed:** Only for individual freelancers without a balance sheet need. Doesn't produce a balance sheet at all. Limited use case.

**Simple Start:** Adequate for the simplest service businesses with no bills (i.e., they pay everything immediately by credit card). Most small businesses outgrow this quickly.

**Essentials:** The most common choice for Ontario small businesses. Supports the full bookkeeping workflow including AR and AP.

**Plus:** Required if the client has inventory, runs job costing, or wants class/location tracking (e.g., a contractor with multiple job sites).

**Advanced:** For larger small businesses with complex needs.

### As a Bookkeeper, You Use QBOA

**QuickBooks Online Accountant (QBOA)** is a free portal for accountants and bookkeepers. It lets you:
- Manage all your clients' QBO files from one dashboard
- Access advanced features (Reclassify Transactions, Write-Off Tool)
- Switch between client files quickly
- Get free QBO Plus for your own practice

Sign up at: quickbooks.intuit.com/ca/accountants/

**Important:** QBOA is for accountant users — it doesn't replace the client's QBO subscription. The client pays for their company's QBO; you access it through your QBOA portal as their authorized accountant user.

---

## 13.2 Setting Up a New QBO Company

When a client subscribes to QBO for the first time, you walk them through setup. Here's the professional sequence.

### The Initial Setup Wizard

QBO's setup wizard asks several questions:

**1. Industry:** Select the closest match. QBO uses this to suggest a chart of accounts.

**2. Business type:** Sole proprietor, partnership, corporation. This affects the equity section.

**3. What you do:** Service, products, or both. This affects whether inventory is enabled.

**4. Business address:** Used for invoices, T4s, and tax filings.

**5. Fiscal year start:** **Critical.** Most Canadian businesses use a calendar year (January 1 - December 31). Some use other year-ends — verify before setting.

**6. Accounting method:** **Accrual.** Always accrual for Ontario businesses (unless very specific cash-basis exception).

**7. Currency:** Canadian Dollar (CAD).

**8. Sales tax:** Enable HST for Ontario at 13%. This is critical.

### After the Wizard

Once the wizard completes, do the following before any transactions are entered:

#### Step 1: Configure HST

**Settings → Taxes → Sales Tax → Manage Sales Tax**

QBO will create:
- HST collected (Liability)
- HST paid (Asset / ITC)

Verify the rate is 13% for Ontario. Set up the agency (CRA) and the reporting period (monthly, quarterly, annual based on the business).

#### Step 2: Enable Account Numbers

By default, QBO doesn't show account numbers. Turn this on:

**Settings (gear icon) → Account and Settings → Advanced → Chart of Accounts → Enable account numbers: ON**

#### Step 3: Review the Default Chart of Accounts

QBO creates a default chart based on the industry. Review it:

**Accounting → Chart of Accounts**

For each account:
- Verify the type is correct
- Add an account number following the convention (1000s assets, 2000s liabilities, etc.)
- Inactivate accounts you won't use
- Add Ontario-specific accounts:
  - WSIB Payable (Liability)
  - EHT Payable (Liability) — even at $0
  - Vacation Pay Accrual (Liability)
  - Source Deductions Payable (Liability) — typically already exists

#### Step 4: Set the Closing Date (Initially)

**Settings → Account and Settings → Advanced → Close the books**

Set the closing date to one day before the QBO start date. This prevents accidental entries before the official start.

#### Step 5: Customize Invoice and Sales Templates

**Settings → Custom Form Styles**

- Add the company logo
- Set the invoice format
- Add payment terms (Net 30 default)
- Include the HST registration number
- Customize footer with contact info

#### Step 6: Set Default Payment Terms

**Settings → Account and Settings → Sales → Sales Form Content**

Set the default payment term (Net 30 is standard).

#### Step 7: Connect Banking

**Banking → Link Account**

Connect:
- Operating chequing account
- Savings account (if applicable)
- Credit card accounts
- Line of credit (if applicable)

Banking connections allow automatic transaction import — but require the client's online banking credentials. As a bookkeeper, the client should enter these themselves; you should not access or store their bank credentials.

---

## 13.3 The Chart of Accounts in QBO

We built a chart of accounts conceptually in Week 2. Here's how to implement it in QBO.

### Adding a New Account

**Accounting → Chart of Accounts → New**

Fields to fill:

- **Account Type:** The major category (Asset, Liability, Equity, Income, Expense)
- **Detail Type:** A subcategory QBO uses for tax mapping (e.g., for an asset: "Bank," "Accounts Receivable," "Inventory," "Fixed Assets")
- **Name:** What you call the account
- **Number:** The account number per the convention
- **Description:** Optional but helpful for clarity

### Detail Types — Why They Matter

Every account has a Type and a Detail Type. The Detail Type determines:
- Where the account appears on financial statements
- Tax line mapping (used by tax software for T1, T2, T2125)
- Which reports include the account

**Choose detail types carefully.** A custom-named "Office Supplies" account with the wrong detail type might end up on the Balance Sheet instead of the P&L.

**Common detail types:**

For Assets:
- Bank
- Other Current Asset
- Accounts Receivable
- Inventory
- Fixed Asset
- Accumulated Depreciation

For Liabilities:
- Accounts Payable
- Credit Card
- Other Current Liability
- Long-Term Liability

For Income:
- Sales of Product Income
- Service/Fee Income
- Other Income

For Expenses:
- Cost of Goods Sold
- Office/General Administrative
- Vehicle Expenses
- Travel
- Many specific subtypes

### Setting Up Sub-Accounts

QBO supports parent and sub-accounts. Useful for:
- Tracking equipment by category (Equipment → Computers, Equipment → Vehicles, Equipment → Office Furniture)
- Grouping similar expenses (Vehicle → Fuel, Vehicle → Repairs, Vehicle → Insurance)

**To create a sub-account:**
1. Create the parent account first
2. Create the sub-account, checking "Is sub-account" and selecting the parent

Sub-accounts appear indented on reports and can be collapsed/expanded.

### Inactivating Default Accounts

QBO creates default accounts (like "Uncategorized Asset," "Uncategorized Income") that you should never use intentionally. To inactivate:

**Accounting → Chart of Accounts → [Account] → Make inactive**

Inactivated accounts disappear from the active chart but remain available for historical reports.

---

## 13.4 Customers and Sales Workflow

### Setting Up Customers

**Sales → Customers → New customer**

Critical fields:
- **Display name as:** What appears on invoices (legal name preferred)
- **Email:** For sending invoices electronically
- **Billing address:** Required for invoices
- **Shipping address:** If different
- **Payment terms:** Default (Net 30 for most)
- **Sales tax:** Set to ON 13% for Ontario customers; "Out of scope" for U.S. or other zero-rated customers
- **Opening balance:** Only if migrating from another system
- **Notes:** Internal notes about the customer (credit limits, special arrangements)

### The Sales Process — Step by Step

The complete sales workflow in QBO:

```
ESTIMATE → INVOICE → RECEIVE PAYMENT → DEPOSIT
(optional)
```

#### Estimate (Optional)

For larger jobs where the customer wants a quote first:

**+ New → Estimate**

Estimates don't create journal entries (they're not actual sales yet). When the customer approves, you convert the estimate to an invoice with one click.

#### Invoice

The actual sale:

**+ New → Invoice**

Steps:
1. Select customer
2. Choose date and payment terms
3. Add products/services with quantities and rates
4. Verify HST is calculated correctly
5. Save and send (emails the invoice to the customer)

QBO automatically creates the journal entry:
```
Dr. Accounts Receivable    [total]
     Cr. Service Revenue          [pre-HST]
     Cr. HST Payable              [13%]
```

#### Receive Payment

When the customer pays:

**+ New → Receive Payment**

Steps:
1. Select customer
2. Select payment date
3. Enter payment amount
4. **Critical:** Select which invoices the payment applies to
5. Choose where the funds go:
   - "Deposit to" the bank account (cleared payment), OR
   - "Undeposited Funds" (if you'll deposit it later as part of a batch)

QBO creates:
```
Dr. Bank Account or Undeposited Funds   [amount]
     Cr. Accounts Receivable                  [amount]
```

#### Deposit (If Using Undeposited Funds)

If you held the payment in Undeposited Funds:

**+ New → Bank Deposit**

Select all the customer payments to combine into one deposit. Choose which bank account it goes to. Save.

This lets multiple customer cheques be deposited as one bank transaction — matching how the bank statement shows deposits.

### Products and Services Setup

Before invoicing, set up your products/services:

**Sales → Products and services → New**

For each product/service:
- **Name:** What appears on invoices
- **Type:** Service, Inventory, Non-inventory
- **Sales price/rate:** The default rate
- **Income account:** Which revenue account to credit (e.g., "Service Revenue")
- **Sales tax:** Taxable or HST-exempt

Inventory items add fields for cost, current quantity, and reorder point. Service items are simpler.

### Common Sales Workflow Mistakes

**Mistake 1:** Saving an invoice without an HST tax code. The invoice goes through with $0 HST, which underbills the customer and understates HST Payable.

**Mistake 2:** Receiving payment without selecting which invoices it applies to. Creates an unapplied credit on the customer's account.

**Mistake 3:** Using "Deposit to: Bank Account" when the payment was actually deposited as part of a multi-cheque deposit. Creates a bank reconciliation mismatch.

**Mistake 4:** Editing an invoice after the customer has paid. Can mess up the payment application.

---

## 13.5 Vendors and Expenses Workflow

### Setting Up Vendors

**Expenses → Vendors → New vendor**

Critical fields:
- **Display name as:** Vendor's business name
- **Email:** For sending payment notifications
- **Address:** For sending cheques
- **Payment terms:** Default (Net 30)
- **HST registration number:** Essential for ITC documentation
- **Default expense account:** If most transactions go to one account
- **Tax ID / Business Number:** For T5018 reporting (subcontractors)

### The Expense Process — Step by Step

Two paths depending on whether you owe the vendor or paid immediately:

```
PATH A (CREDIT PURCHASE — owe the vendor):
BILL → BILL PAYMENT

PATH B (CASH PURCHASE — paid immediately):
EXPENSE (no bill, direct payment)
```

#### Bill (Path A)

For purchases on account:

**+ New → Bill**

Steps:
1. Select vendor
2. Date and due date
3. Add line items with expense accounts and amounts
4. Enter HST
5. Save

QBO creates:
```
Dr. Expense Account     [pre-HST]
Dr. HST Receivable      [13%]
     Cr. Accounts Payable      [total]
```

#### Bill Payment (Path A continued)

When you pay the bill:

**+ New → Pay Bills**

Or **+ New → Bill Payment**

QBO creates:
```
Dr. Accounts Payable     [amount]
     Cr. Bank Account             [amount]
```

#### Expense (Path B)

For cash purchases (paid immediately):

**+ New → Expense**

This combines the purchase and payment in one transaction. Use for:
- Direct credit card purchases
- Cash purchases
- Direct bank transfer payments

QBO creates:
```
Dr. Expense Account     [pre-HST]
Dr. HST Receivable      [13%]
     Cr. Bank/Credit Card       [total]
```

#### Cheque (Old-school but still useful)

**+ New → Cheque** to print or record cheque payments.

Combines expense and payment in one transaction. The advantage over "Expense" is that cheques can be printed and tracked sequentially.

### Recurring Transactions

For predictable monthly bills (rent, utilities, subscriptions), set up recurring transactions:

**Settings → Recurring transactions → New**

Configure:
- Type (Bill, Expense, Cheque, etc.)
- Frequency (monthly, weekly, etc.)
- Vendor and account
- Amount
- Whether to auto-create or create on schedule with confirmation

This automates routine entries — saves enormous time.

### Common Expense Workflow Mistakes

**Mistake 1:** Using "Expense" when you actually have a bill, then later paying the bill manually. Creates a duplicate.

**Mistake 2:** Bill payments not applied to specific bills. Creates AP ghost balances.

**Mistake 3:** Coding the same vendor's bills to different expense accounts inconsistently. Set up a default expense account on the vendor record.

**Mistake 4:** Forgetting HST on a bill. Underclaims ITCs. Always enter HST explicitly.

---

## 13.6 Bank Feeds — The Powerful Tool with Real Risks

Bank feeds automatically import transactions from connected bank and credit card accounts. They save time — but require careful management.

### How Bank Feeds Work

Once banking is connected:
1. QBO downloads new transactions daily
2. Imports them into the Banking page
3. Suggests categories based on prior coding
4. You review, edit, and add each transaction to QBO

### The Banking Page

**Banking → Banking → [Account]**

Three tabs:
- **For Review:** Transactions imported from the bank, awaiting your decision
- **Categorized:** Already added to QBO
- **Excluded:** Transactions you've explicitly excluded

For each transaction in "For Review":
1. Verify or change the date
2. Confirm or change the description
3. Choose action:
   - **Match:** to an existing QBO transaction (e.g., a bill you already entered)
   - **Add:** as a new transaction (specify the account)
   - **Find Match:** to search for a matching QBO transaction
   - **Exclude:** if it's not a real transaction (rare)

### The Bank Rules Feature

QBO can learn from your patterns. After categorizing the same vendor a few times, QBO offers to create a "rule":

**Banking → Rules → New rule**

Example rule:
- Description contains "BELL CANADA"
- Match = Bell Canada vendor
- Account = Telephone & Internet
- Apply automatically

Once saved, QBO auto-applies this categorization to future transactions matching the criteria.

**The benefit:** Saves repetitive coding decisions for recurring vendors.

**The risk:** If a rule is wrong, it auto-applies the wrong account. Always review rules periodically.

### The Bank Feed Trap

The biggest mistake bookkeepers make: treating the bank feed as the bookkeeping system.

**The wrong approach:**
- Let QBO auto-categorize everything
- Click "Add" on every transaction without review
- Trust the rules to be 100% right
- Skip the bill/invoice workflow entirely

**The right approach:**
- For receivable customers, create proper invoices first; bank feed deposits should match those invoices
- For supplier bills, create proper bills first; bank feed payments should match those bills
- Use the bank feed for items that don't have prior records (bank charges, interest, miscellaneous expenses)
- Always review categorization before clicking "Add"
- Spot-check rules monthly

The bank feed is a tool to speed up data entry — not to replace bookkeeping judgment.

### Resolving Bank Feed Issues

Common problems:

**Duplicate transactions:** A single bank transaction appears twice in the feed. Exclude one.

**Missing transactions:** A bank transaction doesn't appear in the feed (rare). Add manually as Expense or Deposit.

**Wrong matching:** QBO suggests matching to the wrong existing transaction. Reject the match and find the correct one.

**Connection loss:** Banking connection breaks (bank changes API, credentials expire). Reconnect through Banking → Update.

---

## 13.7 Bank Reconciliation in QBO

We covered bank reconciliation principles in Week 10. Here's the QBO-specific workflow.

### Starting a Reconciliation

**Accounting → Reconcile**

1. Select the account
2. Enter the **statement ending balance** (from the bank statement)
3. Enter the **statement ending date**
4. Click **Start reconciling**

### The Reconciliation Screen

QBO displays:
- All transactions in QBO for the bank account during the period
- Two columns: Payments (withdrawals) and Deposits (credits)
- Top right: ending balance, cleared balance, difference

Your job: check off each transaction that appears on the bank statement.

### The Goal

After checking off all matched items:
- **Difference: $0.00**

If it's not zero, you have either:
- Missed checking a transaction
- A transaction in the books that's not on the statement (timing — leave unchecked)
- A transaction on the statement that's not in the books (need to add it)

### Adding Missing Transactions Mid-Reconciliation

If a transaction is on the statement but not in QBO:
- Click **Finish later** (saves your progress)
- Add the missing transaction
- Return to reconciliation
- The new transaction now appears in the "For Review" list

### Common QBO Reconciliation Issues

**Issue 1: Beginning Balance Doesn't Match**

If the "Beginning Balance" shown by QBO doesn't match your last completed reconciliation, a previously reconciled transaction was changed.

**Action:**
- Check Audit Log for recent changes
- Identify what changed
- Decide whether to revert or accept
- Don't proceed until resolved

**Issue 2: Reconciliation Won't Balance**

The Difference is not $0 even after checking off all matches.

**Action:**
- Verify each unchecked transaction has a reason for being unchecked (timing difference)
- Look for transactions you might have missed
- Search for the exact difference amount
- Use the diagnostic tests (divisible by 9 = transposition; divisible by 2 = side error)

**Issue 3: Need to Undo a Reconciliation**

If a previous reconciliation was wrong:

**Accounting → Reconcile → History → Undo Reconciliation**

This reverses the entire reconciliation. Start over carefully.

### After Reconciliation

Save the **Reconciliation Report**:

**Reports → For my accountant → Reconciliation Reports**

Download as PDF and save with the bank statement.

---

## 13.8 The Essential Reports

QBO produces dozens of reports. Most you'll never use. Here are the essential ones.

### Profit and Loss (Income Statement)

**Reports → Profit and Loss**

Shows revenue, COGS, expenses, and net income for a period.

**Key customizations:**
- Date range (this month, this quarter, year-to-date, custom)
- Compare to prior period (this month vs. prior month or this YTD vs. prior YTD)
- Show as percentages of revenue

**Run monthly:** Standard month-end practice.

### Balance Sheet

**Reports → Balance Sheet**

Shows assets, liabilities, and equity at a specific date.

**Key customizations:**
- "As of" date (typically month-end or year-end)
- Compare to a prior date
- Show only summary or detailed by account

**Run monthly:** Critical for monthly close.

### Trial Balance

**Reports → For my accountant → Trial Balance**

Shows every account with its balance. Verifies debits = credits.

**Run monthly:** Especially before producing financials.

### General Ledger

**Reports → For my accountant → General Ledger**

Shows every transaction posted to every account.

**Use for:** Drilling into specific accounts to investigate balances or trace transactions.

### A/R Aging Summary

**Reports → Sales → A/R Aging Summary**

Shows customer balances grouped by aging buckets (current, 1-30 days, 31-60, etc.).

**Run weekly:** For collection follow-up.

### A/P Aging Summary

**Reports → Expenses and vendors → A/P Aging Summary**

Shows vendor balances grouped by aging buckets.

**Run weekly:** For payment timing decisions.

### Sales Tax Liability Report

**Reports → Sales → Sales Tax Liability Report**

Shows HST collected (Payable) and HST paid (ITC) for the period. Used to prepare HST returns.

**Run before filing HST.**

### Other Useful Reports

| Report | Purpose |
|---|---|
| Profit and Loss by Class | Track profitability by department or location |
| Profit and Loss by Customer | Track profitability per customer |
| Sales by Customer Detail | All sales for a customer in one report |
| Vendor Contact List | Master list of all vendors |
| Reconciliation Reports | History of all bank reconciliations |
| Audit Log | Every change made in the company file |
| Budget vs. Actuals | If you've set up budgets |

---

## 13.9 Customizing Reports

Default reports are useful, but customization is where the value is.

### Customize Function

Most reports have a **Customize** button that opens options:

- **General:** Date range, accounting method (cash or accrual), compare periods
- **Rows/Columns:** Which columns to show, level of detail
- **Filter:** Restrict to specific accounts, customers, vendors, classes
- **Header/Footer:** Customize what appears at top/bottom

### Memorizing Reports

After customizing, save the configuration:

**Customize → Save customization → name it**

The saved report appears under **Reports → Custom Reports**.

This means you can run the exact same customized report next month with one click.

### Exporting to Excel

Most reports can be exported:

**Export → Export to Excel** (top right of report)

Useful for:
- Adding columns or formulas
- Creating combined reports across multiple QBO files
- Detailed analysis QBO doesn't natively support

---

## 13.10 Fixing Errors in QBO — Edit, Void, or Delete

When you find an error in a transaction, you have three options. Choose based on the situation.

### Option 1: Edit the Transaction

For minor errors discovered before reconciliation:

**Open the transaction → make corrections → Save**

QBO updates the transaction in place. Use for:
- Wrong account assignment
- Wrong amount
- Wrong date
- Wrong customer/vendor

**Caution:** Editing a transaction after reconciliation may cause the reconciliation to fall out of balance. QBO warns you.

**Best practice:** Only edit transactions in the current open period. For closed periods, use a journal entry to correct.

### Option 2: Void the Transaction

For a transaction that shouldn't have happened but you want to keep a record:

**Open transaction → More → Void**

Voiding:
- Sets the amount to $0
- Marks the transaction as voided
- Keeps the transaction in the system for audit purposes
- Removes the financial impact

Use for:
- Cancelled cheques
- Voided invoices (customer never owed the amount)
- Mistakes you want to keep visible in the audit trail

### Option 3: Delete the Transaction

For complete removal:

**Open transaction → More → Delete**

Deletion:
- Removes the transaction entirely
- Loses the audit trail (Audit Log records the deletion, but the transaction itself is gone)

Use sparingly. Only for:
- Accidentally entered transactions that never happened
- Truly erroneous entries with no value to keeping in history

**Voiding is usually preferable to deletion** — it preserves the audit trail.

### Reclassify Transactions (Accountant Tool)

In QBOA (the accountant view), there's a powerful tool: **Accountant Tools → Reclassify Transactions**

This lets you:
- Filter transactions by account, date, name
- Bulk-change the account assignment
- Bulk-change the class assignment

Use case: You discover that 47 supplier bills coded to "Office Supplies" should have been "Computer Supplies." Reclassify in one operation instead of editing 47 individual bills.

### The Audit Log

Every change in QBO is recorded:

**Settings → Audit Log**

Shows:
- Who made the change
- When (timestamp)
- What was changed (original vs. new value)

Filter by:
- Date range
- User
- Event type (created, edited, deleted, voided)
- Specific transactions

**Why it matters:**
- Investigating mysterious changes
- Detecting fraud
- Diagnosing reconciliation issues
- Verifying employee/bookkeeper compliance

A good professional habit: review the Audit Log monthly for unusual activity.

---

## 13.11 Cleaning Up a Messy QBO File

Often you'll inherit a QBO file from a previous bookkeeper or DIY owner. Here's the cleanup playbook.

### Step 1: Diagnostic Review

Open the file and check:

1. **Run Trial Balance** — does it balance?
2. **Run Balance Sheet** — does it balance? Any negative balances on accounts that should be positive?
3. **Open Chart of Accounts** — too many accounts? Duplicates? Misclassified?
4. **Check HST accounts** — clean balances or scattered?
5. **Run AR Aging** — any 90+ day balances? Any negative customer balances?
6. **Run AP Aging** — any old open bills?
7. **Check Undeposited Funds** — should be $0 or very small at month-end
8. **Check Uncategorized accounts** — should always be $0
9. **Review Audit Log** — recent unusual activity?
10. **Check for closing dates** — has anyone been editing prior periods?

### Step 2: Prioritize Fixes

You can't fix everything at once. Prioritize:

**High priority:**
- Negative balances on debit-normal accounts
- Uncategorized account balances
- HST reconciliation issues affecting filings
- AR with credit balances or 90+ day overdue

**Medium priority:**
- Misclassified expense accounts
- Duplicate vendors or customers
- Inactive accounts cluttering reports

**Low priority:**
- Cosmetic chart of accounts cleanup
- Memorized report customization
- Bank rule optimization

### Step 3: The Cleanup Process

For each issue:

1. **Document the current state** — screenshot or export reports
2. **Identify the root cause** — why did this happen?
3. **Fix systematically** — one issue at a time, verify after each
4. **Update controls** — prevent the issue from recurring
5. **Test the fix** — re-run reports to confirm

### Common Cleanup Tasks

**Task: Empty Uncategorized Expense ($420 balance)**

Drill into the account → review each transaction → reclassify to proper expense account → confirm Uncategorized = $0.

**Task: 47 supplier bills coded incorrectly**

Use Reclassify Transactions tool to bulk-update.

**Task: Negative AR for one customer (-$340)**

This means the customer paid more than invoiced (overpayment) or a credit memo was applied without an invoice. Investigate:
- Was there an unrecorded invoice?
- Should the credit be issued as a refund?
- Is the customer's account closed and the credit forgotten?

**Task: $1,800 in Undeposited Funds with no matching bank deposit**

Means customer payments were marked "Undeposited" but never actually deposited (or the deposit was recorded as something else). Investigate each entry → match to actual bank deposits → reclassify or remove as appropriate.

**Task: HST Payable doesn't reconcile to last filed return**

Compare HST Payable balance at quarter-end to the HST return filed. If they don't match, find:
- Sales recorded after the period that affected HST Payable
- Adjustments not on the return
- Late entries

Document the reconciling items. Consider an adjustment if the difference is real.

### When to Walk Away

Some QBO files are too damaged to clean economically. Signs:
- 3+ years of unreconciled bank accounts
- Negative balance sheet items everywhere
- Duplicate accounts everywhere with mixed transactions
- HST returns out of sync with books for years

In these cases, recommend the client:
1. Engage their accountant for a major cleanup
2. Consider starting a fresh QBO file with proper opening balances
3. Be prepared for significant fees

Don't promise to fix what's not realistically fixable in a reasonable time.

---

## 13.12 Signature Example — Trenton Tile & Stone — Setup and First Month

Let's set up a brand-new QBO file from scratch.

### The Business

**Trenton Tile & Stone** is a tile installation company starting January 1, 2026. Owner Mark Rossi is incorporating today. He'll have:

- A truck, tools, inventory of tile samples
- Three commercial clients in Trenton/Quinte West area
- Two field workers (T4 employees) and one office admin (T4 employee)
- HST registered from day one (he expects to exceed $30,000 quickly)

### Setup Day 1 — Initial Configuration

**1. Subscription:** Sign up for QBO Essentials ($55/month).

**2. Setup Wizard responses:**
- Industry: Construction
- Business type: Corporation
- Fiscal year: January 1 - December 31
- Accounting method: Accrual
- Currency: CAD
- Sales tax: HST 13% (Ontario)

**3. Settings configurations:**
- Enable account numbers
- Set closing date to Dec 31, 2025 (one day before fiscal year start)
- Customize invoice template with logo, address, HST number
- Default payment terms: Net 30

**4. Chart of Accounts setup:**

Review default chart. Add:
- 2110 Source Deductions Payable
- 2120 WSIB Payable
- 2130 EHT Payable (at $0)
- 2200 Vacation Pay Accrual
- 1300 HST Receivable (auto-created with sales tax)
- 2100 HST Payable (auto-created)

Inactivate unused defaults.

**5. Connect banks:**
- TD Business Chequing
- TD Business Visa

### Day 1 Opening Transactions

**Opening capital deposit:**

```
Jan 1 - Mark deposits $30,000 of personal funds into business

Use: + New → Bank Deposit
Amount: $30,000
Account: Owner's Capital (Equity)
```

**Equipment loan:**

```
Jan 1 - Truck loan from TD: $25,000 deposited

Use: + New → Bank Deposit (or Journal Entry)
Amount: $25,000
Account: Truck Loan Payable (Liability)
```

**Equipment purchase:**

```
Jan 2 - Buy used truck: $20,000 + HST = $22,600

Use: + New → Cheque or Expense
Amount split:
  Vehicles (Asset): $20,000
  HST Receivable: $2,600
Total paid: $22,600
```

### Day 5 — First Customer Setup and Invoice

**Add customer:**

**Sales → Customers → New customer:**
- Name: Quinte Industrial Group Ltd.
- Email: ap@quinteindustrial.ca
- Address: 47 Industrial Road, Trenton, ON
- Terms: Net 30
- Tax: HST 13%
- HST registration: 712345678

**Add product/service:**

**Sales → Products and services → New:**
- Type: Service
- Name: Tile Installation - Commercial
- Income account: Service Revenue
- Default rate: $85/hour

**Create first invoice:**

**+ New → Invoice:**
- Customer: Quinte Industrial Group
- Date: Jan 5
- Due: Feb 4 (Net 30)
- Service: Tile Installation - Commercial, 16 hours @ $85 = $1,360
- HST: 13% = $176.80
- Total: $1,536.80
- Save and email

QBO automatically creates:
```
Dr. Accounts Receivable    1,536.80
     Cr. Service Revenue          1,360.00
     Cr. HST Payable                176.80
```

### Day 10 — First Bill

**Add vendor:**

**Expenses → Vendors → New vendor:**
- Name: Lordco Supply (Tile Supplies)
- HST registration: 891234567
- Terms: Net 30
- Default expense account: Materials - Inventory

**Enter bill:**

**+ New → Bill:**
- Vendor: Lordco Supply
- Date: Jan 10
- Due: Feb 9
- Items: Bulk tile order, $4,200 + HST = $4,746
- Save

QBO creates:
```
Dr. Materials - Inventory    4,200.00
Dr. HST Receivable             546.00
     Cr. Accounts Payable - Lordco    4,746.00
```

### Day 14 — First Payroll Entry

(Using QBO's separate payroll module or manual journal entry)

For two employees being paid for first 2 weeks:

```
Jan 14    Wages Expense                     2,800.00
               CPP Payable                              158.50
               EI Payable                                45.92
               Income Tax Payable                       340.00
               Bank Account                          2,255.58
          Memo: First bi-weekly payroll
```

Plus employer cost entry (CPP match, EI 1.4×, WSIB).

### Day 31 — Month-End Close

Tasks:

1. **Verify all bills entered** — review supplier statements
2. **Verify all invoices issued** — confirm no work done without invoicing
3. **Reconcile bank account** — match QBO to bank statement
4. **Reconcile credit card** — match to Visa statement
5. **Run Trial Balance** — verify it balances
6. **Run P&L and Balance Sheet** — review for unusual items
7. **Run Sales Tax Liability** — prepare HST tracking
8. **Set closing date to Jan 31, 2026** — protect the period

The full set of January reports is now ready.

### Result

After one month, Mark has:
- A complete QBO file with proper Ontario settings
- A well-organized chart of accounts
- One customer, several vendors
- A reconciled bank account
- Clean financial statements
- HST tracking ready for quarter-end

This is what professional QBO setup looks like.

---

## 13.13 Quiz — 15 Questions

**Question 1**
What's the main difference between QBO Simple Start and QBO Essentials?

??? answer
    **Essentials adds bills (Accounts Payable), multi-currency, and time tracking.** Simple Start has no AP — you can't enter bills, only direct expenses.

    For most small businesses with regular supplier billing, Essentials is the minimum. Simple Start is too limited for serious bookkeeping.

---

**Question 2**
After completing the QBO setup wizard, what's the first setting you should change?

??? answer
    **Enable account numbers** (Settings → Account and Settings → Advanced → Chart of Accounts → Enable account numbers: ON).

    QBO doesn't show account numbers by default. Enabling them allows accounts to sort logically and supports the standard numbering convention (1000s assets, 2000s liabilities, etc.).

---

**Question 3**
A client uses QBO Plus. They want to track profitability by location. How?

??? answer
    Use **Class tracking** or **Location tracking**.

    QBO Plus supports both:
    - **Class tracking:** Categorize transactions by department, line of business, or location
    - **Location tracking:** Specifically for tracking by physical location

    Setup: **Settings → Account and Settings → Advanced → Categories**, enable Track Classes (or Locations).

    On every transaction, assign a class/location. Reports can then be filtered to show profitability per category.

---

**Question 4**
You connect a bank feed. 50 transactions appear "For Review." What's the right approach?

??? answer
    **Review each one before adding.** Check:
    - Is the date correct?
    - Is the description meaningful?
    - Is the suggested category right?
    - Should this match an existing transaction?

    Don't bulk-accept. Don't trust the AI suggestions blindly. Categorize each correctly. Build rules for repeating patterns.

    The bank feed is a data entry shortcut, not a substitute for bookkeeping judgment.

---

**Question 5**
What happens to a journal entry when you "Edit" vs. "Void" vs. "Delete" it?

??? answer
    **Edit:** Updates the transaction in place. Use for minor corrections in current period.

    **Void:** Sets the amount to $0, marks as voided, keeps in audit trail. Use when you want to remove the impact but preserve the record.

    **Delete:** Removes the transaction entirely. The Audit Log records the deletion, but the transaction itself is gone. Use sparingly.

    **Best practice:** Prefer Void over Delete for audit trail integrity.

---

**Question 6**
You want to bulk-change 47 transactions from "Office Supplies" to "Computer Supplies." What QBOA tool helps?

??? answer
    **Reclassify Transactions** (in the Accountant view of QBOA).

    Filter to show transactions in Office Supplies, select all 47, and bulk-change to Computer Supplies. One operation instead of 47.

    Available only in QBOA, not regular QBO.

---

**Question 7**
A client's QBO has $4,500 in "Undeposited Funds" at month-end. What does this mean?

??? answer
    Customer payments were recorded as "deposit to Undeposited Funds" but **never actually deposited** to the bank account in QBO.

    Possibilities:
    - Deposits were recorded as bank transactions but not linked to Undeposited Funds entries
    - Deposits were never made to the bank
    - Deposits were made and recorded incorrectly

    **Action:** Investigate each Undeposited Funds entry. Match to actual bank deposits. Reclassify or remove as appropriate. Undeposited Funds should be near $0 at month-end.

---

**Question 8**
QBO won't let you reconcile because the "Beginning Balance" doesn't match. What's wrong?

??? answer
    **A previously reconciled period was changed.** Someone edited or deleted a transaction from a prior reconciliation.

    **Steps:**
    1. Don't proceed with current reconciliation
    2. Check Audit Log for recent changes to bank account transactions
    3. Identify what was changed
    4. Decide whether to revert the change or accept it
    5. May need to undo and redo prior reconciliations

    **Prevention:** Set closing dates after each reconciliation to prevent prior-period edits.

---

**Question 9**
A new vendor invoice arrives but you haven't set up the vendor yet. What do you do?

??? answer
    Set up the vendor first, then enter the bill.

    **Quick path:**
    - From the Bill entry screen, click the vendor dropdown
    - Click "+ Add new"
    - Enter vendor details (name, email, terms, HST number)
    - Save the vendor
    - Continue entering the bill

    **Don't** create a generic "Misc Vendor" entry — proper vendor setup matters for tracking, payment, and reporting.

---

**Question 10**
The Sales Tax Liability report shows HST Payable of $4,200 and HST Receivable of $1,800 for Q3. What's the next step?

??? answer
    **Net tax owed: $4,200 - $1,800 = $2,400**

    Steps:
    1. Verify the numbers reconcile to the actual transactions
    2. Prepare the HST return (GST34) using these numbers
    3. File the return through CRA My Business Account
    4. Pay $2,400 to CRA
    5. Record the remittance in QBO:
       ```
       Dr. HST Payable             4,200.00
            Cr. HST Receivable             1,800.00
            Cr. Bank Account              2,400.00
       ```
    6. Verify HST accounts are now $0 for the period
    7. File documentation

---

**Question 11**
A bank rule auto-categorized $850 of transactions to "Office Supplies" but you discover several should have been "Software & Subscriptions." How do you fix?

??? answer
    Two-step fix:

    **Step 1: Correct the existing transactions**
    - Use Reclassify Transactions (in QBOA) to bulk-update miscoded items
    - Or open each transaction and edit the account

    **Step 2: Update the bank rule**
    - Go to Banking → Rules
    - Edit the rule to be more specific (different keywords, refined criteria)
    - Or create a new rule for the software vendors

    Going forward, the rule is corrected and won't make the same mistake.

---

**Question 12**
You complete a bank reconciliation. What do you do next?

??? answer
    1. **Save the Reconciliation Report** (Reports → For my accountant → Reconciliation Reports)
    2. **Download as PDF** and save with the bank statement
    3. **Verify the GL bank balance** matches the adjusted book balance after journal entries
    4. **Update closing date** to lock the period
    5. **File documentation** in cloud storage
    6. **Communicate to the owner** — quick email confirming reconciliation complete

---

**Question 13**
A client's chart of accounts has 142 accounts. Most haven't been used in over a year. What do you do?

??? answer
    **Inactivate (don't delete) unused accounts.**

    - Run a P&L for the past 12 months to see which accounts have transactions
    - For accounts with no activity in 12+ months: mark inactive
    - For accounts with very limited activity: review with the owner — are they still needed?
    - For accounts that overlap or duplicate (e.g., "Office Supplies" and "Office Materials"): decide which to keep, reclassify the other's transactions, then inactivate

    Goal: a clean chart of about 40-60 active accounts that supports clear reporting.

---

**Question 14**
What's the difference between a Bill and an Expense in QBO?

??? answer
    **Bill:** Records that you owe a vendor (creates AP). Used when you'll pay later. Two-step process: enter bill, then pay later.

    **Expense:** Records a direct payment (no AP). Used when you pay immediately by credit card, bank transfer, or cash. One-step process.

    **When to use which:**
    - Net 30 supplier invoice → Bill
    - Credit card receipt for office supplies → Expense
    - Cheque written immediately for a service → Expense or Cheque
    - Email invoice with payment terms → Bill, then pay later

---

**Question 15**
A previous bookkeeper used "Owner's Draws" set up as an Expense account on the Chart of Accounts. The P&L is now showing Draws as an expense, distorting net income. How do you fix?

??? answer
    Two steps:

    **Step 1: Change the account type from Expense to Equity**
    - Settings → Chart of Accounts → Owner's Draws → Edit
    - Change Type from "Expense" to "Equity"
    - Set Detail Type to "Owner's Equity"
    - Save

    QBO automatically reclassifies all historical transactions in this account from P&L to Balance Sheet.

    **Step 2: Verify the change**
    - Run P&L — Draws should no longer appear (it's now on Balance Sheet)
    - Run Balance Sheet — Draws should appear as a reduction of equity
    - Net income for the period should now be higher (because the draws expense was removed)

    The fix preserves audit trail (no transactions deleted) and correctly classifies the account going forward.

---

## 13.14 Week 13 Readiness Checklist

Before moving to Week 14, confirm you can do all of the following without prompts:

- ☐ Choose the right QBO plan for a given client
- ☐ Set up a new QBO company file with correct Ontario settings
- ☐ Configure the chart of accounts with proper numbering
- ☐ Set up customers, products/services, and vendors
- ☐ Process a complete sales workflow (estimate → invoice → payment → deposit)
- ☐ Process a complete expense workflow (bill → bill payment, or expense)
- ☐ Connect bank feeds and review/categorize transactions correctly
- ☐ Set up bank rules without over-relying on them
- ☐ Reconcile a bank account in QBO
- ☐ Resolve beginning balance issues
- ☐ Run and customize the essential reports
- ☐ Use Reclassify Transactions for bulk corrections
- ☐ Use the Audit Log to investigate changes
- ☐ Diagnose and clean up a messy QBO file
- ☐ Apply efficiency habits (recurring transactions, memorized reports)
- ☐ Distinguish Bills from Expenses and use each correctly

---

## 📚 Further Reading

- [QuickBooks Online: Help and Tutorials](https://quickbooks.intuit.com/learn-support/en-ca/help-article/)
- [QuickBooks ProAdvisor Certification](https://quickbooks.intuit.com/ca/accountants/) — Free certification, one-day exam, looks great on a resume
- [QuickBooks Online Accountant (QBOA) signup](https://quickbooks.intuit.com/ca/accountants/)

---

!!! tip "Up Next: Week 14 — Month-End Close + Job Readiness"
    **The final week — and the most important.** Two parts:

    **Part A — Month-End Close:** The professional discipline that defines real bookkeepers. Adjusting entries, reconciliation verification, financial statement production. Belleville Bookbindery provides a complex December close with 11 adjusting entries.

    **Part B — Job Readiness:** What employers actually test. The skills assessment, resume structure, the 15 most common interview questions, salary benchmarks for Ontario, and the first 90 days on the job.

    20-question final mastery quiz. The 24-week readiness checklist. By the end, you're not just a course graduate — you're job-ready.
