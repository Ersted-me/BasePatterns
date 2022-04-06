package com.ersted_me.basepatterns.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        SingletonProject singletonProject = SingletonProject.getInstance();

        System.out.println(singletonProject);

        System.out.println(SingletonProject.getInstance());
        System.out.println(SingletonProject.getInstance());
        System.out.println(SingletonProject.getInstance());
    }
}
