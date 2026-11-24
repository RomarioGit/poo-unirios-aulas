package Aulas2026_1.Consultas;

public class Medico {

    private String nome;
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String prescreve(Paciente paciente) {
        return "Prescrição para o paciente " + paciente.getNome() + " realizada pelo Dr. " + nome;
    }
}
