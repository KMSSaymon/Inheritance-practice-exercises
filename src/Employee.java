public class Employee {

    private String name;
    private double baseSalary;

    // setter method for employee name.
    public void setName(String newName)
    {
        name = newName;
    }

    // setter method for baseSalary.
    public void setBaseSalary(double newSalary)
    {
        baseSalary = newSalary;
    }

    // getter method for employee name.
    public String getName()
    {
        return name;
    }

    // getter method for employee salary.
    public double getSalary()
    {
        return baseSalary;
    }
}