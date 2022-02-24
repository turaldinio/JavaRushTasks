package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        int space = 0;
        double siv = 0;
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String line = reader.readLine();
                char[] mas = line.toCharArray();
                for (char t : mas) {
                    if (t == ' ') {
                        space++;
                    }
                    siv++;

                }
            }
            double resut = (space / siv) * 100;
            System.out.printf("%.2f", resut);


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
