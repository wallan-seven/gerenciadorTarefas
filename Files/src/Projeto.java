public class Projeto {

    private String nome;
    private String descricao;
    private Usuario usuarioResponsavel;

    public Projeto (String nome, String descricao, Usuario userResp){
        this.nome = nome;
        this.descricao = descricao;
        this.usuarioResponsavel = userResp;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getDescricao (){
        return descricao;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public void setUsuarioResponsavel (Usuario userResp){
        this.usuarioResponsavel = userResp;
    }
}
