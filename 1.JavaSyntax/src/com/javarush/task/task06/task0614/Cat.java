package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    //напишите тут ваш код

    public Cat() {
      //  cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int a = 0; a < 10; a++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (int a = 0; a < cats.size(); a++) {
            System.out.println(cats.get(a));
        }
        //напишите тут ваш код
    }
}
