package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/*
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {

        String line = "";
        try (BufferedReader readerForLine = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(readerForLine.readLine()))
        ) {
            while (reader.ready()) {
                line += reader.readLine() + " ";

            }
            String[] masString = line.split(" ");


            for (int a = 0; a < masString.length; a++) {
                int repid = 1;
                String firstEnter = new StringBuilder(masString[a]).reverse().toString();
                for (int b = a + 1; b < masString.length; b++) {
                    if (firstEnter.equals(masString[b]) && ++repid % 2 == 0) {
                        Pair pair = new Pair();
                        pair.first = masString[a];
                        pair.second = masString[b];
                        result.add(pair);
                        a++;
                    }
                }

            }
            for (Pair k : result) {
                System.out.println(k.first + " " + k.second);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        public Pair() {

        }

        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
