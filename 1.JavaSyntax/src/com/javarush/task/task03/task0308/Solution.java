package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int s = 1;
        for (int a = 1; a < 11; a++) {
            s *= a;
        }
        System.out.println(s);
    }
}
