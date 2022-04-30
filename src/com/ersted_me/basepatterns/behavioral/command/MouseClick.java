package com.ersted_me.basepatterns.behavioral.command;

public class MouseClick implements Command{
    @Override
    public void execute() {
        System.out.println("Mouse is clicked.");
    }

    @Override
    public void revert() {
        System.out.println("Mouse isn't clicked");
    }
}
