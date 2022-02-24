package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    String color, address;
    int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 24;
        this.color = "Green";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "as";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 12;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 23;
    }
}