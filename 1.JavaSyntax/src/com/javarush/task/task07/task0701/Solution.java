package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[20];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = scan.nextInt();
        }

        return mas;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
