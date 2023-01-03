package com.example.demo;

import java.util.Scanner;

public class WhileLoops {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        //1 form

        // while(name.isBlank()){
        //     System.out.println("Enter your name: ");
        //     name = scanner.nextLine();

        // }
        // System.out.println("Hello "+name);


        //2 form
        
        do{
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }while(name.isBlank());
        System.out.println("Hello "+name);
    };
}
