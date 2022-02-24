package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] masString = new String[10];
        int[] masInt = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < masString.length; a++) {
            masString[a] = scan.nextLine();
            masInt[a] = masString[a].length();
        }
        for (int g : masInt) {
            System.out.println(g);
        }
    }
}
