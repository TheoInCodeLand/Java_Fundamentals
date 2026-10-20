public class BusinessAccount extends Account implements Printable{

    double transactionFee = 10;

    public BusinessAccount(String ownerName, double balance){
        super(ownerName, balance);
    }

    boolean withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Transaction Failed. Invalid Amount.");
        }
        if (amount <= super.balance){
            double withdrawalFee = amount * 0.02;
            double deductibleTotal = amount + withdrawalFee;
            this.balance -= deductibleTotal;

            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been withdrawn from your business account. Current available balance: R" +
                            this.balance + ". Withdrawal charges of R" + withdrawalFee + " Applied."
            );

            transactionLogs.add("Cash Withdrawal:    - R" + amount + ".");

            transactionLogs.add("Withdrawal fee:     - R" + transactionFee + ".");

            return true;
        } else {
            System.out.println(
                    "Transaction declined. Insufficient available funds to complete the requested withdrawal."
            );
            return false;
        }
    }

    public void deposit(double amount){
        double totalTransaction = amount + this.transactionFee;
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit Failed. Invalid Amount.");
        }
        if(totalTransaction <= this.balance){
            this.balance += totalTransaction;
            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been deposited into your business account. Current available balance: R" +
                            this.balance + "."
            );

            transactionLogs.add("Cash Deposit      R" + amount + ".");

            transactionLogs.add("Deposit fee     - R" + transactionFee + ".");

        } else {
            System.out.println("Transaction declined.");
        }
    }

}
