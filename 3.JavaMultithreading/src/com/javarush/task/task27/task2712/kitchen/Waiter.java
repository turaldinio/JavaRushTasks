package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Waiter implements Runnable {
    private LinkedBlockingQueue<Order> queue;

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public void update(Observable observable, Object o) {
        ConsoleHelper.writeMessage(o + "  was cooked by " + observable);

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                ConsoleHelper.writeMessage("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
