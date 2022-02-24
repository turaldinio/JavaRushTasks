package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        String[] mas = string.split(" ");
        for (int a = 0; a < mas.length; a++) {
            String text = mas[a];
            if (text.isEmpty()){
                continue;
            }
            stringBuilder.append(Character.toString(text.charAt(0)).toUpperCase() + text.substring(1)+" ");
        }
        System.out.println(stringBuilder.toString());

        //напишите тут ваш код
    }
}
