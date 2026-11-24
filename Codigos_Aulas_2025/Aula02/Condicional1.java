package Aulas2025_1.Aula02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        if (media >= 7.0 && media <= 10){
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        if (media < 7 && media >= 3){
            System.out.println("Aluno fará prova final");
        }

        if (media < 3 && media > 0){
            System.out.println("Aluno está reprovado");
        }

//        if (media >= 7.0)
//            System.out.println("Aprovado!");
//            System.out.println("Parabéns!");
    }
}
