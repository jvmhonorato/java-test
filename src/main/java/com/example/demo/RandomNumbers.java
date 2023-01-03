package com.example.demo;

import java.util.Random;

public class RandomNumbers {
    public static void main (String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6)+1;
        double y = random.nextDouble(5);
        //boolean z = random.nextBoolean();

        System.out.println(y);

    };
}
