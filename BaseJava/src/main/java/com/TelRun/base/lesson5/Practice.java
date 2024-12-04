package com.TelRun.base.lesson5;

import java.util.Scanner;

/**
 * Создать переменные a, b, c, d.
 *
 * Используя блок if() нужно составить логические выражения:
 * 1) истина, если a < b && b == c
 * 2) истина, если a > b || c == d
 * 3) истина, если a != b
 */
public class Practice {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = 9;
        b = 10;
        c = 10;
        d = 10;

        if (a < b && b == c) {
            System.out.println("correct 1");
        }
        if (a > b || c == d) {
            System.out.println("Correct 2");
        }
        if (a != b) {
            System.out.println("Correct 3");
        }
    }
}
