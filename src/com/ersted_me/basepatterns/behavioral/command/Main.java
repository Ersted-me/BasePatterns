package com.ersted_me.basepatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        CommandExecutor ce = new CommandExecutor();
        ce.addCommand(new ButtonPress());
        ce.addCommand(new MouseClick());
        ce.runCommands();
        ce.revertCommands();
    }
}
