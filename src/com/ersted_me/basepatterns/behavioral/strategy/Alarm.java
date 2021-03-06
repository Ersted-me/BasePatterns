package com.ersted_me.basepatterns.behavioral.strategy;

public class Alarm {
    private State state;

    public Alarm() {
        state = new TurnOff();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void playSong(){
        state.doAction();
    }
}
