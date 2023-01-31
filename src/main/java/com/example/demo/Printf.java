package com.example.demo;

public class Printf {
    public static void main (String[] args) {
        
        boolean MyBoolean = true;
        char myChar = '@';
        String myString = "Victor";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b",MyBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        System.out.printf("Hello %100s", myString);
        System.out.printf("You have this much money %20f", myDouble);


        //System.out.printf("This is a format string %d",123);
       // System.out.printf("%d This is a format string ",123);
    }
}
