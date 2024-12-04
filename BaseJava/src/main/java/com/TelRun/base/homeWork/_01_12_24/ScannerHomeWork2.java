package com.TelRun.base.homeWork._01_12_24;

import java.util.Scanner;

public class ScannerHomeWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord, secondWord;

        while (true){
            System.out.println("Please, input a word with even number of letters!");
            System.out.print("Input your first word: ");
            firstWord = scanner.nextLine();
            System.out.print("Input your second word: ");
            secondWord = scanner.nextLine();

            //этот цикл посмотрел с помощью чата GPT, в случае введения нечетного количества символом
            //выдаст ошибку и повторит цикл заново
            if (firstWord.length() % 2 == 0 && secondWord.length() % 2 ==0){
                break;
            } else {
                System.out.println("Both words must contain an even number of letters!");
            }
        }

        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() /2);
        String result = firstHalf + secondHalf;
        System.out.println("Your new word is: " + result);
    }
}