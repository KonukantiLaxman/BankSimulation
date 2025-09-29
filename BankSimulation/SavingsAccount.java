// Child class extending BankAccount
public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance); // calling parent constructor
        this.interestRate = interestRate;
    }

    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal denied! Not enough balance.");
            transactions.add("Failed withdrawal: " + amount);
        } else {
            super.withdraw(amount); // use parent method
        }
    }

    // Add interest to balance
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        transactions.add("Interest added: " + interest + " | Balance: " + balance);
    }
}
