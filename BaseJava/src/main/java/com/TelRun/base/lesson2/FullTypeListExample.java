package com.TelRun.base.lesson2;

public class FullTypeListExample {

    public static void main(String[] args) {
        //default value 0
        byte byteNumber = 100; // -128 to 127; 8 bits
        short shortNumber = 14567; //-32768 to 32767; 16 bits
        int intNumber = 2231231; // -2billion to 2billion; 32 bits
        long longNumber = 756743735123123L; //64 bits

        //default value 0.0
        float floatNumber = 123456.1231123f; //8 before. 7 after; 32bits
        double doubleNumber = 12313123123.1232134234; //64 bits

        byte byteNumberTest = 10;
        byte byteNumberTestTwo = byteNumberTest;
        int intTest = byteNumberTest;
        long longTest = byteNumberTest;

        byte byteTest = (byte) longTest; //кастомизация, привидение типа

        //default value '\u0000'
        char charSym = 'A'; //16 bits

        //default value false
        boolean booleanType = true; //or false, = 1 bit

        //default value null
        String text = "Hello JAVA";
    }
}
