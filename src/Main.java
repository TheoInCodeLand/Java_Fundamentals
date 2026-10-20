//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Account> _account = new HashMap<>();

        _account.put("1851000601", new StudentAccount("Siyabonga Nkosimphile Mashimane", 30200));
        _account.put("1851000605", new BusinessAccount("Tshepho Mageba Mnguni", 50200));
        _account.put("1851000609", new StudentAccount("Siphosethu Bongani Skhosana", 30800));

        System.out.println("**********************Capitec_ATM************************");

        // Print Account statement
        for( Account account : _account.values()){
            try {
                account.withdraw(200);

            } catch (Exception e){
                System.out.println("Transaction failed: " + e.getMessage());
            }
            account.printStatement();
        }
    }
}