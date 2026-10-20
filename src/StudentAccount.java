public class StudentAccount extends Account implements Printable{

    public StudentAccount(String ownerName, double balance){
        super(ownerName, balance);
    }

    boolean withdraw(double amount){

        if(amount <= 0){
            throw new IllegalArgumentException("Transaction Failed. Invalid Amount.");
        }
        if (amount <= super.balance && amount <= 500){
            this.balance -= amount;
            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been withdrawn from your student account. Current available balance: R" +
                            this.balance + "."
            );

            transactionLogs.add("Cash Withdrawal:    - R" + amount + ".");

            return true;

        } else {
            System.out.println(
                    "Transaction declined. Insufficient available funds to complete the requested withdrawal."
            );
            return false;

        }
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit Failed. Invalid Amount.");
        }
        if(amount <= this.balance){
            this.balance += amount;
            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been deposited into your student account. Current available balance: R" +
                            this.balance + "."
            );

            transactionLogs.add("Cash Deposited      R" + amount + ".");

        } else {
            System.out.println("Transaction declined.");
        }
    }

}
