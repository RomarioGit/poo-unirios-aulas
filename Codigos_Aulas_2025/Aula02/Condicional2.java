package Aulas2025_1.Aula02;

import javax.swing.*;

public class Condicional2 {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Número Par!");
            JOptionPane.showMessageDialog(null,"Número Par!" );
        }else {
            System.out.println("Número Impar!");
        }

    }
}
