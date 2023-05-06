package org.example;

import java.time.Duration;
import java.util.List;

public class CompositeTask extends TaskComponent {
    private String description;
    private List<Task> tasks;

    public CompositeTask(String description, List<Task> tasks) {
        this.description = description;
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    @Override
    public Duration getDuration() {
        Duration componentDuration = Duration.ZERO;

        for (Task task : this.tasks) componentDuration = componentDuration.plus(task.getDuration());

        return componentDuration;
    }

    @Override
    public void print() {
        System.out.println(description);
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.print("\n" + (i+1) + ". ");
            this.tasks.get(i).print();
        }
    }
}
