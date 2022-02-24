package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            list.add(0, scan.nextLine());
        }
        for (int a = 0; a < list.size(); a++) {
            System.out.println(list.get(a));
        }

    }
}
