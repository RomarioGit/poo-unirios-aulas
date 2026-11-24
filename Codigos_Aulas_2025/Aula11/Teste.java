package Aulas2025_1.Aula11;

import javax.swing.*;

import java.awt.*;

public class Teste {
    public static void main(String [] args){
        JFrame f = new JFrame("Um Frame de Teste");
        JPanel p = new JPanel();
        f.setSize(200,200);
        p.setSize(150,150);
        f.getContentPane().setBackground(Color.gray);
        p.setBackground(Color.blue);
        f.getContentPane().setLayout(null);
        f.getContentPane().add(p);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
}
