package aula05;

public class Pessoa {
    private String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //Polimorfismo de subtipagem (Dinâmico)
    public void comer(Comida comida){
        this.peso += comida.getPeso();
        System.out.println(this.nome+" comeu "+comida.getNome());
    }

    public void exibirDados(){
        System.out.println("\n== Situação ==");
        System.out.println("Nome: "+this.nome);
        System.out.println("Peso: "+this.peso+" KG");
    }

    public void defecar(){
        this.peso-=0.1;
        System.out.println("Esvaziou o estomago em 100g.");
    }


//    public void comer(Arroz arroz){
//        this.peso+=arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao){
//        this.peso+=feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete){
//        this.peso+=sorvete.getPeso();
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
