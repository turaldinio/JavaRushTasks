package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        HashMap<String, Double> hashMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            double max = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                String[] masString = line.split(" ");
                String name = masString[0];
                double price = Double.parseDouble(masString[1]);
                if (hashMap.containsKey(name)) {
                    double sum = hashMap.get(name);
                    hashMap.put(name, sum + price);
                    if (sum + price > max) {
                        max = sum + price;
                    }
                } else {
                    hashMap.put(name, price);
                    if (price > max) {
                        max = price;
                    }
                }
            }
            TreeMap<String, Double> map = new TreeMap<>(hashMap);
            for (Map.Entry<String, Double> pairs : map.entrySet()) {
                if(pairs.getValue()==max){
                    System.out.println(pairs.getKey());
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
