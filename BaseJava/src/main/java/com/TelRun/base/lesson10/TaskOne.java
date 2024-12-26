package com.TelRun.base.lesson10;


/**
 * Task one:
 * Написать метод, принимающий две строки, объеденяющий их
 * в одну строку и вернуть эту строку в обратном порядке
 * <p>
 * concatReversString(String one, String two)
 * <p>
 * Task Two:
 * char[] arr = {'I','L','i','k','?',' ','J','a','v','a'}
 * * Написать метод, который сделает из него строку и перед этим
 * * в этом методе заменить ? на e
 */
public class TaskOne {

    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'L', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        System.out.println(changer(arr));
    }

    private static String changer(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                sb.append('e');
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
