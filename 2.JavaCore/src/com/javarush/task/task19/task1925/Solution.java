package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String result = "";
            String a="a";
            System.out.println(a.length());
            while (reader.ready()) {
                String[] mas = reader.readLine().split(" ");
                for (String l : mas) {
                    if (l.length() > 6) {
                        result += l + ",";
                    }
                }
            }
            writer.write(result.substring(0,result.length()-1));

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
