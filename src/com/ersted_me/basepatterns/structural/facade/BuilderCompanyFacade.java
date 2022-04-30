package com.ersted_me.basepatterns.structural.facade;

public class BuilderCompanyFacade {
    private final Builder builder = new Builder();
    private final Designer designer = new Designer();

    public void createProject(){
        designer.createDesign();
        builder.startBuilding();
    }
}
