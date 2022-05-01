package com.ersted_me.basepatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.playSong();

        alarm.setState(new TurnOn());
        alarm.playSong();

        alarm.setState(new TurnOff());
        alarm.playSong();
    }
}
