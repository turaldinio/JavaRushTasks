package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getClassName()+ ":" + " " + stackTraceElements[2].getMethodName() + ":" + " " + text);
        //напишите тут ваш код
    }
}
