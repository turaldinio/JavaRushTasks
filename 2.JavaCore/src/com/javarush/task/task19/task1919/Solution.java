package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            TreeMap<String, Double> map = new TreeMap<>();
            while (reader.ready()) {
                String line = reader.readLine();
                String[] masString = line.split(" ");
                if (map.containsKey(masString[0])) {
                    double l = map.get(masString[0]);
                    map.put(masString[0], l + Double.parseDouble(masString[1]));
                } else {
                    map.put(masString[0], Double.parseDouble(masString[1]));
                }
            }
            for(Map.Entry<String,Double>pairs:map.entrySet()){
                System.out.println(pairs.getKey()+" "+pairs.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
