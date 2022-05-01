package com.ersted_me.basepatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.playSong();

        alarm.changeState();
        alarm.playSong();

        alarm.changeState();
        alarm.playSong();
    }
}
