package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
        ) {

            char simbol = ',';
            int count = 0;
            while (inputStream.available() > 0) {
                int k = inputStream.read();
                if (k == simbol) {
                    count++;
                }

            }
            System.out.println(count);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
