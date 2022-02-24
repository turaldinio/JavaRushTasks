package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            list.add(scan.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String l : result) {
            System.out.println(l);
        }

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int a = 0; a < list.size(); a++) {
            list.add(a, list.get(a));
            a++;
        }
        //напишите тут ваш код
        return list;
    }
}
