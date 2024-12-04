package com.TelRun.base.homeWork._01_12_24;

import java.util.Scanner;

public class MathApp {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: division by zero is impossible!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, input your first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Please, input your second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("addition result: " + add(numberOne, numberTwo));
        System.out.println("subtraction result: " + subtract(numberOne, numberTwo));
        System.out.println("multiplication result: " + multiply(numberOne, numberTwo));
        System.out.println("division result: " + divide(numberOne, numberTwo));

        scanner.close();
    }
}

