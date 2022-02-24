package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     //   System.out.println(new Solution(4));
        Solution savedObject = new Solution(12);
        FileOutputStream outputStream = new FileOutputStream("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/fileOutput");
        FileInputStream inputStream = new FileInputStream("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/fileOutput");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(savedObject);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Solution loadObject =(Solution) objectInputStream.readObject();
        System.out.println(savedObject.string=loadObject.string);


    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

}
