import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        TarefaSimples sub1 = new TarefaSimples("Comprar tinta", "Ir à loja", dataAtual, "Pendente", dataAtual);
        TarefaSimples sub2 = new TarefaSimples("Pintar parede", "Usar tinta azul", dataAtual, "Em aberto", dataAtual);

        TarefaComSubtarefas tarefa = new TarefaComSubtarefas("Testando", "estou a testar", dataAtual, "sla");
        tarefa.addSubtarefa(sub1);
        tarefa.addSubtarefa(sub2);

        tarefa.exibirDetalhes();
    }
}
