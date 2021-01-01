
// This program asks the user for the answer to questions about the perimeter and area of a rectangle. They are calculated using integers.


import java.sql.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Here we ask the user how many questions long they want the quiz to be
        System.out.print("How many questions would you like to answer? ");

        // Scanner object created
        Scanner questions = new Scanner(System.in);

        // Determining how many questions we would like to answer, as well as the answers to the quiz questions.
        int numberOfQuestions = questions.nextInt();

        Scanner answers = new Scanner(System.in);

        // Creating the interface object that the user will interact with.
        QuizInterface quiz = new QuizInterface(numberOfQuestions, answers);

        // Starting the quiz.
        quiz.quizStart();


    }
}
