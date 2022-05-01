package com.ersted_me.basepatterns.behavioral.visitor;

public class Parent implements Person{
    @Override
    public void doHomework() {
        System.out.println("Check homework of child.");
    }
}
