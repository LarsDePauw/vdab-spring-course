package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ZooConfig {

    @Bean
    public ZooImpl zoo(){
        ZooImpl dierentuin = new ZooImpl(new ArrayList<Animal>());
        dierentuin.addAnimal(bear());
        dierentuin.addAnimal(peacock());
        dierentuin.addAnimal(lion());
        dierentuin.addAnimal(velociraptor());
        return dierentuin;
    }

    @Bean
    public Bear bear(){
        return new Bear("Lars de ijsbeer");
    }
    @Bean
     public Peacock peacock(){
        return new Peacock("Lars de pauw");
    }
    @Bean
    public Lion lion(){
        return new Lion("Lionel Richard de leeuw");
    }
    @Bean
    public Velociraptor velociraptor(){
        return new Velociraptor("Veronique de velociraptor");
    }
}
