package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("/Users/niklaus/Desktop/zero"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        if (Files.notExists(downloadDirectory)) {
            Files.createDirectory(downloadDirectory);
        }
        URL url = new URL(urlString);

        Path path = Files.createTempFile(null, null);
        InputStream inputStream = url.openStream();

        String fileName = urlString.substring(urlString.lastIndexOf("/"));

        Path download = Paths.get(downloadDirectory + fileName);

        Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);

        Files.move(path, download,StandardCopyOption.REPLACE_EXISTING);

        return download;

        // implement this method
    }
}
