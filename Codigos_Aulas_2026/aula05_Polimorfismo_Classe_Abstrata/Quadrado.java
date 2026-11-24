package aula05_Polimorfismo_Classe_Abstrata;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return this.lado*this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
