package com.ersted_me.basepatterns.creational.abstractfactory.digital;

import com.ersted_me.basepatterns.creational.abstractfactory.Watch;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Digital watch is showing time...");
    }
}
