package Aulas2025_1.Aula08;

public class Teste {
    public static void main(String[] args) {
        Endereco enderecoCliente = new Endereco("Av Barack Obama", 33, "Santo Antõnio", "Tacaratu");
        Endereco enderecoLoja = new Endereco("Rua da Lama", 147, "Centro", "Serra Talhada");

        Cliente cliente = new Cliente("João Severino", enderecoCliente);
        //Entrega entrega = new Entrega("001", cliente);
        //System.out.println(entrega.getCliente().getEndereco().toString());

        Entrega entregaPadrao = new EntregaPadrao( "EP123", cliente,5);
        Entrega entregaRapida = new EntregaRapida("ER456", cliente, 2);
        Entrega retirada = new Retirada( "RT789", cliente, enderecoLoja);

        // Processando as entregas
        System.out.println("--- Entrega Padrão ---");
        System.out.println(entregaPadrao.processarEntrega());

        System.out.println("\n--- Entrega Rápida ---");
        System.out.println(entregaRapida.processarEntrega());

        System.out.println("\n--- Retirada em Loja ---");
        System.out.println(retirada.processarEntrega());
    }
}
