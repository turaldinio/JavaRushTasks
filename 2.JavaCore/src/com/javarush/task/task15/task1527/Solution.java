package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    //http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
//        char[] masChar = url.toCharArray();
//        int count = 0;
//        for (int a = 0; a < masChar.length; a++) {
//            if (masChar[a] == '?' || masChar[a] == '=' || masChar[a] == '&') {
//                count++;
//            }
//        }
        chek(url);

    }

    public static void chek(String url) {
        String y = null;
        Double chekin = null;
        if (url.contains("obj")) {
            String osnova = url.substring(url.indexOf("?") + 1);
            String one = osnova.substring(0, osnova.indexOf("="));
            try {
                chekin = Double.valueOf(osnova.substring(osnova.indexOf("=") + 1, osnova.indexOf("&")));
            } catch (Exception exception) {
                y = osnova.substring(osnova.indexOf("=") + 1, osnova.indexOf("&"));
            }


//            osnova = osnova.substring(osnova.indexOf("&") + 1);
//            String two = osnova.substring(0, osnova.indexOf("&"));

            osnova = osnova.substring(osnova.lastIndexOf("&") + 1);
            String three = osnova.substring(0, osnova.lastIndexOf("="));
            System.out.println(one + " " + three);
            if (y == null) {
                alert(chekin);
            } else {
                alert(y);
            }
        } else {
            String osnova = url.substring(url.indexOf("?") + 1);
            String one = osnova.substring(0, osnova.indexOf("="));

            osnova = osnova.substring(osnova.indexOf("&") + 1);
            String two = osnova.substring(0, osnova.indexOf("&"));

            osnova = osnova.substring(osnova.lastIndexOf("&") + 1);
            String three = osnova.substring(0, osnova.lastIndexOf("="));
            System.out.println(one + " " + two + " " + three);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
