package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("леопард");
        strings.add("личинка");
        strings.add("вода");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {

            if (list.get(i).contains("р") && !list.get(i).contains("л")) {
                list.remove(i);
            } else if (list.get(i).contains("л") && !list.get(i).contains("р")) {
                list.add(i + 1, list.get(i));
                i += 2;
            } else if ((list.get(i).contains("р")) && (list.get(i).contains("л"))) {
                continue;
            } else if (!((list.get(i).contains("р")) && (list.get(i).contains("л")))) {
                i++;
            } // else if (!((list.get(i).contains("р")) && (list.get(i).contains("л"))))
            //    continue;


        }
        return list;
    }
}