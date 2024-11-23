public class Person {
    private String name;
    private int yearOfBirth;

    // Constructor
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}
