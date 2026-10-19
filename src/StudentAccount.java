public class StudentAccount extends Account implements Printable{
    public StudentAccount(String ownerName, double balance){
        super(ownerName, balance);
    }
    boolean withdraw(double amount){
        if (amount <= super.balance && amount > 0 && amount <= 500){
            this.balance -= amount;
            System.out.println(
                    "Transaction completed successfully. An amount of R" + amount +
                            " has been withdrawn from your account. Current available balance: R" +
                            this.balance + "."
            );
        } else {
            System.out.println(
                    "Transaction declined. Insufficient available funds to complete the requested withdrawal."
            );
        }
        return true;
    }

}
