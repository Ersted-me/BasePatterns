package com.ersted_me.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements Device {
    private String ownerName;
    private Mediator mediator;
    private List<String> notes = new ArrayList<>();

    public SmartPhone(String ownerName, Mediator mediator) {
        this.ownerName = ownerName;
        this.mediator = mediator;
    }

    @Override
    public void createNoteForEveryone(String note) {
        addNote(note);
        mediator.createNote(note, this);
    }

    @Override
    public void deleteNoteForEveryone(String note) {
        deleteNote(note);
        mediator.deleteNote(note, this);
    }

    @Override
    public void addNote(String note) {
        notes.add(note);
        System.out.println("Note have added on the device (" + ownerName + "): " + note + ".");
    }

    @Override
    public void deleteNote(String note) {
        boolean isDeleted = notes.removeIf(el -> el.equals(note));
        if (!isDeleted) {
            System.out.println("Note haven't found on the device. Device: " + ownerName + ". Note: " + note + ".");
            return;
        }
        System.out.println("Note deleted from the (" + ownerName + ") device. Note: \"" + note + "\".");
    }
}
