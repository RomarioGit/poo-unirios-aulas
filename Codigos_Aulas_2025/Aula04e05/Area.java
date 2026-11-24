package Aulas2025_1.Aula04e05;

public class Area {
    double raio;
    static final double pi = 3.14;; //pode ser também final static

    public Area(double raio) {
        this.raio = raio;
    }

    double calcArea(){
        return pi*Math.pow(this.raio,2);
    }

    static double calcArea(double raio){
        return pi*Math.pow(raio,2);
    }
}
