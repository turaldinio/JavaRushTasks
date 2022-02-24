package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("guluev", "tural");
        map.put("mamedov", "agosh");
        map.put("gorodnicve", "tolya");
        map.put("asdf", "sfewsfefs");
        map.put("br", "fsdf");
        map.put("abe", "dfesdfsef");
        map.put("BWB", "ffsefsf");
        map.put("bersdfesefb", "sdf");
        map.put("fsdg4", "fesdfe");
        map.put("erb3b", "sefsdfesfse");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getValue().equalsIgnoreCase(name)) {
                count++;
            }
        }
        //напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getKey().equalsIgnoreCase(lastName)) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = (HashMap<String, String>) createMap();
        int a = getCountTheSameFirstName(map, "guluev");
        int b = getCountTheSameLastName(map, "lo");
    }
}
