package aula05;

public class Vaca extends Animal{

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca "+this.nome+" está emitindo um som: Mooo!");
    }
}
