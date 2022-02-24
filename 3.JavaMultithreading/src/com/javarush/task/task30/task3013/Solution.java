package com.javarush.task.task30.task3013;

/* 
Битовые операции
*/

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = Integer.parseInt("1011011000101010111001110001011", 2);
        System.out.println(Integer.toString(number, 2));

        String result = Integer.toString(solution.resetLowerBits(number), 2);
        System.out.println(result);
    }


    public int resetLowerBits(int number) {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//        System.out.println(Integer.toBinaryString(number));
//        System.out.println(Integer.toBinaryString(number|=(number>>1)));
//        System.out.println(Integer.toBinaryString(number|=(number>>2)));
//        System.out.println(Integer.toBinaryString(number|=(number>>4)));
//        System.out.println(Integer.toBinaryString(number|=(number>>8)));
//        System.out.println(Integer.toBinaryString(number|=(number>>16)));
//        System.out.println(Integer.toBinaryString(number|=(number>>1)));


        number |= (number >> 1);
        number |= (number >> 2);
        number |= (number >> 4);
        number |= (number >> 8);
        number |= (number >> 16);
        number |= (number >> 32);
        return (number & ~(number >> 1));

    }
}