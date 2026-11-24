package aula04;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Xolinha", 8, "marrom", "Caramelo" );
        System.out.println("=== Dados do Animal ===");
        cachorro.exibirDetalhes();
        cachorro.comer();
        cachorro.amamentar();
        cachorro.latir();

        Mamifero mamifero = new Mamifero("Baleia", 10, "preta e branca");
        mamifero.exibirDetalhes();
        mamifero.comer();
    }
}
