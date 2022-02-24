package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            list.add(scanner.nextLine());
        }
        for (int a = 0; a < 13; a++) {
            String text = list.get(list.size()-1);
            list.remove(text);
            list.add(0,text);
        }
        for(String k:list){
            System.out.println(k);
        }

    }
}
