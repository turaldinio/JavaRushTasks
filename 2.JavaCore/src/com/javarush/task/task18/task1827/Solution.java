package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static class Product {
        ///Users/niklaus/Desktop/Данные
        int id;
        String name, price, quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public static Product getProduct(String string) {
            String id = string.substring(0, 8).trim();
            String fileName = string.substring(8, 38).trim();
            String price = string.substring(38, 46).trim();
            String quantity = string.substring(46, 50).trim();
            return new Product(Integer.parseInt(id), fileName, price, quantity);
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            int max = 0;
            ArrayList<Product> list = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            String fileName = scan.nextLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while (fileReader.ready()) {
                Product product = Product.getProduct(fileReader.readLine());
                if(max<product.id){
                    max=product.id;
                }
               // list.add(product);
            }
            Product product = new Product(++max, args[1], args[2], args[3]);
            list.add(product);
            try (FileWriter writer = new FileWriter(fileName, true)) {
                for (Product products : list) {
                    writer.write("\n");
                    writer.write(products.toString());
                }
            }
            scan.close();
            fileReader.close();

        } catch (
                Exception exception) {
            exception.printStackTrace();
        }
    }
}