package com.javarush.task.task30.task3009;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* 
Палиндром?
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        Set<Integer> set = new HashSet<>();
        for (int a = 2; a < 37; a++) {
            try {
                String result = new BigInteger(number).toString(a);
                if (result.equalsIgnoreCase(new StringBuilder(result).reverse().toString())) {
                    set.add(a);
                }
            } catch (NumberFormatException numberFormatException) {
                return set;
            }

        }

        return set;
    }
}