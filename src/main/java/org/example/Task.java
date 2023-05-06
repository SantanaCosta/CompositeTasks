package org.example;

import java.time.Duration;

public class Task extends TaskComponent {
    private String description;
    private Duration duration;

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

    @Override
    public void print() {
        System.out.print(description + "\t" + duration.toString() + "\n");
    }
}
