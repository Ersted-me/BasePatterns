package com.ersted_me.basepatterns.structural.adapter;

public class TypeCToTypeAAdapter implements TypeASocket{
    private TypeCSocket typeCSocket;

    public TypeCToTypeAAdapter(TypeCSocket typeCSocket) {
        this.typeCSocket = typeCSocket;
    }

    @Override
    public void getPower() {
        typeCSocket.getPower();
    }
}
