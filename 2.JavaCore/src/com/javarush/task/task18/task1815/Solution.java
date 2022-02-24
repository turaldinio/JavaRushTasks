package com.javarush.task.task18.task1815;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

/* 
Таблица
*/

public class Solution {
    public static void main(String[] args) {
        try {
            PrintStream newPrintStream = new PrintStream(new File("/Users/niklaus/Desktop/Строка1"));
            PrintStream oldPrintStream = System.out;
            System.setOut(newPrintStream);
            System.out.println("Записываю прямо в файл!");
            System.setOut(oldPrintStream);
            System.out.println("а это в консоль");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}