package com.javarush.task.task27.task2705;

/*
Второй вариант deadlock
*/

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public static void main(String[] args) {
Runnable runnable;
Solution solution=new Solution();
        new Thread(runnable= solution::secondMethod);
        new Thread(runnable= solution::firstMethod);
    }
}
