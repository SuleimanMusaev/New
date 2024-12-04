package com.TelRun.base.lesson5;

import java.util.Scanner;

/**
 * if (условия) {
 * код, выполняемый если условие в круглых скобках истина
 * } else {
 * код, выполняемый если условие в круглых скобках ложь
 * }
 */
public class ExampleIfElse {

    public static void main(String[] args) {
        System.out.println("Please, input number 1:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if (data == 1) {
            System.out.println("Your input is correct");
        } else {
            System.out.println("Your input is incorrect");
        }
        scanner.close();
    }
}
