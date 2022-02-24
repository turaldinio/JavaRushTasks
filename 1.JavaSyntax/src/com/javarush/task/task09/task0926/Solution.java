package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> mas = new ArrayList<>();
        mas.add(new int[5]);
        mas.add(new int[2]);
        mas.add(new int[4]);
        mas.add(new int[7]);
        mas.add(new int[0]);
        //напишите тут ваш код

        return mas;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
