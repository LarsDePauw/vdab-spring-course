package com.realdolmen.spring.domain;


public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Animal(String name) {
        this.name = name;
    }
}
