package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        StringBuilder text = new StringBuilder();
        String result = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (Exception e) {

        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                text.append(fileReader.readLine());
                result += text.reverse()+"\n";
                text.setLength(0);
            }
            System.out.println(result);

        } catch (Exception e) {

        }
    }
}
