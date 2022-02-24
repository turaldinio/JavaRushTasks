package com.javarush.task.task30.task3007;

/* 
Найдем число 2 в максимальной степени
*/

public class Solution {
    public static void main(String[] args) {
        // System.out.println(maxPowerOf2(140_000));   //131072
        // System.out.println(maxPowerOf2(1026));      //1024
        // System.out.println(maxPowerOf2(17));        //16
//        System.out.println(maxPowerOf2(17));
        int a = 0b11011;//13
        int b = 0b10101;//21

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println(a^b);
    }

    public static int maxPowerOf2(int x) {
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 8;
        x |= x >> 8;
        return x ^ (x >> 1);
    }
}
