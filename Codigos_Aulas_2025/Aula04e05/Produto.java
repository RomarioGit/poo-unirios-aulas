package Aulas2025_1.Aula04e05;

public class Produto {
    String nome;
    double preco;
    static double desconto;

    Produto(){

    }

    Produto(String nome) {
        this.nome = nome;
    }

    Produto( String nome,double preco, double desconto) {
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
    }

    double calculaDesconto(){
        return preco * (1 - desconto);
    }

}
