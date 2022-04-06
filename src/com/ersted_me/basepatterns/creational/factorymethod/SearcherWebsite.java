package com.ersted_me.basepatterns.creational.factorymethod;

public class SearcherWebsite implements Website{
    private String URL = "https://searcher.com/";

    @Override
    public String getURL() {
        return URL;
    }
}
