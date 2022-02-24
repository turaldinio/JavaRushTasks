package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }


    @Override
    public void run() {
        Thread cur = Thread.currentThread();
        AtomicInteger integer = new AtomicInteger(0);
        while (!cur.isInterrupted()) {
            try {
                map.put(String.valueOf(integer.incrementAndGet()), "Some text for " + integer.get());
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.printf("[%s] thread was terminated ", cur.getName());
                e.printStackTrace();
                break;
            }
        }

    }
}
