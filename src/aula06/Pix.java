package aula06;

public class Pix implements Pagavel {
    private double valor;

    public Pix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcPagamento() {
        return this.valor*0.95; //5% de desconto no Pix
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando QR Code do Pix...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
