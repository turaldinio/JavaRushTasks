package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if(string==null){
            throw new TooShortStringException();
        }
        String[] masString = string.split("\t");
        if (masString.length < 3) {

            throw new TooShortStringException();

        }

        return masString[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        try {
            System.out.println(getPartOfString(null));
        } catch (Exception e) {

        }
    }
}
