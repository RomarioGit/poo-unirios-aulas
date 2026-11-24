package Aulas2025_1.Aula07.Interface;

public class Televisao extends Eletronico implements Dispositivo{

    public Televisao(boolean ligado) {
        super(ligado);
    }

    public Televisao() {
    }

    @Override
    public String ligado() {
        if (!isLigado()){
            setLigado(true);
            return "TV Ligada";
        }
        return "TV já está ligada!";
    }

    @Override
    public String desligado() {
        if (isLigado()){
            setLigado(false);
            return "TV Ligada";
        }
        return "TV já está desligada";
    }

    @Override
    public String status() {
        return "Status da TV: " + (isLigado() ? "Ligada" : "Desligada");
    }
}
