package aula06_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagavel formaPagamento;

    public void addItem(String produto, int qtd, double preco){
        itens.add(new ItemPedido(produto, qtd, preco)); //nasce o ItemPedido (composição)
    }

    public double calcTotal(){
        double total = 0;
        for(ItemPedido item: itens){
            total += item.calcSubtotal();
        }
        return total;
    }

    public void definirPagamento(Pagavel pagavel){ //polimorfismo de subtitpo
        this.formaPagamento = pagavel;//pagavel já existia antes de ser associado a um Pedido
        //Cartao, Pix ou Boleto
    }

    public void finalizarPedido(){
        System.out.println("=== Resumo do Pedido ===");
        for(ItemPedido item: itens){
            System.out.println(item.getQuantidade()+" x "+item.getProduto());
            System.out.println("Preço unitário: R$ "+item.getPrecoUnitario());
            System.out.println("Sub total: R$ "+item.calcSubtotal());
        }
        System.out.println("O total dos itens: R$ "+calcTotal());
        if (this.formaPagamento != null){
            System.out.println("Valor a pagar: R$ "+this.formaPagamento.calcPagamento()); //polimorfismo
            formaPagamento.processarPagamento();
        }else{
            System.out.println("Nenhuma forma de Pagamento válida foi definida...");
        }
    }
}
