package model;

public class Pessoa {

    // =====================================
    // ATRIBUTOS
    // =====================================

    protected String nome;

    protected String cpf;

    protected String contato;

    // =====================================
    // CONSTRUTOR
    // =====================================

    public Pessoa(
            String nome,
            String cpf,
            String contato
    ) {

        this.nome = nome;

        this.cpf = cpf;

        this.contato = contato;

    }

    // =====================================
    // GETTERS
    // =====================================

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getContato() {
        return contato;
    }

    // =====================================
    // SETTERS
    // =====================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}