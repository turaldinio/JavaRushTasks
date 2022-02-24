package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String aToString = String.valueOf(a);
        if (a < 1000 & a > 0) {
            chek(a);

        }

    }

    public static void chek(int a) {
        String aToString = String.valueOf(a);
        if (a % 2 == 0 & aToString.length() == 1) {
            System.out.println("четное однозначное число");
        }
        if (a % 2 != 0 & aToString.length() == 1) {
            System.out.println("нечетное однозначное число");
        }
        if (a % 2 == 0 & aToString.length() == 2) {
            System.out.println("четное двузначное число");
        }
        if (a % 2 != 0 & aToString.length() == 2) {
            System.out.println("нечетное двузначное число");
        }
        if (a % 2 == 0 & aToString.length() == 3) {
            System.out.println("четное трехзначное число");
        }
        if (a % 2 != 0 & aToString.length() == 3) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
