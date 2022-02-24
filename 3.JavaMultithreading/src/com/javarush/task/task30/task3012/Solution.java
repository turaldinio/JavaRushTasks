package com.javarush.task.task30.task3012;

/* 
Получи заданное число
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(2);
    }

    public void createExpression(int number) {
        StringBuilder builder = new StringBuilder(number + " =");
        int[] mas = {1, 3, 9, 27, 81, 243, 729, 2187};
        int delimoeChislo = number;
        StringBuilder line = new StringBuilder();
        do {
            if (delimoeChislo % 3 == 1) {
                line.append(1 + ",");
                delimoeChislo /= 3;
                continue;
            }
            if (delimoeChislo % 3 == 2) {
                line.append(-1 + ",");
                delimoeChislo = 1 + delimoeChislo / 3;
                continue;
            }
            if (delimoeChislo % 3 == 0) {
                line.append(0 + ",");
                delimoeChislo /= 3;

            }

        }
        while (delimoeChislo > 0);

        int a = 0;
        for (String h : line.toString().split(",")) {
            if (Integer.parseInt(h) == 0) {
                a++;
                continue;
            }
            if (h.contains("-")) {
                builder.append(" - ").append(mas[a]);
                a++;
            } else {
                builder.append(" + ").append(mas[a]);
                a++;
            }
        }


        System.out.println(builder);
    }
}