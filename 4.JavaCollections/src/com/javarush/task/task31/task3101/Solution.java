package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        PriorityQueue<File> priorityQueue = new PriorityQueue<>();
        Collections.addAll(priorityQueue, Objects.requireNonNull(new File(args[0]).listFiles()));

        File oldFile = new File(args[1]);

        File newFie = new File(oldFile.getParentFile() + "/allFilesContent.txt");

        if (FileUtils.isExist(newFie)) {
            FileUtils.deleteFile(newFie);
        }

        FileUtils.renameFile(oldFile, newFie);

        while (!priorityQueue.isEmpty()) {
            File currentFile = priorityQueue.poll();
            if (currentFile.isDirectory()) {
                Collections.addAll(priorityQueue, Objects.requireNonNull(currentFile.listFiles()));
            } else {
                try (FileInputStream inputStream = new FileInputStream(currentFile);
                     FileOutputStream outputStream = new FileOutputStream(newFie)
                ) {
                    if (inputStream.available() <= 50) {
                        while (inputStream.available() > 0) {
                            outputStream.write(inputStream.read());
                        }

                    }


                } catch (IOException exception) {
                    exception.printStackTrace();
                }


            }
        }


    }
}
