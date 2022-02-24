package com.javarush.task.task14.task1401;

/* 
Bingo!
*/

public class Solution {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Object object = new Tiger();

    }

    private static void printResults(Object tiger) {
        if (tiger instanceof Tiger) {
            System.out.println("да");
        }
    }

    static class Pet {
        String a;
    }

    static class Cat extends Pet {
        String cat;
    }

    static class Tiger extends Cat {
        int y;
    }

}
