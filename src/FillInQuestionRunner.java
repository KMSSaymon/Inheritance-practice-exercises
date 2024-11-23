import java.util.Scanner;

public class FillInQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of FillInQuestion
        FillInQuestion question = new FillInQuestion();

        // Set the question text with the answer embedded in underscores
        question.setText("The inventor of Java was _James Gosling_");

        // Display the question to the user
        question.display();

        // Prompt the user for their answer
        System.out.print("Your answer: ");
        String userResponse = scanner.nextLine();

        // Check if the user's response is correct
        if (question.checkAnswer(userResponse)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + "James Gosling");
        }

        // Close the scanner
        scanner.close();
    }
}
