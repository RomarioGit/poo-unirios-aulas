package Aulas2025_1.Aula04e05;

public class DataTeste {
    int dia;
    int mes;
    int ano;

    DataTeste() {
        dia = 1;
        mes = 1;
        ano = 2000;

        //this(1,1,2000);
    }

    public DataTeste(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData(){
        String formato = "\n%d/%d/%d";
        return String.format(formato,this.dia,this.mes,this.ano);

    }
}
