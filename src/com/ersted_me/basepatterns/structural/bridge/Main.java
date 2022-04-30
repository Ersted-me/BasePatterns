package com.ersted_me.basepatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Bridge bridge = new ArchBridge();
        Bridge bridge1 = new MoonBridge();

        BuilderCompany bc = new AACompany(bridge);
        BuilderCompany bc1 = new BBCompany(bridge1);

        bc.buildBridge();
        bc1.buildBridge();
    }
}
