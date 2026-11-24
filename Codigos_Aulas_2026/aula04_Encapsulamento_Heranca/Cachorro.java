package aula04_Encapsulamento_Heranca;

public class Cachorro extends Mamifero{
    private String raca;

    public Cachorro(String nome, int idade, String corPelo, String raca) {
        super(nome, idade, corPelo);
        this.raca = raca;
    }

    public void latir(){
        System.out.println(this.nome+" está latindo: au au!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Raça: "+this.raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
