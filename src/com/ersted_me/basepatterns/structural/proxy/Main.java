package com.ersted_me.basepatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Website website = new ProxyWebsite(new WebsiteImpl());
        website.downloadFile();
    }
}
