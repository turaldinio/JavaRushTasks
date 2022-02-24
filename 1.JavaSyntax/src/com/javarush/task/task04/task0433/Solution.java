package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 0;
        int b = 0;
        while (a != 10) {
            while (b != 10) {
                System.out.print("S");
                b++;
            }
            System.out.println("");
            a++;
            b = 0;
        }
    }
}