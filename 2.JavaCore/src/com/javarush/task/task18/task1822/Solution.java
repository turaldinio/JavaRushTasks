package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader(scan.nextLine()))
        ) {
            while (reader.ready()) {
                String text = reader.readLine();
                if (text.startsWith(args[0]+" ")) {
                    System.out.println(text);
                    break;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}


