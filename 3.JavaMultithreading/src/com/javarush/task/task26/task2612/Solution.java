package com.javarush.task.task26.task2612;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
Весь мир играет комедию
*/

public class Solution {
    public static void main(String[] args) {
    }

    private Lock lock = new ReentrantLock();

    public void someMethod() {
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } catch (Exception e) {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }


        // Implement the logic here. Use the lock field
    }

    public void actionIfLockIsFree() {
    }

    public void actionIfLockIsBusy() {
    }
}
