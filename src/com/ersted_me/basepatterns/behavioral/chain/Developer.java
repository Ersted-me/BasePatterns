package com.ersted_me.basepatterns.behavioral.chain;

public abstract class Developer {
    private int skillLevel;
    private Developer nextDeveloper;

    public Developer(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void setNextDeveloper(Developer nextDeveloper) {
        this.nextDeveloper = nextDeveloper;
    }

    public void solveTask(String task, int complexity) {
        if (skillLevel >= complexity || nextDeveloper == null) {
            getSolution(task);
        }
        if (nextDeveloper != null) {
            nextDeveloper.solveTask(task, complexity);
        }
    }

    public abstract void getSolution(String task);
}
