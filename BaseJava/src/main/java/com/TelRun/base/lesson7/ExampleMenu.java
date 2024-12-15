package com.TelRun.base.lesson7;

import java.util.Scanner;

public class ExampleMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean worked = true;
        while (worked) {
            int number = scanner.nextInt();
            System.out.println("Выберите действие \n 1 - Menu \n 2 - Load \n 3 - Records \n 4 - Exit");
            switch (number) {
                case 1 -> start();
                case 2 -> load();
                case 3 -> print();
                case 4 -> worked = false;
            }
        }
    }

    public static void start() {
        System.out.println("Start");
    }

    public static void load() {
        System.out.println("Load");
    }

    public static void print() {
        System.out.println("Records");
    }
}
