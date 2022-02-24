package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int chet = 0;
        int neChet = 0;
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[15];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = scan.nextInt();
            if (a == 0) {
                chet += mas[a];
                continue;
            }
            if (a % 2 == 0) {
                chet += mas[a];
            } else {
                neChet += mas[a];
            }
        }
        if (chet > neChet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (neChet > chet) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
