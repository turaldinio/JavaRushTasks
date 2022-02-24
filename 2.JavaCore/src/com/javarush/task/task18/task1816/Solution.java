package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        String fileName = args[0];
        try (FileReader reader = new FileReader(fileName)) {
            while (reader.ready()) {
                char sim = (char) reader.read();
                String a = String.valueOf(sim);
                if (a.matches("[a-zA-Z]")) {
                    count++;
                }
            }
            System.out.println(count);


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
