package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int proizv = 1;
        for (int b = 0; b < mas.length; b++) {
            for (int a = 0; a < mas.length; a++) {
                System.out.print(mas[a] * proizv+" ");
            }
            System.out.println(" ");
            proizv++;
        }
    }
}
