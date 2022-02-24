package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name1 = scanner.nextLine();
        if (name.equalsIgnoreCase(name1)) {
            System.out.println("Имена идентичны");
        } else {
            if (name.length() == name1.length()) {
                System.out.println("Длины имен равны");

            }
        }
    }
}
