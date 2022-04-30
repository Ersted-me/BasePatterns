package com.ersted_me.basepatterns.behavioral.chain;

public class JuniorDeveloper extends Developer{
    public JuniorDeveloper(int skillLevel) {
        super(skillLevel);
    }

    @Override
    public void getSolution(String task) {
        System.out.println("Junior is solving task...");
    }
}
