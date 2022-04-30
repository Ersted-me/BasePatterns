package com.ersted_me.basepatterns.behavioral.command;

public class ButtonPress implements Command{
    @Override
    public void execute() {
        System.out.println("Button is pressed.");
    }

    @Override
    public void revert() {
        System.out.println("Button isn't pressed.");
    }
}
