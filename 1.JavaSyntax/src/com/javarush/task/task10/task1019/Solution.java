package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String intString = reader.readLine();
            if (intString.isEmpty()) {
                break;
            }
            String name = reader.readLine();


            int id = Integer.parseInt(intString);
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            System.out.println(pairs.getValue() + " " + pairs.getKey());
        }
    }
}
