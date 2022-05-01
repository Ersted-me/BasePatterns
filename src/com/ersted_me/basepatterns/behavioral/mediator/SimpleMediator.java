package com.ersted_me.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleMediator implements Mediator {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device){
        devices.add(device);
    }

    @Override
    public void createNote(String note, Device device) {
        for(Device d: devices){
            if(d != device){
                d.addNote(note);
            }
        }
    }

    @Override
    public void deleteNote(String note, Device device) {
        for(Device d: devices){
            if(d != device){
                d.deleteNote(note);
            }
        }
    }
}
