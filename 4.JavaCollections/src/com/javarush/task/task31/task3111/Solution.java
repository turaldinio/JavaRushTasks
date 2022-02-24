package com.javarush.task.task31.task3111;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
Продвинутый поиск файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {


        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("");
        searchFileVisitor.setPartOfContent("");
        searchFileVisitor.setMinSize(0);
        searchFileVisitor.setMaxSize(0);

        Files.walkFileTree(Paths.get("/Users/niklaus/Desktop"), searchFileVisitor);

        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
        System.out.println(foundFiles.size());
    }
}
