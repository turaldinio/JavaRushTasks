package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(50);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (number > 50 && number < 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
        //напишите тут ваш код

    }
}