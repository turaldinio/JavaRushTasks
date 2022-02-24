package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file1 = scan.nextLine();
        String file2 = scan.nextLine();
        String file3 = scan.nextLine();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileOutputStream outputStream = new FileOutputStream(file1);
             FileInputStream inputStream1 = new FileInputStream(file2);
             FileInputStream inputStream2 = new FileInputStream(file3)) {
            while (inputStream1.available() > 0) {
                byteArrayOutputStream.write(inputStream1.read());
            }
            while (inputStream2.available() > 0) {
                byteArrayOutputStream.write(inputStream2.read());
            }
            byteArrayOutputStream.writeTo(outputStream);

        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
