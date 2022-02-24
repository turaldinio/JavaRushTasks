package com.javarush.task.task19.task1914;

import java.io.*;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);
        testString.printSomething();
        System.setOut(printStream);
        String operation = byteArrayOutputStream.toString().replaceAll("\n", "");
        String[] masString = operation.split(" ");
        int sum = 0;
        if (operation.contains("+")) {
            sum = Integer.parseInt(masString[0]) + Integer.parseInt(masString[2]);


        } else if (operation.contains("-")) {
            sum = Integer.parseInt(masString[0]) - Integer.parseInt(masString[2]);

        } else {

            sum = Integer.parseInt(masString[0]) * Integer.parseInt(masString[2]);

        }
        System.out.println(operation + sum);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 =");
        }
    }
}
