package aula05_Polimorfismo_Classe_Abstrata;

public class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("O animal está emitindo um som genérico.");
    }

    public String getNome() {
        return nome;
    }
}
