package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        ///Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1922/file
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))
        ) {
            HashMap<String, Integer> map = new HashMap<>();

            while (fileReader.ready()) {
                for (int a = 0; a < words.size(); a++) {
                    map.put(words.get(a), 0);
                }
int sum=0;
                String line = fileReader.readLine();
                String[] masString = line.split(" ");
                for (String l : masString) {
                    if (map.containsKey(l)) {
                        int j = map.get(l);
                        map.put(l, ++j);
                    sum++;
                    }
                }
                if(sum == 2){
                    System.out.println(line);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
