package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    String filename;
    transient private FileOutputStream stream;


    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.filename = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(filename, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        try {
            Solution solution = new Solution("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/object");
            solution.writeObject("Shalom!");

            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/object"));
            oos.writeObject(solution);

            ObjectInputStream ois = new ObjectInputStream((new FileInputStream("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/object")));
            Solution solution2 = (Solution) ois.readObject();
            solution2.writeObject("Shalom again!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
