package com.ersted_me.basepatterns.structural.adapter;

public class TypeCSocketImpl implements TypeCSocket {
    @Override
    public void getPower() {
        System.out.println("Is giving power from type C socket");
    }
}
