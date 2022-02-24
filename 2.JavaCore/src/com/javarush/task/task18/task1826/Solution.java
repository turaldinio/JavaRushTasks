package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        String fileRead = args[1];
        String fileWrite = args[2];
        switch (args[0]) {
            case "-e":
                try (FileInputStream inputStream = new FileInputStream(fileRead);
                     FileOutputStream outputStream = new FileOutputStream(fileWrite)) {
                    while (inputStream.available() > 0) {

                        outputStream.write(inputStream.read() + 32);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case "-d":
                try (FileInputStream inputStream = new FileInputStream(fileRead);
                     FileOutputStream outputStream = new FileOutputStream(fileWrite)) {
                    while (inputStream.available() > 0) {

                        outputStream.write(inputStream.read() - 32);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }

    }

}
