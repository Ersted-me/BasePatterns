package com.ersted_me.basepatterns.creational.factorymethod;

public class SearcherWebsiteFactory implements WebsiteFactory {
    @Override
    public Website createWebsite() {
        return new SearcherWebsite();
    }
}
