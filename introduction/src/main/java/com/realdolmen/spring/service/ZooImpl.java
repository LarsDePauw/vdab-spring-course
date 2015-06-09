package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo {
    private List <Animal> animals = new ArrayList<>();

    public ZooImpl(List<Animal> animals) {
        this.animals = animals;
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
        return false;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }
}
