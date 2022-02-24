package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);
        System.out.println(tree.branches == clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            String[] mas = new String[branches.length];
            for (int a = 0; a < mas.length; a++) {
                mas[a] = branches[a];
            }
            Tree tree = new Tree(getName(), mas);
return tree;

        }

        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        public String toString() {
            return Arrays.toString(this.branches) + " " + this.getName();
        }
    }
}
