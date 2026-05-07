package service;

import model.Question;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizService {
    private ArrayList<Question> questions;

    public QuizService() {
        questions = new ArrayList<>();
        loadQuestions();
    }

    private void loadQuestions() {
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("2");
        options1.add("4");
        options1.add("6");
        options1.add("8");
        questions.add(new Question("2 + 2 = ?", options1, 2));

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("Java");
        options2.add("Python");
        options2.add("HTML");
        options2.add("C++");
        questions.add(new Question("Which is a programming language?", options2, 1));
    }

    public void startQuiz(Student student) {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestionText());

            for (int i = 0; i < q.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + q.getOptions().get(i));
            }

            System.out.print("Enter answer: ");
            int answer = sc.nextInt();

            if (answer == q.getCorrectAnswer()) {
                student.increaseScore();
            }
        }
    }
}