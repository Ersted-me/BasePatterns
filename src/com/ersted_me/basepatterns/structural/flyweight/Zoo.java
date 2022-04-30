package com.ersted_me.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private final Map<String, Animal> animalMap = new HashMap<>();

    public Animal showAnimalByName(String name){
        Animal animal = animalMap.get(name);
        if(animal == null){
            animal = buyAnimalByName(name);
            animalMap.put(animal.getName(), animal);
        }
        return animal;
    }

    private Animal buyAnimalByName(String name){
        System.out.println("Zoo is buying animal: " + name);
        return new Animal(name);
    }

}
