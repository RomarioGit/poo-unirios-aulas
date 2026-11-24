package Aulas2025_1.Aula08;

public class EntregaPadrao extends Entrega implements FormaEntrega {
    private int prazo;

    public EntregaPadrao(String codigo, Cliente cliente, int prazo) {
        super(codigo, cliente);
        this.prazo = prazo;
    }

    @Override
    public String processarEntrega() {
        return "Processando Entrega Padrão\n" + entregar();
    }

    @Override
    public String entregar() {
        return "Entrega Padrão Realizada para "+getCliente().getNome() + "\n Prazo: "+prazo+" dias";
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}
