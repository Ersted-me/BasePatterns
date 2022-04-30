package com.ersted_me.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Animal> animals = new ArrayList<>();

        animals.add(zoo.showAnimalByName("Tiger"));
        animals.add(zoo.showAnimalByName("Tiger"));
        animals.add(zoo.showAnimalByName("Monkey"));
        animals.add(zoo.showAnimalByName("Monkey"));
        animals.add(zoo.showAnimalByName("Hippo"));
        animals.add(zoo.showAnimalByName("Hippo"));


        for(Animal animal: animals){
            System.out.println(animal.getName());
        }
    }
}
