package Aulas2025_1.Aula12;

import javax.swing.*;
import java.awt.*;

public class GridExemplo extends JFrame {
    public GridExemplo() {
        setTitle("Exemplo GridLayout");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configura GridLayout com 3 linhas, 2 colunas e espaçamento
        setLayout(new GridLayout(3, 2, 5, 5));

        // Adiciona componentes
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridExemplo();
    }
}
