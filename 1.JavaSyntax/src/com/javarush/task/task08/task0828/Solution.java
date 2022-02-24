package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Calendar calendar = Calendar.getInstance();
        Map<String, Integer> map = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        System.out.println(month + " is  the " + (map.get(month) + 1) + " month");
    }
}
