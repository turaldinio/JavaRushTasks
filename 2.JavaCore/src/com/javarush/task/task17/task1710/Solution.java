package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat bdIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat bdOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                Person person = null;
                for (int a = 1; a < args.length; a++) {
                    if (args[a].equalsIgnoreCase("м")) {
                        person = Person.createMale(args[a - 1], bdIn.parse(args[a + 1]));
                        allPeople.add(person);
                    } else {
                        if (args[a].equalsIgnoreCase("ж")) {
                            person = Person.createFemale(args[a - 1], bdIn.parse(args[a + 1]));
                            allPeople.add(person);
                        }
                    }

                    //напишите тут ваш код
                }
                System.out.println(allPeople.indexOf(person));
                break;
            case "-r":
                for (int a = 1; a < args.length; a++) {
                    String sex = allPeople.get(a).getSex() == Sex.MALE ? "м" : "ж";
                    System.out.print(allPeople.get(a).getName() + " " + sex + " " + bdOut.format(allPeople.get(a).getBirthDate()));
                }
                break;
            case "-u":
                for (int a = 1; a < args.length; a += 4) {
                    allPeople.get(Integer.parseInt(args[a])).setName(args[a + 1]);
                    if (args[a + 2].equalsIgnoreCase("м")) {
                        allPeople.get(Integer.parseInt(args[a])).setSex(Sex.MALE);
                    } else {
                        if (args[a + 2].equalsIgnoreCase("ж")) {
                            allPeople.get(Integer.parseInt(args[a])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[a])).setBirthDate(bdIn.parse(args[a + 3]));

                    }
                }
                break;
            case "-d":
                for (int a = 1; a < args.length; a++) {
                    allPeople.get(Integer.parseInt(args[a])).setName((null));
                    allPeople.get(Integer.parseInt(args[a])).setSex((null));
                    allPeople.get(Integer.parseInt(args[a])).setBirthDate((null));
                }

                break;
        }
    }
}