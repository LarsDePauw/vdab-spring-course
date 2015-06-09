package com.realdolmen.spring.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AwesomeMixVolume1 implements Cassette {
    private String title = "Awesome Mix Volume 1";
    private String artist = "Various artists";
    @Override
    public void play() {
        System.out.println("Currently playing Awesome Mix Volume 1.");
    }
}
