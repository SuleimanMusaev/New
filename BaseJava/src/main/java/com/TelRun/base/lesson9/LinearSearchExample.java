package com.TelRun.base.lesson9;

/**
 * Линейный поиск - поиск элемента внутри массива
 * Это простой перебор всех элементов массива и сравнение каждого элемента с искомым
 */
public class LinearSearchExample {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 7, 9, 0, 2, 5, 6, 35, 8};
        int target = 35;

        boolean isFound = linearSearch(array, target);
        System.out.println("Is element target " + target + " found is array? " + isFound);
        target = 50;
        isFound = linearSearch(array, target);
        System.out.println("Is element target " + target + " found is array? " + isFound);
    }

    private static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }

        return false;
    }
}
