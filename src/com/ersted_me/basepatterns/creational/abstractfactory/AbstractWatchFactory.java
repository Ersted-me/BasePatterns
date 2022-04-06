package com.ersted_me.basepatterns.creational.abstractfactory;

import com.ersted_me.basepatterns.creational.abstractfactory.digital.DigitalWatchFactory;
import com.ersted_me.basepatterns.creational.abstractfactory.smart.SmartWatchFactory;

public class AbstractWatchFactory {
    public static WatchFactory getWatchFactory(Category category){
        switch (category){
            case SMART:
                return new SmartWatchFactory();
            case DIGITAL:
                return new DigitalWatchFactory();
            default:
                return null;
        }
    }
}
