package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String a = scan.nextLine();
            if(a.equalsIgnoreCase("сумма")){
                break;
            }
            sum += Integer.parseInt(a);

        }
        System.out.println(sum);
    }
}
