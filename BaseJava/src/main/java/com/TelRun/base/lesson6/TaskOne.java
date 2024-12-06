package com.TelRun.base.lesson6;



import java.util.Locale;
import java.util.Scanner;

/**
 * 1) ввести с консоли день недели
 * 2) написать свич кейс, если введен понедельник, то это тяжелый день
 * 3) если введен вторник, среда, четверг, то просто работаем
 * 4) если пятница, то это веселый день
 * 5) если суббота и воскресенье, то это дни отдыха
 */
public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Напишите день недели: ");
        Scanner scanner = new Scanner(System.in);
        String days = scanner.next().toLowerCase(Locale.ROOT);

        switch (days) {
            case "monday" -> System.out.println("Тяжелый день");
            case "tuesday", "wednesday", "thursday" -> System.out.println("Работаем");
            case "friday" -> System.out.println("Радуемся");
            case "saturday", "sunday" -> System.out.println("Чилим");
            default -> System.out.println("Неправильно");
        }
        scanner.close();
    }
}
