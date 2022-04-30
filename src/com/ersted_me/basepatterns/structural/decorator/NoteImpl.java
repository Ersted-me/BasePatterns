package com.ersted_me.basepatterns.structural.decorator;

public class NoteImpl implements Note{
    @Override
    public void addNote() {
        System.out.println("Note added.");
    }
}
