import java.util.ArrayList;

public abstract class Account implements Printable {
    public final String ownerName;
    protected double balance;
    protected ArrayList<String> transactionLogs = new ArrayList<>();

    public Account(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }
    abstract void deposit(double amount);

    abstract boolean withdraw(double amount);

    public void printStatement(){
        for(String log : transactionLogs){
            System.out.println(log);
        }
        System.out.println("\n================End of statement=================\nAvailable Balance: R" + this.balance + "\n===================================\n");
    }
}