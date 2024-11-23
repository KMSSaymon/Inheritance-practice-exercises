public class FillInQuestion extends Question {

    @Override
    public void setText(String questionText) {
        // Extract the part inside underscores as the answer
        int start = questionText.indexOf('_');
        int end = questionText.lastIndexOf('_');

        if (start != -1 && end != -1 && start < end) {
            // Set the answer
            String answer = questionText.substring(start + 1, end);
            setAnswer(answer);

            // Replace the answer with underscores in the question text
            String modifiedText = questionText.substring(0, start) + "_____" + questionText.substring(end + 1);
            super.setText(modifiedText);
        } else {
            // If no underscores found, set the text as it is
            super.setText(questionText);
        }
    }
}
