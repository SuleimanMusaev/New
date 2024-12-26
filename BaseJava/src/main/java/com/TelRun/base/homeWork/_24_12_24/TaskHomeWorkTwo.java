package com.TelRun.base.homeWork._24_12_24;

import java.util.Scanner;

public class TaskHomeWorkTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int money = scanner.nextInt();
        int sumOfDays = 0;
        while (money >= 1) {
            int maxDivisor = findMaxDivisor(money);
            System.out.println("Снято: " + maxDivisor + " Осталось: " + (money - maxDivisor));
            money -= maxDivisor;
            sumOfDays++;
        }
        System.out.print("Количество требуемых дней: " + sumOfDays);
    }

    public static int findMaxDivisor(int n) {
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

