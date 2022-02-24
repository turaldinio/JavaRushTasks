package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propertiesSave = new Properties();
        for (Map.Entry entry : runtimeStorage.entrySet()) {
            propertiesSave.put(entry.getKey().toString(), entry.getValue().toString());
        }
        propertiesSave.store(outputStream, "made in turaldinio");
        System.out.println(propertiesSave);
        outputStream.close();
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry pairs : prop.entrySet()) {
            runtimeStorage.put(pairs.getKey().toString(), pairs.getValue().toString());
        }
    }

    public static void main(String[] args) {
        ///Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/file.properties
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore" +
                     "/src/com/javarush/task/task20/task2003/emptyFile")
        ) {
            load(fos);
            save(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
