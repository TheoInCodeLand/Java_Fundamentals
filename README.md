# Core Java Banking Ledger & Account Engine

A domain-driven banking console application built in **Java 17**. This project demonstrates core Object-Oriented Programming (OOP) principles, Java Collections Framework data structures, custom business-rule enforcement, and exception handling modeled after real-world South African banking ledgers.

---

## Architectural Highlights & OOP Concepts

* **Abstraction (`Account.java`):** Defines the core state (`ownerName`, `balance`, `transactionHistory`) and shared behaviors (`deposit()`, `withdrawTransaction()`, `printStatement()`) while enforcing an abstract `withdraw()` contract across all account subtypes.
* **Inheritance & Method Overriding (`StudentAccount` & `BusinessAccount`):** Specialized child classes extend `Account` to enforce distinct financial rules without duplicating base ledger logic.
* **Interfaces (`Printable.java`):** Enforces a strict statement-generation contract across all banking entities.
* **Polymorphism:** Processes batch transactions and statement generation dynamically across mixed account collections (`ArrayList<Account>` and `HashMap<String, Account>`).
* **Data Structures (Java Collections Framework):**
    * `HashMap<String, Account>`: Provides $O(1)$ key-value lookup for customer accounts using unique account numbers (e.g., `"ACC-101"`).
    * `ArrayList<String>`: Maintains an ordered, dynamic audit trail of itemized transactions per account.
* **Defensive Programming & Exception Handling:** Utilizes `try / catch` blocks and throws `IllegalArgumentException` and `IllegalStateException` to protect ledger integrity against invalid inputs or limit violations.

---

## Banking Business Rules Implemented

| Account Type | Withdrawal Limit | Fee Structure | Ledger Behavior |
| :--- | :--- | :--- | :--- |
| **Student Account** | Max **R500.00** per transaction | **0% (R0.00)** | Declines or throws `IllegalStateException` if withdrawal exceeds R500 or available balance. |
| **Business Account** | Up to available balance | **2% Service Fee** | Validates principal withdrawal against available balance and applies a 2% fee (supports fee-arrears ledger deduction). |

---

## Project Structure

```text
├── src/
│   ├── Printable.java         # Interface contract for statement output
│   ├── Account.java           # Abstract base class & ArrayList ledger engine
│   ├── StudentAccount.java    # Zero-fee, R500-capped student account implementation
│   ├── BusinessAccount.java   # Commercial account implementation with 2% fee calculation
│   └── Main.java              # Application entry point, HashMap vault & exception testing
└── README.md