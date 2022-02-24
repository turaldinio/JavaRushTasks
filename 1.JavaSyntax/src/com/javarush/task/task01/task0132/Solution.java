package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        String k = String.valueOf(number);
        char[] mas = k.toCharArray();
        for (int a = 0; a < mas.length; a++) {
            sum += Character.getNumericValue(mas[a]);
        }
        //напишите тут ваш код
        return sum;
    }
}