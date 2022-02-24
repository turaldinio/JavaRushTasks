package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Поиграем?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 1);
        protected Gamer gamer2 = new Gamer("Petrov", 2);
        protected Gamer gamer3 = new Gamer("Sidorov", 1);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            try {
                int a = 0;
                while (a != OnlineGame.steps.size()) {
                    System.out.println(getName() + ":" + OnlineGame.steps.get(a));
                    a++;
                    Thread.sleep(1000 / rating);
                }
                OnlineGame.isWinnerFound = true;
                System.out.println(this.getName() + ":победитель!");
                //   System.out.println(getName());
            } catch (InterruptedException e) {
                System.out.println(getName() + ":проиграл");
                interrupt();
            }
        }
        //Add your code here - добавь код тут
    }
}

