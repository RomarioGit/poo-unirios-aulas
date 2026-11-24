package Aulas2026_1.Consultas;

public class MainConsultas {
    public static void main(String[] args) {
        Paciente p = new Paciente("João", "123", "9999-9999", "Unimed");
        Medico m = new Medico("Carlos", "CRM123", "Clínico Geral");

        // Polimorfismo com interface
        ProtocoloClinico emergencia = new Emergencia("10:00", m, p, 3);
        ProtocoloClinico eletiva = new Eletiva("14:00", m, p, "Cirurgia");

        System.out.println(emergencia.triagem());
        System.out.println(emergencia.atendimento());

        System.out.println(eletiva.triagem());
        System.out.println(eletiva.atendimento());

        // Polimorfismo com classe base
//        Consulta c1 = new Emergencia("10:00", m, p, 3);
//        Consulta c2 = new Eletiva("14:00", m, p, "Cirurgia");

//        c1.realizarAtendimento(p, m);
//        c2.realizarAtendimento(p, m);

        // Métodos específicos
//        ((Emergencia) c1).acionarEquipe();
//        System.out.println(((Eletiva) c2).confirmarAgenda());
//
//        // Prescrição
//        System.out.println(m.prescreve(p));
    }
}
