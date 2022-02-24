package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
            int count = 0;
            int myIndex = 0;
            char[] mas = string.toCharArray();
            for (int a = 0; a < string.length(); a++) {
                if (mas[a] == ' ') {
                    count++;
                }
                if (count == 4) {
                    myIndex = a + 1;
                }

            }
            if(count<4){
                throw new TooShortStringException();
            }
            return string.substring(string.indexOf(" ") + 1, myIndex);
        }


    public static class TooShortStringException extends RuntimeException {
    }
}
