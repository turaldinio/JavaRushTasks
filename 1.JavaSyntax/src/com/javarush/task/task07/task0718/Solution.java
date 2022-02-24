package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            list.add(scan.nextLine());
        }
        for (int a = 0; a < list.size() - 1; a++) {
            if (list.get(a + 1).length() < list.get(a).length()) {
                System.out.println(a+1);
                return;
            }
        }


    }
}

