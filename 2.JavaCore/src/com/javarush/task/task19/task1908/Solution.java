package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
                while (fileReader.ready()) {
                    String[] line = fileReader.readLine().split(" ");
                    for (String k : line) {
                        try {
                            int chek = Integer.parseInt(k);
                        fileWriter.write(chek+" ");
                        }
                        catch (Exception exception){

                        }
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
