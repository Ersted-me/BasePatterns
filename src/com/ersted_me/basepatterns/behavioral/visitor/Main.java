package com.ersted_me.basepatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        Person child = new Child();
        Person parent = new Parent();

        visitor.doJob(child);
        visitor.doJob(parent);
    }
}
