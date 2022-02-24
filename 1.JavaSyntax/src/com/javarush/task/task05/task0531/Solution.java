package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, y, r);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int y, int o) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(y);
        list.add(o);
        Collections.sort(list);
        return list.get(0);
    }
}
