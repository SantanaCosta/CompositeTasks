package org.example;

import java.time.Duration;
import java.util.List;

public class CompositeTask extends TaskComponent {
    private List<Task> tasks;

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    @Override
    Duration getDuration() {
        Duration componentDuration = Duration.ZERO;

        for (Task task : this.tasks) componentDuration = componentDuration.plus(task.getDuration());

        return componentDuration;
    }
}
