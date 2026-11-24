package Aulas2025_1.Aula12;

import javax.swing.*;
import java.awt.*;

public class CardExemplo extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public CardExemplo() {
        setTitle("Exemplo CardLayout");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria o CardLayout e o painel de cards
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Cria os "cards" (painéis individuais)
        JPanel card1 = createCard("Primeiro Card", Color.LIGHT_GRAY);
        JPanel card2 = createCard("Segundo Card", new Color(173, 216, 230));
        JPanel card3 = createCard("Terceiro Card", new Color(144, 238, 144));

        // Adiciona os cards ao painel principal
        cardPanel.add(card1, "1");
        cardPanel.add(card2, "2");
        cardPanel.add(card3, "3");

        // Painel de controles
        JPanel controlPanel = new JPanel();
        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Próximo");

        // Configura ações dos botões
        prevButton.addActionListener(e -> cardLayout.previous(cardPanel));
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        controlPanel.add(prevButton);
        controlPanel.add(nextButton);

        // Adiciona componentes ao JFrame
        add(cardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createCard(String text, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.add(new JLabel(text));
        return panel;
    }

    public static void main(String[] args) {
        new CardExemplo();
    }
}
