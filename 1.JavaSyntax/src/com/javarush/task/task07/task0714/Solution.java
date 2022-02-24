package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < 5; a++) {
            list.add(scan.nextLine());
        }
        list.remove(2);
        for (int a = list.size() - 1; a != -1; a--) {
            System.out.println(list.get(a));
        }
    }
}
