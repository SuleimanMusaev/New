package com.TelRun.base.lesson12;

import java.util.Arrays;
import java.util.Random;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array));
        TaskOne taskOne = new TaskOne();
        System.out.println(taskOne.getMax(array));
    }

    public int getMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
