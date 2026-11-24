package aula05_Polimorfismo_Classe_Abstrata;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(this.raio,2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
