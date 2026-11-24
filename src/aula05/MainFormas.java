package aula05;

public class MainFormas {
    public static void main(String[] args) {
        FormaGeometrica [] formas = {
                new Circulo(5),
                new Quadrado(4),
                new Triangulo(6,3)
        };

        for (FormaGeometrica forma: formas){
            System.out.println(forma.getNome()+" - área = "+forma.calcArea());
        }

    }
}
