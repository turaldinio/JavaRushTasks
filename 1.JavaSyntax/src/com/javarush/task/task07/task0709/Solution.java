package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add(scan.nextLine());
        int min = list.get(0).length();
        for (int a = 1; a < 5; a++) {
            list.add(scan.nextLine());
            if (min > list.get(a).length()) {
                min = list.get(a).length();
            }
        }

        for (
                String f : list) {
            if (f.length() == min) {
                System.out.println(f);
            }
        }
    }


}
