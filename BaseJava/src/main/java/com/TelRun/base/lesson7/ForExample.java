package com.TelRun.base.lesson7;


import java.util.Scanner;

/**
 * Цикл - это конструкция, которая обеспечивает многократное выполнение кода,
 * который помещен в эту конструкцию.
 * <p>
 * for
 * while (while(conditional) {code to execute})
 * do-while (do {//code to execute }) while();
 * foreach (вариация цикла for)
 *
 * Переменная, объявленная внутри цикла, доступна только внутри этого цикла
 * за пределами ее не будет видно.
 *
 * break - немедленно прерывает выполнение цикла.
 * continue - пропускает код, который находится внутри цикла, после этого оператора
 * и переходит к следующей итерации цикла.
 *
 * Цикл for and while перед тем как выполняется первый раз,
 * всегда проверяют на соответствие условия и возможность выполнения.
 *
 * do-while тело выполнится минимум один раз, так как проверка условия идет в конце цикла.
 */
public class ForExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        printNumber(number);
        System.out.println(" ");
        printTwo(number);
        System.out.println(" ");
        printRiverse(number);
    }

    public static void printNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("Число: " + i);
        }
    }

    public static void printTwo(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println("Число по остатку на 2 " + i);
            }
        }
    }

    public static void printRiverse(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}


