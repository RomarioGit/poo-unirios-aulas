package aula03;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0){
            this.saldo = saldoInicial;
        }else{
            this.saldo = 0;
        }
    }

    public void sacar(double valor){
        if (valor <= 0 ){
            System.out.println("Valor do saque é inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque R$ "+valor);
        }else{
            this.saldo -= valor;
            System.out.println("Saque de R$ "+ valor+ " realizado com sucesso!");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$ "+valor+" realizado com sucesso!");
        }else{
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void exibirExtrato(){
        System.out.println("==== EXTRATO ====");
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo atual: R$ "+this.saldo);
        System.out.println("=========");
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.trim().isEmpty()){
            this.titular = novoTitular;
        }else{
            System.out.println("Nome inválido! O titular não pode ser alterado.");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
