package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }


    public static class Human {
        //напишите тут ваши переменные и конструкторы
        private String gender;
        private int age;
        private int weight;
        private int height;
        private boolean children;
        private boolean parents;

        public Human(String gender) {
            this.gender = gender;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(boolean children) {
            this.children = children;
        }

        public Human(boolean children, boolean parents) {
            this.children = children;
            this.parents = parents;
        }

        public Human(String gender, int age) {
            this.gender = gender;
            this.age = age;
        }

        public Human(String gender, int age, int weight, int height) {
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String gender, int age, boolean children) {
            this.gender = gender;
            this.age = age;
            this.children = children;
        }

        public Human(String gender, boolean children) {
            this.gender = gender;
            this.children = children;
        }


        public Human(String gender, int age, int weight, int height, boolean children, boolean parents) {
            this.gender = gender;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.children = children;
            this.parents = parents;
        }
    }
}