public class TestPerson {
    public static void main(String[] args) {
        // Create instances of Student and Instructor
        Student student = new Student("Alice", 2000, "Computer Science");
        Instructor instructor = new Instructor("Dr. Smith", 1980, 75000.50);

        // Print the details of each person
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
