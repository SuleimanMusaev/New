package com.TelRun.base.lesson8;

/**
 * Arrays - утильный (вспомогательный) класс, для работы с массивами
 * toString(array) - предоставление массива как строка
 * sort() - сортирует массив
 */

import java.util.Arrays;

public class ArrayExampleTwo {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String array = Arrays.toString(ints);
        System.out.println(array);

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        //int - Integer
        //boolean - Boolean
        //char - Character
        //byte - Byte
        //long - Long
        //double - Double
        //float - Float
    }
}
