package com.TelRun.base.lesson10.forMe;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите ваше второе целое число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (a < b){
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Ваши числа равны");
        }
        scanner.close();
    }
}
