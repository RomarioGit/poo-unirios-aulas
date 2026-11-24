package Aulas2026_1.Consultas;

public class Consulta {

    protected String dataHora;
    protected Medico medico;
    protected Paciente paciente;
    protected String diagnostico;

    public Consulta(String dataHora, Medico medico, Paciente paciente) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void realizarAtendimento(Paciente paciente, Medico medico) {
        System.out.println("Realizando atendimento para o paciente "
                + paciente.getNome() + " com o médico "
                + medico.getNome() + " às " + dataHora);
    }
}