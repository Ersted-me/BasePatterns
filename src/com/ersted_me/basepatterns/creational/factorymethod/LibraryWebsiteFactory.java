package com.ersted_me.basepatterns.creational.factorymethod;

public class LibraryWebsiteFactory implements WebsiteFactory {
    @Override
    public Website createWebsite() {
        return new LibraryWebsite();
    }
}
