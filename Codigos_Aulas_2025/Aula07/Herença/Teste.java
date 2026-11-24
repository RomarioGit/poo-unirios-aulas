package Aulas2025_1.Aula07.Herença;

public class Teste {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro cachorro = new Cachorro("Rex", 5, "Marrom", "Labrador");

        // Exibindo detalhes do cachorro
        System.out.println("Detalhes do Cachorro:");
        cachorro.exibirDetalhes();

        // Testando métodos específicos
        cachorro.comer();
        cachorro.latir();
        cachorro.amamentar();
        cachorro.dormir();
    }
}
