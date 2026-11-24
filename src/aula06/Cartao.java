package aula06;

public class Cartao implements Pagavel {
    private double valor;
    private int parcelas;

    public Cartao(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
    }

    @Override
    public double calcPagamento() {
        return this.valor*(1+0.02*parcelas);//acrescimo, taxa da macneta de acordo com as parcelas
    }

    @Override
    public void processarPagamento() {
        System.out.println("Autorizando pagamento na operadora em "+this.parcelas+" parcelas...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
