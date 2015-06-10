package com.realdolmen.spring.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;

public class FoodRepositoryImpl implements FoodRepository {
    private HashMap<Class<? extends Animal>, Food> foodTypes = new HashMap<>();

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> clazz, Food food) {
    foodTypes.put(clazz, food );
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> clazz) {
       return foodTypes.get(clazz);
    }
}