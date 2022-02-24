package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {


        Human grandFather = new Human("qw", true, 12);
        Human grandFather1 = new Human("qw", true, 12);
        Human grandMother = new Human("qw", false, 23);
        Human grandMother1 = new Human("qw", false, 12);
        Human mom = new Human("s", false, 12, grandFather, grandMother);
        Human father = new Human("s", true, 12, grandFather1, grandMother1);
        Human human4 = new Human("a", true, 12, father, mom);
        Human human5 = new Human("a", true, 12, father, mom);
        Human human6 = new Human("a", true, 21, father, mom);
        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);
        System.out.println(mom);
        System.out.println(father);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        // напишите тут ваш код
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        int age;
        Human mom;
        Human father;
        boolean sex;


        public Human(String name, boolean sex, int age, Human father, Human mom) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mom = mom;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;

            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mom != null) {
                text += ", мать: " + this.mom.name;
            }

            return text;
        }
    }
}