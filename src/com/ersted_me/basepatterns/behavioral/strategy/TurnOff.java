package com.ersted_me.basepatterns.behavioral.strategy;

public class TurnOff implements State {
    @Override
    public void doAction() {
        System.out.println("Sleeping...");
    }
}
