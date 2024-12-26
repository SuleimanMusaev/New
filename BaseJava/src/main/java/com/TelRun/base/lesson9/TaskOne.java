package com.TelRun.base.lesson9;

/**
 * Написать метод, который вернет максимальный элемент массива
 */

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {1, 88, 3, 8, 7, 9, 8, 2, 5, 6, 35, 8, -5};
        System.out.println(getMax(array));
        int[] arrays = {};
        System.out.println(getMax(arrays));
        System.out.println(getMin(array));
        printIndex(array, 8);
    }

    private static int getMax(int[] array) {
        if (array.length != 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max <= array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
        return -1;
    }

    private static int getMin(int[] array) {
        if (array.length != 0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        return -1;
    }

    private static void printIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("index of element is: " + i);
            }
        }
    }
}
