package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/
///Users/niklaus/Desktop/Слова
public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        Scanner scan = new Scanner(System.in);
        firstFileName = scan.nextLine();
        secondFileName = scan.nextLine();
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String result="";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            return result;
        }


        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {

            try {
                Scanner scan = new Scanner(new FileInputStream(fileName));
                while (scan.hasNextLine()) {
                    result = result + " " + scan.nextLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    //add your code here - добавьте код тут
}
