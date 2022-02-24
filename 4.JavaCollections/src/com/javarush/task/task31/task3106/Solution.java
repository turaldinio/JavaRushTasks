package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        File resultFile = new File(args[0]);

        for (int a = 1; a < args.length; a++) {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(args[a]));
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            outputStream.write(zipInputStream.readAllBytes());
        }
        if (Files.notExists(resultFile.toPath())) {
            Files.createFile(resultFile.toPath());
        }
            Files.write(resultFile.toPath(), outputStream.toByteArray());

        System.out.println(new

                String(Files.readAllBytes(resultFile.toPath())));

    }
}
