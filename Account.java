package Solution_1_3;

public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0; // Initialize balance to 0
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit the amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw the amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create an account using no-argument constructor
        Account account1 = new Account();
        account1.displayBalance();

        // Create an account using parameterized constructor
        Account account2 = new Account(1000);
        account2.displayBalance();

        // Perform deposit, withdrawal, and display operations
        account2.deposit(500); // Deposit money
        account2.withdraw(300); // Withdraw money
        account2.withdraw(2000); // Attempt to overdraw
        account2.displayBalance(); // Display the balance
    }
}
