package com.ersted_me.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Application implements Observed {
    private List<String> updates = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public void addUpdates(String update) {
        this.updates.add(update);
        notifyObserver();
    }

    public void removeUpdate(String update) {
        this.updates.removeIf(el -> el.equals(update));
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        users.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : users){
            observer.sendNotification(updates);
        }
    }
}
