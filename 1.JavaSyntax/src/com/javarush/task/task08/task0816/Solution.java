package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("asdqd", dateFormat.parse("JANUARY 1 2012"));
        map.put("qw", dateFormat.parse("JANUARY 1 2012"));
        map.put("Смиasdрнов", dateFormat.parse("August 1 2012"));
        map.put("Смиevwрнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смиvaef4рнов", dateFormat.parse("MAY 1 2012"));
        map.put("g34g3g", dateFormat.parse("MAY 1 2012"));
        map.put("bdfbb", dateFormat.parse("July 1 2012"));
        map.put("b3erb3", dateFormat.parse("MAY 1 2012"));
        map.put("g43g", dateFormat.parse("June 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        int month = 0;
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pairs = iterator.next();
            month = pairs.getValue().getMonth();
            if (month > 4 && month < 8) {
                iterator.remove();
            }


        }

    }

    public static void main(String[] args) throws Exception {
        HashMap<String, Date> map = (HashMap<String, Date>) createMap();
        removeAllSummerPeople(map);
    }
}
