package com.ersted_me.basepatterns.behavioral.mediator;

public interface Device {
    void createNoteForEveryone(String note);
    void deleteNoteForEveryone(String note);
    void addNote(String note);
    void deleteNote(String note);
}
