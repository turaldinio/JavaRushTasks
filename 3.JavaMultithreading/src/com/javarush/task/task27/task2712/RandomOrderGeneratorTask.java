package com.javarush.task.task27.task2712;


import java.util.ArrayList;
import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    private int interval;
    private List<Tablet> list;

    public RandomOrderGeneratorTask(List<Tablet> tablets, int interval) {
        this.list = tablets;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            Tablet tablet = list.get((int) (Math.random() * list.size()));
            tablet.createTestOrder();
            try {
                Thread.sleep(this.interval);
            } catch (InterruptedException e) {
                return;
            }
        }
    }


}
