package Aulas2025_1.Aula01;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte anosDeFacul = 2;
        short numDisciplinas = 20;
        int id = 43215;
        long network = 10000;

        double mensalidades = 9_011.52;
        float mensalidade = 375.48F;

        boolean estaDeFerias = false;

        var status = "A";
        //Dias de faculdade
        System.out.println(anosDeFacul*365);

        //Número de semestres
        System.out.println(anosDeFacul*2);

        //Número de avaliações
        System.out.println(numDisciplinas*2);

        // Número de mensalidades
        System.out.println(mensalidades/mensalidade);
    }
}
