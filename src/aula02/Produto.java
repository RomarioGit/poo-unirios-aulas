package aula02;

public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    void exibirDados(){
        System.out.println("\nProduto: "+this.nome);
        System.out.println("Preço: R$ "+this.preco+"\nDesconto: "+this.desconto+"%");
    }

    double calcDesconto(){
        double desc = this.preco - (this.preco*(this.desconto/100));
        return desc;
    }

    String realizarVenda(DataTest data){
        double valor = calcDesconto();
        String venda = "\n=== DADOS DA VENDA ===\nVenda Realizada\nProduto: "+
                this.nome+"\nPreço: R$ "+this.preco+
                "\nDesconto: "+this.desconto+"%"+"\nValor Final: R$ "+valor+
                "\nData: "+data.obterData();
        return venda;
    }
}
