package com.TelRun.base.lesson10.forMe;

import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверим, является ли год високосным");
        int years = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Введите год: ");
            try {
                years = scanner.nextInt();
                System.out.println("Ваш год: " + years);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Ошибка, Вы ввели некорректное значение. Попробуйте еще раз.");
                scanner.nextLine();
            }
        }

            if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        scanner.close();
    }
}