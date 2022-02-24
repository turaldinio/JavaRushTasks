package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/

public class Solution implements Serializable {
    String name;

    public A getOriginalObject(ObjectInputStream objectStream) {
        A a;
        try {
            a = (A) objectStream.readObject();
        } catch (Exception e) {
            return null;
        }
        return a;
    }

    public class A implements Serializable {
        String name;
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.A a = solution.new A();
        Solution.B b = solution.new B();
        a.name = "sashulka";
        solution.name = "turaldinio";
        Solution solution1 = new Solution();

        File file = new File("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2017/file");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            //objectOutputStream.writeObject(a);
            objectOutputStream.writeObject(b);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            System.out.println(solution1.getOriginalObject(objectInputStream));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
