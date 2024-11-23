import java.time.LocalDate;

public class CheckingAccount {
    private double balance;
    private int overdraftsThisMonth;
    private LocalDate lastOverdraftDate;

    // Constructor
    public CheckingAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        this.overdraftsThisMonth = 0;
        this.lastOverdraftDate = LocalDate.now(); // Initialize to the current date
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw method with overdraft penalties
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        // Check if it's a new month
        LocalDate today = LocalDate.now();
        if (lastOverdraftDate.getMonthValue() != today.getMonthValue()) {
            overdraftsThisMonth = 0; // Reset overdrafts for the new month
        }

        // Perform the withdrawal
        balance -= amount;

        // Check for overdraft
        if (balance < 0) {
            overdraftsThisMonth++;
            lastOverdraftDate = today;

            // Apply penalty based on the number of overdrafts this month
            if (overdraftsThisMonth == 1) {
                balance -= 20; // First overdraft penalty
                System.out.println("First overdraft this month. $20 penalty applied.");
            } else {
                balance -= 30; // Subsequent overdraft penalty
                System.out.println("Additional overdraft this month. $30 penalty applied.");
            }
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}
