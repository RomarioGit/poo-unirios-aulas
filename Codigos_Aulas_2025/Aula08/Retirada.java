package Aulas2025_1.Aula08;
public class Retirada extends Entrega implements FormaEntrega {
    private Endereco endereco;

    public Retirada(String codigo, Cliente cliente, Endereco endereco) {
        super(codigo, cliente);
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String processarEntrega() {
        return "Processando retirada...\n " + entregar();
    }

    @Override
    public String entregar() {
        return "Retirada realizada por " + getCliente().getNome() + " em: \n"+endereco.toString();

    }
}
