package com.javarush.task.task27.task2710;

/* 
Расставь wait-notify
*/

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {

        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread amigo = new Thread(new Person(mail));

        server.start();
        amigo.start();
    }
}
//}
//        Lock lock = new ReentrantLock();
//        Runnable task = () -> {
//            lock.lock();
//            System.out.println("Thread");
//            lock.unlock();
//        };
//        lock.lock();
//
//        Thread th = new Thread(task);
//        th.start();
//        System.out.println("main");
//        Thread.sleep(2000);
//        lock.unlock();



