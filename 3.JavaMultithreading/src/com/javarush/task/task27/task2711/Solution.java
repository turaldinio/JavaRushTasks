package com.javarush.task.task27.task2711;

import java.util.concurrent.CountDownLatch;

/* 
CountDownLatch
*/

public class Solution {
    private volatile boolean isWaitingForValue = true;

    CountDownLatch latch = new CountDownLatch(1);

    public void someMethod() throws InterruptedException {
        latch.await();
        retrieveValue();

    }

    void retrieveValue() {
        System.out.println("Value retrieved.");
    }

    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        new Thread(() -> {
            try {
                solution.someMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        solution.latch.countDown();
    }
}
