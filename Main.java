package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int questionCount = 0;
        int areaCount = 0;
        int perimeterCount = 0;
        int heightSum = 0;
        int widthSum = 0;
        double averageWidth;
        double averageHeight;
        int correctArea = 0;
        int correctPerimeter = 0;

        for(int i = 1; i <= 15; i++){

            System.out.print("Question " + i + ". ");
            RectangleQuestion rect = new RectangleQuestion();

            System.out.print(rect.toString());

            int answer = scanner.nextInt();

            if(rect.toString().contains("Area")){
                if(answer == rect.determineAnswer()){
                    System.out.println("Correct!");
                    correctArea++;
                }else{
                    System.out.println("Incorrect!");
                }
                areaCount++;


            }else if(rect.toString().contains("Perimeter")){
                if(answer == rect.determineAnswer()){
                    System.out.println("Correct!");
                    correctPerimeter++;
                }else{
                    System.out.println("Incorrect!");
                }
                perimeterCount++;
            }

            widthSum = widthSum + rect.getWidth();
            heightSum = heightSum + rect.getHeight();
            questionCount++;

        }
        averageHeight = heightSum / questionCount;
        averageWidth = widthSum / questionCount;

        double grade = 100.0 *  (1.0 * (correctArea + correctPerimeter) / 15.0);


        System.out.println("You got " + correctArea + " correct area quesiton(s)!");
        System.out.println("You got " + (areaCount - correctArea) + " incorrect area question(s).");
        System.out.println("");
        System.out.println("You got " + correctPerimeter + " correct perimeter question(s)!");
        System.out.println("You got " + (perimeterCount - correctPerimeter) + " incorrect perimeter question(s).");
        System.out.println("Your final grade was " + grade + "!");


        System.out.println("There were " + areaCount + " area question(s) and " + perimeterCount + " perimeter question(s).");
        System.out.println("The average width was " + averageWidth + ".");
        System.out.println("The average height was " + averageHeight + ".");
    }
}
