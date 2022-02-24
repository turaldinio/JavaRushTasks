package com.javarush.task.task25.task2503;

import java.util.*;

public enum Column implements Columnable {
    Customer("Customer"),//-1
    BankName("Bank Name"),//2
    AccountNumber("Account Number"),//1
    Amount("Available Amount");//0

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList();
        TreeMap<Integer, Column> treeMap = new TreeMap<>();
        Column[] masCol = values();
        for (int a = 0; a < realOrder.length; a++) {
            treeMap.put(realOrder[a], masCol[a]);
        }
        treeMap.remove(-1);
        result.addAll(treeMap.values());
        return result;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
        return realOrder[this.ordinal()] >= 0;
    }

    @Override
    public void hide() {
        Column[] masColumn = values();
        for (int a = 0; a < masColumn.length; a++) {
            if (masColumn[a].columnName.equalsIgnoreCase(this.columnName)) {

                realOrder[a] = -1;
            }
        }

    }
}
