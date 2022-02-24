package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < 20; a++) {
            list.add(scan.nextInt());
            if (list.get(a) % 3 == 0) {
                list1.add(list.get(a));
            }
            if (list.get(a) % 2 == 0) {
                list2.add(list.get(a));
            }
            if (list.get(a) % 2 != 0 & list.get(a) % 3 != 0) {
                list3.add(list.get(a));
            }
        }
        //напишите тут ваш код


        printList(list1);

        printList(list2);

        printList(list3);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int h : list) {
            System.out.println(h);
        }
    }
}
