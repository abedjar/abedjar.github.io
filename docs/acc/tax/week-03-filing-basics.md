# Week 3: Filing Basics — Deadlines, Residency, Penalties, Amendments & the Non-Filer

!!! info "Learning Objectives"
    By the end of this week, you will be able to:

    - Determine whether any individual in Canada is legally required to file a T1 return
    - Identify who should file even when not legally required — and quantify exactly what not filing costs
    - Apply CRA's residency analysis to any client situation — full-year resident, part-year resident, non-resident, deemed resident
    - State every filing deadline precisely — including the traps that routinely surprise self-employed clients
    - Calculate late-filing penalties to the dollar for both first-time and repeat offenders
    - Calculate daily interest on overdue balances and explain how it compounds
    - Navigate the complete EFILE system — registration, AFR, T183, transmission, ACK numbers, and what happens when something goes wrong
    - File a T1-ADJ to correct any prior-year return — when to do it, how to do it, and how far back it can go
    - Advise a client who hasn't filed in 2, 5, or 10 years — calmly, accurately, and with a clear action plan
    - Explain the Voluntary Disclosure Program (VDP) — who qualifies, what it covers, and when it is the right path
    - Handle SIN-related situations including temporary SINs starting with 9, lost SINs, and estate filings

!!! tip "Filing mechanics are where technical knowledge becomes real outcomes"
    You can master every rule in the Income Tax Act and still harm a client by missing a deadline, filing in the wrong province, or failing to recommend VDP to a non-filer. The technical knowledge from Weeks 1 and 2 tells you what goes on the return. This week tells you the rules of the game that surrounds that return — the obligations, the deadlines, the consequences, and the paths forward when something has gone wrong. This week makes everything operational.

---

## 3.1 Who Must File — The Legal Obligation in Plain Language

Canada's Income Tax Act creates a legal requirement to file a T1 return in specific circumstances. Not every Canadian resident must file every year — but understanding both the legal requirement and the financial cost of not filing is critical professional knowledge.

### The Eight Legal Requirements to File

A person is **legally required** to file a T1 for a tax year when any of the following apply:

| # | Requirement | The Real-World Trigger |
|---|---|---|
| **1** | Tax is owing | Federal or Ontario provincial tax payable for the year — after all credits and withholding are applied |
| **2** | CRA demands a return | CRA issues a formal written demand under ITA Section 150(2) — must file within the specified time |
| **3** | Sold capital property | Disposed of any capital property — including a principal residence (mandatory since 2016 regardless of whether the gain is exempt) |
| **4** | Realized a taxable capital gain | Had net capital gains in the year — from stocks, crypto, real estate, or any other property |
| **5** | OAS or EI repayment required | Net income above the OAS clawback threshold ($90,997), or EI received while also earning employment income above the repayment threshold |
| **6** | CPP contributions owing | On self-employment income where CPP contributions are required but not withheld |
| **7** | Home Buyers' Plan repayment | Annual HBP repayment is due and not being contributed back to RRSP |
| **8** | Lifelong Learning Plan repayment | Annual LLP repayment is due and not being contributed back to RRSP |

!!! warning "The capital property sale requirement surprises homeowners every year"
    Since 2016, CRA requires the **principal residence sale to be reported on the T1** — on Schedule 3 with Form T2091 designating the property as a principal residence. Even when the gain is entirely exempt from tax (the most common situation), the sale must be reported. Failure to report triggers a **late-filing penalty on the principal residence designation** — assessed by CRA even if the gain is $0. In some cases, CRA may deny the full exemption if the designation is filed late. Clients who say "I sold my house — but I don't owe any tax, so I don't need to file" are wrong on the filing obligation. They must file. They must report the sale. The exemption protects them from paying tax — but not from filing.

### Who Should File Even Though Not Legally Required

This is where professional value compounds. These clients have no legal obligation to file — but leave measurable money on the table every year they don't.

| Client Type | Annual Cost of Not Filing |
|---|---|
| Student earning under Basic Personal Amount | GST/HST credit ($519+), withheld tax refund (hundreds of dollars), RRSP room |
| Low-income worker | Canada Workers Benefit — fully refundable, requires filing to receive (up to $1,518 single, $2,616 family) |
| New immigrant in arrival year | GST/HST credit, CCB, Ontario Trillium Benefit — all require a filed return to activate |
| Ontario renter at any income | OEPTC component of OTB — requires ON-BEN to be filed. Hundreds of dollars per year |
| Senior earning only CPP/OAS | GST/HST credit, Age Amount, Ontario senior credits, Senior Homeowners' Property Tax Grant |
| Anyone who rents in Ontario under $50,000 net income | Ontario Trillium Benefit — $600–$2,400/year depending on rent and income |
| Person with disability | DTC application and retroactive recovery requires filed returns |

!!! example "Case — The Cost of Not Filing Over Three Years: Rosa's Story"
    Rosa, 22, works part-time at a café in London, Ontario. She earns $10,400/year. She rents a room for $700/month. She has never filed because "I don't earn enough to pay tax." She is correct about owing no tax. She is wrong about the consequences.

    **What Rosa loses each year she doesn't file:**

    | Item | Annual Amount |
    |---|---|
    | GST/HST credit | $519 |
    | Ontario Trillium Benefit (OEPTC on $700 × 12 = $8,400 rent: 20% = $1,680 deemed property tax) | ~$540 |
    | Ontario Trillium Benefit (OSTC, below threshold) | $345 |
    | Withheld tax not refunded (employer withheld ~$210/year) | $210 |
    | **Annual cost of not filing** | **$1,614 in cash** |
    | RRSP room (18% × $10,400) | $1,872 (not lost, but unconfirmed without NOA) |

    **Over three years of not filing: $4,842 in cash foregone.**

    You file all three years retroactively. CRA issues amended NOAs. Rosa receives:
    - Three years of GST/HST credits: $1,557 (paid retroactively in lump sum)
    - Three years of tax refunds from withholding: $630
    - OTB begins paying monthly from the next quarter
    - Future annual OTB: approximately $885/year (ongoing)

    Rosa came in because a coworker mentioned you. She leaves with $2,187 in retroactive cash, monthly benefit payments starting, and a clear understanding that filing every year from now on is worth almost $1,614 to her personally.

    She tells everyone at work about you. Three coworkers book appointments within two weeks.

    **The intake question that prevents this from happening:** *"Have you been filing a tax return every year since you started working?"* Ask it every time. For every new client.

---

## 3.2 Residency for Tax Purposes — The Complete Analysis Framework

Residency determines whether someone files a Canadian return, on what basis, and on how much of their income. This is a legal analysis grounded in CRA's significant ties test — not immigration status, not citizenship, not the number of days spent in Canada (mostly).

```
RESIDENCY DECISION TREE
═══════════════════════════════════════════════════════════
Did the person live in Canada for most of the year?
       │
       ├─ YES → Resident → File a full-year T1
       │
       └─ NO
           │
           Did they maintain significant ties to Canada?
           (home, spouse, dependants, driver's licence, bank accounts)
           │
           ├─ YES → Factual resident → File a full-year T1
           │
           └─ NO
               │
               Did they spend 183+ days in Canada?
               │
               ├─ YES → Deemed resident → T1 with worldwide income
               │
               └─ NO → Non-resident → NR4 / Part XIII only
                        (refer to specialist — outside standard T1 scope)
═══════════════════════════════════════════════════════════
```

### The Four Filing Categories

=== "Full-Year Canadian Resident"

    **Who they are:** Lived in Canada as a resident for the entire calendar year — January 1 to December 31.

    **What they file:** A complete T1 reporting **worldwide income** for the full year. Employment, pension, investment, self-employment, rental, and foreign income from every country.

    **Credits:** Full annual personal credits — Basic Personal Amount, Age Amount, Disability Amount, etc.

    **Provincial tax:** Based on province of residence on December 31.

    **This is the most common situation** — the majority of your clients every season.

=== "Part-Year Resident (Arrived or Departed)"

    **Who they are:** Became a Canadian resident partway through the year (immigrated, returned from abroad) OR ceased to be a Canadian resident partway through the year (emigrated permanently).

    **What they file:** A T1 covering only the **period of Canadian residency**.

    **Income rules:**
    - During the non-resident period: only Canadian-source income is taxable in Canada (if any)
    - During the resident period: worldwide income is fully taxable

    **Credits:** Pro-rated based on fraction of year as resident (days resident ÷ 365) — **unless** the client's Canadian-source income is 90%+ of their total worldwide income during the residency period, in which case full credits apply.

    **Example:** Maria arrives from the Philippines on June 15. She is a Canadian resident from June 15 to December 31 = 200 days. Her credits are pro-rated at 200/365 = 54.8% — UNLESS her Canadian employment income is 90%+ of her total worldwide income during that period (common for immigrants who had no income before arriving). If she earns $38,000 in Canada and $2,000 in the Philippines before arriving — the $2,000 is pre-residency income and doesn't count in the 90% test. Her Canadian income is effectively 100% of her income during residency. Full credits apply.

=== "Non-Resident"

    **Who they are:** Did not reside in Canada at any point during the year. Foreign person with Canadian-source income only.

    **What they file:** A T1 NR (non-resident return) or specific schedules — reporting only **Canadian-source income** (rental from Canadian property, employment income earned in Canada, etc.).

    **Credits:** Very limited — only specific credits tied to Canadian activities.

    **Tax rate:** Flat withholding rates apply to most non-resident income (25% on dividends, 25% on rent unless Section 216 election, etc.).

    **Your practice:** Most non-resident returns are complex — international tax treaty interactions, Part XIII tax, election filings. Refer complex non-resident situations to a CPA with international tax experience. Know the concept; know when to refer.

=== "Deemed Resident"

    **Who they are:** A person not ordinarily resident in Canada who was present in Canada for **183 or more days** in the calendar year. Treated as a full-year Canadian resident for tax purposes.

    **The 183-day trap:** A US citizen who spends 6 months each year in Ontario at their cottage (January–June) is deemed a Canadian resident. They owe Canadian tax on their worldwide income. Most are not aware of this obligation.

    **Tax treaty relief:** Canada's tax treaties with the US and many other countries contain tiebreaker rules — a deemed resident who is also taxable in their home country can use treaty provisions to avoid true double taxation. But the treaty doesn't eliminate the filing obligation — it may change the tax owed.

    **Practical frequency:** Rare in day-to-day Ontario practice — but worth knowing when a client says "I only live here half the year."

### The Significant Ties Test — The Actual Residency Determination

CRA does not simply count days to determine residency. They apply the **significant ties test** — an analysis of the substantive connections a person has to Canada.

**Primary ties (establishing or maintaining residency):**

| Primary Tie | Description | Weight |
|---|---|---|
| **Home in Canada** | A dwelling place available for the person's use — owned, rented, or available from family | Very strong |
| **Spouse or CLP in Canada** | Legal or common-law partner remains in Canada | Very strong |
| **Dependants in Canada** | Children or other dependants living in Canada | Very strong |

One primary tie is usually sufficient to establish Canadian residency. A person who keeps a home in Canada while working abroad is typically still a Canadian resident.

**Secondary ties (supporting evidence):**

| Secondary Tie | Examples |
|---|---|
| Canadian bank accounts | Active accounts — not just dormant accounts kept for convenience |
| Canadian driver's licence | Province-issued licence maintained |
| Canadian health card | OHIP card in Ontario |
| Canadian vehicle registered to the person | |
| Canadian professional memberships or licences | |
| Canadian investments or pension plans | RRSPs, TFSAs, DB pensions |
| Social ties in Canada | Family, friends, community organizations |

Secondary ties are evaluated collectively. Multiple secondary ties with no primary ties may or may not establish residency — context matters.

!!! example "Case — The Residency Question That Determines the Entire Return"

    **Scenario 1 — Ahmed, IT consultant:**
    Ahmed has been working in Saudi Arabia on a 2-year contract. His wife and children live in Mississauga. He returns to Canada for 4 weeks over Christmas. He maintains his OHIP card and has a Canadian bank account.

    **Analysis:** Ahmed's wife and children in Canada = primary tie (spouse + dependants). His home — even if he's not physically there — is available to him. **He is a Canadian resident** and files a T1 reporting worldwide income including his Saudi Arabia salary.

    *Note: Saudi Arabia has no income tax. Ahmed gets no foreign tax credit. His Saudi income is fully taxable in Canada. This surprises many clients — the fact that you didn't pay tax in another country doesn't exempt you from Canadian tax on that income.*

    **Scenario 2 — Wei, international student:**
    Wei arrives from China in September on a student visa. He lives in university residence in Waterloo. He has no spouse, no children. His family and home remain in China. He opens a Canadian bank account.

    **Analysis:** One secondary tie (bank account), one temporary dwelling (university residence — not considered a "home" in the residency sense). No primary ties. **Wei is likely NOT a Canadian resident** — he is a sojourner present in Canada for a specific temporary purpose. He does not file a full T1. If he has no Canadian-source income, he may not need to file at all.

    *The distinction between Ahmed and Wei is the primary ties — specifically spouse/dependants and the meaning of "home." Wei's Canadian bank account and residence room do not overcome the absence of primary ties.*

    **Scenario 3 — Sandra, born in Ontario, moved to Australia:**
    Sandra moved to Sydney in February on what she described as "a long working holiday — probably 2 years." She sold her Toronto condo before leaving. Her parents remain in Toronto. She maintains a Canadian bank account and TFSA.

    **Analysis:** No home available to her in Canada (condo sold). No spouse or dependants in Canada. Secondary ties: bank account, TFSA, parents. **This is genuinely unclear.** CRA might find she established Australian residency upon departure, making her a part-year resident (January–February). Or they might find the secondary ties sufficient to maintain Canadian residency. The prudent approach: obtain a formal determination if significant tax is at stake, and file conservatively.

    *The lesson: residency is facts-based, not checkbox-based. When the analysis is genuinely uncertain, document your reasoning and consider recommending the client seek a CRA ruling.*

---

## 3.3 Filing Deadlines — Every Date, Every Nuance

Deadlines are not guidelines. Missing them triggers automatic penalties that have nothing to do with how much tax is owed or how good your return is. Know these cold.

### The Primary Deadlines

| Who | Filing Deadline | Balance Owing Deadline |
|---|---|---|
| **Most individuals** | **April 30** | **April 30** |
| **Self-employed individuals** (and their spouses/CLPs) | **June 15** | **April 30** |
| **Deceased taxpayers — died Jan 1–Oct 31** | 6 months after date of death | 6 months after date of death |
| **Deceased taxpayers — died Nov 1–Dec 31** | April 30 of the following year | April 30 of the following year |
| **Deceased self-employed — died Jan 1–Oct 31** | Later of June 15 or 6 months after death | Later of April 30 or 6 months after death |
| **Non-residents (Sec 217 election)** | June 30 | June 30 |

### The Self-Employed Deadline Trap — The Most Consequential Misunderstanding in Practice

!!! danger "Self-employed clients can file June 15 — but any balance owing is still due April 30"
    This is the single most common misconception about self-employed filing and the one that costs clients the most in avoidable interest.

    **What many clients believe:** "I'm self-employed — I have until June 15 for everything."

    **What is actually true:**
    - Filing the T1 return: due **June 15** ✅
    - Paying any balance owing: due **April 30** ✅ — same as everyone else

    If a self-employed client owes $8,400 in combined tax and pays it on June 15 when they file, they have been 46 days late on a payment. Interest compounds daily from May 1 at the prescribed rate (currently 9% annual = approximately 0.025%/day). On $8,400 for 46 days: approximately **$96 in avoidable interest** — not catastrophic, but entirely unnecessary.

    **More importantly:** Clients who believe the June 15 extension covers payment delay are sometimes several thousand dollars late. On $25,000 owing for 46 days at 9% annual: approximately **$285 in interest** — for a mistake that a clear explanation in November could prevent.

    **Your advice to every self-employed client in your November planning call:** *"You have until June 15 to file your return. But if you're going to owe money, we want to know that by April 1 so you can make the payment by April 30. The filing extension is not a payment extension."*

### The Spouse/CLP Filing Deadline Extension

If one spouse is self-employed, **both** spouses get the June 15 filing extension — even if one has only T4 employment income. However, the same April 30 payment deadline applies to both.

This extends the filing window for the employed spouse — useful when the self-employed spouse's income affects the other spouse's credits and the picture isn't clear until the business returns are finalized.

### When Deadlines Fall on Weekends or Holidays

When April 30 (or June 15) falls on a Saturday, Sunday, or statutory holiday, the deadline automatically shifts to the **next business day**. In practice, this means the effective deadline sometimes falls on May 2 or 3. Your software and CRA's website will confirm the exact date each year.

---

## 3.4 Penalties — The Exact Calculation You Must Know

Penalties are calculated mechanically. Understanding them precisely lets you advise clients accurately — and occasionally argue against them through the Taxpayer Relief Program.

### The Late-Filing Penalty — Section 162(1)

**Triggered when:** A return is filed after the deadline and there is a balance owing.

!!! success "Critical point: No balance owing = No late-filing penalty"
    If a client files their return three years late and they had a refund each year — **there is no late-filing penalty.** The late-filing penalty applies only when there is tax owing in the year the return is late. This is excellent news to deliver to non-filer clients who only had employment income with normal withholding — most of them owe nothing and face no penalty.

**The penalty calculation:**

```
FIRST-TIME OFFENDER (no late filing in any of the previous 3 years):
    Penalty = 5% of balance owing
            + 1% per COMPLETE month late, maximum 12 months
            
    Maximum first-time penalty: 5% + 12% = 17% of balance owing
```

```
REPEAT OFFENDER (late filing in at least one of the previous 3 years):
    Penalty = 10% of balance owing
            + 2% per COMPLETE month late, maximum 20 months
            
    Maximum repeat penalty: 10% + 40% = 50% of balance owing
```

!!! example "Case — Calculating Late-Filing Penalties"
    **Client A — James, first-time late filer:**
    Balance owing: $6,200
    Filed: August 15 (3.5 months late — only 3 complete months count)

    Penalty = (5% × $6,200) + (1% × 3 × $6,200)
    Penalty = $310 + $186
    **Penalty = $496**

    Interest also accrues on the $6,200 plus on the $496 penalty from May 1.

    ---

    **Client B — Maria, repeat offender (filed late last year):**
    Balance owing: $4,800
    Filed: November 30 (7 months late — 7 complete months count)

    Penalty = (10% × $4,800) + (2% × 7 × $4,800)
    Penalty = $480 + $672
    **Penalty = $1,152**

    Maria owes $4,800 in tax + $1,152 in penalties + interest on both.
    Her effective additional cost from being late: $1,152 ÷ $4,800 = **24% additional on top of the tax itself**.

    ---

    **Client C — Patricia, first-time late filer, refund return:**
    Refund: $2,400 (no balance owing)

    **Penalty = $0.** No balance owing = no late-filing penalty.

    Patricia wasted 8 months of waiting for her refund — but CRA charges no penalty when the return shows a refund. The money simply sat in CRA's hands interest-free. The consequence is opportunity cost, not a formal penalty.

### The Gross Negligence Penalty — Section 163(2)

A separate, much more severe penalty applies when a taxpayer "knowingly, or under circumstances amounting to gross negligence" makes a false statement or omission.

**The rate:** Greater of $100 or **50% of the understatement of tax** attributable to the false statement.

**When CRA applies it:** Deliberately hiding significant income. Claiming fictitious deductions. Participating in tax shelters known to be fraudulent. Repeated "errors" that consistently reduce tax in the same direction.

**The preparer equivalent (Section 163.2):** A preparer who knowingly participates in a false return faces the greater of $1,000 or 50% of the tax benefit of the false statement. Covered in depth in Week 16. Know it exists. Never risk triggering it.

### Interest on Overdue Amounts — Daily Compounding

When a balance owing is not paid by April 30, **CRA charges prescribed interest** compounded daily.

**The prescribed rate:** Set quarterly by CRA based on Government of Canada T-bill rates + 4%. Currently approximately **9% annual** (2025) — but verify current rate quarterly as it changes.

**Daily compound interest calculation:**
Daily rate: 9% ÷ 365 = **0.02466%/day**

**Example — $5,000 balance paid 60 days late:**
$5,000 × (1.0002466)^60 = $5,000 × 1.01496 = $5,074.78
**Interest: $74.78 for 60 days**

**On larger balances:**
$25,000 balance paid 120 days late:
$25,000 × (1.0002466)^120 = $25,000 × 1.03013 = $25,753.35
**Interest: $753.35 for 120 days**

Interest also accrues on outstanding penalties — not just on the original tax balance.

!!! tip "Interest on overdue balances is not waivable in most circumstances"
    Unlike late-filing penalties (which can sometimes be waived through Taxpayer Relief), interest generally cannot be eliminated except in very specific hardship or CRA-error situations. This is why payment on April 30 — even without a filed return — is important when a balance is expected.

    **The professional recommendation:** Even if the return won't be ready by April 30, make a payment equal to your best estimate of what will be owed. This stops the interest clock on that amount. The return can be filed later (by June 15 if self-employed, or with a late-filing penalty if not).

!!! question "Quick Check — Deadlines & Penalties"
    Rosa filed her 2024 return on August 15, 2025 — 3.5 months late. She owes $4,000 in tax. She has never filed late before. What is her late-filing penalty?

    ??? answer
        Late-filing penalty = **5% of balance owing + 1% per complete month late**.
        Rosa is **3 complete months late** (May, June, July — August 15 does not complete a fourth month).
        Penalty = $4,000 × 5% + $4,000 × 1% × 3 = $200 + $120 = **$320**.
        Plus daily compound interest on both the $4,000 balance and the $320 penalty from April 30 onward. If Rosa had filed on time even without paying, the penalty would be $0 — the penalty is for late *filing*, not late *payment* (though interest still applies on the unpaid balance).

---

## 3.5 The EFILE System — Professional Filing From Registration to Confirmation

EFILE is the CRA electronic filing system used by professional tax preparers. As a preparer filing more than 5 returns for compensation, you are legally required to EFILE. Understanding the system completely — not just pressing the transmit button — is professional competence.

### EFILE Registration — The Starting Point

Before your first client, you need an EFILE number. This is a CRA authorization, separate from your business registration.

**How to apply:**
1. Go to canada.ca → search "EFILE for electronic filers"
2. Complete the online application — your name, address, SIN or BN, type of returns you'll file
3. Wait for CRA approval: typically **5–15 business days** in off-season, longer during January–March

**Apply in October or November** — not January. A January application leaves you unable to file in February. Many new preparers make this mistake.

**Annual renewal:** EFILE authorization must be renewed each calendar year. CRA sends renewal notices. A lapsed EFILE means you cannot transmit until renewed — which can halt your practice mid-season. Set a calendar reminder every October.

### The RepID — Your Second Required Credential

EFILE authorizes you to **file returns**. The **RepID (Representative Identifier)** authorizes you to **access client information** in CRA's systems on their behalf.

Without a RepID, you can transmit returns but cannot:
- Verify T-slips through CRA My Account before filing
- Check a client's RRSP deduction limit
- Review prior NOAs
- Confirm carryforward balances
- Access correspondence CRA sent the client

The RepID transforms CRA My Account from a client tool into a professional research tool. Register for it at canada.ca/represent-a-client.

**Client authorization (Form T1013):** Each client must authorize you as their representative by signing Form T1013, specifying which tax years and programs you may access. This form can be submitted electronically through CRA My Account (the client authorizes through their own My Account) or by submitting the paper form to CRA. Authorization typically takes 24–48 hours to process.

### Auto-Fill My Return (AFR) — The Professional Game-Changer

Once a client has authorized you as their representative, **Auto-fill my return** allows you to pull their complete T-slip information directly from CRA's database into your software with one click.

**What AFR pulls:**
- All T4 slips filed by employers
- All T5 slips filed by financial institutions
- All T4A slips (pensions, benefits, self-employment payments)
- T4A(P) — CPP benefits
- T4A(OAS) — OAS pension
- T4E — EI benefits
- RRSP deduction limit
- Prior-year carryforward balances (tuition, capital losses, HBP/LLP)
- Prior-year NOA information

**What AFR cannot pull:**
- RRSP contributions made during the current tax year (may lag behind)
- Receipts for deductions (moving expenses, medical, donations, childcare)
- ACB of securities
- Self-reported income (tips, cash income)
- Moving expense documentation

!!! warning "The T3 timing problem — the one gap in AFR that catches preparers"
    T3 slips from mutual funds and ETFs are due to CRA by **March 31** — a full month after T4 and T5 slips (due February 28). When you run AFR in February for a client with investment funds, the T3 slips do not yet exist in CRA's system. You will not see them. The return will look complete.

    Then, in March, the T3 slips arrive. CRA's matching system identifies the discrepancy. The client receives a reassessment.

    **The professional rule:** Any client who owns mutual funds, ETFs, income trusts, REITs, or any trust investment — do not file their return before April 1. Run AFR again after April 1 to confirm all T3 slips are in the system. Then file.

    For clients who need their refund earlier and have investment holdings: file the T4/T5 portion, make a note that T3 slips are pending, and file an amendment when T3s are available. This is less efficient — but better than a reassessment.

### The T183 — Your Legal Authorization to File

Before transmitting any return, you must have the client sign **Form T183 (Authorization for Electronic Filing)**.

The T183 confirms:
1. The client reviewed the return
2. The information is correct to the best of their knowledge
3. They authorize you specifically to file electronically on their behalf

**This form is legally mandatory.** Transmitting without a signed T183 is a violation of EFILE terms. It is also your primary protection if a client later claims they didn't know what was filed.

**Storage:** Keep signed T183s for **six years**. If CRA ever inquires about a return you filed, the T183 is your proof of authorization.

**Practical workflow:** Have clients sign the T183 at the end of the appointment after reviewing the return summary. Never sign it in advance and never sign it yourself. Never transmit without confirming the date is entered in your software.

### The Transmission Sequence

```
STEP 1: Pre-transmission validation
    Software checks for blocking errors
    (invalid SIN, missing province, RRSP over-contribution, etc.)
    Fix all errors before proceeding
    
STEP 2: Confirm T183 date is entered
    Software may block transmission without a T183 date
    
STEP 3: Transmit via EFILE
    Software connects to CRA's EFILE server
    Return is sent encrypted
    
STEP 4: Receive ACK (Acknowledgement)
    CRA's system responds with a confirmation code
    
STEP 5: Record the ACK number
    This is your proof that the return was received
    No ACK = not filed
    
STEP 6: Save and archive
    Save the transmitted PDF in the client file
    Record ACK, transmission date, and result
```

### ACK Response Codes — What CRA Sends Back

| Code | Meaning | Your Action |
|---|---|---|
| **ACK4** | ✅ **Accepted** — return received and will be processed | Record ACK number, notify client, archive |
| **ACK2** | ❌ **Rejected** — specific error flagged | Read error code, fix the specific problem, retransmit |
| **ACK3** | ❌ **Rejected** — return already on file for this SIN/year | Investigate: did client self-file? Duplicate transmission? Do not retransmit blindly |
| **No response** | Server unavailable or connection timeout | Wait and retry — do not assume it transmitted |

!!! danger "ACK3 requires investigation — never ignore it"
    ACK3 means CRA already has a return on file for that client and tax year. This happens when:
    - The client self-filed through NETFILE before coming to you
    - You accidentally transmitted twice
    - Someone filed fraudulently using the client's SIN

    Do not retransmit without understanding why. If the client self-filed first: compare both returns, determine which is more accurate, and file a T1-ADJ if needed. If you suspect fraud: contact CRA's identity protection line immediately.

### EFILE Server Hours — Plan Around These

CRA's EFILE server is offline during:
- Nightly maintenance: approximately **11 PM to 6 AM Eastern** every night
- Long weekends: sometimes extended maintenance
- System updates: announced in advance at canada.ca/efile-status

During peak tax season (March–April), the EFILE server can be slow during peak daytime hours. Transmitting in early morning (7–9 AM) or evening (after 7 PM) often results in faster response times.

!!! question "Quick Check — EFILE Process"
    You prepare Marcus's return. He reviews it, agrees with the numbers, and you transmit via EFILE. The next day he calls saying he forgot to mention a T5 for $840 in bank interest. What do you do?

    ??? answer
        File a **T1 adjustment (T1-ADJ)** — either through CRA My Account or by paper. The T1-ADJ reports the correct T5 amount and CRA recalculates. You can amend returns going back **10 years**. For Marcus, submit the T1-ADJ promptly. The additional $840 at his marginal rate will generate a small balance owing plus interest from the original due date. The lesson: always ask clients at intake whether they have received all their slips — and follow up after T3 season (post March 31) for investment clients.

!!! tip "In your tax software"
    **Software handles automatically:**
    - EFILE transmission and ACK number capture
    - T183 generation (pre-populated with return data — client signs before you transmit)
    - Deadline warnings if filing after April 30
    - Late-filing penalty calculation (displayed on the return summary)
    - Interest estimates on balances owing

    **You must verify or enter manually:**
    - Client's SIN, date of birth, and address — errors here cause EFILE rejection
    - Province of residence on December 31 — software cannot determine this for you
    - Whether the client is a first-time filer (no prior year carry-forwards to import)
    - AFR (Auto-fill my Return) data — review every pre-filled slip; CRA's data can lag or be incomplete
    - Whether a T1-ADJ is needed — software files the original return only; amendments are a separate process

---

## 3.6 The T1-ADJ — Correcting a Filed Return

Mistakes happen. Slips arrive late. Clients remember expenses they forgot. CRA reassesses and you need to respond. The **T1 Adjustment Request (T1-ADJ)** is how corrections are made to previously filed returns.

### When to File a T1-ADJ

| Situation | T1-ADJ Needed? |
|---|---|
| Missing T-slip discovered after filing | ✅ Yes |
| Additional deduction identified after filing (missed RRSP, childcare, carrying charges) | ✅ Yes |
| CRA reassessed incorrectly and you have documentation to counter | ✅ Yes |
| Client received a late T3 after the return was filed | ✅ Yes |
| Capital gain calculated incorrectly | ✅ Yes |
| Prior preparer made an error | ✅ Yes — up to 10 years back |
| Client wants to change their mind about RRSP deduction amount | ✅ Yes — deduction can be increased or decreased |
| CRA reassessed correctly (they found a missing T5) | No — CRA's reassessment is the correction |

### How to File a T1-ADJ

**Method 1 — CRA My Account (fastest, recommended):**
1. Log in as the client's representative through Represent a Client
2. Navigate to "Submit documents" or "Adjust my return"
3. Select the tax year, enter the changed amounts, provide explanation
4. Submit with supporting documentation attached

**Method 2 — Paper Form T1-ADJ:**
1. Complete Form T1-ADJ with the changed lines and new amounts
2. Attach explanation and all supporting documentation
3. Mail to the applicable CRA tax centre

**Processing time:**
- Online T1-ADJ: typically 2–4 weeks in off-season, 8–12 weeks during tax season
- Paper T1-ADJ: typically 8–12 weeks year-round

### How Far Back Can a T1-ADJ Go?

**General rule:** Individuals can request an amendment to a prior year return for up to **10 years** back.

*Example (2025 tax season):*
- You can amend returns for 2015 through 2024 (current year not yet filed or just filed)
- 2014 and earlier: outside the 10-year window — no amendment possible

**Why this matters in practice:** A new client who switches to you may have had missed deductions for years — medical expenses, advisory fees, moving expenses, DTC retroactive claims — that go back multiple years. You can recover years of missed credits through amendments. This is one of the highest-value services you offer to new clients who have never had a quality preparer.

### The Most Valuable T1-ADJ Opportunities

**1. Disability Tax Credit retroactive recovery:**
When a client receives DTC approval for a condition that has existed for years, you can amend up to 10 prior returns claiming the DTC credit retroactively. At $9,872 base amount × 15% = $1,481/year × 10 years = up to **$14,810 in recovered federal credits** plus Ontario equivalents. This is potentially the highest-value T1-ADJ you will ever file.

**2. Investment advisory fees never claimed:**
A client who pays $4,000/year in advisory fees on a non-registered account and never claimed them on Line 22100 has left approximately $4,000 × 29.65% = $1,186/year on the table. Over 5 years recoverable: **$5,930 in missed credits**. One question at intake uncovers this.

**3. Medical expenses — wrong year or window:**
A client who claimed medical expenses in the calendar year window but had a better 12-month window crossing two tax years. Amend the prior year to remove the expenses from the wrong window and claim them in the optimal year.

**4. Capital gains with wrong ACB:**
A client who used T5008 Box 20 as ACB and overpaid capital gains tax. Amend with the correct ACB calculation and the reconstructed purchase history.

---

## 3.7 The Voluntary Disclosure Program — The Non-Filer's Path Forward

The **Voluntary Disclosure Program (VDP)** is CRA's program that allows taxpayers who have unfiled returns or unreported income to come forward proactively — before CRA contacts them — and receive reduced penalties and no prosecution.

### The Two Tracks

Since 2018, VDP has two tracks based on the severity of the non-compliance:

| | General Program | Limited Program |
|---|---|---|
| **Who qualifies** | Good-faith non-compliance, isolated errors, administrative failures | Intentional tax avoidance, "major non-compliance," offshore accounts |
| **Penalty relief** | Full waiver of gross negligence and late-filing penalties | 50% reduction of gross negligence penalties only |
| **Prosecution** | Protection from prosecution | Protection from prosecution |
| **Interest** | Assessed at normal rates (no reduction) | Assessed at normal rates |
| **Requirements** | Voluntary, complete, and payment or arrangement | Voluntary, complete, and payment or arrangement |

### The Four VDP Conditions

For a VDP application to be valid, the disclosure must be:

1. **Voluntary** — CRA must not have already contacted the taxpayer about the specific unfiled period or unreported income. Once CRA initiates a review or audit, the VDP window closes for that issue.

2. **Complete** — Everything must be disclosed. Partial disclosures don't qualify. If a client failed to file for 5 years, all 5 years must be included in the VDP.

3. **Involves a potential penalty or prosecution** — This is almost always met for unfiled returns or unreported income.

4. **At least one year is past the standard 3-year assessment period** — Or there must be a gross negligence penalty or prosecution risk involved.

### The Critical Timing Issue

!!! danger "VDP closes the moment CRA makes contact about the unfiled period"
    If a client receives a letter from CRA asking about an unfiled year — the VDP window for that year has potentially closed. The voluntary nature of the disclosure is no longer valid.

    This is why the advice to non-filer clients must always include: *"If CRA has already been in contact with you about any specific year, tell me now. The strategy for those years is different from the years CRA doesn't know about yet."*

    A client who received a CRA letter in August and comes to you in October has already potentially missed the VDP window for the periods mentioned in that letter. Act quickly when a client discloses a non-filing situation — time matters.

### Who Typically Benefits Most from VDP

| Client Type | VDP Value |
|---|---|
| Business owner who underreported cash income for 3+ years | High — avoids gross negligence penalties (50% of understatement) and potential prosecution |
| Long-term non-filer with balance owing in prior years | Moderate — avoids late-filing penalties (5–17% per year) and prosecution risk |
| New immigrant who had unreported foreign income | High — T1135 penalties are severe; VDP can prevent them |
| Client who claimed false charitable donation receipts | High — gross negligence applies; prosecution risk is real |
| Non-filer who always had refunds | Low benefit — late-filing penalties don't apply to refund years; file normally |

### How VDP Works in Practice

**Step 1 — Assess the situation:**
Determine all unfiled years, all unreported income, all potential penalties. Quantify the exposure.

**Step 2 — Prepare the disclosures:**
Prepare all outstanding T1 returns for all relevant years — complete and accurate, with all income and all deductions.

**Step 3 — Prepare the VDP application:**
Complete Form RC199 (Voluntary Disclosures Program Application). Explain the circumstances. Attach all returns.

**Step 4 — Submit to CRA:**
Applications are submitted to CRA's VDP processing centre.

**Step 5 — CRA reviews and issues an acceptance letter:**
CRA confirms the relief granted and issues a formal offer. The taxpayer must accept and pay the tax (plus interest) as a condition of the relief.

!!! tip "For complex VDP cases, refer to a CPA with VDP experience"
    Simple non-filing situations (no unreported income, just late filing) can often be handled by simply filing the outstanding returns without a formal VDP application — especially when there are no balances owing. The VDP is most valuable when there is both unreported income AND significant penalty risk. For those cases — particularly business owners with multi-year unreported cash income or offshore assets — refer to a CPA or tax lawyer with VDP experience. The application must be precise to be effective. A poorly prepared VDP application can be rejected.

---

## 3.8 The Non-Filer Conversation — Handling the Most Anxiety-Laden Client Situation

The client who hasn't filed in 2, 5, or 10 years is the most anxiety-laden client you will encounter. They arrive expecting judgment. They have catastrophized their situation. Most believe CRA is about to arrest them or seize their assets. Almost none of them are actually in the jeopardy they imagine.

### CRA's Actual Enforcement Escalation — What Really Happens

Understanding this allows you to deliver accurate, calming, professional advice rather than the vague reassurances that undermine credibility.

**Stage 1 — Reminder letters (Months 1–18 after the deadline):**
CRA sends multiple reminder letters to the last known address asking the person to file. Most unfiled clients have received these and either didn't open them or were afraid to act on them.

**Stage 2 — Notional (arbitrary) assessment (after 18–36 months typically):**
If the person doesn't file, CRA estimates their income and issues an assessment. This estimate is usually **wildly inaccurate** — often far higher than the person's actual income. CRA has no data to work from except what their systems show (employment income from T4s, for example) and they may add estimates for income they assume was earned. The notional assessment creates an official balance owing even if the person actually had a refund.

**Stage 3 — Collections contact (after notional assessment):**
CRA's collections division begins calling. They may issue Requirements to Pay to the person's employer (wage garnishment) or bank (account freeze) for any assessed balance.

**Stage 4 — Legal action (for significant ongoing non-compliance):**
Liens on property, formal legal proceedings. This stage is reached only in cases of significant, sustained, deliberate non-compliance.

**Stage 5 — Criminal prosecution (rare):**
Reserved for deliberate, multi-year fraud — false returns, fabricated receipts, participating in tax schemes. Not for ordinary non-filers who simply got behind.

### The Professional Assessment — What You Determine At Intake

When a non-filer client sits down, your first job is assessment — not judgment.

**Questions to ask:**
1. "What is the most recent year you filed a return? Do you have that NOA?"
2. "Have you received any letters from CRA? Can you share them with me?"
3. "For the years you didn't file — were you employed? Did you have a T4?"
4. "Did you have any income beyond employment — rental income, business income, investments?"
5. "Did you have a balance owing in any of those years, or do you think you had refunds?"

The answers shape the strategy:

| If the unfiled years likely had refunds | File normally — no VDP needed, no penalties |
| If the unfiled years had balances owing | VDP if unreported income exists; file and pay if only late filing |
| If CRA has already contacted them about specific years | VDP window may be closed for those years — different strategy |
| If there is unreported income (cash business, foreign income) | VDP is likely the right path |

!!! example "Case — Patricia Hasn't Filed in Four Years"
    Patricia, 44, walks in. She worked as a nurse from 2021–2024 — T4 income only. She never filed. She's afraid she owes "a lot of money" and is expecting you to tell her to call a lawyer.

    **Your assessment at intake:**
    - T4 income only: employer withheld tax throughout the year
    - Nurses at her income level ($72,000–$82,000) typically have reasonable withholding
    - No self-employment, no rental, no investment income beyond a savings account
    - She has never received a letter from CRA (she admits she stopped opening mail from government agencies)

    **Your analysis:**
    At Patricia's income with normal withholding and assuming she made no RRSP contributions and claimed only basic credits: she likely had refunds in two of the four years and modest balances (under $1,500) in the other two.

    **Your response:**

    *"Patricia, thank you for coming in. Let me put your mind at ease about a few things. First — the situation is significantly more manageable than you're imagining. You had employment income through a T4. Your employer was withholding tax throughout the year. That means the most likely scenario is that some of these years actually have refunds waiting for you — not balances you owe. Let me pull up your information through CRA My Account and we'll know exactly what we're dealing with within a few minutes."*

    [You access CRA My Account. You see four years of filed T4 slips. Two years show notional assessments from CRA (they estimated her income higher than actual). Two years have no assessment yet.]

    *"Here's what I see. In 2021 and 2022, CRA sent you assessment notices because you didn't file — they estimated your income based on your T4. One of these estimates is higher than your actual income. In 2023 and 2024, they haven't issued assessments yet. We're going to prepare all four returns tonight using your actual slip information. Based on what I see, I believe two of these years will show refunds — the withholding was sufficient. The other two may have small balances. And because you're an employee with T4 income only, the late-filing penalties only apply to years where there's a balance owing after all credits — which may be zero."*

    Patricia visibly relaxes. Two hours later, you have prepared all four returns:
    - 2021: **$1,840 refund** (no late-filing penalty — refund year)
    - 2022: **$2,210 refund** (no late-filing penalty — refund year)
    - 2023: **$420 balance owing** (late-filing penalty: 5% × $420 = $21 + 12 months × 1% × $420 = $50.40 = **$71.40 total penalty**)
    - 2024: **$680 balance owing** (late-filing penalty: 5% × $680 = $34 + 4 months × 1% × $680 = $27.20 = **$61.20 total penalty**)

    Net position: Patricia had $4,050 in combined refunds. She owes $1,100 in combined balances plus $132.60 in penalties. Her net position from four unfiled years: **approximately $2,817 coming to her, net of everything**.

    She also receives retroactive GST/HST credits and gets OTB started going forward.

    Patricia came in terrified. She leaves with money owed to her. She tells every nurse she works with about you.

---

## 3.9 The Social Insurance Number — Rules Every Preparer Must Know

The SIN is the unique identifier that links all tax information to an individual. Every T1 return requires a valid SIN.

### SIN Categories and Their Filing Implications

| SIN Format | Issued To | Validity |
|---|---|---|
| **Starts with 1–8** | Canadian citizen or permanent resident | Permanent |
| **Starts with 9** | Temporary resident (work permit, student permit, visitor with income) | Valid only while the immigration document authorizing the SIN is valid |

!!! danger "Filing a return with an expired SIN starting with 9 creates serious problems"
    A SIN beginning with 9 has an expiry date printed on the back of the SIN card — it matches the expiry of the immigration document that authorized it. Filing a T1 with an expired SIN starting with 9 will be rejected by CRA's system (ACK2 or processing error).

    When a client has a SIN starting with 9: ask to see the SIN card. Check the expiry date. If it has expired but the client's immigration status has been renewed — they must get a new SIN from Service Canada before you can file. Do not attempt to file with an expired SIN.

### When a Client Doesn't Have a SIN

Without a SIN, CRA cannot process a T1 return electronically. Options:

1. **Apply for a SIN immediately:** Service Canada offices issue SINs on the spot to eligible individuals. Processing is same-day. Direct the client to their nearest Service Canada office before their return can be filed.

2. **For deceased individuals:** Use the SIN that was issued to them during their lifetime. Estate returns use the deceased person's SIN.

3. **For newborns:** CRA has provisions for children with no SIN — rare in practice as Service Canada now issues SINs for newborns automatically in most provinces.

### Estate Returns and SINs

The deceased's T1 return (the terminal return) is filed using the **deceased person's own SIN** — not the executor's. The executor files on behalf of the estate but uses the deceased's identification information. CRA should be notified of the death through their standard deceased-person process (which initiates the stopping of benefits and begins the estate administration process).

---

## 3.10 The Taxpayer Relief Program — Reducing Penalties and Interest

For clients with legitimate reasons for non-compliance or late filing, CRA's **Taxpayer Relief Program** (Form RC4288) allows applications to waive or cancel penalties and interest.

### What Can Be Waived

| Item | Can Be Waived? |
|---|---|
| Late-filing penalty (Section 162(1)) | ✅ Yes — with qualifying circumstances |
| Gross negligence penalty (Section 163(2)) | ✅ Yes — with qualifying circumstances |
| Interest on overdue amounts | ✅ Yes — in exceptional circumstances |
| The underlying tax itself | ❌ No — the tax is always owed |

### Qualifying Circumstances

CRA's published criteria for granting taxpayer relief:

**1. Extraordinary circumstances beyond the taxpayer's control:**
- Natural disaster, severe weather event that disrupted filing
- Serious illness or accident of the taxpayer or an immediate family member
- Civil disturbance, postal strike, or system failure by CRA

**2. Actions of the CRA:**
- Processing delays at CRA that caused the penalty
- Incorrect information provided by a CRA agent
- CRA system failures

**3. Inability to pay / financial hardship:**
- Paying the interest or penalties would cause severe financial hardship
- The taxpayer is in a genuine hardship situation (though the tax itself remains due)

**4. Long-standing compliance record:**
A taxpayer who has filed on time for 10+ years before a single late filing has a stronger case for relief than a repeat non-filer.

### How to Apply

1. Gather documentation supporting the qualifying circumstance (medical records, disaster declarations, etc.)
2. Complete Form RC4288 and write a clear explanation of the situation
3. Include the specific penalty/interest amounts being requested for waiver
4. Submit with all supporting documentation
5. Processing time: 6–18 months — CRA is heavily backlogged on relief applications

**Success rate:** Legitimately qualified applications (genuine medical emergency, well-documented) are routinely granted. Applications that simply assert hardship without documentation or that represent deliberate non-compliance are routinely denied.

---

## 3.11 Ontario-Specific Filing Considerations

### The ON-BEN Filing

The **ON-BEN** is not a separate return — it is a section of the Ontario portion of the T1 that triggers Ontario Trillium Benefit payments. It must be completed every year for clients who:

- Rent in Ontario (OEPTC component)
- Pay property tax in Ontario (OEPTC component)
- Live in a nursing home or long-term care facility in Ontario
- Are resident in Northern Ontario (NOEC component)
- Are age 64+ and own their home in Ontario (Senior Homeowners' Property Tax Grant)

**The ON-BEN is not automatic.** If it isn't completed, OTB payments don't start. Many clients who switch preparers discover their OTB was never set up because their prior preparer skipped it.

**At intake:** For every Ontario client, ask: *"Do you rent your home, or do you own? Do you pay property tax?"* Then complete ON-BEN with the landlord's name and address, or the municipal property tax amount.

### The December 31 Province and OTB

OTB is an Ontario benefit. If a client was an Ontario resident on December 31, they file ON-BEN for the full year — but the rent or property tax entered should reflect **only amounts paid while in Ontario**. A client who moved from Alberta to Ontario in September includes rent only from September onward on ON-BEN.

### Ontario Tax Instalments

Self-employed individuals and others with net tax owing over $3,000 in two of the last three years must pay **quarterly tax instalments**. For Ontario residents, CRA administers the instalment system — there is no separate Ontario instalment payment. Everything is remitted to CRA.

**Ontario instalment due dates:** March 15, June 15, September 15, December 15.

**What happens if instalments aren't paid:**
CRA assesses instalment interest at the same prescribed rate as late balances. If instalments were substantially lower than required, CRA may assess a penalty on top of the interest.

**The planning message to self-employed clients:** *"If you'll owe more than $3,000 in combined federal and Ontario tax, CRA will expect quarterly instalments next year. Let's calculate the quarterly amount today so you're not caught off guard."*

---

## 3.12 Case Studies — Filing Scenarios Across Every Situation

### Case A — The Self-Employed Who Paid Late and Didn't Know Why

**Client:** Ahmed runs a freelance web design business. He always files June 1 (within the June 15 deadline). He's been confused about why he consistently gets an interest notice even though he files on time.

**The misunderstanding:** Ahmed believes the June 15 deadline covers payment. It covers only filing.

**The math of his mistake:**
2024 balance owing: $14,200
Payment made June 1 (31 days after April 30):
Daily interest: $14,200 × 0.02466% = $3.50/day
31 days: **$108.50 in interest** — avoidable with an April 30 payment

Over 5 years of this pattern: approximately $500 in avoidable interest — not catastrophic, but unnecessary every single year.

**Your advice:** *"Ahmed, the June 15 date only extends when you have to file the return — not when you have to pay. Any balance you owe is due April 30 just like everyone else. For next year, let's do a rough calculation of your expected tax bill in March, and you make that payment April 30. Then you file the formal return when it's ready — up to June 15."*

Ahmed's response: "I thought they were the same date." He had no idea. No one had ever explained this.

---

### Case B — The First-Year Homeowner Who Didn't Know They Had to Report the Sale

**Client:** Marcus and his wife sold their home and moved to a larger house. They've owned their home for 6 years and lived in it the whole time — they assume they owe no tax because it's their principal residence.

They're right about the tax. They're wrong about the filing.

**The rule:** Since 2016, every principal residence sale must be reported on Schedule 3 with a T2091 designation — even when entirely exempt.

**What happens if they don't report:**
CRA receives the disposition information through land registry data. They identify the unreported disposition. They issue a letter requesting Schedule 3 and T2091. If the response is slow, they may deny the PRE claim (or at minimum require substantial documentation to re-establish it).

**Additionally:** A late T2091 designation filed after the original return assessment date can result in CRA treating it as a late-filed election — with a $100/day penalty for each day late (minimum $100, maximum $8,000).

**Your approach:** Ask every client at intake: *"Did you sell any property — including your home — during the year?"* Even if the answer is yes and the gain is fully exempt, the reporting obligation exists. Complete Schedule 3. File the T2091. Document it cleanly. The 5 minutes it takes to do this correctly prevents a potential $8,000 penalty on something where the tax was already $0.

---

### Case C — The 10-Year Non-Filer with Unreported Income

**Client:** Victor operated a small landscaping business from 2014 to 2024. He never filed a T1 return. He deposited cash payments directly to a personal account. He now wants to "get right with CRA" because he's trying to get a mortgage and needs income documentation.

**The situation:**
- 10 years of unfiled returns
- Cash business income — no T4, no T4A, no paper trail
- He estimates his income was roughly $40,000–$60,000/year
- He received two letters from CRA asking him to file — the most recent was in 2022

**The assessment:**
- VDP may not be fully available for years CRA specifically addressed in the 2022 letter
- The 2022 letter covered 2019 and 2020 — those years may be outside VDP's voluntary requirement
- 2021–2024 may still be VDP-eligible if CRA hasn't specifically contacted him about those years
- Unreported business income = gross negligence risk = VDP is valuable where available

**Your recommendation:** This situation exceeds your scope as a T1 preparer. Victor needs a CPA or tax lawyer with VDP experience who can:
1. Analyze which years are VDP-eligible vs. which have existing CRA contact
2. Prepare the returns with professionally defensible income estimates (bank deposit analysis, industry benchmarks)
3. File the VDP application with proper legal positioning
4. Negotiate the relief for eligible years
5. Handle the non-VDP years through normal channels

**What you tell Victor:** *"Victor, I can see you're ready to do the right thing and I want to help you do it correctly. The combination of unreported business income over many years and some prior CRA contact makes this more complex than a straightforward late filing. There's a program called Voluntary Disclosure that can significantly reduce your penalties — but it has to be done precisely and strategically. I'm going to refer you to a CPA I trust who specializes in exactly this situation. Once the prior years are sorted out, I'll be happy to handle your ongoing returns going forward."*

Victor respects this answer. It demonstrates competence — knowing what you know and what you don't — more than attempting to handle something outside your expertise.

---

## 3.13 Week 3 Summary

!!! success "What you learned this week"
    - **Eight legal requirements to file** — but the financial case for filing extends far beyond legal obligation. Low-income earners, students, new immigrants, Ontario renters, and seniors all forfeit hundreds to thousands of dollars in annual benefits by not filing
    - **Residency = the significant ties test** — not days counted, not immigration status, not citizenship. Primary ties (home, spouse, dependants in Canada) are the strongest indicators. One primary tie is usually sufficient to establish residency
    - **Part-year residents** file a T1 for the residency period only. Credits are pro-rated at days/365 unless Canadian-source income is 90%+ of worldwide income during the residency period — in which case full credits apply
    - **Filing deadlines:** April 30 for most. June 15 filing extension for self-employed — but balance owing is **always April 30.** This distinction costs self-employed clients hundreds in avoidable interest every year
    - **Late-filing penalty:** 5% of balance owing + 1%/month (max 12 months) for first-time. 10% + 2%/month (max 20 months) for repeat offenders. **No balance owing = no penalty** — even if the return is years late
    - **Interest compounds daily** at approximately 9% annually. It accrues on both the outstanding tax and on the penalties. It cannot generally be waived except in extreme circumstances
    - **EFILE requires:** Registration (apply October/November), RepID for My Account access, signed T183 before every transmission, and ACK4 confirmation. ACK3 means already filed — investigate before retransmitting
    - **T3 slips arrive March 31** — never file investment clients before April 1. Run AFR again after April 1 to capture all T3 slips
    - **T1-ADJ corrects prior years** going back up to 10 years. The highest-value T1-ADJ opportunities: DTC retroactive recovery, unclaimed advisory fees, medical expense window optimization, capital gains ACB correction
    - **VDP** allows non-filers and underreporters to come forward proactively for penalty relief — but only while CRA hasn't yet contacted them about the specific period. Two tracks: General (full penalty waiver) and Limited (50% reduction for serious cases)
    - **The non-filer conversation:** Most are not in the jeopardy they imagine. Assessment, calm explanation, CRA My Account verification, clear action plan — this converts the most anxious client into the most loyal
    - **SINs starting with 9** are temporary — check expiry date before filing. Expired SIN → reject at transmission
    - **Ontario ON-BEN must be actively completed** — OTB is not automatic. Many clients of prior preparers discover years of missed OTB because no one filed ON-BEN for them

---

## ✅ Week 3 Quiz

When you're ready, ask Claude: **"Quiz me on Week 3"** for an interactive test.

??? question "1. Your client sold their principal residence in 2025. They lived in it for all 8 years they owned it. The capital gain is fully exempt under the Principal Residence Exemption. Do they need to file a T1? What happens if they don't report the sale?"
    **Yes — they must file a T1 and report the sale.** Since 2016, every principal residence sale must be reported on Schedule 3 with Form T2091 designating the property as a principal residence — regardless of whether the gain is taxable. Even if the capital gain is $0 or fully exempt, the reporting obligation exists. If they don't report: CRA receives the disposition information through land registry data, identifies the unreported sale, and requests Schedule 3 and T2091. A late T2091 designation (filed after the original assessment date) can trigger a penalty of $100/day late (minimum $100, maximum $8,000) — for an exemption that would have cost them zero tax if properly reported on time. Failure to report the principal residence sale can also result in CRA denying the exemption entirely if documentation to support it cannot be provided after the fact. The return must be filed. The sale must be reported. The exemption protects from tax — not from the reporting obligation.

??? question "2. Maria, a freelance graphic designer, earns $68,000 net business income in 2025. She files her T1 on June 10 (within the June 15 deadline). Her combined federal and Ontario tax is $14,800. She paid $14,800 on June 10 when she filed. What penalty and interest does she owe, and how could she have avoided it?"
    **Late-filing penalty: $0** — Maria filed by June 15, the extended deadline for self-employed individuals. **Interest: approximately $181.** The balance owing of $14,800 was due April 30. She paid June 10 — 41 days late. Daily interest at approximately 9% annual = 0.02466%/day. $14,800 × 0.02466% × 41 days = approximately **$149.62 in interest**. Additionally, interest accrues on the interest itself (compound daily) — bringing the total to approximately $150. **How to avoid it:** The June 15 filing extension covers only the obligation to file the return. It does not extend the payment deadline. Maria should estimate her tax owing by mid-April, make a payment of approximately $14,800 on April 30, and then file the formal return by June 15 when it's ready. The April 30 payment stops the interest clock. Filing the return on time (by June 15) means no late-filing penalty. Total avoidable interest: **~$150/year** — multiplied by decades of self-employment, this is real money.

??? question "3. A client says they lived in Ontario from January through November 2025, then moved to Alberta on December 2. They want to know which province's tax return to file and whether they qualify for the Ontario Trillium Benefit for the year. What do you tell them?"
    **Province: Alberta.** Province of residence for Canadian income tax is determined on **December 31**. The client was an Alberta resident on December 31, 2025. This means Alberta provincial tax rates apply to their full year's income (including the 11 months they lived in Ontario). They file Alberta provincial forms — not ON428. **Ontario Trillium Benefit: No.** OTB is an Ontario benefit available to Ontario residents on December 31. This client was not an Ontario resident on December 31. They receive no Ontario Trillium Benefit for 2025 — even for the 11 months they paid Ontario rent and lived in Ontario. This is the December 31 rule in its most consequential form. The client may be frustrated — they lost 11 months of OTB eligibility for a December 2 move. There is no remedy within the tax rules. The December 31 date is absolute.

??? question "4. James filed his T1 on August 20 (late). His balance owing was $8,500. He has never filed late before. Calculate his exact late-filing penalty."
    **Late-filing penalty for James (first-time, no late filing in prior 3 years):** Formula: 5% of balance + 1% per complete month late. April 30 deadline. August 20 filing date. Complete months late: May (1), June (2), July (3). August 20 is not a complete month past August 1 — only 3 complete months count. Penalty = (5% × $8,500) + (1% × 3 × $8,500) = $425 + $255 = **$680 total late-filing penalty.** Additionally, interest accrues on the $8,500 balance from May 1 to the payment date, AND interest accrues on the $680 penalty from the date it was assessed. At 9% annual interest, 112 days on $8,500: approximately $263 in additional interest. **Total additional cost of being late: approximately $943** — from a filing that could have been done on April 30 with a reasonable estimate and then amended if needed.

??? question "5. What is the Voluntary Disclosure Program and what are its four requirements? Give a concrete example of a client who would clearly benefit from it vs. one who doesn't need it."
    **VDP is CRA's program allowing taxpayers to come forward proactively** about unfiled returns or unreported income before CRA initiates contact — in exchange for reduced penalties and protection from prosecution. **Four requirements:** (1) **Voluntary** — CRA must not have already contacted the taxpayer about the specific period being disclosed. Once CRA initiates contact, VDP is no longer available for that period. (2) **Complete** — all information must be disclosed. Partial disclosures are rejected. (3) **Involves a potential penalty or prosecution** — must have genuine compliance risk, not just a minor late filing with no balance. (4) **At least one year past the normal assessment period** or there must be gross negligence/prosecution risk. **Client who clearly benefits:** Marco ran a cash-based restaurant for 5 years and underreported approximately $30,000/year in income. He has never been contacted by CRA. Without VDP, he faces potential gross negligence penalties of 50% of the understated tax ($15,000 × 50% = $7,500/year = $37,500 total) plus prosecution risk. With VDP (General Program): penalties waived, prosecution protection granted. He pays the tax and interest — but avoids the massive penalties. **Client who doesn't need it:** Patricia, a nurse with T4 income only, who simply didn't file for 4 years and likely has refunds in most years. No unreported income. No gross negligence risk. She can simply file her outstanding returns through normal channels. Her refund years have no penalties. Her modest balance-owing years have small late-filing penalties. VDP adds no value — and actually requires more administrative process.

??? question "6. You have a client who had investment income in 2025 — T4 employment, T5 bank interest, and mutual funds. You complete the return in February and want to file. What is the one reason you must wait, and until when?"
    **T3 slips.** Mutual funds, ETFs, income trusts, and REITs issue T3 slips — which are not due to CRA until **March 31**, a full month after T4 and T5 slips (due February 28). If you file in February, the return will be missing the T3 income (capital gains distributions, eligible dividends, other income from the funds). CRA's systems will receive the T3 slips in March and automatically match them against the filed return. The discrepancy will trigger a reassessment adding the T3 income — with additional tax and potentially interest from April 30. **Wait until after April 1.** Run Auto-fill my return (AFR) on or after April 1 to confirm all T3 slips are in CRA's system. Verify them against any paper T3s the client received. Then file. The extra 4–6 weeks of waiting prevents a reassessment that would take 8–12 weeks to resolve through a T1-ADJ.

??? question "7. A client's prior preparer never completed Form ON-BEN for the last three years. Your new client is a renter in Ontario with a net income of $28,000 each year. What benefits were missed, and can they recover anything?"
    **Benefits missed each year:** ON-BEN triggers the **Ontario Trillium Benefit (OTB)**, which has three components: (1) Ontario Sales Tax Credit (OSTC): at $28,000 income, approximately **$280–$345/year**. (2) Ontario Energy and Property Tax Credit (OEPTC): depends on rent. If the client pays $1,100/month rent: 20% × $13,200 = $2,640 deemed property tax equivalent → approximately **$640–$800/year** in OEPTC at this income level. (3) Northern Ontario Energy Credit (NOEC): if in Northern Ontario, additional credit. **Approximate annual OTB missed: $920–$1,145/year.** Over 3 years: approximately **$2,760–$3,435 in foregone benefits.** **Can they recover it?** Partially. OTB for prior years can be claimed by filing an amended ON-BEN for each missed year through a T1-ADJ. CRA will process the amended ON-BEN and issue retroactive OTB payments for the missed years. The recovery window matches the T1-ADJ 10-year limit. File T1-ADJ for 2022, 2023, and 2024 — the client receives retroactive OTB for all three years, plus the correct OTB going forward. This is one of the most common missed items for clients transferring from a prior preparer who wasn't thorough with provincial forms.

---

## 📚 Further Reading

- [CRA: Do you have to file a return?](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/you-have-file-a-return.html)
- [CRA: EFILE for electronic filers](https://www.canada.ca/en/revenue-agency/services/e-services/e-services-businesses/efile-electronic-filers.html)
- [CRA: Filing deadline — self-employed](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/important-dates-individuals/filing-dates-income-tax.html)
- [CRA: Late-filing penalties and interest](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/interest-penalties.html)
- [CRA: Change a prior-year return (T1-ADJ)](https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/change-your-return.html)
- [CRA: Voluntary Disclosures Program](https://www.canada.ca/en/revenue-agency/programs/about-canada-revenue-agency-cra/voluntary-disclosures-program-overview.html)
- [CRA: Taxpayer Relief Program (RC4288)](https://www.canada.ca/en/revenue-agency/services/forms-publications/forms/rc4288.html)
- [CRA: Residency — entering and leaving Canada](https://www.canada.ca/en/revenue-agency/services/tax/international-non-residents/individuals-leaving-entering-canada-non-residents.html)
- [CRA: Represent a Client — RepID registration](https://www.canada.ca/en/revenue-agency/services/e-services/represent-a-client.html)

---

!!! tip "Up Next: Week 4"
    **Phase 1 Review and Integration** — You have now built the complete foundational framework: the Canadian tax system, the T1 architecture from first to last line, and the full filing and compliance rulebook. Week 4 consolidates everything through a multi-client intake simulation, a complete return built from scratch with nothing pre-filled, a 10-question comprehensive quiz spanning all three weeks, and the Phase 1 readiness checklist that confirms you are ready to build on this foundation with the income-type deep dives that begin in Week 5.
