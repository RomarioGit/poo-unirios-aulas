package Aulas2025_1.Aula08.Abstrata;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo: auauauau");
    }
}
