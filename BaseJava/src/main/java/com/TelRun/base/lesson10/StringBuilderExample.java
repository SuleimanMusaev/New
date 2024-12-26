package com.TelRun.base.lesson10;

/**
 * StringBuilder - нужен для того чтобы работать с изменениями в строке,
 * добавлять к строке, удалять из строки, заменять что-то в строке
 * без создания
 *
 * Внутри строки лежит массив байт
 * Внутри стринг билдера тоже массив, когда мы добавляем что-то к строке
 * мы добавляем это в массив
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.append(" ").append("class!!").append(" Ok!");
        String result = sb.toString();
        sb.delete(3,6);
        sb.reverse();
        System.out.println(result);
    }
}
