package com.realdolmen.spring.domain;

public class CassetteSingleton implements Cassette {
    private static CassetteSingleton ourInstance = new CassetteSingleton();

    public static CassetteSingleton getInstance() {
        return ourInstance;
    }

    private CassetteSingleton() {
    }

    @Override
    public void play() {
        System.out.println("Currently playing Awesome Mix Volume 1.");
    }
}
