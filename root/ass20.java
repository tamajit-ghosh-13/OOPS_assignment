package root;


class Account {
    int accountNumber; String holderName; float balance;
    Account(int a, String n, float b) { accountNumber = a; holderName = n; balance = b; }
}

class SavingsAccount extends Account {
    float interestRate;
    SavingsAccount(int a, String n, float b, float r) { super(a, n, b); interestRate = r; }
    void calculateYearlyInterest() { 
        System.out.println("Interest for " + holderName + ": " + (balance * interestRate / 100)); 
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int a, String n, float b) { super(a, n, b); }
}

public class ass20 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(101, "Amit", 5000, 4.5f);
        CurrentAccount c1 = new CurrentAccount(201, "Sumi", 10000);
        s1.calculateYearlyInterest();
        System.out.println("Account: " + c1.holderName + " | Balance: " + c1.balance);
    }
}