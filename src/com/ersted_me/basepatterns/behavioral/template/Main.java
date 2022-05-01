package com.ersted_me.basepatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        MenuTemplate main = new MainMenu();
        MenuTemplate settings = new SettingsMenu();

        main.showMenu();
        System.out.println();
        settings.showMenu();
    }
}
