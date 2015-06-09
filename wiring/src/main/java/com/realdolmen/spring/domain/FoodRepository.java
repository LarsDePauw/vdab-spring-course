package com.realdolmen.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface FoodRepository {
    void addFoodForAnimalType(Class<? extends Animal> clazz, Food food);
    Food findFoodForAnimalType(Class<? extends Animal> clazz);
}
