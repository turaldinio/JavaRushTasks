package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/

import java.util.LinkedList;
import java.util.List;

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<String> res = new LinkedList<>();
        while (e != null) {
            res.add(0, e.toString());
            e = e.getCause();
        }

        for (String s : res) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread.setDefaultUncaughtExceptionHandler(solution);
        new Thread() {
            @Override
            public void run() {
                throw new RuntimeException(new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
            }
        }.start();

    }


}

