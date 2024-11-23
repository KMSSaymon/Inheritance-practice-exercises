import java.util.Scanner;

public class CheckingAccountRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Checking Account Program!");

        // Create an account with an initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        CheckingAccount account = new CheckingAccount(initialBalance);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nCurrent Balance: $" + account.getBalance());
            System.out.println("Choose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                        System.out.println("Successfully deposited $" + depositAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawalAmount);
                        System.out.println("Successfully withdrew $" + withdrawalAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3: // Exit
                    System.out.println("Thank you for using the Checking Account Program!");
                    exit = true;
                    break;

                default: // Invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
