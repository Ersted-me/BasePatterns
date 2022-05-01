package com.ersted_me.basepatterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        SimpleMediator mediator = new SimpleMediator();

        Device dev1 = new SmartPhone("Bogdan", mediator);
        Device dev2 = new SmartPhone("Misha", mediator);
        Device dev3 = new SmartPhone("Sasha", mediator);

        mediator.addDevice(dev1);
        mediator.addDevice(dev2);
        mediator.addDevice(dev3);

        System.out.println();

        dev1.createNoteForEveryone("first");
        System.out.println();

        dev2.deleteNote("first");
        System.out.println();

        dev1.deleteNoteForEveryone("first");

    }
}
