package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String a;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        while (true) {
            a = scanner.nextLine();
            bufferedWriter.write(a);
            bufferedWriter.write("\n");

            if (a.equals("exit")) {
                break;
            }
        }
        bufferedWriter.close();
    }
}
