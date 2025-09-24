import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exemplo de teste para criação de usuário e projeto

        // Criando um usuário gerente
        Usuario gerente = new Usuario(
                "Maria Silva", // Nome do usuário gerente
                "123.456.789-00", // Cpf do usuário gerente
                "maria@email.com", // Email do usuário gerente
                "Gerente de Projetos", // Cargo do usuário gerente
                "maria", // Login do usuário gerente
                "senha123", // Senha do usuário gerente
                Perfil.GERENTE // Tipo de perfil do usuário gerente
        );

        // Criando um usuário colaborador Desenvolvedor Back End
        Usuario devBackEnd = new Usuario(
                "João Pereira", // Nome do usuario devBackEnd
                "987.654.321-00", // Cpf do usuario devBackEnd
                "joao@email.com", // Email do usuario devBackEnd
                "Desenvolvedor Back End", // Cargo do usuario devBackEnd
                "joao", // Login do usuario devBackEnd
                "senha456", // Senha do usuario devBackEnd
                Perfil.COLABORADOR // Tipo de perfil do usuario devBackEnd
        );

        // Criação de um usuário colaborador Desenvolvedor Front End
        Usuario devFrontEnd = new Usuario(
                "Ana Souza", // Nome do usuario devFrontEnd
                "111.222.333-44", // Cpf do usuario devFrontEnd
                "ana@email.com", // Email do usuario devFrontEnd
                "Desenvolvedora Frond End", // Cargo do usuario devFrontEnd
                "ana", // Login do usuario devFrontEnd
                "senha789", // Senha do usuario devFrontEnd
                Perfil.COLABORADOR // Tipo de perfil do usuario devFrontEnd
        );

        // Criando uma equipe com os três usuários criados
        Equipe equipe = new Equipe("Equipe Desenvolvimento",
                "Equipe responsável pelo Desenvolvimento do Sistema"
        );

    equipe.adicionarMembro(devBackEnd);
    equipe.adicionarMembro(devFrontEnd);

        // Criando um projeto
        Projeto projeto = new Projeto(
                "Sistema de Gestão de Projetos", // Nome do Projeto
                "Desenvolvimento de um sistema para gerenciar projetos e equipes", // Descrição do projeto
                new java.util.Date(), // Data atual
                new java.util.Date(System.currentTimeMillis() + (1000L*60*60*24*30)), // Data atual +30 dias
                StatusProjeto.PLANEJADO, // Tipo de situação do projeto
                gerente, // Gerente responsável, no caso é o usuário gerente instanciado,
                equipe
        );

        // Criando uma equipe

        // Exibindo informações
        System.out.println("Projeto criado: " + projeto.getNome()); // Apresenta o nome do projeto
        System.out.println("Gerente responsável: " + projeto.getGerenteResponsavel().getNomeCompleto()); // Apresenta o nome completo do gerente responsável
        System.out.println("Equipe do projeto: " + projeto.getEquipe().getNome()); // Apresenta o nome da equipe do projeto
        System.out.println("Descrição da equipe: " + projeto.getEquipe().getDescricao()); // Apresenta a descrição da equipe do projeto
        System.out.println("Membros da equipe: "); // Inicializa o processo de apresentar os membros da equipe do projeto
        for(Usuario membro : projeto.getEquipe().getMembros()){ // Loop for-each que itera para cada usuário membro dentro da equipe do projeto
            System.out.println("- " + membro.getNomeCompleto() + " (" + membro.getCargo() + ")"); // Concatenação para que seja apresentado no formato "- Usuário (Cargo)"
        }

    }
}