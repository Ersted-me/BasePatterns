package com.ersted_me.basepatterns.behavioral.template;

public abstract class MenuTemplate {
    void showMenu(){
        showContent();
        System.out.println("Exit");
    }
    abstract void showContent();
}
