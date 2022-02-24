package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //   StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        StringReader reader = new StringReader("");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringWriter writer = new StringWriter();
        try {
            BufferedReader bufferedReader = new BufferedReader(reader);
            char[] array = bufferedReader.readLine().toCharArray();
            for (int a = 0; a < array.length; a++) {
                char g = (char) (array[a] + key);
                writer.write(g);
            }
        } catch (Exception e) {
            return "";
        }
        return writer.toString();
    }
}
