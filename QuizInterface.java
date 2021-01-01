import java.util.Scanner;

public class QuizInterface {

    // Here is the interface for the quiz. This is what the user will be interacting with.


    // All the variables needed to make calculations.
    private int numberOfQuestions;
    private Scanner scan;
    private int questionCount = 0;
    private int areaCount = 0;
    private int perimeterCount = 0;
    private int heightSum = 0;
    private int widthSum = 0;
    private double averageWidth;
    private double averageHeight;
    private int correctArea = 0;
    private int correctPerimeter = 0;
    private  int countPerimeter = 0;

    public QuizInterface(int numberOfQuestions, Scanner scan){

        this.numberOfQuestions = numberOfQuestions;
        this.scan = scan;
    }


    // Starting the quiz.
    public void quizStart(){

        for(int i = 1; i <= numberOfQuestions; i++){

            System.out.print("Question " + i + ". ");
            RectangleQuestion rectangle = new RectangleQuestion();

            rectangle.generateQuestion();

            int answer = scan.nextInt();

            correctArea = correctArea + rectangle.determineCorrectArea(answer);
            correctPerimeter = correctPerimeter + rectangle.determineCorrectPerimeter(answer);
            areaCount = areaCount + rectangle.areaCount(answer);
            perimeterCount = perimeterCount + rectangle.perimeterCount(answer);


            widthSum = widthSum + rectangle.getWidth();
            heightSum = heightSum + rectangle.getHeight();
            questionCount++;
        }

        averageHeight = 1.0 * heightSum / questionCount;
        averageWidth = 1.0 * widthSum / questionCount;

        double grade = 100.0 *  (1.0 * (correctArea + correctPerimeter) / numberOfQuestions);

        System.out.println("");
        System.out.println("==== RESULTS ====");
        System.out.println("You got " + correctArea + " correct area quesiton(s)!");
        System.out.println("You got " + (areaCount - correctArea) + " incorrect area question(s).");
        System.out.println("");
        System.out.println("You got " + correctPerimeter + " correct perimeter question(s)!");
        System.out.println("You got " + (perimeterCount - correctPerimeter) + " incorrect perimeter question(s).");
        System.out.println("\nYour final grade was " + grade + "/100!");
        System.out.println("");

        // System.out.println("There were " + correctArea());
        System.out.println("There were " + areaCount + " area question(s) and " + perimeterCount + " perimeter question(s).\n");
        System.out.println("The average width was " + averageWidth + ".");
        System.out.println("The average height was " + averageHeight + ".");

    }










}
