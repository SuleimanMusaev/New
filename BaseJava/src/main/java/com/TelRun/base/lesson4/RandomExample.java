package com.TelRun.base.lesson4;

import java.util.Random;

/**
 * Когда в переменную записали примитивное значение, обращаемся к этой переменной
 *
 * Когда в переменную записали ссылочное значение (созданное через new),
 * тогда переменная хранит не значение, а ссылку на объект
 * Используем фразу - обращаемся к этому объекту, вызываем у этого объекта
 */
public class RandomExample {

    public static void main(String[] args) {
        //Random - это класс дял генерации случайного числа
        Random random = new Random();
        //Случайное целое число в диапазоне инта
        int numberOne = random.nextInt();
        System.out.println("Random int = " + numberOne);

        //Случайное целое число в диапозоне -100 - 100
        int numberTwo = random.nextInt(-100, 100 );
        System.out.println("Random int = " + numberTwo);

        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
    }
}
