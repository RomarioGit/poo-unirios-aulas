package Aulas2026_1.Consultas;

public class Emergencia extends Consulta implements ProtocoloClinico {

    private int nivel;

    public Emergencia(String dataHora, Medico medico, Paciente paciente, int nivel) {
        super(dataHora, medico, paciente);
        this.nivel = nivel;
    }

    @Override
    public String triagem() {
        return "Triagem de emergência realizada com nível: " + nivel;
    }

    @Override
    public String atendimento() {
        return "Atendimento emergencial iniciado.";
    }

    @Override
    public void realizarAtendimento(Paciente paciente, Medico medico) {
        System.out.println("Atendimento de emergência para o paciente "
                + paciente.getNome() + " com o médico "
                + medico.getNome() + " às " + dataHora);
    }

    public void acionarEquipe() {
        System.out.println("Equipe médica acionada para emergência.");
    }
}
