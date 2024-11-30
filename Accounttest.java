package Solution_1_3;

public class Accounttest {

        // Data member
        private double balance;

        // Constructor to initialize balance
        public Accounttest(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance cannot be negative. Setting to 0.");
                this.balance = 0;
            }
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid withdraw amount.");
            }
        }

        // Method to check balance
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            // Create an account with an initial balance
            Accounttest myAccount = new Accounttest(1000);

            // Perform some transactions
            myAccount.deposit(1000);
            myAccount.withdraw(500);

            // Display the balance
            System.out.println("Current balance: " + myAccount.getBalance());
        }
    }


