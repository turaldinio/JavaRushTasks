package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "Windows-1251"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "UTF-8"))
        ) {
            while (reader.ready()) {
                writer.write(reader.readLine());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
