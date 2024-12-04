package com.TelRun.base.lesson5;

import java.util.Scanner;

/**
 * if(условие 1) {
 *     if(условие 2) {
 *          выполняется код, когда условие 1 истина и условие 2 истина
 *     }else {
 *          выполняется код, когда условие 1 истина и условие 2 ложь
 *     }
 * } else {
 *      выполняется если условие 1 ложь
 * }
 */
public class ExampleNestedIf {

    public static void main(String[] args) {
        System.out.println("Please, input number 10:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data <= 10) {
            System.out.println("Your input is correct");
            if ((data % 2) == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        } else {
            System.out.println("Your input is incorrect");
        }

        scanner.close();
    }
}
