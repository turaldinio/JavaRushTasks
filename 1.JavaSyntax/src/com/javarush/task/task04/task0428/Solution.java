package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[3];
        int chet = 0;
        for (int a = 0; a < mas.length; a++) {
            mas[a] = scan.nextInt();
            if (mas[a] > 0) {
                chet++;
            }
        }
        System.out.println(chet);
    }
}
