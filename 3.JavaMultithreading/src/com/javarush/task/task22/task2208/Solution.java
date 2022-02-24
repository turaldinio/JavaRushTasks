package com.javarush.task.task22.task2208;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("/Users/niklaus/Desktop"));

        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "turaldinio");
        map.put("country", "Saint-Petersburg");
        map.put("city", "Russia");
        map.put("age", null);
//        map.put(null, null);
//        map.put(null, null);
//        map.put(null, null);
//        map.put(null, null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        if (params.isEmpty()) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> pairs : params.entrySet()) {
            if (pairs.getKey() == null || pairs.getValue() == null) {
                continue;
            }
            if (builder.length() > 1) {
                builder.append(" and ");
            }

            builder.append(pairs.getKey() + " = " + "'" + pairs.getValue() + "'");
        }

        return builder.toString();

    }
}
