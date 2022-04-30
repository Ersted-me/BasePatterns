package com.ersted_me.basepatterns.behavioral.chain;

public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(int skillLevel) {
        super(skillLevel);
    }

    @Override
    public void getSolution(String task) {
        System.out.println("Senior developer is solving task...");
    }
}
