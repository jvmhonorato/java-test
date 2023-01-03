package com.example.demo;

public class Array {
    public static void main (String[] args) {

        // String[] cars = {"Camaro", "Corvette", "Tesla","Ferrari"};

        // cars[0] = "Mustang";

        // System.out.println(cars[2]);


        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);

            //while i be less a cars.length  executs elements of array list
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    };
}
