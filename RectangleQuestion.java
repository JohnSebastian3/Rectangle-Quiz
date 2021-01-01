
import java.util.Random;

public class RectangleQuestion {

    private int width;
    private int height;
    private String type;

    // Constructor to create a random question
    public RectangleQuestion(){

        Random rand = new Random();
        int random = rand.nextInt(11) + 1;
        int random2 = rand.nextInt(9) + 1;
        boolean random3 = rand.nextBoolean();
        width = random;
        height = random2;

        if(random3){
            type = "Area";
        }else{
            type = "Perimeter";
        }


    }


    // Contstructor to create a specific type of question
    public RectangleQuestion(int width, int height, String type){

        this.width = width;
        this.height = height;
        this.type = type;

    }

    // Generator a question to the user.
    public void generateQuestion(){

            System.out.print(this.toString());

    }


    // Counting how many area questions were asked.
    public int areaCount(int answer){

        int areaCount = 0;
        if(this.toString().contains("Area")){
            areaCount++;
        }
        return areaCount;

    }

    // Counting how many perimeter questions were asked.
    public int perimeterCount(int answer){

        int perimeterCount = 0;

        if(this.toString().contains("Perimeter")){
            perimeterCount++;
        }
        return perimeterCount;


    }



    // Determining how many correct area questions the user got.
    public int determineCorrectArea(int answer){

        int correctArea = 0;


        if(this.toString().contains("Area")){
            if(answer == determineAnswer()){
                System.out.println("Correct!");
                correctArea++;
            }else{
                System.out.println("Incorrect! The correct answer was " + determineAnswer());
            }

        }
        return correctArea;
    }


    // Determining how many correct perimeter questions user got.
    public int determineCorrectPerimeter(int answer){

        int correctPerimeter = 0;


        if(this.toString().contains("Perimeter")){
            if(answer == this.determineAnswer()){
                System.out.println("Correct!");
                correctPerimeter++;
            }else{
                System.out.println("Incorrect! The correct answer was " + determineAnswer());
            }

        }
        return correctPerimeter;

    }


    // Getters and setters below
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    // Printing question to user once method is called.
    public String toString(){
        return "The " + type + " of a " + width + " x " + height + " rectangle is: ";
    }

    // Determining correct answer of question.
    public int determineAnswer(){
        int answer;
        if(type.equals("Area")){
            answer = width * height;
        }else{
            answer = (2 * width) + (2 * height);
        }
        return answer;
    }




}
