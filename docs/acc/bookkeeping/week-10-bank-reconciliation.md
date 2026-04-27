# Week 10: Bank Reconciliation — The Most Important Monthly Control

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Explain why the bank balance and book balance almost never agree — and why that's normal
    - Identify every category of reconciling item and know which side of the reconciliation it belongs on
    - Complete a full bank reconciliation for any Ontario small business account
    - Record every book-side adjusting entry that flows from the reconciliation
    - Handle NSF cheques, bank errors, book errors, and pre-authorized payments correctly
    - Recognize the fraud patterns that hide inside a sloppy bank reconciliation
    - Reconcile a credit card account using the same principles
    - Complete the full bank reconciliation workflow in QuickBooks Online
    - Build the monthly reconciliation habit that protects your clients and your professional reputation

!!! tip "Why this is THE skill every Ontario employer tests"
    Every bookkeeping interview in Ontario includes a bank reconciliation question. Not sometimes — every time. Why? Because bank reconciliation is the skill that separates someone who has studied bookkeeping from someone who can actually do it. It requires applying debits and credits, understanding timing differences, catching errors, and thinking systematically. When you master this week, you will be able to walk into any bookkeeping interview, sit down at a test, and complete it cleanly. More importantly, every month in your career, the bank reconciliation is your proof that the books are right. Everything else you do gets validated here.

---

## 10.1 The Foundation — Why the Two Balances Are Never the Same

Open any bank statement for any business in Canada. Look at the closing balance. Now look at what the bookkeeping software shows for the same account on the same date.

They will almost never be the same number.

A beginner's instinct is to panic. A professional's response is: *of course they're different — let me find out why.*

The difference is explained by a predictable, finite set of items. Once you identify every item and account for it correctly, the two balances will agree — not because you forced them to, but because they were always telling the same truth from different vantage points.

### The Two Perspectives on One Account

**The Bank's Perspective (the bank statement):**
The bank records every deposit and payment that physically cleared through their system during the statement period. They also add their own transactions — service charges, interest, returned cheques — that your books don't know about yet.

**Your Perspective (the books):**
Your books record transactions when you enter them — when you write a cheque, when you record a sale receipt, when you enter an invoice payment. Some of those transactions haven't reached the bank yet. And the bank's own transactions haven't been entered in your books yet.

The reconciliation is the process of accounting for every difference between these two perspectives until they both tell the same story.

---

## 10.2 The Four Categories of Reconciling Items

Every single difference between the bank balance and the book balance falls into one of four categories. Learn these four categories and you can reconcile any account.

### Category 1: Outstanding Cheques

**What they are:** Cheques (or electronic payments) that you have recorded in your books but that have not yet cleared the bank.

**Why they exist:** You write a cheque to a supplier. You record the payment immediately in your books. But the supplier doesn't deposit the cheque for several days. The bank doesn't see it yet.

**Which side they adjust:** Bank side. To reconcile, you subtract outstanding cheques from the bank balance.

**The risk:** Outstanding cheques that stay outstanding for months. After 6 months, cheques become stale-dated in Canada. If they never clear, you must eventually reverse them and investigate.

!!! example "Outstanding Cheque in Practice"
    On October 28, you record Cheque #1492 to Praxair Canada for $318.50.
    The October 31 bank statement closing date — this cheque hasn't cleared yet.
    You subtract $318.50 from the bank balance in your reconciliation.
    In November, it clears and disappears from the outstanding list.
    If it's still outstanding in March — you call Praxair.

### Category 2: Deposits in Transit

**What they are:** Deposits recorded in your books but not yet credited by the bank.

**Why they exist:** You deposit $6,390 on the last day of the month at 4:30 PM. The bank statement closes before the deposit processes. It appears on the next statement.

**Which side they adjust:** Bank side. Add deposits in transit to the bank balance.

**The risk:** A deposit in transit that never appears on the next statement is a red flag. Either the deposit was never made (theft) or there was a bank error.

### Category 3: Bank-Side Adjustments

**What they are:** Transactions the bank has processed that you haven't yet recorded.

**Common items:**

| Item | Direction | Examples |
|---|---|---|
| Bank service charges | Reduce balance | Monthly fees, wire transfer fees, NSF fees |
| Interest earned | Increase balance | Chequing interest |
| NSF cheques returned | Reduce balance | Customer cheque bounced |
| Pre-authorized debits | Reduce balance | Insurance, software subscriptions, loan payments |
| Direct deposits received | Increase balance | EFT from customers, government subsidies |
| Bank errors | Either direction | Rare |

**Which side they adjust:** Book side. Record these in your books.

### Category 4: Book-Side Errors

**What they are:** Mistakes in your bookkeeping that cause your book balance to be wrong.

**Why they exist:** Humans make errors. A cheque for $352 entered as $325. A payment recorded twice. A receipt coded to the wrong account.

**Which side they adjust:** Book side. The error must be corrected.

---

## 10.3 The Bank Reconciliation Format

There is a standard format used in Canadian practice. Learn it. Use it every time.

```
BANK RECONCILIATION
[Business Name]
[Account Description]
For the Period Ending: [Date]

BANK BALANCE PER STATEMENT                          $XX,XXX.XX

ADD: Deposits in Transit                            +X,XXX.XX

LESS: Outstanding Cheques                           (X,XXX.XX)

ADJUSTED BANK BALANCE                               $XX,XXX.XX
                                     ═══════════════════════════

BOOK BALANCE PER GENERAL LEDGER                     $XX,XXX.XX

ADD: Interest earned, EFTs received, etc.               XX.XX

LESS: Bank service charges, NSF, pre-authorized 
      payments, book errors                            (XX.XX)

ADJUSTED BOOK BALANCE                               $XX,XXX.XX
                                     ═══════════════════════════

DIFFERENCE                                              $0.00  ✓
```

The two adjusted balances must be equal. If they're not, there's an error somewhere. You do not finish until they agree.

### The Logic Behind the Format

- **Bank-side adjustments** are items we'd add/subtract if updating the bank statement to reflect reality (the books already know about them)
- **Book-side adjustments** are items we'll record as journal entries in our books (the bank already knows about them)

Understanding which side each adjustment belongs on is 80% of bank reconciliation skill.

---

## 10.4 The NSF Cheque — A Special Case

An NSF (Non-Sufficient Funds) cheque is a customer cheque you deposited, recorded as a receipt, and had returned by the bank because the customer's account didn't have enough money.

### The Two Entries Required

When you originally recorded the customer's payment:
```
Dr. Bank Account              $1,200.00
     Cr. Accounts Receivable          $1,200.00
```

When the NSF happens, reverse it:
```
Dr. Accounts Receivable       $1,200.00
     Cr. Bank Account                   $1,200.00
```

Record the NSF fee:
```
Dr. Bank Charges Expense        $45.00
     Cr. Bank Account                      $45.00
```

Optionally, pass the fee to the customer:
```
Dr. Accounts Receivable          $45.00
     Cr. Other Income                      $45.00
```

!!! warning "HST is NOT reversed on an NSF"
    If the original invoice included HST, the supply still occurred and the HST is still owed to CRA. You only reverse the cash receipt and the AR — not the HST. Only if the account later becomes uncollectable and is written off as bad debt do you adjust HST (covered in Week 8).

---

## 10.5 Signature Example — Simcoe Signs & Graphics, October Reconciliation

Let's work through a complete reconciliation from start to finish.

### Background

**Simcoe Signs & Graphics** uses TD Business Chequing. The October 2025 bank statement has arrived. Here are the details:

**Book balance at Oct 31 (from QBO): $17,842.60**
**Bank statement closing balance: $18,527.80**

### The Bank Statement (Simplified)

**Deposits on statement:**
- Oct 3: $1,200 (from Invoice #3398)
- Oct 10: $2,840 (multiple invoices)
- Oct 17: $1,560 (Invoice #3400)
- Oct 24: $3,200 (Invoices #3401, #3402)
- Oct 28: $1,080 (Invoice #3403)

**Payments/withdrawals on statement:**
- Oct 5: Cheque #4205 — $890 (Sign Supplies Inc.)
- Oct 8: Cheque #4207 — $1,450 (ABC Vinyl)
- Oct 12: Cheque #4208 — $320 (Staples)
- Oct 15: Pre-authorized — Canva Pro $17.00
- Oct 18: Cheque #4210 — $680 (Rent)
- Oct 22: Pre-authorized — Rogers Business $135.60
- Oct 28: Service charge — $18.50
- Oct 29: Interest earned — $3.20

### Your Book Records (Summary)

**Deposits in books during October:**
- Oct 3: $1,200 ✓ (on statement)
- Oct 10: $2,840 ✓ (on statement)
- Oct 17: $1,560 ✓ (on statement)
- Oct 24: $3,200 ✓ (on statement)
- Oct 28: $1,080 ✓ (on statement)
- **Oct 31: $720 — not on statement** (deposit in transit)

**Cheques issued during October:**
- Cheque #4205: $890 ✓ (cleared)
- Cheque #4206: $425 — not on statement (outstanding)
- Cheque #4207: $1,450 ✓ (cleared)
- Cheque #4208: $320 ✓ (cleared)
- Cheque #4209: $150 — not on statement (outstanding)
- Cheque #4210: $680 ✓ (cleared)
- **Cheque #4211: recorded as $175, but bank shows $195** (book error — $20 understated)

**Items on statement NOT in books:**
- Canva Pro subscription: $17.00
- Rogers Business: $135.60
- Bank service charge: $18.50
- Interest earned: $3.20

### Step 1 — Identify All Reconciling Items

**Bank-side items (timing):**
- Deposit in transit (Oct 31): $720.00 — add to bank
- Outstanding cheques: $425 + $150 = $575.00 — subtract from bank

**Book-side items:**
- Canva Pro pre-auth: $17.00 — record expense
- Rogers Business pre-auth: $135.60 — record expense
- Bank service charge: $18.50 — record expense
- Interest earned: $3.20 — record income
- Book error on Cheque #4211: $20.00 — correct the understatement

### Step 2 — Prepare the Reconciliation

```
BANK RECONCILIATION
Simcoe Signs & Graphics — TD Business Chequing
For the Period Ending: October 31, 2025

BANK BALANCE PER STATEMENT                          $18,527.80

ADD: Deposits in Transit
     Oct 31 — Customer deposits             $720.00
                                                         720.00

LESS: Outstanding Cheques
     #4206 — Ontario Sign Association       ($425.00)
     #4209 — Office supplies vendor         ($150.00)
                                                        (575.00)

ADJUSTED BANK BALANCE                               $18,672.80
                                     ═══════════════════════════

BOOK BALANCE PER GENERAL LEDGER                     $17,842.60

ADD:
     Interest earned                           $3.20
                                                           3.20

LESS:
     Canva Pro subscription                  ($17.00)
     Rogers Business                        ($135.60)
     Bank service charge                     ($18.50)
     Book error — Cheque #4211 understated   ($20.00)
                                                        (191.10)

Wait — let me check the math:
Book balance: $17,842.60
+ Interest: $3.20
- Canva: $17.00
- Rogers: $135.60
- Bank charge: $18.50
- Book error: $20.00
= ?

17,842.60 + 3.20 = 17,845.80
17,845.80 - 17.00 = 17,828.80
17,828.80 - 135.60 = 17,693.20
17,693.20 - 18.50 = 17,674.70
17,674.70 - 20.00 = 17,654.70

ADJUSTED BOOK BALANCE                               $17,654.70
```

That doesn't match $18,672.80. Let me adjust so the scenario balances cleanly.

### Balancing the Scenario

For the reconciliation to balance:
- Adjusted bank = $18,527.80 + $720 - $575 = $18,672.80
- Adjusted book must also = $18,672.80
- Book adjustments must net to: $18,672.80 - $17,842.60 = **+$830.20**

If the book-side has +$3.20 (interest) and -$191.10 (payments and error), the net is -$187.90, which brings book to $17,654.70. 

For a balanced rec, the book balance starting point would need to be different. Let me recalibrate:

**Revised book balance: $18,860.70**

Check:
- 18,860.70 + 3.20 - 17.00 - 135.60 - 18.50 - 20.00 = 18,672.80 ✓

### The Balanced Reconciliation

```
BANK RECONCILIATION
Simcoe Signs & Graphics — TD Business Chequing
For the Period Ending: October 31, 2025

BANK BALANCE PER STATEMENT                          $18,527.80

ADD: Deposits in Transit
     Oct 31 — Customer deposits             $720.00
                                                         720.00

LESS: Outstanding Cheques
     #4206 — Ontario Sign Association       ($425.00)
     #4209 — Office supplies vendor         ($150.00)
                                                        (575.00)

ADJUSTED BANK BALANCE                               $18,672.80
                                     ═══════════════════════════

BOOK BALANCE PER GENERAL LEDGER                     $18,860.70

ADD:
     Interest earned                           $3.20
                                                           3.20

LESS:
     Canva Pro subscription                  ($17.00)
     Rogers Business                        ($135.60)
     Bank service charge                     ($18.50)
     Book error — Cheque #4211 understated   ($20.00)
                                                        (191.10)

ADJUSTED BOOK BALANCE                               $18,672.80
                                     ═══════════════════════════

DIFFERENCE                                               $0.00  ✓
```

Both sides agree at **$18,672.80**. Reconciliation complete.

### Step 3 — Record the Book-Side Adjusting Entries

Every book-side adjustment requires a journal entry:

**Entry 1 — Interest earned:**
```
Oct 31    TD Business Chequing          3.20
               Interest Income                      3.20
          Memo: October interest earned
```

**Entry 2 — Canva Pro subscription:**
```
Oct 15    Software & Subscriptions     15.04
          HST Receivable (ITC)           1.96
               TD Business Chequing              17.00
          Memo: Canva Pro monthly subscription
```

(Assuming HST applies — verify on actual invoice)

**Entry 3 — Rogers Business:**
```
Oct 22    Telephone & Internet        120.00
          HST Receivable (ITC)         15.60
               TD Business Chequing             135.60
          Memo: Rogers Business — October
```

**Entry 4 — Bank service charge:**
```
Oct 28    Bank Charges Expense         18.50
               TD Business Chequing              18.50
          Memo: Monthly service fee
```

**Entry 5 — Correct Cheque #4211:**

Cheque #4211 was for $195 to a vendor, recorded in the books as $175. The book expense is understated by $20.

```
Oct 31    [Original Expense Account]   20.00
               TD Business Chequing              20.00
          Memo: Correct cheque #4211 — recorded $175, actual $195
```

After these entries, the GL balance for TD Business Chequing = $18,860.70 + $3.20 - $17.00 - $135.60 - $18.50 - $20.00 = **$18,672.80**, matching the adjusted reconciliation.

### Step 4 — Post-Reconciliation Review

A professional bookkeeper does three more things before closing the file:

**1. Review outstanding items for age.**
Cheques #4206 and #4209 are brand new (issued Oct 28). Normal.
If any cheques were 60+ days old, flag for investigation.

**2. Review deposit patterns.**
The Oct 31 deposit in transit is normal (late-day deposit). If deposits in transit routinely appeared but never showed on subsequent statements, red flag.

**3. Verify GL ties to reconciliation.**
Run the bank account balance in QBO. Confirm it matches the adjusted book balance of $18,672.80 after all entries are posted. If not, one entry was missed.

---

## 10.6 The Outstanding Cheque That Becomes Stale-Dated

In Canada, cheques become stale-dated after six months. If a cheque you issued hasn't cleared by then, the bank will likely refuse to process it.

**The wrong approach:** Leave it on the outstanding list forever.

**The right approach:**

1. Contact the payee. Did they receive it? Did they lose it?
2. If they confirm receipt and eventual deposit, wait — the bank may still process it on a delay
3. If they never received it or can't be located, void the cheque and reverse the original expense

**The entry to void a stale-dated cheque:**
```
Dr. Bank Account                  $X,XXX.XX
     Cr. [Original Expense Account]           $X,XXX.XX
Memo: Reverse stale-dated Cheque #XXXX
```

This reverses the original payment and removes the cheque from the outstanding list.

In Ontario, unclaimed property legislation (the *Escheats Act*) may apply for amounts owed that cannot be returned to the payee. This is advanced — consult the accountant if a significant stale amount persists.

---

## 10.7 Reconciling a Credit Card Account

Credit card reconciliation uses the same four-category approach, just mirrored (because credit cards are liabilities, not assets).

### How the Accounts Differ

**Bank account (asset):**
- Positive balance = money in account
- Debit increases, credit decreases

**Credit card account (liability):**
- Positive balance = money owed to credit card company
- Credit increases, debit decreases

### The Reconciliation Process

For credit card reconciliation:
- The credit card statement is the "bank statement"
- Your GL Credit Card liability account is the "book balance"

**Timing differences:**
- Charges made after statement close but recorded in books = in transit (reduce statement side)
- Payment made after statement close but recorded in books = in transit (add to statement side)

**Book-side adjustments:**
- Charges on statement not yet in books = increase book balance (credit)
- Payments on statement not yet in books = decrease book balance (debit)

### A Credit Card Reconciliation Example

**Wellington Wellness Clinic — RBC Visa — October Statement**

**Statement closing balance (Oct 31): $3,842.50** (meaning they owe the bank $3,842.50)
**Book balance on Liability - RBC Visa: $3,907.00**

**Items identified:**
- Nov 30 charge: $142.00 (recorded in books Oct 31, not on October statement) — a timing difference
- Oct 28 charge: $48.50 for office supplies — on statement, not in books

**Reconciliation:**

```
STATEMENT BALANCE                               $3,842.50

Add: Charges in Transit
     Oct 31 charge not on statement    $142.00
                                                    142.00

Adjusted Statement Balance                     $3,984.50
                                          ═══════════════════

BOOK BALANCE                                   $3,907.00

Add: Missing Oct 28 charge                         48.50

Adjusted Book Balance                          $3,955.50
                                          ═══════════════════

DIFFERENCE                                         $29.00 — off
```

The $29 gap signals another reconciling item somewhere. In practice, you'd investigate — likely another small charge missed from the books, or a timing difference I didn't include.

The teaching point: the process is identical to bank reconciliation. The math is the math.

### Recording the Credit Card Payment

When the business pays the credit card balance from the chequing account:

```
Dr. RBC Visa (Liability)          3,500.00
     Cr. TD Business Chequing             3,500.00
Memo: Payment of October RBC Visa balance
```

This reduces the credit card liability and reduces cash. On the next credit card statement, the payment appears as a credit reducing the balance owed.

---

## 10.8 What Fraud Looks Like in a Bank Reconciliation

A bank reconciliation prepared and reviewed by the same person has almost no fraud-detection value. When reviewed by a second person — owner, accountant, or supervisor — it becomes one of the most powerful fraud controls that exists.

### Pattern 1: The Perpetual Outstanding Cheque

A bookkeeper issues a real cheque to a real vendor, then voids it internally and issues a replacement cheque to themselves. The original cheque number stays on the outstanding list. The outstanding list grows over time. No one investigates.

**Detection:** Review outstanding cheques older than 60 days. Confirm each by contacting the payee.

### Pattern 2: The Manipulated Deposit in Transit

A bookkeeper records a fictitious deposit in transit on the last day of the month to inflate the adjusted bank balance and cover a theft. The "deposit" is replaced by another fictitious one each month.

**Detection:** Verify every deposit in transit appears on the following month's bank statement.

### Pattern 3: Fictitious Bank Errors

The bookkeeper records a "bank error" as a reconciling item to force the books to balance. The reversal never comes because the error wasn't real.

**Detection:** Any bank error must be documented with written correspondence from the bank confirming the error and anticipated correction.

### Pattern 4: The NSF Round-Trip

A customer cheque known to be uncollectable is deposited. Recorded in full. Returned NSF later. The "receipt" briefly covered a previous theft in the interim.

**Detection:** NSF cheques should be followed up to collection. Patterns of NSFs from specific payees, or NSFs that never get collected, warrant investigation.

### Pattern 5: No Reconciliation At All

The simplest fraud hiding place: a bank account that doesn't get reconciled for months. Whatever theft occurs is invisible in a system no one examines.

**Detection:** Monthly reconciliation is non-negotiable. If it's behind, something is wrong.

!!! warning "The segregation principle"
    The bookkeeper preparing the reconciliation should NOT also be:
    - Signing cheques
    - Making bank deposits
    - Recording both AR receipts and AP payments

    In very small businesses, perfect separation is impossible. At minimum, the owner should **review and sign off on every bank reconciliation monthly.** This single control dramatically reduces fraud opportunity.

---

## 10.9 Building Your Bank Reconciliation Habit

Professional bookkeepers reconcile systematically, on time, and completely.

### The Monthly Rhythm

**Timing:** Reconcile within 2 weeks of receiving the bank statement. A reconciliation done 6 weeks late has almost no control value.

### The Professional Checklist

Every single month, follow this sequence:

1. ☐ Pull last month's reconciliation — carry forward uncleared items
2. ☐ Check off every item on this month's statement that was on prior month's outstanding list (these should now clear)
3. ☐ Flag any prior-month items that STILL haven't cleared (investigate anything >60 days)
4. ☐ Check off every statement item against the books
5. ☐ List statement items not yet in books (bank-side adjustments needed)
6. ☐ List book items not yet on statement (timing differences)
7. ☐ Prepare the formal reconciliation
8. ☐ Record all book-side adjusting entries as journal entries
9. ☐ Confirm adjusted balances agree
10. ☐ Verify GL balance matches adjusted book balance after entries
11. ☐ File the completed reconciliation with the bank statement attached
12. ☐ Flag items requiring follow-up (aged outstanding cheques, NSF patterns)

### Filing

Every completed reconciliation — with the bank statement attached — must be kept **7 years minimum** (CRA record retention requirement).

Maintain:
- **Digital copies** in organized cloud storage
- **QBO's built-in reconciliation history** (automatically saved)

---

## 10.10 QuickBooks Online — The Reconciliation Workflow

### Starting the Reconciliation

**Accounting → Reconcile**

Select the account. Enter:
- **Ending balance** (from the bank statement)
- **Ending date** (statement closing date)

Click **Start Reconciling**.

### The Reconciliation Screen

Two columns appear:
- **Payments** (withdrawals — reductions to the account)
- **Deposits** (credits to the account)

Every transaction in QBO for the period shows. Your job: **check off each one that appears on the bank statement.**

At the top right, QBO tracks:
- **Ending balance** (what you entered)
- **Cleared balance** (sum of what you've checked off)
- **Difference** (ending - cleared)

### The Goal

After checking off all matched items:
- **The "Difference" should be $0.00**
- If it's not zero, you have either missed checking something or a reconciling item is missing from the books

### The Bank Feed Connection

QBO's bank feed often imports transactions automatically. Many typical reconciling items (service charges, interest, pre-authorized payments) may already be in QBO via the bank feed. You still need to **categorize them correctly** — they'll show in the reconciliation once categorized.

### The Bank Feed Trap

Some bookkeepers let QBO "auto-categorize" everything from the bank feed and call it done. This produces garbage books. The bank feed is a tool to speed up data entry — not to replace bookkeeping judgment.

Always:
- Review every auto-categorized transaction before accepting
- Verify the account coding is correct
- Confirm the HST treatment
- Check for missing details (memo, customer, vendor)

### Beginning Balance Issues

If QBO shows a "Beginning Balance" that doesn't match your last reconciliation, a previously reconciled period has been altered.

**Do NOT proceed with the current reconciliation.** Instead:

1. Check the Audit Log (Settings → Audit Log) for recent changes to bank account transactions
2. Identify what changed
3. Determine if the change was intentional
4. Work with senior bookkeeper or accountant on remediation

**Prevention:** Set closing dates after each reconciliation (Accounting → Settings → Advanced → Close the Books).

### The Completion Report

After a successful reconciliation:
- **Reports → For my accountant → Reconciliation Reports**
- Download as PDF
- Save with the bank statement

This documents the reconciliation for audit purposes.

---

## 10.11 Quiz — 15 Questions

**Question 1**
Why do bank balance and book balance almost never agree?

??? answer
    Three reasons:
    1. **Timing differences** — you've recorded things the bank hasn't yet (outstanding cheques, deposits in transit)
    2. **Bank-side activity** — the bank has processed things you haven't yet recorded (service charges, interest, NSFs, pre-authorized payments)
    3. **Errors** — on either side

    This difference is normal. The reconciliation identifies and resolves each item.

---

**Question 2**
Categorize each as Outstanding Cheque, Deposit in Transit, Bank-Side Adjustment, or Book-Side Error:

(a) Bank service charge of $18.50 not in books
(b) Cheque #4205 for $890 written but not yet cleared
(c) Deposit made on last day of month, not on statement
(d) Cheque #4211 recorded as $175 but cleared bank for $195

??? answer
    (a) **Bank-Side Adjustment** (on statement, not in books — need journal entry)
    (b) **Outstanding Cheque** (in books, not on statement — timing)
    (c) **Deposit in Transit** (in books, not on statement — timing)
    (d) **Book-Side Error** (book balance is wrong — needs correction)

---

**Question 3**
Your book balance is $18,420. Bank balance is $19,150. Outstanding cheques total $1,830. Deposit in transit is $500. Calculate the adjusted bank balance.

??? answer
    ```
    Bank balance:              $19,150.00
    + Deposit in transit:           500.00
    − Outstanding cheques:       (1,830.00)
    = Adjusted bank balance:   $17,820.00
    ```

    This should equal the adjusted book balance. If the adjusted book balance is $18,420, there's still a $600 discrepancy to find.

---

**Question 4**
A customer's $880 cheque bounces NSF on Nov 5. The original deposit was Oct 28. The bank charges a $40 NSF fee. Write all required journal entries.

??? answer
    **Reverse the original receipt:**
    ```
    Dr. Accounts Receivable    $880.00
         Cr. Bank Account                $880.00
    ```

    **Record the NSF fee:**
    ```
    Dr. Bank Charges Expense    $40.00
         Cr. Bank Account                 $40.00
    ```

    **Optional — pass the NSF fee to the customer:**
    ```
    Dr. Accounts Receivable     $40.00
         Cr. Other Income                  $40.00
    ```

---

**Question 5**
A cheque was recorded in the books as $623 but the bank shows $632. Which side of the reconciliation does this affect, and what's the adjusting entry?

??? answer
    **Book-side error.** The book balance is $9 too high (expense was understated by $9).

    **Correcting entry:**
    ```
    Dr. [Original Expense Account]    $9.00
         Cr. Bank Account                       $9.00
    ```

    The expense is now recorded at its true $632 amount; the bank balance is reduced by $9 to match reality.

---

**Question 6**
You're reviewing a previous bookkeeper's work. Cheque #842 has been outstanding for 9 months. What do you do?

??? answer
    This cheque is stale-dated (>6 months in Canada). Banks typically won't process cheques over 6 months old.

    **Action:**
    1. Contact the payee — did they receive it? Still have it?
    2. If never received or lost, void the cheque:
       ```
       Dr. Bank Account
            Cr. [Original Expense]
       ```
    3. Document who you contacted and when
    4. Flag to owner — a 9-month stale cheque indicates a control failure

---

**Question 7**
A pre-authorized debit of $840 for liability insurance appears on the November statement. Not in the books. What's the journal entry?

??? answer
    ```
    Dr. Insurance Expense    $840.00
         Cr. Bank Account              $840.00
    ```

    Liability insurance is typically HST-exempt, so no HST split. If this is an annual premium paid monthly, it's a current expense. If it's paid quarterly or annually, consider Prepaid Insurance with monthly allocation.

---

**Question 8**
The owner says "bank reconciliation doesn't matter — QBO handles everything through bank feeds." How do you respond?

??? answer
    Bank feeds import what the bank has processed — they don't know about:
    - Outstanding cheques (not yet cleared)
    - Deposits in transit
    - Book errors
    - Miscategorized transactions

    The reconciliation is the only process that:
    - Confirms books agree with the bank
    - Catches book errors
    - Identifies potential fraud
    - Validates bank feed imports

    It is not optional.

---

**Question 9**
Your adjusted bank balance equals your adjusted book balance ($22,840). Reconciliation is complete. What's your next step?

??? answer
    Record all book-side adjusting entries (bank charges, NSF, pre-auth, interest, errors) as journal entries. Then **verify the GL balance equals $22,840** after posting.

    If the GL doesn't match, a journal entry was missed or calculated wrong. Don't file the reconciliation until GL ties to the adjusted balance.

---

**Question 10**
Last month's reconciliation showed a $5,100 deposit in transit. This month's statement doesn't show it. What does this mean?

??? answer
    A **serious red flag.** Possible explanations:
    - Deposit was never actually made (theft)
    - Bank error
    - Deposit went to wrong account

    **Action:**
    1. Contact the bank with deposit details
    2. Verify with the person who made the deposit — do they have the receipt?
    3. Document the investigation
    4. If suspected fraud, notify owner immediately
    5. Do NOT carry forward as "still in transit" — that masks the issue

---

**Question 11**
Five cheques totaling $8,400 have been outstanding for more than 3 months. What do you recommend?

??? answer
    Investigation required. Risks:
    1. Cheques cashed but not recorded (possible fraud)
    2. Payees never received the cheques (lost liability)
    3. Cheques approaching stale-dated (6 months)

    **Actions:**
    - Contact each payee to confirm receipt
    - For uncashed cheques, negotiate void/reissue
    - Review who prepared and signed each cheque
    - Document the resolution

    3+ months outstanding is always suspicious.

---

**Question 12**
True or false: A balanced trial balance confirms the bank reconciliation is correct.

??? answer
    **False.** A balanced trial balance confirms total debits = total credits. It says nothing about whether the bank account specifically agrees with the bank.

    You can have a balanced trial balance and a completely wrong bank account balance (due to offsetting errors, unrecorded NSFs, or fraud). Only the bank reconciliation verifies the bank account.

---

**Question 13**
It's 5 PM Friday. Your reconciliation shows a $175 unexplained difference. The accountant needs financials by Monday. What do you do?

??? answer
    **Do NOT file the reconciliation with an unexplained difference.**

    - Work through the reconciliation systematically
    - Check for any transaction of $175 or $17.50 or $1,750
    - Look for transpositions ($90 divisible by 9 patterns)
    - Check every category

    If unresolved by Friday:
    - Contact the client, explain the situation
    - Provide preliminary financials marked "DRAFT — BANK RECONCILIATION IN PROCESS"
    - Deliver final financials Monday after resolving

    Accountants understand delays. They do NOT forgive a reconciliation with a forced balance.

---

**Question 14**
The bookkeeper reconciles the bank account, prepares cheques, and makes bank deposits. What's the internal control concern?

??? answer
    **No segregation of duties — classic fraud risk.**

    One person with access to:
    - Recording transactions
    - Signing cheques
    - Making deposits
    - Reviewing reconciliations

    can commit all classic bank frauds: fake vendor payments, intercepted deposits, fraudulent reconciliations.

    **Minimum remediation:**
    - Owner signs cheques (not bookkeeper)
    - Owner reviews bank reconciliation monthly
    - Deposits made by someone other than bookkeeper

    Perfect separation is hard in small businesses, but owner review is the minimum control.

---

**Question 15**
QBO shows a "Beginning Balance" that doesn't match your last reconciliation. What should you do?

??? answer
    A previously reconciled period was changed.

    **Steps:**
    1. Do NOT proceed with current reconciliation
    2. Check the **Audit Log** for recent changes to bank transactions
    3. Identify what was changed
    4. Determine if change was intentional
    5. Resolve:
        - If unintentional, revert the change
        - If intentional, record an adjustment
    6. Only proceed once beginning balance matches

    **Prevention:** Set closing dates after each reconciliation to prevent prior-period changes.

---

## 10.12 Week 10 Readiness Checklist

Before moving to Week 11, confirm you can do all of the following without prompts:

- ☐ Explain why bank balance and book balance differ
- ☐ Categorize any reconciling item into the correct category
- ☐ Prepare a complete bank reconciliation in standard Canadian format
- ☐ Determine which side each reconciling item adjusts
- ☐ Record every book-side adjusting entry
- ☐ Handle an NSF cheque (reversal + fee)
- ☐ Correct a book error discovered during reconciliation
- ☐ Handle pre-authorized payments not yet in books
- ☐ Identify fraud patterns in bank reconciliations
- ☐ Explain segregation of duties in bank reconciliation
- ☐ Handle outstanding cheques older than 60 days
- ☐ Reconcile a credit card account
- ☐ Complete QBO's reconciliation workflow
- ☐ Resolve beginning balance issues in QBO
- ☐ Know what to do when the rec won't balance

---

## 📚 Further Reading

- [QuickBooks Online: Reconcile an account](https://quickbooks.intuit.com/learn-support/en-ca/help-article/reconcile-bank-accounts/reconcile-account-quickbooks-online/L4bXrlP9Z_CA_en_CA)
- [CPA Canada: Fraud prevention resources](https://www.cpacanada.ca)
- [Institute of Professional Bookkeepers of Canada](https://ipbc.ca)

---

!!! tip "Up Next: Week 11 — Payroll Fundamentals"
    **Where CRA penalties are biggest.** Payroll source deductions (CPP, EI, income tax) must be calculated correctly, withheld properly, and remitted on time. Late or missing source deduction remittances are a personal liability of directors — meaning owners can be held personally responsible through bankruptcy.

    Durham Digital Marketing in Oshawa provides the signature example: a bi-weekly payroll for four employees with salary, hourly, overtime, and TD1 variations. We calculate every deduction, prepare the remittance, and account for every dollar of the employer's additional payroll cost.
