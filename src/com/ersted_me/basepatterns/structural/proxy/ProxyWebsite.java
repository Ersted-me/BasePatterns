package com.ersted_me.basepatterns.structural.proxy;

public class ProxyWebsite implements Website {
    private Website website;

    public ProxyWebsite(Website website) {
        this.website = website;
    }

    @Override
    public void downloadFile() {
        System.out.println("Proxy:\t\t Download file from website");
        website.downloadFile();
        System.out.println("Proxy:\t\t Renaming the file and redirecting the file to the user...");
    }
}
