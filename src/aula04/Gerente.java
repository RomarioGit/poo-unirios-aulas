package aula04;

public class Gerente extends Funcionario {
    private double bonusExtra;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente(String nome, double salario, double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }

    @Override
    public double calcBonus() {
        return super.calcBonus()+this.bonusExtra;
    }


    public double getBonusExtra() {
        return bonusExtra;
    }

    public void setBonusExtra(double bonusExtra) {
        this.bonusExtra = bonusExtra;
    }
}
