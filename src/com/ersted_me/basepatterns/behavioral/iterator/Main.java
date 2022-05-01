package com.ersted_me.basepatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("National Zoo");
        zoo.addAnimal(new Animal("Lion"));
        zoo.addAnimal(new Animal("Tiger"));
        zoo.addAnimal(new Animal("Elephant"));
        zoo.addAnimal(new Animal("Crocodile"));

        Iterator iterator = zoo.getIterator();
        System.out.println("Zoo name:\t\t\t\t\t\t" + zoo.getName());
        System.out.print("There are animals in the zoo:\t");

        while (iterator.hasNext()) {
            System.out.print(((Animal) iterator.next()).getName() + " ");
        }
    }
}
