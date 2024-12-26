package com.TelRun.base.lesson9;

public class ForeachExample {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 7, 9, 0, 2, 5, 6, 35, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //foreach
        //for (<type> <mane variable> : <array>
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
