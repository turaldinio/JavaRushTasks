package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String vesok = "количество дней в году: 366";
        String neves = "количество дней в году: 365";
        if (a % 400 == 0)
            System.out.println(vesok);
        else if (a % 100 == 0)
            System.out.println(neves);
        else if (a % 4 == 0)
            System.out.println(vesok);
        else
            System.out.println(neves);
    }
}