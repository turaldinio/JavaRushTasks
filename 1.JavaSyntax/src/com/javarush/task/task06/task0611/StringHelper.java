package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a < 5; a++) {
            builder.append(text);
        }
        result = builder.toString();
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a < count; a++) {
            builder.append(text);
        }
        result = builder.toString();
        //напишите тут ваш код
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("java"));
        System.out.println(StringHelper.multiply("java", 3));
    }
}
