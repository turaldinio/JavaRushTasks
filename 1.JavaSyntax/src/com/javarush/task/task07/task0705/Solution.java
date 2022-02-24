package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] fitsMas = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < fitsMas.length; a++) {
            fitsMas[a] = scan.nextInt();
        }
        int secondMas[] = new int[10];
        int threadMas[] = new int[10];
        secondMas = Arrays.copyOf(fitsMas, fitsMas.length / 2);
        int thredMas[] = Arrays.copyOfRange(fitsMas, fitsMas.length / 2, fitsMas.length);
        for (int h : thredMas) {
            System.out.println(h);
        }
    }
}
