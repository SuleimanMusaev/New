package com.TelRun.base.lesson6;

import java.util.Scanner;

/**         data == 1
 * answer = (expression) ? (answer when expression == true)
 *                         : (answer when expression == false);
 *
 * result = expression ? answer1 : answer2;
 * если выражение тру, то результат будет ответ1 иначе ответ2
 *
 * Analog:
 * String answer;
 * if (expression) {
 *     result = answer1;
 * } else {
 *     result = answer2
 * }
 *
 * !!! answer1 и answer2 должны быть одного типа
 */

public class TernaryExample {

    public static void main(String[] args) {
        System.out.println("1 - say hello, 2 - say bye");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        System.out.println(getWordWithTernaryOperator(data));

    }

    private static String getWord(int data){
        String answer;
        if (data == 1) {
            answer = "Hello";
        } else {
            answer = "Bye";
        }
        return answer;
    }

    private static String getWordWithTernaryOperator(int data){
        return data == 1 ? "Hello" : "Bey";
    }
}
