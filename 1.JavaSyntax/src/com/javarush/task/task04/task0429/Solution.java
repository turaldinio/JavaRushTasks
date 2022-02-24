package com.javarush.task.task04.task0429;

import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int pol = 0;
        int noPOl = 0;

        if (a > 0) {
            pol++;
        } else {
            if(a<0)
            noPOl++;
        }
        if (b > 0) {
            pol++;
        } else {
            if(b<0)
            noPOl++;
        }
        if (c > 0) {
            pol++;
        } else {
            if(c<0)
            noPOl++;
        }
        System.out.printf("количество отрицательных чисел: %d, количество" +
                " положительных чисел: %d", noPOl, pol);
    }
}
