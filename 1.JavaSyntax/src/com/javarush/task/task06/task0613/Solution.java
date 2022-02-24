package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
for(int a=0;a<10;a++){
    new Cat();
}
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        public Cat() {
            catCount++;
        }
// Создай конструктор
    }
}
