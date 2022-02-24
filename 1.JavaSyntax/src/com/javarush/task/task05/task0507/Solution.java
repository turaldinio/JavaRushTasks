package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int chet = 0;
        double result = 0;
        double time;
        while (true) {
            time = scanner.nextDouble();
            if (time == -1) {
                break;
            }
            result += time;
            chet++;

        }
        System.out.println(result / chet);

    }
}

