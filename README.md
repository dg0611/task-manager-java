# 📝 Task Manager Java

Projeto simples em Java para gerenciar uma lista de tarefas, desenvolvido com o objetivo de praticar lógica de programação orientada a objetos e testes unitários com JUnit 5.

---

## 📦 Estrutura do Projeto

Este projeto possui duas classes principais:

### 1. `Tarefa`

Representa uma tarefa individual com uma única propriedade:

- `descricao`: texto que descreve a tarefa.

```java
public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Descricao = " + descricao;
    }
}
```

---

### 2. `ListaTarefas`

Responsável por gerenciar uma lista de tarefas (`List<Tarefa>`), com os seguintes métodos:

- `void adicionarTarefa(String descricao)`: adiciona uma nova tarefa à lista.
- `void removerTarefa(String descricao)`: remove a tarefa com a descrição informada (ignorando maiúsculas/minúsculas).
- `List<Tarefa> obterDescricoesTarefas()`: retorna a lista de tarefas.
- `int obterNumeroTotalTarefas()`: retorna o número total de tarefas cadastradas.

---

## ✅ Testes

Os testes foram desenvolvidos utilizando **JUnit 5**, e validam os seguintes comportamentos:

- Adição de tarefas
- Remoção de tarefas
- Contagem correta do número de tarefas
- Consulta das descrições após alterações

> Para rodar os testes, basta executar a classe de testes em uma IDE como IntelliJ ou Eclipse com suporte ao JUnit 5.

---

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/task-manager-java.git
```

2. Importe o projeto em sua IDE (ex: IntelliJ IDEA)

3. Execute os testes ou utilize os métodos da classe `ListaTarefas` em um método `main()` para testar manualmente.

---

## 💡 Exemplo de Uso

```java
ListaTarefas lista = new ListaTarefas();
lista.adicionarTarefa("Estudar Java");
lista.adicionarTarefa("Fazer exercícios");
lista.removerTarefa("Tomar água");

System.out.println("Total: " + lista.obterNumeroTotalTarefas());
```

---

## 📁 Estrutura do Projeto

```
src/
├── org.example
│   ├── ListaTarefas.java
│   └── Tarefa.java

test/
├── org.example
│   └── ListaTarefasTest.java
```

---

## ✍️ Autor

Desenvolvido por **Diego Gonçalves** como exercício prático de Java com foco em POO e testes automatizados.
