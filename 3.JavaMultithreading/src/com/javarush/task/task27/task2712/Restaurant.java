package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;
    private final static LinkedBlockingQueue<Order> ORDER_QUEUE = new LinkedBlockingQueue<>();


    public static void main(String[] args) throws InterruptedException {
        Cook cook1 = new Cook("Amigo");
        cook1.setQueue(ORDER_QUEUE);
        Cook cook2 = new Cook("turaldinio");
        cook2.setQueue(ORDER_QUEUE);

        Thread cook1Thread = new Thread(cook1);
        cook1Thread.setDaemon(true);
        cook1Thread.start();

        Thread cook2Thread = new Thread(cook2);
        cook2Thread.setDaemon(true);
        cook2Thread.start();

        ArrayList<Tablet> list = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            Tablet tablet = new Tablet(a);
            tablet.setQueue(ORDER_QUEUE);
            list.add(tablet);
        }
        Thread thread = new Thread(new RandomOrderGeneratorTask(list, ORDER_CREATING_INTERVAL));
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();


        //Waiter waiter = new Waiter();
        //tablet.addObserver(cook);
        //cook.addObserver(waiter);

        //  tablet.createOrder();
        // tablet.createOrder();
        // tablet.createOrder();
        // tablet.createOrder();

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}
