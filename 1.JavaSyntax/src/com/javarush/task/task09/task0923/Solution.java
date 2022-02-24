package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String vowels = "";
        String noVowles = "";
        char[] mas = a.toCharArray();
        for (int h = 0; h < mas.length; h++) {
            if (isVowel(mas[h])) {
                vowels += mas[h] + " ";
            } else {
                if (mas[h] == ' ') {
                    continue;
                }
                noVowles += mas[h] + " ";
            }
        }
        System.out.println(vowels);
        System.out.println(noVowles);

        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}