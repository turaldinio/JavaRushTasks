package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintSream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintSream);
        testString.printSomething();
        System.setOut(oldPrintStream);
        for (byte g : byteArrayOutputStream.toByteArray()) {
            char l = (char) g;
            if(Character.isDigit(l)){
                System.out.print(l);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
