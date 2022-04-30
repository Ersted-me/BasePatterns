package com.ersted_me.basepatterns.behavioral.command;

public interface Command {
    void execute();
    void revert();
}
