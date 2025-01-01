package com.TelRun.base.homeWork._01_01_25;

public class TastOne {

    public static void main(String[] args) {
        int[] array = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int[] ints = new int[10];

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
