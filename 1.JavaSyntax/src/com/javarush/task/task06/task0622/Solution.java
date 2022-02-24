package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mas);
        for(int g:mas){
            System.out.println(g);
        }
        //напишите тут ваш код
    }
}
