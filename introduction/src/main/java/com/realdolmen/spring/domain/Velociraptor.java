package com.realdolmen.spring.domain;

/**
 * Created by Lars De Pauw on 9/06/15.
 */
public class Velociraptor extends Animal {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Velociraptor(String name) {
        super(name);
    }
}
