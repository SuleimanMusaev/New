package com.TelRun.base.lesson8;

public class Task {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

//        System.out.println(array[1]);
//        System.out.println(array[8]);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = -1;
//            System.out.println(array[i]);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i);
//        }

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i + " array = " + array[i]);
        }

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Length of  arrayOne = " + arrayOne.length);

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i] + " ");
        }
    }
}
