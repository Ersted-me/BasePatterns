package com.ersted_me.structural.bridge;

public class BBCompany extends BuilderCompany {
    public BBCompany(Bridge bridge) {
        super(bridge);
    }

    @Override
    void buildBridge() {
        System.out.println("BB company is building bridge: " + bridge.getTypeOfBridge());
    }
}
