package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        date1.setMonth(0);
        date1.setDate(0);
        Date today = new Date(date);
        long msDistance = today.getTime() - date1.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msDistance / msDay);
        return dayCount % 2 != 0;
    }
}
