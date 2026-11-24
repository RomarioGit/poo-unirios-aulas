package Aulas2025_1.Aula08.Abstrata;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir(){
        System.out.println(nome+ " está dormindo...");
    }

    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
