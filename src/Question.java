public class Question {
    private String text;
    private String answer;

    public Question() {
        text = "";
        answer = "";
    }

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    public void display() {
        System.out.println(text);
    }
}
