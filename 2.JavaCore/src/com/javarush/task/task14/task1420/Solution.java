package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();

                ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int start = 2;
        int help = 1;
        while (true) {
            if (one == 1) {
                list.add(1);
                break;
            }
            if (one % start == 0) {
                one /= start;
                list.add(start);
            } else {
                ++start;
            }
        }
        start = 2;
        while (true) {
            if (two == 1) {
                list1.add(1);
                break;
            }
            if (two % start == 0) {
                two /= start;
                list1.add(start);
            } else {
                ++start;
            }
        }

        Iterator<Integer> iteratorMax = list.iterator();
        Iterator<Integer> iteratorMin = list1.iterator();
        while (iteratorMax.hasNext()) {
            int minTime = iteratorMin.next();
            int maxTime = iteratorMax.next();
            if (list1.contains(maxTime)) {
                help *= maxTime;
                iteratorMax.remove();
                iteratorMin.remove();
            }
        }

        System.out.println(help);

    }
}
