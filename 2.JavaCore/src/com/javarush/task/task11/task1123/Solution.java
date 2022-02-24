package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
      //  int[] data = new int[]{-1, -2, -3, -5, -2, -8,- 77, -5, -5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int minimum = inputArray[0];
        int max = inputArray[0];
        for (int a = 0; a < inputArray.length; a++) {
            if (max < inputArray[a]) {
                max = inputArray[a];
            }
            if (minimum > inputArray[a]) {
                minimum = inputArray[a];
            }
        }
        // напишите тут ваш код

        return new Pair(minimum, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
