package com.ersted_me.basepatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Collection {
    private String name;
    private List<Animal> animals;

    public Zoo(String zooName) {
        this.name = zooName;
        animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    @Override
    public Iterator getIterator() {
        return new AnimalIterator();
    }

    private class AnimalIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < animals.size();
        }

        @Override
        public Object next() {
            return animals.get(index++);
        }
    }
}
