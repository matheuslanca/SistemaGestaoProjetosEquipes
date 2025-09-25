# 📌 Sistema de Gestão de Projetos e Equipes

Este projeto é um protótipo inicial de um **sistema para gestão de projetos e equipes**, desenvolvido em **Java**.  
O objetivo é fornecer uma base escalável para o gerenciamento de **usuários, equipes e projetos**, facilitando a distribuição de tarefas, acompanhamento de prazos e controle de responsabilidades.

---

## ✨ Funcionalidades Implementadas (MVP)

- Cadastro de **Usuários** com atributos como nome, CPF, e-mail, cargo, login, senha e perfil (Administrador, Gerente ou Colaborador).
- Cadastro de **Equipes** com nome, descrição e lista de membros vinculados.
- Cadastro de **Projetos** com nome, descrição, data de início, data prevista de término, status e equipe vinculada.
- Associação de **um gerente responsável** por projeto.
- Adição e listagem de membros em uma equipe.
- Exemplo de execução no `Main.java` com criação de usuários, equipes e projetos.

---

## 🛠️ Tecnologias Utilizadas

- **Java SE**  
- **Paradigma Orientado a Objetos (POO)**  
- IDE recomendada: **IntelliJ IDEA** ou **Eclipse**  

---

## 📂 Estrutura do Projeto
src/
├── Main.java
├── Usuario.java
├── Equipe.java
├── Projeto.java
├── Perfil.java
└── StatusProjeto.java


- **Usuario** → representa os usuários do sistema (administrador, gerente ou colaborador).  
- **Equipe** → representa as equipes de trabalho e seus membros.  
- **Projeto** → representa os projetos, com status, gerente e equipe associada.  
- **Perfil** → enum com os tipos de perfil possíveis para um usuário.  
- **StatusProjeto** → enum para o status de um projeto.  

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/matheuslanca/SistemaGestaoProjetosEquipes.git
2. Compile e execute a classe Main.
3. Veja no console os exemplos de criação de usuários, equipes e projetos.

## 📈 Roadmap de Evolução
- **Persistência em banco de dados (MySQL/PostgreSQL).**
- **API REST com Spring Boot.**
- **Interface gráfica/web para interação de usuários.**
- **Relatórios e dashboards para gestores.**
- **Integração com ferramentas externas (Slack, Trello, etc).**

## 👨‍💻 Autores
- Matheus Lança
- Diane Castro

