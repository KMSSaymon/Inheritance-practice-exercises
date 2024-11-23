public class NumericQuestion extends Question {
    private double answer;

    public void setAnswer(double correctAnswer) {
        this.answer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            // Parse the response to a double
            double responseValue = Double.parseDouble(response);

            // Check if the difference is within 0.01
            return Math.abs(responseValue - answer) <= 0.01;
        } catch (NumberFormatException e) {
            // If the response is not a valid number, it is automatically incorrect
            return false;
        }
    }
}
