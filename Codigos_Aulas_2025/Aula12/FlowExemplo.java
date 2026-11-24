package Aulas2025_1.Aula12;

import javax.swing.*;
import java.awt.*;

public class FlowExemplo extends JFrame {
    public FlowExemplo() {
        setTitle("Exemplo FlowLayout");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configura FlowLayout com alinhamento à esquerda e espaçamento
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Adiciona componentes
        add(new JButton("Botão 1"));
        add(new JButton("Botão 2"));
        add(new JButton("Botão 3"));
        add(new JButton("Botão 4"));
        add(new JButton("Botão 5"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowExemplo();

    }
}
