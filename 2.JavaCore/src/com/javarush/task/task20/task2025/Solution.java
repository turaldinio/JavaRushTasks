package com.javarush.task.task20.task2025;

import java.util.*;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        String time = String.valueOf(N);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < N; a++) {
            int sum = 0;
            String j = String.valueOf(a);
            String[] masString = j.split("");
            for (String l : masString) {
                sum += Integer.parseInt(l);

            }
            map.put(a, (int) Math.pow(a, j.length()));
        }

//        ArrayList<Integer> list = new ArrayList<>();
//        long mas[][] = new long[10][time.length()];
//        for (int a = 0; a < mas.length; a++) {
//            for (int b = 0; b < mas[a].length; b++) {
//                mas[a][b] = (long) Math.pow(b, a);
//            }
//        }
//        for (int a = 0; a < N; a++) {
//            long sum = 0;
//            String line = String.valueOf(a);
//            char[] masChar = line.toCharArray();
//            for (char j : masChar) {
//                sum += mas[line.length()][Character.getNumericValue(j)];
//            }
//            if (sum == a&&sum!=0) {
//                list.add(a);
//            }
//        }
//        long[] masResult = new long[list.size()];
//        for (int a = 0; a < list.size(); a++) {
//            masResult[a] = list.get(a);
//        }
        return null;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
