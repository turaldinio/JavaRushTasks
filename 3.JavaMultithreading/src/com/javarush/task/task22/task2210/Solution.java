package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String[] mas = getTokens("Привет как твои дела", " ");
        for (String l : mas) {
            System.out.println(l);
        }
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] mas = new String[stringTokenizer.countTokens()];
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            mas[count] = stringTokenizer.nextToken();
            count++;
        }
        return mas;
    }
}
