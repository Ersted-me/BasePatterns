package com.ersted_me.basepatterns.creational.abstractfactory.smart;

import com.ersted_me.basepatterns.creational.abstractfactory.Watch;
import com.ersted_me.basepatterns.creational.abstractfactory.WatchFactory;

public class SmartWatchFactory implements WatchFactory {
    @Override
    public Watch create() {
        return new SmartWatch();
    }
}
