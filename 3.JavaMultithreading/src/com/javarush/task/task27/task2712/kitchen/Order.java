package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();
    }


    public int getTotalCookingTime() {
        Optional<Integer> result = dishes.stream().map(Dish::getDuration).reduce(Integer::sum);
        return result.get();

    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        } else {
            return String.format("Your order: %S of " + tablet.toString() + ", cooking time %dmin", dishes, getTotalCookingTime());
        }
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    protected void initDishes() throws IOException {
        dishes =ConsoleHelper.getAllDishesForOrder();
    }

}
