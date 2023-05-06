package org.example;

import java.time.Duration;

public abstract class TaskComponent {
    protected TaskComponent parent;
    protected String description;

    public TaskComponent getParent() {
        return parent;
    }

    public void setParent(TaskComponent parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract Duration getDuration();
    public abstract void print();
}
