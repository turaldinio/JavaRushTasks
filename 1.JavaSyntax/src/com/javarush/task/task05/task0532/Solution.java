package com.javarush.task.task05.task0532;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        if (maximum <= 0) {
            return;
        }
        int[] mas = new int[maximum];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mas);
        //напишите тут ваш код
        System.out.println(mas[maximum-1]);
    }
}
