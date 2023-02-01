package com.example.demo.oop;

public class ObjectOrientedProgramming {
    public static void main (String[] args) {
        
            /*Car myCar1 = new Car();
            Car myCar2 = new Car();


            System.out.println(myCar1.model);
            System.out.println(myCar1.make);
            System.out.println();
            System.out.println(myCar2.model);
            System.out.println(myCar2.make);

            myCar1.drive();
            myCar1.brake();
*/

       Human human = new Human("Victor", 33, 120.32);
       Human human2 = new Human("Agda", 30, 100.32);

       human2.eat();
       human.drink();

       System.out.println(human.name);
       System.out.println("Meu nome é " + human2.name + "  eu tenho " + human2.age + "  e peso "+ human2.weight + "  kilos" );
    }
}
