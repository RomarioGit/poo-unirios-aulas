package Aulas2025_1.Aula01;

import java.util.Scanner;

public class LerTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = num1+num2;
        System.out.printf("A soma é %d ",soma);
    }
}
