package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(scan.nextInt());
        }

        int current = 1, max = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 1;
        }
        System.out.println(max);

    }
}
