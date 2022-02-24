package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String a = null;
        while (true) {
            try {
                a = scan.nextLine();
                if (a.equals("exit")) {
                    break;
                }
                if (a.contains(".")) {
                    Double aToDouble = Double.valueOf(a);
                    print(aToDouble);

                } else {
                    if (Integer.parseInt(a) > 0 && (Integer.parseInt(a) < 128)) {
                        print(Short.valueOf(a));
                    } else {
                        if (Integer.parseInt(a) <= 0 || Integer.parseInt(a) >= 128) {
                            print(Integer.parseInt(a));
                        }
                    }
                }
            } catch (Exception exception) {
                print(a);
            }

        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
