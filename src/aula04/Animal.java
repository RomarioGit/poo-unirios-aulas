package aula04;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade);
    }

    public void comer(){
        System.out.println(this.nome+" está se alimentando.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
