package com.javarush.task.task27.task2712.ad;

import java.util.List;
import java.util.stream.Collectors;

public class StatisticAdvertisementManager {
    public AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();

    public static StatisticAdvertisementManager statisticAdvertisementManager = StatisticAdvertisementManager.getInstance();

    private StatisticAdvertisementManager() {
    }

    public static StatisticAdvertisementManager getInstance() {
        if (statisticAdvertisementManager == null) {
            statisticAdvertisementManager = new StatisticAdvertisementManager();
        }
        return statisticAdvertisementManager;
    }

    public List<Advertisement> chekAlive(boolean chek) {
        if (chek) {
            return AdvertisementStorage.getInstance().list().stream().filter(x -> x.getHits() > 0).collect(Collectors.toList());
        } else {
            return AdvertisementStorage.getInstance().list().stream().filter(x -> x.getHits() == 0).collect(Collectors.toList());
        }
    }
}
