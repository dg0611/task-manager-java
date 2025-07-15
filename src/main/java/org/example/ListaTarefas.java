package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<Tarefa> listaTarefa = new ArrayList<>();

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public List<Tarefa> obterDescricoesTarefas() {
        return listaTarefa;
    }

    public void removerTarefa(String descricao) {
        listaTarefa.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

}
