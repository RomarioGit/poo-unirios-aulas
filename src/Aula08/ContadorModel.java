package Aula08;

public class ContadorModel {
    private int valor;

    public ContadorModel(int valor) {
        this.valor = valor;
    }

    public ContadorModel() {
    }

    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        if (valor <= 0){
            this.valor = 0;
        }else {
            this.valor--;
        }
    }

    public int getValor() {
        return valor;
    }
}
