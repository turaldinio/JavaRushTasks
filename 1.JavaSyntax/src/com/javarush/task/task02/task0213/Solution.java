package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/

import javax.print.attribute.standard.Fidelity;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat=new Cat();
        Fish fish=new Fish();
        Dog dog=new Dog();
        Woman woman=new Woman();
        cat.owner=woman;
        fish.owner=woman;
        dog.owner=woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
