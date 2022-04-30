package com.ersted_me.basepatterns.structural.proxy;

public class WebsiteImpl implements Website{
    @Override
    public void downloadFile() {
        System.out.println("Website:\t The file is being distributed.");
    }
}
