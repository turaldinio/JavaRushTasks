package com.javarush.task.task04.task0416;

import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double minute = scan.nextDouble();
        double green = 3;
        double yellow = 4;
        double red = 5;
        minute = minute % 5;

        if (minute < green) {
            System.out.println("зелёный");
        } else if (minute < yellow) {
            System.out.println("жёлтый");
        } else if (minute < red) {
            System.out.println("красный");
        }

    }
}

