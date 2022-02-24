package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        if(a==0){
            System.out.println(0);
        }
        if(a>0){
            System.out.println(a*2);
        }
        if(a<0){
            System.out.println(a+1);
        }
    }

}