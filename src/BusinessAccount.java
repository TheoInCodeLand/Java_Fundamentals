public class BusinessAccount extends Account implements Printable{

    public BusinessAccount(String ownerName, double balance){
        super(ownerName, balance);
    }

    boolean withdraw(double amount){

        if (amount <= super.balance && amount > 0){
            double withdrawalFee = amount * 0.02;
            double deductibleTotal = amount + withdrawalFee;
            this.balance -= deductibleTotal;

            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been withdrawn from your account. Current available balance: R" +
                            this.balance + ". Withdrawal charges of R" + withdrawalFee + " Applied."
            );

        } else {
            System.out.println(
                    "Transaction declined. Insufficient available funds to complete the requested withdrawal."
            );
        }
        return true;
    }


}
