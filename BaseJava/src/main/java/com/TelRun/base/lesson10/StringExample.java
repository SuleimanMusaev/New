package com.TelRun.base.lesson10;

/**
 * Строка - это ссылочный тип данных - это некий объект в оперативной памяти
 * Строка - это неизменяемый объект, изменить созданную строку нельзя
 * При попытках что-то добавить к существующей строке - будет создана
 */
public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java!";

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};

        String answer = getAnswer(strings);
        System.out.println(answer);

    }

    private static String getAnswer(String[] strings) {
        String answer = "";//null
        for (int i = 0; i < strings.length; i++) {
            answer = answer + " " + strings[i];
        }
        return answer;
    }
}
