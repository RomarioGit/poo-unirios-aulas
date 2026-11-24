package Aulas2025_1.Aula02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        double nota = scanner.nextDouble();
        if (nota > 10 || nota < 0){
            System.out.println("Nota inválida!");
        }else {
            if(nota >= 9){
                System.out.println("Conceito A");
            } else if (nota >=7 && nota < 9) {
                System.out.println("Conceito B");
            }else{
                System.out.println("Conceito C");
            }
        }
    }
}
