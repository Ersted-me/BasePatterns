package com.ersted_me.basepatterns.structural.decorator;

public abstract class NoteDecorator implements Note {
    protected Note note;

    public NoteDecorator(Note note) {
        this.note = note;
    }

    public abstract void addNote();
}
