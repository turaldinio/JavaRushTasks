package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* 
Находим все файлы
*/

public class Solution {

    public static List<String> getFileTree(String root) {

        PriorityQueue<File> priorityQueue = new PriorityQueue<>();
        List<String> list = new ArrayList<>();
        File file = new File(root);


        Collections.addAll(priorityQueue, Objects.requireNonNull(file.listFiles()));
        while (!priorityQueue.isEmpty()) {
            File currentFile = priorityQueue.poll();
            if (currentFile.isDirectory()) {
                Collections.addAll(priorityQueue, Objects.requireNonNull(currentFile.listFiles()));
            } else {
                list.add(currentFile.getAbsolutePath());
            }

        }
        return list;
    }


    public static void main(String[] args) throws IOException {


        for (String list : getFileTree("/Users/niklaus/Documents/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3102/truraldinio")) {
            System.out.println(list);
        }
    }
}
