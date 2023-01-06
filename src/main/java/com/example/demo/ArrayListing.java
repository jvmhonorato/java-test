package com.example.demo;
import java.util.ArrayList;


public class ArrayListing {
    public static void main (String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");
        
        //set method replace the declared array key
        food.set(0, "sushi");

        //remove object declared by array key
        food.remove(2);

        //remove all array elements
        food.clear();

        for(int i=0 ; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    


    };
}
