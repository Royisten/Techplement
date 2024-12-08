package WEEK_1_TASK.QuizGenerator;

import java.io.Serializable;

public class Question implements Serializable {
    private String questionText; // the question asked
    private String[] options; // multiple options displayed /1-4
    private int correctOption; // 1-4

    // constructor to create a set of question and answer with option as shown
    // above,
    // whenever an intance of "Question.java" is called
    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    // ? Display Question and Options (along with the correct option) to user
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // ? Checks if the user's answer is correct
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }

}

