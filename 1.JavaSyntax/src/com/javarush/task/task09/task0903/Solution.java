package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/


public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method2();
        return stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        method3();
        return stackTraceElements[2].getLineNumber();

    }

    public static int method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        method4();
        return stackTraceElements[2].getLineNumber();

    }

    public static int method4() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method5();
        return stackTraceElements[2].getLineNumber();

    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements[2].getLineNumber();

    }
}
