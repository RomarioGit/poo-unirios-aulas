package Aulas2025_1.Aula08.Abstrata;

public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");

        // Usando métodos da classe abstrata e das subclasses
        cachorro.dormir(); // Método concreto da classe abstrata
        cachorro.fazerSom(); // Método abstrato implementado na subclasse

        gato.dormir(); // Método concreto da classe abstrata
        gato.fazerSom(); // Método abstrato implementado na subclasse
    }
}
