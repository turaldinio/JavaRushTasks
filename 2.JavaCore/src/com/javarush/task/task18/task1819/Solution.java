package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file1 = scan.nextLine();
        String file2 = scan.nextLine();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (FileInputStream inputStream1 = new FileInputStream(file1);
             FileInputStream inputStream2 = new FileInputStream(file2)) {
            while (inputStream2.available() > 0) {
                outputStream.write(inputStream2.read());
            }
            while (inputStream1.available() > 0) {
                outputStream.write(inputStream1.read());
            }


        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try (FileOutputStream outputStream1 = new FileOutputStream(file1)) {
            outputStream.writeTo(outputStream1);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
