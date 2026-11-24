package Aulas2025_1.Aula01;

public class ExemploVariaveis {
    public static void main(String[] args) {
        int raio = 3;
        final double PI = 3.14;
        System.out.println(PI*(raio*raio));
        double area = PI*(raio*raio);
        System.out.println(area);
        System.out.println("Area = " + area + "m2");
    }
}
