package aula04;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcBonus(){
        double valor = salario*0.10;
        return valor;
    }

    public void exibirDados(){
        System.out.println("=== Dados do Funcionário ===");
        System.out.println("NOME: "+this.nome);
        System.out.println("SALARIO: "+this.salario);
        System.out.println("BÔNUS: "+this.calcBonus());
        System.out.println("SALARIO FINAL: "+(this.salario+this.calcBonus()));
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
