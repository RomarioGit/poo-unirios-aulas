package aula04_Encapsulamento_Heranca;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public void exercitar(){
        System.out.println("O aluno "+this.nome+" está exercitando POO em Java.");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatrícula: "+this.matricula;
    }
}
