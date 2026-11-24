package aula05;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Xexeu");
        Animal gato = new Gato("Xaninho");
        Animal vaca = new Vaca("Mococa");

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();

    }
}
