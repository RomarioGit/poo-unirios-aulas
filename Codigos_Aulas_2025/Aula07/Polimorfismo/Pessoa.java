package Aulas2025_1.Aula07.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

//    public void comer(Arroz arroz){
//        this.peso += arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao){
//        this.peso += feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete){
//        this.peso += sorvete.getPeso();
//    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
