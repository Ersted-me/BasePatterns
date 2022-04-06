package com.ersted_me.basepatterns.creational.factorymethod;

public class LibraryWebsite implements Website{
    private String URL = "https://www.library.com/";

    @Override
    public String getURL() {
        return URL;
    }
}
