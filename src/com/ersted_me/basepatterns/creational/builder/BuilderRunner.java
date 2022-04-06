package com.ersted_me.basepatterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Task task = new Task.TaskBuilder("Mark")
                .setDescription("Some description")
                .setPriority(Priority.MEDIUM)
                .setStatus(Status.ACTIVE)
                .build();

        Task task1 = new Task.TaskBuilder("Tom")
                .build();
    }
}
