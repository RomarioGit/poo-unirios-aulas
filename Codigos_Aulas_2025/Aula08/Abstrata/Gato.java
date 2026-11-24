package Aulas2025_1.Aula08.Abstrata;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome()+ " está miando: miau miau miau");
    }
}
