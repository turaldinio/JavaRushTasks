package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && b == c) {
            System.out.println(a+" "+b+" "+c);
return;
        }
        if (a == b) {
            System.out.print(a + " " + b);
            return;
        }
        if (a == c) {
            System.out.println(a + " " + c);
            return;
        }
        if (b == c) {
            System.out.println(b + " " + c);
            return;
        }

    }
}