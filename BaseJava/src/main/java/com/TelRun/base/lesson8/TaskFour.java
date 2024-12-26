package com.TelRun.base.lesson8;

import java.util.Random;

public class TaskFour {

    public static void main(String[] args) {
        Random random = new Random();
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int i = random.nextInt(0, days.length);
        System.out.println(days[i]);

        for (int j = 0; j <100; j++) {
            int x = random.nextInt(0, days.length);
            System.out.println(days[x]);
        }
    }
}
