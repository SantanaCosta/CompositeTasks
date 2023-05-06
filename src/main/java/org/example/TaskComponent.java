package org.example;

import java.time.Duration;

public abstract class TaskComponent {
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract Duration getDuration();
    public abstract void print();
}
