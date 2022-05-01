package com.ersted_me.basepatterns.behavioral.mediator;

public interface Mediator {
    void createNote(String note, Device device);
    void deleteNote(String note, Device device);
}
