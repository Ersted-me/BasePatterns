package com.ersted_me.basepatterns.structural.adapter;

public class ElectronicDevice {
    public void powerOn(TypeASocket typeASocket){
        typeASocket.getPower();
        System.out.println("Device is turned on.");
    }
    public void powerOff(){
        System.out.println("Device is turned off.");
    }
}
