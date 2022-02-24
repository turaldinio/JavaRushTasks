package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.Advertisement;
import com.javarush.task.task27.task2712.ad.StatisticAdvertisementManager;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import javax.swing.text.StyledEditorKit;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class DirectorTablet {
    public StatisticManager statisticManager = StatisticManager.getInstance();
    public List<EventDataRow> list;
    public SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    public TreeMap<String, Long> treeMap;

    public void printAdvertisementProfit() {
        list = statisticManager.getResultOnRequest(EventType.SELECTED_VIDEOS);
        long result = 0;
        treeMap = new TreeMap<>();
        for (EventDataRow eventDataRow : list) {
            VideoSelectedEventDataRow vse = (VideoSelectedEventDataRow) eventDataRow;
            result += vse.getAmount();
            String date = simpleDateFormat.format(vse.getDate());
            if (!treeMap.containsKey(date)) {
                treeMap.put(date, vse.getAmount());
            } else {
                treeMap.put(date, treeMap.get(date) + vse.getAmount());
            }
        }
        treeMap.put("Total", result);
        for (Map.Entry<String, Long> pairs : treeMap.entrySet()) {
            ConsoleHelper.writeMessage(pairs.getKey() + " - " + String.format("%.2f", 1.0 * pairs.getValue() / 100).replaceAll(",", "."));
        }
    }

    public void printCookWorkloading() {
        list = statisticManager.getResultOnRequest(EventType.COOKED_ORDER);
        treeMap = new TreeMap<>();
        TreeMap<String, TreeMap<String, Long>> resultMap = new TreeMap<>(Collections.reverseOrder());
        for (EventDataRow eventDataRow : list) {
            CookedOrderEventDataRow cookedOrderEventDataRow = (CookedOrderEventDataRow) eventDataRow;
            String date = simpleDateFormat.format(cookedOrderEventDataRow.getDate());
            if (!treeMap.containsKey(cookedOrderEventDataRow.getCookName())) {
                treeMap.put(cookedOrderEventDataRow.getCookName(), (long) cookedOrderEventDataRow.getTime());
            } else {
                treeMap.put(cookedOrderEventDataRow.getCookName(), treeMap.get(cookedOrderEventDataRow.getCookName()) + cookedOrderEventDataRow.getTime());
            }
            resultMap.put(date, treeMap);

        }
        for (Map.Entry<String, TreeMap<String, Long>> pairs : resultMap.entrySet()) {
            ConsoleHelper.writeMessage(pairs.getKey());
            for (Map.Entry<String, Long> iterator : pairs.getValue().entrySet()) {
                ConsoleHelper.writeMessage(iterator.getKey() + " - " + iterator.getValue() + " min");
            }
        }


    }

    public void printActiveVideoSet() {
        StatisticAdvertisementManager statisticAdvertisementManager = StatisticAdvertisementManager.getInstance();
        List<Advertisement> list = statisticAdvertisementManager.chekAlive(true);

        displaying(list);
    }

    public void printArchivedVideoSet() {
        StatisticAdvertisementManager statisticAdvertisementManager = StatisticAdvertisementManager.getInstance();
        List<Advertisement> list = statisticAdvertisementManager.chekAlive(false);
        displaying(list);
    }

    public void displaying(List<Advertisement> list) {
        Comparator<Advertisement> comparator = new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement advertisement, Advertisement t1) {
                return advertisement.getName().toLowerCase().compareTo(t1.getName().toLowerCase());
            }
        };
        list.sort(comparator);
        for (Advertisement advertisement : list) {
            if (advertisement.getHits() > 0) {
                ConsoleHelper.writeMessage(advertisement.getName() + " - " + advertisement.getHits());
            } else {
                ConsoleHelper.writeMessage(advertisement.getName());
            }
        }
    }
}
