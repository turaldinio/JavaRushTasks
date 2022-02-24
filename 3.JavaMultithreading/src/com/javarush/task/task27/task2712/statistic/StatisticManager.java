package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;

public class StatisticManager {//регистрация событий в журнал

    public static StatisticManager statisticManager = getInstance();
    private StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager() {

    }

    public static StatisticManager getInstance() {
        if (statisticManager == null) {
            statisticManager = new StatisticManager();
        }

        return statisticManager;

    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }




    private class StatisticStorage {//хранилище

        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            for (EventType eventType : EventType.values()) {
                storage.put(eventType, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data) {
            EventType eventType = data.getType();
            if (storage.containsKey(eventType)) {
                storage.get(eventType).add(data);
            } else {
                throw new UnsupportedOperationException();
            }
        }

        private List<EventDataRow> get(EventType eventType) {
            return storage.getOrDefault(eventType, Collections.emptyList());

        }
    }

    public List<EventDataRow> getResultOnRequest(EventType eventType) {
        return statisticStorage.get(eventType);

    }
}
