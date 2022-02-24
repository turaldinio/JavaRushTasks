package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = System.out;
        PrintStream newPrintStream = new PrintStream(outputStream);
        System.setOut(newPrintStream);
        testString.printSomething();
        System.setOut(printStream);
        String result=outputStream.toString().toUpperCase();
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
