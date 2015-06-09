package com.realdolmen.spring.domain;

import com.realdolmen.spring.CassetteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CassetteConfig.class);
        context.getBean(Cassette.class).play();
    }
}
