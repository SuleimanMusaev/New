package com.TelRun.base.homeWork._10_12_42;

public class TaskHomeWork {

    public static void main(String[] args) {
        boolean check1 = checkTemperature(100, 100);
        System.out.println(check1);
        boolean check2 = checkTemperature(120, 40);
        System.out.println(check2);
    }

    private static boolean checkTemperature(int temperature1, int temperature2) {
        return (temperature1 > 100) && (temperature2 < 100);
    }
}
