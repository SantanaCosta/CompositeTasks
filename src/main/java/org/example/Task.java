package org.example;

import java.time.Duration;

public class Task extends TaskComponent {
    private String description;
    private Duration duration;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Task(String description, Duration duration){
        this.description = description;
        this.duration = duration;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }
}
