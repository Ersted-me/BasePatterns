package com.ersted_me.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice elDev = new ElectronicDevice();
        TypeCSocket typeCSocket = new TypeCSocketImpl();

        TypeCToTypeAAdapter adapter = new TypeCToTypeAAdapter(typeCSocket);

        elDev.powerOn(adapter);

    }
}
