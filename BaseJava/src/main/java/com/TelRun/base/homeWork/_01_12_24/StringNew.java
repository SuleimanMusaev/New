package com.TelRun.base.homeWork._01_12_24;

import java.util.Locale;

public class StringNew {

    public static void main(String[] args) {
        System.out.println("I study Basic Java");
        String text = new String("I study Basic Java");
        processString(text);
    }

    public static void processString(String text) {
        char lastChar = text.charAt(text.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        boolean containsJava = text.contains("java");
        System.out.println("Строка содержит подстроку 'Java': " + containsJava);

        String replacedA = text.replace("a", "o");
        System.out.println("Строка после замены 'a' на 'o': " + replacedA);

        String upperCase = text.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCase);

        String lowerCase = text.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCase);

        String substringJava = text.substring(text.indexOf("Java"));
        System.out.println("Вырезанная строка 'Java': " + substringJava);

        //это я написал не совсем сам, но понял в принципе как работает
    }
}
