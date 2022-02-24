package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream1 = new PrintStream(outputStream);
        System.setOut(printStream1);
        testString.printSomething();
        System.setOut(printStream);
        String[] mas = outputStream.toString().split("\n");
        for (int a = 0; a < mas.length; a++) {
            if (a % 2 == 0&&a!=0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
            System.out.println(mas[a]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
