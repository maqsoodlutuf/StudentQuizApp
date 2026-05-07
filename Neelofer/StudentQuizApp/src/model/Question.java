package model;

import java.util.ArrayList;

public class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctAnswer;

    public Question(String questionText, ArrayList<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}