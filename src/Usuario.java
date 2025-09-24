public class Usuario {
    private String nomeCompleto; // Pode ser quebrado em campos "primeiroNome" e "segundoNome"
    private String cpf; // Pode ter cuidado na formatação para o formato "000.000.000-00"
    private String email; // No momento de obter valor pode ter verificação para formato
    private String cargo; // Valor definido a partir de uma lista de cargos
    private String login; // Verificação no BD para não haver duplicidade
    private String senha; // Valor criptografado no momento de criação
    private Perfil perfil; // Administrador, gerente, colaborador

    // Classe Construtora
    public Usuario(String nomeCompleto, String cpf, String email, String cargo, String login, String senha, Perfil perfil){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }


    // Getters e Setters

    // Get e Set do atributo privado nomeCompleto
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Get e Set do atributo privado cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Get e Set do atributo privado email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Get e Set do atributo privado cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Get e Set do atributo privado login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    // Get e Set do atributo privado senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Get e Set do atributo privado perfil
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
