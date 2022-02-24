package com.javarush.task.task20.task2009;

import java.io.*;

/* 
Как сериализовать static?
*/

public class Solution {
    public static class ClassWithStatic implements Externalizable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        @Override
        public String toString() {
            return this.i + " " + this.j + " ";
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject("Hello");
        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
           String l= (String) objectInput.readObject();
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2009/file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.j = 112;
            classWithStatic.i = 98;
            classWithStatic.writeExternal(objectOutputStream);
            ClassWithStatic classWithStatic1 = new ClassWithStatic();
            classWithStatic1.readExternal(objectInputStream);
            System.out.println(classWithStatic1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
