package com.javarush.task.task07.task0702;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String masString[] = new String[10];
  //      Arrays.fill(masString, null);
        for (int a = 0; a < 8; a++) {
            masString[a] = scan.nextLine();
        }
        for (int a = masString.length-1; a != -1; a--) {
            System.out.println(masString[a]);
        }
    }
}