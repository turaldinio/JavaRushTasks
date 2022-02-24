package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            int tetLenght = args[2].length();
            byte[] array = new byte[tetLenght];
            raf.seek(Integer.parseInt(args[1]));

            raf.read(array, 0, tetLenght);
            String result = new String(array);
raf.seek(raf.length());
            if (result.equals(args[2])) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
