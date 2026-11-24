package aula05;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro "+this.nome+" está emitindo um som: Woof!");
    }
}
