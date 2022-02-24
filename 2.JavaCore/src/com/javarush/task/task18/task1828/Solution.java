package com.javarush.task.task18.task1828;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }


        public static Product getProduct(String string) {
            String id = string.substring(0, 8);
            String name = string.substring(8, 38);
            String price = string.substring(38, 46);
            String quantity = string.substring(46, 50);
            return new Product(Integer.parseInt(id), name, price, quantity);
        }

    }

    //            /Users/niklaus/Desktop/Данные
    public static void main(String[] args) {
        switch (args[0]) {
            case "-u":
                Scanner scan = new Scanner(System.in);
                String fileName = scan.nextLine();
                int id = Integer.parseInt(args[1]);
                Product product = new Product(id, args[2], args[3], args[4]);
                try (
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));

                ) {
                    ArrayList<String> list = new ArrayList<>();
                    while (reader.ready()) {
                        String line = reader.readLine();
                        // int fileId = Integer.parseInt(line.substring(0, 8).trim());

                        list.add(line);
                    }
                    try (FileWriter writer = new FileWriter(fileName)) {
                        for (int a = 0; a < list.size(); a++) {
                            int fileId = Integer.parseInt(list.get(a).substring(0, 8).trim());
                            if (fileId == id) {
                                writer.write(product.toString());
                                writer.write("\n");
                            } else {
                                writer.write(list.get(a));
                                writer.write("\n");
                            }
                        }
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                scan.close();
                break;
            case "-d":
                // /Users/niklaus/Desktop/Данные
                id = Integer.parseInt(args[1]);
                scan = new Scanner(System.in);
                fileName = scan.nextLine();
                ArrayList<String> list = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    while (reader.ready()) {
                        String line = reader.readLine();
                        int timeId = Integer.parseInt(line.substring(0, 8).trim());
                        if (timeId != id) {
                            list.add(line);
                        }
                    }
                    try (FileWriter writer = new FileWriter(fileName)) {
                        for (String k : list) {
                            writer.write(k);
                            writer.write("\n");
                        }
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                scan.close();
                break;
        }
    }
}
