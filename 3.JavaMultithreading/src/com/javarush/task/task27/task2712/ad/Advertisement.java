package com.javarush.task.task27.task2712.ad;

public class Advertisement {//рекламное объявление
    private Object content;
    private String name;
    private long initialAmount;//стоимость рекламы в копейках
    private int hits;//кол-во оплачен показв.
    private int duration;//продо-сть в сек
    private long amountPerOneDisplaying;//стоимость показа 1 видео

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if (hits == 0) {
            amountPerOneDisplaying = 0;
        } else {
            this.amountPerOneDisplaying = initialAmount / hits;
        }
    }

    public void revalidate() {
        if (hits <= 0) {
            throw new UnsupportedOperationException();
        }
        hits--;
    }

    public boolean isActive() {
        return hits > 0;
    }

    public int getHits() {
        return hits;
    }
}
