package com.example.demo;

public class StringMethods {
    public static void main (String[] args) {

        String name = "Victor";
    //    boolean result = name.equalsIgnoreCase("Victor");
    //    int result = name.length();

     // 
    //    char result = name.charAt(0);

    // search for declareted caracterer
    //    int result = name.indexOf("o");
      
      //is empty? true  or false
    //    boolean result = name.isEmpty();

      //turn text lowercase
    //    String result = name.toUpperCase();

       //turn texct uppercase
    //    String result = name.toLowerCase();

      //remove spaces between
    //    String result = name.trim();
       String result = name.replace('o', 'a');

       

        System.out.println(result);

    };
}
