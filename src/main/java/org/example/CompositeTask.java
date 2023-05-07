package org.example;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class CompositeTask extends TaskComponent {
    private String description;
    private List<TaskComponent> tasks = new LinkedList<>();

    public CompositeTask(String description) {
        this.description = description;
    }

    public void addTask(TaskComponent task) {
        this.tasks.add(task);
        task.setParent(this);
    }

    public void removeTask(TaskComponent task) {
        this.tasks.remove(task);
    }

    @Override
    public Duration getDuration() {
        Duration componentDuration = Duration.ZERO;

        for (TaskComponent task : this.tasks) componentDuration = componentDuration.plus(task.getDuration());

        return componentDuration;
    }

    public int countParents(TaskComponent task){
        if(task.parent == null)
            return 0;
        else
            return 1 + countParents(task.parent);
    }

    @Override
    public void print() {
        int tabsQty = countParents(this);

        System.out.println(description + " (" + this.getDuration().toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase() + ")");

        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.print("\n");

            for(int j = 0; j < tabsQty; j++)
                System.out.print("\t");

            System.out.print((i+1) + " ");

            this.tasks.get(i).print();
        }
    }
}
