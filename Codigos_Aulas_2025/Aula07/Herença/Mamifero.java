package Aulas2025_1.Aula07.Herença;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    // Método específico de Mamifero
    public void amamentar() {
        System.out.println(getNome() + " está amamentando...");
    }

    public void exibirDetalhes(){

    }
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
