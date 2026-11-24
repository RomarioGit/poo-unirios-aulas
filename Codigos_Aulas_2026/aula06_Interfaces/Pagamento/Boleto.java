package aula06_Interfaces;

public class Boleto implements Pagavel {
    private double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcPagamento() {
        return this.valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando código de barras do boleto...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
