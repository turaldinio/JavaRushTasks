package com.javarush.task.task08.task0808;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int a = 0; a < 10000; a++) {
            list.add(a);
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int a = 0; a < 10000; a++) {
            list.get(a);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int a = 0; a < 10000; a++) {
            list.set(a, a);
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int y=iterator.next();
            iterator.remove();
        }
    }
}