package com.ersted_me.basepatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    List<Command> commands;

    public CommandExecutor() {
        commands = new ArrayList<>();
    }

    void addCommand(Command command){
        commands.add(command);
    }

    void runCommands(){
        for(Command command: commands){
            command.execute();
        }
    }

    void revertCommands(){
        for(Command command: commands){
            command.revert();
        }
    }
}
