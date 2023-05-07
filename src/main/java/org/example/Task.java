package org.example;

import java.time.Duration;

public class Task extends TaskComponent {
    private Task parent = null;
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
        System.out.print(description + " (" + duration.toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase() + ")\n");
    }
}
