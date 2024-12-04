package com.TelRun.base.homeWork._24_12_24;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
//JVM - JAVA Virtual Machine - запускает байт код (наши приложения)
//JRE - JAVA Runtime Environment - минимальная среда выполнения JVM + lib
//JDK - JAVA Development Kit - набор инструментов для разработчиков JRE + Lib + Javac (компилятор)