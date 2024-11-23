import java.util.Scanner;

public class AnyCorrectChoiceQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of AnyCorrectChoiceQuestion
        AnyCorrectChoiceQuestion question = new AnyCorrectChoiceQuestion();

        // Set the question text and multiple correct answers
        question.setText("Name a programming language commonly used in software development (e.g., one of Java, Python, or C++).");
        question.setAnswer("Java Python C++");

        // Display the question to the user
        question.display();

        // Prompt the user for their answer
        System.out.print("Your answer: ");
        String userResponse = scanner.nextLine();

        // Check if the user's response is correct
        if (question.checkAnswer(userResponse)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. Possible answers include: Java, Python, or C++.");
        }

        // Close the scanner
        scanner.close();
    }
}
