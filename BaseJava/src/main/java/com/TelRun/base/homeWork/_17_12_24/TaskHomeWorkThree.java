package com.TelRun.base.homeWork._17_12_24;

import java.util.Random;

public class TaskHomeWorkThree {

    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
            System.out.print(array[i] +" ");
        }
        System.out.println();
        if (checkArray(array)) {
            System.out.println("Строго возрастающий");
        } else {
            System.out.println("Не строго возрастающий");
        }
    }

    private static boolean checkArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

