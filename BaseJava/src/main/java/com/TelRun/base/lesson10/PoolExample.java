package com.TelRun.base.lesson10;

/**
 * Stack
 * |                                            |
 * |                                            |
 * |                                            |
 * ||
 * |main  |
 * <p>
 * Heap:
 *      ------String pool----------
 *         #FFEE00 : "Cat"
 *      ---------------------------
 * #AAHH00
 *
 * Когда создаются строка через " = ", пример String one = "Cat"
 *
 * Когда создается строка через new, строка создается не в пуле уникальных строк
 *
 * Когда мы сравниваем объекты через ==, то мы сравниваем ссылки на объекты,
 * но две строки с одним и тем же содержанием могут быть разными объектами, поэтому
 * строки всегда сравнивают через метод equals() !!!
 *
 * Метод equals() сравнивает строки посимвольно на эквивалетность, в то время как == сравнивает ссылки в памяти
 */
public class PoolExample {

    public static void main(String[] args) {
        String one = "Cat";
        String two = "Cat";
        String three = "Cat";
        System.out.println("one == two " + (one == two));

        String four = new String("Cat");
        System.out.println(four);

        System.out.println("one == four " + (one == four));

        System.out.println("one == four " + (one.equals(four)));

        if (one.equals(four)) {
            System.out.println("They are equals");
        }
    }
}
