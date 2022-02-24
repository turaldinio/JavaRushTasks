package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("as");
        list.add("as");
        list.add("as");
        list.add("as");
        list.add("as");
        System.out.println(list.size());
        for (int a = 0; a < list.size(); a++) {
            System.out.println(list.get(a));
        }
    }
}
