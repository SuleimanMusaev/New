package com.TelRun.base.homeWork._04_12_24;

import java.util.Scanner;

public class ExampleCloserNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first number:");
        double m = scanner.nextDouble();
        System.out.println("Input your second number:");
        double n = scanner.nextDouble();

        double distanceM = Math.abs(m - 10);
        double distanceN = Math.abs(n - 10);

        if (distanceM < distanceN) {
            System.out.println("Number '" + m + "' is closer to 10");
        } else {
            System.out.println("Number '" + n + "' is closer to 10");
        }
        scanner.close();
    }
}
