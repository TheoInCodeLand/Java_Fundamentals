public abstract class Account implements Printable {
    private String ownerName;
    protected double balance;

    public Account(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Transaction completed successfully. An amount of R" + amount + " has been credited to your account. Current available balance: R" + this.balance + ".");
    };

    public String getOwnerName(String ownerName){
        this.ownerName = ownerName;
        return this.ownerName;
    }

    abstract boolean withdraw(double amount);

    public void printStatement(){
        System.out.println("Statement successfully printed!");
    }
}