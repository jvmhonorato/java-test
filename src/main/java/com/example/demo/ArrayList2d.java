package com.example.demo;
import java.util.ArrayList;

public class ArrayList2d {
    public static void main (String[] args) {
         
        //generate array list of arry list
        ArrayList<ArrayList<String>> GroceryList = new ArrayList<>();

        ArrayList<String> bakerList = new ArrayList();
         bakerList.add("Feijao");
         bakerList.add("Arroz");
         bakerList.add("Donuts");

         ArrayList<String> produceList = new ArrayList();
         produceList.add("ferrari");
         produceList.add("porsche");
         produceList.add("bmw");

         ArrayList<String> bikeList = new ArrayList();
         bikeList.add("ferrari");
         bikeList.add("porsche");
         bikeList.add("bmw");

         GroceryList.add(bakerList);
         GroceryList.add(produceList);
         GroceryList.add(bikeList);

        // show the array of arrys
         System.out.println(GroceryList);

         //take a specific item list of array list declared
         System.out.println(GroceryList.get(0).get(1));

    };
}
