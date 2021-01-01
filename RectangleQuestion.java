
import java.util.Random;

public class RectangleQuestion {

    private int width;
    private int height;
    private String type;

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


    public RectangleQuestion(int width, int height, String type){

        this.width = width;
        this.height = height;
        this.type = type;

    }

    public void generateQuestion(){

            System.out.print(this.toString());

    }

    public int areaCount(int answer){

        int areaCount = 0;
        if(this.toString().contains("Area")){
            areaCount++;
        }
        return areaCount;

    }

    public int perimeterCount(int answer){

        int perimeterCount = 0;

        if(this.toString().contains("Perimeter")){
            perimeterCount++;
        }
        return perimeterCount;


    }




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


    public String toString(){
        return "The " + type + " of a " + width + " x " + height + " rectangle is: ";
    }

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