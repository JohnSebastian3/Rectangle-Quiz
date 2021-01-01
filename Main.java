
// This program asks the user for the answer to questions about the perimeter and area of a rectangle. They are calculated using integers.


import java.sql.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Here we ask the user how many questions long they want the quiz to be
        System.out.print("How many questions would you like to answer? ");
        Scanner questions = new Scanner(System.in);
        int numberOfQuestions = questions.nextInt();

        Scanner answers = new Scanner(System.in);

        QuizInterface quiz = new QuizInterface(numberOfQuestions, answers);

        quiz.quizStart();


    }
}
