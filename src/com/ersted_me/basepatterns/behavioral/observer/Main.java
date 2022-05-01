package com.ersted_me.basepatterns.behavioral.observer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.addUpdates(new Date().toString() + ": Create app.");

        User user = new User("Bogdan");
        User user1 = new User("Misha");

        app.addObserver(user);
        app.addObserver(user1);
        app.addUpdates(new Date().toString() + ": We fixed bugs.");

        app.removeUpdate(new Date().toString() + ": We fixed bugs.");
    }
}
