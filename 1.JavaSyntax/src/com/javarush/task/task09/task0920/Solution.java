package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
            } catch (Exception a) {
                a.printStackTrace();
            }
            System.out.println(i);

            //напишите тут ваш код
        }
    }
}
