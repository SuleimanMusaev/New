package com.TelRun.base.lesson5;

import java.util.Scanner;

/**
 * == - оператор сравнения JAVA
 *      if(условие) {
 *          //тело условия, выполняемый код (блок )
 *      }
 * если условие в () истина, то выполняется код в теле условия, иначе просто проходим мимо
 */

public class ExampleIf {

    public static void main(String[] args) {
        System.out.println("Please, input number 1:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == 1) { //true or false
            System.out.println("Your input is correct! ");
        }

        System.out.println("Bye!");
        scanner.close();
    }
}
