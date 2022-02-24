package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Restaurant;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable {
    private String name;
    private boolean busy;
    private LinkedBlockingQueue<Order> queue;

    public Cook(String name) {
        this.name = name;
    }

    public void setQueue(LinkedBlockingQueue queue) {
        this.queue = queue;
    }

    public boolean isBusy() {
        return busy;
    }


    @Override
    public String toString() {
        return name;
    }


    public void startCookingOrder(Order order) {
        busy = true;
        ConsoleHelper.writeMessage("Start cooking - " + order+" "+"cooks name is "+name);
        try {
            Thread.sleep(order.getTotalCookingTime() * 10L);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setChanged();
        notifyObservers(order);
        CookedOrderEventDataRow row = new CookedOrderEventDataRow(order.getTablet().toString(), name, order.getTotalCookingTime(), order.getDishes());
        StatisticManager.getInstance().register(row);
        busy = false;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(10);
                if (!queue.isEmpty() & !isBusy()) {
                    startCookingOrder(queue.take());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



