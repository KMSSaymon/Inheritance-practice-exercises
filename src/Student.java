public class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);  // Call the superclass (Person) constructor
        this.major = major;
    }

    // Getter method for major
    public String getMajor() {
        return major;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
