package Aulas2025_1.Aula07.Interface;

public class Celular extends Eletronico implements Dispositivo{

    public Celular(boolean ligado) {
        super(ligado);
    }
    public  Celular(){

    }
    @Override
    public String ligado() {
        if (!isLigado()){
            setLigado(true);
            return "Celular Ligado";
        }
        return "Celular já está ligado!";
    }

    @Override
    public String desligado() {
        if (isLigado()){
            setLigado(false);
            return "Celular Ligado";
        }
        return "Celular já está desligada";
    }

    @Override
    public String status() {
        return "Status do Celular: " + (isLigado() ? "Ligado" : "Desligado");
    }
}
