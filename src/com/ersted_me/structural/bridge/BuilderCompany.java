package com.ersted_me.structural.bridge;

public abstract class BuilderCompany {
    protected Bridge bridge;

    public BuilderCompany(Bridge bridge) {
        this.bridge = bridge;
    }

    abstract void buildBridge();
}
