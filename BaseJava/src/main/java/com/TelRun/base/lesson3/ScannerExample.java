package com.TelRun.base.lesson3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        //объект для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        //nextInt(); - чтение целого числа с консоли
        System.out.print("Please input your number: ");
        int dataFromConsole = scanner.nextInt();
        System.out.println("Your input = " + dataFromConsole);

        //next(); читает слово с консоли, вернет тип данных String
        System.out.print("Please input one word in console: ");
        String wordFromUser = scanner.next();
        System.out.println("String length = " + wordFromUser.length());

        //nextLine(); - читаем предложение с консоли от 0 до конца строки
        System.out.println("Please input your name and surname: ");
        String userData = scanner.nextLine(); // \n, \r
        System.out.println("Hello! " + userData);

        scanner.close();
    }
}
