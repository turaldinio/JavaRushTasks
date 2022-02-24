package com.javarush.task.task03.task0322;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        System.out.printf("%s + %s + %s = Чистая любовь, да-да!", name, name1, name2);
    }
}