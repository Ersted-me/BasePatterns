package com.ersted_me.basepatterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Developer senior = new SeniorDeveloper(SkillLevel.HARD);

        Developer middle = new MiddleDeveloper(SkillLevel.MIDDLE);
        middle.setNextDeveloper(senior);

        Developer junior = new JuniorDeveloper(SkillLevel.EASY);
        junior.setNextDeveloper(middle);

        junior.solveTask("task for junior", SkillLevel.EASY);

    }
}
