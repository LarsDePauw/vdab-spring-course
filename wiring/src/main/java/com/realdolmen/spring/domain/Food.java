package com.realdolmen.spring.domain;

import org.springframework.stereotype.Component;

@Component
public abstract class Food {
    private String name;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {

        this.name = name;
    }
}
