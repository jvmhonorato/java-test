package com.example.demo.variableScope;

import java.util.Random;

public class DicerRoller {
    Random random;
    int number;
    DicerRoller(){
         random = new Random();
        
        roll();
    }
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

    
}
