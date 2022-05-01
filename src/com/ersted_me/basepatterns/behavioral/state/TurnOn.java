package com.ersted_me.basepatterns.behavioral.state;

public class TurnOn implements State{
    @Override
    public void doAction() {
        System.out.println("Ringing...");
    }
}
