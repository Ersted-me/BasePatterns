package com.ersted_me.basepatterns.structural.decorator;

public class NoteWithPicture extends NoteDecorator{
    public NoteWithPicture(Note note) {
        super(note);
    }

    @Override
    public void addNote() {
        note.addNote();
        addPictures();
    }

    private void addPictures(){
        System.out.println("Pictures added.");
    }
}
