package com.example.demo;



public class Array2d {
    public static void main (String[] args) {

          //i Form  

        // String[][] cars = new String[3][3];
        // cars[0][0] = "Camaro";
        // cars[0][1] = "Mustang";
        // cars[0][2] = "Challenge";
        // cars[1][0] = "Corvette";
        // cars[1][1] = "Ferrari";
        // cars[1][2] = "F-250";
        // cars[2][0] = "Porche";
        // cars[2][1] = "Lambo";
        // cars[2][2] = "Tesla";

        // for(int i = 0 ; i<cars.length ; i++){
        //     System.out.println();
        //     for(int j=0;j<cars[i].length; j++ ){
        //         System.out.print(cars[i][j]+" ");
        //     }
        // }

        

        //2  Form
        String[][] cars = {
                            {"Camaro","Mustang","Challenge"},
                            {"Corvette","Ferrari","F-250"},
                            {"Porche","Lambo","Tesla"}
                          };



        for(int i = 0 ; i<cars.length ; i++){
            System.out.println();
            for(int j=0;j<cars[i].length; j++ ){
                System.out.print(cars[i][j]+" ");
            }
        }
    };
}
