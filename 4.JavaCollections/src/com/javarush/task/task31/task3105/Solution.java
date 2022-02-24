package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        // initialization(new File(args[1]));
        record(new File(args[0]), new File(args[1]));
    }

    public static void record(File file, File zipFile) throws IOException {
        List<Archive> list = addList(zipFile.getAbsolutePath());

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile))) {
            zipOutputStream.putNextEntry(new ZipEntry("/new/file.txt"));
            Files.copy(file.toPath(), zipOutputStream);

            for (int a = 0; a < list.size(); a++) {
                if (!list.get(a).name.equals(file.getName())) {
                    Archive.record(zipOutputStream, list.get(a));
                }


            }
        }
    }


    public static List<Archive> addList(String file) throws IOException {
        List<Archive> list = new ArrayList<>();
        ZipInputStream inputStream = new ZipInputStream(new FileInputStream(file));
        ZipEntry zipEntry = inputStream.getNextEntry();
        while (zipEntry != null) {
            Archive archive = new Archive(zipEntry.getName(), inputStream.readAllBytes());
            list.add(archive);
            zipEntry = inputStream.getNextEntry();

        }
        Archive.reading(list);
        return list;
    }


    public static void initialization(File file) {


        try (ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(file))) {

            outputStream.putNextEntry(new ZipEntry("doc.txt"));

            outputStream.write("hello".getBytes());
            outputStream.closeEntry();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Archive {
    String name;
    byte[] array;

    public Archive(String name, byte[] array) {
        this.name = name;
        this.array = array;
    }


    public static void record(ZipOutputStream zipOutputStream, Archive archive) {
        try {
            zipOutputStream.putNextEntry(new ZipEntry(archive.name));
            zipOutputStream.write(archive.array);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reading(List<Archive> list) {
        list.stream().map(x -> x.name + " " + new String(x.array)).forEach(System.out::println);

    }


}
