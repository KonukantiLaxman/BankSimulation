// Main class
public class BankSimulation {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("Alice", 1000);
        SavingsAccount acc2 = new SavingsAccount("Bob", 2000, 5);

        // Perform some actions
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.withdraw(2000); // fail case

        acc2.deposit(1000);
        acc2.withdraw(500);
        acc2.addInterest();

        // Show results
        acc1.showTransactions();
        acc2.showTransactions();

        System.out.println("\nFinal Balance of Alice: " + acc1.getBalance());
        System.out.println("Final Balance of Bob: " + acc2.getBalance());
    }
}
