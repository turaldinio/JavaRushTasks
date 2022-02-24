package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    ///Users/niklaus/Desktop/Слова
    ///Users/niklaus/Desktop/Слова2
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            Scanner scan = new Scanner(new FileInputStream(file1));
            while (scan.hasNextLine()) {
                allLines.add(scan.nextLine());
            }
            Scanner scanner = new Scanner(new FileInputStream(file2));
            while (scanner.hasNextLine()) {
                forRemoveLines.add(scanner.nextLine());
            }
            Solution solution = new Solution();
            solution.joinData();
            reader.close();
            scan.close();
            scanner.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            System.out.printf("строка %s совпала со строкой %s", allLines, forRemoveLines);
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
        System.out.println(allLines);
    }
}
