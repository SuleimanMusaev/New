package com.TelRun.base.homeWork._05_12_24;

import com.TelRun.base.lesson1.Example;

import java.util.Scanner;

public class ExerciseWithNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверим, какое число является больше, а какое меньше.");
        System.out.println("Введите три целых числа.");

        int numberOne = getValidNumber(scanner, "Введите первое число: ");
        int numberTwo = getValidNumber(scanner, "Введите второе число: ");
        int numberThree = getValidNumber(scanner, "Введите третье число: ");

        int choice = getValidNumber(scanner, "Выберите действие: \n1 - найти максимальное число\n2 - найти минимальное число: ");

        switch (choice) {
            case 1 -> {
                int max = Math.max(numberOne, Math.max(numberTwo, numberThree));
                System.out.println("Максимальное число: " + max);
            }
            case 2 -> {
                int min = Math.min(numberOne, Math.min(numberTwo, numberThree));
                System.out.println("Минимальное число: " + min);
            }
            default -> System.out.println("Некорректный выбор! Выберите 1 или 2.");
        }
        scanner.close();
    }

    private static int getValidNumber(Scanner scanner, String prompt) {
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Ошибка! Введите корректное целое число.");
                scanner.nextLine();
            }
        }
        return number;
    }
}
