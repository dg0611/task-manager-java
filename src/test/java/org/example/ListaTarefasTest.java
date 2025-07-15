package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaTarefasTest {

    @Test
    void obterNumeroTotalTarefas() {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 02");
        lista.adicionarTarefa("Tarefa 03");

        assertEquals(3, lista.obterNumeroTotalTarefas());
    }

    @Test
    void adicionarTarefa() {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Tarefa 01");
        assertEquals(1, lista.obterNumeroTotalTarefas());
    }

    @Test
    void obterDescricoesTarefas() {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar java");
        lista.adicionarTarefa("Estudar Kotlin");

        var retorno = lista.obterDescricoesTarefas();
        assertEquals(2, retorno.size());
        assertTrue(retorno.stream().anyMatch(t -> t.getDescricao().equals("Estudar Java")));
        assertTrue(retorno.stream().anyMatch(t -> t.getDescricao().equals("Estudar Kotlin")));
    }

    @Test
    void removerTarefa() {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar java");
        lista.adicionarTarefa("Estudar Kotlin");

        lista.removerTarefa("Estudar");
        var retorno = lista.obterDescricoesTarefas();

        assertEquals(2, retorno.size());
        assertFalse(retorno.contains("Estudar java"));
        assertFalse(retorno.contains("Estudar kotlin"));
    }
}