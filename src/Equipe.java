import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome; // Nome da Equipe
    private String descricao; // Descrição da Equipe
    private List<Usuario> membros; // Lista de Membros do Projeto

    // Construtor da Classe Equipe
    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }

    // Get e Set do atributo nome
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

    // Get e Set do atributo privado membros
    public List<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(List<Usuario> membros) {
        this.membros = membros;
    }

    public void adicionarMembro(Usuario usuario){
        membros.add(usuario);
    }
}
