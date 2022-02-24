package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) {
        //...
        try (BufferedReader readerForFile = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(readerForFile.readLine()))
        ) {
            String line = "";
            while (reader.ready()) {
                line += reader.readLine();
            }
            StringBuilder result = getLine(line);
            System.out.println(result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) {
            return new StringBuilder();
        }
        String line = Arrays.toString(words);
        String[] masString = line.substring(1, line.length() - 1).split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String l : masString) {
            list.add(l);
        }
        Collections.sort(list);
        StringBuilder builder = new StringBuilder();
        builder.append(list.get(0));
        String firstElement = String.valueOf(builder.toString().charAt(builder.length() - 1));
        for (int b = 0; b < masString.length; b++) {
            for (int a = 0; a < masString.length; a++) {
                if (masString[a].startsWith(firstElement.toUpperCase()) && !(builder.toString().contains(masString[a]))) {
                    builder.append(" " + masString[a]);
                    firstElement = String.valueOf(masString[a].charAt(masString[a].length() - 1));

                }
            }

        }

        return builder;
    }
}
