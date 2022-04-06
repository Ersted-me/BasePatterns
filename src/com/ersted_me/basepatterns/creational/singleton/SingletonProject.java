package com.ersted_me.basepatterns.creational.singleton;

public class SingletonProject {
    private static SingletonProject instance;

    private SingletonProject() {
    }

    public static SingletonProject getInstance(){
        if (instance == null)
            instance = new SingletonProject();
        return instance;
    }
}
