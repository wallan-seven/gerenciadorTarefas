import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao; /*quem sabe colocar os segundos*/
    private String status;

    public Tarefa (String titulo, String descricao, LocalDate dataCriacao, String status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public String getStatus (){
        return status;
    }

    public void setStatus (String status){
        this.status = status;
    }

    public void exibirDetalhes(){
        System.out.printf("TAREFA:\n     " + getTitulo());
        System.out.print("\n---------------------\n");
        System.out.printf("DESCRIÇÃO:\n     " + getDescricao());
        System.out.print("\n---------------------\n");
        System.out.printf("DATA CRIAÇÂO:\n     " + getDataCriacao());
        System.out.printf("\nSTATUS:\n     " + getStatus());
        System.out.print("\n");
    }
}
