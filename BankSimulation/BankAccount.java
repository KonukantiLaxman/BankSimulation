import java.util.ArrayList;
import java.util.List;

// Parent class
public class BankAccount {
    protected String accountHolder;
    protected double balance;
    protected List<String> transactions;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount + " | Balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            transactions.add("Failed Withdrawal: " + amount);
            System.out.println("Insufficient funds!");
        }
    }

    // Show balance
    public double getBalance() {
        return balance;
    }

    // Show transaction history
    public void showTransactions() {
        System.out.println("\nTransaction History of " + accountHolder + ":");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
