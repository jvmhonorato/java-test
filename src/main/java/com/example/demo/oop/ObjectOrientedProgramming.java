package com.example.demo.oop;

public class ObjectOrientedProgramming {
    public static void main (String[] args) {
        
            Car myCar1 = new Car();
            Car myCar2 = new Car();


            System.out.println(myCar1.model);
            System.out.println(myCar1.make);
            System.out.println();
            System.out.println(myCar2.model);
            System.out.println(myCar2.make);

            myCar1.drive();
            myCar1.brake();

    }
}
