package com.TelRun.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppExampleTest {
    @Test
    public void testGetSum() {
        int a = 2;
        int b = 3;
        int sum = AppExample.getSum(a, b);
        //a = 2, b = 3, sim == 5!!!
        //Предполагаем что 5 == sum
        assertEquals(5, sum);
    }

    @Test
    public void testGetFullPrice() {
        int priceTrip = 5;
        int number = 2;
        int fullPirce = AppExample.getFullPrice(priceTrip, number);
        assertEquals(10, fullPirce);
    }

}