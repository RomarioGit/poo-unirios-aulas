package Aulas2025_1.Aula06;

public class Moto extends Veiculo  {
    private boolean possuiBau;

    public Moto(String marca, String modelo, int ano, boolean possuiBau) {
        super(marca, modelo, ano, 15,180);
        this.possuiBau = possuiBau;

    }

    // Método específico de Moto
    public String empinar() {
        return "A moto está empinando...";
    }

    @Override
    public String acelerar() {
        this.setVelocidadeAtual(getVelocidadeAtual()+this.getAceleracao());
        return "A moto está acelerando... " + getVelocidadeAtual() +"Km/h" ;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                "possuiBau=" + possuiBau +
                '}';
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
}
