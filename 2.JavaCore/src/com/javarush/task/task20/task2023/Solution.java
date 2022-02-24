package com.javarush.task.task20.task2023;

/* 
Делаем правильный вывод
*/

public class Solution {

    public static class Collection {
        public void print() {
            System.out.println("Collection");
        }
    }

    public static class Set extends Collection {
        public void print() {
            System.out.println("Set");
        }
    }

    public static class HashSet extends Set {
        public void print() {
            System.out.println("HashSet");
        }
    }

    public static void main(String[] args) {
        Collection c = new HashSet();
        c.print(); // HashSet
    }
}
