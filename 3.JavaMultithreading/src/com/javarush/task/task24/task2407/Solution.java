package com.javarush.task.task24.task2407;

import java.util.List;

/* 
Реализация интерфейса используя локальный класс
*/

public class Solution {
    class test {
        String name;

        void go() {
            System.out.println(name + " пошел гулять");
        }
    }

    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}

class People extends Solution.test {

    public People(Solution solution) {
        solution.super();
    }
}
