package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int as = 0; as < a; as++) {
            for (int bs = 0; bs < b; bs++) {
                System.out.print(8);
            }
            System.out.println(" ");
        }
    }
}
