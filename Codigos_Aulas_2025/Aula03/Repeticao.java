package Aulas2025_1.Aula03;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5){
//            System.out.println("Boa nooite!");
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            valor = scanner.nextLine();
        }
    }
}
