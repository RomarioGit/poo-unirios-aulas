package Aulas2025_1.Aula12;

import javax.swing.*;
import java.awt.*;

public class BorderExemplo extends JFrame {
    public BorderExemplo() {
        setTitle("Exemplo BorderLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // BorderLayout é o padrão para JFrame, mas vamos configurar explicitamente
        setLayout(new BorderLayout(5, 5));

        // Adiciona componentes em cada região
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Sul"), BorderLayout.SOUTH);
        add(new JButton("Leste"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JButton("Centro"), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderExemplo();
    }
}
