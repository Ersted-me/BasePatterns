package com.ersted_me.basepatterns.behavioral.state;

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

    public void changeState(){
        if(state instanceof TurnOff){
            state = new TurnOn();
        }else if(state instanceof TurnOn){
            state = new TurnOff();
        }
    }
}
