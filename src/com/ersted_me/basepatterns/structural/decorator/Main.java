package com.ersted_me.basepatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Note note = new NoteWithDiagram(new NoteImpl());
        note.addNote();
    }
}
