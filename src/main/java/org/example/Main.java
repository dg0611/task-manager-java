package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("Número total de tarefas na lista: " + lista.obterNumeroTotalTarefas());

        System.out.println("\nAdicionando tarefas...");
        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 02");
        lista.adicionarTarefa("Tarefa 03");
        System.out.println("Tarefas adicionadas!");

        System.out.println("\nLista de tarefas:");
        System.out.println(lista.obterDescricoesTarefas());
        System.out.println("\nRemovendo tarefas com descrição 'Tarefa 01'...");
        lista.removerTarefa("Tarefa 01");

        System.out.println("\nLista de tarefas atualizada:");
        System.out.println(lista.obterDescricoesTarefas());

        System.out.println("\nNúmero total de tarefas na lista: " + lista.obterNumeroTotalTarefas());

    }
}