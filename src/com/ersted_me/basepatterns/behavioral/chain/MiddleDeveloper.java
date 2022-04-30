package com.ersted_me.basepatterns.behavioral.chain;

public class MiddleDeveloper extends Developer{

    public MiddleDeveloper(int skillLevel) {
        super(skillLevel);
    }

    @Override
    public void getSolution(String task) {
        System.out.println("Middle developer is solving task...");
    }
}
