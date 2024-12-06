package com.TelRun.base.homeWork._05_12_24;

import java.util.Scanner;

public class ExerciseWithYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Узнаем, является ли год високосным");
        int years = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите год: ");
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
            System.out.println("Этот год является високосным");
        } else {
            System.out.println("Этот год не является високосным");
        }
        scanner.close();
    }
}
