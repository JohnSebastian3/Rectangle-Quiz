package com.company;
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

    public String generateQuestion(int numberOfQuestions){

        

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
