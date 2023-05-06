package org.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompositeTask schedule = new CompositeTask("Agenda: ");

        CompositeTask projeto = new CompositeTask("Fazer projeto de SI405");

        projeto.addTask(new Task("t1", Duration.ofHours(1)));
        projeto.addTask(new Task("t2", Duration.ofHours(1)));

        schedule.addTask(projeto);

        schedule.print();
    }
}