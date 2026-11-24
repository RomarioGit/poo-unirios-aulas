package aula02_Classes_Objetos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca-cola", 10,10);
        Produto produto2 = new Produto("Spaten", 15, 10);
        DataTest data1 = new DataTest(26, 7, 2026);
        produto1.exibirDados();
        produto2.exibirDados();

        System.out.println(produto1.realizarVenda(data1));
        System.out.println(produto2.realizarVenda(data1));

    }
}
