package com.TelRun.base.homeWork._05_12_24;

import java.util.Random;

public class ExerciseWithShop {

    public static void main(String[] args) {
        boolean isEdekaOpen;
        boolean isReweOpen;

        if (new Random().nextBoolean()) {
            isEdekaOpen = true;
            isReweOpen = false;
        } else {
            isEdekaOpen = false;
            isReweOpen = true;
        }

        String openStore = isEdekaOpen ? "EDEKA" : "REWE";

        System.out.println("Store status:");
        System.out.println("Edeka is open: " + isEdekaOpen);
        System.out.println("Rewe is open: " + isReweOpen);
        System.out.println("I can buy food at " + openStore + ".");
    }
}