package com.ersted_me.basepatterns.behavioral.visitor;

public class Child implements Person{
    @Override
    public void doHomework() {
        System.out.println("Do homework.");
    }
}
