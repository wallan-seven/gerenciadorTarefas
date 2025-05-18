import java.time.LocalDate;

public class TarefaSimples extends Tarefa{
    private LocalDate dataFinal;

    public TarefaSimples (String titulo, String descricao, LocalDate dataCriacao, String status, LocalDate dataFinal){
        super(titulo, descricao, dataCriacao, status);
        this.dataFinal = dataFinal;
    }

    public LocalDate getDataFinal(){
        return dataFinal;
    }
    public void setDataFinal(LocalDate dataFinal){
        this.dataFinal = dataFinal;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("DATA ENTREGA: " + getDataFinal());
    }

    @Override
    public String toString() {
        return "TITULO: " + getTitulo() + ", DESCRIÇÃO: " + getDescricao() +", DATA CRIAÇÃO: " + getDataCriacao() + ", STATUS: " + getStatus() + ", PRAZO FINAL: " + dataFinal;
    }
}
