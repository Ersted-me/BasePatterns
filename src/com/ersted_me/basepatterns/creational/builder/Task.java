package com.ersted_me.basepatterns.creational.builder;

public class Task {
    private final String ownerName;
    private final String description;
    private final Priority priority;
    private final Status status;

    private Task(TaskBuilder builder) {
        this.ownerName = builder.ownerName;
        this.description = builder.description;
        this.priority = builder.priority;
        this.status = builder.status;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public static class TaskBuilder{
        private final String ownerName;
        private String description;
        private Priority priority;
        private Status status;

        public TaskBuilder(String ownerName) {
            this.ownerName = ownerName;
        }

        public TaskBuilder setDescription(String description){
            this.description = description;
            return this;
        }

        public TaskBuilder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TaskBuilder setStatus(Status status) {
            this.status = status;
            return this;
        }

        public Task build(){
            return new Task(this);
        }
    }
}
