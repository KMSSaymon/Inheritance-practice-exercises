import java.util.Scanner;

public class MultiChoiceQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of MultiChoiceQuestion
        MultiChoiceQuestion question = new MultiChoiceQuestion();

        // Set the question text and the correct answers
        question.setText("Name all programming languages commonly used in software development (e.g., one or more of Java, Python, C++, JavaScript).");
        question.setAnswer("Java Python C++ JavaScript");

        // Display the question to the user
        question.display();

        // Prompt the user for their answers
        System.out.print("Your answers: ");
        String userResponse = scanner.nextLine();

        // Check if the user's response is correct
        if (question.checkAnswer(userResponse)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answers are: Java, Python, C++, JavaScript.");
        }

        // Close the scanner
        scanner.close();
    }
}
