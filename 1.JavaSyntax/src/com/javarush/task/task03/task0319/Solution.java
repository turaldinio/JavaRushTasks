package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.printf("%s получает %d через %d лет.",name,a,b);
    }
}
