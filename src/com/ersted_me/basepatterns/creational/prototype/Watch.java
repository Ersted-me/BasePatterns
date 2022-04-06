package com.ersted_me.basepatterns.creational.prototype;

public class Watch implements Prototype {
    private final String companyName;

    public Watch(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public Object getCopy() {
        Watch watch = new Watch(companyName);
        return watch;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
