package com.TelRun.base.lesson6;

/**
 * Строки друг с другом сравниваются через метод equals
 * посимвольно на эквивалентность
 *
 * при сравнении строк equals всегда нужно вызывать у точно известного значения,
 * иначе есть риск NPE
 */
public class StringEqualsExample {

    public static void main(String[] args) {
        System.out.println("Say something: ");
        String userWord = null;
        boolean equalsHello = isEquals(userWord);
        if (equalsHello) {
            System.out.println("Hi User");
        }

    }

    private static boolean isEquals(String value) {
        //null.equals("Hello") - NPE
        //"Hello".equals(null) - false
        if ("Hello".equals(value)) {//(value.equals("Hello"))
            return true;
        }
        return false;
    }
}
