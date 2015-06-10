package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@ComponentScan
public class ZooConfig {
    @Bean
    public Zoo zoo(FoodDistributionService foodDistributionService) {
        PairiDaiza zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        zoo.setFoodDistributionService(foodDistributionService);
        return zoo;
    }
    @Bean
    @Profile("production")
    public FoodRepository foodRepository() {
        FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Bear.class, new MeatyFood(""));
        foodRepository.addFoodForAnimalType(Tiger.class, new MeatyFood("trage huisdieren in zoetzure saus"));
        foodRepository.addFoodForAnimalType(Elephant.class, new VegiFood("Pekes en ertjes"));
        return foodRepository;
    }

    @Bean
    @Profile("test")
    public FoodRepository testFoodRepository(){
        FoodRepository testFoodRepository = new TestFoodRepository();
        testFoodRepository.addFoodForAnimalType(Bear.class, new Kibblefood(""));
        testFoodRepository.addFoodForAnimalType(Tiger.class, new Kibblefood(""));
        testFoodRepository.addFoodForAnimalType(Elephant.class, new Kibblefood(""));
        return testFoodRepository;
    }
}
