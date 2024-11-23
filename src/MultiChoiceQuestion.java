public class MultiChoiceQuestion extends Question {

    @Override
    public void setAnswer(String correctAnswers) {
        // Store the correct answers as a space-separated string
        super.setAnswer(correctAnswers.trim().toLowerCase());  // Convert to lowercase for case-insensitive comparison
    }

    @Override
    public boolean checkAnswer(String response) {
        // Split the user's response into individual answers
        String[] userAnswers = response.trim().toLowerCase().split(" ");

        // Get the correct answers from the stored answer
        String[] correctAnswers = super.getAnswer().split(" ");

        // Check if the number of user's answers matches the number of correct answers
        if (userAnswers.length != correctAnswers.length) {
            return false;  // Return false if the number of answers does not match
        }

        // Sort both arrays to ensure that the order of the answers doesn't matter
        java.util.Arrays.sort(userAnswers);
        java.util.Arrays.sort(correctAnswers);

        // Compare each answer
        for (int i = 0; i < userAnswers.length; i++) {
            if (!userAnswers[i].equals(correctAnswers[i])) {
                return false;  // Return false if any answer doesn't match
            }
        }

        // If all answers are correct, return true
        return true;
    }
}
