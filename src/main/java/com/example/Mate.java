package com.example;

import java.util.Scanner;

public class Mate {
    public static void main (String[] args) {
      
        // double x = 3.14;
        // double y = -10;
        // double z = Math.round(x);

        // System.out.println(z);


        // see the hipotenuse
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:  ");
         x = scanner.nextDouble();

         System.out.println("Enter side y:  ");
         y = scanner.nextDouble();

         z = Math.sqrt((x*x)+(y*y));

         System.out.println("The hipotenuse is : " + z);



    }

    

   
}
