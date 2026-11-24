package aula05_Polimorfismo_Classe_Abstrata;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato "+this.nome+" está emitindo um som: Meow!");
    }
}
