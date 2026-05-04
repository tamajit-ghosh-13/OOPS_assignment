package root;

// BankAccount class to store individual account details
class BankAccount {
    // Constant integer as per requirements
    final int AccountNumber;
    float balance;
    String ownerName;

    // Constructor to initialize the account
    BankAccount(int accNo, float bal, String name) {
        this.AccountNumber = accNo;
        this.balance = bal;
        this.ownerName = name;
    }

    // Returns current balance
    float balance() {
        return balance;
    }

    // Deposit amount
    void add(float amount) {
        balance += amount;
    }

    // Withdraw amount
    void subtract(float amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Account: " + AccountNumber);
        }
    }
}

// AccountManager class to manage multiple BankAccounts
class AccountManager {
    private BankAccount[] accounts = new BankAccount[10];
    private int count = 0;

    // Method to create an account
    void create(int accNo, float bal, String name) {
        if (count < accounts.length) {
            accounts[count++] = new BankAccount(accNo, bal, name);
        }
    }

    // Method to delete an account by Account Number
    void delete(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].AccountNumber == accNo) {
                // Shift remaining accounts to fill the gap
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[--count] = null;
                return;
            }
        }
    }

    // Method to credit (deposit) to a specific account
    void credit(int accNo, float amt) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].AccountNumber == accNo) {
                accounts[i].add(amt);
                return;
            }
        }
    }

    // Method to debit (withdraw) from a specific account
    void debit(int accNo, float amt) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].AccountNumber == accNo) {
                accounts[i].subtract(amt);
                return;
            }
        }
    }

    // Method to print details of all accounts
    void printAllAccounts() {
        System.out.println("--- Bank Account Details ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Owner: " + accounts[i].ownerName + 
                               " | Acc No: " + accounts[i].AccountNumber + 
                               " | Balance: " + accounts[i].balance());
        }
    }
}

// Main class (acting as the 'Bank' class)
public class Ass13 {
    public static void main(String[] args) {
        // Create an AccountManager
        AccountManager manager = new AccountManager();

        // Add 5 accounts
        manager.create(101, 5000.0f, "Amit");
        manager.create(102, 3000.5f, "Sumi");
        manager.create(103, 10000.0f, "Rahul");
        manager.create(104, 7500.25f, "Priya");
        manager.create(105, 1200.0f, "Vikram");

        // Perform some operations
        manager.credit(101, 500.0f);
        manager.debit(102, 1000.0f);
        manager.delete(104); // Example of deletion

        // Print details of all remaining accounts
        manager.printAllAccounts();
    }
}
