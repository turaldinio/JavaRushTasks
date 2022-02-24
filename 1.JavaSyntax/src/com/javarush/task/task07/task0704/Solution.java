package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[10];
        for (int a = 0; a < 10; a++) {
            mas[a] = scan.nextInt();
        }
        for (int a = mas.length - 1; a != -1; a--) {
            System.out.println(mas[a]);
        }
        //напишите тут ваш код
    }
}

