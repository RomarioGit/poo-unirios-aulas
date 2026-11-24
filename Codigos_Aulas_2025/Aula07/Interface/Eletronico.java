package Aulas2025_1.Aula07.Interface;

public class Eletronico {

    private boolean ligado;

    public Eletronico(boolean ligado) {
        this.ligado = ligado;
    }

    public Eletronico() {
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
