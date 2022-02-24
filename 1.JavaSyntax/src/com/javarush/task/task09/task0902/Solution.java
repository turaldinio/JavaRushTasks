package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static String method1() {
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();
        method2();
        return mas[2].getMethodName();


    }

    public static String method2() {
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();
        method3();
        return mas[2].getMethodName();


    }

    public static String method3() {
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();
        method4();
        return mas[2].getMethodName();


    }

    public static String method4() {
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();
        method5();
        return mas[2].getMethodName();


    }

    public static String method5() {
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();

        return mas[2].getMethodName();

    }
}
