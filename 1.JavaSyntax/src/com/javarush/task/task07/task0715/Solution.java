package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.List;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size()+1; i++) {
            if (i == 0) {
                continue;
            }
            if (i %2 != 0) {
                list.add(i,"именно");
            }
        }
        for (String l : list) {
            System.out.println(l);
        }
    }
}
