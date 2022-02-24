package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int max = 0;
        while (inputStream.available() > 0) {
            int a = inputStream.read();
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
        scan.close();
        inputStream.close();

    }
}
