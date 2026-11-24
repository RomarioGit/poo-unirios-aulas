package Aulas2025_1.Aula15;

public class Calcula {
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double valor) {
        if (valor < 0) throw new ArithmeticException("Valor negativo não possui raiz real.");
        return Math.sqrt(valor);
    }
}
