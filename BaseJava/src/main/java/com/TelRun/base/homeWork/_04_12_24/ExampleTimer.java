package com.TelRun.base.homeWork._04_12_24;

import java.util.Scanner;

public class ExampleTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your first number");

        double m = scanner.nextDouble();
        double n = scanner.nextDouble();

        double distanceM = Math.abs(m - 10);
        double distanceN = Math.abs(n - 10);

        if (distanceM < distanceN){
            System.out.println("Число" + m + "ближе к 10");
        } else {
            System.out.println("Число" + n + "ближе к 10");
        }
    }
}
