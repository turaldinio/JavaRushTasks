package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream;
        boolean isUpper;
        boolean isLower;
        boolean isDigit;
        char symbol;
        int digit;
        int chek;
        do {
            isUpper = false;
            isLower = false;
            isDigit = false;
            byteArrayOutputStream = new ByteArrayOutputStream();
            for (int a = 0; a < 8; a++) {
                chek = (int) (Math.random() * 100);

                if (chek % 3 == 0) {
                    if (chek > 50) {
                        symbol = Character.toUpperCase(getSymbol());
                        isUpper = true;
                    } else {
                        symbol = Character.toLowerCase(getSymbol());
                        isLower = true;
                    }
                    byteArrayOutputStream.write(symbol);

                } else {
                    digit = getDigit();
                    isDigit = true;
                    try {
                        byteArrayOutputStream.write(String.valueOf(digit).getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
        while (!(isDigit & isLower & isUpper));

        return byteArrayOutputStream;
    }

    public static char getSymbol() {
        int random = (int) (Math.random() * (90 - 65)) + 65;
        char result = (char) random;
        return result;
    }




    public static int getDigit() {
        return (int) (Math.random() * 10);
    }


}
