package aula02;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    String cpf;
    String contato;

    void verificarClt(){
        if (idade >=18){
            System.out.println("Vai trabalhar, "+this.nome+"!");
        }else{
            System.out.println("Vai estudar, "+this.nome+"!");
        }
    }


    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Matheus Barbosa";
        pessoa.idade = 20;
        pessoa.sexo = "MACHO";
        pessoa.cpf = "444028922";
        pessoa.contato = "mb.20@gmail.com";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);

        pessoa.verificarClt();

    }
}
