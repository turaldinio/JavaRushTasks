package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        for (Integer h : sort(new Integer[]{5, 13, 17, 15, 8})) {
            System.out.print(h + " ");
        }

    }

    public static Integer[] sort(Integer[] array) {
        final double mediana = getMediana(array);

        Comparator<Integer> comparator = (o1, o2) -> (int) (Math.abs(o1 - mediana) - Math.abs(o2 - mediana));
        Arrays.sort(array, comparator);

        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) {
            res = array[length / 2];
        } else {
            res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        }
        return res;
    }
}
