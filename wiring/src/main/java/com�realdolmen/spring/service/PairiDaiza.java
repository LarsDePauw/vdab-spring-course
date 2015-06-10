package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.FoodDistributionService;
import com.realdolmen.spring.domain.Visitor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class PairiDaiza implements Zoo {
    private String name;
    private List<Animal> animals = new ArrayList<>();
    private FoodDistributionService foodDistributionService;
    private int maxAnimalCount;
    private String ownerName;
    private double ticketPrice;

    // TODO fetch the FoodDistributionService

    public PairiDaiza(String name) {
        this.name = name;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void releaseAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public boolean accept(Visitor visitor) {
        System.out.println("Welcome visitor to " + getName());
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }

    public void setFoodDistributionService(FoodDistributionService foodDistributionService) {
        this.foodDistributionService = foodDistributionService;
    }
    @Override
    public void feedAnimals() {
        foodDistributionService.feedAnimalsByType(animals);
    }


    public FoodDistributionService getFoodDistributionService() {
        return foodDistributionService;
    }


    // TODO Call the FoodDistributionService to feed animals


}
