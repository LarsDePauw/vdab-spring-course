package com.realdolmen.spring.domain;


public class Lion extends Animal {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Lion(String name) {
        super(name);
    }
}

