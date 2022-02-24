package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < 10; a++) {
            list.add(scan.nextInt());
        }
        for (int a = list.size()-1; a != -1; a--) {
            System.out.println(list.get(a));
        }
        //напишите тут ваш код
    }
}
