public class Question2 {
    private String text;   // Question text
    private String answer; // Correct answer

    public Question2() {
        text = "";
        answer = "";
    }

    public void setText(String questionText) {
        text = questionText;
    }

    // Method to add text to the question
    public void addText(String additionalText) {
        text += additionalText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    public void display() {
        System.out.println(text);
    }
}
