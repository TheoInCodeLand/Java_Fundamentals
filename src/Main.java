//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(new BusinessAccount("Theophilus Thobejane", 985000.55));
        accounts.add(new StudentAccount("Lerato Nkadimeng", 385000.55));

        for (Account currentAccount : accounts){
            currentAccount.withdraw(200);
        }
    }
}