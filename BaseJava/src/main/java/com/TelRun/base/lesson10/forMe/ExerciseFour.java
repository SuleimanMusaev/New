package com.TelRun.base.lesson10.forMe;

import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Определим является ли год високосным");
        System.out.print("Введите год: ");
        int years = scanner.nextInt();

        System.out.println("Вы ввели год: " + years);

        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        scanner.close();
    }
}
