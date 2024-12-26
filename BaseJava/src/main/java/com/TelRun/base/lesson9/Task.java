package com.TelRun.base.lesson9;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {int[] array = {35, 6, -4, 5, 1, 8, 50};
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] <= array[i + 1]){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("It takes " + counter + " iterations");
    }
}
