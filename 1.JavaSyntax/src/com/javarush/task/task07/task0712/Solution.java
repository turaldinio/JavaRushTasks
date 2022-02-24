package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int max = 0;
        ArrayList<String> list = randomizer();
//        for (int i = 0; i < 10; i++) {
//            list.add(reader.readLine());
//        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(max).length() < list.get(i).length()) {
                max = i;
            }
            if (list.get(min).length() > list.get(i).length()) {
                min = i;
            }
        }
        if (max < min) {
            System.out.println(list.get(max));
        } else
            System.out.println(list.get(min));
    }

    public static ArrayList<String> randomizer() {
        ArrayList<String> list = new ArrayList<>();
        int p = 0;
        String[] mas = {"q", "w", "e", "r", "i", "y", "u", "o", "p", "a", "s", "d", "f", "g", "h",
                "j", "k", "l", ";", "z", "x", "c", "v", "b", "n", "m", ",", ".", "1", "2", "3", "4", "5"};
        String result = new String();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * mas.length);

            while (p != a) {
                result += mas[(int) (Math.random() * mas.length)];
                p++;
            }
            list.add(result);
            result = new String();
            p = 0;
        }
        return list;
    }
}
