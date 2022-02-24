package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qw", 3625);
        map.put("q", 2);
        map.put("qwe", 325);
        map.put("qerh", 1234);
        map.put("whqb", 2341);
        map.put("av34g", 234);
        map.put("23r    2", 4);
        map.put("ergw", 123443);
        map.put("qwg", 1234);
        map.put("qweg", 14);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        HashMap<String, Integer> map1 = new HashMap<>(map);
        for (Map.Entry<String, Integer> pairs : map1.entrySet()) {
            if (pairs.getValue() < 500) {
                map.remove(pairs.getKey(), pairs.getValue());
            }
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}