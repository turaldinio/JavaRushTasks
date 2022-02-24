package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOrder extends Order {

    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);

    }

    @Override
    protected void initDishes() throws IOException {
        this.dishes = new ArrayList<>();
        int dishCount = (int) (1 + Math.random() * Dish.values().length);
        for (int a = 0; a < dishCount; a++) {
            dishes.add(Dish.values()[(int) (Math.random() * Dish.values().length)]);
        }

    }


}
