package com.ersted_me.basepatterns.creational.abstractfactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        WatchFactory wf = AbstractWatchFactory.getWatchFactory(Category.SMART);

        if (wf != null) {
            Watch watch = wf.create();
            watch.showTime();
        }
    }

}
