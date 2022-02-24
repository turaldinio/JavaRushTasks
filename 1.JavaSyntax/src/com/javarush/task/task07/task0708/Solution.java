package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int max = 0;
        strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 5; a++) {
            strings.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        for (int a = 0; a < strings.size(); a++) {
            if (strings.get(a).length() > strings.get(max).length()) {
                max = a;
            }
        }
        for (String l : strings) {
            if (l.length() == strings.get(max).length()) {
                System.out.println(l);
            }
        }
    }
}
