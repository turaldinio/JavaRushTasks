package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int years = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
