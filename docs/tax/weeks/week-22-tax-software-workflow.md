# Week 22: Tax Software Mastery — Working at Professional Speed

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Choose the right tax software for your practice and understand what each does
    - Navigate professional EFILE-certified software efficiently from intake to submission
    - Build a workflow that lets you prepare 8–12 returns per day without errors
    - Use software correctly for every income type, credit, and provincial form you've learned
    - Catch and correct the errors that software cannot catch on its own
    - Understand the EFILE system — registration, transmission, and confirmation
    - Set up a client file system that supports CRA review responses
    - Use CRA My Account as a professional research tool integrated into your workflow
    - Recognize the software's limitations and know when human judgment overrides automation

!!! tip "The mindset shift this week demands"
    Every prior week was about knowing the rules. This week is about **executing at speed without sacrificing accuracy**. A tax preparer who knows every rule but takes 4 hours per return will not build a sustainable practice. A preparer who files 15 returns a day with errors will not keep clients. Professional software is the bridge — it handles the arithmetic and form generation while you provide the judgment, the questions, and the review. Understanding software deeply is what separates a \$75/return preparer from a \$350/return preparer serving the same client.

---

## 22.1 The Canadian Tax Software Landscape — Choosing Your Platform

As a new professional preparer in Ontario, you will choose one primary software platform and become deeply proficient in it. Here are the main options used in Canadian professional practice:

### Professional EFILE-Certified Software (What You Need)

| Software | Best For | Pricing Model | Notes |
|---|---|---|---|
| **TaxCycle** | Growing practices, multi-preparer firms | Per-return or annual bundle | Industry-leading professional UX, strong review tools, excellent CRA integration |
| **ProFile (Intuit)** | High-volume practices | Annual license | Deep integration with QuickBooks, widely used in accounting firms |
| **Cantax** | Experienced practices, corporate + personal | Per-return | Strong T2 + T1 integration — useful when serving incorporated clients |
| **AdvTax** | Budget-conscious solo preparers | Very low per-return or free tier | Lower polish, good value for basic returns |
| **UFile for Professionals** | Small practices, transitioning from consumer version | Annual per-preparer | Familiar interface, good Ontario forms |

### Consumer-Grade Software (NOT for Professional Use)

| Software | Why Not for Professionals |
|---|---|
| TurboTax (personal) | Not EFILE-certified for professional preparers, no batch filing |
| SimpleTax / Wealthsimple Tax | No professional module, no EFILE preparer credentials |
| H&R Block software (personal) | Consumer product — limited professional features |

!!! warning "Professional EFILE certification is not optional"
    As a paid preparer filing more than 5 returns, you are legally required to EFILE. Only CRA-certified EFILE software can transmit returns electronically. Consumer-grade software cannot be used for professional filing. Your software must be on CRA's approved EFILE software list — verify annually as the list updates.

### The Recommendation for a New Solo Preparer in Ontario

For your first tax season: **TaxCycle T1** or **AdvTax Professional**. TaxCycle has the best professional workflow tools and review features; AdvTax is more affordable to start. Both are fully EFILE-certified and handle all Ontario forms including ON428 and ON-BEN.

As your volume grows past 200 returns per year, TaxCycle's investment pays for itself in time savings.

---

## 22.2 Setting Up Your EFILE Registration

Before you file a single return for a client, you must register with CRA as an EFILE filer.

### EFILE Registration Process

**Step 1 — Apply online:**
Go to canada.ca → search "EFILE for electronic filers" → complete the online application.

**Required information:**
- Your name and address
- Business Number (if you have one) or SIN
- Type of returns you'll file (T1 personal)
- Software you'll use

**Step 2 — Wait for approval:**
CRA reviews applications. For new applicants: typically 5–10 business days during tax season, faster outside it. Do not wait until February 1 to apply — apply in November or December.

**Step 3 — Receive your EFILE number and password:**
CRA mails your EFILE credentials. Enter these in your tax software settings.

**Step 4 — Annual renewal:**
EFILE authorization must be renewed each calendar year. CRA sends renewal notices — do not miss them. A lapsed EFILE account means you cannot file returns until renewed.

### The RepID — Your Second Required Credential

Beyond EFILE (for filing), you need a **RepID (Representative Identifier)** to access client information in CRA My Account as a representative.

**Without a RepID:** You can file returns but cannot look up client T-slips, verify RRSP room, check prior NOAs, or access benefit information on behalf of clients.

**With a RepID:** You become the client's authorized representative. You can access their full CRA account — the single most powerful workflow tool available.

**How to get it:** Register at canada.ca/represent-a-client using your RepID and business authorization code.

**Client authorization:** Each client must authorize you via Form **T1013 (Authorizing or Cancelling a Representative)** or through their own CRA My Account online. This authorization lets you act on their behalf for the specific tax years and types specified.

---

## 22.3 The Professional Software Interface — Navigation Map

Every professional tax software has the same logical structure — the names differ but the concepts are identical. Here is the universal map:

```
CLIENT FILE
│
├── CLIENT PROFILE
│     Name, SIN, DOB, address, province, marital status
│     Spouse linkage (if couple being filed together)
│
├── INTERVIEW / DATA ENTRY
│     Income slips (T4, T5, T3, T4A, etc.)
│     Deductions (RRSP, childcare, moving, carrying charges)
│     Credits (medical, donations, DTC)
│     Provincial forms (ON428, ON-BEN)
│     Schedules (Schedule 3, Schedule 11, etc.)
│
├── REVIEW / DIAGNOSTICS
│     Software warnings and errors
│     Missing information flags
│     Optimization suggestions
│     Comparison to prior year
│
├── PRINT / PREVIEW
│     Client copy
│     Working papers
│     CRA filing copy
│
└── TRANSMIT (EFILE)
      Pre-transmission validation
      Transmission to CRA
      Confirmation number received
```

### The Three Modes of Data Entry

Different software uses different approaches to data entry — know all three because different clients suit different modes:

=== "Interview Mode"

    Software asks questions in plain language: "Did you have employment income? → Enter T4 information."

    **Best for:** New preparers learning the system. Clients with simple returns. Reduces risk of missing income types.

    **Limitation:** Slower for experienced preparers. Every return follows the same question path even when most answers are "no."

=== "Slip Entry / Form Mode"

    You see a visual representation of the actual CRA form or T-slip and enter data directly.

    **Best for:** Experienced preparers. Faster. Direct correspondence between paper slip and screen.

    **How TaxCycle does it:** You "import" a T4 slip — the software displays a T4 facsimile and you type in each box. It flows to the correct lines automatically.

=== "Direct Line Entry"

    Enter amounts directly on specific T1 lines (Line 10100, Line 20800, etc.) without going through a form interface.

    **Best for:** Adjustments, corrections, and unusual entries that don't fit standard slip structures. Also useful for quick verification.

---

## 22.4 The Efficient Return Workflow — How to Prepare 10 Returns Per Day

Professional preparers don't work faster by rushing. They work faster by eliminating repetition, making decisions once, and reviewing systematically. Here is the workflow that makes volume sustainable.

### The 8-Step Professional Workflow

**Step 1 — Pre-Meeting: CRA My Account Verification (5 minutes)**

Before the client sits down (or before you open their documents), access CRA My Account as their representative:

- [ ] Pull all T-slips on file for the tax year (T4, T5, T3, T4A, T4E, T4A(OAS), T4A(P))
- [ ] Note the RRSP deduction limit
- [ ] Check for any outstanding returns or correspondence
- [ ] Note prior year NOA for comparison

**Why first?** You now know what income to expect before the client hands you anything. Discrepancies are immediately visible — "You have a T5 from TD Bank on file — do you have that slip?"

---

**Step 2 — Document Intake (5–10 minutes)**

Receive documents. Compare against CRA My Account list. Flag anything missing or anything CRA has that the client didn't bring.

- [ ] All T-slips received and verified against CRA My Account
- [ ] RRSP receipts (if applicable)
- [ ] Moving receipts (if applicable)
- [ ] Medical expense receipts (if over threshold)
- [ ] Donation receipts with registration numbers
- [ ] Rental income/expense summary (if rental)
- [ ] Business records (if self-employed)

---

**Step 3 — Open the Software File (2 minutes)**

- Create a new client file (or open prior year file for returning clients)
- Verify and update: name, SIN, date of birth, address, province of residence (confirm December 31 address), marital status, spouse link
- Import prior year data if available (most software can carry forward prior year information)

**The prior year carry-forward is one of the most powerful workflow tools:**
TaxCycle and ProFile import prior year returns. The new return pre-populates with name, address, carryforward balances (tuition, capital losses, HBP repayment schedules). You only update what changed.

---

**Step 4 — Enter All Income (10–20 minutes depending on complexity)**

Enter slips in this order:
1. T4 slips (employment — most common, usually first)
2. T4A slips (pension, RESP, other)
3. T5 slips (investment)
4. T3 slips (trust/mutual fund)
5. T5008 (securities transactions → Schedule 3)
6. Self-employment (T2125)
7. Rental income (T776)
8. Foreign income (with exchange rate)

**Professional habit:** Enter gross amounts. Let the software gross up dividends, calculate CPP credits, and apply 50% meal limits automatically. Your job is data entry here — the software handles the math.

!!! tip "Use slip import where available"
    CRA has a **Auto-fill my return** (AFR) feature accessible through authorized tax software. When a client has authorized you as their representative, AFR can automatically import their T-slips, RRSP information, and prior year carryforwards directly from CRA's database into the return. This eliminates manual entry errors and takes approximately 60 seconds. Use it for every client who has authorized you. It is one of the biggest professional productivity tools available.

---

**Step 5 — Enter All Deductions (5–10 minutes)**

Enter in this order:
1. RRSP contributions (Schedule 7 — confirm deduction year)
2. Childcare expenses (T778 worksheet — confirm lower-income spouse)
3. Moving expenses (T1-M — confirm distance test, new-location income)
4. Support payments (Line 22000 — confirm spousal only, not child)
5. Employment expenses (T777 — confirm T2200 on file)
6. Carrying charges (Line 22100 — interest, advisory fees)
7. CPP on self-employment (calculated automatically from T2125)

---

**Step 6 — Enter All Credits (5 minutes)**

Enter in this order:
1. Medical expenses (Line 33099/33199 — enter each receipt, let software find optimal 12-month window if it offers this feature)
2. Charitable donations (Schedule 9 — verify each receipt has a registration number)
3. Disability Tax Credit (confirm CRA approval on file)
4. Tuition (Schedule 11 — enter T2202, decide carry-forward vs. transfer)
5. ON-BEN (OEPTC: enter rent or property tax, landlord info)
6. Home Accessibility Tax Credit (if applicable)

---

**Step 7 — Review (10–15 minutes)**

**This is the step that separates professional preparers from data entry clerks.**

Run the software's diagnostic review. Then manually check:

**The 12-Point Manual Review:**

- [ ] **Total income matches CRA My Account slips** — every slip accounted for
- [ ] **Province is correct** — Ontario for Ontario residents (December 31)
- [ ] **Marital status and spouse income** — spousal credit calculated correctly
- [ ] **RRSP deduction** — does not exceed CRA My Account deduction limit
- [ ] **Over-contribution check** — if multiple T4s, CPP/EI total doesn't exceed maximums
- [ ] **Medical expenses** — optimal 12-month window used
- [ ] **Childcare** — on lower-income spouse's return
- [ ] **ON-BEN** — rent amount covers only Ontario residency months
- [ ] **Donations** — pooled on correct spouse's return
- [ ] **Capital gains** — ACB verified (not just T5008 Box 20)
- [ ] **Self-employment** — gross revenue matches T4A + own records
- [ ] **Refund/balance comparison to prior year** — is the change logical given known income changes?

**The prior year comparison is one of your best review tools:**
If last year's refund was $2,400 and this year shows a $12,000 refund — find out why. Maybe they had tuition carry-forwards finally applied. Maybe you double-entered an RRSP deduction. Maybe there's a legitimate reason. Always know why the result changed from prior year.

---

**Step 8 — Transmit (3 minutes)**

1. Print or email the T183 (Authorization for Electronic Filing) for client signature
2. Obtain client signature on T183 (required before EFILE)
3. Run pre-transmission validation in software — fix any blocking errors
4. Transmit via EFILE
5. Record the confirmation number (ACK number)
6. Save transmitted return PDF to client file
7. Note transmission date in your log

**The T183 is a legal requirement.** You cannot transmit without it. The client's signature authorizes you to file on their behalf. Keep signed T183s for 6 years.

---

## 22.5 Auto-Fill My Return (AFR) — Your Most Powerful Workflow Tool

The **Auto-fill my return** feature connects directly to CRA's database through your professional software. Once a client has authorized you (via T1013), you can pull their information with one click.

### What AFR Imports

| Data Type | Available via AFR? |
|---|---|
| T4 slips | ✅ Yes |
| T5 slips | ✅ Yes |
| T3 slips | ✅ Yes (after March 31 when issuers file) |
| T4A slips (pension, RESP, etc.) | ✅ Yes |
| T4E (EI) | ✅ Yes |
| RRSP contribution room | ✅ Yes |
| Prior year RRSP carryforward | ✅ Yes |
| HBP/LLP balance | ✅ Yes |
| Tuition carry-forward | ✅ Yes |
| Capital loss carry-forward | ✅ Yes |
| Prior year NOA information | ✅ Yes |

### What AFR Does NOT Import

| Data Type | Why Not Available |
|---|---|
| RRSP contributions made this year (current year) | Financial institutions file RRSP receipts directly with CRA but AFR timing may lag |
| Moving expense receipts | Not reported to CRA |
| Medical expense receipts | Not reported to CRA |
| Donation receipts | Not reported to CRA (though charities file T3010) |
| Self-employment income (unless T4A Box 48 issued) | Not reported through slips |
| Rental expenses | Not reported to CRA |
| ACB of securities | Not available from CRA |

!!! tip "AFR in January vs. March — timing matters"
    T3 slips are not due until March 31. If you run AFR in February for a client with mutual funds, the T3 may not yet be in CRA's system. Always ask: *"Do you own any mutual funds, ETFs, or trusts?"* If yes — wait for the T3 before filing (usually available by mid-March) or file the T4/T5 portion now and amend when T3 arrives (riskier).

    The safest practice: run AFR on February 1 to identify all available slips, but don't file for clients with investment holdings until after March 31.

---

## 22.6 Managing the Software Review — What It Catches vs. What It Misses

Tax software is excellent at **arithmetic** and **rule-based validation**. It is poor at **judgment** and **completeness**.

### What Software Catches Automatically

| Error Type | How Software Catches It |
|---|---|
| T4 CPP over-contribution | Calculates total Box 16 across all T4s, flags excess |
| T4 EI over-contribution | Same for Box 18 |
| RRSP over-contribution | Compares claimed deduction to deduction limit field |
| Wrong province | Flags Ontario form used with non-Ontario address |
| Missing T183 authorization | Blocks EFILE until T183 date is entered |
| Math errors | Never makes arithmetic errors |
| Missing SIN | Cannot transmit without valid SIN |
| Invalid postal code | Validates postal code format |
| Age-based credit eligibility | Won't allow Age Amount for clients under 65 |

### What Software Does NOT Catch

This is where your expertise is irreplaceable:

| Error Type | Why Software Misses It |
|---|---|
| **Missing T-slips** | Software only knows about slips you enter. It doesn't know about the T5 the client forgot |
| **Wrong ACB on capital gains** | You enter the ACB — if it's wrong, the gain calculation is wrong |
| **Childcare on wrong spouse** | Software may allow it on either return — you must ensure it's on the lower earner |
| **Pro-ration of credits for part-year residents** | Some software helps, but you must verify the fraction |
| **T1135 obligation** | Software does not know about foreign assets |
| **TOSI on dividends** | Software does not assess whether family dividends are appropriate |
| **Shareholder loan income inclusion** | Software does not know about informal corporate drawings |
| **Wrong 12-month window for medical** | Software may default to calendar year — you must optimize |
| **Plausibility of deductions** | Software won't flag a $48,000 moving expense claim as unusual |
| **T2202 not downloaded by student** | If you don't have the slip, the software has nothing to work with |

!!! success "The human judgment layer is where your fee is earned"
    Every single item in the "What Software Misses" table above is caught by a professional who asks the right questions, verifies slips through CRA My Account, and reviews results with judgment. The software handles mechanics. You provide intelligence. Never confuse the two.

---

## 22.7 Software-Specific Tips for Common Situations

### T2125 — Self-Employment in TaxCycle/AdvTax

**Setup:** Create a new T2125 for each business activity. In TaxCycle, each T2125 is a separate "schedule" attached to the main T1.

**Key fields:**
- Business activity (enter a meaningful description — "Rideshare driving" not just "Business")
- Industry code (CRA requires a 6-digit NAICS code — look it up for the specific business)
- Fiscal year end (almost always December 31 for individuals)
- GST/HST registration number (if registered)

**Vehicle expenses:** Use the Automobile Expenses worksheet embedded in the T2125. Enter total km, business km, and each expense category. The software calculates the business-use percentage and applies it automatically.

**Home office:** Use the Business-use-of-home worksheet. Enter square footage of work space, total square footage, and each eligible home expense. Software calculates the business percentage automatically.

**CCA:** The CCA schedule within T2125 calculates half-year rule, tracks UCC, and applies the correct rate per class. You enter the asset description, class, and cost. Software does the rest.

!!! example "Case — Entering Kevin's Uber T2125 in TaxCycle"
    From Week 20: Kevin's Uber business.

    In TaxCycle T1, you would:
    1. Add a T2125 form
    2. Business: "Rideshare transportation services" — NAICS code: 485310 (Taxi and Limousine Service)
    3. Gross income: $62,400 (from T4A Box 48 — you also linked the T4A slip to the T2125)
    4. Platform fees expense: $15,600 (entered as "Commissions and fees" in the expenses section)
    5. Open the Automobile Expenses worksheet: Total km = 52,000, Business km = 38,000 → 73.1%
    6. Enter fuel, insurance, maintenance, registration amounts
    7. Open CCA schedule: add the vehicle, enter Class 10, enter opening UCC
    8. Enter phone expense: $1,440 × 80% business = $1,152
    9. Enter other expenses: car wash $480, supplies $380, accounting $200

    TaxCycle automatically:
    - Calculates vehicle deduction at 73.1%
    - Applies half-year rule to CCA (if first year)
    - Flows net income to Line 13500
    - Calculates CPP on self-employment and splits deduction/credit
    - Checks if HST registration number was entered (warns if over $30,000 gross)

    **Time to complete Kevin's entire T2125:** approximately 15–20 minutes.

---

### ON-BEN — Ontario Trillium Benefit

**In TaxCycle:** ON-BEN is accessible from the provincial forms section. The form has direct input fields for:
- Landlord name and address
- Monthly rent amount
- Property tax billed (if homeowner)
- Long-term care accommodation cost (if applicable)
- Northern Ontario designator

**Common mistake to avoid:** The rent field in ON-BEN is usually the **total rent for the year** — not the monthly amount. Some software asks for monthly; some asks for annual. Read the field label carefully and enter the correct figure.

**For mid-year arrivals in Ontario:** Enter only the months of Ontario residence. If the client arrived July 1, enter rent for July–December only (6 months × monthly rent = annual entry).

---

### Schedule 3 — Capital Gains

**For simple stock sales (publicly traded securities):**
TaxCycle and most software have a dedicated "Securities Transactions" section within Schedule 3. Enter:
- Security name
- Number of shares
- Date acquired / date sold
- Proceeds (from T5008 Box 16)
- ACB (from your own calculation — NOT automatically from Box 20)
- Selling commission

Software calculates gain/loss and flows to Line 12700.

**For principal residence sales:**
A dedicated T2091 section must be completed:
- Years of ownership
- Years designated as principal residence
- The software calculates the exempt vs. taxable portion
- Ensure Schedule 3 Section for "Real estate, depreciable property, and other properties" is used

---

### Schedule 11 — Tuition Credits

**The key decisions in Schedule 11:**
1. Enter T2202 amounts (full-time months, tuition paid)
2. Software calculates available credit
3. You specify: how much to apply to own tax, how much to carry forward, how much to transfer
4. Transfer to spouse: enter spouse's SIN in the transfer field
5. Transfer to parent: parent claims Line 32400 on their own return

**The optimization question:** Software may not automatically optimize the transfer vs. carry-forward decision. Apply your judgment from Week 18.

---

### Medical Expenses — 12-Month Window Optimization

**Most software defaults to the calendar year (January 1–December 31).** This is often not optimal.

**In TaxCycle:** You can enter the specific 12-month period start date. The software will calculate the credit for that window.

**Your workflow:**
1. List all medical expenses chronologically (date and amount)
2. Test the calendar year result
3. Test the window that captures the largest cluster of expenses
4. Select the optimal window
5. Enter that window's start date in the software

Not all software offers this flexibility — in simpler software, you may need to calculate the optimal window manually and only enter the qualifying expenses for that period.

---

## 22.8 EFILE Transmission — The Process and What Can Go Wrong

### Pre-Transmission Validation

Before you transmit, run the software's built-in validation. Common blocking errors (return won't transmit until fixed):

| Error | Cause | Fix |
|---|---|---|
| "SIN not valid" | Wrong SIN entered, or SIN starts with 9 and is expired | Verify SIN with client |
| "T183 date missing" | No T183 authorization date entered | Obtain signed T183, enter date |
| "Province of residence required" | Province field blank | Select Ontario (or correct province) |
| "Postal code invalid" | Wrong format | Verify postal code |
| "RRSP over-deduction" | RRSP deduction exceeds deduction limit | Reduce to deduction limit or verify limit |
| "Net income negative" | Deductions exceed income | Review — may be valid (business loss) or an entry error |

### The ACK Number — Your Proof of Filing

After successful transmission, CRA's EFILE system returns an **ACK (Acknowledgement) number**. This is your proof the return was received.

**Record the ACK number for every return.** It goes into your client file and is referenced if the client ever questions whether you filed. Without an ACK number, you have no proof of transmission.

### Common Transmission Errors

| Error Code | Meaning | Action |
|---|---|---|
| **ACK4** | Accepted | ✅ Filing successful |
| **ACK2** | Rejected — specific error in return | Fix the flagged field and retransmit |
| **ACK3** | Rejected — return already on file | Client already filed (or duplicate transmission) — do not retransmit |
| **"EFILE service unavailable"** | CRA server is down (common during peak season) | Wait and retry — do not use this as a reason to delay for days |
| **"Invalid EFILE credentials"** | Your EFILE number or password is wrong | Verify credentials — renew if expired |

### CRA EFILE Server Downtime

CRA's EFILE system is **offline for scheduled maintenance** at specific times:
- Every night from approximately **11 PM to 6 AM Eastern**
- During some long weekends
- During system updates (announced in advance on CRA's website)

**Don't try to file at midnight during tax season and blame the software.** Know the maintenance windows and plan around them.

---

## 22.9 Your Client File System — The Foundation of Professional Practice

A professional client file system serves three purposes:
1. **Efficiency:** Find any document for any client in 30 seconds
2. **CRA response:** When a review letter arrives, produce organized documentation immediately
3. **Legal protection:** Prove what documents you had when you prepared the return

### Recommended Digital File Structure

```
TAX PRACTICE/
│
├── CLIENTS/
│   └── [Last Name, First Name - SIN last 3]/
│       ├── 2025/
│       │   ├── INTAKE/
│       │   │   ├── engagement_letter_signed.pdf
│       │   │   ├── T4_employer.pdf
│       │   │   ├── T5_td_bank.pdf
│       │   │   ├── RRSP_receipt.pdf
│       │   │   ├── cra_myaccount_slips_screenshot.png
│       │   │   └── intake_notes.txt
│       │   ├── WORKING/
│       │   │   ├── return_draft.taxcycle (software file)
│       │   │   └── calculations.xlsx
│       │   ├── FILED/
│       │   │   ├── 2025_t1_filed.pdf (complete copy)
│       │   │   ├── ack_number.txt
│       │   │   ├── T183_signed.pdf
│       │   │   └── NOA_received.pdf
│       │   └── CORRESPONDENCE/
│       │       └── (any CRA letters and responses)
│       └── 2024/
│           └── [same structure]
│
├── TEMPLATES/
│   ├── engagement_letter_template.docx
│   ├── intake_questionnaire.pdf
│   ├── new_client_welcome.docx
│   └── cra_response_template.docx
│
├── REFERENCE/
│   ├── 2025_tax_rates_ontario.pdf
│   ├── 2025_rrsp_limits.pdf
│   └── cra_forms_quick_reference.pdf
│
└── ADMIN/
    ├── efile_credentials.txt (encrypted/secured)
    ├── insurance_certificate.pdf
    └── client_list.xlsx
```

!!! tip "Never use a client's full SIN in folder names"
    Use only the last 3 digits of the SIN in file naming. This limits exposure if your computer is ever compromised or a folder is accidentally shared.

### Paper vs. Digital

**Go digital from day one.** Paper systems are inefficient, take space, and create retention nightmares. Every document you receive:
- Scan immediately (phone scan apps like Adobe Scan or Microsoft Lens work well)
- Name the file descriptively: "T4_RBC_2025.pdf" not "scan_0042.pdf"
- File in the correct year/client folder immediately
- Shred the paper original (unless original required — some official documents should be retained)

**Exception:** The signed T183 — best to keep an original paper copy in addition to the scan.

---

## 22.10 Practice Management — Running an Efficient Solo Practice

Beyond the software, several operational systems transform chaotic tax season into a manageable professional practice.

### The Appointment System

**Book 90 minutes for first-time clients**, 45–60 minutes for returning clients. First-timers need time to explain their situation; returning clients mostly update from prior year.

**Block 30 minutes between clients** for file completion, document scanning, and next-client preparation. The biggest mistake new preparers make: back-to-back appointments with no processing time.

**Create a buffer week in late March:** No new clients after March 20 for the April 30 deadline. Use the final 10 days for complex returns, amendments, and quality review.

### Pricing Strategy

Establish clear pricing from the start. Complexity-based pricing works better than time-based for clients:

| Return Type | Suggested Price Range | Rationale |
|---|---|---|
| Simple T4 only, no deductions | $75–$100 | 20–25 minutes |
| Standard employment with RRSP, credits | $125–$175 | 30–45 minutes |
| Employment + investments (T5, T3) | $175–$250 | 45–60 minutes |
| Self-employment (T2125) | $250–$400 | 60–90 minutes |
| Rental property (T776) | $200–$350 | 45–75 minutes |
| New immigrant (part-year) | $200–$350 | 60–90 minutes |
| Senior with pension splitting | $250–$400 | 60–90 minutes |
| Incorporated client (T4 + T5) | $350–$600 | 90–120 minutes |
| Deceased terminal return | $500–$800 | 120–180 minutes |
| Corporate + personal (T2 + T1) | Custom — CPA territory | Refer or partner |

**Couple pricing:** Charge 1.5× the individual rate for couples filed together — they take 50% more time, not 100%.

### The 3-Question Return Assessment

Before opening any client file, ask yourself three questions:

1. **What income sources do they have?** (Employment? Self-employment? Rental? Investment? Foreign?)
2. **What deductions and credits are likely?** (RRSP? Childcare? Moving? Medical? Donations?)
3. **What unusual features exist?** (New immigrant? Business sale? Deceased? Multiple provinces? First filing?)

These three questions take 30 seconds from the intake form. They tell you the complexity, the time needed, and the fee to quote. Do this before every return.

---

## 22.11 The Tax Season Calendar — What Happens When

| Date Range | Priority Actions |
|---|---|
| **October–November** | EFILE application / renewal. Software purchase and installation. Client communication (reminders, price updates) |
| **December** | Practice setup. Client intake forms updated. CRA My Account access verified for all existing clients |
| **January 1** | Tax season opens. AFR available for prior year slips (T4s, T5s begin arriving) |
| **January–February** | Simple returns (T4 only, no investments, no T3s). New client intake. Return RRSP receipts |
| **March 1** | RRSP contribution deadline for prior year. Last day for clients to make contributions and apply to prior year |
| **March 31** | T3 slip issuance deadline. Do NOT file investment clients until after this date |
| **April 1–15** | Final push. Complex returns. Reminders to all outstanding clients |
| **April 30** | Individual filing deadline. Balance owing due. Self-employed balance owing due |
| **May–June** | Self-employed filing deadline (June 15). Amendment requests begin. CRA review letters start arriving |
| **July** | CCB/GST/OTB recalculation based on prior year returns. Follow up with clients who haven't filed |
| **August–September** | Off-season planning. Client review calls. RRSP planning for current year. Continuing education |

!!! warning "The March 31 T3 trap — your most common filing error timing risk"
    Every year, preparers who file investment clients in February receive T1-ADJ requests in April because a T3 from a mutual fund wasn't yet available. The fix: standard operating procedure for any client with mutual funds, ETFs, REITs, or trust units is to **wait until after April 1** to file — giving time for all T3 slips to arrive and appear in CRA My Account. For clients who need an early refund for cash flow reasons, file without investment slips and amendment immediately when T3 arrives.

---

## 22.12 The 10 Software Workflow Mistakes That Cost Time and Clients

| Mistake | What It Costs | Prevention |
|---|---|---|
| Not running AFR before data entry | Missing slips, CRA reassessment | Always run AFR as Step 1 |
| Defaulting to calendar year for medical | Suboptimal credit, unhappy clients | Test multiple 12-month windows |
| Entering net Uber income instead of gross | Income mismatch vs. T4A, CRA flag | Always gross revenue first |
| Not checking RRSP limit before entering | Over-contribution penalty | AFR shows limit; verify first |
| Missing the T3 timing window | Amendment needed in April | Don't file investment clients until April 1 |
| Not getting T183 signed before filing | Return is invalid — no authorization | T183 signed = first step, always |
| Carrying prior year error forward | Error compounds year after year | Review prior year return before starting new one |
| Saving work but not transmitting | Client thinks return is filed; it isn't | ACK number = proof of filing; no ACK = not filed |
| Filing spouses separately when joint optimization helps | Missed donation pooling, medical credit | Always check if couple-optimization is available |
| Not backing up software files | Single hard drive failure destroys everything | Cloud backup + external drive = non-negotiable |

---

## 22.13 Case Studies — Software Workflow in Practice

### Case A — The Couple Optimization That Almost Got Missed

**Client:** Maria ($72,000 net income) and Victor ($48,000 net income). Married. Ontario residents.

They had:
- Combined charitable donations: $2,800 (on two separate receipts)
- Medical expenses: $4,800 (Maria's dentist and physio)
- Donations originally entered on both returns separately

**What software did automatically:** Calculated each spouse's credit independently. Maria's donation credit: ($200 × 15%) + ($1,400 × 29%) = $436. Victor's: ($200 × 15%) + ($1,000 × 29%) = $320. Total: $756.

**What the 12-point review caught:** Donations should be pooled on Victor's return (where is he relative to Maria's income? Victor is lower — but donations give the same 29% rate above $200 regardless of which spouse claims them. Actually in this case it doesn't matter which spouse claims donations for the rate — but for medical expenses, the lower-income spouse should claim: Maria is higher — wait, no).

Let's recalculate: Maria has higher income ($72,000). Victor has lower income ($48,000).

**For medical expenses:** Lower income = smaller 3% threshold. Victor's 3% threshold: $48,000 × 3% = $1,440 vs. Maria's: $72,000 × 3% = $2,160. Medical expenses claimed on Victor's return: $4,800 − $1,440 = $3,360 × 15% = $504 federal credit. On Maria's return: $4,800 − $2,160 = $2,640 × 15% = $396.

**The review caught $108 in additional medical credit** simply by moving medical expenses to Victor's return. The software had them on Maria's return (the person who paid them).

**The lesson:** Software goes where you tell it. Your job is to know the optimization rules and override the defaults.

---

### Case B — The AFR That Found the Forgotten T5

**Client:** James, 38. Hands you his T4 from his employer. CRA My Account AFR reveals:
- T4 from employer (already have) ✅
- T5 from National Bank — Box 13: $940 interest income
- T5 from his investment account — Box 11: $1,840 taxable eligible dividends

**James's response when you ask:** *"Oh right — I forgot about those. I don't really pay attention to my investment accounts."*

**Without AFR:** You file with only the T4. CRA auto-matches. Two weeks after filing: reassessment notice. Additional tax: $940 + $1,840 = $2,780 in additional income × his marginal rate ≈ $824 additional tax plus interest.

**With AFR:** Found both T5s before filing. Added to the return. No reassessment. James's refund decreased by $824 but the surprise happened before filing, not after. Client is grateful, not shocked.

**This single AFR check saved a client relationship.**

---

### Case C — The RRSP Entry That Could Have Triggered a Penalty

**Client:** Sandra, corporate client, sole shareholder. Her accountant tells you (via email) that the corporation paid her a $95,000 salary.

Her prior year NOA shows RRSP deduction limit: **$17,100**.

Sandra mentions she contributed $22,000 to her RRSP in February 2025.

**Software entry:** You enter $22,000 in the RRSP contribution field, then $22,000 as the deduction.

**Software warning appears:** "RRSP deduction claimed ($22,000) exceeds the deduction limit ($17,100)."

**Without the review:** If you override this warning, Sandra has a $4,900 excess RRSP contribution — $2,900 above the $2,000 buffer. CRA penalty: 1%/month from contribution date. By April filing: 2 months = $58.

**The correct action:**
1. Verify the RRSP limit with Sandra: "Have you checked CRA My Account for your exact limit?"
2. Pull up AFR for current year RRSP contributions
3. Confirm the $17,100 limit is correct (check if there's a pension adjustment from the corporation — if corporation just established a pension plan for her, her limit dropped)
4. Options: deduct only $17,100 now, carry forward $4,900 deduction to next year when limit increases. Or: withdraw the excess $4,900 using Form T3012A to avoid ongoing penalties.

**The software warning caught a potential penalty.** But it was your follow-through that resolved it correctly.

---

## 22.14 Week 22 Summary

!!! success "What you learned this week"
    - **Choose professional EFILE-certified software:** TaxCycle (best professional tools), AdvTax (budget-friendly), ProFile (high-volume firms). Consumer software (TurboTax personal, Wealthsimple) is not for professional use
    - **EFILE registration:** Apply to CRA months before tax season. Get both your EFILE number (to transmit) and RepID (to access client CRA My Account). Renew EFILE annually
    - **The 8-step workflow:** Pre-meeting CRA My Account → document intake → open software → enter income → enter deductions → enter credits → 12-point review → transmit. Follow it every time, for every client
    - **Auto-fill my return (AFR):** Connects directly to CRA. Imports T-slips, RRSP room, carryforwards in 60 seconds. Use it for every authorized client. Don't enter T-slips manually when AFR can do it. Wait for T3 availability after March 31 for investment clients
    - **Software catches arithmetic; you catch judgment:** Software handles math, cross-referencing known rules, and blocking obvious errors. Only you catch missing T-slips (via CRA My Account verification), wrong ACB, wrong spouse claiming childcare, T1135 obligations, and optimization opportunities
    - **The T183 is legally mandatory:** Client must sign it before you transmit. No exceptions. Keep signed T183s for 6 years
    - **Save the ACK number:** It is your proof of filing. Without it, you cannot prove the return was transmitted
    - **Client file system:** Digital, organized by client/year, with INTAKE/WORKING/FILED/CORRESPONDENCE subfolders. Retain for 6 years
    - **Tax season calendar:** RRSP deadline March 1. T3 deadline March 31 — don't file investment clients before April 1. Individual filing deadline April 30. Self-employed filing June 15 (but payment April 30)
    - **The 12-point manual review** is what separates professionals from data-entry clerks. Run it on every return, every time

---

## ✅ Week 22 Quiz

When you're ready, ask Claude: **"Quiz me on Week 22"** for an interactive test.

??? question "1. A new client hands you their T4 and two T5 slips. Before you open the software, what is the first thing you should do and why? What are you looking for?"
    The first step is **accessing CRA My Account as the client's authorized representative and running Auto-fill my return (AFR)**. You are looking for: all T-slips CRA has on file for the client (T4, T5, T3, T4A, T4E, etc.) — to compare against what the client physically provided; the client's RRSP deduction limit; any prior year carryforward balances (tuition, capital losses, HBP/LLP); and any prior year outstanding correspondence. The reason: clients routinely forget T-slips (small T5s from bank accounts, T3s from investments). CRA already has all slips filed by issuers. If you file without a slip that CRA has, the return will be automatically reassessed with additional tax, interest, and a surprised client who blames you. AFR catches this before filing, not after.

??? question "2. You enter a client's medical expenses on Line 33099 for the January–December 2025 calendar year. The result is a $245 federal credit. A friend tells you the 12-month window doesn't have to be the calendar year. Your client had $3,100 in dental expenses in November 2024 and $2,200 in physio in March 2025. Their net income is $58,000. Calculate whether a different window produces a better result."
    Calendar year 2025 (Jan–Dec 2025): Only the $2,200 physio. 3% threshold: $58,000 × 3% = $1,740. Net eligible: $2,200 − $1,740 = $460 × 15% = **$69 credit**. **November 2024–October 2025 window:** $3,100 (Nov 2024) + $2,200 (March 2025) = $5,300. Less threshold: $5,300 − $1,740 = $3,560 × 15% = **$534 credit**. The optimal window (Nov 2024–Oct 2025) delivers **$534 vs $69** — a $465 improvement from choosing the right 12-month window. Change the period start date in your software to November 2024. The software calculates the credit for that window.

??? question "3. You transmit a return and receive error code ACK3 from CRA. What does this mean and what do you do?"
    ACK3 means **"rejected — return already on file."** CRA has a return for this client and tax year already recorded. Possible causes: (a) the client already filed their own return (NETFILE or paper), (b) you accidentally transmitted twice, or (c) someone else filed on the client's behalf. **What to do:** Contact the client immediately to determine if they filed separately. If they did, determine which return is correct and file a T1-ADJ if amendments are needed. If a fraudulent return was filed in their name — contact CRA's identity theft unit. Do NOT attempt to retransmit the same return — ACK3 is a hard rejection and retransmitting will not succeed.

??? question "4. You are entering a client's T2125 for their Etsy business. Their gross sales were $42,000. Their Etsy payment account shows net deposits of $37,800 after platform fees of $4,200. What amount do you enter as gross income in the T2125 and where do the platform fees go?"
    Enter **$42,000 as gross income** in the T2125. The $4,200 in Etsy platform fees is entered as a **business expense** (commissions or platform fees line within the expense section of the T2125). Never enter net deposit amounts as gross income — the T2125 must reconcile to the T4A Box 48 amount (if a T4A was issued) or to the payment account's total transaction amount. Reporting $37,800 as gross income would understate revenue by $4,200, creating a mismatch with any T4A issued and a potential red flag on CRA matching.

??? question "5. It is February 15 and you want to file a return for a client who has a T4, two T5 slips, and units in two mutual funds (which issue T3 slips). Should you file now? What is the risk and what is the recommended approach?"
    **Do not file now.** The mutual fund T3 slips are not due until March 31. Filing in February without the T3s means the return will be missing the capital gains, dividends, and other income reported on the T3s. When the T3s arrive (March 15–31), you would need to file a T1-ADJ to add the T3 income — an avoidable complication. The risk: the T3 income could be significant (capital gains distributions, eligible dividends) and the amendment could result in additional tax, interest from April 30, and an unhappy client. **Recommended approach:** Wait until after April 1 to file any return that includes mutual funds, ETFs, REITs, or trust investments. Run AFR again after April 1 to confirm all T3 slips are now available in CRA's system. File then.

??? question "6. You complete a return and want to EFILE it. You have not yet obtained the client's signature on the T183. Can you file? What is the T183 and why is it required?"
    **No — you cannot file without a signed T183.** The **T183 (Authorization for Electronic Filing)** is the client's legal authorization for you to submit their return electronically on their behalf. It confirms: (a) the client reviewed the return, (b) the information is correct to their knowledge, and (c) they authorize you as their preparer to transmit it. Without it, filing is not authorized by the client and technically invalid. Most professional software blocks transmission until a T183 signature date is entered. The T183 must be signed **before** transmission — not afterward. Keep signed T183s in the client file for a minimum of 6 years. If you ever need to prove a return was properly authorized, the signed T183 is your documentation.

??? question "7. You finish tax season having prepared 180 returns. What five administrative actions should you complete in May to set yourself up for next year?"
    Any five from the following strong answers: **(1) Archive all 2025 tax year files** — ensure all filed returns, T183s, source documents, and ACK numbers are saved in the correct digital folders and backed up to a second location (cloud + external drive). **(2) Renew EFILE for next year** — CRA sends renewal notices; complete the renewal process while it's fresh. **(3) Collect client feedback** — send a brief survey or call 10 clients to understand what they valued and what could be improved. **(4) Update your client list and fees** — record each client, return type, fee charged, and any notes for next year. Start the 2026 fee schedule. **(5) Begin marketing outreach** — tax season referrals peak in April/May. Send thank-you notes to clients who referred others. Ask satisfied clients for referrals while the experience is fresh. **(6) Review your error log** — note any mistakes or close calls from this season. What slips were missed? What returns needed T1-ADJ? Build improvements into next year's workflow. **(7) Check CRA My Account for NOAs** — ensure all filed returns have been assessed and no unexpected reassessments have occurred.

---

## 📚 Further Reading

- [CRA: EFILE for electronic filers — registration](https://www.canada.ca/en/revenue-agency/services/e-services/e-services-businesses/efile-electronic-filers.html)
- [CRA: Auto-fill my return](https://www.canada.ca/en/revenue-agency/services/e-services/digital-services-individuals/netfile-overview/auto-fill-return.html)
- [CRA: Represent a Client — RepID registration](https://www.canada.ca/en/revenue-agency/services/e-services/represent-a-client.html)
- [CRA: EFILE-certified software list](https://www.canada.ca/en/revenue-agency/services/e-services/e-services-businesses/efile-electronic-filers/efile-certified-tax-preparation-software-individual-income-tax-returns.html)
- [CRA: T183 — Authorization for Electronic Filing](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/t183.html)
- [TaxCycle: Getting started guide](https://help.taxcycle.com)
- [CRA: Tax season calendar and important dates](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/important-dates-individuals.html)

---

!!! tip "Up Next: Week 23"
    **Setting Up Your Tax Practice — Legal, Ethical, and Business Foundations**. You have the technical knowledge and the software skills. Week 23 covers what you need to do before your first paying client: business registration in Ontario, E&O insurance, client contracts, privacy obligations under PIPEDA, and how to price and market your services. This is the week that converts a knowledgeable person into a functioning business.
