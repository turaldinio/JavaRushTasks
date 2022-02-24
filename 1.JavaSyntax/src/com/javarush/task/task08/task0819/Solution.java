package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static class Cat {

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        Cat a = iterator.next();
        iterator.remove();
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        for (int a = 0; a < 3; a++) {
            set.add(new Cat());
        }
        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat r:cats){
            System.out.println(r);
        }
        // step 4 - пункт 4
    }

    // step 1 - пункт 1
}
