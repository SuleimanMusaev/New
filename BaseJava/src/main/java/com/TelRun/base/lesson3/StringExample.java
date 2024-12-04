package com.TelRun.base.lesson3;

public class StringExample {

    public static void main(String[] args) {
        String text = "Hello, JAVA!!!";
        System.out.println(text);

        //String - это ссылочный тип данных (строки это объекты),
        //Внутри любой строки хранится набор символов
        //String text = "Hello, JAVA!!!"; 'H', 'e', 'l', 'l', 'o' и тд.
        //Строка это массив символов!

        //Строки в JAVA неизменяемые
        text = "Hello"; //при любой попытки изменить строку
        //в JAVA будет создаваться новая строка
        System.out.println(text);

        //String vs Primitive
        int count = 10; //место в памяти выделяется один раз
        count = 20;     //новое значение записывается в то же место
        count = 30;
        count = 50;
        count = 1;

        String one = "Hello!"; //выделяется место в памяти под слово Hello!
        one = "Hi!"; //будет выделено новое место в памяти под слово Hi!
        one = "Java";
        one = "Hello";
        one = "password";
        one = "";
    }
}
