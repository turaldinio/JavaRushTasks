package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("a", new Cat("as"));
        map.put("as", new Cat("as"));
        map.put("asd", new Cat("as"));
        map.put("qw", new Cat("as"));
        map.put("q", new Cat("as"));
        map.put("wf", new Cat("as"));
        map.put("g", new Cat("as"));
        map.put("je", new Cat("as"));
        map.put("wg", new Cat("as"));
        map.put("rwh", new Cat("as"));
        //напишите тут ваш код
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pairs : map.entrySet()) {
            set.add(pairs.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
