package Aulas2025_1.Aula03;

import java.util.Scanner;

public class ControleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        double nota = scanner.nextDouble();
        String conceito = "";

        switch ((int) nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "C";
                break;
            default:
                conceito = "D";
                break;
        }

        System.out.println("Conceito é "+conceito);

    }
}
