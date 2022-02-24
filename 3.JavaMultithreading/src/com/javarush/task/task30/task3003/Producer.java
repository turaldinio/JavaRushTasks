package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
    TransferQueue<ShareItem> queue;

    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
                for (int a = 1; a < 10; a++) {
                    System.out.format("Элемент 'ShareItem-%d' добавлен\n", a);
                    queue.offer(new ShareItem("ShareItem-" + a, a));
                    Thread.sleep(100);
                    if (queue.hasWaitingConsumer()) {
                        System.out.format("Consumer в ожидании!\n");
                    }
            }
        } catch (InterruptedException e) {
        }
    }

}
