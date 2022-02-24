package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] mas = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 7 | a < 1) {
            System.out.println("такого дня недели не существует");
            return;
        }
        System.out.println(mas[a-1]);
    }
}