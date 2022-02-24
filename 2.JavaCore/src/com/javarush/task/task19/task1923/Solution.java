package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        String fil1 = args[0];
        String file2 = args[1];
        String textForWriting = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fil1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            while (reader.ready()) {
                String[] mas = reader.readLine().split(" ");
                for (String l : mas) {
                    if (l.matches(".*\\d+.*")) {
                        writer.write(l+" ");
                    }
                }

            }

        } catch (Exception e) {

        }
    }
}
