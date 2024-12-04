package com.TelRun.base.homeWork._01_12_24;

import java.util.Random;

public class TestRandom {

    int num1;
    int num2;

    public static void main(String[] args) {
        Random random = new Random();

        TestRandom testRandom = new TestRandom();
        testRandom.num1 = random.nextInt(1, 100);
        testRandom.num2 = random.nextInt(1, 100);
        System.out.println("Your first random number is: " + testRandom.num1);
        System.out.println("Your second random number is: " + testRandom.num2);
    }
}
