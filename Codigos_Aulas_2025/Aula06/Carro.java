package Aulas2025_1.Aula06;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano,220);
        this.numPortas = numPortas;
    }

    // Método específico de Carro
    public String abrirPorta() {
        return "Abrindo as " + numPortas + " portas do carro...";
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nnº de Portas=" + numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
