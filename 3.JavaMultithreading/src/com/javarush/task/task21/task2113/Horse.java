package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed, distance;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move() {
        distance += speed * Math.random();
    }

    public void print() {
        int b = (int) distance;
        for (int a = 0; a < b; a++) {
            System.out.print(".");
        }
        System.out.print(name);

    }
}
