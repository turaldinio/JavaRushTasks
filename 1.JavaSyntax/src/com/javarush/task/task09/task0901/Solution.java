package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        method2();
        //напишите тут ваш код
    return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();

        method3();
        //напишите тут ваш код
        return stackTraceElements;

    }

    public static StackTraceElement[] method3() {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();

        method4();
        //напишите тут ваш код
        return stackTraceElements;

    }

    public static StackTraceElement[] method4() {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();

        method5();
        //напишите тут ваш код
        return stackTraceElements;

    }

    public static StackTraceElement[] method5() {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();

        //напишите тут ваш код
        return stackTraceElements;

    }
}
