//package com.javarush.task.task20.task2015;
//
//import java.io.*;
//
///*
//Переопределение сериализации
//*/
//
//public class Solution implements Serializable, Runnable {
//    transient private Thread runner;
//    private int speed;
//
//    public Solution(int speed) {
//        this.speed = speed;
//        runner = new Thread(this);
//        runner.start();
//    }
//
//    public void run() {
//        // do something here, doesn't matter what
//        System.out.println("нить запущена");
//    }
//
//    /**
//     * Переопределяем сериализацию.
//     * Для этого необходимо объявить методы:
//     * private void writeObject(ObjectOutputStream out) throws IOException
//     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
//     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
//     */
//    private void writeObject(ObjectOutputStream out) throws IOException {
//        out.defaultWriteObject();
//    }
//
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        in.defaultReadObject();
//        runner = new Thread(this);
//        runner.start();
//    }
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Solution solution = new Solution(12);
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        objectOutputStream.writeObject(solution);
//
//synchronized ()
//
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
//        Solution copeSolution = (Solution) objectInputStream.readObject();
//        System.out.println(copeSolution.speed);
//    }
//}
//
