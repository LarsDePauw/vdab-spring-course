package com.realdolmen.spring.domain;

import java.util.HashMap;


public class TestFoodRepository implements FoodRepository {
    private HashMap<Class<? extends Animal>, Food> foodTypes = new HashMap<>();

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> clazz, Food food) {
        foodTypes.put(clazz, food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> clazz) {
        return foodTypes.get(clazz);
    }
}
