package com.TelRun.base.lesson8;

public class TaskFive {

    public static void main(String[] args) {
        int m = 5;
        int[] array = {1, 2, 3, 5};
        int[] ints = new int[5];

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            ints[temp - 1] = temp;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                System.out.println("\nWe found element " + (i + 1));
                ints[i] = i + 1;
                break;
            }
        }
    }
}
