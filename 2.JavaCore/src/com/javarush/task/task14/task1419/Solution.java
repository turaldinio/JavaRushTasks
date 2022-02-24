package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] mas = new int[3];
            System.out.println(mas[5]);
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            String a = "as";
            System.out.println(Integer.parseInt(a));
        } catch (Exception a) {
            exceptions.add(a);

        }
        try {
            ArrayList list = new ArrayList<>();
            list.add("as");
            list.add(12);
            list.add(new Object());
            int f = Integer.parseInt((String) list.get(2));
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("as");
            list.add("as");
            list.add("as");
            for (int a = 0; a < list.size(); a++) {
                list.remove(a);

                String k = list.get(a);
            }
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("as");
            list.add("as");
            list.add("as");
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String o = iterator.next();
                list.remove(0);
            }
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            FileInputStream inputStream = new FileInputStream("sa");
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            throw new Exception();

        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            throw new EmptyStackException();
        } catch (Exception a) {
            exceptions.add(a);
        }
        try {
            throw new DataFormatException();
        } catch (Exception a) {
            exceptions.add(a);
        }
    }
}
