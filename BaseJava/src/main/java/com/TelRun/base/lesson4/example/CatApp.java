package com.TelRun.base.lesson4.example;

import java.util.Scanner;

public class CatApp {

    public static void main(String[] args) {
        //Создание объекта на основании класса, это вызов new
        Scanner scanner = new Scanner(System.in);
        Cat catOne = new Cat("Barsik", 10);
        Cat catTeo = new Cat();
    }
}
