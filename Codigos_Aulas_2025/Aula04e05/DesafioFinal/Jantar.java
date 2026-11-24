package Aulas2025_1.Aula04e05.DesafioFinal;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.223);
        Comida comida2 = new Comida("Feijão", 0.34);

        Pessoa pessoa = new Pessoa("José", 80);

        System.out.println(pessoa.apresentar());
        pessoa.comer(comida1);
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida2);
        System.out.println(pessoa.apresentar());

    }
}
