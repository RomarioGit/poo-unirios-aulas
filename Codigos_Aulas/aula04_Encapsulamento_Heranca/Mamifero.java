package aula04_Encapsulamento_Heranca;

public class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public void amamentar(){
        System.out.println(this.nome+" está amamentando.");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cor do Pelo: "+this.corPelo);
    }

    public String getCorPelo() {
        return corPelo;
    }
}
