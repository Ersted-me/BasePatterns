package com.ersted_me.structural.bridge;

public class AACompany extends BuilderCompany{
    public AACompany(Bridge bridge) {
        super(bridge);
    }

    @Override
    void buildBridge() {
        System.out.println("AA company is building bridge: " + bridge.getTypeOfBridge());
    }
}
