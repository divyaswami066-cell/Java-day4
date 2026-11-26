
import java.util.HashMap;
import java.util.Map;

public class BankingAccountManagement {
    public static void main(String[] args) {

        // Store account numbers and balances
        HashMap<Integer, Double> accounts = new HashMap<>();

        // 1 & 2. Create new bank accounts
        accounts.put(1001, 5000.0);
        accounts.put(1002, 8000.0);
        accounts.put(1003, 10000.0);

        System.out.println("Initial Accounts: " + accounts);

        // 3. Deposit money
        int depositAccount = 1001;
        double depositAmount = 2000.0;

        if (accounts.containsKey(depositAccount)) {
            double balance = accounts.get(depositAccount);
            accounts.put(depositAccount, balance + depositAmount);
            System.out.println("\nDeposited Rs. " + depositAmount
                    + " into Account " + depositAccount);
        } else {
            System.out.println("Account does not exist.");
        }

        // 4. Withdraw money
        int withdrawAccount = 1002;
        double withdrawAmount = 3000.0;

        if (accounts.containsKey(withdrawAccount)) {
            double balance = accounts.get(withdrawAccount);

            if (balance >= withdrawAmount) {
                accounts.put(withdrawAccount, balance - withdrawAmount);
                System.out.println("Withdrawn Rs. " + withdrawAmount
                        + " from Account " + withdrawAccount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account does not exist.");
        }

        // 5. Check account balance
        int searchAccount = 1001;

        if (accounts.containsKey(searchAccount)) {
            System.out.println("\nBalance of Account " + searchAccount
                    + ": Rs. " + accounts.get(searchAccount));
        } else {
            System.out.println("\nAccount " + searchAccount + " does not exist.");
        }

        // 6. Prevent operations on non-existing accounts
        int unknownAccount = 9999;

        if (accounts.containsKey(unknownAccount)) {
            System.out.println("Balance: Rs. " + accounts.get(unknownAccount));
        } else {
            System.out.println("\nAccount " + unknownAccount + " does not exist.");
        }

        // Demonstrate getOrDefault()
        double unknownBalance = accounts.getOrDefault(9999, 0.0);
        System.out.println("Default balance for Account 9999: Rs. "
                + unknownBalance);

        // 7. Display all accounts and balances
        System.out.println("\nAll Bank Accounts:");

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account Number: " + entry.getKey()
                    + ", Balance: Rs. " + entry.getValue());
        }

        // 8. Calculate total balance using values()
        double totalBalance = 0.0;

        for (double balance : accounts.values()) {
            totalBalance += balance;
        }

        System.out.println("\nTotal Balance in Bank: Rs. " + totalBalance);

        // Demonstrate remove() on a temporary account
        accounts.put(1004, 1000.0);
        accounts.remove(1004);
        System.out.println("Temporary Account 1004 removed: "
                + !accounts.containsKey(1004));
    }
}
