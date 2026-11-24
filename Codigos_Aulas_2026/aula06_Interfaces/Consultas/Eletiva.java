package Aulas2026_1.Consultas;

public class Eletiva extends Consulta implements ProtocoloClinico {

    private String procedimento;

    public Eletiva(String dataHora, Medico medico, Paciente paciente, String procedimento) {
        super(dataHora, medico, paciente);
        this.procedimento = procedimento;
    }

    @Override
    public String triagem() {
        return "Triagem para consulta eletiva realizada.";
    }

    @Override
    public String atendimento() {
        return "Atendimento eletivo para procedimento: " + procedimento;
    }

    @Override
    public void realizarAtendimento(Paciente paciente, Medico medico) {
        System.out.println("Atendimento eletivo para o paciente "
                + paciente.getNome() + " com o médico "
                + medico.getNome() + " às " + dataHora);
    }

    public boolean confirmarAgenda() {
        return true;
    }
}
