package com.ersted_me.basepatterns.behavioral.memento;

public class Memento {
    private final String data;

    public Memento(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
