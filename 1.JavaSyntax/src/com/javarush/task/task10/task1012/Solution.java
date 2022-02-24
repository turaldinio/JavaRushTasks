package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        TreeMap<Character, Integer> hashMap = new TreeMap<>();
        for (int a = 0; a < alphabet.size(); a++) {
            hashMap.put(alphabet.get(a), 0);
        }
        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        for (int a = 0; a < list.size(); a++) {
            char[] masSimvol = list.get(a).toCharArray();
            for (int b = 0; b < masSimvol.length; b++) {
                if (hashMap.containsKey(masSimvol[b])) {
                    int oldCount = hashMap.get(masSimvol[b]);
                    hashMap.put(masSimvol[b], ++oldCount);
                }
            }

        }
        for (Character l : alphabet) {
            int h = hashMap.get(l);
            System.out.println(l + " " + h);
        }
        // напишите тут ваш код
    }
}
