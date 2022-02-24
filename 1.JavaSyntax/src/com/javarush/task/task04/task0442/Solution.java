package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        while (true) {
            if (b == -1) {
                sum -= 1;
                break;
            }
            sum += b;
            b = scan.nextInt();
        }
        System.out.println(sum);
    }
}
