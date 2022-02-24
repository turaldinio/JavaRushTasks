package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String line = null;
        while (true) {
            try {
                line = readLine.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return line;
    }

    public static int readInt() {
        int a;
        while (true) {
            try {
                a = Integer.parseInt(readString());

                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");

            }
        }
        return a;
    }
}
