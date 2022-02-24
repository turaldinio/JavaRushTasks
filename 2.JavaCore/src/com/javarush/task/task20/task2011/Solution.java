package com.javarush.task.task20.task2011;

import java.io.*;

/* 
Externalizable для апартаментов
*/

public class Solution {

    public static class Apartment implements Externalizable {

        private static String address="Popskaya";
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.address);
            objectOutput.writeInt(this.year);
            objectOutput.flush();


        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this.address= (String) objectInput.readObject();
            this.year = objectInput.readInt();

        }
    }

    public static void main(String[] args) {
        try {
            Apartment apartment = new Apartment("Varshavsraya", 41);
            File file = new File("/Users/niklaus/Documents/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2011/file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            apartment.writeExternal(objectOutputStream);
           // apartment.readExternal(objectInputStream);
            Apartment apartment1=new Apartment();
            apartment1.readExternal(objectInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
