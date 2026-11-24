package model;

public class Professor extends Pessoa {

    // =====================================
    // ATRIBUTOS
    // =====================================

    private String formacao;

    private String especializacao;

    // =====================================
    // CONSTRUTOR
    // =====================================

    public Professor(
            String nome,
            String cpf,
            String contato,
            String formacao,
            String especializacao
    ) {

        super(nome, cpf, contato);

        this.formacao = formacao;

        this.especializacao = especializacao;

    }

    // =====================================
    // GETTERS
    // =====================================

    public String getFormacao() {
        return formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    // =====================================
    // SETTERS
    // =====================================

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

}