package ui;

import model.Student;
import service.QuizService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Student student = new Student(name);
        QuizService quiz = new QuizService();

        System.out.println("\n--- Quiz Started ---\n");

        quiz.startQuiz(student);

        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());
    }
}