package Aulas2025_1.Aula10;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, int id, double salarioBase, String linguagem) {
        super(nome, id, salarioBase);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*1.1;
    }

    public String codar(){
        return "Dev "+getNome()+" está codando em "+linguagem+"...!";
    }
}
