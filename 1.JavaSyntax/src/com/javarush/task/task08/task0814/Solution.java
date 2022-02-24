package com.javarush.task.task08.task0814;

import javax.security.auth.login.CredentialException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(120);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(110);
        set.add(2);
        set.add(18);
        set.add(4);
        set.add(57);
        set.add(4556);
        set.add(5);
        set.add(456);
        set.add(8);
        set.add(3);
        set.add(7);
        set.add(10);
        return set;
        // напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {

            if (iterator.next()>10){
                iterator.remove();
        }
    }

        return set;
}

    public static void main(String[] args) {
        Set<Integer> set = removeAllNumbersGreaterThan10(createSet());
    }
}
