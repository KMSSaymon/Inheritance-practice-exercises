public class AnyCorrectChoiceQuestion extends Question {
    @Override
    public void setAnswer(String correctAnswers) {
        // Store all correct answers as a single space-separated string
        super.setAnswer(correctAnswers.toLowerCase()); // Convert to lowercase for case-insensitivity
    }

    @Override
    public boolean checkAnswer(String response) {
        // Split the stored correct answers into an array
        String[] correctAnswers = super.getAnswer().split(" ");

        // Convert user response to lowercase for case-insensitive comparison
        String userResponse = response.toLowerCase();

        // Check if the user's response matches any of the correct answers
        for (String correctAnswer : correctAnswers) {
            if (userResponse.equals(correctAnswer)) {
                return true;
            }
        }
        return false;
    }
}
