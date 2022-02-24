package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        ArrayList<Horse> list = new ArrayList<>();
        list.add(new Horse("Джеймс", 3, 0));
        list.add(new Horse("Колибс", 3, 0));
        list.add(new Horse("Энетни", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

    public void run() {
        for (int a = 0; a < 100; a++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void move() {
        for (int a = 0; a < horses.size(); a++) {
            horses.get(a).move();
        }
    }

    public void print() {
        for (int a = 0; a < horses.size(); a++) {
            horses.get(a).print();

        }
        for (int b = 0; b < 10; b++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        int chek = 0;
        Horse horse = null;
        for (int a = 0; a < horses.size(); a++) {
            if (horses.get(a).distance > chek) {
                chek = (int) horses.get(a).distance;
                horse = horses.get(a);
            }
        }
        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().name+"!");
    }
}
