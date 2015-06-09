package com.realdolmen.spring.domain;

public class MeatyFood extends Food {

    public MeatyFood() {
    }

    public MeatyFood(String name) {
        super(name);
    }

    public String toString() {
        double i =   Math.random()*4;
        String food;
        switch ((int)i) {
            case 1:
                food = "vlezekes van't frituur";
                break;
            case 2:
                food = "hamburgers";
                break;
            case 3:
                food = "chickennuggets";
                break;
            case 4:
                food = "loze vinken";

            default:
                food = "meatiness";
                break;
        }
        return food;
    }
}
