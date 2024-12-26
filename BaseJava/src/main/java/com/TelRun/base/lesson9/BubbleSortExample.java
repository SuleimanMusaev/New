package com.TelRun.base.lesson9;

import java.util.Arrays;

/**
 * 35, 6, 4, 5, 1, 8, 50
 * 6, 35, 4, 5, 1, 8, 50
 * 6, 4, 35, 5, 1, 8, 50
 * 6, 4, 5, 35, 1, 8, 50
 * 6, 4, 5, 1, 35, 8, 50
 * 6, 4, 5, 1, 8, 35, 50
 * <p>
 * 6, 4, 5, 1, 8, 35, 50
 * 4, 6, 5, 1, 8, 35, 50
 * 4, 5, 6, 1, 8, 35, 50
 * 4, 5, 1, 6, 8, 35, 50
 * <p>
 * Time complexity 0(n^2) - n количество элементов
 */
public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = {35, 6, 4, 1, 5, 3, 50};
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {//-1 чтоб не было ошибки
                //int elementBefore = array[i]; //35 // 6 //4 //5 //8 //1 //50
                //int elementAfter = array[i + 1]; //6 //4 //5 //8 //1 //50 //Index of Bound
                //if (elementBefore >= elementAfter) {
                if (array[i] >= array[i + 1]) {
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
