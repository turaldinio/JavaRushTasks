package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution solution = new Solution();
        Solution solution1 = new Solution();
        Solution[] solutions = new Solution[2];
        solutions[0] = solution;
        solutions[1] = solution1;
        solutions[0].innerClasses[0] = solution.new InnerClass();
        solutions[0].innerClasses[1] = solution.new InnerClass();
        solutions[1].innerClasses[0] = solution1.new InnerClass();
        solutions[1].innerClasses[1] = solution1.new InnerClass();

        return solutions;
    }

    public static void main(String[] args) {

    }
}
