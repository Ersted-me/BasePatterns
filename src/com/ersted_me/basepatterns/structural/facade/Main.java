package com.ersted_me.basepatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        BuilderCompanyFacade facade = new BuilderCompanyFacade();
        facade.createProject();
    }
}
