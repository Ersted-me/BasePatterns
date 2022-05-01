package com.ersted_me.basepatterns.behavioral.memento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setData(new Date().toString());
        System.out.println(originator);

        caretaker.setMemento(originator.save());

        originator.setData("wrong date");
        System.out.println(originator);

        originator.load(caretaker.getMemento());
        System.out.println(originator);
    }
}
