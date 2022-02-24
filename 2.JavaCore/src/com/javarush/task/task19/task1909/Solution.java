package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                line = line.replace('.', '!');
                System.out.println(line);
                writer.write(line);
            }
            fileReader.close();
            writer.close();
            reader.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
