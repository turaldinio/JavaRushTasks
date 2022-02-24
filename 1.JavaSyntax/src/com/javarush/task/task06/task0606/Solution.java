package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char[] mas = a.toCharArray();
        int y = Character.getNumericValue(mas[0]);
        for (int f = 0; f < mas.length; f++) {
            if (Character.getNumericValue(mas[f]) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
