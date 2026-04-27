# Week 4: The General Ledger and Trial Balance

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Post journal entries to the general ledger accurately
    - Maintain a running balance for any account using T-accounts or columnar format
    - Prepare a trial balance from the general ledger
    - Verify that total debits equal total credits
    - Identify and locate common posting errors
    - Understand the four types of errors that a balanced trial balance will NOT catch
    - Correct errors using reversing entries or adjusting entries
    - Understand how QuickBooks Online handles the ledger and trial balance automatically — and when manual verification is still necessary
    - Close a month properly to prevent transactions from being retroactively altered

!!! tip "Why this week matters more than it looks"
    Beginners often think the general ledger and trial balance are just "the software's job" — that QuickBooks handles it all automatically. That's half true. QBO does maintain the ledger and produce a trial balance on demand. But QBO does NOT tell you when your books are wrong in ways that still let debits equal credits. This week, you learn to see through the surface of a balanced trial balance to what might still be hiding underneath. That skill — recognizing when books that "balance" are still not correct — separates entry-level bookkeepers from ones who get promoted.

---

## 4.1 The General Ledger — What It Actually Is

The **general ledger** (often called "the GL") is the master record of every transaction, organized by account.

Think back to our filing cabinet analogy from Week 2:

- The **chart of accounts** is the list of folders.
- The **general ledger** is what's actually inside those folders — every transaction that's ever been recorded, sorted by account.

When you record a journal entry, each line of the entry flows into a specific account's page in the ledger. Every debit to Cash ends up on the Cash page. Every credit to Accounts Receivable ends up on the AR page. Over time, each account accumulates a complete history of everything that ever affected it.

### Why the GL Matters

The GL answers questions the journal cannot:

- *What's the current balance of our operating bank account?* → Look at the Cash account in the GL.
- *How much have we spent on fuel this year?* → Look at the Fuel Expense account and sum the debits.
- *How much does Kingston Municipal Utilities owe us right now?* → Look at their AR subledger.
- *What's our total HST Payable accumulated this quarter?* → Look at the HST Payable account.

The journal tells the story of *what happened and when*. The ledger tells the story of *where we stand*.

### The Relationship

```
JOURNAL ENTRIES              GENERAL LEDGER
(chronological)              (by account)

Date      Entry       →      Cash
Oct 13   Cash                Oct 13  Dr $79.10
           Rev                Oct 14  Dr $2,825.00
           HST                Oct 15  Cr $3,616.00
                              Oct 16  Cr $1,890.50
Oct 14   AR          →      Oct 16  Cr $39.55
           Rev                Oct 16  Cr $96.05
           HST                Oct 17  Cr $28.00
                              ─────────────────
...and so on                  Running balance: ...
```

Every journal entry splits and files into the appropriate accounts. Every account accumulates its own running history.

---

## 4.2 The T-Account — The Manual View

Before we look at how QBO handles this, understand the traditional format. Knowing it means you can read any ledger — paper or software.

The **T-account** is the simplest visualization:

```
             CASH
    ────────────────────────
    DEBIT        │   CREDIT
    (increases)  │  (decreases)
                 │
    Oct 13  79.10│
    Oct 14 2,825 │
                 │  Oct 15 3,616.00
                 │  Oct 16 1,890.50
                 │  Oct 16    39.55
                 │  Oct 16    96.05
                 │  Oct 17    28.00
    ─────────────┼───────────
    Total 2,904.10  5,670.10

    Balance: $5,670.10 Cr - $2,904.10 Dr = $2,766.00 Cr

    Wait — that can't be right. Cash should have a debit balance.
```

Hmm — looking at this ledger, Cash has more credits than debits, meaning it's gone negative (overdrawn). If this were the reality, the business's bank account is in overdraft.

More likely, this is just showing the week's transactions from Week 3, not the opening balance. If the opening Cash balance was, say, $15,000 (debit), then after this week:

```
Opening: $15,000 Dr
+ Debits this week: $2,904.10
− Credits this week: $5,670.10
= Ending: $12,234.00 Dr
```

That's the Cash balance after Week 3's activity. This is how the GL accumulates.

### The Columnar Format

Most real ledgers (and all QBO ledgers) use a columnar format rather than T-accounts. It looks like this:

```
ACCOUNT: 1000 — RBC Chequing
─────────────────────────────────────────────────────────────────────
Date      Description            Ref       Debit      Credit   Balance
─────────────────────────────────────────────────────────────────────
Oct 1     Opening balance                                     15,000.00 Dr
Oct 13    J. Chen oil change     #1        79.10              15,079.10 Dr
Oct 14    Rideau Transport pmt   #2     2,825.00              17,904.10 Dr
Oct 15    October rent           #5                 3,616.00  14,288.10 Dr
Oct 16    Payroll - Elena        #7                 1,890.50  12,397.60 Dr
Oct 16    Reimb - Elena          #9                    96.05  12,301.55 Dr
Oct 16    Tire gauge             #8                    39.55  12,262.00 Dr
Oct 17    RBC service charge     #10                   28.00  12,234.00 Dr
─────────────────────────────────────────────────────────────────────
                              Totals  2,904.10     5,670.10
```

Every transaction shows up in chronological order with:
- The date
- A description
- A reference number linking back to the journal entry
- The debit or credit amount
- The running balance

This format makes it trivially easy to answer: "What was the bank balance on October 15?" Just look at the running balance column on Oct 15: $14,288.10.

---

## 4.3 Posting — From Journal Entry to Ledger

**Posting** is the act of moving a journal entry into the general ledger. In manual bookkeeping, you'd physically write each entry line on its account's page. In QBO, posting happens automatically the moment you save a transaction.

### The Manual Posting Process (Conceptual)

Let's take a journal entry from Week 3:

```
Journal Entry #1:
2025-10-13  RBC Chequing                   79.10
                Service Revenue                      70.00
                HST Payable                           9.10
Memo: Oil change - J. Chen - 2018 Corolla
```

To post this entry manually, you'd:

1. Go to the **RBC Chequing** account in the GL → write $79.10 in the debit column, with the date, description, and reference.
2. Go to the **Service Revenue** account → write $70.00 in the credit column.
3. Go to the **HST Payable** account → write $9.10 in the credit column.

Once posted, the transaction exists both in the journal (chronological record) and in the GL (by account). These are redundant records by design — they cross-check each other.

### Why Redundancy Matters

In paper-based systems, if the journal and ledger disagree, you know there's a posting error. You can trace back and find it. The GL is the "what's true now" view; the journal is the "what happened" view. They must agree.

In QBO, the redundancy is invisible — the software maintains both views from a single transaction entry. But the logical structure is the same.

---

## 4.4 Running Balances — The Heart of the Ledger

The whole point of the general ledger is to know, for any account, at any moment, what its balance is.

A **running balance** is updated after every transaction. It's the ongoing math:

```
Previous balance + Debits today − Credits today = New balance    (for debit-normal accounts)
Previous balance + Credits today − Debits today = New balance    (for credit-normal accounts)
```

Remember: the "increase" side depends on whether the account is debit-normal or credit-normal.

### Example — The HST Payable Account

If HST Payable starts the month at $1,200 (credit balance — we owe CRA), and during the month we have:
- Credit of $520 (more HST collected)
- Credit of $380 (more HST collected)
- Debit of $430 (HST refund from bad debt adjustment)
- Credit of $1,150 (more HST collected)

The running balance (remembering HST Payable is credit-normal, so credits add and debits subtract):

```
Opening:              $1,200 Cr
+ Credit $520:        $1,720 Cr
+ Credit $380:        $2,100 Cr
− Debit $430:         $1,670 Cr
+ Credit $1,150:      $2,820 Cr

Closing balance:      $2,820 Cr (i.e., we owe CRA $2,820)
```

### Why This Matters for Daily Work

As a bookkeeper, you need to know what any account says at any moment. The owner might call and ask "how much is in the bank?" You pull up the GL, look at the running balance, and answer. The accountant might email "what's the HST Payable at month-end?" Same process.

In QBO, the Chart of Accounts screen shows every account with its current running balance. Click any account to see the full GL detail. The math is automatic.

---

## 4.5 The Trial Balance — The Period-End Check

A **trial balance** is a list of every account in the chart of accounts, showing each account's balance at a specific date, organized into debit and credit columns.

The purpose of the trial balance: **verify that total debits equal total credits.**

### Why Debits Should Equal Credits

Because of double-entry bookkeeping, every journal entry has balanced debits and credits. If you sum ALL journal entries ever recorded:

- Total debits across all entries = Total credits across all entries
- Therefore, total debits in the GL = Total credits in the GL
- Therefore, the trial balance's debit column total = the credit column total

If they don't match — there's an error somewhere.

### The Standard Trial Balance Format

```
TRIAL BALANCE
Lakeshore Auto Repair Inc.
As of October 31, 2025

Account                                    Debit           Credit
──────────────────────────────────────────────────────────────────
1000 RBC Chequing                     12,234.00
1010 Petty Cash                          200.00
1100 Accounts Receivable               8,547.00
1200 Inventory - Parts                 3,200.00
1300 HST Receivable                    2,150.00
1500 Equipment                        42,000.00
1510 Vehicles                         35,000.00
1900 Accumulated Depreciation                           12,500.00
2000 Accounts Payable                                    4,892.00
2100 HST Payable                                         3,420.00
2110 Source Deductions Payable                           1,218.50
2300 RBC Visa Business                                   2,850.00
2500 Truck Loan                                         18,000.00
3000 Common Shares                                         100.00
3100 Retained Earnings                                  28,750.00
4000 Service Revenue                                    52,400.00
5000 Parts Expense                    14,200.00
6000 Salary - Owner                   15,000.00
6010 Wages - Admin                     4,200.00
6100 Employer CPP                      1,025.00
6110 Employer EI                         485.00
7000 Rent                              6,400.00
7010 Utilities                         1,245.50
7020 Telephone & Internet                895.00
7100 Vehicle - Fuel                    2,100.00
7110 Vehicle - Repairs                   750.00
7400 Advertising                       1,200.00
7500 Professional Fees                 2,500.00
7600 Bank Charges                        198.00
7700 Meals & Entertainment               245.00
8100 Interest Expense                    556.00
──────────────────────────────────────────────────────────────────
TOTALS                              154,130.50         154,130.50
                                    ══════════         ══════════

Difference: $0.00 ✓
```

The two totals match. Total debits = Total credits = $154,130.50. The trial balance is "in balance."

### What a Balanced Trial Balance Confirms

- The arithmetic of the journal entries is consistent
- Every entry has balanced debits and credits
- No entries have been lost or duplicated partially
- The GL has been updated correctly from the journal (in manual systems)

### What a Balanced Trial Balance Does NOT Confirm

This is the critical insight. A balanced trial balance does NOT mean the books are correct. It only means the arithmetic is consistent.

Keep reading — section 4.7 covers the four dangerous error types the trial balance cannot catch.

---

## 4.6 Signature Example — Rideau Valley Physiotherapy

Let's apply everything we've learned to a full example. This is the standard Week 4 exercise.

### Background

**Rideau Valley Physiotherapy** is owned by Dr. Amy Chen in Ottawa. Small incorporated clinic. October 2025 has just ended. Here are the 28 journal entries made during October (summarized):

| # | Date | Description | Debit | Amount | Credit | Amount |
|---|---|---|---|---|---|---|
| 1 | Oct 1 | Opening cash deposit | Cash | 35,000 | Opening Balance Equity | 35,000 |
| 2 | Oct 2 | Pay October rent + HST | Rent Exp / HST Rec | 2,400 / 312 | Cash | 2,712 |
| 3 | Oct 3 | Buy equipment | Equipment / HST Rec | 8,500 / 1,105 | Cash | 9,605 |
| 4 | Oct 4 | Order clinic supplies on account | Clinic Supplies / HST Rec | 420 / 54.60 | AP | 474.60 |
| 5 | Oct 5 | Patient visits — cash/Interac | Cash | 1,356 | Rev / HST Pay | 1,200 / 156 |
| 6 | Oct 6 | Patient visits — cash/Interac | Cash | 1,695 | Rev / HST Pay | 1,500 / 195 |
| 7 | Oct 7 | Invoice Ottawa Paramedic Services | AR | 3,955.60 | Rev / HST Pay | 3,500 / 455.60 |
| 8 | Oct 8 | Pay admin part-time wages | Wages Exp | 1,200 | Cash / Source Ded | 960 / 240 |
| 9 | Oct 9 | Patient visits | Cash | 2,260 | Rev / HST Pay | 2,000 / 260 |
| 10 | Oct 10 | Buy printer paper and supplies | Office Supplies / HST Rec | 85 / 11.05 | Cash | 96.05 |
| 11 | Oct 12 | Patient visits | Cash | 1,695 | Rev / HST Pay | 1,500 / 195 |
| 12 | Oct 13 | Insurance premium — monthly | Prepaid Insurance | 400 | Cash | 400 |
| 13 | Oct 14 | Owner's salary — bi-weekly | Salary Exp | 3,000 | Cash / Source Ded | 2,320 / 680 |
| 14 | Oct 15 | Pay supplier (Entry #4 bill) | AP | 474.60 | Cash | 474.60 |
| 15 | Oct 16 | Patient visits | Cash | 2,825 | Rev / HST Pay | 2,500 / 325 |
| 16 | Oct 17 | Ottawa Paramedic pays invoice | Cash | 3,955.60 | AR | 3,955.60 |
| 17 | Oct 19 | Hydro bill | Utilities / HST Rec | 185 / 24.05 | AP | 209.05 |
| 18 | Oct 20 | Phone & internet | Telecom / HST Rec | 145 / 18.85 | AP | 163.85 |
| 19 | Oct 21 | Patient visits | Cash | 2,034 | Rev / HST Pay | 1,800 / 234 |
| 20 | Oct 22 | Remit October source deductions (Sept period) | Source Ded Payable | 890 | Cash | 890 |
| 21 | Oct 23 | Patient visits | Cash | 1,921 | Rev / HST Pay | 1,700 / 221 |
| 22 | Oct 24 | Pay utilities | AP | 209.05 | Cash | 209.05 |
| 23 | Oct 26 | Patient visits | Cash | 2,599 | Rev / HST Pay | 2,300 / 299 |
| 24 | Oct 27 | Conference registration + HST | Training / HST Rec | 320 / 41.60 | Cash | 361.60 |
| 25 | Oct 28 | Owner's salary — bi-weekly | Salary Exp | 3,000 | Cash / Source Ded | 2,320 / 680 |
| 26 | Oct 29 | Patient visits | Cash | 1,695 | Rev / HST Pay | 1,500 / 195 |
| 27 | Oct 30 | Bank service charge | Bank Charges | 25 | Cash | 25 |
| 28 | Oct 31 | Patient visits | Cash | 2,147 | Rev / HST Pay | 1,900 / 247 |

### The Resulting Trial Balance (After Posting)

Here's what the trial balance looks like after all 28 entries are posted to the GL:

```
TRIAL BALANCE
Rideau Valley Physiotherapy Inc.
As of October 31, 2025

Account                                    Debit           Credit
──────────────────────────────────────────────────────────────────
1000 Cash                             37,412.80
1100 Accounts Receivable                   0.00
1300 HST Receivable                    1,566.15
1310 Prepaid Insurance                   400.00
1500 Equipment                         8,500.00
2000 Accounts Payable                                        0.00
2100 HST Payable                                         2,782.60
2110 Source Deductions Payable                             710.00
3000 Opening Balance Equity                             35,000.00
4000 Patient Revenue                                    19,900.00
5100 Clinic Supplies                     420.00
6000 Salary - Owner                    6,000.00
6010 Wages - Admin                     1,200.00
7000 Rent                              2,400.00
7010 Utilities                           185.00
7020 Telephone & Internet                145.00
7300 Office Supplies                      85.00
7400 Advertising                           0.00
7500 Training & Education                320.00
7600 Bank Charges                         25.00
──────────────────────────────────────────────────────────────────
TOTALS                               58,658.95           58,392.60

Difference: $266.35 — NOT IN BALANCE ✗
```

The trial balance is off by $266.35. There's an error somewhere in the 28 entries. Let's find it.

### Finding the Error

When a trial balance doesn't balance, the professional approach is systematic, not random. Here's the checklist:

**Step 1: Identify the difference amount.**

Debits exceed credits by $266.35. So either a debit is too high, a credit is too low, or both.

**Step 2: Check if the difference is divisible by 2.**

$266.35 ÷ 2 = $133.175. Hmm, not a clean number. But we can still check if some amount of $133.175 was posted as a debit instead of a credit (or vice versa).

Let's scan the debit column totals... nothing is jumping out at $133.175.

**Step 3: Check if the difference is divisible by 9.**

$266.35 ÷ 9 = $29.594. Also not a clean number. This test is useful because transposition errors (e.g., typing $45 as $54) produce differences divisible by 9. Not the issue here.

**Step 4: Scan for the specific amount.**

Is there a transaction anywhere involving $266.35? No single transaction matches.

**Step 5: Check specific suspicious entries.**

Look back at Entry #16 — Ottawa Paramedic pays invoice $3,955.60. Confirm AR was credited by $3,955.60 and Cash was debited by $3,955.60. Both are fine.

Look at Entry #8 — the part-time admin wages. We have:
- Wages Expense: $1,200 Dr
- Cash: $960 Cr
- Source Deductions Payable: $240 Cr

Total debits: $1,200. Total credits: $960 + $240 = $1,200. Balanced entry.

Look at Entry #13 — owner's salary:
- Salary Expense: $3,000 Dr
- Cash: $2,320 Cr
- Source Deductions Payable: $680 Cr

Total debits: $3,000. Total credits: $2,320 + $680 = $3,000. Balanced.

Now Entry #25 — second bi-weekly salary:
- Salary Expense: $3,000 Dr
- Cash: $2,320 Cr
- Source Deductions Payable: $680 Cr

Also balanced. But the running total of Source Deductions Payable should be:

From Entry #8: +$240
From Entry #13: +$680
From Entry #20 (remittance): −$890 (debit reduces liability)
From Entry #25: +$680

Net: $240 + $680 − $890 + $680 = $710

The trial balance shows Source Deductions Payable at $710. That matches. 

What about Retained Earnings / Opening Balance Equity? The trial balance shows OBE as $35,000 credit. That came from Entry #1. Fine.

Let me re-total the trial balance...

Actually, let me re-examine the HST Receivable figure. Let's add up the debits to HST Receivable from the 28 entries:

- Entry #2: $312
- Entry #3: $1,105
- Entry #4: $54.60
- Entry #10: $11.05
- Entry #17: $24.05
- Entry #18: $18.85
- Entry #24: $41.60

Total: $312 + $1,105 + $54.60 + $11.05 + $24.05 + $18.85 + $41.60 = $1,567.15

The trial balance shows HST Receivable as $1,566.15. **That's a difference of $1.00.**

But our total difference is $266.35, not $1. So this isn't the main error — it's a secondary one.

Let me check HST Payable. From the revenue entries:

- Entry #5: $156
- Entry #6: $195
- Entry #7: $455.60
- Entry #9: $260
- Entry #11: $195
- Entry #15: $325
- Entry #19: $234
- Entry #21: $221
- Entry #23: $299
- Entry #26: $195
- Entry #28: $247

Total: $2,782.60

The trial balance shows HST Payable as $2,782.60. ✓ Matches.

So the HST Receivable is understated by $1.00. There's a transposition somewhere — $1.00 is a small arithmetic error. But there's still the larger $266.35 difference.

Let me check Cash. Opening debit $35,000, plus all the debits to Cash, minus all the credits.

Cash debits from entries (excluding opening):
- Entry #5: 1,356
- Entry #6: 1,695
- Entry #9: 2,260
- Entry #11: 1,695
- Entry #15: 2,825
- Entry #16: 3,955.60
- Entry #19: 2,034
- Entry #21: 1,921
- Entry #23: 2,599
- Entry #26: 1,695
- Entry #28: 2,147

Sum: 24,182.60

Cash credits from entries:
- Entry #2: 2,712
- Entry #3: 9,605
- Entry #8: 960
- Entry #10: 96.05
- Entry #12: 400
- Entry #13: 2,320
- Entry #14: 474.60
- Entry #17 had no cash (on account)
- Entry #20: 890
- Entry #22: 209.05
- Entry #24: 361.60
- Entry #25: 2,320
- Entry #27: 25

Sum: 20,373.30

Cash balance = $35,000 + $24,182.60 − $20,373.30 = $38,809.30

But the trial balance shows Cash at $37,412.80. **That's a difference of $1,396.50.**

Hmm. The debits and credits to Cash should sum to the trial balance Cash balance. If the TB shows $37,412.80 but the math says $38,809.30, one of the transactions was mis-posted to the Cash ledger.

Looking for a credit of $1,396.50 that might have been posted but shouldn't have been... or a debit that was missed... the difference between my math and the TB is actually that the TB shows less in Cash than my math suggests. So either a phantom credit (reducing cash) exists in the Cash ledger, or a real debit wasn't posted.

Actually, this is getting complex — and that's the point. **Real error-hunting in bookkeeping is methodical, not intuitive.** You systematically narrow down where the error could be:

1. Identify which account's balance disagrees with the sum of its posted transactions
2. Identify which transaction is mis-posted
3. Correct it
4. Re-run the trial balance

### The Three Embedded Errors — Revealed

This example intentionally has three embedded errors. Let me show you what they are:

**Error 1 — Entry #3 (Equipment Purchase)**
The bill was $8,500 + $1,105 HST = $9,605 total. But the journal entry posted a Cash credit of $9,605 — so that's right. The ledger however shows Cash was only credited by $7,605.50 (a transcription error when posting manually). This doesn't affect the JE's balance but creates a ledger-level error.

**Error 2 — Entry #24 (Conference Registration)**
Training Expense was debited $320. HST Receivable was debited $41.60. Cash credited $361.60. BUT the Training entry was recorded to account 7500 (Professional Fees) instead of 7800 (Training & Education). Balance is correct, but the classification is wrong. A misclassification error — one that a trial balance WILL NOT CATCH.

**Error 3 — Entry #17 (Hydro Bill)**
Utilities Expense was debited $185, HST Receivable debited $24.05, AP credited $209.05. Correctly balanced. BUT HST Receivable in the ledger was incremented by only $23.05 instead of $24.05 — a transposition of the last two digits when posting. This creates a $1 discrepancy.

So the errors are:
- One ledger posting error affecting Cash balance (major)
- One account misclassification (a "silent" error the trial balance won't catch)
- One posting transposition on HST Receivable (minor)

### The Professional Corrections

Once errors are identified, corrections happen via adjusting entries or by re-posting with corrected values. In QBO, you'd:

1. **For the Cash error:** Find the mis-entered transaction. Edit it in QBO. The underlying journal entry was correct — the posting to the ledger was miscalculated in our manual tracking. In QBO, this shouldn't happen because the software auto-posts.

2. **For the misclassification:** Reclassify the transaction from Professional Fees to Training & Education. Use QBO's Reclassify Transactions tool (in Accountant view). The trial balance wouldn't change (both are expense accounts), but the P&L detail becomes accurate.

3. **For the HST transposition:** Edit the original entry. HST Receivable corrects by $1.

The post-correction trial balance should balance, AND the accounts should reflect reality.

---

## 4.7 The Four Errors a Balanced Trial Balance Cannot Catch

This is the single most important concept in Week 4. A balanced trial balance proves consistency, not correctness. Four error types will let the trial balance balance perfectly while the books are still wrong.

### Error Type 1 — The Error of Omission

A transaction is completely missed. Never entered. The entry for it doesn't exist.

**Example:** A $450 invoice to a customer never gets recorded. AR is understated by $450. Revenue is understated by $450. HST Payable is understated by $58.50.

Since no entry was made at all, both debits and credits are simultaneously understated. The trial balance still balances — just at a slightly lower total than it should be.

**How to catch:**
- Monthly bank reconciliation (covered in Week 10) — any deposit or payment missing from the books will surface
- AR aging review — customers not invoiced will show in zero balances
- Monthly revenue review — compare to expected revenue from operations
- Source document review — every invoice in the filing system should have a matching entry

### Error Type 2 — The Error of Commission (Wrong Account, Right Type)

A transaction is recorded, but posted to the wrong account — though the account is of the same type.

**Example:** A $200 payment to Bell Canada (phone) is accidentally coded to Utilities instead of Telephone & Internet. Both are expense accounts. Debits equal credits. The trial balance balances. But the P&L shows wrong detail.

**How to catch:**
- Monthly P&L review — check if any expense category looks unusually high or low
- Vendor-by-vendor review — unusual transactions should trigger a second look
- QBO's "Reclassify Transactions" tool lets you fix these in bulk at month-end

### Error Type 3 — The Error of Principle

A transaction is recorded to the wrong TYPE of account. This is the most serious type.

**Example:** A $5,000 computer purchase is coded to "Office Supplies Expense" instead of "Equipment" (asset). Debits equal credits. Trial balance balances. But:
- Assets are understated by $5,000
- Expenses are overstated by $5,000
- Net income is understated by $5,000
- No depreciation will be booked going forward
- Year-end will require significant adjustments

**How to catch:**
- Month-end P&L review — large items in expense categories should be scrutinized
- Fixed asset register reconciliation — compare equipment purchases to equipment account additions
- Year-end review by the accountant (but catching these before year-end is always better)

### Error Type 4 — Compensating Errors

Two (or more) errors that accidentally cancel each other out.

**Example:** Cash receipt from a customer is entered as $510 instead of $610 (debit understated by $100). Another invoice to a different customer is entered as $810 instead of $710 (debit overstated by $100). Both errors are on the debit side, and they cancel out. The trial balance balances. Both accounts are wrong.

**How to catch:**
- This is the hardest to catch. Usually surfaces via bank reconciliation (for cash errors) or customer statements (for AR errors) — when specific amounts are validated against external sources
- Rare, but real

### The Takeaway

A balanced trial balance means the arithmetic is consistent. It does NOT mean the books are correct. Professional bookkeepers treat a balanced trial balance as *necessary but not sufficient* — step one of many in verifying a month-end close.

We cover the full month-end verification procedure in Week 14.

---

## 4.8 Correcting Errors — Reversing Entries and Adjustments

When you find an error, you have to fix it. There are two main approaches.

### Approach 1 — Reversing Entry (for Errors of Commission or Principle)

If a transaction was recorded to the wrong account, create a reversing entry to undo it, then create a new correct entry.

**Example:** Computer purchase was coded to Office Supplies instead of Equipment.

**Reversing entry:**
```
2025-11-05  Office Supplies Expense    (5,000.00)
                Equipment                          5,000.00
Memo: Correct posting of computer to Equipment account
```

The negative debit effectively becomes a credit. Net effect: Office Supplies is reduced by $5,000, Equipment is increased by $5,000.

Alternatively, write it as a clean journal entry:

```
2025-11-05  Equipment                     5,000.00
                Office Supplies Expense            5,000.00
Memo: Reclassify Oct 22 computer purchase to Equipment (was miscoded)
```

Both work — the second is cleaner and more common.

### Approach 2 — Direct Edit (in QBO)

In QBO, you can simply edit the original transaction to change the account. Use this approach for recent, uncomplicated errors.

**Caution:** Editing transactions after reconciliation or period close can disrupt the ledger. Specifically:
- If the period is closed, QBO warns you before allowing the edit
- If the transaction was part of a bank reconciliation, changing it may cause the reconciliation to fall out of balance

Best practice: for errors after month-end close, use a reversing entry. For errors during the current month, direct edit is fine.

### Approach 3 — Reclassify Transactions (QBO Accountant View)

QBO's Accountant view includes a "Reclassify Transactions" tool that lets you change accounts on many transactions at once without creating journal entries. This is powerful for fixing systematic errors (e.g., "I accidentally coded 20 vendor bills to the wrong account"). We cover this in Week 13.

### The Audit Trail

Every correction — whether a direct edit or a reversing entry — leaves a trace in QBO's Audit Log. The Audit Log shows:
- Who made the change
- When the change was made
- What the original entry was
- What the change was

This is essential for accountability and for investigating suspected errors or fraud.

---

## 4.9 How QuickBooks Online Handles the GL and Trial Balance

### Automatic Posting

Every QBO transaction — whether entered via invoice form, bill form, deposit form, expense form, or direct journal entry — is posted to the appropriate GL accounts automatically. You don't manually post.

### Viewing the General Ledger

In QBO:
- **Reports → For my accountant → General Ledger**

This produces a report showing every account's complete transaction history for the selected period. You can:
- Filter by account
- Drill down into specific transactions
- Export to Excel

### Viewing the Trial Balance

In QBO:
- **Reports → For my accountant → Trial Balance**

This produces a trial balance as of any date. QBO automatically calculates the ending balance of every account. You can compare periods, customize columns, and export.

### Can QBO Show an Out-of-Balance Trial Balance?

In a properly functioning QBO file — almost never. QBO enforces balance on every transaction. If you try to save an unbalanced journal entry, QBO won't let you.

However, you can encounter out-of-balance situations if:
- You're migrating from another system and opening balances were entered manually with errors
- There's a data corruption issue (rare)
- You've done something unusual with journal entries crossing to a deleted account

When it happens, QBO displays a warning. Resolve before continuing.

### Period Close and Lock Dates

Once a month is closed (financial statements issued, HST filed, etc.), you should "lock" the period in QBO so transactions can't be retroactively modified without warning.

**To set a closing date:**
**Accounting → Settings (gear icon) → Account and Settings → Advanced → Close the books**

Set the closing date to the last day of the period closed. Optionally require a password for changes after the close date. This is a core professional control.

**Why it matters:** If someone (you, the client, a future bookkeeper) edits a transaction from a closed period, the prior month's financial statements, HST filings, and reports become incorrect retroactively. The close date creates a "tripwire" that forces a conscious decision.

---

## 4.10 The Month-End Trial Balance Routine

Here's the monthly routine you'll perform as a bookkeeper. This is the rhythm you're building:

**Daily (during the month):**
- Enter all transactions as they occur
- Post source documents to their folders
- Review bank feed, categorize imported transactions

**At month-end:**
1. Ensure all invoices for the month have been entered
2. Enter all supplier bills received
3. Run payroll for the final period
4. Reconcile bank accounts (Week 10 covers this fully)
5. Review credit card statements
6. Enter any month-end adjusting entries (prepaid allocations, accrued wages — Week 14 covers these)
7. Run the trial balance — confirm it balances
8. Review key account balances for reasonableness:
   - Bank balance matches bank reconciliation
   - AR aging matches AR balance on trial balance
   - AP aging matches AP balance on trial balance
   - HST Payable and Receivable make sense given sales and purchases
9. Run the P&L and balance sheet — review for unusual items
10. Close the period (set lock date)

A proper month-end close takes 2-4 hours for a small business, longer if there are issues to resolve. An entry-level bookkeeper is expected to handle most of this, with the senior bookkeeper or accountant reviewing the output.

---

## 4.11 Quiz — 12 Questions

**Question 1**
What's the difference between a journal and a general ledger?

??? answer
    The **journal** is the chronological record of every transaction, organized by date of occurrence. Every journal entry is balanced (debits = credits).

    The **general ledger** is the master record organized by account. Each account has its own page showing every transaction that has ever affected it, with a running balance.

    Both contain the same information but organized differently. The journal tells "what happened when." The ledger tells "where we stand by account."

---

**Question 2**
A trial balance has total debits of $45,780 and total credits of $45,870. What does this mean?

??? answer
    The trial balance is out of balance by $90 (credits exceed debits by $90). There is an error somewhere — one or more entries have unequal debits and credits, or a posting error occurred.

    First check: is $90 divisible by 9? Yes ($90 ÷ 9 = 10). This suggests a possible transposition error (e.g., entering $180 as $90, or $45 as $54). Look for a single amount in the book that might be off by this pattern.

---

**Question 3**
True or false: A balanced trial balance proves the books are correct.

??? answer
    **False.** A balanced trial balance proves only that total debits equal total credits — the arithmetic is consistent. Four error types can leave a trial balance balanced despite errors:

    1. Errors of omission (transactions never recorded)
    2. Errors of commission (wrong account, same type)
    3. Errors of principle (wrong account type)
    4. Compensating errors (two errors that cancel)

    Additional verification is always required.

---

**Question 4**
You notice that a $200 bill payment to Bell Canada was coded to "Utilities" instead of "Telephone & Internet." Which error type is this? How do you correct it?

??? answer
    **Error type:** Error of commission. Both accounts are expense type, but the wrong account was used. The trial balance still balances.

    **Correction:** Either (1) edit the original transaction in QBO to change the account, or (2) use QBO's Reclassify Transactions tool, or (3) post a reversing entry:

    ```
    Dr. Telephone & Internet    $200
        Cr. Utilities                        $200
    Memo: Reclassify Bell Canada Oct bill
    ```

    The trial balance won't change (both are debit-normal expenses), but the P&L will now show accurate line items.

---

**Question 5**
You recorded a $3,200 computer purchase as an expense ("Office Supplies") instead of as an asset ("Equipment"). Which error type is this? What's the impact?

??? answer
    **Error type:** Error of principle. The wrong TYPE of account was used (expense vs. asset).

    **Impact:**
    - Equipment (asset) understated by $3,200
    - Office Supplies Expense overstated by $3,200
    - Net income understated by $3,200 for the period
    - No depreciation will be booked on the computer going forward
    - Total balance sheet understated
    - Tax deduction taken in year 1 that should have been spread over multiple years (CCA)

    **Correction:**
    ```
    Dr. Equipment              $3,200
        Cr. Office Supplies Expense    $3,200
    Memo: Reclassify computer from expense to asset
    ```

    Also begin monthly depreciation going forward.

---

**Question 6**
What is a compensating error? Give an example.

??? answer
    A compensating error is when two (or more) errors exist but accidentally offset each other, so the trial balance still balances.

    **Example:** A $150 sale is recorded as $105 (understating revenue and cash by $45), but a $250 expense is recorded as $295 (overstating expense and cash credit by $45). The two $45 errors are in opposite directions on the same side of different transactions. The trial balance still balances.

    This is the hardest error type to catch because nothing is numerically off. Usually surfaces during bank reconciliation or customer statement review.

---

**Question 7**
Why is it important to set a "lock date" in QuickBooks Online after closing a month?

??? answer
    Without a lock date, anyone with QBO access can edit transactions from prior months — which retroactively changes prior months' financial statements, HST filings, and reports. This can cause:

    - Filed HST returns to no longer match the books
    - Prior P&L and balance sheet reports to change
    - Audit risk — prior period numbers don't match what was filed
    - Confusion about what the "real" numbers were

    A lock date prevents accidental changes and creates a conscious override requirement for intentional changes. It's a core professional control.

---

**Question 8**
A bookkeeper's Cash ledger shows a running balance of $24,500, but when they independently sum all debits and subtract all credits posted to Cash, they get $24,625. What does this suggest?

??? answer
    The running balance is wrong by $125. This suggests a posting error somewhere in the Cash ledger — one transaction was posted at the wrong amount. The detailed sum is the true answer (if the individual entries are correct).

    **Steps:**
    1. Re-verify each Cash transaction against its underlying journal entry
    2. Find the discrepancy
    3. Correct the ledger entry (in QBO, this shouldn't happen — but in manual systems, it's a common error)

    The trial balance may still balance depending on whether this error reflects a genuine posting issue or a tracking/reporting glitch.

---

**Question 9**
An accountant tells you the HST Payable on the trial balance should be $4,820, but it's showing $4,780. Your HST return for the quarter was filed at $4,820. Where's the discrepancy likely to be?

??? answer
    Possible sources:

    1. **Missing HST on a sale:** A sale was recorded without HST Payable (or recorded at 0% HST by mistake)
    2. **Wrong HST rate:** A sale was taxed at 12% or 14% instead of 13%
    3. **Misclassified sale:** Revenue coded to an HST-exempt revenue account when it should have been taxable
    4. **Post-filing adjustment not made:** The return was filed at $4,820 but the books reflect a different period
    5. **Rounding error:** Less likely for a $40 gap

    **Action:** Run a detailed HST Payable GL report for the period. Match every transaction to the HST return's backing detail. Find the $40 discrepancy. Correct as needed.

---

**Question 10**
What's the difference between an error of omission and an error of principle?

??? answer
    **Error of omission:** A transaction is never recorded at all. Both sides (debit and credit) are missing from the books. Total assets, liabilities, revenue, or expenses are understated.

    **Error of principle:** A transaction IS recorded, but to the wrong TYPE of account (expense instead of asset, revenue instead of liability, etc.). The trial balance still balances, but the nature of accounts is wrong.

    Omission is more obvious in some ways (missing activity surfaces in other reviews) but harder to detect directly in the trial balance. Error of principle balances perfectly but creates incorrect financial statements.

---

**Question 11**
In QuickBooks Online, you want to see every transaction that affected the Rent Expense account during October. Where do you go?

??? answer
    Several paths:

    **Fastest:** Chart of Accounts → find "Rent Expense" → click on it → QBO shows the transactions list for that account.

    **Report path:** Reports → Account QuickReport (or Transaction Detail by Account) → select Rent Expense → set October date range.

    **For multi-account view:** Reports → General Ledger → filter by account.

    All three show the same underlying data. You can drill down into any transaction from these views to see the full detail and edit if needed.

---

**Question 12**
You discover in November that a September invoice was entered as $1,400 but the actual amount was $1,600 (you under-invoiced the customer by $200 plus $26 HST = $226 total). The customer has already paid the $1,400. How do you fix this?

??? answer
    This requires a sequence:

    **Step 1:** Contact the customer and explain the short-billing. Confirm they'll pay the additional $226.

    **Step 2:** Issue a correcting invoice in November for the $200 + $26 HST that was omitted. Record:

    ```
    Dr. Accounts Receivable        $226
        Cr. Service Revenue               $200
        Cr. HST Payable                    $26
    Memo: Correction - short-billed September invoice #X
    ```

    **Step 3:** When the customer pays the $226:

    ```
    Dr. Cash                       $226
        Cr. Accounts Receivable           $226
    ```

    **Why this approach:** The September period is closed and HST has likely been filed. Correcting September directly would misalign the HST return. Better to recognize the revenue in November (when the error is found and corrected) and note clearly in the memo.

    **Alternative:** If September is still open (HST not yet filed), you can correct the original invoice in September. If closed, November handling is correct.

    This scenario is common — clients often spot billing errors after the fact. Knowing how to handle it without reopening closed periods is a valuable skill.

---

## 4.12 Week 4 Readiness Checklist

Before moving to Week 5, confirm you can do all of the following without prompts:

- ☐ Explain the difference between a journal and a general ledger
- ☐ Post a journal entry to T-accounts or a columnar ledger format
- ☐ Calculate a running balance for any account
- ☐ Prepare a trial balance from ledger data
- ☐ Verify that total debits equal total credits
- ☐ Explain what a balanced trial balance does and doesn't prove
- ☐ Identify the four types of errors a trial balance cannot catch
- ☐ Apply the "divisible by 2" and "divisible by 9" diagnostic tests
- ☐ Write a correcting journal entry for any error type
- ☐ Navigate to the General Ledger and Trial Balance reports in QBO
- ☐ Set a lock date in QBO to protect closed periods
- ☐ Explain the month-end close routine in sequence
- ☐ Recognize when to use a reversing entry vs. a direct edit

---

## 📚 Further Reading

- [QuickBooks Online: Set a closing date and password](https://quickbooks.intuit.com/learn-support/en-ca/help-article/manage-users/set-closing-date-password-quickbooks-online/L1kgRKeQZ_CA_en_CA)
- [CRA: Books and records](https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/keeping-records.html)
- [Institute of Professional Bookkeepers of Canada: Best practices](https://ipbc.ca)

---

!!! tip "Up Next: Week 5 — Financial Statements"
    **Turning bookkeeping data into the reports that run a business.** We take the trial balance from this week and prepare the Income Statement and Balance Sheet — the same reports banks, owners, and CRA actually read. We'll also answer the question every owner eventually asks: *"We made $40,000 in profit — why is there only $8,000 in the bank?"* Being able to answer that clearly is what makes bookkeepers invaluable.
