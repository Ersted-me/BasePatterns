package com.ersted_me.basepatterns.creational.factorymethod;

public class FactoryRunner {
    public static void main(String[] args) {
        WebsiteFactory searcherWF = new LibraryWebsiteFactory();
        Website website = searcherWF.createWebsite();

        System.out.println(website.getURL());
    }
}
