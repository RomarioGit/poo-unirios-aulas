package Aulas2025_1.Aula11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploTela {
    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira Tela");
        tela.setSize(400,300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(new FlowLayout());


        JLabel label = new JLabel("Iniciando Swing");
        label.setLocation(50,0);
        tela.add(label);


        JButton bt = new JButton("Clique aqui!");
        bt.setLocation(50,50);
        JLabel labelBt = new JLabel("Aguardando comandos...");
        labelBt.setLocation(80,0);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelBt.setText("Botão clicado!");
            }
        });

        tela.add(bt);
        tela.add(labelBt);
        tela.pack();
        tela.setVisible(true);
    }
}
