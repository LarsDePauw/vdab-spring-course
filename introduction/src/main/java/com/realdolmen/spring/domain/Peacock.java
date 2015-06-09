package com.realdolmen.spring.domain;

public class Peacock extends Animal {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Peacock(String name) {
        super(name);
    }
}
