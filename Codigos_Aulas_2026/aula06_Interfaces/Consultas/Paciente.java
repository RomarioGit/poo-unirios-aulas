package Aulas2026_1.Consultas;

public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String convenio;

    public Paciente(String nome, String cpf, String telefone, String convenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
    }

    public String getNome() {
        return nome;
    }
}
