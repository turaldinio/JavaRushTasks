package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n == 1||n==0) {
            return String.valueOf(1);
        }
        if (n < 0) {
            return String.valueOf(0);
        }
        BigInteger sum = new BigInteger(String.valueOf(n));
        for (int a = 1; a < n; a++) {
            sum = sum.multiply(BigInteger.valueOf(a));
        }
        return String.valueOf(sum);
    }
}
