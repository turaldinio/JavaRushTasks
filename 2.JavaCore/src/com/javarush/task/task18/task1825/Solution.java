package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("/Users/niklaus/Desktop/Данные");
             FileOutputStream fileOutputStream = new FileOutputStream("/Users/niklaus/Desktop/Пусто",true)) {
            byte[]mas=new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                int count=inputStream.read(mas);
                fileOutputStream.write(mas,0, count);
                fileOutputStream.flush();
            }
        }
        try (FileInputStream inputStream = new FileInputStream("/Users/niklaus/Desktop/Привет");
             FileOutputStream outputStream = new FileOutputStream("/Users/niklaus/Desktop/Пусто",true)
        ) {
            byte[]mas=new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                int count=inputStream.read(mas);
                outputStream.write(mas,0, count);
                outputStream.flush();
            }
        }
    }
}
