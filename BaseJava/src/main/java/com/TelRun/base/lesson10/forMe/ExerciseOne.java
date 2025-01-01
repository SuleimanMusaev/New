package com.TelRun.base.lesson10.forMe;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Ваше число четное");
        } else {
            System.out.println("Ваше число нечетное");
        }

        if (number > 100) {
            System.out.println("Ваше число больше 100");
        } else if (number < 100) {
            System.out.println("Ваше число меньше 100");
        } else if (number == 100) {
            System.out.println("Ваше число равна 100");
        }
        scanner.close();
    }
}

