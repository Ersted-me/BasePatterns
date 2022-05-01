package com.ersted_me.basepatterns.behavioral.observer;

import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void sendNotification(List<String> updates) {
        System.out.println("Dear " + name + "\nUpdates:");
        for (String str : updates) {
            System.out.println("\t" + str);
        }
        System.out.println("\n================================\n");
    }
}
