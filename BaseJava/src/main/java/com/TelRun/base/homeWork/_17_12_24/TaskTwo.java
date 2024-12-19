package com.TelRun.base.homeWork._17_12_24;

import java.util.Random;

public class TaskTwo {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        array[1] = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("\nИзмененный массив");
        for (int num : array) {
            System.out.print("");
            System.out.print(num + " ");
        }
    }
}

