package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сталлоне", "Сильвестр");
        map.put("Мориконе", "Энио");
        map.put("Вивальди", "Антонио");
        map.put("Белучи", "Моника");
        map.put("Гудини", "Гарри");
        map.put("Верди", "Гарри");
        map.put("Марацци", "Бруно");
        map.put("Корлионе", "Вито");
        map.put("Брацци", "Люка");
        map.put("Страдивари", "Антонио");
        removeTheFirstNameDuplicates(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        ArrayList<String> list1 = new ArrayList<>(map.values());
        for (int a = 0; a < list.size(); a++) {
            list1.remove(a);
            for (int b = 0; b < list1.size(); b++) {
                if (list.get(a).equalsIgnoreCase(list1.get(b))) {
                    removeItemFromMapByValue(map, list.get(a));
                }
            }

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        createMap();

    }
}