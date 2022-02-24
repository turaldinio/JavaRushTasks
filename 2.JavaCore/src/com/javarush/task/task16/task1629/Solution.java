package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static class Read3Strings extends Thread {
        String line1;
        String line2;
        String line3;

        @Override
        public void run() {
            try {
                synchronized (this.getClass()) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
                    this.line1 = reader.readLine();
                    this.line2 = reader.readLine();
                    this.line3 = reader.readLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(line1 + " " + line2 + " " + line3);
        }
    }

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
}
