package com.TelRun.base.lesson9.carExample;

public class CarBubbleSort {

    public static void main(String[] args) {
        Car carOne = new Car("BMW", 2.5);
        Car carTwo = new Car("Audi", 3.7);
        Car carThree = new Car("VW", 1.8);
        Car carFour = new Car("Skoda", 2.1);
        Car carFive = new Car("Seat", 1.4);
        Car[] cars = {carOne, carFive, carTwo, carFour, carThree};
        for (int j = 0; j < cars.length; j++) {
            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].price >= cars[i + 1].price) {
                    double temp = cars[i + 1].price;
                    cars[i + 1].price = cars[i].price;
                    cars[i].price = temp;
                }
            }
        }
        System.out.println("Сортировка по цене");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Модель: " + cars[i].model + " Цена: " + cars[i].price);
        }
        for (int j = 0; j < cars.length; j++) {
            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].model.compareTo(cars[i + 1].model) > 0) {
                    Car temp = cars[i];
                    cars[i] = cars[i +1];
                    cars[i + 1] = temp;
                }
            }
        }
        System.out.println("Сортировка по алфавиту");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Модель: " + cars[i].model + " Цена: " + cars[i].price);
        }
    }
}
