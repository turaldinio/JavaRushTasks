package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] mas = getInts();
        Arrays.sort(mas);
        int maximum = mas[mas.length - 1];
        int minimum = mas[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[20];
        for (int a = 0; a < 20; a++) {
            try {
                mas[a] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mas;
    }

    //напишите тут ваш код
}
