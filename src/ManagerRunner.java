import java.util.Scanner;

public class ManagerRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking employee details.
        System.out.print("\nEnter Employee number: ");
        int employeeNumber = sc.nextInt();
        sc.nextLine();

        Manager[] arr = new Manager[employeeNumber];



        for(int i=0; i<employeeNumber; i++)
        {
            System.out.print("\nEnter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter base salary: ");
            double baseSalary = sc.nextDouble();
            sc.nextLine();

            Manager manager = new Manager(name, baseSalary);
            arr[i] = manager;
            arr[i].setBonus(4000);
        }


        // printing employee details and their salary.
        System.out.print("\n\nHere are your employee details: \n");
        for(int i=0; i<employeeNumber; i++)
        {
            System.out.println(i+1 + ".Employee Name: " + arr[i].getName());
            System.out.println("  Salary: " + arr[i].getSalary());
        }

        sc.close();
    }
}