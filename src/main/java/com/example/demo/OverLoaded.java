package com.example.demo;

public class OverLoaded {
    public static void main (String[] args) {
      
      int x = add(1,2,50,23); 
      double y = add(0.25,0.75,0.5,0.15);

    
      System.out.println(x);
      System.out.println(y);
    }

    static int add(int a, int b){
        System.out.println("This is overload method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overload method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is overload method #1");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overload method #2");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }
}
