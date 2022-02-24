package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
        ) {
            HashMap<Integer, Integer> map = new HashMap<>();
            while (inputStream.available() > 0) {
                map.put(inputStream.read(), 1);
            }
            ArrayList<Integer> list = new ArrayList<>(map.keySet());
            Collections.sort(list);
            for(int g:list){
                System.out.print(g+" ");
            }
        }

    }
}
