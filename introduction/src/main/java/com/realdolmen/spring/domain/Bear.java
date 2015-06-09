package com.realdolmen.spring.domain;


public class Bear extends  Animal {
   private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Bear(String name) {
        super(name);
    }
}
