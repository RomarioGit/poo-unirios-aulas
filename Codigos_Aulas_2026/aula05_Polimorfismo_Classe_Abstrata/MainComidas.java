package aula05_Polimorfismo_Classe_Abstrata;

public class MainComidas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pierre", 90);
        Arroz ingrediente1 = new Arroz(0.3);
        Feijao ingrediente2 = new Feijao(0.4);
        Sorvete sobremesa = new Sorvete(0.5);

        pessoa.exibirDados();
        pessoa.comer(ingrediente1);
        pessoa.comer(ingrediente2);
        pessoa.comer(ingrediente2);
        pessoa.comer(sobremesa);
        pessoa.comer(sobremesa);
        pessoa.exibirDados();

        pessoa.defecar();
        pessoa.exibirDados();

    }
}
