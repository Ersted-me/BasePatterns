package com.ersted_me.basepatterns.behavioral.visitor;

public class VisitorImpl implements Visitor{
    @Override
    public void doJob(Person person) {
        person.doHomework();
    }
}
