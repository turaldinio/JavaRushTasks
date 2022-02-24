package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static class Cat {
        public Cat() {
        }
    }

    public static class Dog {
        public Dog() {
        }
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int a = 0; a < 4; a++) {
            result.add(new Cat());
        }
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        for (int a = 0; a < 3; a++) {
            result.add(new Dog());
        }

        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<>();
        for (Cat g : cats) {
            result.add(g);
        }
        for (Dog j : dogs) {
            result.add(j);
        }

        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        Iterator<Cat> catsIterator = cats.iterator();
        Object obj = iterator.next();
        Cat cat = catsIterator.next();
        while (iterator.hasNext()) {
            if (cat.getClass().isInstance(obj)) {
                iterator.remove();
                obj = iterator.next();
            } else {
                obj=iterator.next();
            }
        }
    }


    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //напишите тут ваш код
}
