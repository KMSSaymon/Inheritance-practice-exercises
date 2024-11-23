public class Instructor extends Person {
    private double salary;

    // Constructor
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);  // Call the superclass (Person) constructor
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
