package com.ersted_me.basepatterns.creational.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("someName");
        System.out.println(watch);

        Watch cloneWatch = (Watch) watch.getCopy();
        System.out.println(cloneWatch);
    }
}
