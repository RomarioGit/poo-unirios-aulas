package Aulas2025_1.Aula01;

public class ExTipoString {
    public static void main(String[] args) {
       // System.out.println("Olá mundo!".charAt(2)); //pega caracteres específicos da string

        String s = "Boa noite";
//        System.out.println(s.concat("!!!"));
//        System.out.println(s.startsWith("Boa")); // inicia com estes caracteres
//        System.out.println(s.startsWith("boa"));
//        System.out.println(s.toLowerCase().startsWith("boa")); //converte para minusculas
//        System.out.println(s.endsWith("noite")); // termina com esses caracteres
//        System.out.println(s.length());

//        System.out.println(s.equals("boa noite"));
//        System.out.println(s.equalsIgnoreCase("boa noite"));


        String nome = "Romário";
        String sobrenome = "Elias";
        int idade = 25;
        double salario = 1520.87;

        System.out.println("Nome: " + nome + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario);

        System.out.printf("O senhor %s %s tem %d anos e um salário de R$ %.2f",
                nome, sobrenome, idade, salario);

        String str = String.format("\nO senhor %s %s tem %d anos e um salário de R$ %.2f",
                nome, sobrenome, idade, salario);
        System.out.println(str);
        System.out.println(str.contains("y"));
    }
}
