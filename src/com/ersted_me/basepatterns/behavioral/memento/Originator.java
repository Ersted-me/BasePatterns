package com.ersted_me.basepatterns.behavioral.memento;

public class Originator {
    private String data;

    public void setData(String data){
        this.data = data;
    }

    public Memento save(){
        return new Memento(data);
    }

    public void load(Memento memento){
        data = memento.getData();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "\nData:\t" + data +
                "\n}";
    }
}
