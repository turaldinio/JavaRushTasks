package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            long number = Long.parseLong(args[1]);
            long length = raf.length();
            number = number > length ? length : number;
            raf.seek(number);
            raf.write(args[2].getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
