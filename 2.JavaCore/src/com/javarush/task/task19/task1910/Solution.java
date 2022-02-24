package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter filewriter = new BufferedWriter(new FileWriter(fileName2));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                line = line.replaceAll("\\p{Punct}", "");
                filewriter.write(line);
            }

            reader.close();
            fileReader.close();
            filewriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
