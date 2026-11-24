package Aulas2025_1.Aula03;

import java.util.Scanner;

public class MediaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd_notas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Informar a nota (ou digite -1 para sair): ");
            nota = scanner.nextDouble();

            if (nota>= 0 && nota<= 10) {
                total+= nota;
                qtd_notas++;
            }else {
                System.out.println("NOta inválida!");
            }
        }

        double media = total/qtd_notas;
        System.out.println("A média é "+ media);
    }
}
