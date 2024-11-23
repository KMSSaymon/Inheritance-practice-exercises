import java.util.Scanner;

public class NumericQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of NumericQuestion
        NumericQuestion question = new NumericQuestion();

        // Set the question text and answer
        question.setText("What is 3.14 rounded to two decimal places?");
        question.setAnswer(3.14);

        // Display the question to the user
        question.display();

        // Prompt the user for their answer
        System.out.print("Your answer: ");
        String userResponse = scanner.nextLine();

        // Check if the user's response is correct
        if (question.checkAnswer(userResponse)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is close to 3.14.");
        }

        // Close the scanner
        scanner.close();
    }
}
