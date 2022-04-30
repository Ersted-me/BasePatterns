package com.ersted_me.basepatterns.structural.decorator;

public class NoteWithDiagram extends NoteDecorator {
    public NoteWithDiagram(Note note) {
        super(note);
    }

    @Override
    public void addNote() {
        note.addNote();
        addDiagram();
    }

    private void addDiagram(){
        System.out.println("Diagram added.");
    }
}
