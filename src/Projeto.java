import java.util.ArrayList;
import java.util.Date;

public class Projeto {
    private String nome; // Nome do Projeto
    private String descricao; // Descrição do Projeto
    private Date dataInicio; // Data de Início do Projeto
    private Date dataFimPrevista; // Data prevista para finalização do Projeto
    private StatusProjeto status; // Situação do Projeto
    private Usuario gerenteResponsavel; // Gerente responsável pelo projeto
    private Equipe equipe; // Equipe responsável pelo projeto

    // Classe Construtora
    public Projeto(String nome, String descricao, Date dataInicio, Date dataFimPrevista, StatusProjeto status, Usuario gerenteResponsavel, Equipe equipe) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFimPrevista = dataFimPrevista;
        this.status = status;
        this.gerenteResponsavel = gerenteResponsavel;
        this.equipe = equipe;
    }

    // Getters e Setters

    // Get e Set do atributo privado nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get e Set do atributo privado descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Get e Set do atributo privado dataInicio
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    // Get e Set do atributo privado dataFimPrevista
    public Date getDataFimPrevista() {
        return dataFimPrevista;
    }

    public void setDataFimPrevista(Date dataFimPrevista) {
        this.dataFimPrevista = dataFimPrevista;
    }

    // Get e Set do atributo privado status
    public StatusProjeto getStatus() {
        return status;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    // Get e Set do atributo privado gerenteResponsavel
    public Usuario getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Usuario gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }

    // Get e Set do atributo privado equipe
    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
