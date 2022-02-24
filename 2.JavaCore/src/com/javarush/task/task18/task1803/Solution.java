package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        Map<Byte, Integer> map = new HashMap<>();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            byte bb = (byte) inputStream.read();
            if (map.containsKey(bb)) {
                int help = map.get(bb);
                map.put(bb, ++help);
            } else {
                map.put(bb, 1);
            }

            ///Users/niklaus/Desktop/Слова
        }
        int max = 0;
        for (int h : map.values()) {
            if (h > max) {
                max = h;
            }
        }

        for (Map.Entry<Byte, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() == max) {
                System.out.print(pairs.getKey() + " ");
            }
        }
        scan.close();
        inputStream.close();
      //  System.out.println(map);
    }
}
