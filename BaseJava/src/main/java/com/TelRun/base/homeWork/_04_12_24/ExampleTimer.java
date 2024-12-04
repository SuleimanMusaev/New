package com.TelRun.base.homeWork._04_12_24;

import java.util.Random;

public class ExampleTimer {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20801);
        System.out.println("Second remaining: " + n);
        int secondOnHours = n / 3600;

        if (secondOnHours > 1) {
            System.out.println("There are " + secondOnHours + " hours left");
        } else if (secondOnHours == 1) {
            System.out.println("There are is 1 hour left");
        } else {
            System.out.println("Less than an hour left");
        }
    }
}
