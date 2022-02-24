package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int a = scan.nextInt();
                list.add(a);
            }
        }
        catch (Exception exception){
            for(int h:list){
                System.out.println(h);
            }

        }


        //напишите тут ваш код
    }
}
