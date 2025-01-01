package com.TelRun.base.lesson12;

public class AppExample {

    public static void main(String[] args) {
        int ticketPriceOne = 5;
        int ticketPriceTwo = 10;
        int sum = getSum(ticketPriceOne, ticketPriceTwo);
        int people = 5;
        int fullPrice = getFullPrice(sum, people);
        System.out.println("Full trip price is: " + fullPrice);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int getFullPrice(int tripPrice, int numberOfPerson) {
        return tripPrice * numberOfPerson;
    }
}
