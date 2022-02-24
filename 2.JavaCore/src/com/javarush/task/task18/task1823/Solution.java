package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/
//      /Users/niklaus/Desktop/Слова
//      /Users/niklaus/Desktop/Пусто
public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                String text = scan.nextLine();
                if (text.equalsIgnoreCase("exit")) {
                    break;
                }
                list.add(text);
            }
            for (int a = 0; a < list.size(); a++) {
                ReadThread readThread = new ReadThread(list.get(a));
                readThread.start();
            }
        }

    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            try (FileInputStream inputStream = new FileInputStream(this.fileName)) {
                byte[] mas = new byte[256];
                while (inputStream.available() > 0) {
                    int a = inputStream.read();
                    mas[a]++;
                }
                int maxrepid = 0;
                int maxByte = 0;
                for (int a = 0; a < mas.length; a++) {
                    if (mas[a] > maxrepid) {
                        maxrepid = mas[a];
                        maxByte = a;
                    }
                }
                resultMap.put(fileName,maxByte);
                Thread.sleep(1000);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            // implement file reading here - реализуйте чтение из файла тут

            long end = System.currentTimeMillis();
            long result = end - start;
            System.out.println(result + " millsec");
        }

    }

}