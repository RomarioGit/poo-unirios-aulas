package Aulas2025_1.Aula10;

public class Gerente extends Funcionario {
    private int equipeSize;

    public Gerente(String nome, int id, double salarioBase, int equipeSize) {
        super(nome, id, salarioBase);
        this.equipeSize = equipeSize;
    }

    public int getEquipeSize() {
        return equipeSize;
    }

    public void setEquipeSize(int equipeSize) {
        this.equipeSize = equipeSize;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*1.15;
    }

    public String gerenciar(){
        return "Gerente "+getNome()+" lidera "+equipeSize+" pessoas";
    }
}
