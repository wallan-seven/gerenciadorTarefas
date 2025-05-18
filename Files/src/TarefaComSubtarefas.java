import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TarefaComSubtarefas extends Tarefa{

    private List<TarefaSimples> subtarefas;

    public TarefaComSubtarefas(String titulo, String descricao, LocalDate dataCriacao, String status){
        super(titulo, descricao, dataCriacao, status);
        this.subtarefas = new ArrayList<>();
    }

    public void addSubtarefa(TarefaSimples subtarefa){
        subtarefas.add(subtarefa);
    }

    public List<TarefaSimples> getSubtarefas(){
        return subtarefas;
    }

    public int contarSubtarefas() {
        return subtarefas.size();
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\n\nA TAREFA " + getTitulo() + " CONTA COM TOTAL DE " + contarSubtarefas() + " SUBTAREFAS!\n\n");

        System.out.println("Subtarefas:");
        for (TarefaSimples t : subtarefas) {
            System.out.println(" - " + t);
        }
    }

}
