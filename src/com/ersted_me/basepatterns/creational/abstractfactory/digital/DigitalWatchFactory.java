package com.ersted_me.basepatterns.creational.abstractfactory.digital;

import com.ersted_me.basepatterns.creational.abstractfactory.Watch;
import com.ersted_me.basepatterns.creational.abstractfactory.WatchFactory;

public class DigitalWatchFactory implements WatchFactory {
    @Override
    public Watch create() {
        return new DigitalWatch();
    }
}
