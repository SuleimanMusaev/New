package com.TelRun.base.lesson4;

public class RandomWithMath {

    public static void main(String[] args) {

        int min = 10;
        int max = 100;
        double resultTwo = Math.random() * (max - min + 1) + min;
        System.out.println("Your result: " + resultTwo);

        //(int) - явное приведение типа
        int result = (int) (Math.random() * (max-min+1) + min);
        System.out.println("Your result: " + result);
    }
}
