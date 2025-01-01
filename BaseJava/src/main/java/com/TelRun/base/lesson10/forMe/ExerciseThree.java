package com.TelRun.base.lesson10.forMe;

import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int numberOne = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int numberThree = scanner.nextInt();

        int max = Math.max(numberOne, Math.max(numberTwo, numberThree));
        int min = Math.min(numberOne, Math.min(numberTwo, numberThree));

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("Все три числа равны");
        } else if (numberOne == numberTwo || numberTwo == numberThree || numberOne == numberThree) {
            System.out.println("Некоторые из чисел равны");
        } else {
            System.out.println("Все числа разные");
        }

        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);

        /*if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Первое число больше всех");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Второе число больше всех");
        } else {
            System.out.println("Третье число больше всех");
        }

        if (numberOne < numberTwo && numberOne < numberThree) {
            System.out.println("Первое число меньше всех");
        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            System.out.println("Второе число меньше всех");
        } else {
            System.out.println("Третье число меньше всех");
        }*/

        scanner.close();
    }
}
