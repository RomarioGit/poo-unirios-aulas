package aula06_Interfaces;

public class MainPedido {
    public static void main(String[] args) {
        System.out.println("=== Montando Pedido ===");
        Pedido pedido = new Pedido();
        pedido.addItem("Coca Cola 2L", 5, 12.0 );
        pedido.addItem("Coxinha", 5, 10.0);
        double total = pedido.calcTotal();
        System.out.println("Total do Pedido = R$ "+total);

        System.out.println("Escolhendo da Forma de Pagamento...");
        Pagavel formaPg = new Pix(total);
        pedido.definirPagamento(formaPg);

        //Finalizando Pedido
        pedido.finalizarPedido();
    }
}
