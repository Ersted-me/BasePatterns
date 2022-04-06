package com.ersted_me.basepatterns.creational.abstractfactory.smart;

import com.ersted_me.basepatterns.creational.abstractfactory.Watch;

public class SmartWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Smart watch is showing time...");
    }
}
