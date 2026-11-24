package Aulas2025_1.Aula04e05;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 4235.98;
        produto.desconto = 0.25;

        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.desconto);

        System.out.println("==========================");
        Produto produto2 = new Produto("Brahma");
        produto2.preco = 42.56;
        produto2.desconto = 0.1;

        System.out.println(produto2.nome);
        System.out.println(produto2.preco);
        System.out.println(produto2.desconto);

        System.out.println("==========================");
        Produto produto3 = new Produto("Heineken",60.44,0.1);

        System.out.println(produto3.nome);
        System.out.println(produto3.preco);
        System.out.println(produto3.desconto);

        System.out.println("==========================");
        DataTeste dataTeste = new DataTeste();
        System.out.println(dataTeste.obterData());

        DataTeste dataTeste1 = new DataTeste(21,02,2025);
        System.out.println(dataTeste1.obterData());
    }
}
