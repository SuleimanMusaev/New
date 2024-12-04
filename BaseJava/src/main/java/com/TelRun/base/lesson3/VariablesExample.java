package com.TelRun.base.lesson3;

/**
 * Локальные переменные - переменные метода, конструктора, блока
 * - Создаются внутри методов и уничтожаются, когда методы заканчивают работу
 *
 * Переменные экземпляра - переменные объявляются вне каких либо блоков, методов, конструкторов
 * - Создаются, когда создаются объекты (экземпляры) на основании классов и уничтожаются, когда уничтожаются объекты
 *
 * Статистические переменные - переменная класса
 * - Создаются при наличии работы программы и уничтожаются при завершении работы программы
 */
public class VariablesExample {

    //Переменная экземпляра (переменная объявленная в классе)
    int count = 50;

    //Статическая переменная (переменная класса)
    static int age = 25;

    public static void main(String[] args) {
        //Локальная переменная
        //переменная внутри метода
        //переменная живет внутри {}
        int number = 10; //переменная метода main
        number = 5;
        System.out.println(number);

        //пример как осуществляется доступ к переменной экземпляра
        //VariablesExample variablesExample = new VariablesExample();
        //System.out.println(variablesExample.count);
        System.out.println(age);
    }

    private static void print() {
        //локальная переменная
        int number = 5; //переменная метода print
        System.out.println(age);
        age = 50;
    }

    private void printCount () {
        System.out.println(count);
        System.out.println(age);
    }
}
