package org.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompositeTask schedule = new CompositeTask("Agenda completa");

        // Tarefa composta de SI702
        CompositeTask si702 = new CompositeTask("Estudar última aula de SI702");

        si702.addTask(new Task("Reler conteúdo", Duration.ofHours(1)));
        si702.addTask(new Task("Fazer lista", Duration.ofMinutes(30)));
        si702.addTask(new Task("Inserir pontos importantes no Anki", Duration.ofMinutes(15)));

        schedule.addTask(si702);

        // Tarefa única de SI405
        schedule.addTask(new Task("Fazer projeto de SI405", Duration.ofHours(1).plusMinutes(30)));

        // Tarefa composta de ST765
        CompositeTask st765 = new CompositeTask("Finalizar projeto de ST765");

        CompositeTask st765luz = new CompositeTask("Colocar luz de ambiente");
        st765luz.addTask(new Task("Criar materiais", Duration.ofMinutes(20)));
        st765luz.addTask(new Task("Posicionar 12 fontes do tipo spot", Duration.ofMinutes(30)));
        st765.addTask(st765luz);
        st765.addTask(new Task("Fazer animação dos portões", Duration.ofHours(1).plusMinutes(45)));

        schedule.addTask(st765);

        schedule.print();
    }
}