import java.util.Scanner;

public class BankAccountRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BasicAccount basicAccount = new BasicAccount();


        while(true)
        {
            System.out.println("\nD)eposit\tW)tihdraw\tG)et Balance\tQ)uit");
            System.out.print("Enter your response: ");
            String response = sc.next();

            if(response.equals("D") || response.equals("W"))
            {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if(response.equals("D"))
                {
                    basicAccount.deposit(amount);
                    System.out.println("Your current balance: " + basicAccount.getBalance());
                }
                else
                {
                    basicAccount.withdraw(amount);
                    System.out.println("Your current balance: " + basicAccount.getBalance());
                }
            }
            else if(response.equals("G"))
            {
                System.out.println("Your current balance: " + basicAccount.getBalance());
            }
            else if(response.equals("Q"))
            {
                sc.close();
                break;
            }
            else
            {
                System.out.println("Wrong input! Try Again.");
            }
        }
    }
}