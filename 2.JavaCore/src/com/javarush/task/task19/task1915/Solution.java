package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = System.out;
            PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
            System.setOut(newPrintStream);
            testString.printSomething();
            System.setOut(printStream);
            System.out.println(byteArrayOutputStream);
            FileOutputStream fileOutputStream=new FileOutputStream(fileName);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.close();


        } catch (Exception wx) {
            wx.printStackTrace();
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

